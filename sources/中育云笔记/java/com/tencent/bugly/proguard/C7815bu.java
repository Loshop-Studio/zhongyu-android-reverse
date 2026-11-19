package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes5.dex */
public final class C7815bu extends AbstractC7827m {

    /* renamed from: i */
    static Map<String, String> f14022i;

    /* renamed from: a */
    public long f14023a = 0;

    /* renamed from: b */
    public byte f14024b = 0;

    /* renamed from: c */
    public String f14025c = "";

    /* renamed from: d */
    public String f14026d = "";

    /* renamed from: e */
    public String f14027e = "";

    /* renamed from: f */
    public Map<String, String> f14028f = null;

    /* renamed from: g */
    public String f14029g = "";

    /* renamed from: h */
    public boolean f14030h = true;

    static {
        HashMap map = new HashMap();
        f14022i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10906a(this.f14023a, 0);
        c7826l.m10904a(this.f14024b, 1);
        String str = this.f14025c;
        if (str != null) {
            c7826l.m10909a(str, 2);
        }
        String str2 = this.f14026d;
        if (str2 != null) {
            c7826l.m10909a(str2, 3);
        }
        String str3 = this.f14027e;
        if (str3 != null) {
            c7826l.m10909a(str3, 4);
        }
        Map<String, String> map = this.f14028f;
        if (map != null) {
            c7826l.m10911a((Map) map, 5);
        }
        String str4 = this.f14029g;
        if (str4 != null) {
            c7826l.m10909a(str4, 6);
        }
        c7826l.m10913a(this.f14030h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f14023a = c7825k.m10883a(this.f14023a, 0, true);
        this.f14024b = c7825k.m10880a(this.f14024b, 1, true);
        this.f14025c = c7825k.m10890b(2, false);
        this.f14026d = c7825k.m10890b(3, false);
        this.f14027e = c7825k.m10890b(4, false);
        this.f14028f = (Map) c7825k.m10885a((C7825k) f14022i, 5, false);
        this.f14029g = c7825k.m10890b(6, false);
        this.f14030h = c7825k.m10889a(7, false);
    }
}
