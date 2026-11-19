package okhttp3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m7880d2 = {"Lokhttp3/TlsVersion;", "", "", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "okhttp"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class TlsVersion {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c */
    public static final TlsVersion f9727c = new TlsVersion("TLS_1_3", 0, "TLSv1.3");

    /* renamed from: d */
    public static final TlsVersion f9728d = new TlsVersion("TLS_1_2", 1, "TLSv1.2");

    /* renamed from: e */
    public static final TlsVersion f9729e = new TlsVersion("TLS_1_1", 2, "TLSv1.1");

    /* renamed from: f */
    public static final TlsVersion f9730f = new TlsVersion("TLS_1_0", 3, "TLSv1");

    /* renamed from: g */
    public static final TlsVersion f9731g = new TlsVersion("SSL_3_0", 4, "SSLv3");

    /* renamed from: h */
    public static final /* synthetic */ TlsVersion[] f9732h;

    /* renamed from: i */
    public static final /* synthetic */ EnumEntries f9733i;

    /* renamed from: a, reason: from kotlin metadata */
    public final String javaName;

    /* renamed from: okhttp3.TlsVersion$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final TlsVersion m8691a(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.f9729e;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.f9728d;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.f9727c;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.f9730f;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.f9731g;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public Companion() {
        }
    }

    static {
        TlsVersion[] tlsVersionArrM8689a = m8689a();
        f9732h = tlsVersionArrM8689a;
        f9733i = EnumEntriesKt.enumEntries(tlsVersionArrM8689a);
        INSTANCE = new Companion(null);
    }

    public TlsVersion(String str, int i6, String str2) {
        this.javaName = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ TlsVersion[] m8689a() {
        return new TlsVersion[]{f9727c, f9728d, f9729e, f9730f, f9731g};
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) f9732h.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }
}
