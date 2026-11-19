package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes4.dex */
public final class C6707br extends AbstractC6722m {

    /* renamed from: i */
    static byte[] f6130i = {0};

    /* renamed from: j */
    static Map<String, String> f6131j;

    /* renamed from: a */
    public byte f6132a = 0;

    /* renamed from: b */
    public int f6133b = 0;

    /* renamed from: c */
    public byte[] f6134c = null;

    /* renamed from: d */
    public String f6135d = "";

    /* renamed from: e */
    public long f6136e = 0;

    /* renamed from: f */
    public String f6137f = "";

    /* renamed from: g */
    public String f6138g = "";

    /* renamed from: h */
    public Map<String, String> f6139h = null;

    static {
        HashMap map = new HashMap();
        f6131j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5393a(this.f6132a, 0);
        c6721l.m5394a(this.f6133b, 1);
        byte[] bArr = this.f6134c;
        if (bArr != null) {
            c6721l.m5403a(bArr, 2);
        }
        String str = this.f6135d;
        if (str != null) {
            c6721l.m5398a(str, 3);
        }
        c6721l.m5395a(this.f6136e, 4);
        String str2 = this.f6137f;
        if (str2 != null) {
            c6721l.m5398a(str2, 5);
        }
        String str3 = this.f6138g;
        if (str3 != null) {
            c6721l.m5398a(str3, 6);
        }
        Map<String, String> map = this.f6139h;
        if (map != null) {
            c6721l.m5400a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6132a = c6720k.m5369a(this.f6132a, 0, true);
        this.f6133b = c6720k.m5370a(this.f6133b, 1, true);
        this.f6134c = c6720k.m5380c(2, false);
        this.f6135d = c6720k.m5379b(3, false);
        this.f6136e = c6720k.m5372a(this.f6136e, 4, false);
        this.f6137f = c6720k.m5379b(5, false);
        this.f6138g = c6720k.m5379b(6, false);
        this.f6139h = (Map) c6720k.m5374a((C6720k) f6131j, 7, false);
    }
}
