package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes3.dex */
public final class C5821bo extends AbstractC5839m {

    /* renamed from: A */
    static ArrayList<C5820bn> f4217A;

    /* renamed from: B */
    static Map<String, String> f4218B;

    /* renamed from: C */
    static Map<String, String> f4219C;

    /* renamed from: v */
    static Map<String, String> f4220v;

    /* renamed from: w */
    static C5819bm f4221w;

    /* renamed from: x */
    static C5818bl f4222x;

    /* renamed from: y */
    static ArrayList<C5818bl> f4223y;

    /* renamed from: z */
    static ArrayList<C5818bl> f4224z;

    /* renamed from: a */
    public String f4225a = "";

    /* renamed from: b */
    public long f4226b = 0;

    /* renamed from: c */
    public String f4227c = "";

    /* renamed from: d */
    public String f4228d = "";

    /* renamed from: e */
    public String f4229e = "";

    /* renamed from: f */
    public String f4230f = "";

    /* renamed from: g */
    public String f4231g = "";

    /* renamed from: h */
    public Map<String, String> f4232h = null;

    /* renamed from: i */
    public String f4233i = "";

    /* renamed from: j */
    public C5819bm f4234j = null;

    /* renamed from: k */
    public int f4235k = 0;

    /* renamed from: l */
    public String f4236l = "";

    /* renamed from: m */
    public String f4237m = "";

    /* renamed from: n */
    public C5818bl f4238n = null;

    /* renamed from: o */
    public ArrayList<C5818bl> f4239o = null;

    /* renamed from: p */
    public ArrayList<C5818bl> f4240p = null;

    /* renamed from: q */
    public ArrayList<C5820bn> f4241q = null;

    /* renamed from: r */
    public Map<String, String> f4242r = null;

    /* renamed from: s */
    public Map<String, String> f4243s = null;

    /* renamed from: t */
    public String f4244t = "";

    /* renamed from: u */
    public boolean f4245u = true;

    static {
        HashMap map = new HashMap();
        f4220v = map;
        map.put("", "");
        f4221w = new C5819bm();
        f4222x = new C5818bl();
        f4223y = new ArrayList<>();
        f4223y.add(new C5818bl());
        f4224z = new ArrayList<>();
        f4224z.add(new C5818bl());
        f4217A = new ArrayList<>();
        f4217A.add(new C5820bn());
        HashMap map2 = new HashMap();
        f4218B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f4219C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4224a(this.f4225a, 0);
        c5838l.m4221a(this.f4226b, 1);
        c5838l.m4224a(this.f4227c, 2);
        String str = this.f4228d;
        if (str != null) {
            c5838l.m4224a(str, 3);
        }
        String str2 = this.f4229e;
        if (str2 != null) {
            c5838l.m4224a(str2, 4);
        }
        String str3 = this.f4230f;
        if (str3 != null) {
            c5838l.m4224a(str3, 5);
        }
        String str4 = this.f4231g;
        if (str4 != null) {
            c5838l.m4224a(str4, 6);
        }
        Map<String, String> map = this.f4232h;
        if (map != null) {
            c5838l.m4226a((Map) map, 7);
        }
        String str5 = this.f4233i;
        if (str5 != null) {
            c5838l.m4224a(str5, 8);
        }
        C5819bm c5819bm = this.f4234j;
        if (c5819bm != null) {
            c5838l.m4222a((AbstractC5839m) c5819bm, 9);
        }
        c5838l.m4220a(this.f4235k, 10);
        String str6 = this.f4236l;
        if (str6 != null) {
            c5838l.m4224a(str6, 11);
        }
        String str7 = this.f4237m;
        if (str7 != null) {
            c5838l.m4224a(str7, 12);
        }
        C5818bl c5818bl = this.f4238n;
        if (c5818bl != null) {
            c5838l.m4222a((AbstractC5839m) c5818bl, 13);
        }
        ArrayList<C5818bl> arrayList = this.f4239o;
        if (arrayList != null) {
            c5838l.m4225a((Collection) arrayList, 14);
        }
        ArrayList<C5818bl> arrayList2 = this.f4240p;
        if (arrayList2 != null) {
            c5838l.m4225a((Collection) arrayList2, 15);
        }
        ArrayList<C5820bn> arrayList3 = this.f4241q;
        if (arrayList3 != null) {
            c5838l.m4225a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f4242r;
        if (map2 != null) {
            c5838l.m4226a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f4243s;
        if (map3 != null) {
            c5838l.m4226a((Map) map3, 18);
        }
        String str8 = this.f4244t;
        if (str8 != null) {
            c5838l.m4224a(str8, 19);
        }
        c5838l.m4228a(this.f4245u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4225a = c5837k.m4205b(0, true);
        this.f4226b = c5837k.m4198a(this.f4226b, 1, true);
        this.f4227c = c5837k.m4205b(2, true);
        this.f4228d = c5837k.m4205b(3, false);
        this.f4229e = c5837k.m4205b(4, false);
        this.f4230f = c5837k.m4205b(5, false);
        this.f4231g = c5837k.m4205b(6, false);
        this.f4232h = (Map) c5837k.m4200a((C5837k) f4220v, 7, false);
        this.f4233i = c5837k.m4205b(8, false);
        this.f4234j = (C5819bm) c5837k.m4199a((AbstractC5839m) f4221w, 9, false);
        this.f4235k = c5837k.m4196a(this.f4235k, 10, false);
        this.f4236l = c5837k.m4205b(11, false);
        this.f4237m = c5837k.m4205b(12, false);
        this.f4238n = (C5818bl) c5837k.m4199a((AbstractC5839m) f4222x, 13, false);
        this.f4239o = (ArrayList) c5837k.m4200a((C5837k) f4223y, 14, false);
        this.f4240p = (ArrayList) c5837k.m4200a((C5837k) f4224z, 15, false);
        this.f4241q = (ArrayList) c5837k.m4200a((C5837k) f4217A, 16, false);
        this.f4242r = (Map) c5837k.m4200a((C5837k) f4218B, 17, false);
        this.f4243s = (Map) c5837k.m4200a((C5837k) f4219C, 18, false);
        this.f4244t = c5837k.m4205b(19, false);
        this.f4245u = c5837k.m4204a(20, false);
    }
}
