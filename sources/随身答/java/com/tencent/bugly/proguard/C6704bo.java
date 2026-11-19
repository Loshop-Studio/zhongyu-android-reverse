package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes4.dex */
public final class C6704bo extends AbstractC6722m {

    /* renamed from: A */
    static ArrayList<C6703bn> f6073A;

    /* renamed from: B */
    static Map<String, String> f6074B;

    /* renamed from: C */
    static Map<String, String> f6075C;

    /* renamed from: v */
    static Map<String, String> f6076v;

    /* renamed from: w */
    static C6702bm f6077w;

    /* renamed from: x */
    static C6701bl f6078x;

    /* renamed from: y */
    static ArrayList<C6701bl> f6079y;

    /* renamed from: z */
    static ArrayList<C6701bl> f6080z;

    /* renamed from: a */
    public String f6081a = "";

    /* renamed from: b */
    public long f6082b = 0;

    /* renamed from: c */
    public String f6083c = "";

    /* renamed from: d */
    public String f6084d = "";

    /* renamed from: e */
    public String f6085e = "";

    /* renamed from: f */
    public String f6086f = "";

    /* renamed from: g */
    public String f6087g = "";

    /* renamed from: h */
    public Map<String, String> f6088h = null;

    /* renamed from: i */
    public String f6089i = "";

    /* renamed from: j */
    public C6702bm f6090j = null;

    /* renamed from: k */
    public int f6091k = 0;

    /* renamed from: l */
    public String f6092l = "";

    /* renamed from: m */
    public String f6093m = "";

    /* renamed from: n */
    public C6701bl f6094n = null;

    /* renamed from: o */
    public ArrayList<C6701bl> f6095o = null;

    /* renamed from: p */
    public ArrayList<C6701bl> f6096p = null;

    /* renamed from: q */
    public ArrayList<C6703bn> f6097q = null;

    /* renamed from: r */
    public Map<String, String> f6098r = null;

    /* renamed from: s */
    public Map<String, String> f6099s = null;

    /* renamed from: t */
    public String f6100t = "";

    /* renamed from: u */
    public boolean f6101u = true;

    static {
        HashMap map = new HashMap();
        f6076v = map;
        map.put("", "");
        f6077w = new C6702bm();
        f6078x = new C6701bl();
        f6079y = new ArrayList<>();
        f6079y.add(new C6701bl());
        f6080z = new ArrayList<>();
        f6080z.add(new C6701bl());
        f6073A = new ArrayList<>();
        f6073A.add(new C6703bn());
        HashMap map2 = new HashMap();
        f6074B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f6075C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5398a(this.f6081a, 0);
        c6721l.m5395a(this.f6082b, 1);
        c6721l.m5398a(this.f6083c, 2);
        String str = this.f6084d;
        if (str != null) {
            c6721l.m5398a(str, 3);
        }
        String str2 = this.f6085e;
        if (str2 != null) {
            c6721l.m5398a(str2, 4);
        }
        String str3 = this.f6086f;
        if (str3 != null) {
            c6721l.m5398a(str3, 5);
        }
        String str4 = this.f6087g;
        if (str4 != null) {
            c6721l.m5398a(str4, 6);
        }
        Map<String, String> map = this.f6088h;
        if (map != null) {
            c6721l.m5400a((Map) map, 7);
        }
        String str5 = this.f6089i;
        if (str5 != null) {
            c6721l.m5398a(str5, 8);
        }
        C6702bm c6702bm = this.f6090j;
        if (c6702bm != null) {
            c6721l.m5396a((AbstractC6722m) c6702bm, 9);
        }
        c6721l.m5394a(this.f6091k, 10);
        String str6 = this.f6092l;
        if (str6 != null) {
            c6721l.m5398a(str6, 11);
        }
        String str7 = this.f6093m;
        if (str7 != null) {
            c6721l.m5398a(str7, 12);
        }
        C6701bl c6701bl = this.f6094n;
        if (c6701bl != null) {
            c6721l.m5396a((AbstractC6722m) c6701bl, 13);
        }
        ArrayList<C6701bl> arrayList = this.f6095o;
        if (arrayList != null) {
            c6721l.m5399a((Collection) arrayList, 14);
        }
        ArrayList<C6701bl> arrayList2 = this.f6096p;
        if (arrayList2 != null) {
            c6721l.m5399a((Collection) arrayList2, 15);
        }
        ArrayList<C6703bn> arrayList3 = this.f6097q;
        if (arrayList3 != null) {
            c6721l.m5399a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f6098r;
        if (map2 != null) {
            c6721l.m5400a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f6099s;
        if (map3 != null) {
            c6721l.m5400a((Map) map3, 18);
        }
        String str8 = this.f6100t;
        if (str8 != null) {
            c6721l.m5398a(str8, 19);
        }
        c6721l.m5402a(this.f6101u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6081a = c6720k.m5379b(0, true);
        this.f6082b = c6720k.m5372a(this.f6082b, 1, true);
        this.f6083c = c6720k.m5379b(2, true);
        this.f6084d = c6720k.m5379b(3, false);
        this.f6085e = c6720k.m5379b(4, false);
        this.f6086f = c6720k.m5379b(5, false);
        this.f6087g = c6720k.m5379b(6, false);
        this.f6088h = (Map) c6720k.m5374a((C6720k) f6076v, 7, false);
        this.f6089i = c6720k.m5379b(8, false);
        this.f6090j = (C6702bm) c6720k.m5373a((AbstractC6722m) f6077w, 9, false);
        this.f6091k = c6720k.m5370a(this.f6091k, 10, false);
        this.f6092l = c6720k.m5379b(11, false);
        this.f6093m = c6720k.m5379b(12, false);
        this.f6094n = (C6701bl) c6720k.m5373a((AbstractC6722m) f6078x, 13, false);
        this.f6095o = (ArrayList) c6720k.m5374a((C6720k) f6079y, 14, false);
        this.f6096p = (ArrayList) c6720k.m5374a((C6720k) f6080z, 15, false);
        this.f6097q = (ArrayList) c6720k.m5374a((C6720k) f6073A, 16, false);
        this.f6098r = (Map) c6720k.m5374a((C6720k) f6074B, 17, false);
        this.f6099s = (Map) c6720k.m5374a((C6720k) f6075C, 18, false);
        this.f6100t = c6720k.m5379b(19, false);
        this.f6101u = c6720k.m5378a(20, false);
    }
}
