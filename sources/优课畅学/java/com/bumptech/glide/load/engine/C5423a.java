package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C5430h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p116h0.AbstractC8706j;
import p160l.InterfaceC9228b;
import p182n.InterfaceC9357j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C5423a {

    /* renamed from: a */
    public final boolean f3019a;

    /* renamed from: b */
    public final Executor f3020b;

    /* renamed from: c */
    public final Map f3021c;

    /* renamed from: d */
    public final ReferenceQueue f3022d;

    /* renamed from: e */
    public C5430h.a f3023e;

    /* renamed from: f */
    public volatile boolean f3024f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC10787a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f3025a;

            public RunnableC10787a(Runnable runnable) {
                this.f3025a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f3025a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC10787a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5423a.this.m2941b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC9228b f3028a;

        /* renamed from: b */
        public final boolean f3029b;

        /* renamed from: c */
        public InterfaceC9357j f3030c;

        public c(InterfaceC9228b interfaceC9228b, C5430h c5430h, ReferenceQueue referenceQueue, boolean z10) {
            super(c5430h, referenceQueue);
            this.f3028a = (InterfaceC9228b) AbstractC8706j.m14181d(interfaceC9228b);
            this.f3030c = (c5430h.m3018d() && z10) ? (InterfaceC9357j) AbstractC8706j.m14181d(c5430h.m3017c()) : null;
            this.f3029b = c5430h.m3018d();
        }

        /* renamed from: a */
        public void m2946a() {
            this.f3030c = null;
            clear();
        }
    }

    public C5423a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m2940a(InterfaceC9228b interfaceC9228b, C5430h c5430h) {
        c cVar = (c) this.f3021c.put(interfaceC9228b, new c(interfaceC9228b, c5430h, this.f3022d, this.f3019a));
        if (cVar != null) {
            cVar.m2946a();
        }
    }

    /* renamed from: b */
    public void m2941b() {
        while (!this.f3024f) {
            try {
                m2942c((c) this.f3022d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m2942c(c cVar) {
        InterfaceC9357j interfaceC9357j;
        synchronized (this) {
            this.f3021c.remove(cVar.f3028a);
            if (cVar.f3029b && (interfaceC9357j = cVar.f3030c) != null) {
                this.f3023e.mo2981d(cVar.f3028a, new C5430h(interfaceC9357j, true, false, cVar.f3028a, this.f3023e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m2943d(InterfaceC9228b interfaceC9228b) {
        c cVar = (c) this.f3021c.remove(interfaceC9228b);
        if (cVar != null) {
            cVar.m2946a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C5430h m2944e(InterfaceC9228b interfaceC9228b) {
        c cVar = (c) this.f3021c.get(interfaceC9228b);
        if (cVar == null) {
            return null;
        }
        C5430h c5430h = (C5430h) cVar.get();
        if (c5430h == null) {
            m2942c(cVar);
        }
        return c5430h;
    }

    /* renamed from: f */
    public void m2945f(C5430h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3023e = aVar;
            }
        }
    }

    public C5423a(boolean z10, Executor executor) {
        this.f3021c = new HashMap();
        this.f3022d = new ReferenceQueue();
        this.f3019a = z10;
        this.f3020b = executor;
        executor.execute(new b());
    }
}
