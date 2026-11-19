package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes3.dex */
public class C4098d extends AbstractC4100d1 {

    /* renamed from: e */
    protected HashMap<String, byte[]> f3800e = null;

    /* renamed from: g */
    private HashMap<String, Object> f3802g = new HashMap<>();

    /* renamed from: f */
    C4119k f3801f = new C4119k();

    /* renamed from: c */
    private void m3235c(String str, Object obj) {
        this.f3802g.put(str, obj);
    }

    /* renamed from: a */
    public final void m3236a(String str) {
        this.f3805c = str;
    }

    /* renamed from: b */
    public void mo3241b() {
        this.f3800e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.AbstractC4100d1
    /* renamed from: a */
    public <T> void mo3237a(String str, T t8) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f3800e == null) {
            super.mo3237a(str, t8);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t8 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t8 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C4121l c4121l = new C4121l();
        c4121l.m3309a(this.f3805c);
        c4121l.m3314a(t8, 0);
        this.f3800e.put(str, C4125n.m3325a(c4121l.f3848a));
    }

    /* renamed from: b */
    public final <T> T m3240b(String str, T t8) throws C4070b {
        HashMap<String, byte[]> map = this.f3800e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f3802g.containsKey(str)) {
                return (T) this.f3802g.get(str);
            }
            try {
                this.f3801f.m3294a(this.f3800e.get(str));
                this.f3801f.m3288a(this.f3805c);
                T t9 = (T) this.f3801f.m3291a((C4119k) t8, 0, true);
                if (t9 == null) {
                    return t9;
                }
                m3235c(str, t9);
                return t9;
            } catch (Exception e) {
                throw new C4070b(e);
            }
        }
        if (!this.f3803a.containsKey(str)) {
            return null;
        }
        if (this.f3802g.containsKey(str)) {
            return (T) this.f3802g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f3803a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f3801f.m3294a(value);
            this.f3801f.m3288a(this.f3805c);
            T t10 = (T) this.f3801f.m3291a((C4119k) t8, 0, true);
            m3235c(str, t10);
            return t10;
        } catch (Exception e4) {
            throw new C4070b(e4);
        }
    }

    /* renamed from: a */
    public byte[] mo3239a() throws UnsupportedEncodingException {
        if (this.f3800e != null) {
            C4121l c4121l = new C4121l(0);
            c4121l.m3309a(this.f3805c);
            c4121l.m3317a((Map) this.f3800e, 0);
            return C4125n.m3325a(c4121l.f3848a);
        }
        C4121l c4121l2 = new C4121l(0);
        c4121l2.m3309a(this.f3805c);
        c4121l2.m3317a((Map) this.f3803a, 0);
        return C4125n.m3325a(c4121l2.f3848a);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4100d1
    /* renamed from: a */
    public void mo3238a(byte[] bArr) {
        try {
            super.mo3238a(bArr);
        } catch (Exception unused) {
            this.f3801f.m3294a(bArr);
            this.f3801f.m3288a(this.f3805c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f3800e = this.f3801f.m3292a((Map) map, 0, false);
        }
    }
}
