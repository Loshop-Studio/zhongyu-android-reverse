package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes4.dex */
public final class C6706bq extends AbstractC6722m {

    /* renamed from: y */
    static byte[] f6104y = {0};

    /* renamed from: z */
    static Map<String, String> f6105z;

    /* renamed from: a */
    public int f6106a = 0;

    /* renamed from: b */
    public String f6107b = "";

    /* renamed from: c */
    public String f6108c = "";

    /* renamed from: d */
    public String f6109d = "";

    /* renamed from: e */
    public String f6110e = "";

    /* renamed from: f */
    public String f6111f = "";

    /* renamed from: g */
    public int f6112g = 0;

    /* renamed from: h */
    public byte[] f6113h = null;

    /* renamed from: i */
    public String f6114i = "";

    /* renamed from: j */
    public String f6115j = "";

    /* renamed from: k */
    public Map<String, String> f6116k = null;

    /* renamed from: l */
    public String f6117l = "";

    /* renamed from: m */
    public long f6118m = 0;

    /* renamed from: n */
    public String f6119n = "";

    /* renamed from: o */
    public String f6120o = "";

    /* renamed from: p */
    public String f6121p = "";

    /* renamed from: q */
    public long f6122q = 0;

    /* renamed from: r */
    public String f6123r = "";

    /* renamed from: s */
    public String f6124s = "";

    /* renamed from: t */
    public String f6125t = "";

    /* renamed from: u */
    public String f6126u = "";

    /* renamed from: v */
    public String f6127v = "";

    /* renamed from: w */
    public String f6128w = "";

    /* renamed from: x */
    public String f6129x = "";

    static {
        HashMap map = new HashMap();
        f6105z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5394a(this.f6106a, 0);
        c6721l.m5398a(this.f6107b, 1);
        c6721l.m5398a(this.f6108c, 2);
        c6721l.m5398a(this.f6109d, 3);
        String str = this.f6110e;
        if (str != null) {
            c6721l.m5398a(str, 4);
        }
        c6721l.m5398a(this.f6111f, 5);
        c6721l.m5394a(this.f6112g, 6);
        c6721l.m5403a(this.f6113h, 7);
        String str2 = this.f6114i;
        if (str2 != null) {
            c6721l.m5398a(str2, 8);
        }
        String str3 = this.f6115j;
        if (str3 != null) {
            c6721l.m5398a(str3, 9);
        }
        Map<String, String> map = this.f6116k;
        if (map != null) {
            c6721l.m5400a((Map) map, 10);
        }
        String str4 = this.f6117l;
        if (str4 != null) {
            c6721l.m5398a(str4, 11);
        }
        c6721l.m5395a(this.f6118m, 12);
        String str5 = this.f6119n;
        if (str5 != null) {
            c6721l.m5398a(str5, 13);
        }
        String str6 = this.f6120o;
        if (str6 != null) {
            c6721l.m5398a(str6, 14);
        }
        String str7 = this.f6121p;
        if (str7 != null) {
            c6721l.m5398a(str7, 15);
        }
        c6721l.m5395a(this.f6122q, 16);
        String str8 = this.f6123r;
        if (str8 != null) {
            c6721l.m5398a(str8, 17);
        }
        String str9 = this.f6124s;
        if (str9 != null) {
            c6721l.m5398a(str9, 18);
        }
        String str10 = this.f6125t;
        if (str10 != null) {
            c6721l.m5398a(str10, 19);
        }
        String str11 = this.f6126u;
        if (str11 != null) {
            c6721l.m5398a(str11, 20);
        }
        String str12 = this.f6127v;
        if (str12 != null) {
            c6721l.m5398a(str12, 21);
        }
        String str13 = this.f6128w;
        if (str13 != null) {
            c6721l.m5398a(str13, 22);
        }
        String str14 = this.f6129x;
        if (str14 != null) {
            c6721l.m5398a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6106a = c6720k.m5370a(this.f6106a, 0, true);
        this.f6107b = c6720k.m5379b(1, true);
        this.f6108c = c6720k.m5379b(2, true);
        this.f6109d = c6720k.m5379b(3, true);
        this.f6110e = c6720k.m5379b(4, false);
        this.f6111f = c6720k.m5379b(5, true);
        this.f6112g = c6720k.m5370a(this.f6112g, 6, true);
        this.f6113h = c6720k.m5380c(7, true);
        this.f6114i = c6720k.m5379b(8, false);
        this.f6115j = c6720k.m5379b(9, false);
        this.f6116k = (Map) c6720k.m5374a((C6720k) f6105z, 10, false);
        this.f6117l = c6720k.m5379b(11, false);
        this.f6118m = c6720k.m5372a(this.f6118m, 12, false);
        this.f6119n = c6720k.m5379b(13, false);
        this.f6120o = c6720k.m5379b(14, false);
        this.f6121p = c6720k.m5379b(15, false);
        this.f6122q = c6720k.m5372a(this.f6122q, 16, false);
        this.f6123r = c6720k.m5379b(17, false);
        this.f6124s = c6720k.m5379b(18, false);
        this.f6125t = c6720k.m5379b(19, false);
        this.f6126u = c6720k.m5379b(20, false);
        this.f6127v = c6720k.m5379b(21, false);
        this.f6128w = c6720k.m5379b(22, false);
        this.f6129x = c6720k.m5379b(23, false);
    }
}
