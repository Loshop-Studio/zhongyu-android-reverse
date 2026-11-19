package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes3.dex */
public final class C4107g extends AbstractC4123m {

    /* renamed from: k */
    static byte[] f3819k = null;

    /* renamed from: l */
    static Map<String, String> f3820l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f3821m = true;

    /* renamed from: g */
    public byte[] f3828g;

    /* renamed from: i */
    public Map<String, String> f3830i;

    /* renamed from: j */
    public Map<String, String> f3831j;

    /* renamed from: a */
    public short f3822a = 0;

    /* renamed from: b */
    public byte f3823b = 0;

    /* renamed from: c */
    public int f3824c = 0;

    /* renamed from: d */
    public int f3825d = 0;

    /* renamed from: e */
    public String f3826e = null;

    /* renamed from: f */
    public String f3827f = null;

    /* renamed from: h */
    public int f3829h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3318a(this.f3822a, 1);
        c4121l.m3310a(this.f3823b, 2);
        c4121l.m3311a(this.f3824c, 3);
        c4121l.m3311a(this.f3825d, 4);
        c4121l.m3315a(this.f3826e, 5);
        c4121l.m3315a(this.f3827f, 6);
        c4121l.m3320a(this.f3828g, 7);
        c4121l.m3311a(this.f3829h, 8);
        c4121l.m3317a((Map) this.f3830i, 9);
        c4121l.m3317a((Map) this.f3831j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f3821m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C4107g c4107g = (C4107g) obj;
        return C4125n.m3321a(1, (int) c4107g.f3822a) && C4125n.m3321a(1, (int) c4107g.f3823b) && C4125n.m3321a(1, c4107g.f3824c) && C4125n.m3321a(1, c4107g.f3825d) && C4125n.m3323a((Object) 1, (Object) c4107g.f3826e) && C4125n.m3323a((Object) 1, (Object) c4107g.f3827f) && C4125n.m3323a((Object) 1, (Object) c4107g.f3828g) && C4125n.m3321a(1, c4107g.f3829h) && C4125n.m3323a((Object) 1, (Object) c4107g.f3830i) && C4125n.m3323a((Object) 1, (Object) c4107g.f3831j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        try {
            this.f3822a = c4119k.m3293a(this.f3822a, 1, true);
            this.f3823b = c4119k.m3286a(this.f3823b, 2, true);
            this.f3824c = c4119k.m3287a(this.f3824c, 3, true);
            this.f3825d = c4119k.m3287a(this.f3825d, 4, true);
            this.f3826e = c4119k.m3296b(5, true);
            this.f3827f = c4119k.m3296b(6, true);
            if (f3819k == null) {
                f3819k = new byte[]{0};
            }
            this.f3828g = c4119k.m3297c(7, true);
            this.f3829h = c4119k.m3287a(this.f3829h, 8, true);
            if (f3820l == null) {
                HashMap map = new HashMap();
                f3820l = map;
                map.put("", "");
            }
            this.f3830i = (Map) c4119k.m3291a((C4119k) f3820l, 9, true);
            if (f3820l == null) {
                HashMap map2 = new HashMap();
                f3820l = map2;
                map2.put("", "");
            }
            this.f3831j = (Map) c4119k.m3291a((C4119k) f3820l, 10, true);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("RequestPacket decode error " + C4104f.m3245a(this.f3828g));
            throw new RuntimeException(e);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
        C4113i c4113i = new C4113i(sb, i);
        c4113i.m3264a(this.f3822a, "iVersion");
        c4113i.m3258a(this.f3823b, "cPacketType");
        c4113i.m3259a(this.f3824c, "iMessageType");
        c4113i.m3259a(this.f3825d, "iRequestId");
        c4113i.m3262a(this.f3826e, "sServantName");
        c4113i.m3262a(this.f3827f, "sFuncName");
        c4113i.m3266a(this.f3828g, "sBuffer");
        c4113i.m3259a(this.f3829h, "iTimeout");
        c4113i.m3263a((Map) this.f3830i, "context");
        c4113i.m3263a((Map) this.f3831j, NotificationCompat.CATEGORY_STATUS);
    }
}
