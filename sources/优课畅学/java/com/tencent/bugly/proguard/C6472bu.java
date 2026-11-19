package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes4.dex */
public final class C6472bu extends AbstractC6484m {

    /* renamed from: i */
    static Map<String, String> f4923i;

    /* renamed from: a */
    public long f4924a = 0;

    /* renamed from: b */
    public byte f4925b = 0;

    /* renamed from: c */
    public String f4926c = "";

    /* renamed from: d */
    public String f4927d = "";

    /* renamed from: e */
    public String f4928e = "";

    /* renamed from: f */
    public Map<String, String> f4929f = null;

    /* renamed from: g */
    public String f4930g = "";

    /* renamed from: h */
    public boolean f4931h = true;

    static {
        HashMap map = new HashMap();
        f4923i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4576a(this.f4924a, 0);
        c6483l.m4574a(this.f4925b, 1);
        String str = this.f4926c;
        if (str != null) {
            c6483l.m4579a(str, 2);
        }
        String str2 = this.f4927d;
        if (str2 != null) {
            c6483l.m4579a(str2, 3);
        }
        String str3 = this.f4928e;
        if (str3 != null) {
            c6483l.m4579a(str3, 4);
        }
        Map<String, String> map = this.f4929f;
        if (map != null) {
            c6483l.m4581a((Map) map, 5);
        }
        String str4 = this.f4930g;
        if (str4 != null) {
            c6483l.m4579a(str4, 6);
        }
        c6483l.m4583a(this.f4931h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4924a = c6482k.m4553a(this.f4924a, 0, true);
        this.f4925b = c6482k.m4550a(this.f4925b, 1, true);
        this.f4926c = c6482k.m4560b(2, false);
        this.f4927d = c6482k.m4560b(3, false);
        this.f4928e = c6482k.m4560b(4, false);
        this.f4929f = (Map) c6482k.m4555a((C6482k) f4923i, 5, false);
        this.f4930g = c6482k.m4560b(6, false);
        this.f4931h = c6482k.m4559a(7, false);
    }
}
