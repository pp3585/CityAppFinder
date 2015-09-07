package com.audacityit.finder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.audacityit.finder.R;

/**
 * Created by tusharaits on 9/1/15.
 */
public class TermsConditionActivity extends AppCompatActivity {

    TextView btnContinue;
    CheckBox checkBoxAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_condition);
        btnContinue = (TextView) findViewById(R.id.btnContinue);
        checkBoxAccept = (CheckBox) findViewById(R.id.checkBoxAccept);
        checkBoxAccept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btnContinue.setBackgroundResource(R.drawable.btn_bg_1);
                } else {
                    btnContinue.setBackgroundResource(R.drawable.btn_inactive);
                }

                btnContinue.setEnabled(isChecked);
                btnContinue.setClickable(isChecked);
                btnContinue.setFocusable(isChecked);
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TermsConditionActivity.this, LandingActivity.class));
                finish();
            }
        });
    }
}
