package p090e0;

import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: e0.p */
/* loaded from: classes3.dex */
public abstract class AbstractC7818p {

    /* renamed from: a */
    public final long f13128a;

    /* renamed from: b */
    public final Map f13129b = AbstractC7804b.m12176b(0, 0.0f, 3, null);

    /* renamed from: c */
    public long f13130c;

    public AbstractC7818p(long j9) {
        this.f13128a = j9;
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* renamed from: a */
    public final void m12203a() {
        m12213k(-1L);
    }

    /* renamed from: b */
    public abstract void mo12204b(Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public final Object m12205c(Object obj) {
        return this.f13129b.get(obj);
    }

    /* renamed from: d */
    public final long m12206d() {
        return this.f13128a;
    }

    /* renamed from: e */
    public final long m12207e() {
        if (this.f13130c == -1) {
            this.f13130c = m12209g();
        }
        return this.f13130c;
    }

    /* renamed from: f */
    public final Object m12208f(Object obj, Object obj2) {
        Object objPut = this.f13129b.put(obj, obj2);
        this.f13130c = m12207e() + m12211i(obj, obj2);
        if (objPut != null) {
            this.f13130c = m12207e() - m12211i(obj, objPut);
            mo12204b(obj, objPut, obj2);
        }
        m12213k(this.f13128a);
        return objPut;
    }

    /* renamed from: g */
    public final long m12209g() {
        long jM12211i = 0;
        for (Map.Entry entry : this.f13129b.entrySet()) {
            jM12211i += m12211i(entry.getKey(), entry.getValue());
        }
        return jM12211i;
    }

    /* renamed from: h */
    public final Object m12210h(Object obj) {
        Object objRemove = this.f13129b.remove(obj);
        if (objRemove != null) {
            this.f13130c = m12207e() - m12211i(obj, objRemove);
            mo12204b(obj, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: i */
    public final long m12211i(Object obj, Object obj2) throws Exception {
        try {
            long jMo12212j = mo12212j(obj, obj2);
            if (jMo12212j >= 0) {
                return jMo12212j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jMo12212j).toString());
        } catch (Exception e10) {
            this.f13130c = -1L;
            throw e10;
        }
    }

    /* renamed from: j */
    public abstract long mo12212j(Object obj, Object obj2);

    /* renamed from: k */
    public final void m12213k(long j9) {
        while (m12207e() > j9) {
            if (this.f13129b.isEmpty()) {
                if (m12207e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.first(this.f13129b.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f13129b.remove(key);
            this.f13130c = m12207e() - m12211i(key, value);
            mo12204b(key, value, null);
        }
    }
}
