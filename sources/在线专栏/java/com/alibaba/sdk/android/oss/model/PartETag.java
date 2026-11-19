package com.alibaba.sdk.android.oss.model;

/* loaded from: classes.dex */
public class PartETag {
    private long crc64;
    private String eTag;
    private int partNumber;
    private long partSize;

    public PartETag(int i4, String str) {
        setPartNumber(i4);
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

    public void setCRC64(long j4) {
        this.crc64 = j4;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i4) {
        this.partNumber = i4;
    }

    public void setPartSize(long j4) {
        this.partSize = j4;
    }
}
