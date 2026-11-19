package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes4.dex */
public final class C6451bv extends AbstractC6462m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C6450bu> f5589f;

    /* renamed from: g */
    static Map<String, String> f5590g;

    /* renamed from: a */
    public byte f5591a = 0;

    /* renamed from: b */
    public String f5592b = "";

    /* renamed from: c */
    public String f5593c = "";

    /* renamed from: d */
    public ArrayList<C6450bu> f5594d = null;

    /* renamed from: e */
    public Map<String, String> f5595e = null;

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5214a(this.f5591a, 0);
        String str = this.f5592b;
        if (str != null) {
            c6461l.m5219a(str, 1);
        }
        String str2 = this.f5593c;
        if (str2 != null) {
            c6461l.m5219a(str2, 2);
        }
        ArrayList<C6450bu> arrayList = this.f5594d;
        if (arrayList != null) {
            c6461l.m5220a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f5595e;
        if (map != null) {
            c6461l.m5221a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5591a = c6460k.m5190a(this.f5591a, 0, true);
        this.f5592b = c6460k.m5200b(1, false);
        this.f5593c = c6460k.m5200b(2, false);
        if (f5589f == null) {
            f5589f = new ArrayList<>();
            f5589f.add(new C6450bu());
        }
        this.f5594d = (ArrayList) c6460k.m5195a((C6460k) f5589f, 3, false);
        if (f5590g == null) {
            HashMap map = new HashMap();
            f5590g = map;
            map.put("", "");
        }
        this.f5595e = (Map) c6460k.m5195a((C6460k) f5590g, 4, false);
    }
}
