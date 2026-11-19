package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bo */
/* loaded from: classes3.dex */
public final class C4087bo extends AbstractC4123m {

    /* renamed from: A */
    static ArrayList<C4086bn> f3698A;

    /* renamed from: B */
    static Map<String, String> f3699B;

    /* renamed from: C */
    static Map<String, String> f3700C;

    /* renamed from: v */
    static Map<String, String> f3701v;

    /* renamed from: w */
    static C4085bm f3702w;

    /* renamed from: x */
    static C4084bl f3703x;

    /* renamed from: y */
    static ArrayList<C4084bl> f3704y;

    /* renamed from: z */
    static ArrayList<C4084bl> f3705z;

    /* renamed from: a */
    public String f3706a = "";

    /* renamed from: b */
    public long f3707b = 0;

    /* renamed from: c */
    public String f3708c = "";

    /* renamed from: d */
    public String f3709d = "";

    /* renamed from: e */
    public String f3710e = "";

    /* renamed from: f */
    public String f3711f = "";

    /* renamed from: g */
    public String f3712g = "";

    /* renamed from: h */
    public Map<String, String> f3713h = null;

    /* renamed from: i */
    public String f3714i = "";

    /* renamed from: j */
    public C4085bm f3715j = null;

    /* renamed from: k */
    public int f3716k = 0;

    /* renamed from: l */
    public String f3717l = "";

    /* renamed from: m */
    public String f3718m = "";

    /* renamed from: n */
    public C4084bl f3719n = null;

    /* renamed from: o */
    public ArrayList<C4084bl> f3720o = null;

    /* renamed from: p */
    public ArrayList<C4084bl> f3721p = null;

    /* renamed from: q */
    public ArrayList<C4086bn> f3722q = null;

    /* renamed from: r */
    public Map<String, String> f3723r = null;

    /* renamed from: s */
    public Map<String, String> f3724s = null;

    /* renamed from: t */
    public String f3725t = "";

    /* renamed from: u */
    public boolean f3726u = true;

    static {
        HashMap map = new HashMap();
        f3701v = map;
        map.put("", "");
        f3702w = new C4085bm();
        f3703x = new C4084bl();
        f3704y = new ArrayList<>();
        f3704y.add(new C4084bl());
        f3705z = new ArrayList<>();
        f3705z.add(new C4084bl());
        f3698A = new ArrayList<>();
        f3698A.add(new C4086bn());
        HashMap map2 = new HashMap();
        f3699B = map2;
        map2.put("", "");
        HashMap map3 = new HashMap();
        f3700C = map3;
        map3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3315a(this.f3706a, 0);
        c4121l.m3312a(this.f3707b, 1);
        c4121l.m3315a(this.f3708c, 2);
        String str = this.f3709d;
        if (str != null) {
            c4121l.m3315a(str, 3);
        }
        String str2 = this.f3710e;
        if (str2 != null) {
            c4121l.m3315a(str2, 4);
        }
        String str3 = this.f3711f;
        if (str3 != null) {
            c4121l.m3315a(str3, 5);
        }
        String str4 = this.f3712g;
        if (str4 != null) {
            c4121l.m3315a(str4, 6);
        }
        Map<String, String> map = this.f3713h;
        if (map != null) {
            c4121l.m3317a((Map) map, 7);
        }
        String str5 = this.f3714i;
        if (str5 != null) {
            c4121l.m3315a(str5, 8);
        }
        C4085bm c4085bm = this.f3715j;
        if (c4085bm != null) {
            c4121l.m3313a((AbstractC4123m) c4085bm, 9);
        }
        c4121l.m3311a(this.f3716k, 10);
        String str6 = this.f3717l;
        if (str6 != null) {
            c4121l.m3315a(str6, 11);
        }
        String str7 = this.f3718m;
        if (str7 != null) {
            c4121l.m3315a(str7, 12);
        }
        C4084bl c4084bl = this.f3719n;
        if (c4084bl != null) {
            c4121l.m3313a((AbstractC4123m) c4084bl, 13);
        }
        ArrayList<C4084bl> arrayList = this.f3720o;
        if (arrayList != null) {
            c4121l.m3316a((Collection) arrayList, 14);
        }
        ArrayList<C4084bl> arrayList2 = this.f3721p;
        if (arrayList2 != null) {
            c4121l.m3316a((Collection) arrayList2, 15);
        }
        ArrayList<C4086bn> arrayList3 = this.f3722q;
        if (arrayList3 != null) {
            c4121l.m3316a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f3723r;
        if (map2 != null) {
            c4121l.m3317a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f3724s;
        if (map3 != null) {
            c4121l.m3317a((Map) map3, 18);
        }
        String str8 = this.f3725t;
        if (str8 != null) {
            c4121l.m3315a(str8, 19);
        }
        c4121l.m3319a(this.f3726u, 20);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3706a = c4119k.m3296b(0, true);
        this.f3707b = c4119k.m3289a(this.f3707b, 1, true);
        this.f3708c = c4119k.m3296b(2, true);
        this.f3709d = c4119k.m3296b(3, false);
        this.f3710e = c4119k.m3296b(4, false);
        this.f3711f = c4119k.m3296b(5, false);
        this.f3712g = c4119k.m3296b(6, false);
        this.f3713h = (Map) c4119k.m3291a((C4119k) f3701v, 7, false);
        this.f3714i = c4119k.m3296b(8, false);
        this.f3715j = (C4085bm) c4119k.m3290a((AbstractC4123m) f3702w, 9, false);
        this.f3716k = c4119k.m3287a(this.f3716k, 10, false);
        this.f3717l = c4119k.m3296b(11, false);
        this.f3718m = c4119k.m3296b(12, false);
        this.f3719n = (C4084bl) c4119k.m3290a((AbstractC4123m) f3703x, 13, false);
        this.f3720o = (ArrayList) c4119k.m3291a((C4119k) f3704y, 14, false);
        this.f3721p = (ArrayList) c4119k.m3291a((C4119k) f3705z, 15, false);
        this.f3722q = (ArrayList) c4119k.m3291a((C4119k) f3698A, 16, false);
        this.f3723r = (Map) c4119k.m3291a((C4119k) f3699B, 17, false);
        this.f3724s = (Map) c4119k.m3291a((C4119k) f3700C, 18, false);
        this.f3725t = c4119k.m3296b(19, false);
        this.f3726u = c4119k.m3295a(20, false);
    }
}
