package com.tencent.bugly.proguard;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
/* loaded from: classes4.dex */
public final class C6456g extends AbstractC6462m {

    /* renamed from: k */
    static byte[] f5610k = null;

    /* renamed from: l */
    static Map<String, String> f5611l = null;

    /* renamed from: m */
    static final /* synthetic */ boolean f5612m = true;

    /* renamed from: g */
    public byte[] f5619g;

    /* renamed from: i */
    public Map<String, String> f5621i;

    /* renamed from: j */
    public Map<String, String> f5622j;

    /* renamed from: a */
    public short f5613a = 0;

    /* renamed from: b */
    public byte f5614b = 0;

    /* renamed from: c */
    public int f5615c = 0;

    /* renamed from: d */
    public int f5616d = 0;

    /* renamed from: e */
    public String f5617e = null;

    /* renamed from: f */
    public String f5618f = null;

    /* renamed from: h */
    public int f5620h = 0;

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5222a(this.f5613a, 1);
        c6461l.m5214a(this.f5614b, 2);
        c6461l.m5215a(this.f5615c, 3);
        c6461l.m5215a(this.f5616d, 4);
        c6461l.m5219a(this.f5617e, 5);
        c6461l.m5219a(this.f5618f, 6);
        c6461l.m5224a(this.f5619g, 7);
        c6461l.m5215a(this.f5620h, 8);
        c6461l.m5221a((Map) this.f5621i, 9);
        c6461l.m5221a((Map) this.f5622j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f5612m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        C6456g c6456g = (C6456g) obj;
        return C6463n.m5225a(1, (int) c6456g.f5613a) && C6463n.m5225a(1, (int) c6456g.f5614b) && C6463n.m5225a(1, c6456g.f5615c) && C6463n.m5225a(1, c6456g.f5616d) && C6463n.m5227a((Object) 1, (Object) c6456g.f5617e) && C6463n.m5227a((Object) 1, (Object) c6456g.f5618f) && C6463n.m5227a((Object) 1, (Object) c6456g.f5619g) && C6463n.m5225a(1, c6456g.f5620h) && C6463n.m5227a((Object) 1, (Object) c6456g.f5621i) && C6463n.m5227a((Object) 1, (Object) c6456g.f5622j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        try {
            this.f5613a = c6460k.m5197a(this.f5613a, 1, true);
            this.f5614b = c6460k.m5190a(this.f5614b, 2, true);
            this.f5615c = c6460k.m5191a(this.f5615c, 3, true);
            this.f5616d = c6460k.m5191a(this.f5616d, 4, true);
            this.f5617e = c6460k.m5200b(5, true);
            this.f5618f = c6460k.m5200b(6, true);
            if (f5610k == null) {
                f5610k = new byte[]{0};
            }
            this.f5619g = c6460k.m5201c(7, true);
            this.f5620h = c6460k.m5191a(this.f5620h, 8, true);
            if (f5611l == null) {
                HashMap map = new HashMap();
                f5611l = map;
                map.put("", "");
            }
            this.f5621i = (Map) c6460k.m5195a((C6460k) f5611l, 9, true);
            if (f5611l == null) {
                HashMap map2 = new HashMap();
                f5611l = map2;
                map2.put("", "");
            }
            this.f5622j = (Map) c6460k.m5195a((C6460k) f5611l, 10, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            System.out.println("RequestPacket decode error " + C6455f.m5149a(this.f5619g));
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
        C6458i c6458i = new C6458i(sb, i10);
        c6458i.m5168a(this.f5613a, "iVersion");
        c6458i.m5162a(this.f5614b, "cPacketType");
        c6458i.m5163a(this.f5615c, "iMessageType");
        c6458i.m5163a(this.f5616d, "iRequestId");
        c6458i.m5166a(this.f5617e, "sServantName");
        c6458i.m5166a(this.f5618f, "sFuncName");
        c6458i.m5170a(this.f5619g, "sBuffer");
        c6458i.m5163a(this.f5620h, "iTimeout");
        c6458i.m5167a((Map) this.f5621i, "context");
        c6458i.m5167a((Map) this.f5622j, NotificationCompat.CATEGORY_STATUS);
    }
}
