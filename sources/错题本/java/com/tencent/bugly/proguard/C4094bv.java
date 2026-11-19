package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes3.dex */
public final class C4094bv extends AbstractC4123m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C4093bu> f3791f;

    /* renamed from: g */
    static Map<String, String> f3792g;

    /* renamed from: a */
    public byte f3793a = 0;

    /* renamed from: b */
    public String f3794b = "";

    /* renamed from: c */
    public String f3795c = "";

    /* renamed from: d */
    public ArrayList<C4093bu> f3796d = null;

    /* renamed from: e */
    public Map<String, String> f3797e = null;

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3310a(this.f3793a, 0);
        String str = this.f3794b;
        if (str != null) {
            c4121l.m3315a(str, 1);
        }
        String str2 = this.f3795c;
        if (str2 != null) {
            c4121l.m3315a(str2, 2);
        }
        ArrayList<C4093bu> arrayList = this.f3796d;
        if (arrayList != null) {
            c4121l.m3316a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f3797e;
        if (map != null) {
            c4121l.m3317a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3793a = c4119k.m3286a(this.f3793a, 0, true);
        this.f3794b = c4119k.m3296b(1, false);
        this.f3795c = c4119k.m3296b(2, false);
        if (f3791f == null) {
            f3791f = new ArrayList<>();
            f3791f.add(new C4093bu());
        }
        this.f3796d = (ArrayList) c4119k.m3291a((C4119k) f3791f, 3, false);
        if (f3792g == null) {
            HashMap map = new HashMap();
            f3792g = map;
            map.put("", "");
        }
        this.f3797e = (Map) c4119k.m3291a((C4119k) f3792g, 4, false);
    }
}
