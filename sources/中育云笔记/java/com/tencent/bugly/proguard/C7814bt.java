package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes5.dex */
public final class C7814bt extends AbstractC7827m implements Cloneable {

    /* renamed from: m */
    static C7813bs f14007m = new C7813bs();

    /* renamed from: n */
    static Map<String, String> f14008n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f14009o = true;

    /* renamed from: a */
    public boolean f14010a = true;

    /* renamed from: b */
    public boolean f14011b = true;

    /* renamed from: c */
    public boolean f14012c = true;

    /* renamed from: d */
    public String f14013d = "";

    /* renamed from: e */
    public String f14014e = "";

    /* renamed from: f */
    public C7813bs f14015f = null;

    /* renamed from: g */
    public Map<String, String> f14016g = null;

    /* renamed from: h */
    public long f14017h = 0;

    /* renamed from: i */
    public String f14018i = "";

    /* renamed from: j */
    public String f14019j = "";

    /* renamed from: k */
    public int f14020k = 0;

    /* renamed from: l */
    public int f14021l = 0;

    static {
        HashMap map = new HashMap();
        f14008n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10913a(this.f14010a, 0);
        c7826l.m10913a(this.f14011b, 1);
        c7826l.m10913a(this.f14012c, 2);
        String str = this.f14013d;
        if (str != null) {
            c7826l.m10909a(str, 3);
        }
        String str2 = this.f14014e;
        if (str2 != null) {
            c7826l.m10909a(str2, 4);
        }
        C7813bs c7813bs = this.f14015f;
        if (c7813bs != null) {
            c7826l.m10907a((AbstractC7827m) c7813bs, 5);
        }
        Map<String, String> map = this.f14016g;
        if (map != null) {
            c7826l.m10911a((Map) map, 6);
        }
        c7826l.m10906a(this.f14017h, 7);
        String str3 = this.f14018i;
        if (str3 != null) {
            c7826l.m10909a(str3, 8);
        }
        String str4 = this.f14019j;
        if (str4 != null) {
            c7826l.m10909a(str4, 9);
        }
        c7826l.m10905a(this.f14020k, 10);
        c7826l.m10905a(this.f14021l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f14009o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C7814bt c7814bt = (C7814bt) obj;
        return C7828n.m10918a(this.f14010a, c7814bt.f14010a) && C7828n.m10918a(this.f14011b, c7814bt.f14011b) && C7828n.m10918a(this.f14012c, c7814bt.f14012c) && C7828n.m10917a(this.f14013d, c7814bt.f14013d) && C7828n.m10917a(this.f14014e, c7814bt.f14014e) && C7828n.m10917a(this.f14015f, c7814bt.f14015f) && C7828n.m10917a(this.f14016g, c7814bt.f14016g) && C7828n.m10916a(this.f14017h, c7814bt.f14017h) && C7828n.m10917a(this.f14018i, c7814bt.f14018i) && C7828n.m10917a(this.f14019j, c7814bt.f14019j) && C7828n.m10915a(this.f14020k, c7814bt.f14020k) && C7828n.m10915a(this.f14021l, c7814bt.f14021l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f14010a = c7825k.m10889a(0, true);
        this.f14011b = c7825k.m10889a(1, true);
        this.f14012c = c7825k.m10889a(2, true);
        this.f14013d = c7825k.m10890b(3, false);
        this.f14014e = c7825k.m10890b(4, false);
        this.f14015f = (C7813bs) c7825k.m10884a((AbstractC7827m) f14007m, 5, false);
        this.f14016g = (Map) c7825k.m10885a((C7825k) f14008n, 6, false);
        this.f14017h = c7825k.m10883a(this.f14017h, 7, false);
        this.f14018i = c7825k.m10890b(8, false);
        this.f14019j = c7825k.m10890b(9, false);
        this.f14020k = c7825k.m10881a(this.f14020k, 10, false);
        this.f14021l = c7825k.m10881a(this.f14021l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
        C7823i c7823i = new C7823i(sb2, i10);
        c7823i.m10859a(this.f14010a, "enable");
        c7823i.m10859a(this.f14011b, "enableUserInfo");
        c7823i.m10859a(this.f14012c, "enableQuery");
        c7823i.m10856a(this.f14013d, "url");
        c7823i.m10856a(this.f14014e, "expUrl");
        c7823i.m10855a((AbstractC7827m) this.f14015f, "security");
        c7823i.m10857a((Map) this.f14016g, "valueMap");
        c7823i.m10854a(this.f14017h, "strategylastUpdateTime");
        c7823i.m10856a(this.f14018i, "httpsUrl");
        c7823i.m10856a(this.f14019j, "httpsExpUrl");
        c7823i.m10853a(this.f14020k, "eventRecordCount");
        c7823i.m10853a(this.f14021l, "eventTimeInterval");
    }
}
