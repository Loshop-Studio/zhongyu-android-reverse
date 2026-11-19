package p214q8;

import io.objectbox.BoxStore;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.essentials.collections.MultimapSet;
import p258u8.AbstractC9591c;
import p258u8.InterfaceC9589a;
import p258u8.InterfaceC9590b;

/* renamed from: q8.g */
/* loaded from: classes5.dex */
public class RunnableC8986g implements InterfaceC9590b, Runnable {

    /* renamed from: a */
    public final BoxStore f15374a;

    /* renamed from: b */
    public final MultimapSet f15375b = MultimapSet.m14675f(MultimapSet.SetType.THREAD_SAFE);

    /* renamed from: c */
    public final Deque f15376c = new ArrayDeque();

    /* renamed from: d */
    public volatile boolean f15377d;

    public RunnableC8986g(BoxStore boxStore) {
        this.f15374a = boxStore;
    }

    /* renamed from: d */
    public static /* synthetic */ void m15088d(RunnableC8986g runnableC8986g, Object obj, InterfaceC9589a interfaceC9589a) {
        Collection<Class> collectionM12989p;
        if (obj != null) {
            runnableC8986g.getClass();
            collectionM12989p = Collections.singletonList((Class) obj);
        } else {
            collectionM12989p = runnableC8986g.f15374a.m12989p();
        }
        for (Class cls : collectionM12989p) {
            try {
                interfaceC9589a.mo13021b(cls);
            } catch (RuntimeException unused) {
                runnableC8986g.m15092e(cls);
            }
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: a */
    public void mo15089a(InterfaceC9589a interfaceC9589a, Object obj) {
        if (obj != null) {
            m15094g(interfaceC9589a, this.f15374a.m12994w((Class) obj));
            return;
        }
        for (int i10 : this.f15374a.m12990q()) {
            m15094g(interfaceC9589a, i10);
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: b */
    public void mo15090b(InterfaceC9589a interfaceC9589a, Object obj) {
        if (obj != null) {
            this.f15375b.m14371d(Integer.valueOf(this.f15374a.m12994w((Class) obj)), interfaceC9589a);
            return;
        }
        for (int i10 : this.f15374a.m12990q()) {
            this.f15375b.m14371d(Integer.valueOf(i10), interfaceC9589a);
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: c */
    public void mo15091c(final InterfaceC9589a interfaceC9589a, final Object obj) {
        this.f15374a.m12970B(new Runnable() { // from class: q8.f
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC8986g.m15088d(this.f15371a, obj, interfaceC9589a);
            }
        });
    }

    /* renamed from: e */
    public final void m15092e(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    /* renamed from: f */
    public void m15093f(int[] iArr) {
        synchronized (this.f15376c) {
            try {
                this.f15376c.add(iArr);
                if (!this.f15377d) {
                    this.f15377d = true;
                    this.f15374a.m12970B(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m15094g(InterfaceC9589a interfaceC9589a, int i10) {
        AbstractC9591c.m15985a((Set) this.f15375b.get(Integer.valueOf(i10)), interfaceC9589a);
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        while (true) {
            try {
            } finally {
            }
            synchronized (this.f15376c) {
                iArr = (int[]) this.f15376c.pollFirst();
                if (iArr == null) {
                    this.f15377d = false;
                    return;
                }
                this.f15377d = false;
            }
            for (int i10 : iArr) {
                Collection collection = this.f15375b.get(Integer.valueOf(i10));
                if (collection != null && !collection.isEmpty()) {
                    Class clsM12992u = this.f15374a.m12992u(i10);
                    try {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC9589a) it.next()).mo13021b(clsM12992u);
                        }
                    } catch (RuntimeException unused) {
                        m15092e(clsM12992u);
                    }
                }
            }
        }
    }
}
