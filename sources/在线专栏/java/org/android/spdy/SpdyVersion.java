package org.android.spdy;

/* loaded from: classes.dex */
public enum SpdyVersion {
    SPDY2(2),
    SPDY3(3),
    SPDY3DOT1(4);

    private int version;

    SpdyVersion(int i4) {
        this.version = i4;
    }

    int getInt() {
        return this.version;
    }
}
