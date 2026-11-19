package p062d1;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5378e;
import com.bumptech.glide.load.engine.C5382i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p003a1.C0014g;
import p117i1.C7650i;

/* renamed from: d1.c */
/* loaded from: classes3.dex */
public class C7281c {

    /* renamed from: c */
    public static final C5382i f11724c = new C5382i(Object.class, Object.class, Object.class, Collections.singletonList(new C5378e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C0014g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f11725a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f11726b = new AtomicReference();

    /* renamed from: a */
    public C5382i m11535a(Class cls, Class cls2, Class cls3) {
        C5382i c5382i;
        C7650i c7650iM11536b = m11536b(cls, cls2, cls3);
        synchronized (this.f11725a) {
            c5382i = (C5382i) this.f11725a.get(c7650iM11536b);
        }
        this.f11726b.set(c7650iM11536b);
        return c5382i;
    }

    /* renamed from: b */
    public final C7650i m11536b(Class cls, Class cls2, Class cls3) {
        C7650i c7650i = (C7650i) this.f11726b.getAndSet(null);
        if (c7650i == null) {
            c7650i = new C7650i();
        }
        c7650i.m12679a(cls, cls2, cls3);
        return c7650i;
    }

    /* renamed from: c */
    public boolean m11537c(C5382i c5382i) {
        return f11724c.equals(c5382i);
    }

    /* renamed from: d */
    public void m11538d(Class cls, Class cls2, Class cls3, C5382i c5382i) {
        synchronized (this.f11725a) {
            ArrayMap arrayMap = this.f11725a;
            C7650i c7650i = new C7650i(cls, cls2, cls3);
            if (c5382i == null) {
                c5382i = f11724c;
            }
            arrayMap.put(c7650i, c5382i);
        }
    }
}
