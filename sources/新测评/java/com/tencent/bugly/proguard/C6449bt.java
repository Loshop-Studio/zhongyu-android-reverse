package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes4.dex */
public final class C6449bt extends AbstractC6462m implements Cloneable {

    /* renamed from: m */
    static C6448bs f5565m = new C6448bs();

    /* renamed from: n */
    static Map<String, String> f5566n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f5567o = true;

    /* renamed from: a */
    public boolean f5568a = true;

    /* renamed from: b */
    public boolean f5569b = true;

    /* renamed from: c */
    public boolean f5570c = true;

    /* renamed from: d */
    public String f5571d = "";

    /* renamed from: e */
    public String f5572e = "";

    /* renamed from: f */
    public C6448bs f5573f = null;

    /* renamed from: g */
    public Map<String, String> f5574g = null;

    /* renamed from: h */
    public long f5575h = 0;

    /* renamed from: i */
    public String f5576i = "";

    /* renamed from: j */
    public String f5577j = "";

    /* renamed from: k */
    public int f5578k = 0;

    /* renamed from: l */
    public int f5579l = 0;

    static {
        HashMap map = new HashMap();
        f5566n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5223a(this.f5568a, 0);
        c6461l.m5223a(this.f5569b, 1);
        c6461l.m5223a(this.f5570c, 2);
        String str = this.f5571d;
        if (str != null) {
            c6461l.m5219a(str, 3);
        }
        String str2 = this.f5572e;
        if (str2 != null) {
            c6461l.m5219a(str2, 4);
        }
        C6448bs c6448bs = this.f5573f;
        if (c6448bs != null) {
            c6461l.m5217a((AbstractC6462m) c6448bs, 5);
        }
        Map<String, String> map = this.f5574g;
        if (map != null) {
            c6461l.m5221a((Map) map, 6);
        }
        c6461l.m5216a(this.f5575h, 7);
        String str3 = this.f5576i;
        if (str3 != null) {
            c6461l.m5219a(str3, 8);
        }
        String str4 = this.f5577j;
        if (str4 != null) {
            c6461l.m5219a(str4, 9);
        }
        c6461l.m5215a(this.f5578k, 10);
        c6461l.m5215a(this.f5579l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5567o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C6449bt c6449bt = (C6449bt) obj;
        return C6463n.m5228a(this.f5568a, c6449bt.f5568a) && C6463n.m5228a(this.f5569b, c6449bt.f5569b) && C6463n.m5228a(this.f5570c, c6449bt.f5570c) && C6463n.m5227a(this.f5571d, c6449bt.f5571d) && C6463n.m5227a(this.f5572e, c6449bt.f5572e) && C6463n.m5227a(this.f5573f, c6449bt.f5573f) && C6463n.m5227a(this.f5574g, c6449bt.f5574g) && C6463n.m5226a(this.f5575h, c6449bt.f5575h) && C6463n.m5227a(this.f5576i, c6449bt.f5576i) && C6463n.m5227a(this.f5577j, c6449bt.f5577j) && C6463n.m5225a(this.f5578k, c6449bt.f5578k) && C6463n.m5225a(this.f5579l, c6449bt.f5579l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5568a = c6460k.m5199a(0, true);
        this.f5569b = c6460k.m5199a(1, true);
        this.f5570c = c6460k.m5199a(2, true);
        this.f5571d = c6460k.m5200b(3, false);
        this.f5572e = c6460k.m5200b(4, false);
        this.f5573f = (C6448bs) c6460k.m5194a((AbstractC6462m) f5565m, 5, false);
        this.f5574g = (Map) c6460k.m5195a((C6460k) f5566n, 6, false);
        this.f5575h = c6460k.m5193a(this.f5575h, 7, false);
        this.f5576i = c6460k.m5200b(8, false);
        this.f5577j = c6460k.m5200b(9, false);
        this.f5578k = c6460k.m5191a(this.f5578k, 10, false);
        this.f5579l = c6460k.m5191a(this.f5579l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
        C6458i c6458i = new C6458i(sb, i10);
        c6458i.m5169a(this.f5568a, "enable");
        c6458i.m5169a(this.f5569b, "enableUserInfo");
        c6458i.m5169a(this.f5570c, "enableQuery");
        c6458i.m5166a(this.f5571d, "url");
        c6458i.m5166a(this.f5572e, "expUrl");
        c6458i.m5165a((AbstractC6462m) this.f5573f, "security");
        c6458i.m5167a((Map) this.f5574g, "valueMap");
        c6458i.m5164a(this.f5575h, "strategylastUpdateTime");
        c6458i.m5166a(this.f5576i, "httpsUrl");
        c6458i.m5166a(this.f5577j, "httpsExpUrl");
        c6458i.m5163a(this.f5578k, "eventRecordCount");
        c6458i.m5163a(this.f5579l, "eventTimeInterval");
    }
}
