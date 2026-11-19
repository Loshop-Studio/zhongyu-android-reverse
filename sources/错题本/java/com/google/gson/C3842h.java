package com.google.gson;

import com.google.gson.internal.C3847d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p063g1.AbstractC5558f1;
import p063g1.AbstractC5559g;
import p063g1.C5561h;
import p063g1.C5588u0;
import p087j1.AbstractC5737f;
import p087j1.C5736e;

/* renamed from: com.google.gson.h */
/* loaded from: classes2.dex */
public final class C3842h {

    /* renamed from: a */
    public final C3847d f2997a = C3847d.f3027c;

    /* renamed from: b */
    public final LongSerializationPolicy f2998b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c */
    public final FieldNamingPolicy f2999c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d */
    public final HashMap f3000d = new HashMap();

    /* renamed from: e */
    public final ArrayList f3001e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f3002f = new ArrayList();

    /* renamed from: g */
    public boolean f3003g = false;

    /* renamed from: h */
    public final int f3004h;

    /* renamed from: i */
    public final int f3005i;

    /* renamed from: j */
    public boolean f3006j;

    /* renamed from: k */
    public boolean f3007k;

    /* renamed from: l */
    public C3836b f3008l;

    /* renamed from: m */
    public final boolean f3009m;

    /* renamed from: n */
    public final ToNumberPolicy f3010n;

    /* renamed from: o */
    public final ToNumberPolicy f3011o;

    /* renamed from: p */
    public final ArrayDeque f3012p;

    public C3842h() {
        C3836b c3836b = C3841g.f2981m;
        this.f3004h = 2;
        this.f3005i = 2;
        this.f3006j = false;
        this.f3007k = true;
        this.f3008l = C3841g.f2981m;
        this.f3009m = true;
        this.f3010n = C3841g.f2983o;
        this.f3011o = C3841g.f2984p;
        this.f3012p = new ArrayDeque();
    }

    /* renamed from: a */
    public final C3841g m2790a() {
        C5588u0 c5588u0;
        C5588u0 c5588u02;
        ArrayList arrayList = this.f3001e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3002f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z8 = AbstractC5737f.f9072a;
        int i = this.f3004h;
        int i8 = this.f3005i;
        if (i != 2 || i8 != 2) {
            C5561h c5561h = new C5561h(AbstractC5559g.f8637b, i, i8);
            C5588u0 c5588u03 = AbstractC5558f1.f8611a;
            int i9 = 0;
            C5588u0 c5588u04 = new C5588u0(Date.class, c5561h, i9);
            if (z8) {
                C5736e c5736e = AbstractC5737f.f9074c;
                c5736e.getClass();
                c5588u0 = new C5588u0(c5736e.f8638a, new C5561h(c5736e, i, i8), i9);
                C5736e c5736e2 = AbstractC5737f.f9073b;
                c5736e2.getClass();
                c5588u02 = new C5588u0(c5736e2.f8638a, new C5561h(c5736e2, i, i8), i9);
            } else {
                c5588u0 = null;
                c5588u02 = null;
            }
            arrayList3.add(c5588u04);
            if (z8) {
                arrayList3.add(c5588u0);
                arrayList3.add(c5588u02);
            }
        }
        return new C3841g(this.f2997a, this.f2999c, new HashMap(this.f3000d), this.f3003g, this.f3007k, this.f3008l, this.f3006j, this.f3009m, this.f2998b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f3010n, this.f3011o, new ArrayList(this.f3012p));
    }
}
