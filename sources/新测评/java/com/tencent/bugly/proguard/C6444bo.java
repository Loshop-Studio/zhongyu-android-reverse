package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes4.dex */
public final class C6444bo extends AbstractC6462m {

    /* renamed from: A */
    static ArrayList<C6443bn> f5496A;

    /* renamed from: B */
    static Map<String, String> f5497B;

    /* renamed from: C */
    static Map<String, String> f5498C;

    /* renamed from: v */
    static Map<String, String> f5499v;

    /* renamed from: w */
    static C6442bm f5500w;

    /* renamed from: x */
    static C6441bl f5501x;

    /* renamed from: y */
    static ArrayList<C6441bl> f5502y;

    /* renamed from: z */
    static ArrayList<C6441bl> f5503z;

    /* renamed from: a */
    public String f5504a = "";

    /* renamed from: b */
    public long f5505b = 0;

    /* renamed from: c */
    public String f5506c = "";

    /* renamed from: d */
    public String f5507d = "";

    /* renamed from: e */
    public String f5508e = "";

    /* renamed from: f */
    public String f5509f = "";

    /* renamed from: g */
    public String f5510g = "";

    /* renamed from: h */
    public Map<String, String> f5511h = null;

    /* renamed from: i */
    public String f5512i = "";

    /* renamed from: j */
    public C6442bm f5513j = null;

    /* renamed from: k */
    public int f5514k = 0;

    /* renamed from: l */
    public String f5515l = "";

    /* renamed from: m */
    public String f5516m = "";

    /* renamed from: n */
    public C6441bl f5517n = null;

    /* renamed from: o */
    public ArrayList<C6441bl> f5518o = null;

    /* renamed from: p */
    public ArrayList<C6441bl> f5519p = null;

    /* renamed from: q */
    public ArrayList<C6443bn> f5520q = null;

    /* renamed from: r */
    public Map<String, String> f5521r = null;

    /* renamed from: s */
    public Map<String, String> f5522s = null;

    /* renamed from: t */
    public String f5523t = "";

    /* renamed from: u */
    public boolean f5524u = true;

    static {
        HashMap map = new HashMap();
        f5499v = map;
        map.put("", "");
        f5500w = new C6442bm();
        f5501x = new C6441bl();
        f5502y = new ArrayList<>();
        f5502y.add(new C6441bl());
        f5503z = new ArrayList<>();
        f5503z.add(new C6441bl());
        f5496A = new ArrayList<>();
        f5496A.add(new C6443bn());
        HashMap map2 = new HashMap();
        f5497B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f5498C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5219a(this.f5504a, 0);
        c6461l.m5216a(this.f5505b, 1);
        c6461l.m5219a(this.f5506c, 2);
        String str = this.f5507d;
        if (str != null) {
            c6461l.m5219a(str, 3);
        }
        String str2 = this.f5508e;
        if (str2 != null) {
            c6461l.m5219a(str2, 4);
        }
        String str3 = this.f5509f;
        if (str3 != null) {
            c6461l.m5219a(str3, 5);
        }
        String str4 = this.f5510g;
        if (str4 != null) {
            c6461l.m5219a(str4, 6);
        }
        Map<String, String> map = this.f5511h;
        if (map != null) {
            c6461l.m5221a((Map) map, 7);
        }
        String str5 = this.f5512i;
        if (str5 != null) {
            c6461l.m5219a(str5, 8);
        }
        C6442bm c6442bm = this.f5513j;
        if (c6442bm != null) {
            c6461l.m5217a((AbstractC6462m) c6442bm, 9);
        }
        c6461l.m5215a(this.f5514k, 10);
        String str6 = this.f5515l;
        if (str6 != null) {
            c6461l.m5219a(str6, 11);
        }
        String str7 = this.f5516m;
        if (str7 != null) {
            c6461l.m5219a(str7, 12);
        }
        C6441bl c6441bl = this.f5517n;
        if (c6441bl != null) {
            c6461l.m5217a((AbstractC6462m) c6441bl, 13);
        }
        ArrayList<C6441bl> arrayList = this.f5518o;
        if (arrayList != null) {
            c6461l.m5220a((Collection) arrayList, 14);
        }
        ArrayList<C6441bl> arrayList2 = this.f5519p;
        if (arrayList2 != null) {
            c6461l.m5220a((Collection) arrayList2, 15);
        }
        ArrayList<C6443bn> arrayList3 = this.f5520q;
        if (arrayList3 != null) {
            c6461l.m5220a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f5521r;
        if (map2 != null) {
            c6461l.m5221a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f5522s;
        if (map3 != null) {
            c6461l.m5221a((Map) map3, 18);
        }
        String str8 = this.f5523t;
        if (str8 != null) {
            c6461l.m5219a(str8, 19);
        }
        c6461l.m5223a(this.f5524u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5504a = c6460k.m5200b(0, true);
        this.f5505b = c6460k.m5193a(this.f5505b, 1, true);
        this.f5506c = c6460k.m5200b(2, true);
        this.f5507d = c6460k.m5200b(3, false);
        this.f5508e = c6460k.m5200b(4, false);
        this.f5509f = c6460k.m5200b(5, false);
        this.f5510g = c6460k.m5200b(6, false);
        this.f5511h = (Map) c6460k.m5195a((C6460k) f5499v, 7, false);
        this.f5512i = c6460k.m5200b(8, false);
        this.f5513j = (C6442bm) c6460k.m5194a((AbstractC6462m) f5500w, 9, false);
        this.f5514k = c6460k.m5191a(this.f5514k, 10, false);
        this.f5515l = c6460k.m5200b(11, false);
        this.f5516m = c6460k.m5200b(12, false);
        this.f5517n = (C6441bl) c6460k.m5194a((AbstractC6462m) f5501x, 13, false);
        this.f5518o = (ArrayList) c6460k.m5195a((C6460k) f5502y, 14, false);
        this.f5519p = (ArrayList) c6460k.m5195a((C6460k) f5503z, 15, false);
        this.f5520q = (ArrayList) c6460k.m5195a((C6460k) f5496A, 16, false);
        this.f5521r = (Map) c6460k.m5195a((C6460k) f5497B, 17, false);
        this.f5522s = (Map) c6460k.m5195a((C6460k) f5498C, 18, false);
        this.f5523t = c6460k.m5200b(19, false);
        this.f5524u = c6460k.m5199a(20, false);
    }
}
