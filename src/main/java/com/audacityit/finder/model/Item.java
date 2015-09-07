package com.audacityit.finder.model;

import java.util.Arrays;

/**
 * Created by tusharaits on 6/28/15.
 */
public class Item {

    private int type;
    private String id;
    private String title;
    private String address;
    private String districtId;
    private String contactPhoneNumber;
    private String telephoneNumber;
    private String mobileNumber;
    private String emailAddress;
    private String webUrl;
    private String facebookUrl;
    private String twitterUrl;
    private String googlePlusUrl;
    private String linkedInUrl;
    private double latitude;
    private double longitude;
    private String hotLine;
    private String tagLine;
    private float rating;
    private int ratingCount;
    private String description;
    private boolean isVerified;
    private String districtTitle;
    private String categoryId;
    private String tag;
    private String[] imageThumbUrls;
    private String[] imageLargeUrls;
    private String titleImg;
    private String adUrl;

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getGooglePlusUrl() {
        return googlePlusUrl;
    }

    public void setGooglePlusUrl(String googlePlusUrl) {
        this.googlePlusUrl = googlePlusUrl;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getHotLine() {
        return hotLine;
    }

    public void setHotLine(String hotLine) {
        this.hotLine = hotLine;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerification(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDistrictTitle() {
        return districtTitle;
    }

    public void setDistrictTitle(String districtTitle) {
        this.districtTitle = districtTitle;
    }

    public String[] getImageThumbUrls() {
        return imageThumbUrls;
    }

    public void setImageThumbUrls(String[] imageThumbUrls) {
        this.imageThumbUrls = imageThumbUrls;
    }

    public String[] getImageLargeUrls() {
        return imageLargeUrls;
    }

    public void setImageLargeUrls(String[] imageLargeUrls) {
        this.imageLargeUrls = imageLargeUrls;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", districtId='" + districtId + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", googlePlusUrl='" + googlePlusUrl + '\'' +
                ", linkedInUrl='" + linkedInUrl + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", hotLine='" + hotLine + '\'' +
                ", tagLine='" + tagLine + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", description='" + description + '\'' +
                ", isVerified=" + isVerified +
                ", districtTitle='" + districtTitle + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", imageThumbUrls=" + Arrays.toString(imageThumbUrls) +
                ", imageLargeUrls=" + Arrays.toString(imageLargeUrls) +
                '}';
    }
}
