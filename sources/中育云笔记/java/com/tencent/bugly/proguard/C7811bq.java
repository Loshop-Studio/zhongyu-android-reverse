package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes5.dex */
public final class C7811bq extends AbstractC7827m {

    /* renamed from: y */
    static byte[] f13969y = {0};

    /* renamed from: z */
    static Map<String, String> f13970z;

    /* renamed from: a */
    public int f13971a = 0;

    /* renamed from: b */
    public String f13972b = "";

    /* renamed from: c */
    public String f13973c = "";

    /* renamed from: d */
    public String f13974d = "";

    /* renamed from: e */
    public String f13975e = "";

    /* renamed from: f */
    public String f13976f = "";

    /* renamed from: g */
    public int f13977g = 0;

    /* renamed from: h */
    public byte[] f13978h = null;

    /* renamed from: i */
    public String f13979i = "";

    /* renamed from: j */
    public String f13980j = "";

    /* renamed from: k */
    public Map<String, String> f13981k = null;

    /* renamed from: l */
    public String f13982l = "";

    /* renamed from: m */
    public long f13983m = 0;

    /* renamed from: n */
    public String f13984n = "";

    /* renamed from: o */
    public String f13985o = "";

    /* renamed from: p */
    public String f13986p = "";

    /* renamed from: q */
    public long f13987q = 0;

    /* renamed from: r */
    public String f13988r = "";

    /* renamed from: s */
    public String f13989s = "";

    /* renamed from: t */
    public String f13990t = "";

    /* renamed from: u */
    public String f13991u = "";

    /* renamed from: v */
    public String f13992v = "";

    /* renamed from: w */
    public String f13993w = "";

    /* renamed from: x */
    public String f13994x = "";

    static {
        HashMap map = new HashMap();
        f13970z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10905a(this.f13971a, 0);
        c7826l.m10909a(this.f13972b, 1);
        c7826l.m10909a(this.f13973c, 2);
        c7826l.m10909a(this.f13974d, 3);
        String str = this.f13975e;
        if (str != null) {
            c7826l.m10909a(str, 4);
        }
        c7826l.m10909a(this.f13976f, 5);
        c7826l.m10905a(this.f13977g, 6);
        c7826l.m10914a(this.f13978h, 7);
        String str2 = this.f13979i;
        if (str2 != null) {
            c7826l.m10909a(str2, 8);
        }
        String str3 = this.f13980j;
        if (str3 != null) {
            c7826l.m10909a(str3, 9);
        }
        Map<String, String> map = this.f13981k;
        if (map != null) {
            c7826l.m10911a((Map) map, 10);
        }
        String str4 = this.f13982l;
        if (str4 != null) {
            c7826l.m10909a(str4, 11);
        }
        c7826l.m10906a(this.f13983m, 12);
        String str5 = this.f13984n;
        if (str5 != null) {
            c7826l.m10909a(str5, 13);
        }
        String str6 = this.f13985o;
        if (str6 != null) {
            c7826l.m10909a(str6, 14);
        }
        String str7 = this.f13986p;
        if (str7 != null) {
            c7826l.m10909a(str7, 15);
        }
        c7826l.m10906a(this.f13987q, 16);
        String str8 = this.f13988r;
        if (str8 != null) {
            c7826l.m10909a(str8, 17);
        }
        String str9 = this.f13989s;
        if (str9 != null) {
            c7826l.m10909a(str9, 18);
        }
        String str10 = this.f13990t;
        if (str10 != null) {
            c7826l.m10909a(str10, 19);
        }
        String str11 = this.f13991u;
        if (str11 != null) {
            c7826l.m10909a(str11, 20);
        }
        String str12 = this.f13992v;
        if (str12 != null) {
            c7826l.m10909a(str12, 21);
        }
        String str13 = this.f13993w;
        if (str13 != null) {
            c7826l.m10909a(str13, 22);
        }
        String str14 = this.f13994x;
        if (str14 != null) {
            c7826l.m10909a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13971a = c7825k.m10881a(this.f13971a, 0, true);
        this.f13972b = c7825k.m10890b(1, true);
        this.f13973c = c7825k.m10890b(2, true);
        this.f13974d = c7825k.m10890b(3, true);
        this.f13975e = c7825k.m10890b(4, false);
        this.f13976f = c7825k.m10890b(5, true);
        this.f13977g = c7825k.m10881a(this.f13977g, 6, true);
        this.f13978h = c7825k.m10891c(7, true);
        this.f13979i = c7825k.m10890b(8, false);
        this.f13980j = c7825k.m10890b(9, false);
        this.f13981k = (Map) c7825k.m10885a((C7825k) f13970z, 10, false);
        this.f13982l = c7825k.m10890b(11, false);
        this.f13983m = c7825k.m10883a(this.f13983m, 12, false);
        this.f13984n = c7825k.m10890b(13, false);
        this.f13985o = c7825k.m10890b(14, false);
        this.f13986p = c7825k.m10890b(15, false);
        this.f13987q = c7825k.m10883a(this.f13987q, 16, false);
        this.f13988r = c7825k.m10890b(17, false);
        this.f13989s = c7825k.m10890b(18, false);
        this.f13990t = c7825k.m10890b(19, false);
        this.f13991u = c7825k.m10890b(20, false);
        this.f13992v = c7825k.m10890b(21, false);
        this.f13993w = c7825k.m10890b(22, false);
        this.f13994x = c7825k.m10890b(23, false);
    }
}
