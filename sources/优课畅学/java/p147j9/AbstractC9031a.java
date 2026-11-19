package p147j9;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9559a;
import okhttp3.C9560b;
import p113g8.C8660c;
import p123h7.AbstractC8726f;
import p136i9.C8927y;

/* renamed from: j9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9031a {
    /* renamed from: a */
    public static final Charset m15696a(C8927y c8927y) {
        Charset charsetM15336d;
        return (c8927y == null || (charsetM15336d = C8927y.m15336d(c8927y, null, 1, null)) == null) ? C8660c.f16206b : charsetM15336d;
    }

    /* renamed from: b */
    public static final Pair m15697b(C8927y c8927y) {
        Charset charset = C8660c.f16206b;
        if (c8927y != null) {
            Charset charsetM15336d = C8927y.m15336d(c8927y, null, 1, null);
            if (charsetM15336d == null) {
                c8927y = C8927y.f16815e.m15343b(c8927y + "; charset=utf-8");
            } else {
                charset = charsetM15336d;
            }
        }
        return AbstractC8726f.m14230a(charset, c8927y);
    }

    /* renamed from: c */
    public static final String[] m15698c(C9560b c9560b, String[] socketEnabledCipherSuites) {
        AbstractC9133u.m16133g(c9560b, "<this>");
        AbstractC9133u.m16133g(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return c9560b.m17885d() != null ? AbstractC9038h.m15765u(c9560b.m17885d(), socketEnabledCipherSuites, C9559a.f19011b.m17879c()) : socketEnabledCipherSuites;
    }
}
