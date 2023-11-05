package com.royaldeveloper.restapibaseapplication;

public class userModel {
   String albumId;
    String id;
    String title;
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public userModel(String albumId, String id, String title,String url) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url=url;
    }

}
