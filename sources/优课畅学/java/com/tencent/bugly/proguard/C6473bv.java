package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes4.dex */
public final class C6473bv extends AbstractC6484m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C6472bu> f4932f;

    /* renamed from: g */
    static Map<String, String> f4933g;

    /* renamed from: a */
    public byte f4934a = 0;

    /* renamed from: b */
    public String f4935b = "";

    /* renamed from: c */
    public String f4936c = "";

    /* renamed from: d */
    public ArrayList<C6472bu> f4937d = null;

    /* renamed from: e */
    public Map<String, String> f4938e = null;

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4574a(this.f4934a, 0);
        String str = this.f4935b;
        if (str != null) {
            c6483l.m4579a(str, 1);
        }
        String str2 = this.f4936c;
        if (str2 != null) {
            c6483l.m4579a(str2, 2);
        }
        ArrayList<C6472bu> arrayList = this.f4937d;
        if (arrayList != null) {
            c6483l.m4580a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f4938e;
        if (map != null) {
            c6483l.m4581a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4934a = c6482k.m4550a(this.f4934a, 0, true);
        this.f4935b = c6482k.m4560b(1, false);
        this.f4936c = c6482k.m4560b(2, false);
        if (f4932f == null) {
            f4932f = new ArrayList<>();
            f4932f.add(new C6472bu());
        }
        this.f4937d = (ArrayList) c6482k.m4555a((C6482k) f4932f, 3, false);
        if (f4933g == null) {
            HashMap map = new HashMap();
            f4933g = map;
            map.put("", "");
        }
        this.f4938e = (Map) c6482k.m4555a((C6482k) f4933g, 4, false);
    }
}
