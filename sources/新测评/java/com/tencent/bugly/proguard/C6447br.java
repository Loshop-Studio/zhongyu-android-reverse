package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes4.dex */
public final class C6447br extends AbstractC6462m {

    /* renamed from: i */
    static byte[] f5553i = {0};

    /* renamed from: j */
    static Map<String, String> f5554j;

    /* renamed from: a */
    public byte f5555a = 0;

    /* renamed from: b */
    public int f5556b = 0;

    /* renamed from: c */
    public byte[] f5557c = null;

    /* renamed from: d */
    public String f5558d = "";

    /* renamed from: e */
    public long f5559e = 0;

    /* renamed from: f */
    public String f5560f = "";

    /* renamed from: g */
    public String f5561g = "";

    /* renamed from: h */
    public Map<String, String> f5562h = null;

    static {
        HashMap map = new HashMap();
        f5554j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5214a(this.f5555a, 0);
        c6461l.m5215a(this.f5556b, 1);
        byte[] bArr = this.f5557c;
        if (bArr != null) {
            c6461l.m5224a(bArr, 2);
        }
        String str = this.f5558d;
        if (str != null) {
            c6461l.m5219a(str, 3);
        }
        c6461l.m5216a(this.f5559e, 4);
        String str2 = this.f5560f;
        if (str2 != null) {
            c6461l.m5219a(str2, 5);
        }
        String str3 = this.f5561g;
        if (str3 != null) {
            c6461l.m5219a(str3, 6);
        }
        Map<String, String> map = this.f5562h;
        if (map != null) {
            c6461l.m5221a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5555a = c6460k.m5190a(this.f5555a, 0, true);
        this.f5556b = c6460k.m5191a(this.f5556b, 1, true);
        this.f5557c = c6460k.m5201c(2, false);
        this.f5558d = c6460k.m5200b(3, false);
        this.f5559e = c6460k.m5193a(this.f5559e, 4, false);
        this.f5560f = c6460k.m5200b(5, false);
        this.f5561g = c6460k.m5200b(6, false);
        this.f5562h = (Map) c6460k.m5195a((C6460k) f5554j, 7, false);
    }
}
