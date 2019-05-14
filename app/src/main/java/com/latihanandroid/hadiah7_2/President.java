package com.latihanandroid.hadiah7_2;

public class President {
    private String mnama,mremarks,mphoto;

    public String getMnama() {
        return mnama;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }

    public String getMremarks() {
        return mremarks;
    }

    public void setMremarks(String mremarks) {
        this.mremarks = mremarks;
    }

    public String getMphoto() {
        return mphoto;
    }

    public void setMphoto(String mphoto) {
        this.mphoto = mphoto;
    }

    public President(String mnama, String mremarks, String mphoto) {
        this.mnama = mnama;
        this.mremarks = mremarks;
        this.mphoto = mphoto;
    }


}
