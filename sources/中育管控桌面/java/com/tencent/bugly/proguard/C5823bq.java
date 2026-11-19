package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes3.dex */
public final class C5823bq extends AbstractC5839m {

    /* renamed from: y */
    static byte[] f4248y = {0};

    /* renamed from: z */
    static Map<String, String> f4249z;

    /* renamed from: a */
    public int f4250a = 0;

    /* renamed from: b */
    public String f4251b = "";

    /* renamed from: c */
    public String f4252c = "";

    /* renamed from: d */
    public String f4253d = "";

    /* renamed from: e */
    public String f4254e = "";

    /* renamed from: f */
    public String f4255f = "";

    /* renamed from: g */
    public int f4256g = 0;

    /* renamed from: h */
    public byte[] f4257h = null;

    /* renamed from: i */
    public String f4258i = "";

    /* renamed from: j */
    public String f4259j = "";

    /* renamed from: k */
    public Map<String, String> f4260k = null;

    /* renamed from: l */
    public String f4261l = "";

    /* renamed from: m */
    public long f4262m = 0;

    /* renamed from: n */
    public String f4263n = "";

    /* renamed from: o */
    public String f4264o = "";

    /* renamed from: p */
    public String f4265p = "";

    /* renamed from: q */
    public long f4266q = 0;

    /* renamed from: r */
    public String f4267r = "";

    /* renamed from: s */
    public String f4268s = "";

    /* renamed from: t */
    public String f4269t = "";

    /* renamed from: u */
    public String f4270u = "";

    /* renamed from: v */
    public String f4271v = "";

    /* renamed from: w */
    public String f4272w = "";

    /* renamed from: x */
    public String f4273x = "";

    static {
        HashMap map = new HashMap();
        f4249z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4220a(this.f4250a, 0);
        c5838l.m4224a(this.f4251b, 1);
        c5838l.m4224a(this.f4252c, 2);
        c5838l.m4224a(this.f4253d, 3);
        String str = this.f4254e;
        if (str != null) {
            c5838l.m4224a(str, 4);
        }
        c5838l.m4224a(this.f4255f, 5);
        c5838l.m4220a(this.f4256g, 6);
        c5838l.m4229a(this.f4257h, 7);
        String str2 = this.f4258i;
        if (str2 != null) {
            c5838l.m4224a(str2, 8);
        }
        String str3 = this.f4259j;
        if (str3 != null) {
            c5838l.m4224a(str3, 9);
        }
        Map<String, String> map = this.f4260k;
        if (map != null) {
            c5838l.m4226a((Map) map, 10);
        }
        String str4 = this.f4261l;
        if (str4 != null) {
            c5838l.m4224a(str4, 11);
        }
        c5838l.m4221a(this.f4262m, 12);
        String str5 = this.f4263n;
        if (str5 != null) {
            c5838l.m4224a(str5, 13);
        }
        String str6 = this.f4264o;
        if (str6 != null) {
            c5838l.m4224a(str6, 14);
        }
        String str7 = this.f4265p;
        if (str7 != null) {
            c5838l.m4224a(str7, 15);
        }
        c5838l.m4221a(this.f4266q, 16);
        String str8 = this.f4267r;
        if (str8 != null) {
            c5838l.m4224a(str8, 17);
        }
        String str9 = this.f4268s;
        if (str9 != null) {
            c5838l.m4224a(str9, 18);
        }
        String str10 = this.f4269t;
        if (str10 != null) {
            c5838l.m4224a(str10, 19);
        }
        String str11 = this.f4270u;
        if (str11 != null) {
            c5838l.m4224a(str11, 20);
        }
        String str12 = this.f4271v;
        if (str12 != null) {
            c5838l.m4224a(str12, 21);
        }
        String str13 = this.f4272w;
        if (str13 != null) {
            c5838l.m4224a(str13, 22);
        }
        String str14 = this.f4273x;
        if (str14 != null) {
            c5838l.m4224a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4250a = c5837k.m4196a(this.f4250a, 0, true);
        this.f4251b = c5837k.m4205b(1, true);
        this.f4252c = c5837k.m4205b(2, true);
        this.f4253d = c5837k.m4205b(3, true);
        this.f4254e = c5837k.m4205b(4, false);
        this.f4255f = c5837k.m4205b(5, true);
        this.f4256g = c5837k.m4196a(this.f4256g, 6, true);
        this.f4257h = c5837k.m4206c(7, true);
        this.f4258i = c5837k.m4205b(8, false);
        this.f4259j = c5837k.m4205b(9, false);
        this.f4260k = (Map) c5837k.m4200a((C5837k) f4249z, 10, false);
        this.f4261l = c5837k.m4205b(11, false);
        this.f4262m = c5837k.m4198a(this.f4262m, 12, false);
        this.f4263n = c5837k.m4205b(13, false);
        this.f4264o = c5837k.m4205b(14, false);
        this.f4265p = c5837k.m4205b(15, false);
        this.f4266q = c5837k.m4198a(this.f4266q, 16, false);
        this.f4267r = c5837k.m4205b(17, false);
        this.f4268s = c5837k.m4205b(18, false);
        this.f4269t = c5837k.m4205b(19, false);
        this.f4270u = c5837k.m4205b(20, false);
        this.f4271v = c5837k.m4205b(21, false);
        this.f4272w = c5837k.m4205b(22, false);
        this.f4273x = c5837k.m4205b(23, false);
    }
}
