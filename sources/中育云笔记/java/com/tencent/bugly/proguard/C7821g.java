package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes5.dex */
public final class C7821g extends AbstractC7827m {

    /* renamed from: k */
    static byte[] f14052k = null;

    /* renamed from: l */
    static Map<String, String> f14053l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f14054m = true;

    /* renamed from: g */
    public byte[] f14061g;

    /* renamed from: i */
    public Map<String, String> f14063i;

    /* renamed from: j */
    public Map<String, String> f14064j;

    /* renamed from: a */
    public short f14055a = 0;

    /* renamed from: b */
    public byte f14056b = 0;

    /* renamed from: c */
    public int f14057c = 0;

    /* renamed from: d */
    public int f14058d = 0;

    /* renamed from: e */
    public String f14059e = null;

    /* renamed from: f */
    public String f14060f = null;

    /* renamed from: h */
    public int f14062h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10912a(this.f14055a, 1);
        c7826l.m10904a(this.f14056b, 2);
        c7826l.m10905a(this.f14057c, 3);
        c7826l.m10905a(this.f14058d, 4);
        c7826l.m10909a(this.f14059e, 5);
        c7826l.m10909a(this.f14060f, 6);
        c7826l.m10914a(this.f14061g, 7);
        c7826l.m10905a(this.f14062h, 8);
        c7826l.m10911a((Map) this.f14063i, 9);
        c7826l.m10911a((Map) this.f14064j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f14054m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C7821g c7821g = (C7821g) obj;
        return C7828n.m10915a(1, (int) c7821g.f14055a) && C7828n.m10915a(1, (int) c7821g.f14056b) && C7828n.m10915a(1, c7821g.f14057c) && C7828n.m10915a(1, c7821g.f14058d) && C7828n.m10917a((Object) 1, (Object) c7821g.f14059e) && C7828n.m10917a((Object) 1, (Object) c7821g.f14060f) && C7828n.m10917a((Object) 1, (Object) c7821g.f14061g) && C7828n.m10915a(1, c7821g.f14062h) && C7828n.m10917a((Object) 1, (Object) c7821g.f14063i) && C7828n.m10917a((Object) 1, (Object) c7821g.f14064j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        try {
            this.f14055a = c7825k.m10887a(this.f14055a, 1, true);
            this.f14056b = c7825k.m10880a(this.f14056b, 2, true);
            this.f14057c = c7825k.m10881a(this.f14057c, 3, true);
            this.f14058d = c7825k.m10881a(this.f14058d, 4, true);
            this.f14059e = c7825k.m10890b(5, true);
            this.f14060f = c7825k.m10890b(6, true);
            if (f14052k == null) {
                f14052k = new byte[]{0};
            }
            this.f14061g = c7825k.m10891c(7, true);
            this.f14062h = c7825k.m10881a(this.f14062h, 8, true);
            if (f14053l == null) {
                HashMap map = new HashMap();
                f14053l = map;
                map.put("", "");
            }
            this.f14063i = (Map) c7825k.m10885a((C7825k) f14053l, 9, true);
            if (f14053l == null) {
                HashMap map2 = new HashMap();
                f14053l = map2;
                map2.put("", "");
            }
            this.f14064j = (Map) c7825k.m10885a((C7825k) f14053l, 10, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            System.out.println("RequestPacket decode error " + C7820f.m10839a(this.f14061g));
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
        C7823i c7823i = new C7823i(sb2, i10);
        c7823i.m10858a(this.f14055a, "iVersion");
        c7823i.m10852a(this.f14056b, "cPacketType");
        c7823i.m10853a(this.f14057c, "iMessageType");
        c7823i.m10853a(this.f14058d, "iRequestId");
        c7823i.m10856a(this.f14059e, "sServantName");
        c7823i.m10856a(this.f14060f, "sFuncName");
        c7823i.m10860a(this.f14061g, "sBuffer");
        c7823i.m10853a(this.f14062h, "iTimeout");
        c7823i.m10857a((Map) this.f14063i, "context");
        c7823i.m10857a((Map) this.f14064j, NotificationCompat.CATEGORY_STATUS);
    }
}
