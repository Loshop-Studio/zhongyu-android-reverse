package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p087f3.AbstractC2612x1;
import p087f3.C2605v0;
import p142q2.InterfaceC3015g;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0490c {

    /* renamed from: b */
    private boolean f3405b;

    /* renamed from: c */
    private boolean f3406c;

    /* renamed from: a */
    private boolean f3404a = true;

    /* renamed from: d */
    private final Queue<Runnable> f3407d = new ArrayDeque();

    /* renamed from: androidx.lifecycle.c$a */
    static final class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InterfaceC3015g f3409b;

        /* renamed from: c */
        final /* synthetic */ Runnable f3410c;

        a(InterfaceC3015g interfaceC3015g, Runnable runnable) {
            this.f3409b = interfaceC3015g;
            this.f3410c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0490c.this.m2843e(this.f3410c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m2843e(Runnable runnable) {
        if (!this.f3407d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        m2846d();
    }

    /* renamed from: b */
    public final boolean m2844b() {
        return this.f3405b || !this.f3404a;
    }

    @SuppressLint({"WrongThread"})
    /* renamed from: c */
    public final void m2845c(@NotNull InterfaceC3015g context, @NotNull Runnable runnable) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(runnable, "runnable");
        AbstractC2612x1 abstractC2612x1Mo8757L = C2605v0.m8752c().mo8757L();
        if (abstractC2612x1Mo8757L.mo2906K(context) || m2844b()) {
            abstractC2612x1Mo8757L.mo2905J(context, new a(context, runnable));
        } else {
            m2843e(runnable);
        }
    }

    /* renamed from: d */
    public final void m2846d() {
        if (this.f3406c) {
            return;
        }
        try {
            this.f3406c = true;
            while ((!this.f3407d.isEmpty()) && m2844b()) {
                Runnable runnablePoll = this.f3407d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.f3406c = false;
        }
    }

    /* renamed from: f */
    public final void m2847f() {
        this.f3405b = true;
        m2846d();
    }

    /* renamed from: g */
    public final void m2848g() {
        this.f3404a = true;
    }

    /* renamed from: h */
    public final void m2849h() {
        if (this.f3404a) {
            if (!(!this.f3405b)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f3404a = false;
            m2846d();
        }
    }
}
