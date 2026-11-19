package p031c0;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5427e;
import com.bumptech.glide.load.engine.C5431i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p116h0.C8705i;
import p314z.C10690g;

/* renamed from: c0.c */
/* loaded from: classes3.dex */
public class C5224c {

    /* renamed from: c */
    public static final C5431i f2302c = new C5431i(Object.class, Object.class, Object.class, Collections.singletonList(new C5427e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C10690g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f2303a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f2304b = new AtomicReference();

    /* renamed from: a */
    public C5431i m2118a(Class cls, Class cls2, Class cls3) {
        C5431i c5431i;
        C8705i c8705iM2119b = m2119b(cls, cls2, cls3);
        synchronized (this.f2303a) {
            c5431i = (C5431i) this.f2303a.get(c8705iM2119b);
        }
        this.f2304b.set(c8705iM2119b);
        return c5431i;
    }

    /* renamed from: b */
    public final C8705i m2119b(Class cls, Class cls2, Class cls3) {
        C8705i c8705i = (C8705i) this.f2304b.getAndSet(null);
        if (c8705i == null) {
            c8705i = new C8705i();
        }
        c8705i.m14177a(cls, cls2, cls3);
        return c8705i;
    }

    /* renamed from: c */
    public boolean m2120c(C5431i c5431i) {
        return f2302c.equals(c5431i);
    }

    /* renamed from: d */
    public void m2121d(Class cls, Class cls2, Class cls3, C5431i c5431i) {
        synchronized (this.f2303a) {
            ArrayMap arrayMap = this.f2303a;
            C8705i c8705i = new C8705i(cls, cls2, cls3);
            if (c5431i == null) {
                c5431i = f2302c;
            }
            arrayMap.put(c8705i, c5431i);
        }
    }
}
