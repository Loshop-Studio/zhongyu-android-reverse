package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bv */
/* loaded from: classes4.dex */
public final class C6711bv extends AbstractC6722m implements Cloneable {

    /* renamed from: f */
    static ArrayList<C6710bu> f6166f;

    /* renamed from: g */
    static Map<String, String> f6167g;

    /* renamed from: a */
    public byte f6168a = 0;

    /* renamed from: b */
    public String f6169b = "";

    /* renamed from: c */
    public String f6170c = "";

    /* renamed from: d */
    public ArrayList<C6710bu> f6171d = null;

    /* renamed from: e */
    public Map<String, String> f6172e = null;

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5393a(this.f6168a, 0);
        String str = this.f6169b;
        if (str != null) {
            c6721l.m5398a(str, 1);
        }
        String str2 = this.f6170c;
        if (str2 != null) {
            c6721l.m5398a(str2, 2);
        }
        ArrayList<C6710bu> arrayList = this.f6171d;
        if (arrayList != null) {
            c6721l.m5399a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f6172e;
        if (map != null) {
            c6721l.m5400a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6168a = c6720k.m5369a(this.f6168a, 0, true);
        this.f6169b = c6720k.m5379b(1, false);
        this.f6170c = c6720k.m5379b(2, false);
        if (f6166f == null) {
            f6166f = new ArrayList<>();
            f6166f.add(new C6710bu());
        }
        this.f6171d = (ArrayList) c6720k.m5374a((C6720k) f6166f, 3, false);
        if (f6167g == null) {
            HashMap map = new HashMap();
            f6167g = map;
            map.put("", "");
        }
        this.f6172e = (Map) c6720k.m5374a((C6720k) f6167g, 4, false);
    }
}
