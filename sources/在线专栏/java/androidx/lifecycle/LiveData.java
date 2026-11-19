package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import java.util.Iterator;
import java.util.Map;
import p093h.C2650a;
import p098i.C2661b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C2661b<InterfaceC0512t<? super T>, LiveData<T>.AbstractC0482c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    class LifecycleBoundObserver extends LiveData<T>.AbstractC0482c implements InterfaceC0501i {

        /* renamed from: e */
        final InterfaceC0504l f3369e;

        LifecycleBoundObserver(InterfaceC0504l interfaceC0504l, InterfaceC0512t<? super T> interfaceC0512t) {
            super(interfaceC0512t);
            this.f3369e = interfaceC0504l;
        }

        @Override // androidx.lifecycle.InterfaceC0501i
        /* renamed from: d */
        public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
            AbstractC0496f.c cVarMo2868b = this.f3369e.getLifecycle().mo2868b();
            if (cVarMo2868b == AbstractC0496f.c.DESTROYED) {
                LiveData.this.removeObserver(this.f3373a);
                return;
            }
            AbstractC0496f.c cVar = null;
            while (cVar != cVarMo2868b) {
                m2816e(mo2815k());
                cVar = cVarMo2868b;
                cVarMo2868b = this.f3369e.getLifecycle().mo2868b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0482c
        /* renamed from: i */
        void mo2813i() {
            this.f3369e.getLifecycle().mo2869c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0482c
        /* renamed from: j */
        boolean mo2814j(InterfaceC0504l interfaceC0504l) {
            return this.f3369e == interfaceC0504l;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0482c
        /* renamed from: k */
        boolean mo2815k() {
            return this.f3369e.getLifecycle().mo2868b().m2874a(AbstractC0496f.c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class RunnableC0480a implements Runnable {
        RunnableC0480a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0481b extends LiveData<T>.AbstractC0482c {
        C0481b(InterfaceC0512t<? super T> interfaceC0512t) {
            super(interfaceC0512t);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0482c
        /* renamed from: k */
        boolean mo2815k() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class AbstractC0482c {

        /* renamed from: a */
        final InterfaceC0512t<? super T> f3373a;

        /* renamed from: b */
        boolean f3374b;

        /* renamed from: c */
        int f3375c = -1;

        AbstractC0482c(InterfaceC0512t<? super T> interfaceC0512t) {
            this.f3373a = interfaceC0512t;
        }

        /* renamed from: e */
        void m2816e(boolean z3) {
            if (z3 == this.f3374b) {
                return;
            }
            this.f3374b = z3;
            LiveData.this.changeActiveCounter(z3 ? 1 : -1);
            if (this.f3374b) {
                LiveData.this.dispatchingValue(this);
            }
        }

        /* renamed from: i */
        void mo2813i() {
        }

        /* renamed from: j */
        boolean mo2814j(InterfaceC0504l interfaceC0504l) {
            return false;
        }

        /* renamed from: k */
        abstract boolean mo2815k();
    }

    public LiveData(T t3) {
        this.mDataLock = new Object();
        this.mObservers = new C2661b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC0480a();
        this.mData = t3;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (C2650a.m8861f().mo8863c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.AbstractC0482c abstractC0482c) {
        if (abstractC0482c.f3374b) {
            if (!abstractC0482c.mo2815k()) {
                abstractC0482c.m2816e(false);
                return;
            }
            int i4 = abstractC0482c.f3375c;
            int i5 = this.mVersion;
            if (i4 >= i5) {
                return;
            }
            abstractC0482c.f3375c = i5;
            abstractC0482c.f3373a.mo2584a((Object) this.mData);
        }
    }

    void changeActiveCounter(int i4) {
        int i5 = this.mActiveCount;
        this.mActiveCount = i4 + i5;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i6 = this.mActiveCount;
                if (i5 == i6) {
                    return;
                }
                boolean z3 = i5 == 0 && i6 > 0;
                boolean z4 = i5 > 0 && i6 == 0;
                if (z3) {
                    onActive();
                } else if (z4) {
                    onInactive();
                }
                i5 = i6;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    void dispatchingValue(LiveData<T>.AbstractC0482c abstractC0482c) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (abstractC0482c != null) {
                considerNotify(abstractC0482c);
                abstractC0482c = null;
            } else {
                C2661b<InterfaceC0512t<? super T>, LiveData<T>.AbstractC0482c>.d dVarM8936c = this.mObservers.m8936c();
                while (dVarM8936c.hasNext()) {
                    considerNotify((AbstractC0482c) dVarM8936c.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t3 = (T) this.mData;
        if (t3 != NOT_SET) {
            return t3;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public void observe(InterfaceC0504l interfaceC0504l, InterfaceC0512t<? super T> interfaceC0512t) {
        assertMainThread("observe");
        if (interfaceC0504l.getLifecycle().mo2868b() == AbstractC0496f.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0504l, interfaceC0512t);
        LiveData<T>.AbstractC0482c abstractC0482cMo8932f = this.mObservers.mo8932f(interfaceC0512t, lifecycleBoundObserver);
        if (abstractC0482cMo8932f != null && !abstractC0482cMo8932f.mo2814j(interfaceC0504l)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0482cMo8932f != null) {
            return;
        }
        interfaceC0504l.getLifecycle().mo2867a(lifecycleBoundObserver);
    }

    public void observeForever(InterfaceC0512t<? super T> interfaceC0512t) {
        assertMainThread("observeForever");
        C0481b c0481b = new C0481b(interfaceC0512t);
        LiveData<T>.AbstractC0482c abstractC0482cMo8932f = this.mObservers.mo8932f(interfaceC0512t, c0481b);
        if (abstractC0482cMo8932f instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0482cMo8932f != null) {
            return;
        }
        c0481b.m2816e(true);
    }

    protected void onActive() {
    }

    protected void onInactive() {
    }

    protected void postValue(T t3) {
        boolean z3;
        synchronized (this.mDataLock) {
            z3 = this.mPendingData == NOT_SET;
            this.mPendingData = t3;
        }
        if (z3) {
            C2650a.m8861f().mo8864d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(InterfaceC0512t<? super T> interfaceC0512t) {
        assertMainThread("removeObserver");
        LiveData<T>.AbstractC0482c abstractC0482cMo8933g = this.mObservers.mo8933g(interfaceC0512t);
        if (abstractC0482cMo8933g == null) {
            return;
        }
        abstractC0482cMo8933g.mo2813i();
        abstractC0482cMo8933g.m2816e(false);
    }

    public void removeObservers(InterfaceC0504l interfaceC0504l) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<InterfaceC0512t<? super T>, LiveData<T>.AbstractC0482c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC0512t<? super T>, LiveData<T>.AbstractC0482c> next = it.next();
            if (next.getValue().mo2814j(interfaceC0504l)) {
                removeObserver(next.getKey());
            }
        }
    }

    protected void setValue(T t3) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t3;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C2661b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new RunnableC0480a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
