package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bu */
/* loaded from: classes3.dex */
public final class C4093bu extends AbstractC4123m {

    /* renamed from: i */
    static Map<String, String> f3782i;

    /* renamed from: a */
    public long f3783a = 0;

    /* renamed from: b */
    public byte f3784b = 0;

    /* renamed from: c */
    public String f3785c = "";

    /* renamed from: d */
    public String f3786d = "";

    /* renamed from: e */
    public String f3787e = "";

    /* renamed from: f */
    public Map<String, String> f3788f = null;

    /* renamed from: g */
    public String f3789g = "";

    /* renamed from: h */
    public boolean f3790h = true;

    static {
        HashMap map = new HashMap();
        f3782i = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3312a(this.f3783a, 0);
        c4121l.m3310a(this.f3784b, 1);
        String str = this.f3785c;
        if (str != null) {
            c4121l.m3315a(str, 2);
        }
        String str2 = this.f3786d;
        if (str2 != null) {
            c4121l.m3315a(str2, 3);
        }
        String str3 = this.f3787e;
        if (str3 != null) {
            c4121l.m3315a(str3, 4);
        }
        Map<String, String> map = this.f3788f;
        if (map != null) {
            c4121l.m3317a((Map) map, 5);
        }
        String str4 = this.f3789g;
        if (str4 != null) {
            c4121l.m3315a(str4, 6);
        }
        c4121l.m3319a(this.f3790h, 7);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3783a = c4119k.m3289a(this.f3783a, 0, true);
        this.f3784b = c4119k.m3286a(this.f3784b, 1, true);
        this.f3785c = c4119k.m3296b(2, false);
        this.f3786d = c4119k.m3296b(3, false);
        this.f3787e = c4119k.m3296b(4, false);
        this.f3788f = (Map) c4119k.m3291a((C4119k) f3782i, 5, false);
        this.f3789g = c4119k.m3296b(6, false);
        this.f3790h = c4119k.m3295a(7, false);
    }
}
