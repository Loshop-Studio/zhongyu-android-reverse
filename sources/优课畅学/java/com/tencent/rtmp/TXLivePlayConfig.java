package com.tencent.rtmp;

import java.util.Map;

/* loaded from: classes4.dex */
public class TXLivePlayConfig {
    String mCacheFolderPath;
    protected Map<String, String> mHeaders;
    int mMaxCacheItems;
    float mCacheTime = 5.0f;
    float mMaxAutoAdjustCacheTime = 5.0f;
    float mMinAutoAdjustCacheTime = 1.0f;
    int mVideoBlockThreshold = 800;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    boolean mAutoAdjustCacheTime = true;
    boolean mEnableAec = false;
    boolean mEnableNearestIP = true;
    boolean mEnableMessage = false;
    boolean mEnableMetaData = false;
    String mFlvSessionKey = "";
    int mRtmpChannelType = 0;
    boolean mAutoRotate = true;

    public void enableAEC(boolean z10) {
        this.mEnableAec = z10;
    }

    public void setAutoAdjustCacheTime(boolean z10) {
        this.mAutoAdjustCacheTime = z10;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheTime(float f10) {
        this.mCacheTime = f10;
    }

    public void setConnectRetryCount(int i10) {
        this.mConnectRetryCount = i10;
    }

    public void setConnectRetryInterval(int i10) {
        this.mConnectRetryInterval = i10;
    }

    public void setEnableMessage(boolean z10) {
        this.mEnableMessage = z10;
    }

    public void setEnableMetaData(boolean z10) {
        this.mEnableMetaData = z10;
    }

    @Deprecated
    public void setEnableNearestIP(boolean z10) {
        this.mEnableNearestIP = z10;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    @Deprecated
    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxAutoAdjustCacheTime(float f10) {
        this.mMaxAutoAdjustCacheTime = f10;
    }

    @Deprecated
    public void setMaxCacheItems(int i10) {
        this.mMaxCacheItems = i10;
    }

    public void setMinAutoAdjustCacheTime(float f10) {
        this.mMinAutoAdjustCacheTime = f10;
    }

    @Deprecated
    public void setRtmpChannelType(int i10) {
        this.mRtmpChannelType = i10;
    }

    public void setVideoBlockThreshold(int i10) {
        this.mVideoBlockThreshold = i10;
    }
}
