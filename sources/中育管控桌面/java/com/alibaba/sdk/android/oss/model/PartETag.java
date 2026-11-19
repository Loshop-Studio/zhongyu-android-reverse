package com.alibaba.sdk.android.oss.model;

/* loaded from: classes3.dex */
public class PartETag {
    private long crc64;
    private String eTag;
    private int partNumber;
    private long partSize;

    public PartETag(int i6, String str) {
        setPartNumber(i6);
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

    public void setCRC64(long j6) {
        this.crc64 = j6;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i6) {
        this.partNumber = i6;
    }

    public void setPartSize(long j6) {
        this.partSize = j6;
    }
}
