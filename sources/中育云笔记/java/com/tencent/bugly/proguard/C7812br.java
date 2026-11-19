package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes5.dex */
public final class C7812br extends AbstractC7827m {

    /* renamed from: i */
    static byte[] f13995i = {0};

    /* renamed from: j */
    static Map<String, String> f13996j;

    /* renamed from: a */
    public byte f13997a = 0;

    /* renamed from: b */
    public int f13998b = 0;

    /* renamed from: c */
    public byte[] f13999c = null;

    /* renamed from: d */
    public String f14000d = "";

    /* renamed from: e */
    public long f14001e = 0;

    /* renamed from: f */
    public String f14002f = "";

    /* renamed from: g */
    public String f14003g = "";

    /* renamed from: h */
    public Map<String, String> f14004h = null;

    static {
        HashMap map = new HashMap();
        f13996j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10904a(this.f13997a, 0);
        c7826l.m10905a(this.f13998b, 1);
        byte[] bArr = this.f13999c;
        if (bArr != null) {
            c7826l.m10914a(bArr, 2);
        }
        String str = this.f14000d;
        if (str != null) {
            c7826l.m10909a(str, 3);
        }
        c7826l.m10906a(this.f14001e, 4);
        String str2 = this.f14002f;
        if (str2 != null) {
            c7826l.m10909a(str2, 5);
        }
        String str3 = this.f14003g;
        if (str3 != null) {
            c7826l.m10909a(str3, 6);
        }
        Map<String, String> map = this.f14004h;
        if (map != null) {
            c7826l.m10911a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13997a = c7825k.m10880a(this.f13997a, 0, true);
        this.f13998b = c7825k.m10881a(this.f13998b, 1, true);
        this.f13999c = c7825k.m10891c(2, false);
        this.f14000d = c7825k.m10890b(3, false);
        this.f14001e = c7825k.m10883a(this.f14001e, 4, false);
        this.f14002f = c7825k.m10890b(5, false);
        this.f14003g = c7825k.m10890b(6, false);
        this.f14004h = (Map) c7825k.m10885a((C7825k) f13996j, 7, false);
    }
}
