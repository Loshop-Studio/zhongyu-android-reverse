package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes3.dex */
public final class C4101e extends C4098d {

    /* renamed from: h */
    static HashMap<String, byte[]> f3808h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f3809i;

    /* renamed from: g */
    protected C4107g f3810g;

    /* renamed from: j */
    private int f3811j;

    public C4101e() {
        C4107g c4107g = new C4107g();
        this.f3810g = c4107g;
        this.f3811j = 0;
        c4107g.f3822a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C4098d, com.tencent.bugly.proguard.AbstractC4100d1
    /* renamed from: a */
    public final <T> void mo3237a(String str, T t8) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo3237a(str, t8);
    }

    @Override // com.tencent.bugly.proguard.C4098d
    /* renamed from: b */
    public final void mo3241b() {
        super.mo3241b();
        this.f3810g.f3822a = (short) 3;
    }

    /* renamed from: c */
    public final void m3244c(String str) {
        this.f3810g.f3827f = str;
    }

    /* renamed from: c */
    public final void m3243c() {
        this.f3810g.f3825d = 1;
    }

    /* renamed from: b */
    public final void m3242b(String str) {
        this.f3810g.f3826e = str;
    }

    @Override // com.tencent.bugly.proguard.C4098d
    /* renamed from: a */
    public final byte[] mo3239a() throws UnsupportedEncodingException {
        C4107g c4107g = this.f3810g;
        if (c4107g.f3822a == 2) {
            if (!c4107g.f3826e.equals("")) {
                if (this.f3810g.f3827f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c4107g.f3826e == null) {
                c4107g.f3826e = "";
            }
            if (c4107g.f3827f == null) {
                c4107g.f3827f = "";
            }
        }
        C4121l c4121l = new C4121l(0);
        c4121l.m3309a(this.f3805c);
        if (this.f3810g.f3822a == 2) {
            c4121l.m3317a((Map) this.f3803a, 0);
        } else {
            c4121l.m3317a((Map) ((C4098d) this).f3800e, 0);
        }
        this.f3810g.f3828g = C4125n.m3325a(c4121l.f3848a);
        C4121l c4121l2 = new C4121l(0);
        c4121l2.m3309a(this.f3805c);
        this.f3810g.mo3233a(c4121l2);
        byte[] bArrM3325a = C4125n.m3325a(c4121l2.f3848a);
        int length = bArrM3325a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM3325a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C4098d, com.tencent.bugly.proguard.AbstractC4100d1
    /* renamed from: a */
    public final void mo3238a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C4119k c4119k = new C4119k(bArr, (byte) 0);
                c4119k.m3288a(this.f3805c);
                this.f3810g.mo3232a(c4119k);
                C4107g c4107g = this.f3810g;
                if (c4107g.f3822a == 3) {
                    C4119k c4119k2 = new C4119k(c4107g.f3828g);
                    c4119k2.m3288a(this.f3805c);
                    if (f3808h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f3808h = map;
                        map.put("", new byte[0]);
                    }
                    ((C4098d) this).f3800e = c4119k2.m3292a((Map) f3808h, 0, false);
                    return;
                }
                C4119k c4119k3 = new C4119k(c4107g.f3828g);
                c4119k3.m3288a(this.f3805c);
                if (f3809i == null) {
                    f3809i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f3809i.put("", map2);
                }
                this.f3803a = c4119k3.m3292a((Map) f3809i, 0, false);
                this.f3804b = new HashMap<>();
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
