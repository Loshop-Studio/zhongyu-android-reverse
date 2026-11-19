package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes5.dex */
public class C7818d extends AbstractC7817c {

    /* renamed from: e */
    protected HashMap<String, byte[]> f14043e = null;

    /* renamed from: g */
    private HashMap<String, Object> f14045g = new HashMap<>();

    /* renamed from: f */
    C7825k f14044f = new C7825k();

    /* renamed from: c */
    private void m10833c(String str, Object obj) {
        this.f14045g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10829a(String str) {
        super.mo10829a(str);
    }

    /* renamed from: b */
    public void mo10835b() {
        this.f14043e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public <T> void mo10830a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f14043e == null) {
            super.mo10830a(str, t10);
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
        C7826l c7826l = new C7826l();
        c7826l.m10903a(this.f14040c);
        c7826l.m10908a(t10, 0);
        this.f14043e.put(str, C7828n.m10919a(c7826l.f14071a));
    }

    /* renamed from: b */
    public final <T> T m10834b(String str, T t10) {
        HashMap<String, byte[]> map = this.f14043e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f14045g.containsKey(str)) {
                return (T) this.f14045g.get(str);
            }
            try {
                this.f14044f.m10888a(this.f14043e.get(str));
                this.f14044f.m10882a(this.f14040c);
                T t11 = (T) this.f14044f.m10885a((C7825k) t10, 0, true);
                if (t11 == null) {
                    return t11;
                }
                m10833c(str, t11);
                return t11;
            } catch (Exception e10) {
                throw new C7794b(e10);
            }
        }
        if (!this.f14038a.containsKey(str)) {
            return null;
        }
        if (this.f14045g.containsKey(str)) {
            return (T) this.f14045g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f14038a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f14044f.m10888a(value);
            this.f14044f.m10882a(this.f14040c);
            T t12 = (T) this.f14044f.m10885a((C7825k) t10, 0, true);
            m10833c(str, t12);
            return t12;
        } catch (Exception e11) {
            throw new C7794b(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public byte[] mo10832a() throws UnsupportedEncodingException {
        if (this.f14043e != null) {
            C7826l c7826l = new C7826l(0);
            c7826l.m10903a(this.f14040c);
            c7826l.m10911a((Map) this.f14043e, 0);
            return C7828n.m10919a(c7826l.f14071a);
        }
        return super.mo10832a();
    }

    @Override // com.tencent.bugly.proguard.AbstractC7817c
    /* renamed from: a */
    public void mo10831a(byte[] bArr) {
        try {
            super.mo10831a(bArr);
        } catch (Exception unused) {
            this.f14044f.m10888a(bArr);
            this.f14044f.m10882a(this.f14040c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f14043e = this.f14044f.m10886a((Map) map, 0, false);
        }
    }
}
