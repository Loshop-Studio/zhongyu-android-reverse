package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C5492h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p091e1.AbstractC7837i;
import p122h0.InterfaceC8082b;
import p152k0.InterfaceC8259j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C5485a {

    /* renamed from: a */
    public final boolean f3383a;

    /* renamed from: b */
    public final Executor f3384b;

    /* renamed from: c */
    public final Map f3385c;

    /* renamed from: d */
    public final ReferenceQueue f3386d;

    /* renamed from: e */
    public C5492h.a f3387e;

    /* renamed from: f */
    public volatile boolean f3388f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC10052a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f3389a;

            public RunnableC10052a(Runnable runnable) {
                this.f3389a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f3389a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC10052a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5485a.this.m3146b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC8082b f3392a;

        /* renamed from: b */
        public final boolean f3393b;

        /* renamed from: c */
        public InterfaceC8259j f3394c;

        public c(InterfaceC8082b interfaceC8082b, C5492h c5492h, ReferenceQueue referenceQueue, boolean z9) {
            super(c5492h, referenceQueue);
            this.f3392a = (InterfaceC8082b) AbstractC7837i.m12256d(interfaceC8082b);
            this.f3394c = (c5492h.m3224d() && z9) ? (InterfaceC8259j) AbstractC7837i.m12256d(c5492h.m3223c()) : null;
            this.f3393b = c5492h.m3224d();
        }

        /* renamed from: a */
        public void m3151a() {
            this.f3394c = null;
            clear();
        }
    }

    public C5485a(boolean z9) {
        this(z9, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m3145a(InterfaceC8082b interfaceC8082b, C5492h c5492h) {
        c cVar = (c) this.f3385c.put(interfaceC8082b, new c(interfaceC8082b, c5492h, this.f3386d, this.f3383a));
        if (cVar != null) {
            cVar.m3151a();
        }
    }

    /* renamed from: b */
    public void m3146b() {
        while (!this.f3388f) {
            try {
                m3147c((c) this.f3386d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m3147c(c cVar) {
        InterfaceC8259j interfaceC8259j;
        synchronized (this) {
            this.f3385c.remove(cVar.f3392a);
            if (cVar.f3393b && (interfaceC8259j = cVar.f3394c) != null) {
                this.f3387e.mo3184a(cVar.f3392a, new C5492h(interfaceC8259j, true, false, cVar.f3392a, this.f3387e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m3148d(InterfaceC8082b interfaceC8082b) {
        c cVar = (c) this.f3385c.remove(interfaceC8082b);
        if (cVar != null) {
            cVar.m3151a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C5492h m3149e(InterfaceC8082b interfaceC8082b) {
        c cVar = (c) this.f3385c.get(interfaceC8082b);
        if (cVar == null) {
            return null;
        }
        C5492h c5492h = (C5492h) cVar.get();
        if (c5492h == null) {
            m3147c(cVar);
        }
        return c5492h;
    }

    /* renamed from: f */
    public void m3150f(C5492h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3387e = aVar;
            }
        }
    }

    public C5485a(boolean z9, Executor executor) {
        this.f3385c = new HashMap();
        this.f3386d = new ReferenceQueue();
        this.f3383a = z9;
        this.f3384b = executor;
        executor.execute(new b());
    }
}
