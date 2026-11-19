package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes4.dex */
public final class C6450bu extends AbstractC6462m {

    /* renamed from: i */
    static Map<String, String> f5580i;

    /* renamed from: a */
    public long f5581a = 0;

    /* renamed from: b */
    public byte f5582b = 0;

    /* renamed from: c */
    public String f5583c = "";

    /* renamed from: d */
    public String f5584d = "";

    /* renamed from: e */
    public String f5585e = "";

    /* renamed from: f */
    public Map<String, String> f5586f = null;

    /* renamed from: g */
    public String f5587g = "";

    /* renamed from: h */
    public boolean f5588h = true;

    static {
        HashMap map = new HashMap();
        f5580i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5216a(this.f5581a, 0);
        c6461l.m5214a(this.f5582b, 1);
        String str = this.f5583c;
        if (str != null) {
            c6461l.m5219a(str, 2);
        }
        String str2 = this.f5584d;
        if (str2 != null) {
            c6461l.m5219a(str2, 3);
        }
        String str3 = this.f5585e;
        if (str3 != null) {
            c6461l.m5219a(str3, 4);
        }
        Map<String, String> map = this.f5586f;
        if (map != null) {
            c6461l.m5221a((Map) map, 5);
        }
        String str4 = this.f5587g;
        if (str4 != null) {
            c6461l.m5219a(str4, 6);
        }
        c6461l.m5223a(this.f5588h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5581a = c6460k.m5193a(this.f5581a, 0, true);
        this.f5582b = c6460k.m5190a(this.f5582b, 1, true);
        this.f5583c = c6460k.m5200b(2, false);
        this.f5584d = c6460k.m5200b(3, false);
        this.f5585e = c6460k.m5200b(4, false);
        this.f5586f = (Map) c6460k.m5195a((C6460k) f5580i, 5, false);
        this.f5587g = c6460k.m5200b(6, false);
        this.f5588h = c6460k.m5199a(7, false);
    }
}
