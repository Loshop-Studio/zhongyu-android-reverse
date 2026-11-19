package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes4.dex */
public final class C6446bq extends AbstractC6462m {

    /* renamed from: y */
    static byte[] f5527y = {0};

    /* renamed from: z */
    static Map<String, String> f5528z;

    /* renamed from: a */
    public int f5529a = 0;

    /* renamed from: b */
    public String f5530b = "";

    /* renamed from: c */
    public String f5531c = "";

    /* renamed from: d */
    public String f5532d = "";

    /* renamed from: e */
    public String f5533e = "";

    /* renamed from: f */
    public String f5534f = "";

    /* renamed from: g */
    public int f5535g = 0;

    /* renamed from: h */
    public byte[] f5536h = null;

    /* renamed from: i */
    public String f5537i = "";

    /* renamed from: j */
    public String f5538j = "";

    /* renamed from: k */
    public Map<String, String> f5539k = null;

    /* renamed from: l */
    public String f5540l = "";

    /* renamed from: m */
    public long f5541m = 0;

    /* renamed from: n */
    public String f5542n = "";

    /* renamed from: o */
    public String f5543o = "";

    /* renamed from: p */
    public String f5544p = "";

    /* renamed from: q */
    public long f5545q = 0;

    /* renamed from: r */
    public String f5546r = "";

    /* renamed from: s */
    public String f5547s = "";

    /* renamed from: t */
    public String f5548t = "";

    /* renamed from: u */
    public String f5549u = "";

    /* renamed from: v */
    public String f5550v = "";

    /* renamed from: w */
    public String f5551w = "";

    /* renamed from: x */
    public String f5552x = "";

    static {
        HashMap map = new HashMap();
        f5528z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5215a(this.f5529a, 0);
        c6461l.m5219a(this.f5530b, 1);
        c6461l.m5219a(this.f5531c, 2);
        c6461l.m5219a(this.f5532d, 3);
        String str = this.f5533e;
        if (str != null) {
            c6461l.m5219a(str, 4);
        }
        c6461l.m5219a(this.f5534f, 5);
        c6461l.m5215a(this.f5535g, 6);
        c6461l.m5224a(this.f5536h, 7);
        String str2 = this.f5537i;
        if (str2 != null) {
            c6461l.m5219a(str2, 8);
        }
        String str3 = this.f5538j;
        if (str3 != null) {
            c6461l.m5219a(str3, 9);
        }
        Map<String, String> map = this.f5539k;
        if (map != null) {
            c6461l.m5221a((Map) map, 10);
        }
        String str4 = this.f5540l;
        if (str4 != null) {
            c6461l.m5219a(str4, 11);
        }
        c6461l.m5216a(this.f5541m, 12);
        String str5 = this.f5542n;
        if (str5 != null) {
            c6461l.m5219a(str5, 13);
        }
        String str6 = this.f5543o;
        if (str6 != null) {
            c6461l.m5219a(str6, 14);
        }
        String str7 = this.f5544p;
        if (str7 != null) {
            c6461l.m5219a(str7, 15);
        }
        c6461l.m5216a(this.f5545q, 16);
        String str8 = this.f5546r;
        if (str8 != null) {
            c6461l.m5219a(str8, 17);
        }
        String str9 = this.f5547s;
        if (str9 != null) {
            c6461l.m5219a(str9, 18);
        }
        String str10 = this.f5548t;
        if (str10 != null) {
            c6461l.m5219a(str10, 19);
        }
        String str11 = this.f5549u;
        if (str11 != null) {
            c6461l.m5219a(str11, 20);
        }
        String str12 = this.f5550v;
        if (str12 != null) {
            c6461l.m5219a(str12, 21);
        }
        String str13 = this.f5551w;
        if (str13 != null) {
            c6461l.m5219a(str13, 22);
        }
        String str14 = this.f5552x;
        if (str14 != null) {
            c6461l.m5219a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5529a = c6460k.m5191a(this.f5529a, 0, true);
        this.f5530b = c6460k.m5200b(1, true);
        this.f5531c = c6460k.m5200b(2, true);
        this.f5532d = c6460k.m5200b(3, true);
        this.f5533e = c6460k.m5200b(4, false);
        this.f5534f = c6460k.m5200b(5, true);
        this.f5535g = c6460k.m5191a(this.f5535g, 6, true);
        this.f5536h = c6460k.m5201c(7, true);
        this.f5537i = c6460k.m5200b(8, false);
        this.f5538j = c6460k.m5200b(9, false);
        this.f5539k = (Map) c6460k.m5195a((C6460k) f5528z, 10, false);
        this.f5540l = c6460k.m5200b(11, false);
        this.f5541m = c6460k.m5193a(this.f5541m, 12, false);
        this.f5542n = c6460k.m5200b(13, false);
        this.f5543o = c6460k.m5200b(14, false);
        this.f5544p = c6460k.m5200b(15, false);
        this.f5545q = c6460k.m5193a(this.f5545q, 16, false);
        this.f5546r = c6460k.m5200b(17, false);
        this.f5547s = c6460k.m5200b(18, false);
        this.f5548t = c6460k.m5200b(19, false);
        this.f5549u = c6460k.m5200b(20, false);
        this.f5550v = c6460k.m5200b(21, false);
        this.f5551w = c6460k.m5200b(22, false);
        this.f5552x = c6460k.m5200b(23, false);
    }
}
