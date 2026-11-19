package p174w0;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C4714e;
import com.bumptech.glide.load.engine.C4718i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p016b1.C4407i;
import p153t0.C7721g;

/* renamed from: w0.c */
/* loaded from: classes3.dex */
public class C7805c {

    /* renamed from: c */
    public static final C4718i f10359c = new C4718i(Object.class, Object.class, Object.class, Collections.singletonList(new C4714e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C7721g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f10360a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f10361b = new AtomicReference();

    /* renamed from: a */
    public C4718i m9386a(Class cls, Class cls2, Class cls3) {
        C4718i c4718i;
        C4407i c4407iM9387b = m9387b(cls, cls2, cls3);
        synchronized (this.f10360a) {
            c4718i = (C4718i) this.f10360a.get(c4407iM9387b);
        }
        this.f10361b.set(c4407iM9387b);
        return c4718i;
    }

    /* renamed from: b */
    public final C4407i m9387b(Class cls, Class cls2, Class cls3) {
        C4407i c4407i = (C4407i) this.f10361b.getAndSet(null);
        if (c4407i == null) {
            c4407i = new C4407i();
        }
        c4407i.m1434a(cls, cls2, cls3);
        return c4407i;
    }

    /* renamed from: c */
    public boolean m9388c(C4718i c4718i) {
        return f10359c.equals(c4718i);
    }

    /* renamed from: d */
    public void m9389d(Class cls, Class cls2, Class cls3, C4718i c4718i) {
        synchronized (this.f10360a) {
            ArrayMap arrayMap = this.f10360a;
            C4407i c4407i = new C4407i(cls, cls2, cls3);
            if (c4718i == null) {
                c4718i = f10359c;
            }
            arrayMap.put(c4407i, c4718i);
        }
    }
}
