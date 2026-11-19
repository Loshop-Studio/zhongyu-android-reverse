package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes5.dex */
public final class C7809bo extends AbstractC7827m {

    /* renamed from: A */
    static ArrayList<C7808bn> f13938A;

    /* renamed from: B */
    static Map<String, String> f13939B;

    /* renamed from: C */
    static Map<String, String> f13940C;

    /* renamed from: v */
    static Map<String, String> f13941v;

    /* renamed from: w */
    static C7807bm f13942w;

    /* renamed from: x */
    static C7806bl f13943x;

    /* renamed from: y */
    static ArrayList<C7806bl> f13944y;

    /* renamed from: z */
    static ArrayList<C7806bl> f13945z;

    /* renamed from: a */
    public String f13946a = "";

    /* renamed from: b */
    public long f13947b = 0;

    /* renamed from: c */
    public String f13948c = "";

    /* renamed from: d */
    public String f13949d = "";

    /* renamed from: e */
    public String f13950e = "";

    /* renamed from: f */
    public String f13951f = "";

    /* renamed from: g */
    public String f13952g = "";

    /* renamed from: h */
    public Map<String, String> f13953h = null;

    /* renamed from: i */
    public String f13954i = "";

    /* renamed from: j */
    public C7807bm f13955j = null;

    /* renamed from: k */
    public int f13956k = 0;

    /* renamed from: l */
    public String f13957l = "";

    /* renamed from: m */
    public String f13958m = "";

    /* renamed from: n */
    public C7806bl f13959n = null;

    /* renamed from: o */
    public ArrayList<C7806bl> f13960o = null;

    /* renamed from: p */
    public ArrayList<C7806bl> f13961p = null;

    /* renamed from: q */
    public ArrayList<C7808bn> f13962q = null;

    /* renamed from: r */
    public Map<String, String> f13963r = null;

    /* renamed from: s */
    public Map<String, String> f13964s = null;

    /* renamed from: t */
    public String f13965t = "";

    /* renamed from: u */
    public boolean f13966u = true;

    static {
        HashMap map = new HashMap();
        f13941v = map;
        map.put("", "");
        f13942w = new C7807bm();
        f13943x = new C7806bl();
        f13944y = new ArrayList<>();
        f13944y.add(new C7806bl());
        f13945z = new ArrayList<>();
        f13945z.add(new C7806bl());
        f13938A = new ArrayList<>();
        f13938A.add(new C7808bn());
        HashMap map2 = new HashMap();
        f13939B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f13940C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10909a(this.f13946a, 0);
        c7826l.m10906a(this.f13947b, 1);
        c7826l.m10909a(this.f13948c, 2);
        String str = this.f13949d;
        if (str != null) {
            c7826l.m10909a(str, 3);
        }
        String str2 = this.f13950e;
        if (str2 != null) {
            c7826l.m10909a(str2, 4);
        }
        String str3 = this.f13951f;
        if (str3 != null) {
            c7826l.m10909a(str3, 5);
        }
        String str4 = this.f13952g;
        if (str4 != null) {
            c7826l.m10909a(str4, 6);
        }
        Map<String, String> map = this.f13953h;
        if (map != null) {
            c7826l.m10911a((Map) map, 7);
        }
        String str5 = this.f13954i;
        if (str5 != null) {
            c7826l.m10909a(str5, 8);
        }
        C7807bm c7807bm = this.f13955j;
        if (c7807bm != null) {
            c7826l.m10907a((AbstractC7827m) c7807bm, 9);
        }
        c7826l.m10905a(this.f13956k, 10);
        String str6 = this.f13957l;
        if (str6 != null) {
            c7826l.m10909a(str6, 11);
        }
        String str7 = this.f13958m;
        if (str7 != null) {
            c7826l.m10909a(str7, 12);
        }
        C7806bl c7806bl = this.f13959n;
        if (c7806bl != null) {
            c7826l.m10907a((AbstractC7827m) c7806bl, 13);
        }
        ArrayList<C7806bl> arrayList = this.f13960o;
        if (arrayList != null) {
            c7826l.m10910a((Collection) arrayList, 14);
        }
        ArrayList<C7806bl> arrayList2 = this.f13961p;
        if (arrayList2 != null) {
            c7826l.m10910a((Collection) arrayList2, 15);
        }
        ArrayList<C7808bn> arrayList3 = this.f13962q;
        if (arrayList3 != null) {
            c7826l.m10910a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f13963r;
        if (map2 != null) {
            c7826l.m10911a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f13964s;
        if (map3 != null) {
            c7826l.m10911a((Map) map3, 18);
        }
        String str8 = this.f13965t;
        if (str8 != null) {
            c7826l.m10909a(str8, 19);
        }
        c7826l.m10913a(this.f13966u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13946a = c7825k.m10890b(0, true);
        this.f13947b = c7825k.m10883a(this.f13947b, 1, true);
        this.f13948c = c7825k.m10890b(2, true);
        this.f13949d = c7825k.m10890b(3, false);
        this.f13950e = c7825k.m10890b(4, false);
        this.f13951f = c7825k.m10890b(5, false);
        this.f13952g = c7825k.m10890b(6, false);
        this.f13953h = (Map) c7825k.m10885a((C7825k) f13941v, 7, false);
        this.f13954i = c7825k.m10890b(8, false);
        this.f13955j = (C7807bm) c7825k.m10884a((AbstractC7827m) f13942w, 9, false);
        this.f13956k = c7825k.m10881a(this.f13956k, 10, false);
        this.f13957l = c7825k.m10890b(11, false);
        this.f13958m = c7825k.m10890b(12, false);
        this.f13959n = (C7806bl) c7825k.m10884a((AbstractC7827m) f13943x, 13, false);
        this.f13960o = (ArrayList) c7825k.m10885a((C7825k) f13944y, 14, false);
        this.f13961p = (ArrayList) c7825k.m10885a((C7825k) f13945z, 15, false);
        this.f13962q = (ArrayList) c7825k.m10885a((C7825k) f13938A, 16, false);
        this.f13963r = (Map) c7825k.m10885a((C7825k) f13939B, 17, false);
        this.f13964s = (Map) c7825k.m10885a((C7825k) f13940C, 18, false);
        this.f13965t = c7825k.m10890b(19, false);
        this.f13966u = c7825k.m10889a(20, false);
    }
}
