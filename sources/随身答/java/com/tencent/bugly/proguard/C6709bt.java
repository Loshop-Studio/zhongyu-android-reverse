package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes4.dex */
public final class C6709bt extends AbstractC6722m implements Cloneable {

    /* renamed from: m */
    static C6708bs f6142m = new C6708bs();

    /* renamed from: n */
    static Map<String, String> f6143n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f6144o = true;

    /* renamed from: a */
    public boolean f6145a = true;

    /* renamed from: b */
    public boolean f6146b = true;

    /* renamed from: c */
    public boolean f6147c = true;

    /* renamed from: d */
    public String f6148d = "";

    /* renamed from: e */
    public String f6149e = "";

    /* renamed from: f */
    public C6708bs f6150f = null;

    /* renamed from: g */
    public Map<String, String> f6151g = null;

    /* renamed from: h */
    public long f6152h = 0;

    /* renamed from: i */
    public String f6153i = "";

    /* renamed from: j */
    public String f6154j = "";

    /* renamed from: k */
    public int f6155k = 0;

    /* renamed from: l */
    public int f6156l = 0;

    static {
        HashMap map = new HashMap();
        f6143n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5402a(this.f6145a, 0);
        c6721l.m5402a(this.f6146b, 1);
        c6721l.m5402a(this.f6147c, 2);
        String str = this.f6148d;
        if (str != null) {
            c6721l.m5398a(str, 3);
        }
        String str2 = this.f6149e;
        if (str2 != null) {
            c6721l.m5398a(str2, 4);
        }
        C6708bs c6708bs = this.f6150f;
        if (c6708bs != null) {
            c6721l.m5396a((AbstractC6722m) c6708bs, 5);
        }
        Map<String, String> map = this.f6151g;
        if (map != null) {
            c6721l.m5400a((Map) map, 6);
        }
        c6721l.m5395a(this.f6152h, 7);
        String str3 = this.f6153i;
        if (str3 != null) {
            c6721l.m5398a(str3, 8);
        }
        String str4 = this.f6154j;
        if (str4 != null) {
            c6721l.m5398a(str4, 9);
        }
        c6721l.m5394a(this.f6155k, 10);
        c6721l.m5394a(this.f6156l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f6144o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C6709bt c6709bt = (C6709bt) obj;
        return C6723n.m5407a(this.f6145a, c6709bt.f6145a) && C6723n.m5407a(this.f6146b, c6709bt.f6146b) && C6723n.m5407a(this.f6147c, c6709bt.f6147c) && C6723n.m5406a(this.f6148d, c6709bt.f6148d) && C6723n.m5406a(this.f6149e, c6709bt.f6149e) && C6723n.m5406a(this.f6150f, c6709bt.f6150f) && C6723n.m5406a(this.f6151g, c6709bt.f6151g) && C6723n.m5405a(this.f6152h, c6709bt.f6152h) && C6723n.m5406a(this.f6153i, c6709bt.f6153i) && C6723n.m5406a(this.f6154j, c6709bt.f6154j) && C6723n.m5404a(this.f6155k, c6709bt.f6155k) && C6723n.m5404a(this.f6156l, c6709bt.f6156l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6145a = c6720k.m5378a(0, true);
        this.f6146b = c6720k.m5378a(1, true);
        this.f6147c = c6720k.m5378a(2, true);
        this.f6148d = c6720k.m5379b(3, false);
        this.f6149e = c6720k.m5379b(4, false);
        this.f6150f = (C6708bs) c6720k.m5373a((AbstractC6722m) f6142m, 5, false);
        this.f6151g = (Map) c6720k.m5374a((C6720k) f6143n, 6, false);
        this.f6152h = c6720k.m5372a(this.f6152h, 7, false);
        this.f6153i = c6720k.m5379b(8, false);
        this.f6154j = c6720k.m5379b(9, false);
        this.f6155k = c6720k.m5370a(this.f6155k, 10, false);
        this.f6156l = c6720k.m5370a(this.f6156l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
        C6718i c6718i = new C6718i(sb, i9);
        c6718i.m5348a(this.f6145a, "enable");
        c6718i.m5348a(this.f6146b, "enableUserInfo");
        c6718i.m5348a(this.f6147c, "enableQuery");
        c6718i.m5345a(this.f6148d, "url");
        c6718i.m5345a(this.f6149e, "expUrl");
        c6718i.m5344a((AbstractC6722m) this.f6150f, "security");
        c6718i.m5346a((Map) this.f6151g, "valueMap");
        c6718i.m5343a(this.f6152h, "strategylastUpdateTime");
        c6718i.m5345a(this.f6153i, "httpsUrl");
        c6718i.m5345a(this.f6154j, "httpsExpUrl");
        c6718i.m5342a(this.f6155k, "eventRecordCount");
        c6718i.m5342a(this.f6156l, "eventTimeInterval");
    }
}
