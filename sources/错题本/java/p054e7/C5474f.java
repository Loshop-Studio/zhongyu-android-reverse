package p054e7;

import android.support.v4.media.AbstractC0037f;
import com.blankj.utilcode.util.RunnableC3379a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.AbstractC6018z;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5870c0;
import kotlinx.coroutines.InterfaceC5962g0;
import kotlinx.coroutines.RunnableC5994q1;
import p075h6.InterfaceC5636h;

/* renamed from: e7.f */
/* loaded from: classes4.dex */
public final class C5474f extends AbstractC5995r implements InterfaceC5870c0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8454g = AtomicIntegerFieldUpdater.newUpdater(C5474f.class, "runningWorkers$volatile");

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5870c0 f8455a;

    /* renamed from: b */
    public final AbstractC5995r f8456b;

    /* renamed from: c */
    public final int f8457c;

    /* renamed from: d */
    public final String f8458d;

    /* renamed from: e */
    public final C5476h f8459e;

    /* renamed from: f */
    public final Object f8460f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C5474f(AbstractC5995r abstractC5995r, int i, String str) {
        InterfaceC5870c0 interfaceC5870c0 = abstractC5995r instanceof InterfaceC5870c0 ? (InterfaceC5870c0) abstractC5995r : null;
        this.f8455a = interfaceC5870c0 == null ? AbstractC6018z.f9531a : interfaceC5870c0;
        this.f8456b = abstractC5995r;
        this.f8457c = i;
        this.f8458d = str;
        this.f8459e = new C5476h();
        this.f8460f = new Object();
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: a */
    public final InterfaceC5962g0 mo4815a(long j7, RunnableC5994q1 runnableC5994q1, InterfaceC5636h interfaceC5636h) {
        return this.f8455a.mo4815a(j7, runnableC5994q1, interfaceC5636h);
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: b */
    public final void mo4816b(long j7, C5961g c5961g) {
        this.f8455a.mo4816b(j7, c5961g);
    }

    /* renamed from: d */
    public final Runnable m4845d() {
        while (true) {
            Runnable runnable = (Runnable) this.f8459e.m4850d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f8460f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8454g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f8459e.m4849c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        Runnable runnableM4845d;
        this.f8459e.m4847a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8454g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f8457c || !m4846k() || (runnableM4845d = m4845d()) == null) {
            return;
        }
        try {
            AbstractC5469a.m4833i(this.f8456b, this, new RunnableC3379a0(6, this, false, runnableM4845d));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        Runnable runnableM4845d;
        this.f8459e.m4847a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8454g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f8457c || !m4846k() || (runnableM4845d = m4845d()) == null) {
            return;
        }
        try {
            this.f8456b.dispatchYield(this, new RunnableC3379a0(6, this, false, runnableM4845d));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    /* renamed from: k */
    public final boolean m4846k() {
        synchronized (this.f8460f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8454g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f8457c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        AbstractC5469a.m4825a(i);
        return i >= this.f8457c ? str != null ? new C5480l(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        String str = this.f8458d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8456b);
        sb.append(".limitedParallelism(");
        return AbstractC0037f.m88m(sb, this.f8457c, ')');
    }
}
