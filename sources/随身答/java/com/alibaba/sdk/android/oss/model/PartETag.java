package com.alibaba.sdk.android.oss.model;

/* loaded from: classes3.dex */
public class PartETag {
    private long crc64;
    private String eTag;
    private int partNumber;
    private long partSize;

    public PartETag(int i9, String str) {
        setPartNumber(i9);
        setETag(str);
    }

    public long getCRC64() {
        return this.crc64;
    }

    public String getETag() {
        return this.eTag;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public long getPartSize() {
        return this.partSize;
    }

    public void setCRC64(long j9) {
        this.crc64 = j9;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i9) {
        this.partNumber = i9;
    }

    public void setPartSize(long j9) {
        this.partSize = j9;
    }
}
