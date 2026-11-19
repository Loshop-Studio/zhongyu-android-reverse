package okhttp3;

import java.util.LinkedHashMap;

/* renamed from: okhttp3.j */
/* loaded from: classes4.dex */
public final class C6316j {

    /* renamed from: b */
    public static final C6286b f10202b;

    /* renamed from: c */
    public static final C6300i f10203c;

    /* renamed from: d */
    public static final LinkedHashMap f10204d;

    /* renamed from: e */
    public static final C6316j f10205e;

    /* renamed from: f */
    public static final C6316j f10206f;

    /* renamed from: g */
    public static final C6316j f10207g;

    /* renamed from: h */
    public static final C6316j f10208h;

    /* renamed from: i */
    public static final C6316j f10209i;

    /* renamed from: j */
    public static final C6316j f10210j;

    /* renamed from: k */
    public static final C6316j f10211k;

    /* renamed from: l */
    public static final C6316j f10212l;

    /* renamed from: m */
    public static final C6316j f10213m;

    /* renamed from: n */
    public static final C6316j f10214n;

    /* renamed from: o */
    public static final C6316j f10215o;

    /* renamed from: p */
    public static final C6316j f10216p;

    /* renamed from: q */
    public static final C6316j f10217q;

    /* renamed from: r */
    public static final C6316j f10218r;

    /* renamed from: s */
    public static final C6316j f10219s;

    /* renamed from: t */
    public static final C6316j f10220t;

    /* renamed from: a */
    public final String f10221a;

    static {
        C6286b c6286b = new C6286b();
        f10202b = c6286b;
        f10203c = new C6300i();
        f10204d = new LinkedHashMap();
        C6286b.m5877a(c6286b, "SSL_RSA_WITH_NULL_MD5");
        C6286b.m5877a(c6286b, "SSL_RSA_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        C6286b.m5877a(c6286b, "SSL_RSA_WITH_RC4_128_MD5");
        C6286b.m5877a(c6286b, "SSL_RSA_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_RSA_WITH_DES_CBC_SHA");
        f10205e = C6286b.m5877a(c6286b, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        C6286b.m5877a(c6286b, "SSL_DH_anon_WITH_RC4_128_MD5");
        C6286b.m5877a(c6286b, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DH_anon_WITH_DES_CBC_SHA");
        C6286b.m5877a(c6286b, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_DES_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_DES_CBC_MD5");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        C6286b.m5877a(c6286b, "TLS_KRB5_WITH_RC4_128_MD5");
        C6286b.m5877a(c6286b, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        C6286b.m5877a(c6286b, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        C6286b.m5877a(c6286b, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f10206f = C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f10207g = C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_NULL_SHA256");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_PSK_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_PSK_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_PSK_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_RSA_WITH_SEED_CBC_SHA");
        f10208h = C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f10209i = C6286b.m5877a(c6286b, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        C6286b.m5877a(c6286b, "TLS_FALLBACK_SCSV");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f10210j = C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f10211k = C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_anon_WITH_NULL_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f10212l = C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f10213m = C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f10214n = C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f10215o = C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        C6286b.m5877a(c6286b, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        C6286b.m5877a(c6286b, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f10216p = C6286b.m5877a(c6286b, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f10217q = C6286b.m5877a(c6286b, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        C6286b.m5877a(c6286b, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        C6286b.m5877a(c6286b, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f10218r = C6286b.m5877a(c6286b, "TLS_AES_128_GCM_SHA256");
        f10219s = C6286b.m5877a(c6286b, "TLS_AES_256_GCM_SHA384");
        f10220t = C6286b.m5877a(c6286b, "TLS_CHACHA20_POLY1305_SHA256");
        C6286b.m5877a(c6286b, "TLS_AES_128_CCM_SHA256");
        C6286b.m5877a(c6286b, "TLS_AES_128_CCM_8_SHA256");
    }

    public C6316j(String str) {
        this.f10221a = str;
    }

    public final String toString() {
        return this.f10221a;
    }
}
