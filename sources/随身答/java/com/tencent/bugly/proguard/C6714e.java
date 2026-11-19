package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes4.dex */
public final class C6714e extends C6713d {

    /* renamed from: h */
    static HashMap<String, byte[]> f6181h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f6182i;

    /* renamed from: g */
    protected C6716g f6183g;

    /* renamed from: j */
    private int f6184j;

    public C6714e() {
        C6716g c6716g = new C6716g();
        this.f6183g = c6716g;
        this.f6184j = 0;
        c6716g.f6190a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C6713d, com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public final <T> void mo5319a(String str, T t9) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo5319a(str, (String) t9);
    }

    @Override // com.tencent.bugly.proguard.C6713d
    /* renamed from: b */
    public final void mo5324b() {
        super.mo5324b();
        this.f6183g.f6190a = (short) 3;
    }

    /* renamed from: c */
    public final void m5327c(String str) {
        this.f6183g.f6195f = str;
    }

    /* renamed from: c */
    public final void m5326c() {
        this.f6183g.f6193d = 1;
    }

    /* renamed from: b */
    public final void m5325b(String str) {
        this.f6183g.f6194e = str;
    }

    @Override // com.tencent.bugly.proguard.C6713d, com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public final byte[] mo5321a() throws UnsupportedEncodingException {
        C6716g c6716g = this.f6183g;
        if (c6716g.f6190a == 2) {
            if (!c6716g.f6194e.equals("")) {
                if (this.f6183g.f6195f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c6716g.f6194e == null) {
                c6716g.f6194e = "";
            }
            if (c6716g.f6195f == null) {
                c6716g.f6195f = "";
            }
        }
        C6721l c6721l = new C6721l(0);
        c6721l.m5392a(this.f6175c);
        if (this.f6183g.f6190a == 2) {
            c6721l.m5400a((Map) this.f6173a, 0);
        } else {
            c6721l.m5400a((Map) ((C6713d) this).f6178e, 0);
        }
        this.f6183g.f6196g = C6723n.m5408a(c6721l.f6206a);
        C6721l c6721l2 = new C6721l(0);
        c6721l2.m5392a(this.f6175c);
        this.f6183g.mo5315a(c6721l2);
        byte[] bArrM5408a = C6723n.m5408a(c6721l2.f6206a);
        int length = bArrM5408a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM5408a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C6713d, com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public final void mo5320a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C6720k c6720k = new C6720k(bArr, (byte) 0);
                c6720k.m5371a(this.f6175c);
                this.f6183g.mo5314a(c6720k);
                C6716g c6716g = this.f6183g;
                if (c6716g.f6190a == 3) {
                    C6720k c6720k2 = new C6720k(c6716g.f6196g);
                    c6720k2.m5371a(this.f6175c);
                    if (f6181h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f6181h = map;
                        map.put("", new byte[0]);
                    }
                    ((C6713d) this).f6178e = c6720k2.m5375a((Map) f6181h, 0, false);
                    return;
                }
                C6720k c6720k3 = new C6720k(c6716g.f6196g);
                c6720k3.m5371a(this.f6175c);
                if (f6182i == null) {
                    f6182i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f6182i.put("", map2);
                }
                this.f6173a = c6720k3.m5375a((Map) f6182i, 0, false);
                this.f6174b = new HashMap<>();
                return;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
