package p210jc;

import io.objectbox.BoxStore;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import nc.AbstractC10390c;
import nc.InterfaceC10388a;
import nc.InterfaceC10389b;
import org.greenrobot.essentials.collections.MultimapSet;

/* renamed from: jc.g */
/* loaded from: classes6.dex */
public class RunnableC9716g implements InterfaceC10389b, Runnable {

    /* renamed from: c */
    public final BoxStore f22660c;

    /* renamed from: d */
    public final MultimapSet f22661d = MultimapSet.m22367f(MultimapSet.SetType.THREAD_SAFE);

    /* renamed from: e */
    public final Deque f22662e = new ArrayDeque();

    /* renamed from: f */
    public volatile boolean f22663f;

    public RunnableC9716g(BoxStore boxStore) {
        this.f22660c = boxStore;
    }

    /* renamed from: d */
    public static /* synthetic */ void m19272d(RunnableC9716g runnableC9716g, Object obj, InterfaceC10388a interfaceC10388a) {
        Collection<Class> collectionM18962r;
        if (obj != null) {
            runnableC9716g.getClass();
            collectionM18962r = Collections.singletonList((Class) obj);
        } else {
            collectionM18962r = runnableC9716g.f22660c.m18962r();
        }
        for (Class cls : collectionM18962r) {
            try {
                interfaceC10388a.mo18993b(cls);
            } catch (RuntimeException unused) {
                runnableC9716g.m19276e(cls);
            }
        }
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: a */
    public void mo19273a(InterfaceC10388a interfaceC10388a, Object obj) {
        if (obj != null) {
            m19278g(interfaceC10388a, this.f22660c.m18967y((Class) obj));
            return;
        }
        for (int i10 : this.f22660c.m18963s()) {
            m19278g(interfaceC10388a, i10);
        }
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: b */
    public void mo19274b(final InterfaceC10388a interfaceC10388a, final Object obj) {
        this.f22660c.m18943D(new Runnable() { // from class: jc.f
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC9716g.m19272d(this.f22657c, obj, interfaceC10388a);
            }
        });
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: c */
    public void mo19275c(InterfaceC10388a interfaceC10388a, Object obj) {
        if (obj != null) {
            this.f22661d.m2766d(Integer.valueOf(this.f22660c.m18967y((Class) obj)), interfaceC10388a);
            return;
        }
        for (int i10 : this.f22660c.m18963s()) {
            this.f22661d.m2766d(Integer.valueOf(i10), interfaceC10388a);
        }
    }

    /* renamed from: e */
    public final void m19276e(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    /* renamed from: f */
    public void m19277f(int[] iArr) {
        synchronized (this.f22662e) {
            try {
                this.f22662e.add(iArr);
                if (!this.f22663f) {
                    this.f22663f = true;
                    this.f22660c.m18943D(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m19278g(InterfaceC10388a interfaceC10388a, int i10) {
        AbstractC10390c.m21714a((Set) this.f22661d.get(Integer.valueOf(i10)), interfaceC10388a);
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        while (true) {
            try {
            } finally {
            }
            synchronized (this.f22662e) {
                iArr = (int[]) this.f22662e.pollFirst();
                if (iArr == null) {
                    this.f22663f = false;
                    return;
                }
                this.f22663f = false;
            }
            for (int i10 : iArr) {
                Collection collection = this.f22661d.get(Integer.valueOf(i10));
                if (collection != null && !collection.isEmpty()) {
                    Class clsM18965w = this.f22660c.m18965w(i10);
                    try {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC10388a) it.next()).mo18993b(clsM18965w);
                        }
                    } catch (RuntimeException unused) {
                        m19276e(clsM18965w);
                    }
                }
            }
        }
    }
}
