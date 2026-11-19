package p011b0;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C2876e;
import com.bumptech.glide.load.engine.C2880i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p062g0.C3748h;
import p142y.C4681g;

/* renamed from: b0.c */
/* loaded from: classes2.dex */
public class C2711c {

    /* renamed from: c */
    public static final C2880i f448c = new C2880i(Object.class, Object.class, Object.class, Collections.singletonList(new C2876e(Object.class, Object.class, Object.class, Collections.emptyList(), new C4681g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f449a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f450b = new AtomicReference();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C2880i m1489a(Class cls, Class cls2, Class cls3) {
        C2880i c2880i;
        C3748h c3748hM1490b = m1490b(cls, cls2, cls3);
        synchronized (this.f449a) {
            c2880i = (C2880i) this.f449a.get(c3748hM1490b);
        }
        this.f450b.set(c3748hM1490b);
        return c2880i;
    }

    /* renamed from: b */
    public final C3748h m1490b(Class cls, Class cls2, Class cls3) {
        C3748h c3748h = (C3748h) this.f450b.getAndSet(null);
        if (c3748h == null) {
            c3748h = new C3748h();
        }
        c3748h.m4764a(cls, cls2, cls3);
        return c3748h;
    }

    /* renamed from: c */
    public boolean m1491c(C2880i c2880i) {
        return f448c.equals(c2880i);
    }

    /* renamed from: d */
    public void m1492d(Class cls, Class cls2, Class cls3, C2880i c2880i) {
        synchronized (this.f449a) {
            ArrayMap arrayMap = this.f449a;
            C3748h c3748h = new C3748h(cls, cls2, cls3);
            if (c2880i == null) {
                c2880i = f448c;
            }
            arrayMap.put(c3748h, c2880i);
        }
    }
}
