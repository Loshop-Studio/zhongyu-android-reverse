package okhttp3;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: d */
    public static final C10494a f24966d = new C10494a(null);

    /* renamed from: c */
    public final String f24973c;

    /* renamed from: okhttp3.TlsVersion$a */
    public static final class C10494a {
        public /* synthetic */ C10494a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final TlsVersion m21958a(String javaName) {
            AbstractC9979u.m20294g(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public C10494a() {
        }
    }

    TlsVersion(String str) {
        this.f24973c = str;
    }

    /* renamed from: c */
    public final String m21957c() {
        return this.f24973c;
    }
}
