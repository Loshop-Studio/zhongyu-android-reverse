package com.alibaba.sdk.android.oss.model;

/* loaded from: classes2.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    public Range(long j7, long j8) {
        setBegin(j7);
        setEnd(j8);
    }

    public boolean checkIsValid() {
        long j7 = this.begin;
        if (j7 >= -1) {
            long j8 = this.end;
            if (j8 >= -1) {
                return j7 < 0 || j8 < 0 || j7 <= j8;
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

    public void setBegin(long j7) {
        this.begin = j7;
    }

    public void setEnd(long j7) {
        this.end = j7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("bytes=");
        long j7 = this.begin;
        sb.append(j7 == -1 ? "" : String.valueOf(j7));
        sb.append("-");
        long j8 = this.end;
        sb.append(j8 != -1 ? String.valueOf(j8) : "");
        return sb.toString();
    }
}
