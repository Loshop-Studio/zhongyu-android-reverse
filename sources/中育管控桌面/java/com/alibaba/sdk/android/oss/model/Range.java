package com.alibaba.sdk.android.oss.model;

/* loaded from: classes3.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    public Range(long j6, long j7) {
        setBegin(j6);
        setEnd(j7);
    }

    public boolean checkIsValid() {
        long j6 = this.begin;
        if (j6 >= -1) {
            long j7 = this.end;
            if (j7 >= -1) {
                return j6 < 0 || j7 < 0 || j6 <= j7;
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

    public void setBegin(long j6) {
        this.begin = j6;
    }

    public void setEnd(long j6) {
        this.end = j6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        long j6 = this.begin;
        sb.append(j6 == -1 ? "" : String.valueOf(j6));
        sb.append("-");
        long j7 = this.end;
        sb.append(j7 != -1 ? String.valueOf(j7) : "");
        return sb.toString();
    }
}
