package com.alibaba.sdk.android.oss.model;

/* loaded from: classes3.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    public Range(long j9, long j10) {
        setBegin(j9);
        setEnd(j10);
    }

    public boolean checkIsValid() {
        long j9 = this.begin;
        if (j9 >= -1) {
            long j10 = this.end;
            if (j10 >= -1) {
                return j9 < 0 || j10 < 0 || j9 <= j10;
            }
        }
        return false;
    }

    public long getBegin() {
        return this.begin;
    }

    public long getEnd() {
        return this.end;
    }

    public void setBegin(long j9) {
        this.begin = j9;
    }

    public void setEnd(long j9) {
        this.end = j9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        long j9 = this.begin;
        sb.append(j9 == -1 ? "" : String.valueOf(j9));
        sb.append("-");
        long j10 = this.end;
        sb.append(j10 != -1 ? String.valueOf(j10) : "");
        return sb.toString();
    }
}
