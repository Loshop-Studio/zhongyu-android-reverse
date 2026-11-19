package p026b8;

import io.objectbox.BoxStore;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.essentials.collections.MultimapSet;
import p109f8.AbstractC7950c;
import p109f8.InterfaceC7948a;
import p109f8.InterfaceC7949b;

/* renamed from: b8.g */
/* loaded from: classes5.dex */
public class RunnableC5212g implements InterfaceC7949b, Runnable {

    /* renamed from: a */
    public final BoxStore f2432a;

    /* renamed from: b */
    public final MultimapSet f2433b = MultimapSet.m15087f(MultimapSet.SetType.THREAD_SAFE);

    /* renamed from: c */
    public final Deque f2434c = new ArrayDeque();

    /* renamed from: d */
    public volatile boolean f2435d;

    public RunnableC5212g(BoxStore boxStore) {
        this.f2432a = boxStore;
    }

    /* renamed from: d */
    public static /* synthetic */ void m2299d(RunnableC5212g runnableC5212g, Object obj, InterfaceC7948a interfaceC7948a) {
        Collection<Class> collectionM13109p;
        if (obj != null) {
            runnableC5212g.getClass();
            collectionM13109p = Collections.singletonList((Class) obj);
        } else {
            collectionM13109p = runnableC5212g.f2432a.m13109p();
        }
        for (Class cls : collectionM13109p) {
            try {
                interfaceC7948a.mo12363b(cls);
            } catch (RuntimeException unused) {
                runnableC5212g.m2303e(cls);
            }
        }
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: a */
    public void mo2300a(InterfaceC7948a interfaceC7948a, Object obj) {
        if (obj != null) {
            this.f2433b.m17243d(Integer.valueOf(this.f2432a.m13114w((Class) obj)), interfaceC7948a);
            return;
        }
        for (int i9 : this.f2432a.m13110q()) {
            this.f2433b.m17243d(Integer.valueOf(i9), interfaceC7948a);
        }
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: b */
    public void mo2301b(final InterfaceC7948a interfaceC7948a, final Object obj) {
        this.f2432a.m13090B(new Runnable() { // from class: b8.f
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC5212g.m2299d(this.f2429a, obj, interfaceC7948a);
            }
        });
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: c */
    public void mo2302c(InterfaceC7948a interfaceC7948a, Object obj) {
        if (obj != null) {
            m2305g(interfaceC7948a, this.f2432a.m13114w((Class) obj));
            return;
        }
        for (int i9 : this.f2432a.m13110q()) {
            m2305g(interfaceC7948a, i9);
        }
    }

    /* renamed from: e */
    public final void m2303e(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    /* renamed from: f */
    public void m2304f(int[] iArr) {
        synchronized (this.f2434c) {
            try {
                this.f2434c.add(iArr);
                if (!this.f2435d) {
                    this.f2435d = true;
                    this.f2432a.m13090B(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m2305g(InterfaceC7948a interfaceC7948a, int i9) {
        AbstractC7950c.m12496a((Set) this.f2433b.get(Integer.valueOf(i9)), interfaceC7948a);
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        while (true) {
            try {
            } finally {
            }
            synchronized (this.f2434c) {
                iArr = (int[]) this.f2434c.pollFirst();
                if (iArr == null) {
                    this.f2435d = false;
                    return;
                }
                this.f2435d = false;
            }
            for (int i9 : iArr) {
                Collection collection = this.f2433b.get(Integer.valueOf(i9));
                if (collection != null && !collection.isEmpty()) {
                    Class clsM13112u = this.f2432a.m13112u(i9);
                    try {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC7948a) it.next()).mo12363b(clsM13112u);
                        }
                    } catch (RuntimeException unused) {
                        m2303e(clsM13112u);
                    }
                }
            }
        }
    }
}
