package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes3.dex */
public final class C4089bq extends AbstractC4123m {

    /* renamed from: y */
    static byte[] f3729y = {0};

    /* renamed from: z */
    static Map<String, String> f3730z;

    /* renamed from: a */
    public int f3731a = 0;

    /* renamed from: b */
    public String f3732b = "";

    /* renamed from: c */
    public String f3733c = "";

    /* renamed from: d */
    public String f3734d = "";

    /* renamed from: e */
    public String f3735e = "";

    /* renamed from: f */
    public String f3736f = "";

    /* renamed from: g */
    public int f3737g = 0;

    /* renamed from: h */
    public byte[] f3738h = null;

    /* renamed from: i */
    public String f3739i = "";

    /* renamed from: j */
    public String f3740j = "";

    /* renamed from: k */
    public Map<String, String> f3741k = null;

    /* renamed from: l */
    public String f3742l = "";

    /* renamed from: m */
    public long f3743m = 0;

    /* renamed from: n */
    public String f3744n = "";

    /* renamed from: o */
    public String f3745o = "";

    /* renamed from: p */
    public String f3746p = "";

    /* renamed from: q */
    public long f3747q = 0;

    /* renamed from: r */
    public String f3748r = "";

    /* renamed from: s */
    public String f3749s = "";

    /* renamed from: t */
    public String f3750t = "";

    /* renamed from: u */
    public String f3751u = "";

    /* renamed from: v */
    public String f3752v = "";

    /* renamed from: w */
    public String f3753w = "";

    /* renamed from: x */
    public String f3754x = "";

    static {
        HashMap map = new HashMap();
        f3730z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3311a(this.f3731a, 0);
        c4121l.m3315a(this.f3732b, 1);
        c4121l.m3315a(this.f3733c, 2);
        c4121l.m3315a(this.f3734d, 3);
        String str = this.f3735e;
        if (str != null) {
            c4121l.m3315a(str, 4);
        }
        c4121l.m3315a(this.f3736f, 5);
        c4121l.m3311a(this.f3737g, 6);
        c4121l.m3320a(this.f3738h, 7);
        String str2 = this.f3739i;
        if (str2 != null) {
            c4121l.m3315a(str2, 8);
        }
        String str3 = this.f3740j;
        if (str3 != null) {
            c4121l.m3315a(str3, 9);
        }
        Map<String, String> map = this.f3741k;
        if (map != null) {
            c4121l.m3317a((Map) map, 10);
        }
        String str4 = this.f3742l;
        if (str4 != null) {
            c4121l.m3315a(str4, 11);
        }
        c4121l.m3312a(this.f3743m, 12);
        String str5 = this.f3744n;
        if (str5 != null) {
            c4121l.m3315a(str5, 13);
        }
        String str6 = this.f3745o;
        if (str6 != null) {
            c4121l.m3315a(str6, 14);
        }
        String str7 = this.f3746p;
        if (str7 != null) {
            c4121l.m3315a(str7, 15);
        }
        c4121l.m3312a(this.f3747q, 16);
        String str8 = this.f3748r;
        if (str8 != null) {
            c4121l.m3315a(str8, 17);
        }
        String str9 = this.f3749s;
        if (str9 != null) {
            c4121l.m3315a(str9, 18);
        }
        String str10 = this.f3750t;
        if (str10 != null) {
            c4121l.m3315a(str10, 19);
        }
        String str11 = this.f3751u;
        if (str11 != null) {
            c4121l.m3315a(str11, 20);
        }
        String str12 = this.f3752v;
        if (str12 != null) {
            c4121l.m3315a(str12, 21);
        }
        String str13 = this.f3753w;
        if (str13 != null) {
            c4121l.m3315a(str13, 22);
        }
        String str14 = this.f3754x;
        if (str14 != null) {
            c4121l.m3315a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3731a = c4119k.m3287a(this.f3731a, 0, true);
        this.f3732b = c4119k.m3296b(1, true);
        this.f3733c = c4119k.m3296b(2, true);
        this.f3734d = c4119k.m3296b(3, true);
        this.f3735e = c4119k.m3296b(4, false);
        this.f3736f = c4119k.m3296b(5, true);
        this.f3737g = c4119k.m3287a(this.f3737g, 6, true);
        this.f3738h = c4119k.m3297c(7, true);
        this.f3739i = c4119k.m3296b(8, false);
        this.f3740j = c4119k.m3296b(9, false);
        this.f3741k = (Map) c4119k.m3291a((C4119k) f3730z, 10, false);
        this.f3742l = c4119k.m3296b(11, false);
        this.f3743m = c4119k.m3289a(this.f3743m, 12, false);
        this.f3744n = c4119k.m3296b(13, false);
        this.f3745o = c4119k.m3296b(14, false);
        this.f3746p = c4119k.m3296b(15, false);
        this.f3747q = c4119k.m3289a(this.f3747q, 16, false);
        this.f3748r = c4119k.m3296b(17, false);
        this.f3749s = c4119k.m3296b(18, false);
        this.f3750t = c4119k.m3296b(19, false);
        this.f3751u = c4119k.m3296b(20, false);
        this.f3752v = c4119k.m3296b(21, false);
        this.f3753w = c4119k.m3296b(22, false);
        this.f3754x = c4119k.m3296b(23, false);
    }
}
