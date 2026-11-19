package p308z0;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5489e;
import com.bumptech.glide.load.engine.C5493i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p091e1.C7836h;
import p278w0.C9795g;

/* renamed from: z0.c */
/* loaded from: classes3.dex */
public class C9983c {

    /* renamed from: c */
    public static final C5493i f17961c = new C5493i(Object.class, Object.class, Object.class, Collections.singletonList(new C5489e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C9795g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f17962a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f17963b = new AtomicReference();

    /* renamed from: a */
    public C5493i m17276a(Class cls, Class cls2, Class cls3) {
        C5493i c5493i;
        C7836h c7836hM17277b = m17277b(cls, cls2, cls3);
        synchronized (this.f17962a) {
            c5493i = (C5493i) this.f17962a.get(c7836hM17277b);
        }
        this.f17963b.set(c7836hM17277b);
        return c5493i;
    }

    /* renamed from: b */
    public final C7836h m17277b(Class cls, Class cls2, Class cls3) {
        C7836h c7836h = (C7836h) this.f17963b.getAndSet(null);
        if (c7836h == null) {
            c7836h = new C7836h();
        }
        c7836h.m12252a(cls, cls2, cls3);
        return c7836h;
    }

    /* renamed from: c */
    public boolean m17278c(C5493i c5493i) {
        return f17961c.equals(c5493i);
    }

    /* renamed from: d */
    public void m17279d(Class cls, Class cls2, Class cls3, C5493i c5493i) {
        synchronized (this.f17962a) {
            ArrayMap arrayMap = this.f17962a;
            C7836h c7836h = new C7836h(cls, cls2, cls3);
            if (c5493i == null) {
                c5493i = f17961c;
            }
            arrayMap.put(c7836h, c5493i);
        }
    }
}
