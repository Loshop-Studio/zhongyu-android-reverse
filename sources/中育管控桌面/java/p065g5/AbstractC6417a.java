package p065g5;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.C7525a;
import okhttp3.C7526b;
import p058f5.C6386y;

/* renamed from: g5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6417a {
    /* renamed from: a */
    public static final Charset m6938a(C6386y c6386y) {
        Charset charsetM6875d;
        return (c6386y == null || (charsetM6875d = C6386y.m6875d(c6386y, null, 1, null)) == null) ? Charsets.UTF_8 : charsetM6875d;
    }

    /* renamed from: b */
    public static final Pair m6939b(C6386y c6386y) {
        Charset charset = Charsets.UTF_8;
        if (c6386y != null) {
            Charset charsetM6875d = C6386y.m6875d(c6386y, null, 1, null);
            if (charsetM6875d == null) {
                c6386y = C6386y.f7983e.m6882b(c6386y + "; charset=utf-8");
            } else {
                charset = charsetM6875d;
            }
        }
        return TuplesKt.m7887to(charset, c6386y);
    }

    /* renamed from: c */
    public static final String[] m6940c(C7526b c7526b, String[] socketEnabledCipherSuites) {
        Intrinsics.checkNotNullParameter(c7526b, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return c7526b.m8704d() != null ? AbstractC6424h.m7007u(c7526b.m8704d(), socketEnabledCipherSuites, C7525a.f9789b.m8698c()) : socketEnabledCipherSuites;
    }
}
