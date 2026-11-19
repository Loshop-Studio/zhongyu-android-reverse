package p308z0;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p091e1.C7836h;

/* renamed from: z0.d */
/* loaded from: classes3.dex */
public class C9984d {

    /* renamed from: a */
    public final AtomicReference f17964a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f17965b = new ArrayMap();

    /* renamed from: a */
    public List m17280a(Class cls, Class cls2, Class cls3) {
        List list;
        C7836h c7836h = (C7836h) this.f17964a.getAndSet(null);
        if (c7836h == null) {
            c7836h = new C7836h(cls, cls2, cls3);
        } else {
            c7836h.m12252a(cls, cls2, cls3);
        }
        synchronized (this.f17965b) {
            list = (List) this.f17965b.get(c7836h);
        }
        this.f17964a.set(c7836h);
        return list;
    }

    /* renamed from: b */
    public void m17281b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f17965b) {
            this.f17965b.put(new C7836h(cls, cls2, cls3), list);
        }
    }
}
