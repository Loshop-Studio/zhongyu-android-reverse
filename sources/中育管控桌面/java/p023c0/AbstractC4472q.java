package p023c0;

import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: c0.q */
/* loaded from: classes3.dex */
public abstract class AbstractC4472q {

    /* renamed from: a */
    public final Map f1336a = AbstractC4457b.m1525b(0, 0.0f, 3, null);

    /* renamed from: b */
    public long f1337b;

    /* renamed from: c */
    public long f1338c;

    public AbstractC4472q(long j6) {
        this.f1337b = j6;
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* renamed from: a */
    public final void m1553a() {
        m1564l(-1L);
    }

    /* renamed from: b */
    public abstract void mo1554b(Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public final Object m1555c(Object obj) {
        return this.f1336a.get(obj);
    }

    /* renamed from: d */
    public final long m1556d() {
        return this.f1337b;
    }

    /* renamed from: e */
    public final long m1557e() {
        if (this.f1338c == -1) {
            this.f1338c = m1559g();
        }
        return this.f1338c;
    }

    /* renamed from: f */
    public final Object m1558f(Object obj, Object obj2) {
        Object objPut = this.f1336a.put(obj, obj2);
        this.f1338c = m1557e() + m1561i(obj, obj2);
        if (objPut != null) {
            this.f1338c = m1557e() - m1561i(obj, objPut);
            mo1554b(obj, objPut, obj2);
        }
        m1564l(this.f1337b);
        return objPut;
    }

    /* renamed from: g */
    public final long m1559g() {
        long jM1561i = 0;
        for (Map.Entry entry : this.f1336a.entrySet()) {
            jM1561i += m1561i(entry.getKey(), entry.getValue());
        }
        return jM1561i;
    }

    /* renamed from: h */
    public final Object m1560h(Object obj) {
        Object objRemove = this.f1336a.remove(obj);
        if (objRemove != null) {
            this.f1338c = m1557e() - m1561i(obj, objRemove);
            mo1554b(obj, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: i */
    public final long m1561i(Object obj, Object obj2) throws Exception {
        try {
            long jMo1563k = mo1563k(obj, obj2);
            if (jMo1563k >= 0) {
                return jMo1563k;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jMo1563k).toString());
        } catch (Exception e6) {
            this.f1338c = -1L;
            throw e6;
        }
    }

    /* renamed from: j */
    public final void m1562j(long j6) {
        this.f1337b = j6;
        m1564l(j6);
    }

    /* renamed from: k */
    public abstract long mo1563k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m1564l(long j6) {
        while (m1557e() > j6) {
            if (this.f1336a.isEmpty()) {
                if (m1557e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.first(this.f1336a.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f1336a.remove(key);
            this.f1338c = m1557e() - m1561i(key, value);
            mo1554b(key, value, null);
        }
    }
}
