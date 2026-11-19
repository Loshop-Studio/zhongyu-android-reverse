package p030c0;

import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: c0.q */
/* loaded from: classes3.dex */
public abstract class AbstractC5092q {

    /* renamed from: a */
    public final Map f2656a = AbstractC5077b.m2668b(0, 0.0f, 3, null);

    /* renamed from: b */
    public long f2657b;

    /* renamed from: c */
    public long f2658c;

    public AbstractC5092q(long j10) {
        this.f2657b = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* renamed from: a */
    public final void m2695a() {
        m2706l(-1L);
    }

    /* renamed from: b */
    public abstract void mo2696b(Object obj, Object obj2, Object obj3);

    /* renamed from: c */
    public final Object m2697c(Object obj) {
        return this.f2656a.get(obj);
    }

    /* renamed from: d */
    public final long m2698d() {
        return this.f2657b;
    }

    /* renamed from: e */
    public final long m2699e() {
        if (this.f2658c == -1) {
            this.f2658c = m2701g();
        }
        return this.f2658c;
    }

    /* renamed from: f */
    public final Object m2700f(Object obj, Object obj2) {
        Object objPut = this.f2656a.put(obj, obj2);
        this.f2658c = m2699e() + m2703i(obj, obj2);
        if (objPut != null) {
            this.f2658c = m2699e() - m2703i(obj, objPut);
            mo2696b(obj, objPut, obj2);
        }
        m2706l(this.f2657b);
        return objPut;
    }

    /* renamed from: g */
    public final long m2701g() {
        long jM2703i = 0;
        for (Map.Entry entry : this.f2656a.entrySet()) {
            jM2703i += m2703i(entry.getKey(), entry.getValue());
        }
        return jM2703i;
    }

    /* renamed from: h */
    public final Object m2702h(Object obj) {
        Object objRemove = this.f2656a.remove(obj);
        if (objRemove != null) {
            this.f2658c = m2699e() - m2703i(obj, objRemove);
            mo2696b(obj, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: i */
    public final long m2703i(Object obj, Object obj2) throws Exception {
        try {
            long jMo2705k = mo2705k(obj, obj2);
            if (jMo2705k >= 0) {
                return jMo2705k;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jMo2705k).toString());
        } catch (Exception e10) {
            this.f2658c = -1L;
            throw e10;
        }
    }

    /* renamed from: j */
    public final void m2704j(long j10) {
        this.f2657b = j10;
        m2706l(j10);
    }

    /* renamed from: k */
    public abstract long mo2705k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m2706l(long j10) {
        while (m2699e() > j10) {
            if (this.f2656a.isEmpty()) {
                if (m2699e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.first(this.f2656a.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f2656a.remove(key);
            this.f2658c = m2699e() - m2703i(key, value);
            mo2696b(key, value, null);
        }
    }
}
