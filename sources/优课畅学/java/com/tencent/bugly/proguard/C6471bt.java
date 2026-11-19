package com.tencent.bugly.proguard;

import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bt */
/* loaded from: classes4.dex */
public final class C6471bt extends AbstractC6484m implements Cloneable {

    /* renamed from: m */
    static C6470bs f4908m = new C6470bs();

    /* renamed from: n */
    static Map<String, String> f4909n = null;

    /* renamed from: o */
    static final /* synthetic */ boolean f4910o = true;

    /* renamed from: a */
    public boolean f4911a = true;

    /* renamed from: b */
    public boolean f4912b = true;

    /* renamed from: c */
    public boolean f4913c = true;

    /* renamed from: d */
    public String f4914d = "";

    /* renamed from: e */
    public String f4915e = "";

    /* renamed from: f */
    public C6470bs f4916f = null;

    /* renamed from: g */
    public Map<String, String> f4917g = null;

    /* renamed from: h */
    public long f4918h = 0;

    /* renamed from: i */
    public String f4919i = "";

    /* renamed from: j */
    public String f4920j = "";

    /* renamed from: k */
    public int f4921k = 0;

    /* renamed from: l */
    public int f4922l = 0;

    static {
        HashMap map = new HashMap();
        f4909n = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4583a(this.f4911a, 0);
        c6483l.m4583a(this.f4912b, 1);
        c6483l.m4583a(this.f4913c, 2);
        String str = this.f4914d;
        if (str != null) {
            c6483l.m4579a(str, 3);
        }
        String str2 = this.f4915e;
        if (str2 != null) {
            c6483l.m4579a(str2, 4);
        }
        C6470bs c6470bs = this.f4916f;
        if (c6470bs != null) {
            c6483l.m4577a((AbstractC6484m) c6470bs, 5);
        }
        Map<String, String> map = this.f4917g;
        if (map != null) {
            c6483l.m4581a((Map) map, 6);
        }
        c6483l.m4576a(this.f4918h, 7);
        String str3 = this.f4919i;
        if (str3 != null) {
            c6483l.m4579a(str3, 8);
        }
        String str4 = this.f4920j;
        if (str4 != null) {
            c6483l.m4579a(str4, 9);
        }
        c6483l.m4575a(this.f4921k, 10);
        c6483l.m4575a(this.f4922l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4910o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C6471bt c6471bt = (C6471bt) obj;
        return C6485n.m4588a(this.f4911a, c6471bt.f4911a) && C6485n.m4588a(this.f4912b, c6471bt.f4912b) && C6485n.m4588a(this.f4913c, c6471bt.f4913c) && C6485n.m4587a(this.f4914d, c6471bt.f4914d) && C6485n.m4587a(this.f4915e, c6471bt.f4915e) && C6485n.m4587a(this.f4916f, c6471bt.f4916f) && C6485n.m4587a(this.f4917g, c6471bt.f4917g) && C6485n.m4586a(this.f4918h, c6471bt.f4918h) && C6485n.m4587a(this.f4919i, c6471bt.f4919i) && C6485n.m4587a(this.f4920j, c6471bt.f4920j) && C6485n.m4585a(this.f4921k, c6471bt.f4921k) && C6485n.m4585a(this.f4922l, c6471bt.f4922l);
    }

    public final int hashCode() throws Exception {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4911a = c6482k.m4559a(0, true);
        this.f4912b = c6482k.m4559a(1, true);
        this.f4913c = c6482k.m4559a(2, true);
        this.f4914d = c6482k.m4560b(3, false);
        this.f4915e = c6482k.m4560b(4, false);
        this.f4916f = (C6470bs) c6482k.m4554a((AbstractC6484m) f4908m, 5, false);
        this.f4917g = (Map) c6482k.m4555a((C6482k) f4909n, 6, false);
        this.f4918h = c6482k.m4553a(this.f4918h, 7, false);
        this.f4919i = c6482k.m4560b(8, false);
        this.f4920j = c6482k.m4560b(9, false);
        this.f4921k = c6482k.m4551a(this.f4921k, 10, false);
        this.f4922l = c6482k.m4551a(this.f4922l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
        C6480i c6480i = new C6480i(sb, i10);
        c6480i.m4529a(this.f4911a, "enable");
        c6480i.m4529a(this.f4912b, "enableUserInfo");
        c6480i.m4529a(this.f4913c, "enableQuery");
        c6480i.m4526a(this.f4914d, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        c6480i.m4526a(this.f4915e, "expUrl");
        c6480i.m4525a((AbstractC6484m) this.f4916f, "security");
        c6480i.m4527a((Map) this.f4917g, "valueMap");
        c6480i.m4524a(this.f4918h, "strategylastUpdateTime");
        c6480i.m4526a(this.f4919i, "httpsUrl");
        c6480i.m4526a(this.f4920j, "httpsExpUrl");
        c6480i.m4523a(this.f4921k, "eventRecordCount");
        c6480i.m4523a(this.f4922l, "eventTimeInterval");
    }
}
