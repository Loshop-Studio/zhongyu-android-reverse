package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes4.dex */
public final class C6478g extends AbstractC6484m {

    /* renamed from: k */
    static byte[] f4953k = null;

    /* renamed from: l */
    static Map<String, String> f4954l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f4955m = true;

    /* renamed from: g */
    public byte[] f4962g;

    /* renamed from: i */
    public Map<String, String> f4964i;

    /* renamed from: j */
    public Map<String, String> f4965j;

    /* renamed from: a */
    public short f4956a = 0;

    /* renamed from: b */
    public byte f4957b = 0;

    /* renamed from: c */
    public int f4958c = 0;

    /* renamed from: d */
    public int f4959d = 0;

    /* renamed from: e */
    public String f4960e = null;

    /* renamed from: f */
    public String f4961f = null;

    /* renamed from: h */
    public int f4963h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4582a(this.f4956a, 1);
        c6483l.m4574a(this.f4957b, 2);
        c6483l.m4575a(this.f4958c, 3);
        c6483l.m4575a(this.f4959d, 4);
        c6483l.m4579a(this.f4960e, 5);
        c6483l.m4579a(this.f4961f, 6);
        c6483l.m4584a(this.f4962g, 7);
        c6483l.m4575a(this.f4963h, 8);
        c6483l.m4581a((Map) this.f4964i, 9);
        c6483l.m4581a((Map) this.f4965j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4955m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C6478g c6478g = (C6478g) obj;
        return C6485n.m4585a(1, (int) c6478g.f4956a) && C6485n.m4585a(1, (int) c6478g.f4957b) && C6485n.m4585a(1, c6478g.f4958c) && C6485n.m4585a(1, c6478g.f4959d) && C6485n.m4587a((Object) 1, (Object) c6478g.f4960e) && C6485n.m4587a((Object) 1, (Object) c6478g.f4961f) && C6485n.m4587a((Object) 1, (Object) c6478g.f4962g) && C6485n.m4585a(1, c6478g.f4963h) && C6485n.m4587a((Object) 1, (Object) c6478g.f4964i) && C6485n.m4587a((Object) 1, (Object) c6478g.f4965j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        try {
            this.f4956a = c6482k.m4557a(this.f4956a, 1, true);
            this.f4957b = c6482k.m4550a(this.f4957b, 2, true);
            this.f4958c = c6482k.m4551a(this.f4958c, 3, true);
            this.f4959d = c6482k.m4551a(this.f4959d, 4, true);
            this.f4960e = c6482k.m4560b(5, true);
            this.f4961f = c6482k.m4560b(6, true);
            if (f4953k == null) {
                f4953k = new byte[]{0};
            }
            this.f4962g = c6482k.m4561c(7, true);
            this.f4963h = c6482k.m4551a(this.f4963h, 8, true);
            if (f4954l == null) {
                HashMap map = new HashMap();
                f4954l = map;
                map.put("", "");
            }
            this.f4964i = (Map) c6482k.m4555a((C6482k) f4954l, 9, true);
            if (f4954l == null) {
                HashMap map2 = new HashMap();
                f4954l = map2;
                map2.put("", "");
            }
            this.f4965j = (Map) c6482k.m4555a((C6482k) f4954l, 10, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            System.out.println("RequestPacket decode error " + C6477f.m4509a(this.f4962g));
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
        C6480i c6480i = new C6480i(sb, i10);
        c6480i.m4528a(this.f4956a, "iVersion");
        c6480i.m4522a(this.f4957b, "cPacketType");
        c6480i.m4523a(this.f4958c, "iMessageType");
        c6480i.m4523a(this.f4959d, "iRequestId");
        c6480i.m4526a(this.f4960e, "sServantName");
        c6480i.m4526a(this.f4961f, "sFuncName");
        c6480i.m4530a(this.f4962g, "sBuffer");
        c6480i.m4523a(this.f4963h, "iTimeout");
        c6480i.m4527a((Map) this.f4964i, "context");
        c6480i.m4527a((Map) this.f4965j, NotificationCompat.CATEGORY_STATUS);
    }
}
