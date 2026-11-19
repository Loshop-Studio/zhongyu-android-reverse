package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes4.dex */
public final class C6476e extends C6475d {

    /* renamed from: h */
    static HashMap<String, byte[]> f4947h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f4948i;

    /* renamed from: g */
    protected C6478g f4949g;

    /* renamed from: j */
    private int f4950j;

    public C6476e() {
        C6478g c6478g = new C6478g();
        this.f4949g = c6478g;
        this.f4950j = 0;
        c6478g.f4956a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C6475d, com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public final <T> void mo4500a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo4500a(str, (String) t10);
    }

    @Override // com.tencent.bugly.proguard.C6475d
    /* renamed from: b */
    public final void mo4505b() {
        super.mo4505b();
        this.f4949g.f4956a = (short) 3;
    }

    /* renamed from: c */
    public final void m4508c(String str) {
        this.f4949g.f4961f = str;
    }

    /* renamed from: c */
    public final void m4507c() {
        this.f4949g.f4959d = 1;
    }

    /* renamed from: b */
    public final void m4506b(String str) {
        this.f4949g.f4960e = str;
    }

    @Override // com.tencent.bugly.proguard.C6475d, com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public final byte[] mo4502a() throws UnsupportedEncodingException {
        C6478g c6478g = this.f4949g;
        if (c6478g.f4956a == 2) {
            if (!c6478g.f4960e.equals("")) {
                if (this.f4949g.f4961f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c6478g.f4960e == null) {
                c6478g.f4960e = "";
            }
            if (c6478g.f4961f == null) {
                c6478g.f4961f = "";
            }
        }
        C6483l c6483l = new C6483l(0);
        c6483l.m4573a(this.f4941c);
        if (this.f4949g.f4956a == 2) {
            c6483l.m4581a((Map) this.f4939a, 0);
        } else {
            c6483l.m4581a((Map) ((C6475d) this).f4944e, 0);
        }
        this.f4949g.f4962g = C6485n.m4589a(c6483l.f4972a);
        C6483l c6483l2 = new C6483l(0);
        c6483l2.m4573a(this.f4941c);
        this.f4949g.mo4496a(c6483l2);
        byte[] bArrM4589a = C6485n.m4589a(c6483l2.f4972a);
        int length = bArrM4589a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM4589a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C6475d, com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public final void mo4501a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C6482k c6482k = new C6482k(bArr, (byte) 0);
                c6482k.m4552a(this.f4941c);
                this.f4949g.mo4495a(c6482k);
                C6478g c6478g = this.f4949g;
                if (c6478g.f4956a == 3) {
                    C6482k c6482k2 = new C6482k(c6478g.f4962g);
                    c6482k2.m4552a(this.f4941c);
                    if (f4947h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f4947h = map;
                        map.put("", new byte[0]);
                    }
                    ((C6475d) this).f4944e = c6482k2.m4556a((Map) f4947h, 0, false);
                    return;
                }
                C6482k c6482k3 = new C6482k(c6478g.f4962g);
                c6482k3.m4552a(this.f4941c);
                if (f4948i == null) {
                    f4948i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f4948i.put("", map2);
                }
                this.f4939a = c6482k3.m4556a((Map) f4948i, 0, false);
                this.f4940b = new HashMap<>();
                return;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
