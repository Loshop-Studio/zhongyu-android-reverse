package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C2879h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p062g0.AbstractC3749i;
import p076j.InterfaceC3792b;
import p093m.InterfaceC4361j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes2.dex */
public final class C2872a {

    /* renamed from: a */
    public final boolean f729a;

    /* renamed from: b */
    public final Executor f730b;

    /* renamed from: c */
    public final Map f731c;

    /* renamed from: d */
    public final ReferenceQueue f732d;

    /* renamed from: e */
    public C2879h.a f733e;

    /* renamed from: f */
    public volatile boolean f734f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC4751a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f735a;

            public RunnableC4751a(Runnable runnable) {
                this.f735a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f735a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC4751a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2872a.this.m1821b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC3792b f738a;

        /* renamed from: b */
        public final boolean f739b;

        /* renamed from: c */
        public InterfaceC4361j f740c;

        public c(InterfaceC3792b interfaceC3792b, C2879h c2879h, ReferenceQueue referenceQueue, boolean z3) {
            super(c2879h, referenceQueue);
            this.f738a = (InterfaceC3792b) AbstractC3749i.m4768d(interfaceC3792b);
            this.f740c = (c2879h.m1900d() && z3) ? (InterfaceC4361j) AbstractC3749i.m4768d(c2879h.m1899c()) : null;
            this.f739b = c2879h.m1900d();
        }

        /* renamed from: a */
        public void m1826a() {
            this.f740c = null;
            clear();
        }
    }

    public C2872a(boolean z3) {
        this(z3, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m1820a(InterfaceC3792b interfaceC3792b, C2879h c2879h) {
        c cVar = (c) this.f731c.put(interfaceC3792b, new c(interfaceC3792b, c2879h, this.f732d, this.f729a));
        if (cVar != null) {
            cVar.m1826a();
        }
    }

    /* renamed from: b */
    public void m1821b() {
        while (!this.f734f) {
            try {
                m1822c((c) this.f732d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m1822c(c cVar) {
        InterfaceC4361j interfaceC4361j;
        synchronized (this) {
            this.f731c.remove(cVar.f738a);
            if (cVar.f739b && (interfaceC4361j = cVar.f740c) != null) {
                this.f733e.mo1862d(cVar.f738a, new C2879h(interfaceC4361j, true, false, cVar.f738a, this.f733e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m1823d(InterfaceC3792b interfaceC3792b) {
        c cVar = (c) this.f731c.remove(interfaceC3792b);
        if (cVar != null) {
            cVar.m1826a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C2879h m1824e(InterfaceC3792b interfaceC3792b) {
        c cVar = (c) this.f731c.get(interfaceC3792b);
        if (cVar == null) {
            return null;
        }
        C2879h c2879h = (C2879h) cVar.get();
        if (c2879h == null) {
            m1822c(cVar);
        }
        return c2879h;
    }

    /* renamed from: f */
    public void m1825f(C2879h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f733e = aVar;
            }
        }
    }

    public C2872a(boolean z3, Executor executor) {
        this.f731c = new HashMap();
        this.f732d = new ReferenceQueue();
        this.f729a = z3;
        this.f730b = executor;
        executor.execute(new b());
    }
}
