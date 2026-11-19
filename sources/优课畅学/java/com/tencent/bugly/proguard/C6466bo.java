package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes4.dex */
public final class C6466bo extends AbstractC6484m {

    /* renamed from: A */
    static ArrayList<C6465bn> f4839A;

    /* renamed from: B */
    static Map<String, String> f4840B;

    /* renamed from: C */
    static Map<String, String> f4841C;

    /* renamed from: v */
    static Map<String, String> f4842v;

    /* renamed from: w */
    static C6464bm f4843w;

    /* renamed from: x */
    static C6463bl f4844x;

    /* renamed from: y */
    static ArrayList<C6463bl> f4845y;

    /* renamed from: z */
    static ArrayList<C6463bl> f4846z;

    /* renamed from: a */
    public String f4847a = "";

    /* renamed from: b */
    public long f4848b = 0;

    /* renamed from: c */
    public String f4849c = "";

    /* renamed from: d */
    public String f4850d = "";

    /* renamed from: e */
    public String f4851e = "";

    /* renamed from: f */
    public String f4852f = "";

    /* renamed from: g */
    public String f4853g = "";

    /* renamed from: h */
    public Map<String, String> f4854h = null;

    /* renamed from: i */
    public String f4855i = "";

    /* renamed from: j */
    public C6464bm f4856j = null;

    /* renamed from: k */
    public int f4857k = 0;

    /* renamed from: l */
    public String f4858l = "";

    /* renamed from: m */
    public String f4859m = "";

    /* renamed from: n */
    public C6463bl f4860n = null;

    /* renamed from: o */
    public ArrayList<C6463bl> f4861o = null;

    /* renamed from: p */
    public ArrayList<C6463bl> f4862p = null;

    /* renamed from: q */
    public ArrayList<C6465bn> f4863q = null;

    /* renamed from: r */
    public Map<String, String> f4864r = null;

    /* renamed from: s */
    public Map<String, String> f4865s = null;

    /* renamed from: t */
    public String f4866t = "";

    /* renamed from: u */
    public boolean f4867u = true;

    static {
        HashMap map = new HashMap();
        f4842v = map;
        map.put("", "");
        f4843w = new C6464bm();
        f4844x = new C6463bl();
        f4845y = new ArrayList<>();
        f4845y.add(new C6463bl());
        f4846z = new ArrayList<>();
        f4846z.add(new C6463bl());
        f4839A = new ArrayList<>();
        f4839A.add(new C6465bn());
        HashMap map2 = new HashMap();
        f4840B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f4841C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4579a(this.f4847a, 0);
        c6483l.m4576a(this.f4848b, 1);
        c6483l.m4579a(this.f4849c, 2);
        String str = this.f4850d;
        if (str != null) {
            c6483l.m4579a(str, 3);
        }
        String str2 = this.f4851e;
        if (str2 != null) {
            c6483l.m4579a(str2, 4);
        }
        String str3 = this.f4852f;
        if (str3 != null) {
            c6483l.m4579a(str3, 5);
        }
        String str4 = this.f4853g;
        if (str4 != null) {
            c6483l.m4579a(str4, 6);
        }
        Map<String, String> map = this.f4854h;
        if (map != null) {
            c6483l.m4581a((Map) map, 7);
        }
        String str5 = this.f4855i;
        if (str5 != null) {
            c6483l.m4579a(str5, 8);
        }
        C6464bm c6464bm = this.f4856j;
        if (c6464bm != null) {
            c6483l.m4577a((AbstractC6484m) c6464bm, 9);
        }
        c6483l.m4575a(this.f4857k, 10);
        String str6 = this.f4858l;
        if (str6 != null) {
            c6483l.m4579a(str6, 11);
        }
        String str7 = this.f4859m;
        if (str7 != null) {
            c6483l.m4579a(str7, 12);
        }
        C6463bl c6463bl = this.f4860n;
        if (c6463bl != null) {
            c6483l.m4577a((AbstractC6484m) c6463bl, 13);
        }
        ArrayList<C6463bl> arrayList = this.f4861o;
        if (arrayList != null) {
            c6483l.m4580a((Collection) arrayList, 14);
        }
        ArrayList<C6463bl> arrayList2 = this.f4862p;
        if (arrayList2 != null) {
            c6483l.m4580a((Collection) arrayList2, 15);
        }
        ArrayList<C6465bn> arrayList3 = this.f4863q;
        if (arrayList3 != null) {
            c6483l.m4580a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f4864r;
        if (map2 != null) {
            c6483l.m4581a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f4865s;
        if (map3 != null) {
            c6483l.m4581a((Map) map3, 18);
        }
        String str8 = this.f4866t;
        if (str8 != null) {
            c6483l.m4579a(str8, 19);
        }
        c6483l.m4583a(this.f4867u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4847a = c6482k.m4560b(0, true);
        this.f4848b = c6482k.m4553a(this.f4848b, 1, true);
        this.f4849c = c6482k.m4560b(2, true);
        this.f4850d = c6482k.m4560b(3, false);
        this.f4851e = c6482k.m4560b(4, false);
        this.f4852f = c6482k.m4560b(5, false);
        this.f4853g = c6482k.m4560b(6, false);
        this.f4854h = (Map) c6482k.m4555a((C6482k) f4842v, 7, false);
        this.f4855i = c6482k.m4560b(8, false);
        this.f4856j = (C6464bm) c6482k.m4554a((AbstractC6484m) f4843w, 9, false);
        this.f4857k = c6482k.m4551a(this.f4857k, 10, false);
        this.f4858l = c6482k.m4560b(11, false);
        this.f4859m = c6482k.m4560b(12, false);
        this.f4860n = (C6463bl) c6482k.m4554a((AbstractC6484m) f4844x, 13, false);
        this.f4861o = (ArrayList) c6482k.m4555a((C6482k) f4845y, 14, false);
        this.f4862p = (ArrayList) c6482k.m4555a((C6482k) f4846z, 15, false);
        this.f4863q = (ArrayList) c6482k.m4555a((C6482k) f4839A, 16, false);
        this.f4864r = (Map) c6482k.m4555a((C6482k) f4840B, 17, false);
        this.f4865s = (Map) c6482k.m4555a((C6482k) f4841C, 18, false);
        this.f4866t = c6482k.m4560b(19, false);
        this.f4867u = c6482k.m4559a(20, false);
    }
}
