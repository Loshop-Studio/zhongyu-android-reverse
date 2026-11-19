package td;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import sd.AbstractC11147o1;
import sd.C11157r0;
import sd.C11170v1;
import sd.InterfaceC11125j;
import sd.InterfaceC11146o0;
import sd.InterfaceC11163t0;

/* renamed from: td.f */
/* loaded from: classes6.dex */
public final class C11275f extends AbstractC11276g implements InterfaceC11146o0 {

    /* renamed from: c */
    public final Handler f27083c;

    /* renamed from: d */
    public final String f27084d;

    /* renamed from: e */
    public final boolean f27085e;

    /* renamed from: f */
    public final C11275f f27086f;

    public C11275f(Handler handler, String str, boolean z10) {
        super(null);
        this.f27083c = handler;
        this.f27084d = str;
        this.f27085e = z10;
        this.f27086f = z10 ? this : new C11275f(handler, str, true);
    }

    /* renamed from: B */
    public static final void m25203B(InterfaceC11125j interfaceC11125j, C11275f c11275f) {
        interfaceC11125j.mo20501C(c11275f, C10786q.f26013a);
    }

    /* renamed from: C */
    public static final C10786q m25204C(C11275f c11275f, Runnable runnable, Throwable th) {
        c11275f.f27083c.removeCallbacks(runnable);
        return C10786q.f26013a;
    }

    /* renamed from: x */
    public static final void m25208x(C11275f c11275f, Runnable runnable) {
        c11275f.f27083c.removeCallbacks(runnable);
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, final Runnable runnable, InterfaceC9945d interfaceC9945d) {
        if (this.f27083c.postDelayed(runnable, AbstractC10410o.m21757j(j10, 4611686018427387903L))) {
            return new InterfaceC11163t0() { // from class: td.c
                @Override // sd.InterfaceC11163t0
                public final void dispose() {
                    C11275f.m25208x(this.f27077c, runnable);
                }
            };
        }
        m25210u(interfaceC9945d, runnable);
        return C11170v1.f26829c;
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: d */
    public void mo24711d(long j10, final InterfaceC11125j interfaceC11125j) {
        final Runnable runnable = new Runnable() { // from class: td.d
            @Override // java.lang.Runnable
            public final void run() {
                C11275f.m25203B(interfaceC11125j, this);
            }
        };
        if (this.f27083c.postDelayed(runnable, AbstractC10410o.m21757j(j10, 4611686018427387903L))) {
            interfaceC11125j.mo20536u(new InterfaceC9540l() { // from class: td.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return C11275f.m25204C(this.f27081c, runnable, (Throwable) obj);
                }
            });
        } else {
            m25210u(interfaceC11125j.getContext(), runnable);
        }
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        if (this.f27083c.post(runnable)) {
            return;
        }
        m25210u(interfaceC9945d, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11275f)) {
            return false;
        }
        C11275f c11275f = (C11275f) obj;
        return c11275f.f27083c == this.f27083c && c11275f.f27085e == this.f27085e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27083c) ^ (this.f27085e ? 1231 : 1237);
    }

    @Override // sd.AbstractC11106e0
    public boolean isDispatchNeeded(InterfaceC9945d interfaceC9945d) {
        return (this.f27085e && AbstractC9979u.m20289b(Looper.myLooper(), this.f27083c.getLooper())) ? false : true;
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        String strM24805j = m24805j();
        if (strM24805j != null) {
            return strM24805j;
        }
        String string = this.f27084d;
        if (string == null) {
            string = this.f27083c.toString();
        }
        if (!this.f27085e) {
            return string;
        }
        return string + ".immediate";
    }

    /* renamed from: u */
    public final void m25210u(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        AbstractC11147o1.m24769c(interfaceC9945d, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C11157r0.m24799b().dispatch(interfaceC9945d, runnable);
    }

    @Override // td.AbstractC11276g
    /* renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11275f mo25209k() {
        return this.f27086f;
    }

    public /* synthetic */ C11275f(Handler handler, String str, int i10, AbstractC9972n abstractC9972n) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C11275f(Handler handler, String str) {
        this(handler, str, false);
    }
}
