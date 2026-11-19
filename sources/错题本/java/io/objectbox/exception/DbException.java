package io.objectbox.exception;

import android.support.v4.media.AbstractC0037f;

/* loaded from: classes3.dex */
public class DbException extends RuntimeException {
    private final int errorCode;

    public DbException(String str) {
        super(str);
        this.errorCode = 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.errorCode == 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" (error code ");
        return AbstractC0037f.m90o(sb, ")", this.errorCode);
    }

    public DbException(String str, Throwable th) {
        super(str, th);
        this.errorCode = 0;
    }

    public DbException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
