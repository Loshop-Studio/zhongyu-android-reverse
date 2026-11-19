package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C5381h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p117i1.AbstractC7651j;
import p162m0.InterfaceC8537b;
import p184o0.InterfaceC8690j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C5374a {

    /* renamed from: a */
    public final boolean f3586a;

    /* renamed from: b */
    public final Executor f3587b;

    /* renamed from: c */
    public final Map f3588c;

    /* renamed from: d */
    public final ReferenceQueue f3589d;

    /* renamed from: e */
    public C5381h.a f3590e;

    /* renamed from: f */
    public volatile boolean f3591f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC10130a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f3592a;

            public RunnableC10130a(Runnable runnable) {
                this.f3592a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f3592a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC10130a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5374a.this.m3495b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC8537b f3595a;

        /* renamed from: b */
        public final boolean f3596b;

        /* renamed from: c */
        public InterfaceC8690j f3597c;

        public c(InterfaceC8537b interfaceC8537b, C5381h c5381h, ReferenceQueue referenceQueue, boolean z9) {
            super(c5381h, referenceQueue);
            this.f3595a = (InterfaceC8537b) AbstractC7651j.m12683d(interfaceC8537b);
            this.f3597c = (c5381h.m3572d() && z9) ? (InterfaceC8690j) AbstractC7651j.m12683d(c5381h.m3571c()) : null;
            this.f3596b = c5381h.m3572d();
        }

        /* renamed from: a */
        public void m3500a() {
            this.f3597c = null;
            clear();
        }
    }

    public C5374a(boolean z9) {
        this(z9, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m3494a(InterfaceC8537b interfaceC8537b, C5381h c5381h) {
        c cVar = (c) this.f3588c.put(interfaceC8537b, new c(interfaceC8537b, c5381h, this.f3589d, this.f3586a));
        if (cVar != null) {
            cVar.m3500a();
        }
    }

    /* renamed from: b */
    public void m3495b() {
        while (!this.f3591f) {
            try {
                m3496c((c) this.f3589d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m3496c(c cVar) {
        InterfaceC8690j interfaceC8690j;
        synchronized (this) {
            this.f3588c.remove(cVar.f3595a);
            if (cVar.f3596b && (interfaceC8690j = cVar.f3597c) != null) {
                this.f3590e.mo3534c(cVar.f3595a, new C5381h(interfaceC8690j, true, false, cVar.f3595a, this.f3590e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m3497d(InterfaceC8537b interfaceC8537b) {
        c cVar = (c) this.f3588c.remove(interfaceC8537b);
        if (cVar != null) {
            cVar.m3500a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C5381h m3498e(InterfaceC8537b interfaceC8537b) {
        c cVar = (c) this.f3588c.get(interfaceC8537b);
        if (cVar == null) {
            return null;
        }
        C5381h c5381h = (C5381h) cVar.get();
        if (c5381h == null) {
            m3496c(cVar);
        }
        return c5381h;
    }

    /* renamed from: f */
    public void m3499f(C5381h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3590e = aVar;
            }
        }
    }

    public C5374a(boolean z9, Executor executor) {
        this.f3588c = new HashMap();
        this.f3589d = new ReferenceQueue();
        this.f3586a = z9;
        this.f3587b = executor;
        executor.execute(new b());
    }
}
