package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes3.dex */
public final class C5828bv extends AbstractC5839m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C5827bu> f4310f;

    /* renamed from: g */
    static Map<String, String> f4311g;

    /* renamed from: a */
    public byte f4312a = 0;

    /* renamed from: b */
    public String f4313b = "";

    /* renamed from: c */
    public String f4314c = "";

    /* renamed from: d */
    public ArrayList<C5827bu> f4315d = null;

    /* renamed from: e */
    public Map<String, String> f4316e = null;

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4219a(this.f4312a, 0);
        String str = this.f4313b;
        if (str != null) {
            c5838l.m4224a(str, 1);
        }
        String str2 = this.f4314c;
        if (str2 != null) {
            c5838l.m4224a(str2, 2);
        }
        ArrayList<C5827bu> arrayList = this.f4315d;
        if (arrayList != null) {
            c5838l.m4225a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f4316e;
        if (map != null) {
            c5838l.m4226a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4312a = c5837k.m4195a(this.f4312a, 0, true);
        this.f4313b = c5837k.m4205b(1, false);
        this.f4314c = c5837k.m4205b(2, false);
        if (f4310f == null) {
            f4310f = new ArrayList<>();
            f4310f.add(new C5827bu());
        }
        this.f4315d = (ArrayList) c5837k.m4200a((C5837k) f4310f, 3, false);
        if (f4311g == null) {
            HashMap map = new HashMap();
            f4311g = map;
            map.put("", "");
        }
        this.f4316e = (Map) c5837k.m4200a((C5837k) f4311g, 4, false);
    }
}
