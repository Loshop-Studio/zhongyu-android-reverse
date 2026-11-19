package okhttp3;

import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TlsVersion {

    /* renamed from: b */
    public static final C9558a f18948b;

    /* renamed from: c */
    public static final TlsVersion f18949c = new TlsVersion("TLS_1_3", 0, "TLSv1.3");

    /* renamed from: d */
    public static final TlsVersion f18950d = new TlsVersion("TLS_1_2", 1, "TLSv1.2");

    /* renamed from: e */
    public static final TlsVersion f18951e = new TlsVersion("TLS_1_1", 2, "TLSv1.1");

    /* renamed from: f */
    public static final TlsVersion f18952f = new TlsVersion("TLS_1_0", 3, "TLSv1");

    /* renamed from: g */
    public static final TlsVersion f18953g = new TlsVersion("SSL_3_0", 4, "SSLv3");

    /* renamed from: h */
    public static final /* synthetic */ TlsVersion[] f18954h;

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC9760a f18955i;

    /* renamed from: a */
    public final String f18956a;

    /* renamed from: okhttp3.TlsVersion$a */
    public static final class C9558a {
        public /* synthetic */ C9558a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final TlsVersion m17872a(String javaName) {
            AbstractC9133u.m16133g(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.f18951e;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.f18950d;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.f18949c;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.f18952f;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.f18953g;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public C9558a() {
        }
    }

    static {
        TlsVersion[] tlsVersionArrM17870a = m17870a();
        f18954h = tlsVersionArrM17870a;
        f18955i = AbstractC9108a.m16085a(tlsVersionArrM17870a);
        f18948b = new C9558a(null);
    }

    public TlsVersion(String str, int i10, String str2) {
        this.f18956a = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ TlsVersion[] m17870a() {
        return new TlsVersion[]{f18949c, f18950d, f18951e, f18952f, f18953g};
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) f18954h.clone();
    }

    /* renamed from: b */
    public final String m17871b() {
        return this.f18956a;
    }
}
