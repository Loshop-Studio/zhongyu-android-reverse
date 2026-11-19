package p413y0;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5846e;
import com.bumptech.glide.load.engine.C5850i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p109d1.C8908i;
import p368v0.C11409g;

/* renamed from: y0.c */
/* loaded from: classes3.dex */
public class C11883c {

    /* renamed from: c */
    public static final C5850i f28190c = new C5850i(Object.class, Object.class, Object.class, Collections.singletonList(new C5846e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C11409g(), null)), null);

    /* renamed from: a */
    public final ArrayMap f28191a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f28192b = new AtomicReference();

    /* renamed from: a */
    public C5850i m26422a(Class cls, Class cls2, Class cls3) {
        C5850i c5850i;
        C8908i c8908iM26423b = m26423b(cls, cls2, cls3);
        synchronized (this.f28191a) {
            c5850i = (C5850i) this.f28191a.get(c8908iM26423b);
        }
        this.f28192b.set(c8908iM26423b);
        return c5850i;
    }

    /* renamed from: b */
    public final C8908i m26423b(Class cls, Class cls2, Class cls3) {
        C8908i c8908i = (C8908i) this.f28192b.getAndSet(null);
        if (c8908i == null) {
            c8908i = new C8908i();
        }
        c8908i.m17464a(cls, cls2, cls3);
        return c8908i;
    }

    /* renamed from: c */
    public boolean m26424c(C5850i c5850i) {
        return f28190c.equals(c5850i);
    }

    /* renamed from: d */
    public void m26425d(Class cls, Class cls2, Class cls3, C5850i c5850i) {
        synchronized (this.f28191a) {
            ArrayMap arrayMap = this.f28191a;
            C8908i c8908i = new C8908i(cls, cls2, cls3);
            if (c5850i == null) {
                c5850i = f28190c;
            }
            arrayMap.put(c8908i, c5850i);
        }
    }
}
