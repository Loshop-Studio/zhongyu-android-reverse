package p168e;

import java.util.LinkedHashMap;
import java.util.Map;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;
import p160d.p167i.C1026g;

/* renamed from: e.d */
/* loaded from: classes.dex */
public final class C1031d {

    /* renamed from: b */
    public static final Map<String, C1031d> f5513b;

    /* renamed from: c */
    public static final C1031d f5514c;

    /* renamed from: d */
    public static final C1031d f5515d;

    /* renamed from: e */
    public static final C1031d f5516e;

    /* renamed from: f */
    public static final C1031d f5517f;

    /* renamed from: g */
    public static final C1031d f5518g;

    /* renamed from: h */
    public static final C1031d f5519h;

    /* renamed from: i */
    public static final C1031d f5520i;

    /* renamed from: j */
    public static final C1031d f5521j;

    /* renamed from: k */
    public static final C1031d f5522k;

    /* renamed from: l */
    public static final C1031d f5523l;

    /* renamed from: m */
    public static final C1031d f5524m;

    /* renamed from: n */
    public static final C1031d f5525n;

    /* renamed from: o */
    public static final C1031d f5526o;

    /* renamed from: p */
    public static final C1031d f5527p;

    /* renamed from: q */
    public static final C1031d f5528q;

    /* renamed from: r */
    public static final C1031d f5529r;

    /* renamed from: s */
    public static final a f5530s;

    /* renamed from: a */
    public final String f5531a;

    /* renamed from: e.d$a */
    public static final class a {
        public a(C1010c c1010c) {
        }

        /* renamed from: a */
        public static final C1031d m2831a(a aVar, String str, int i) {
            C1031d c1031d = new C1031d(str, null);
            C1031d.f5513b.put(str, c1031d);
            return c1031d;
        }

        /* renamed from: b */
        public final String m2832b(String str) {
            StringBuilder sbM2079g;
            if (C1026g.m2829l(str, "TLS_", false, 2)) {
                sbM2079g = C0561a.m2079g("SSL_");
            } else {
                if (!C1026g.m2829l(str, "SSL_", false, 2)) {
                    return str;
                }
                sbM2079g = C0561a.m2079g("TLS_");
            }
            String strSubstring = str.substring(4);
            C1011d.m2808d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            sbM2079g.append(strSubstring);
            return sbM2079g.toString();
        }
    }

    static {
        a aVar = new a(null);
        f5530s = aVar;
        f5513b = new LinkedHashMap();
        a.m2831a(aVar, "SSL_RSA_WITH_NULL_MD5", 1);
        a.m2831a(aVar, "SSL_RSA_WITH_NULL_SHA", 2);
        a.m2831a(aVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        a.m2831a(aVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        a.m2831a(aVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        a.m2831a(aVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        a.m2831a(aVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f5514c = a.m2831a(aVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        a.m2831a(aVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        a.m2831a(aVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        a.m2831a(aVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        a.m2831a(aVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        a.m2831a(aVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        a.m2831a(aVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        a.m2831a(aVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        a.m2831a(aVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        a.m2831a(aVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        a.m2831a(aVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        a.m2831a(aVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        a.m2831a(aVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        a.m2831a(aVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        a.m2831a(aVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        a.m2831a(aVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        a.m2831a(aVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        a.m2831a(aVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        a.m2831a(aVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        a.m2831a(aVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        a.m2831a(aVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        a.m2831a(aVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f5515d = a.m2831a(aVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f5516e = a.m2831a(aVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        a.m2831a(aVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        a.m2831a(aVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        a.m2831a(aVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        a.m2831a(aVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        a.m2831a(aVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        a.m2831a(aVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        a.m2831a(aVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        a.m2831a(aVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        a.m2831a(aVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        a.m2831a(aVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f5517f = a.m2831a(aVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f5518g = a.m2831a(aVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        a.m2831a(aVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        a.m2831a(aVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        a.m2831a(aVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        a.m2831a(aVar, "TLS_FALLBACK_SCSV", 22016);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f5519h = a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f5520i = a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        a.m2831a(aVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        a.m2831a(aVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        a.m2831a(aVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        a.m2831a(aVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        a.m2831a(aVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f5521j = a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f5522k = a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        a.m2831a(aVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f5523l = a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f5524m = a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        a.m2831a(aVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        a.m2831a(aVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        a.m2831a(aVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f5525n = a.m2831a(aVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f5526o = a.m2831a(aVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        a.m2831a(aVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        a.m2831a(aVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f5527p = a.m2831a(aVar, "TLS_AES_128_GCM_SHA256", 4865);
        f5528q = a.m2831a(aVar, "TLS_AES_256_GCM_SHA384", 4866);
        f5529r = a.m2831a(aVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        a.m2831a(aVar, "TLS_AES_128_CCM_SHA256", 4868);
        a.m2831a(aVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C1031d(String str, C1010c c1010c) {
        this.f5531a = str;
    }

    public String toString() {
        return this.f5531a;
    }
}
