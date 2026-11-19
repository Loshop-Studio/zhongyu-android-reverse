package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes3.dex */
public final class C5831e extends C5830d {

    /* renamed from: h */
    static HashMap<String, byte[]> f4325h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f4326i;

    /* renamed from: g */
    protected C5833g f4327g;

    /* renamed from: j */
    private int f4328j;

    public C5831e() {
        C5833g c5833g = new C5833g();
        this.f4327g = c5833g;
        this.f4328j = 0;
        c5833g.f4334a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C5830d, com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public final <T> void mo4145a(String str, T t6) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo4145a(str, (String) t6);
    }

    @Override // com.tencent.bugly.proguard.C5830d
    /* renamed from: b */
    public final void mo4150b() {
        super.mo4150b();
        this.f4327g.f4334a = (short) 3;
    }

    /* renamed from: c */
    public final void m4153c(String str) {
        this.f4327g.f4339f = str;
    }

    /* renamed from: c */
    public final void m4152c() {
        this.f4327g.f4337d = 1;
    }

    /* renamed from: b */
    public final void m4151b(String str) {
        this.f4327g.f4338e = str;
    }

    @Override // com.tencent.bugly.proguard.C5830d, com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public final byte[] mo4147a() throws UnsupportedEncodingException {
        C5833g c5833g = this.f4327g;
        if (c5833g.f4334a == 2) {
            if (!c5833g.f4338e.equals("")) {
                if (this.f4327g.f4339f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c5833g.f4338e == null) {
                c5833g.f4338e = "";
            }
            if (c5833g.f4339f == null) {
                c5833g.f4339f = "";
            }
        }
        C5838l c5838l = new C5838l(0);
        c5838l.m4218a(this.f4319c);
        if (this.f4327g.f4334a == 2) {
            c5838l.m4226a((Map) this.f4317a, 0);
        } else {
            c5838l.m4226a((Map) ((C5830d) this).f4322e, 0);
        }
        this.f4327g.f4340g = C5840n.m4234a(c5838l.f4350a);
        C5838l c5838l2 = new C5838l(0);
        c5838l2.m4218a(this.f4319c);
        this.f4327g.mo4141a(c5838l2);
        byte[] bArrM4234a = C5840n.m4234a(c5838l2.f4350a);
        int length = bArrM4234a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM4234a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C5830d, com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public final void mo4146a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C5837k c5837k = new C5837k(bArr, (byte) 0);
                c5837k.m4197a(this.f4319c);
                this.f4327g.mo4140a(c5837k);
                C5833g c5833g = this.f4327g;
                if (c5833g.f4334a == 3) {
                    C5837k c5837k2 = new C5837k(c5833g.f4340g);
                    c5837k2.m4197a(this.f4319c);
                    if (f4325h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f4325h = map;
                        map.put("", new byte[0]);
                    }
                    ((C5830d) this).f4322e = c5837k2.m4201a((Map) f4325h, 0, false);
                    return;
                }
                C5837k c5837k3 = new C5837k(c5833g.f4340g);
                c5837k3.m4197a(this.f4319c);
                if (f4326i == null) {
                    f4326i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f4326i.put("", map2);
                }
                this.f4317a = c5837k3.m4201a((Map) f4326i, 0, false);
                this.f4318b = new HashMap<>();
                return;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
