package com.zykj.mistake.feature.collection.component;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import p045d6.C5443s;
import p137p4.C6383b;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p178u7.C6641o;
import p178u7.C6645s;

/* renamed from: com.zykj.mistake.feature.collection.component.n */
/* loaded from: classes3.dex */
public final class C4568n implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6425a;

    /* renamed from: b */
    public final Object f6426b;

    /* renamed from: c */
    public final /* synthetic */ Object f6427c;

    public /* synthetic */ C4568n(InterfaceC6471c interfaceC6471c, C6383b c6383b, int i) {
        this.f6425a = i;
        this.f6426b = interfaceC6471c;
        this.f6427c = c6383b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [u7.o] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // p152r6.InterfaceC6469a
    public final Object invoke() throws Throwable {
        Throwable th;
        ErrorCode errorCode;
        switch (this.f6425a) {
            case 0:
                ((InterfaceC6471c) this.f6426b).invoke((C6383b) this.f6427c);
                return C5443s.f8405a;
            case 1:
                ((InterfaceC6471c) this.f6426b).invoke((C6383b) this.f6427c);
                return C5443s.f8405a;
            default:
                ?? r02 = (C6641o) this.f6427c;
                C6645s c6645s = (C6645s) this.f6426b;
                ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
                ?? r32 = 1;
                IOException e = null;
                try {
                    try {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            r02.m6277a(r32, errorCode2, e);
                            AbstractC6396c.m6043c(c6645s);
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        errorCode = errorCode2;
                    }
                    if (!c6645s.m6287a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            r32 = errorCode2;
                            r02.m6277a(r32, errorCode2, e);
                            AbstractC6396c.m6043c(c6645s);
                            throw th;
                        }
                    } while (c6645s.m6287a(false, this));
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        r02.m6277a(errorCode, errorCode2, null);
                        r32 = errorCode;
                    } catch (IOException e8) {
                        e = e8;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        r02.m6277a(errorCode2, errorCode2, e);
                        r32 = errorCode;
                        AbstractC6396c.m6043c(c6645s);
                        return C5443s.f8405a;
                    }
                    AbstractC6396c.m6043c(c6645s);
                    return C5443s.f8405a;
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    public C4568n(C6641o c6641o, C6645s c6645s) {
        this.f6425a = 2;
        this.f6427c = c6641o;
        this.f6426b = c6645s;
    }
}
