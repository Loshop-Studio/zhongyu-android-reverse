package p031c0;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p116h0.C8705i;

/* renamed from: c0.d */
/* loaded from: classes3.dex */
public class C5225d {

    /* renamed from: a */
    public final AtomicReference f2305a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f2306b = new ArrayMap();

    /* renamed from: a */
    public List m2122a(Class cls, Class cls2, Class cls3) {
        List list;
        C8705i c8705i = (C8705i) this.f2305a.getAndSet(null);
        if (c8705i == null) {
            c8705i = new C8705i(cls, cls2, cls3);
        } else {
            c8705i.m14177a(cls, cls2, cls3);
        }
        synchronized (this.f2306b) {
            list = (List) this.f2306b.get(c8705i);
        }
        this.f2305a.set(c8705i);
        return list;
    }

    /* renamed from: b */
    public void m2123b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f2306b) {
            this.f2306b.put(new C8705i(cls, cls2, cls3), list);
        }
    }
}
