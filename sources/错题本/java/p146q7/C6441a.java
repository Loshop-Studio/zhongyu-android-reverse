package p146q7;

import okhttp3.C6299h0;
import okhttp3.C6301i0;

/* renamed from: q7.a */
/* loaded from: classes4.dex */
public final class C6441a {
    /* renamed from: a */
    public static final C6301i0 m6082a(C6301i0 c6301i0) {
        if ((c6301i0 != null ? c6301i0.f10110g : null) == null) {
            return c6301i0;
        }
        C6299h0 c6299h0M5900c = c6301i0.m5900c();
        c6299h0M5900c.f10097g = null;
        return c6299h0M5900c.m5897a();
    }

    /* renamed from: b */
    public static boolean m6083b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
