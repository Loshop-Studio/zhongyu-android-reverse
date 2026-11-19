package com.alibaba.sdk.android.oss.model;

/* loaded from: classes.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    public Range(long j4, long j5) {
        setBegin(j4);
        setEnd(j5);
    }

    public boolean checkIsValid() {
        long j4 = this.begin;
        if (j4 >= -1) {
            long j5 = this.end;
            if (j5 >= -1) {
                return j4 < 0 || j5 < 0 || j4 <= j5;
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

    public void setBegin(long j4) {
        this.begin = j4;
    }

    public void setEnd(long j4) {
        this.end = j4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        long j4 = this.begin;
        sb.append(j4 == -1 ? "" : String.valueOf(j4));
        sb.append("-");
        long j5 = this.end;
        sb.append(j5 != -1 ? String.valueOf(j5) : "");
        return sb.toString();
    }
}
