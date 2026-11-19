package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes4.dex */
public class C6453d extends C6452c {

    /* renamed from: e */
    protected HashMap<String, byte[]> f5601e = null;

    /* renamed from: g */
    private HashMap<String, Object> f5603g = new HashMap<>();

    /* renamed from: f */
    C6460k f5602f = new C6460k();

    /* renamed from: c */
    private void m5143c(String str, Object obj) {
        this.f5603g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5139a(String str) {
        super.mo5139a(str);
    }

    /* renamed from: b */
    public void mo5145b() {
        this.f5601e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public <T> void mo5140a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f5601e == null) {
            super.mo5140a(str, (String) t10);
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
        C6461l c6461l = new C6461l();
        c6461l.m5213a(this.f5598c);
        c6461l.m5218a(t10, 0);
        this.f5601e.put(str, C6463n.m5229a(c6461l.f5629a));
    }

    /* renamed from: b */
    public final <T> T m5144b(String str, T t10) throws C6429b {
        HashMap<String, byte[]> map = this.f5601e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f5603g.containsKey(str)) {
                return (T) this.f5603g.get(str);
            }
            try {
                this.f5602f.m5198a(this.f5601e.get(str));
                this.f5602f.m5192a(this.f5598c);
                T t11 = (T) this.f5602f.m5195a((C6460k) t10, 0, true);
                if (t11 == null) {
                    return t11;
                }
                m5143c(str, t11);
                return t11;
            } catch (Exception e10) {
                throw new C6429b(e10);
            }
        }
        if (!this.f5596a.containsKey(str)) {
            return null;
        }
        if (this.f5603g.containsKey(str)) {
            return (T) this.f5603g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f5596a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f5602f.m5198a(value);
            this.f5602f.m5192a(this.f5598c);
            T t12 = (T) this.f5602f.m5195a((C6460k) t10, 0, true);
            m5143c(str, t12);
            return t12;
        } catch (Exception e11) {
            throw new C6429b(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public byte[] mo5142a() throws UnsupportedEncodingException {
        if (this.f5601e != null) {
            C6461l c6461l = new C6461l(0);
            c6461l.m5213a(this.f5598c);
            c6461l.m5221a((Map) this.f5601e, 0);
            return C6463n.m5229a(c6461l.f5629a);
        }
        return super.mo5142a();
    }

    @Override // com.tencent.bugly.proguard.C6452c
    /* renamed from: a */
    public void mo5141a(byte[] bArr) {
        try {
            super.mo5141a(bArr);
        } catch (Exception unused) {
            this.f5602f.m5198a(bArr);
            this.f5602f.m5192a(this.f5598c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f5601e = this.f5602f.m5196a((Map) map, 0, false);
        }
    }
}
