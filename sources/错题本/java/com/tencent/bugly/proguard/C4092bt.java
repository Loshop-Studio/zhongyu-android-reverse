package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes3.dex */
public final class C4092bt extends AbstractC4123m implements Cloneable {

    /* renamed from: m */
    static C4091bs f3767m = new C4091bs();

    /* renamed from: n */
    static Map<String, String> f3768n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f3769o = true;

    /* renamed from: a */
    public boolean f3770a = true;

    /* renamed from: b */
    public boolean f3771b = true;

    /* renamed from: c */
    public boolean f3772c = true;

    /* renamed from: d */
    public String f3773d = "";

    /* renamed from: e */
    public String f3774e = "";

    /* renamed from: f */
    public C4091bs f3775f = null;

    /* renamed from: g */
    public Map<String, String> f3776g = null;

    /* renamed from: h */
    public long f3777h = 0;

    /* renamed from: i */
    public String f3778i = "";

    /* renamed from: j */
    public String f3779j = "";

    /* renamed from: k */
    public int f3780k = 0;

    /* renamed from: l */
    public int f3781l = 0;

    static {
        HashMap map = new HashMap();
        f3768n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3319a(this.f3770a, 0);
        c4121l.m3319a(this.f3771b, 1);
        c4121l.m3319a(this.f3772c, 2);
        String str = this.f3773d;
        if (str != null) {
            c4121l.m3315a(str, 3);
        }
        String str2 = this.f3774e;
        if (str2 != null) {
            c4121l.m3315a(str2, 4);
        }
        C4091bs c4091bs = this.f3775f;
        if (c4091bs != null) {
            c4121l.m3313a((AbstractC4123m) c4091bs, 5);
        }
        Map<String, String> map = this.f3776g;
        if (map != null) {
            c4121l.m3317a((Map) map, 6);
        }
        c4121l.m3312a(this.f3777h, 7);
        String str3 = this.f3778i;
        if (str3 != null) {
            c4121l.m3315a(str3, 8);
        }
        String str4 = this.f3779j;
        if (str4 != null) {
            c4121l.m3315a(str4, 9);
        }
        c4121l.m3311a(this.f3780k, 10);
        c4121l.m3311a(this.f3781l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f3769o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C4092bt c4092bt = (C4092bt) obj;
        return C4125n.m3324a(this.f3770a, c4092bt.f3770a) && C4125n.m3324a(this.f3771b, c4092bt.f3771b) && C4125n.m3324a(this.f3772c, c4092bt.f3772c) && C4125n.m3323a(this.f3773d, c4092bt.f3773d) && C4125n.m3323a(this.f3774e, c4092bt.f3774e) && C4125n.m3323a(this.f3775f, c4092bt.f3775f) && C4125n.m3323a(this.f3776g, c4092bt.f3776g) && C4125n.m3322a(this.f3777h, c4092bt.f3777h) && C4125n.m3323a(this.f3778i, c4092bt.f3778i) && C4125n.m3323a(this.f3779j, c4092bt.f3779j) && C4125n.m3321a(this.f3780k, c4092bt.f3780k) && C4125n.m3321a(this.f3781l, c4092bt.f3781l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3770a = c4119k.m3295a(0, true);
        this.f3771b = c4119k.m3295a(1, true);
        this.f3772c = c4119k.m3295a(2, true);
        this.f3773d = c4119k.m3296b(3, false);
        this.f3774e = c4119k.m3296b(4, false);
        this.f3775f = (C4091bs) c4119k.m3290a((AbstractC4123m) f3767m, 5, false);
        this.f3776g = (Map) c4119k.m3291a((C4119k) f3768n, 6, false);
        this.f3777h = c4119k.m3289a(this.f3777h, 7, false);
        this.f3778i = c4119k.m3296b(8, false);
        this.f3779j = c4119k.m3296b(9, false);
        this.f3780k = c4119k.m3287a(this.f3780k, 10, false);
        this.f3781l = c4119k.m3287a(this.f3781l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
        C4113i c4113i = new C4113i(sb, i);
        c4113i.m3265a(this.f3770a, "enable");
        c4113i.m3265a(this.f3771b, "enableUserInfo");
        c4113i.m3265a(this.f3772c, "enableQuery");
        c4113i.m3262a(this.f3773d, "url");
        c4113i.m3262a(this.f3774e, "expUrl");
        c4113i.m3261a((AbstractC4123m) this.f3775f, "security");
        c4113i.m3263a((Map) this.f3776g, "valueMap");
        c4113i.m3260a(this.f3777h, "strategylastUpdateTime");
        c4113i.m3262a(this.f3778i, "httpsUrl");
        c4113i.m3262a(this.f3779j, "httpsExpUrl");
        c4113i.m3259a(this.f3780k, "eventRecordCount");
        c4113i.m3259a(this.f3781l, "eventTimeInterval");
    }
}
