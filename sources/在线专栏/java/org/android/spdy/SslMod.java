package org.android.spdy;

/* loaded from: classes.dex */
enum SslMod {
    SLIGHT_SLL_NOT_ENCRYT(0),
    SLIGHT_SSL_0_RTT(1);

    private int code;

    SslMod(int i4) {
        this.code = i4;
    }

    int getint() {
        return this.code;
    }
}
