package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes3.dex */
public final class C5833g extends AbstractC5839m {

    /* renamed from: k */
    static byte[] f4331k = null;

    /* renamed from: l */
    static Map<String, String> f4332l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f4333m = true;

    /* renamed from: g */
    public byte[] f4340g;

    /* renamed from: i */
    public Map<String, String> f4342i;

    /* renamed from: j */
    public Map<String, String> f4343j;

    /* renamed from: a */
    public short f4334a = 0;

    /* renamed from: b */
    public byte f4335b = 0;

    /* renamed from: c */
    public int f4336c = 0;

    /* renamed from: d */
    public int f4337d = 0;

    /* renamed from: e */
    public String f4338e = null;

    /* renamed from: f */
    public String f4339f = null;

    /* renamed from: h */
    public int f4341h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4227a(this.f4334a, 1);
        c5838l.m4219a(this.f4335b, 2);
        c5838l.m4220a(this.f4336c, 3);
        c5838l.m4220a(this.f4337d, 4);
        c5838l.m4224a(this.f4338e, 5);
        c5838l.m4224a(this.f4339f, 6);
        c5838l.m4229a(this.f4340g, 7);
        c5838l.m4220a(this.f4341h, 8);
        c5838l.m4226a((Map) this.f4342i, 9);
        c5838l.m4226a((Map) this.f4343j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4333m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C5833g c5833g = (C5833g) obj;
        return C5840n.m4230a(1, (int) c5833g.f4334a) && C5840n.m4230a(1, (int) c5833g.f4335b) && C5840n.m4230a(1, c5833g.f4336c) && C5840n.m4230a(1, c5833g.f4337d) && C5840n.m4232a((Object) 1, (Object) c5833g.f4338e) && C5840n.m4232a((Object) 1, (Object) c5833g.f4339f) && C5840n.m4232a((Object) 1, (Object) c5833g.f4340g) && C5840n.m4230a(1, c5833g.f4341h) && C5840n.m4232a((Object) 1, (Object) c5833g.f4342i) && C5840n.m4232a((Object) 1, (Object) c5833g.f4343j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        try {
            this.f4334a = c5837k.m4202a(this.f4334a, 1, true);
            this.f4335b = c5837k.m4195a(this.f4335b, 2, true);
            this.f4336c = c5837k.m4196a(this.f4336c, 3, true);
            this.f4337d = c5837k.m4196a(this.f4337d, 4, true);
            this.f4338e = c5837k.m4205b(5, true);
            this.f4339f = c5837k.m4205b(6, true);
            if (f4331k == null) {
                f4331k = new byte[]{0};
            }
            this.f4340g = c5837k.m4206c(7, true);
            this.f4341h = c5837k.m4196a(this.f4341h, 8, true);
            if (f4332l == null) {
                HashMap map = new HashMap();
                f4332l = map;
                map.put("", "");
            }
            this.f4342i = (Map) c5837k.m4200a((C5837k) f4332l, 9, true);
            if (f4332l == null) {
                HashMap map2 = new HashMap();
                f4332l = map2;
                map2.put("", "");
            }
            this.f4343j = (Map) c5837k.m4200a((C5837k) f4332l, 10, true);
        } catch (Exception e6) {
            e6.printStackTrace();
            System.out.println("RequestPacket decode error " + C5832f.m4154a(this.f4340g));
            throw new RuntimeException(e6);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
        C5835i c5835i = new C5835i(sb, i6);
        c5835i.m4173a(this.f4334a, "iVersion");
        c5835i.m4167a(this.f4335b, "cPacketType");
        c5835i.m4168a(this.f4336c, "iMessageType");
        c5835i.m4168a(this.f4337d, "iRequestId");
        c5835i.m4171a(this.f4338e, "sServantName");
        c5835i.m4171a(this.f4339f, "sFuncName");
        c5835i.m4175a(this.f4340g, "sBuffer");
        c5835i.m4168a(this.f4341h, "iTimeout");
        c5835i.m4172a((Map) this.f4342i, "context");
        c5835i.m4172a((Map) this.f4343j, NotificationCompat.CATEGORY_STATUS);
    }
}
