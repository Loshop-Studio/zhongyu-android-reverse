package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes4.dex */
public final class C6716g extends AbstractC6722m {

    /* renamed from: k */
    static byte[] f6187k = null;

    /* renamed from: l */
    static Map<String, String> f6188l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f6189m = true;

    /* renamed from: g */
    public byte[] f6196g;

    /* renamed from: i */
    public Map<String, String> f6198i;

    /* renamed from: j */
    public Map<String, String> f6199j;

    /* renamed from: a */
    public short f6190a = 0;

    /* renamed from: b */
    public byte f6191b = 0;

    /* renamed from: c */
    public int f6192c = 0;

    /* renamed from: d */
    public int f6193d = 0;

    /* renamed from: e */
    public String f6194e = null;

    /* renamed from: f */
    public String f6195f = null;

    /* renamed from: h */
    public int f6197h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5401a(this.f6190a, 1);
        c6721l.m5393a(this.f6191b, 2);
        c6721l.m5394a(this.f6192c, 3);
        c6721l.m5394a(this.f6193d, 4);
        c6721l.m5398a(this.f6194e, 5);
        c6721l.m5398a(this.f6195f, 6);
        c6721l.m5403a(this.f6196g, 7);
        c6721l.m5394a(this.f6197h, 8);
        c6721l.m5400a((Map) this.f6198i, 9);
        c6721l.m5400a((Map) this.f6199j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f6189m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C6716g c6716g = (C6716g) obj;
        return C6723n.m5404a(1, (int) c6716g.f6190a) && C6723n.m5404a(1, (int) c6716g.f6191b) && C6723n.m5404a(1, c6716g.f6192c) && C6723n.m5404a(1, c6716g.f6193d) && C6723n.m5406a((Object) 1, (Object) c6716g.f6194e) && C6723n.m5406a((Object) 1, (Object) c6716g.f6195f) && C6723n.m5406a((Object) 1, (Object) c6716g.f6196g) && C6723n.m5404a(1, c6716g.f6197h) && C6723n.m5406a((Object) 1, (Object) c6716g.f6198i) && C6723n.m5406a((Object) 1, (Object) c6716g.f6199j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        try {
            this.f6190a = c6720k.m5376a(this.f6190a, 1, true);
            this.f6191b = c6720k.m5369a(this.f6191b, 2, true);
            this.f6192c = c6720k.m5370a(this.f6192c, 3, true);
            this.f6193d = c6720k.m5370a(this.f6193d, 4, true);
            this.f6194e = c6720k.m5379b(5, true);
            this.f6195f = c6720k.m5379b(6, true);
            if (f6187k == null) {
                f6187k = new byte[]{0};
            }
            this.f6196g = c6720k.m5380c(7, true);
            this.f6197h = c6720k.m5370a(this.f6197h, 8, true);
            if (f6188l == null) {
                HashMap map = new HashMap();
                f6188l = map;
                map.put("", "");
            }
            this.f6198i = (Map) c6720k.m5374a((C6720k) f6188l, 9, true);
            if (f6188l == null) {
                HashMap map2 = new HashMap();
                f6188l = map2;
                map2.put("", "");
            }
            this.f6199j = (Map) c6720k.m5374a((C6720k) f6188l, 10, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            System.out.println("RequestPacket decode error " + C6715f.m5328a(this.f6196g));
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
        C6718i c6718i = new C6718i(sb, i9);
        c6718i.m5347a(this.f6190a, "iVersion");
        c6718i.m5341a(this.f6191b, "cPacketType");
        c6718i.m5342a(this.f6192c, "iMessageType");
        c6718i.m5342a(this.f6193d, "iRequestId");
        c6718i.m5345a(this.f6194e, "sServantName");
        c6718i.m5345a(this.f6195f, "sFuncName");
        c6718i.m5349a(this.f6196g, "sBuffer");
        c6718i.m5342a(this.f6197h, "iTimeout");
        c6718i.m5346a((Map) this.f6198i, "context");
        c6718i.m5346a((Map) this.f6199j, NotificationCompat.CATEGORY_STATUS);
    }
}
