package p413y0;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p109d1.C8908i;

/* renamed from: y0.d */
/* loaded from: classes3.dex */
public class C11884d {

    /* renamed from: a */
    public final AtomicReference f28193a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f28194b = new ArrayMap();

    /* renamed from: a */
    public List m26426a(Class cls, Class cls2, Class cls3) {
        List list;
        C8908i c8908i = (C8908i) this.f28193a.getAndSet(null);
        if (c8908i == null) {
            c8908i = new C8908i(cls, cls2, cls3);
        } else {
            c8908i.m17464a(cls, cls2, cls3);
        }
        synchronized (this.f28194b) {
            list = (List) this.f28194b.get(c8908i);
        }
        this.f28193a.set(c8908i);
        return list;
    }

    /* renamed from: b */
    public void m26427b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f28194b) {
            this.f28194b.put(new C8908i(cls, cls2, cls3), list);
        }
    }
}
