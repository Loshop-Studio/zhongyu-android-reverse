package p062d1;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p117i1.C7650i;

/* renamed from: d1.d */
/* loaded from: classes3.dex */
public class C7282d {

    /* renamed from: a */
    public final AtomicReference f11727a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f11728b = new ArrayMap();

    /* renamed from: a */
    public List m11539a(Class cls, Class cls2, Class cls3) {
        List list;
        C7650i c7650i = (C7650i) this.f11727a.getAndSet(null);
        if (c7650i == null) {
            c7650i = new C7650i(cls, cls2, cls3);
        } else {
            c7650i.m12679a(cls, cls2, cls3);
        }
        synchronized (this.f11728b) {
            list = (List) this.f11728b.get(c7650i);
        }
        this.f11727a.set(c7650i);
        return list;
    }

    /* renamed from: b */
    public void m11540b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f11728b) {
            this.f11728b.put(new C7650i(cls, cls2, cls3), list);
        }
    }
}
