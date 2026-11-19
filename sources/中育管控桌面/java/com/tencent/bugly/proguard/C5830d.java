package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
/* loaded from: classes3.dex */
public class C5830d extends C5829c {

    /* renamed from: e */
    protected HashMap<String, byte[]> f4322e = null;

    /* renamed from: g */
    private HashMap<String, Object> f4324g = new HashMap<>();

    /* renamed from: f */
    C5837k f4323f = new C5837k();

    /* renamed from: c */
    private void m4148c(String str, Object obj) {
        this.f4324g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4144a(String str) {
        super.mo4144a(str);
    }

    /* renamed from: b */
    public void mo4150b() {
        this.f4322e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public <T> void mo4145a(String str, T t6) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (this.f4322e == null) {
            super.mo4145a(str, (String) t6);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t6 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t6 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C5838l c5838l = new C5838l();
        c5838l.m4218a(this.f4319c);
        c5838l.m4223a(t6, 0);
        this.f4322e.put(str, C5840n.m4234a(c5838l.f4350a));
    }

    /* renamed from: b */
    public final <T> T m4149b(String str, T t6) {
        HashMap<String, byte[]> map = this.f4322e;
        if (map != null) {
            if (!map.containsKey(str)) {
                return null;
            }
            if (this.f4324g.containsKey(str)) {
                return (T) this.f4324g.get(str);
            }
            try {
                this.f4323f.m4203a(this.f4322e.get(str));
                this.f4323f.m4197a(this.f4319c);
                T t7 = (T) this.f4323f.m4200a((C5837k) t6, 0, true);
                if (t7 == null) {
                    return t7;
                }
                m4148c(str, t7);
                return t7;
            } catch (Exception e6) {
                throw new C5806b(e6);
            }
        }
        if (!this.f4317a.containsKey(str)) {
            return null;
        }
        if (this.f4324g.containsKey(str)) {
            return (T) this.f4324g.get(str);
        }
        byte[] value = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f4317a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            value = next.getValue();
        }
        try {
            this.f4323f.m4203a(value);
            this.f4323f.m4197a(this.f4319c);
            T t8 = (T) this.f4323f.m4200a((C5837k) t6, 0, true);
            m4148c(str, t8);
            return t8;
        } catch (Exception e7) {
            throw new C5806b(e7);
        }
    }

    @Override // com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public byte[] mo4147a() throws UnsupportedEncodingException {
        if (this.f4322e != null) {
            C5838l c5838l = new C5838l(0);
            c5838l.m4218a(this.f4319c);
            c5838l.m4226a((Map) this.f4322e, 0);
            return C5840n.m4234a(c5838l.f4350a);
        }
        return super.mo4147a();
    }

    @Override // com.tencent.bugly.proguard.C5829c
    /* renamed from: a */
    public void mo4146a(byte[] bArr) {
        try {
            super.mo4146a(bArr);
        } catch (Exception unused) {
            this.f4323f.m4203a(bArr);
            this.f4323f.m4197a(this.f4319c);
            HashMap map = new HashMap(1);
            map.put("", new byte[0]);
            this.f4322e = this.f4323f.m4201a((Map) map, 0, false);
        }
    }
}
