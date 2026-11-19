package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C5849h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p109d1.AbstractC8909j;
import p168h0.InterfaceC9435b;
import p198j0.InterfaceC9657j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C5842a {

    /* renamed from: a */
    public final boolean f4789a;

    /* renamed from: b */
    public final Executor f4790b;

    /* renamed from: c */
    public final Map f4791c;

    /* renamed from: d */
    public final ReferenceQueue f4792d;

    /* renamed from: e */
    public C5849h.a f4793e;

    /* renamed from: f */
    public volatile boolean f4794f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        public class RunnableC12099a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ Runnable f4795c;

            public RunnableC12099a(Runnable runnable) {
                this.f4795c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f4795c.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC12099a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5842a.this.m4145b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public static final class c extends WeakReference {

        /* renamed from: a */
        public final InterfaceC9435b f4798a;

        /* renamed from: b */
        public final boolean f4799b;

        /* renamed from: c */
        public InterfaceC9657j f4800c;

        public c(InterfaceC9435b interfaceC9435b, C5849h c5849h, ReferenceQueue referenceQueue, boolean z10) {
            super(c5849h, referenceQueue);
            this.f4798a = (InterfaceC9435b) AbstractC8909j.m17468d(interfaceC9435b);
            this.f4800c = (c5849h.m4222d() && z10) ? (InterfaceC9657j) AbstractC8909j.m17468d(c5849h.m4221c()) : null;
            this.f4799b = c5849h.m4222d();
        }

        /* renamed from: a */
        public void m4150a() {
            this.f4800c = null;
            clear();
        }
    }

    public C5842a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new a()));
    }

    /* renamed from: a */
    public synchronized void m4144a(InterfaceC9435b interfaceC9435b, C5849h c5849h) {
        c cVar = (c) this.f4791c.put(interfaceC9435b, new c(interfaceC9435b, c5849h, this.f4792d, this.f4789a));
        if (cVar != null) {
            cVar.m4150a();
        }
    }

    /* renamed from: b */
    public void m4145b() {
        while (!this.f4794f) {
            try {
                m4146c((c) this.f4792d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m4146c(c cVar) {
        InterfaceC9657j interfaceC9657j;
        synchronized (this) {
            this.f4791c.remove(cVar.f4798a);
            if (cVar.f4799b && (interfaceC9657j = cVar.f4800c) != null) {
                this.f4793e.mo4182a(cVar.f4798a, new C5849h(interfaceC9657j, true, false, cVar.f4798a, this.f4793e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m4147d(InterfaceC9435b interfaceC9435b) {
        c cVar = (c) this.f4791c.remove(interfaceC9435b);
        if (cVar != null) {
            cVar.m4150a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C5849h m4148e(InterfaceC9435b interfaceC9435b) {
        c cVar = (c) this.f4791c.get(interfaceC9435b);
        if (cVar == null) {
            return null;
        }
        C5849h c5849h = (C5849h) cVar.get();
        if (c5849h == null) {
            m4146c(cVar);
        }
        return c5849h;
    }

    /* renamed from: f */
    public void m4149f(C5849h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f4793e = aVar;
            }
        }
    }

    public C5842a(boolean z10, Executor executor) {
        this.f4791c = new HashMap();
        this.f4792d = new ReferenceQueue();
        this.f4789a = z10;
        this.f4790b = executor;
        executor.execute(new b());
    }
}
