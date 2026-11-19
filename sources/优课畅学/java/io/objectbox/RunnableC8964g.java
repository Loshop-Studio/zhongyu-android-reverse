package io.objectbox;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.essentials.collections.MultimapSet;
import p222q6.AbstractC9836c;
import p222q6.InterfaceC9834a;
import p222q6.InterfaceC9835b;

/* renamed from: io.objectbox.g */
/* loaded from: classes5.dex */
public class RunnableC8964g implements InterfaceC9835b, Runnable {

    /* renamed from: a */
    public final BoxStore f16956a;

    /* renamed from: b */
    public final MultimapSet f16957b = MultimapSet.m18167f(MultimapSet.SetType.THREAD_SAFE);

    /* renamed from: c */
    public final Deque f16958c = new ArrayDeque();

    /* renamed from: d */
    public volatile boolean f16959d;

    public RunnableC8964g(BoxStore boxStore) {
        this.f16956a = boxStore;
    }

    /* renamed from: d */
    public static /* synthetic */ void m15462d(RunnableC8964g runnableC8964g, Object obj, InterfaceC9834a interfaceC9834a) {
        Collection<Class> collectionM15378l;
        if (obj != null) {
            runnableC8964g.getClass();
            collectionM15378l = Collections.singletonList((Class) obj);
        } else {
            collectionM15378l = runnableC8964g.f16956a.m15378l();
        }
        for (Class cls : collectionM15378l) {
            try {
                interfaceC9834a.mo15425b(cls);
            } catch (RuntimeException unused) {
                runnableC8964g.m15466e(cls);
            }
        }
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: a */
    public void mo15463a(InterfaceC9834a interfaceC9834a, Object obj) {
        if (obj != null) {
            m15468g(interfaceC9834a, this.f16956a.m15383s((Class) obj));
            return;
        }
        for (int i10 : this.f16956a.m15379m()) {
            m15468g(interfaceC9834a, i10);
        }
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: b */
    public void mo15464b(final InterfaceC9834a interfaceC9834a, final Object obj) {
        this.f16956a.m15387x(new Runnable() { // from class: io.objectbox.f
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC8964g.m15462d(this.f16953a, obj, interfaceC9834a);
            }
        });
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: c */
    public void mo15465c(InterfaceC9834a interfaceC9834a, Object obj) {
        if (obj != null) {
            this.f16957b.m20089d(Integer.valueOf(this.f16956a.m15383s((Class) obj)), interfaceC9834a);
            return;
        }
        for (int i10 : this.f16956a.m15379m()) {
            this.f16957b.m20089d(Integer.valueOf(i10), interfaceC9834a);
        }
    }

    /* renamed from: e */
    public final void m15466e(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    /* renamed from: f */
    public void m15467f(int[] iArr) {
        synchronized (this.f16958c) {
            try {
                this.f16958c.add(iArr);
                if (!this.f16959d) {
                    this.f16959d = true;
                    this.f16956a.m15387x(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m15468g(InterfaceC9834a interfaceC9834a, int i10) {
        AbstractC9836c.m18358a((Set) this.f16957b.get(Integer.valueOf(i10)), interfaceC9834a);
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        while (true) {
            try {
            } finally {
            }
            synchronized (this.f16958c) {
                iArr = (int[]) this.f16958c.pollFirst();
                if (iArr == null) {
                    this.f16959d = false;
                    return;
                }
                this.f16959d = false;
            }
            for (int i10 : iArr) {
                Collection collection = this.f16957b.get(Integer.valueOf(i10));
                if (collection != null && !collection.isEmpty()) {
                    Class clsM15381q = this.f16956a.m15381q(i10);
                    try {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC9834a) it.next()).mo15425b(clsM15381q);
                        }
                    } catch (RuntimeException unused) {
                        m15466e(clsM15381q);
                    }
                }
            }
        }
    }
}
