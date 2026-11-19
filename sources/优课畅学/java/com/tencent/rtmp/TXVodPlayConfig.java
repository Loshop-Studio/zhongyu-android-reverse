package com.tencent.rtmp;

import java.util.Map;

/* loaded from: classes4.dex */
public class TXVodPlayConfig {
    String mCacheFolderPath;
    Map<String, String> mHeaders;
    int mMaxCacheItems;
    int mPlayerType;
    int progressInterval;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    int mTimeout = 10;
    boolean enableAccurateSeek = true;
    boolean autoRotate = true;
    boolean smoothSwitchBitrate = false;
    String cacheMp4ExtName = "mp4";
    int maxBufferSize = 0;

    public void setAutoRotate(boolean z10) {
        this.autoRotate = z10;
    }

    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheMp4ExtName(String str) {
        this.cacheMp4ExtName = str;
    }

    public void setConnectRetryCount(int i10) {
        this.mConnectRetryCount = i10;
    }

    public void setConnectRetryInterval(int i10) {
        this.mConnectRetryInterval = i10;
    }

    public void setEnableAccurateSeek(boolean z10) {
        this.enableAccurateSeek = z10;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxBufferSize(int i10) {
        this.maxBufferSize = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.mMaxCacheItems = i10;
    }

    public void setPlayerType(int i10) {
        this.mPlayerType = i10;
    }

    public void setProgressInterval(int i10) {
        this.progressInterval = i10;
    }

    public void setSmoothSwitchBitrate(boolean z10) {
        this.smoothSwitchBitrate = z10;
    }

    public void setTimeout(int i10) {
        this.mTimeout = i10;
    }
}
