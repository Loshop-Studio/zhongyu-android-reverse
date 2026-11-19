package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9203g;
import kotlinx.coroutines.android.HandlerContext;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.C8843i0;
import p135i8.C8847j1;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p146j8.AbstractC9029d;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class HandlerContext extends AbstractC9029d implements InterfaceC9203g {

    /* renamed from: a */
    public final Handler f17589a;

    /* renamed from: b */
    public final String f17590b;

    /* renamed from: c */
    public final boolean f17591c;

    /* renamed from: d */
    public final HandlerContext f17592d;

    /* renamed from: kotlinx.coroutines.android.HandlerContext$a */
    public static final class RunnableC9153a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8845j f17593a;

        /* renamed from: b */
        public final /* synthetic */ HandlerContext f17594b;

        public RunnableC9153a(InterfaceC8845j interfaceC8845j, HandlerContext handlerContext) {
            this.f17593a = interfaceC8845j;
            this.f17594b = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17593a.mo14872q(this.f17594b, C8736p.f16368a);
        }
    }

    public HandlerContext(Handler handler, String str, boolean z10) {
        super(null);
        this.f17589a = handler;
        this.f17590b = str;
        this.f17591c = z10;
        this.f17592d = z10 ? this : new HandlerContext(handler, str, true);
    }

    /* renamed from: w */
    public static final void m16334w(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f17589a.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        if (this.f17589a.post(runnable)) {
            return;
        }
        m16337t(interfaceC9100d, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f17589a == this.f17589a && handlerContext.f17591c == this.f17591c;
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: f */
    public InterfaceC8849k0 mo16335f(long j10, final Runnable runnable, InterfaceC9100d interfaceC9100d) {
        if (this.f17589a.postDelayed(runnable, AbstractC8323h.m13514i(j10, 4611686018427387903L))) {
            return new InterfaceC8849k0() { // from class: j8.c
                @Override // p135i8.InterfaceC8849k0
                public final void dispose() {
                    HandlerContext.m16334w(this.f17253a, runnable);
                }
            };
        }
        m16337t(interfaceC9100d, runnable);
        return C8847j1.f16518a;
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: g */
    public void mo16336g(long j10, InterfaceC8845j interfaceC8845j) {
        final RunnableC9153a runnableC9153a = new RunnableC9153a(interfaceC8845j, this);
        if (this.f17589a.postDelayed(runnableC9153a, AbstractC8323h.m13514i(j10, 4611686018427387903L))) {
            interfaceC8845j.mo14873r(new InterfaceC10570l() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Throwable th) {
                    this.f17595a.f17589a.removeCallbacks(runnableC9153a);
                }
            });
        } else {
            m16337t(interfaceC8845j.getContext(), runnableC9153a);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f17589a) ^ (this.f17591c ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(InterfaceC9100d interfaceC9100d) {
        return (this.f17591c && AbstractC9133u.m16128b(Looper.myLooper(), this.f17589a.getLooper())) ? false : true;
    }

    /* renamed from: t */
    public final void m16337t(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        AbstractC8823b1.m14807c(interfaceC9100d, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C8843i0.m14867b().dispatch(interfaceC9100d, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strM14864m = m14864m();
        if (strM14864m != null) {
            return strM14864m;
        }
        String string = this.f17590b;
        if (string == null) {
            string = this.f17589a.toString();
        }
        if (!this.f17591c) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // p146j8.AbstractC9029d
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HandlerContext mo15693o() {
        return this.f17592d;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i10, AbstractC9126n abstractC9126n) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
