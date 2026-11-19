package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes4.dex */
public final class C6469br extends AbstractC6484m {

    /* renamed from: i */
    static byte[] f4896i = {0};

    /* renamed from: j */
    static Map<String, String> f4897j;

    /* renamed from: a */
    public byte f4898a = 0;

    /* renamed from: b */
    public int f4899b = 0;

    /* renamed from: c */
    public byte[] f4900c = null;

    /* renamed from: d */
    public String f4901d = "";

    /* renamed from: e */
    public long f4902e = 0;

    /* renamed from: f */
    public String f4903f = "";

    /* renamed from: g */
    public String f4904g = "";

    /* renamed from: h */
    public Map<String, String> f4905h = null;

    static {
        HashMap map = new HashMap();
        f4897j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4574a(this.f4898a, 0);
        c6483l.m4575a(this.f4899b, 1);
        byte[] bArr = this.f4900c;
        if (bArr != null) {
            c6483l.m4584a(bArr, 2);
        }
        String str = this.f4901d;
        if (str != null) {
            c6483l.m4579a(str, 3);
        }
        c6483l.m4576a(this.f4902e, 4);
        String str2 = this.f4903f;
        if (str2 != null) {
            c6483l.m4579a(str2, 5);
        }
        String str3 = this.f4904g;
        if (str3 != null) {
            c6483l.m4579a(str3, 6);
        }
        Map<String, String> map = this.f4905h;
        if (map != null) {
            c6483l.m4581a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4898a = c6482k.m4550a(this.f4898a, 0, true);
        this.f4899b = c6482k.m4551a(this.f4899b, 1, true);
        this.f4900c = c6482k.m4561c(2, false);
        this.f4901d = c6482k.m4560b(3, false);
        this.f4902e = c6482k.m4553a(this.f4902e, 4, false);
        this.f4903f = c6482k.m4560b(5, false);
        this.f4904g = c6482k.m4560b(6, false);
        this.f4905h = (Map) c6482k.m4555a((C6482k) f4897j, 7, false);
    }
}
