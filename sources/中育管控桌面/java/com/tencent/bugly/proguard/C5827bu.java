package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes3.dex */
public final class C5827bu extends AbstractC5839m {

    /* renamed from: i */
    static Map<String, String> f4301i;

    /* renamed from: a */
    public long f4302a = 0;

    /* renamed from: b */
    public byte f4303b = 0;

    /* renamed from: c */
    public String f4304c = "";

    /* renamed from: d */
    public String f4305d = "";

    /* renamed from: e */
    public String f4306e = "";

    /* renamed from: f */
    public Map<String, String> f4307f = null;

    /* renamed from: g */
    public String f4308g = "";

    /* renamed from: h */
    public boolean f4309h = true;

    static {
        HashMap map = new HashMap();
        f4301i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4221a(this.f4302a, 0);
        c5838l.m4219a(this.f4303b, 1);
        String str = this.f4304c;
        if (str != null) {
            c5838l.m4224a(str, 2);
        }
        String str2 = this.f4305d;
        if (str2 != null) {
            c5838l.m4224a(str2, 3);
        }
        String str3 = this.f4306e;
        if (str3 != null) {
            c5838l.m4224a(str3, 4);
        }
        Map<String, String> map = this.f4307f;
        if (map != null) {
            c5838l.m4226a((Map) map, 5);
        }
        String str4 = this.f4308g;
        if (str4 != null) {
            c5838l.m4224a(str4, 6);
        }
        c5838l.m4228a(this.f4309h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4302a = c5837k.m4198a(this.f4302a, 0, true);
        this.f4303b = c5837k.m4195a(this.f4303b, 1, true);
        this.f4304c = c5837k.m4205b(2, false);
        this.f4305d = c5837k.m4205b(3, false);
        this.f4306e = c5837k.m4205b(4, false);
        this.f4307f = (Map) c5837k.m4200a((C5837k) f4301i, 5, false);
        this.f4308g = c5837k.m4205b(6, false);
        this.f4309h = c5837k.m4204a(7, false);
    }
}
