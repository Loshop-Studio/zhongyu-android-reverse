package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C4717h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p016b1.AbstractC4408j;
import p053f0.InterfaceC6283b;
import p067h0.InterfaceC6440j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C4710a {

    /* renamed from: a */
    public final boolean f2377a;

    /* renamed from: b */
    public final Executor f2378b;

    /* renamed from: c */
    public final Map f2379c;

    /* renamed from: d */
    public final ReferenceQueue f2380d;

    /* renamed from: e */
    public C4717h.a f2381e;

    /* renamed from: f */
    public volatile boolean f2382f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC8021a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f2383a;

            public RunnableC8021a(Runnable runnable) {
                this.f2383a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f2383a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC8021a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4710a.this.m2675b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC6283b f2386a;

        /* renamed from: b */
        public final boolean f2387b;

        /* renamed from: c */
        public InterfaceC6440j f2388c;

        public c(InterfaceC6283b interfaceC6283b, C4717h c4717h, ReferenceQueue referenceQueue, boolean z6) {
            super(c4717h, referenceQueue);
            this.f2386a = (InterfaceC6283b) AbstractC4408j.m1438d(interfaceC6283b);
            this.f2388c = (c4717h.m2752d() && z6) ? (InterfaceC6440j) AbstractC4408j.m1438d(c4717h.m2751c()) : null;
            this.f2387b = c4717h.m2752d();
        }

        /* renamed from: a */
        public void m2680a() {
            this.f2388c = null;
            clear();
        }
    }

    public C4710a(boolean z6) {
        this(z6, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m2674a(InterfaceC6283b interfaceC6283b, C4717h c4717h) {
        c cVar = (c) this.f2379c.put(interfaceC6283b, new c(interfaceC6283b, c4717h, this.f2380d, this.f2377a));
        if (cVar != null) {
            cVar.m2680a();
        }
    }

    /* renamed from: b */
    public void m2675b() {
        while (!this.f2382f) {
            try {
                m2676c((c) this.f2380d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m2676c(c cVar) {
        InterfaceC6440j interfaceC6440j;
        synchronized (this) {
            this.f2379c.remove(cVar.f2386a);
            if (cVar.f2387b && (interfaceC6440j = cVar.f2388c) != null) {
                this.f2381e.mo2714c(cVar.f2386a, new C4717h(interfaceC6440j, true, false, cVar.f2386a, this.f2381e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m2677d(InterfaceC6283b interfaceC6283b) {
        c cVar = (c) this.f2379c.remove(interfaceC6283b);
        if (cVar != null) {
            cVar.m2680a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C4717h m2678e(InterfaceC6283b interfaceC6283b) {
        c cVar = (c) this.f2379c.get(interfaceC6283b);
        if (cVar == null) {
            return null;
        }
        C4717h c4717h = (C4717h) cVar.get();
        if (c4717h == null) {
            m2676c(cVar);
        }
        return c4717h;
    }

    /* renamed from: f */
    public void m2679f(C4717h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f2381e = aVar;
            }
        }
    }

    public C4710a(boolean z6, Executor executor) {
        this.f2379c = new HashMap();
        this.f2380d = new ReferenceQueue();
        this.f2377a = z6;
        this.f2378b = executor;
        executor.execute(new b());
    }
}
