package p174w0;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p016b1.C4407i;

/* renamed from: w0.d */
/* loaded from: classes3.dex */
public class C7806d {

    /* renamed from: a */
    public final AtomicReference f10362a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f10363b = new ArrayMap();

    /* renamed from: a */
    public List m9390a(Class cls, Class cls2, Class cls3) {
        List list;
        C4407i c4407i = (C4407i) this.f10362a.getAndSet(null);
        if (c4407i == null) {
            c4407i = new C4407i(cls, cls2, cls3);
        } else {
            c4407i.m1434a(cls, cls2, cls3);
        }
        synchronized (this.f10363b) {
            list = (List) this.f10363b.get(c4407i);
        }
        this.f10362a.set(c4407i);
        return list;
    }

    /* renamed from: b */
    public void m9391b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f10363b) {
            this.f10363b.put(new C4407i(cls, cls2, cls3), list);
        }
    }
}
