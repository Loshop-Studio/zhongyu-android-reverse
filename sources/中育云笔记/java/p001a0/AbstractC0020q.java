package p001a0;

import java.util.Map;
import p325rc.AbstractC10947g0;

/* renamed from: a0.q */
/* loaded from: classes3.dex */
public abstract class AbstractC0020q {

    /* renamed from: a */
    public final Map f6a = AbstractC0005b.m9b(0, 0.0f, 3, null);

    /* renamed from: b */
    public long f7b;

    /* renamed from: c */
    public long f8c;

    public AbstractC0020q(long j10) {
        this.f7b = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* renamed from: a */
    public final void m36a() {
        m47l(-1L);
    }

    /* renamed from: b */
    public abstract void mo37b(Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public final Object m38c(Object obj) {
        return this.f6a.get(obj);
    }

    /* renamed from: d */
    public final long m39d() {
        return this.f7b;
    }

    /* renamed from: e */
    public final long m40e() {
        if (this.f8c == -1) {
            this.f8c = m42g();
        }
        return this.f8c;
    }

    /* renamed from: f */
    public final Object m41f(Object obj, Object obj2) {
        Object objPut = this.f6a.put(obj, obj2);
        this.f8c = m40e() + m44i(obj, obj2);
        if (objPut != null) {
            this.f8c = m40e() - m44i(obj, objPut);
            mo37b(obj, objPut, obj2);
        }
        m47l(this.f7b);
        return objPut;
    }

    /* renamed from: g */
    public final long m42g() {
        long jM44i = 0;
        for (Map.Entry entry : this.f6a.entrySet()) {
            jM44i += m44i(entry.getKey(), entry.getValue());
        }
        return jM44i;
    }

    /* renamed from: h */
    public final Object m43h(Object obj) {
        Object objRemove = this.f6a.remove(obj);
        if (objRemove != null) {
            this.f8c = m40e() - m44i(obj, objRemove);
            mo37b(obj, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: i */
    public final long m44i(Object obj, Object obj2) throws Exception {
        try {
            long jMo46k = mo46k(obj, obj2);
            if (jMo46k >= 0) {
                return jMo46k;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jMo46k).toString());
        } catch (Exception e10) {
            this.f8c = -1L;
            throw e10;
        }
    }

    /* renamed from: j */
    public final void m45j(long j10) {
        this.f7b = j10;
        m47l(j10);
    }

    /* renamed from: k */
    public abstract long mo46k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m47l(long j10) {
        while (m40e() > j10) {
            if (this.f6a.isEmpty()) {
                if (m40e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) AbstractC10947g0.m23943l0(this.f6a.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f6a.remove(key);
            this.f8c = m40e() - m44i(key, value);
            mo37b(key, value, null);
        }
    }
}
