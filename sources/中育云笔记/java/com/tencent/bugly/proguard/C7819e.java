package com.tencent.bugly.proguard;

import com.alibaba.android.arouter.utils.Consts;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes5.dex */
public final class C7819e extends C7818d {

    /* renamed from: h */
    static HashMap<String, byte[]> f14046h;

    /* renamed from: i */
    static HashMap<String, HashMap<String, byte[]>> f14047i;

    /* renamed from: g */
    protected C7821g f14048g;

    /* renamed from: j */
    private int f14049j;

    public C7819e() {
        C7821g c7821g = new C7821g();
        this.f14048g = c7821g;
        this.f14049j = 0;
        c7821g.f14055a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C7818d, com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public final <T> void mo10830a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str.startsWith(Consts.DOT)) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo10830a(str, t10);
    }

    @Override // com.tencent.bugly.proguard.C7818d
    /* renamed from: b */
    public final void mo10835b() {
        super.mo10835b();
        this.f14048g.f14055a = (short) 3;
    }

    /* renamed from: c */
    public final void m10838c(String str) {
        this.f14048g.f14060f = str;
    }

    /* renamed from: c */
    public final void m10837c() {
        this.f14048g.f14058d = 1;
    }

    /* renamed from: b */
    public final void m10836b(String str) {
        this.f14048g.f14059e = str;
    }

    @Override // com.tencent.bugly.proguard.C7818d, com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public final byte[] mo10832a() throws UnsupportedEncodingException {
        C7821g c7821g = this.f14048g;
        if (c7821g.f14055a == 2) {
            if (!c7821g.f14059e.equals("")) {
                if (this.f14048g.f14060f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c7821g.f14059e == null) {
                c7821g.f14059e = "";
            }
            if (c7821g.f14060f == null) {
                c7821g.f14060f = "";
            }
        }
        C7826l c7826l = new C7826l(0);
        c7826l.m10903a(this.f14040c);
        if (this.f14048g.f14055a == 2) {
            c7826l.m10911a((Map) this.f14038a, 0);
        } else {
            c7826l.m10911a((Map) ((C7818d) this).f14043e, 0);
        }
        this.f14048g.f14061g = C7828n.m10919a(c7826l.f14071a);
        C7826l c7826l2 = new C7826l(0);
        c7826l2.m10903a(this.f14040c);
        this.f14048g.mo10826a(c7826l2);
        byte[] bArrM10919a = C7828n.m10919a(c7826l2.f14071a);
        int length = bArrM10919a.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM10919a).flip();
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.bugly.proguard.C7818d, com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public final void mo10831a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C7825k c7825k = new C7825k(bArr, (byte) 0);
                c7825k.m10882a(this.f14040c);
                this.f14048g.mo10825a(c7825k);
                C7821g c7821g = this.f14048g;
                if (c7821g.f14055a == 3) {
                    C7825k c7825k2 = new C7825k(c7821g.f14061g);
                    c7825k2.m10882a(this.f14040c);
                    if (f14046h == null) {
                        HashMap<String, byte[]> map = new HashMap<>();
                        f14046h = map;
                        map.put("", new byte[0]);
                    }
                    ((C7818d) this).f14043e = c7825k2.m10886a((Map) f14046h, 0, false);
                    return;
                }
                C7825k c7825k3 = new C7825k(c7821g.f14061g);
                c7825k3.m10882a(this.f14040c);
                if (f14047i == null) {
                    f14047i = new HashMap<>();
                    HashMap<String, byte[]> map2 = new HashMap<>();
                    map2.put("", new byte[0]);
                    f14047i.put("", map2);
                }
                this.f14038a = c7825k3.m10886a((Map) f14047i, 0, false);
                this.f14039b = new HashMap<>();
                return;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
