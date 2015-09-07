package com.audacityit.finder.util;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.audacityit.finder.util.Constants.URL_APB_API;

/**
 * Created by tusharaits on 8/10/15.
 */
public class ApiHandler {

    public static final int REQUEST_GET = 0;
    public static final int REQUEST_POST = 1;
    private Context context;
    private ContentValues contentValues;
    private String urlKey;
    private ApiHandlerListener apiHandlerListener;
    private boolean isShowProgressBar = true;
    private ProgressDialog progressDialog;

    public ApiHandler() {

    }

    public ApiHandler(String urlKey) {
        this.urlKey = urlKey;
    }

    public ApiHandler(Context context, String urlKey) {
        this.context = context;
        this.urlKey = urlKey;
        apiHandlerListener = (ApiHandlerListener) context;
    }

    public ApiHandler(Context context, String urlKey, ContentValues contentValues) {
        this.context = context;
        this.urlKey = urlKey;
        this.contentValues = contentValues;
        apiHandlerListener = (ApiHandlerListener) context;
    }

    public ApiHandler(Fragment fragment, String urlKey) {
        this.context = fragment.getActivity();
        this.urlKey = urlKey;
        apiHandlerListener = (ApiHandlerListener) fragment;
    }

    public ApiHandler(Fragment fragment, String urlKey, ContentValues contentValues) {
        this.context = fragment.getActivity();
        this.urlKey = urlKey;
        this.contentValues = contentValues;
        apiHandlerListener = (ApiHandlerListener) fragment;
    }

    public void showProgressBar(boolean isShow) {
        isShowProgressBar = isShow;
    }

    public void doApiRequest(int requestType) {

        if (isShowProgressBar) {
            progressDialog = ProgressDialog.show(context, null, "Please wait...", true, false);
        }
        OkHttpClient client = new OkHttpClient();

        if (requestType == REQUEST_GET) {

            Request request = new Request.Builder()
                    .url(URL_APB_API + urlKey)
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Request request, IOException e) {
                    if (isShowProgressBar) {
                        progressDialog.dismiss();
                    }
                    apiHandlerListener.onFailureResponse(urlKey);
                }

                @Override
                public void onResponse(Response response) throws IOException {
                    if (isShowProgressBar) {
                        progressDialog.dismiss();
                    }
                    apiHandlerListener.onSuccessResponse(urlKey, response.body().string());
                }
            });

        } else if (requestType == REQUEST_POST) {

            Set<String> keys = contentValues.keySet();
            List<String> keyList = new ArrayList<String>(keys);
            FormEncodingBuilder formEncodingBuilder = new FormEncodingBuilder();
            RequestBody formBody;

            for (String key : keyList) {
//            Log.v("logCheck", key + " -->" + contentValues.getAsString(key));
                formEncodingBuilder.add(key, contentValues.getAsString(key));
            }

            printUrl(keyList);

            formBody = formEncodingBuilder.build();
            Request request = new Request.Builder()
                    .url(URL_APB_API + urlKey)
                    .post(formBody)
                    .build();

            client.newCall(request).enqueue(new Callback() {

                @Override
                public void onFailure(Request request, IOException e) {
                    if (isShowProgressBar) {
                        progressDialog.dismiss();
                    }
                    apiHandlerListener.onFailureResponse(urlKey);
                }

                @Override
                public void onResponse(Response response) throws IOException {
                    String jsonString = response.body().string();
                    if (isShowProgressBar) {
                        progressDialog.dismiss();
                    }
                    apiHandlerListener.onSuccessResponse(urlKey, jsonString);
                }
            });

        } else {

        }

    }

    private void printUrl(List<String> keyList) {
        String url = URL_APB_API + urlKey + "?";
        for (int i = 0; i < keyList.size(); i++) {
            url = url + keyList.get(i) + "=" + contentValues.getAsString(keyList.get(i));
            if (i != keyList.size() - 1) {
                url = url + "&";
            }
        }
        Log.v("printUrl", url);
    }

    public void printUrl(ContentValues values) {
        Set<String> keys = values.keySet();
        List<String> keyList = new ArrayList<String>(keys);
        String url = URL_APB_API + urlKey + "?";
        for (int i = 0; i < keyList.size(); i++) {
            url = url + keyList.get(i) + "=" + values.getAsString(keyList.get(i));
            if (i != keyList.size() - 1) {
                url = url + "&";
            }
        }
        Log.v("printUrl", url);
    }


    public static interface ApiHandlerListener {
        void onSuccessResponse(String tag, String jsonString);

        void onFailureResponse(String tag);
    }
}
