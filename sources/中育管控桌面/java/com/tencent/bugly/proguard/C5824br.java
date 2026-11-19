package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes3.dex */
public final class C5824br extends AbstractC5839m {

    /* renamed from: i */
    static byte[] f4274i = {0};

    /* renamed from: j */
    static Map<String, String> f4275j;

    /* renamed from: a */
    public byte f4276a = 0;

    /* renamed from: b */
    public int f4277b = 0;

    /* renamed from: c */
    public byte[] f4278c = null;

    /* renamed from: d */
    public String f4279d = "";

    /* renamed from: e */
    public long f4280e = 0;

    /* renamed from: f */
    public String f4281f = "";

    /* renamed from: g */
    public String f4282g = "";

    /* renamed from: h */
    public Map<String, String> f4283h = null;

    static {
        HashMap map = new HashMap();
        f4275j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4219a(this.f4276a, 0);
        c5838l.m4220a(this.f4277b, 1);
        byte[] bArr = this.f4278c;
        if (bArr != null) {
            c5838l.m4229a(bArr, 2);
        }
        String str = this.f4279d;
        if (str != null) {
            c5838l.m4224a(str, 3);
        }
        c5838l.m4221a(this.f4280e, 4);
        String str2 = this.f4281f;
        if (str2 != null) {
            c5838l.m4224a(str2, 5);
        }
        String str3 = this.f4282g;
        if (str3 != null) {
            c5838l.m4224a(str3, 6);
        }
        Map<String, String> map = this.f4283h;
        if (map != null) {
            c5838l.m4226a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4276a = c5837k.m4195a(this.f4276a, 0, true);
        this.f4277b = c5837k.m4196a(this.f4277b, 1, true);
        this.f4278c = c5837k.m4206c(2, false);
        this.f4279d = c5837k.m4205b(3, false);
        this.f4280e = c5837k.m4198a(this.f4280e, 4, false);
        this.f4281f = c5837k.m4205b(5, false);
        this.f4282g = c5837k.m4205b(6, false);
        this.f4283h = (Map) c5837k.m4200a((C5837k) f4275j, 7, false);
    }
}
