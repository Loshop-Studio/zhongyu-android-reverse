package p161s7;

import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6301i0;
import okio.ByteString;
import p139p7.AbstractC6396c;

/* renamed from: s7.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6569d {
    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        companion.encodeUtf8("\"\\");
        companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m6211a(C6301i0 c6301i0) {
        if (AbstractC5830k.m5325b(c6301i0.f10104a.f10076b, "HEAD")) {
            return false;
        }
        int i = c6301i0.f10107d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && AbstractC6396c.m6049i(c6301i0) == -1 && !"chunked".equalsIgnoreCase(C6301i0.m5898a("Transfer-Encoding", c6301i0))) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6212b(okhttp3.C6286b r34, okhttp3.C6330r r35, okhttp3.C6329q r36) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p161s7.AbstractC6569d.m6212b(okhttp3.b, okhttp3.r, okhttp3.q):void");
    }
}
