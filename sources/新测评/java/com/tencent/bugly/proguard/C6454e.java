package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes4.dex */
public final class C6454e extends C6453d {

    /* renamed from: h */
    static HashMap<String, byte[]> f5604h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f5605i;

    /* renamed from: g */
    protected C6456g f5606g;

    /* renamed from: j */
    private int f5607j;

    public C6454e() {
        C6456g c6456g = new C6456g();
        this.f5606g = c6456g;
        this.f5607j = 0;
        c6456g.f5613a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C6453d, com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public final <T> void mo5140a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo5140a(str, (String) t10);
    }

    @Override // com.tencent.bugly.proguard.C6453d
    /* renamed from: b */
    public final void mo5145b() {
        super.mo5145b();
        this.f5606g.f5613a = (short) 3;
    }

    /* renamed from: c */
    public final void m5148c(String str) {
        this.f5606g.f5618f = str;
    }

    /* renamed from: c */
    public final void m5147c() {
        this.f5606g.f5616d = 1;
    }

    /* renamed from: b */
    public final void m5146b(String str) {
        this.f5606g.f5617e = str;
    }

    @Override // com.tencent.bugly.proguard.C6453d, com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public final byte[] mo5142a() throws UnsupportedEncodingException {
        C6456g c6456g = this.f5606g;
        if (c6456g.f5613a == 2) {
            if (!c6456g.f5617e.equals("")) {
                if (this.f5606g.f5618f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c6456g.f5617e == null) {
                c6456g.f5617e = "";
            }
            if (c6456g.f5618f == null) {
                c6456g.f5618f = "";
            }
        }
        C6461l c6461l = new C6461l(0);
        c6461l.m5213a(this.f5598c);
        if (this.f5606g.f5613a == 2) {
            c6461l.m5221a((Map) this.f5596a, 0);
        } else {
            c6461l.m5221a((Map) ((C6453d) this).f5601e, 0);
        }
        this.f5606g.f5619g = C6463n.m5229a(c6461l.f5629a);
        C6461l c6461l2 = new C6461l(0);
        c6461l2.m5213a(this.f5598c);
        this.f5606g.mo5136a(c6461l2);
        byte[] bArrM5229a = C6463n.m5229a(c6461l2.f5629a);
        int length = bArrM5229a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM5229a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C6453d, com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public final void mo5141a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C6460k c6460k = new C6460k(bArr, (byte) 0);
                c6460k.m5192a(this.f5598c);
                this.f5606g.mo5135a(c6460k);
                C6456g c6456g = this.f5606g;
                if (c6456g.f5613a == 3) {
                    C6460k c6460k2 = new C6460k(c6456g.f5619g);
                    c6460k2.m5192a(this.f5598c);
                    if (f5604h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f5604h = map;
                        map.put("", new byte[0]);
                    }
                    ((C6453d) this).f5601e = c6460k2.m5196a((Map) f5604h, 0, false);
                    return;
                }
                C6460k c6460k3 = new C6460k(c6456g.f5619g);
                c6460k3.m5192a(this.f5598c);
                if (f5605i == null) {
                    f5605i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f5605i.put("", map2);
                }
                this.f5596a = c6460k3.m5196a((Map) f5605i, 0, false);
                this.f5597b = new HashMap<>();
                return;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
