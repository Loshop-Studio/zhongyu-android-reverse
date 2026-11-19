package org.android.spdy;

/* loaded from: classes.dex */
public enum SslVersion {
    SLIGHT_VERSION_V1(0);

    private int code;

    SslVersion(int i4) {
        this.code = i4;
    }

    int getint() {
        return this.code;
    }
}
