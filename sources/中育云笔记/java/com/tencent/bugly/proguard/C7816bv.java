package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes5.dex */
public final class C7816bv extends AbstractC7827m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C7815bu> f14031f;

    /* renamed from: g */
    static Map<String, String> f14032g;

    /* renamed from: a */
    public byte f14033a = 0;

    /* renamed from: b */
    public String f14034b = "";

    /* renamed from: c */
    public String f14035c = "";

    /* renamed from: d */
    public ArrayList<C7815bu> f14036d = null;

    /* renamed from: e */
    public Map<String, String> f14037e = null;

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10904a(this.f14033a, 0);
        String str = this.f14034b;
        if (str != null) {
            c7826l.m10909a(str, 1);
        }
        String str2 = this.f14035c;
        if (str2 != null) {
            c7826l.m10909a(str2, 2);
        }
        ArrayList<C7815bu> arrayList = this.f14036d;
        if (arrayList != null) {
            c7826l.m10910a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f14037e;
        if (map != null) {
            c7826l.m10911a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f14033a = c7825k.m10880a(this.f14033a, 0, true);
        this.f14034b = c7825k.m10890b(1, false);
        this.f14035c = c7825k.m10890b(2, false);
        if (f14031f == null) {
            f14031f = new ArrayList<>();
            f14031f.add(new C7815bu());
        }
        this.f14036d = (ArrayList) c7825k.m10885a((C7825k) f14031f, 3, false);
        if (f14032g == null) {
            HashMap map = new HashMap();
            f14032g = map;
            map.put("", "");
        }
        this.f14037e = (Map) c7825k.m10885a((C7825k) f14032g, 4, false);
    }
}
