package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes4.dex */
public class C6713d extends C6712c {

    /* renamed from: e */
    protected HashMap<String, byte[]> f6178e = null;

    /* renamed from: g */
    private HashMap<String, Object> f6180g = new HashMap<>();

    /* renamed from: f */
    C6720k f6179f = new C6720k();

    /* renamed from: c */
    private void m5322c(String str, Object obj) {
        this.f6180g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5318a(String str) {
        super.mo5318a(str);
    }

    /* renamed from: b */
    public void mo5324b() {
        this.f6178e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public <T> void mo5319a(String str, T t9) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f6178e == null) {
            super.mo5319a(str, (String) t9);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t9 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t9 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C6721l c6721l = new C6721l();
        c6721l.m5392a(this.f6175c);
        c6721l.m5397a(t9, 0);
        this.f6178e.put(str, C6723n.m5408a(c6721l.f6206a));
    }

    /* renamed from: b */
    public final <T> T m5323b(String str, T t9) throws C6689b {
        HashMap<String, byte[]> map = this.f6178e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f6180g.containsKey(str)) {
                return (T) this.f6180g.get(str);
            }
            try {
                this.f6179f.m5377a(this.f6178e.get(str));
                this.f6179f.m5371a(this.f6175c);
                T t10 = (T) this.f6179f.m5374a((C6720k) t9, 0, true);
                if (t10 == null) {
                    return t10;
                }
                m5322c(str, t10);
                return t10;
            } catch (Exception e10) {
                throw new C6689b(e10);
            }
        }
        if (!this.f6173a.containsKey(str)) {
            return null;
        }
        if (this.f6180g.containsKey(str)) {
            return (T) this.f6180g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f6173a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f6179f.m5377a(value);
            this.f6179f.m5371a(this.f6175c);
            T t11 = (T) this.f6179f.m5374a((C6720k) t9, 0, true);
            m5322c(str, t11);
            return t11;
        } catch (Exception e11) {
            throw new C6689b(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public byte[] mo5321a() throws UnsupportedEncodingException {
        if (this.f6178e != null) {
            C6721l c6721l = new C6721l(0);
            c6721l.m5392a(this.f6175c);
            c6721l.m5400a((Map) this.f6178e, 0);
            return C6723n.m5408a(c6721l.f6206a);
        }
        return super.mo5321a();
    }

    @Override // com.tencent.bugly.proguard.C6712c
    /* renamed from: a */
    public void mo5320a(byte[] bArr) {
        try {
            super.mo5320a(bArr);
        } catch (Exception unused) {
            this.f6179f.m5377a(bArr);
            this.f6179f.m5371a(this.f6175c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f6178e = this.f6179f.m5375a((Map) map, 0, false);
        }
    }
}
