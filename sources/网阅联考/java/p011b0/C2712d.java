package p011b0;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p062g0.C3748h;

/* renamed from: b0.d */
/* loaded from: classes2.dex */
public class C2712d {

    /* renamed from: a */
    public final AtomicReference f451a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f452b = new ArrayMap();

    /* renamed from: a */
    public List m1493a(Class cls, Class cls2, Class cls3) {
        List list;
        C3748h c3748h = (C3748h) this.f451a.getAndSet(null);
        if (c3748h == null) {
            c3748h = new C3748h(cls, cls2, cls3);
        } else {
            c3748h.m4764a(cls, cls2, cls3);
        }
        synchronized (this.f452b) {
            list = (List) this.f452b.get(c3748h);
        }
        this.f451a.set(c3748h);
        return list;
    }

    /* renamed from: b */
    public void m1494b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f452b) {
            this.f452b.put(new C3748h(cls, cls2, cls3), list);
        }
    }
}
