package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes3.dex */
public final class C5826bt extends AbstractC5839m implements Cloneable {

    /* renamed from: m */
    static C5825bs f4286m = new C5825bs();

    /* renamed from: n */
    static Map<String, String> f4287n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f4288o = true;

    /* renamed from: a */
    public boolean f4289a = true;

    /* renamed from: b */
    public boolean f4290b = true;

    /* renamed from: c */
    public boolean f4291c = true;

    /* renamed from: d */
    public String f4292d = "";

    /* renamed from: e */
    public String f4293e = "";

    /* renamed from: f */
    public C5825bs f4294f = null;

    /* renamed from: g */
    public Map<String, String> f4295g = null;

    /* renamed from: h */
    public long f4296h = 0;

    /* renamed from: i */
    public String f4297i = "";

    /* renamed from: j */
    public String f4298j = "";

    /* renamed from: k */
    public int f4299k = 0;

    /* renamed from: l */
    public int f4300l = 0;

    static {
        HashMap map = new HashMap();
        f4287n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4228a(this.f4289a, 0);
        c5838l.m4228a(this.f4290b, 1);
        c5838l.m4228a(this.f4291c, 2);
        String str = this.f4292d;
        if (str != null) {
            c5838l.m4224a(str, 3);
        }
        String str2 = this.f4293e;
        if (str2 != null) {
            c5838l.m4224a(str2, 4);
        }
        C5825bs c5825bs = this.f4294f;
        if (c5825bs != null) {
            c5838l.m4222a((AbstractC5839m) c5825bs, 5);
        }
        Map<String, String> map = this.f4295g;
        if (map != null) {
            c5838l.m4226a((Map) map, 6);
        }
        c5838l.m4221a(this.f4296h, 7);
        String str3 = this.f4297i;
        if (str3 != null) {
            c5838l.m4224a(str3, 8);
        }
        String str4 = this.f4298j;
        if (str4 != null) {
            c5838l.m4224a(str4, 9);
        }
        c5838l.m4220a(this.f4299k, 10);
        c5838l.m4220a(this.f4300l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4288o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C5826bt c5826bt = (C5826bt) obj;
        return C5840n.m4233a(this.f4289a, c5826bt.f4289a) && C5840n.m4233a(this.f4290b, c5826bt.f4290b) && C5840n.m4233a(this.f4291c, c5826bt.f4291c) && C5840n.m4232a(this.f4292d, c5826bt.f4292d) && C5840n.m4232a(this.f4293e, c5826bt.f4293e) && C5840n.m4232a(this.f4294f, c5826bt.f4294f) && C5840n.m4232a(this.f4295g, c5826bt.f4295g) && C5840n.m4231a(this.f4296h, c5826bt.f4296h) && C5840n.m4232a(this.f4297i, c5826bt.f4297i) && C5840n.m4232a(this.f4298j, c5826bt.f4298j) && C5840n.m4230a(this.f4299k, c5826bt.f4299k) && C5840n.m4230a(this.f4300l, c5826bt.f4300l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e6) {
            e6.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4289a = c5837k.m4204a(0, true);
        this.f4290b = c5837k.m4204a(1, true);
        this.f4291c = c5837k.m4204a(2, true);
        this.f4292d = c5837k.m4205b(3, false);
        this.f4293e = c5837k.m4205b(4, false);
        this.f4294f = (C5825bs) c5837k.m4199a((AbstractC5839m) f4286m, 5, false);
        this.f4295g = (Map) c5837k.m4200a((C5837k) f4287n, 6, false);
        this.f4296h = c5837k.m4198a(this.f4296h, 7, false);
        this.f4297i = c5837k.m4205b(8, false);
        this.f4298j = c5837k.m4205b(9, false);
        this.f4299k = c5837k.m4196a(this.f4299k, 10, false);
        this.f4300l = c5837k.m4196a(this.f4300l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
        C5835i c5835i = new C5835i(sb, i6);
        c5835i.m4174a(this.f4289a, "enable");
        c5835i.m4174a(this.f4290b, "enableUserInfo");
        c5835i.m4174a(this.f4291c, "enableQuery");
        c5835i.m4171a(this.f4292d, "url");
        c5835i.m4171a(this.f4293e, "expUrl");
        c5835i.m4170a((AbstractC5839m) this.f4294f, "security");
        c5835i.m4172a((Map) this.f4295g, "valueMap");
        c5835i.m4169a(this.f4296h, "strategylastUpdateTime");
        c5835i.m4171a(this.f4297i, "httpsUrl");
        c5835i.m4171a(this.f4298j, "httpsExpUrl");
        c5835i.m4168a(this.f4299k, "eventRecordCount");
        c5835i.m4168a(this.f4300l, "eventTimeInterval");
    }
}
