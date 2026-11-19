package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes4.dex */
public final class C6710bu extends AbstractC6722m {

    /* renamed from: i */
    static Map<String, String> f6157i;

    /* renamed from: a */
    public long f6158a = 0;

    /* renamed from: b */
    public byte f6159b = 0;

    /* renamed from: c */
    public String f6160c = "";

    /* renamed from: d */
    public String f6161d = "";

    /* renamed from: e */
    public String f6162e = "";

    /* renamed from: f */
    public Map<String, String> f6163f = null;

    /* renamed from: g */
    public String f6164g = "";

    /* renamed from: h */
    public boolean f6165h = true;

    static {
        HashMap map = new HashMap();
        f6157i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5395a(this.f6158a, 0);
        c6721l.m5393a(this.f6159b, 1);
        String str = this.f6160c;
        if (str != null) {
            c6721l.m5398a(str, 2);
        }
        String str2 = this.f6161d;
        if (str2 != null) {
            c6721l.m5398a(str2, 3);
        }
        String str3 = this.f6162e;
        if (str3 != null) {
            c6721l.m5398a(str3, 4);
        }
        Map<String, String> map = this.f6163f;
        if (map != null) {
            c6721l.m5400a((Map) map, 5);
        }
        String str4 = this.f6164g;
        if (str4 != null) {
            c6721l.m5398a(str4, 6);
        }
        c6721l.m5402a(this.f6165h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6158a = c6720k.m5372a(this.f6158a, 0, true);
        this.f6159b = c6720k.m5369a(this.f6159b, 1, true);
        this.f6160c = c6720k.m5379b(2, false);
        this.f6161d = c6720k.m5379b(3, false);
        this.f6162e = c6720k.m5379b(4, false);
        this.f6163f = (Map) c6720k.m5374a((C6720k) f6157i, 5, false);
        this.f6164g = c6720k.m5379b(6, false);
        this.f6165h = c6720k.m5378a(7, false);
    }
}
