package com.example.ubi.data;

import java.io.Serializable;

/**
 * Created by lt155 on 2017/10/24.
 */

public class Info implements Serializable {
    private int photoId;
    private String title;
    private String content;
    private String time;

    public Info(int photoId,String title,String content,String time){
        this.photoId = photoId;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
