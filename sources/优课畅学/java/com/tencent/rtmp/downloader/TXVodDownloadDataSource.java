package com.tencent.rtmp.downloader;

import com.tencent.rtmp.TXPlayerAuthBuilder;

/* loaded from: classes4.dex */
public class TXVodDownloadDataSource {
    public static final int QUALITY_2K = 5;
    public static final int QUALITY_4K = 6;
    public static final int QUALITY_FHD = 4;
    public static final int QUALITY_FLU = 1;
    public static final int QUALITY_HD = 3;
    public static final int QUALITY_OD = 0;
    public static final int QUALITY_SD = 2;
    public static final int QUALITY_UNK = 1000;
    protected TXPlayerAuthBuilder authBuilder;
    protected int quality;
    protected String templateName;
    protected String token;

    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i10) {
        this.authBuilder = tXPlayerAuthBuilder;
        this.quality = i10;
    }

    public static String qualityToId(int i10) {
        return i10 == 1 ? "FLU" : i10 == 2 ? "SD" : i10 == 3 ? "HD" : i10 == 4 ? "FHD" : i10 == 5 ? "2K" : i10 == 6 ? "4K" : "";
    }

    public TXPlayerAuthBuilder getAuthBuilder() {
        return this.authBuilder;
    }

    public int getQuality() {
        return this.quality;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        this.quality = 1000;
        this.authBuilder = tXPlayerAuthBuilder;
        this.templateName = str;
    }
}
