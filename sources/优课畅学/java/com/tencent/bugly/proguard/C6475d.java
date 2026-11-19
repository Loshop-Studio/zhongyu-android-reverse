package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes4.dex */
public class C6475d extends C6474c {

    /* renamed from: e */
    protected HashMap<String, byte[]> f4944e = null;

    /* renamed from: g */
    private HashMap<String, Object> f4946g = new HashMap<>();

    /* renamed from: f */
    C6482k f4945f = new C6482k();

    /* renamed from: c */
    private void m4503c(String str, Object obj) {
        this.f4946g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4499a(String str) {
        super.mo4499a(str);
    }

    /* renamed from: b */
    public void mo4505b() {
        this.f4944e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public <T> void mo4500a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f4944e == null) {
            super.mo4500a(str, (String) t10);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t10 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C6483l c6483l = new C6483l();
        c6483l.m4573a(this.f4941c);
        c6483l.m4578a(t10, 0);
        this.f4944e.put(str, C6485n.m4589a(c6483l.f4972a));
    }

    /* renamed from: b */
    public final <T> T m4504b(String str, T t10) {
        HashMap<String, byte[]> map = this.f4944e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f4946g.containsKey(str)) {
                return (T) this.f4946g.get(str);
            }
            try {
                this.f4945f.m4558a(this.f4944e.get(str));
                this.f4945f.m4552a(this.f4941c);
                T t11 = (T) this.f4945f.m4555a((C6482k) t10, 0, true);
                if (t11 == null) {
                    return t11;
                }
                m4503c(str, t11);
                return t11;
            } catch (Exception e10) {
                throw new C6451b(e10);
            }
        }
        if (!this.f4939a.containsKey(str)) {
            return null;
        }
        if (this.f4946g.containsKey(str)) {
            return (T) this.f4946g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f4939a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f4945f.m4558a(value);
            this.f4945f.m4552a(this.f4941c);
            T t12 = (T) this.f4945f.m4555a((C6482k) t10, 0, true);
            m4503c(str, t12);
            return t12;
        } catch (Exception e11) {
            throw new C6451b(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public byte[] mo4502a() throws UnsupportedEncodingException {
        if (this.f4944e != null) {
            C6483l c6483l = new C6483l(0);
            c6483l.m4573a(this.f4941c);
            c6483l.m4581a((Map) this.f4944e, 0);
            return C6485n.m4589a(c6483l.f4972a);
        }
        return super.mo4502a();
    }

    @Override // com.tencent.bugly.proguard.C6474c
    /* renamed from: a */
    public void mo4501a(byte[] bArr) {
        try {
            super.mo4501a(bArr);
        } catch (Exception unused) {
            this.f4945f.m4558a(bArr);
            this.f4945f.m4552a(this.f4941c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f4944e = this.f4945f.m4556a((Map) map, 0, false);
        }
    }
}
