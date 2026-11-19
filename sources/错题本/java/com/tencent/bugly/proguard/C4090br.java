package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.br */
/* loaded from: classes3.dex */
public final class C4090br extends AbstractC4123m {

    /* renamed from: i */
    static byte[] f3755i = {0};

    /* renamed from: j */
    static Map<String, String> f3756j;

    /* renamed from: a */
    public byte f3757a = 0;

    /* renamed from: b */
    public int f3758b = 0;

    /* renamed from: c */
    public byte[] f3759c = null;

    /* renamed from: d */
    public String f3760d = "";

    /* renamed from: e */
    public long f3761e = 0;

    /* renamed from: f */
    public String f3762f = "";

    /* renamed from: g */
    public String f3763g = "";

    /* renamed from: h */
    public Map<String, String> f3764h = null;

    static {
        HashMap map = new HashMap();
        f3756j = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3310a(this.f3757a, 0);
        c4121l.m3311a(this.f3758b, 1);
        byte[] bArr = this.f3759c;
        if (bArr != null) {
            c4121l.m3320a(bArr, 2);
        }
        String str = this.f3760d;
        if (str != null) {
            c4121l.m3315a(str, 3);
        }
        c4121l.m3312a(this.f3761e, 4);
        String str2 = this.f3762f;
        if (str2 != null) {
            c4121l.m3315a(str2, 5);
        }
        String str3 = this.f3763g;
        if (str3 != null) {
            c4121l.m3315a(str3, 6);
        }
        Map<String, String> map = this.f3764h;
        if (map != null) {
            c4121l.m3317a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3757a = c4119k.m3286a(this.f3757a, 0, true);
        this.f3758b = c4119k.m3287a(this.f3758b, 1, true);
        this.f3759c = c4119k.m3297c(2, false);
        this.f3760d = c4119k.m3296b(3, false);
        this.f3761e = c4119k.m3289a(this.f3761e, 4, false);
        this.f3762f = c4119k.m3296b(5, false);
        this.f3763g = c4119k.m3296b(6, false);
        this.f3764h = (Map) c4119k.m3291a((C4119k) f3756j, 7, false);
    }
}
