package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p103j.InterfaceC2685a;
import p144r0.C3023e;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
final class C0606a {

    /* renamed from: e */
    final long f3914e;

    /* renamed from: f */
    final Executor f3915f;

    /* renamed from: i */
    InterfaceC3371b f3918i;

    /* renamed from: a */
    private InterfaceC3372c f3910a = null;

    /* renamed from: b */
    private final Handler f3911b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    Runnable f3912c = null;

    /* renamed from: d */
    final Object f3913d = new Object();

    /* renamed from: g */
    int f3916g = 0;

    /* renamed from: h */
    long f3917h = SystemClock.uptimeMillis();

    /* renamed from: j */
    private boolean f3919j = false;

    /* renamed from: k */
    private final Runnable f3920k = new a();

    /* renamed from: l */
    final Runnable f3921l = new b();

    /* renamed from: androidx.room.a$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0606a c0606a = C0606a.this;
            c0606a.f3915f.execute(c0606a.f3921l);
        }
    }

    /* renamed from: androidx.room.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C0606a.this.f3913d) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                C0606a c0606a = C0606a.this;
                if (jUptimeMillis - c0606a.f3917h < c0606a.f3914e) {
                    return;
                }
                if (c0606a.f3916g != 0) {
                    return;
                }
                Runnable runnable = c0606a.f3912c;
                if (runnable == null) {
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                runnable.run();
                InterfaceC3371b interfaceC3371b = C0606a.this.f3918i;
                if (interfaceC3371b != null && interfaceC3371b.isOpen()) {
                    try {
                        C0606a.this.f3918i.close();
                    } catch (IOException e4) {
                        C3023e.m10148a(e4);
                    }
                    C0606a.this.f3918i = null;
                }
            }
        }
    }

    C0606a(long j4, TimeUnit timeUnit, Executor executor) {
        this.f3914e = timeUnit.toMillis(j4);
        this.f3915f = executor;
    }

    /* renamed from: a */
    public void m3475a() throws IOException {
        synchronized (this.f3913d) {
            this.f3919j = true;
            InterfaceC3371b interfaceC3371b = this.f3918i;
            if (interfaceC3371b != null) {
                interfaceC3371b.close();
            }
            this.f3918i = null;
        }
    }

    /* renamed from: b */
    public void m3476b() {
        synchronized (this.f3913d) {
            int i4 = this.f3916g;
            if (i4 <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i5 = i4 - 1;
            this.f3916g = i5;
            if (i5 == 0) {
                if (this.f3918i == null) {
                } else {
                    this.f3911b.postDelayed(this.f3920k, this.f3914e);
                }
            }
        }
    }

    /* renamed from: c */
    public <V> V m3477c(InterfaceC2685a<InterfaceC3371b, V> interfaceC2685a) {
        try {
            return interfaceC2685a.apply(m3479e());
        } finally {
            m3476b();
        }
    }

    /* renamed from: d */
    public InterfaceC3371b m3478d() {
        InterfaceC3371b interfaceC3371b;
        synchronized (this.f3913d) {
            interfaceC3371b = this.f3918i;
        }
        return interfaceC3371b;
    }

    /* renamed from: e */
    public InterfaceC3371b m3479e() {
        synchronized (this.f3913d) {
            this.f3911b.removeCallbacks(this.f3920k);
            this.f3916g++;
            if (this.f3919j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            InterfaceC3371b interfaceC3371b = this.f3918i;
            if (interfaceC3371b != null && interfaceC3371b.isOpen()) {
                return this.f3918i;
            }
            InterfaceC3372c interfaceC3372c = this.f3910a;
            if (interfaceC3372c == null) {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            InterfaceC3371b interfaceC3371bMo3483F = interfaceC3372c.mo3483F();
            this.f3918i = interfaceC3371bMo3483F;
            return interfaceC3371bMo3483F;
        }
    }

    /* renamed from: f */
    public void m3480f(InterfaceC3372c interfaceC3372c) {
        if (this.f3910a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f3910a = interfaceC3372c;
        }
    }

    /* renamed from: g */
    public boolean m3481g() {
        return !this.f3919j;
    }

    /* renamed from: h */
    public void m3482h(Runnable runnable) {
        this.f3912c = runnable;
    }
}
