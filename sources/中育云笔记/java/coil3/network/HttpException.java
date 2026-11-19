package coil3.network;

import p327s.C11019l;

/* loaded from: classes3.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: c */
    public final C11019l f3802c;

    public HttpException(C11019l c11019l) {
        super("HTTP " + c11019l.m24340d());
        this.f3802c = c11019l;
    }
}
