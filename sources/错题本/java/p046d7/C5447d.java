package p046d7;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.navigation.C2856d;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.C5966h1;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.InterfaceC5870c0;
import kotlinx.coroutines.InterfaceC5962g0;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.RunnableC5994q1;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5479k;
import p054e7.C5480l;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p075h6.InterfaceC5636h;

/* renamed from: d7.d */
/* loaded from: classes4.dex */
public final class C5447d extends AbstractC5995r implements InterfaceC5870c0 {

    /* renamed from: a */
    public final Handler f8408a;

    /* renamed from: b */
    public final String f8409b;

    /* renamed from: c */
    public final boolean f8410c;

    /* renamed from: d */
    public final C5447d f8411d;

    public C5447d(Handler handler, String str, boolean z8) {
        this.f8408a = handler;
        this.f8409b = str;
        this.f8410c = z8;
        this.f8411d = z8 ? this : new C5447d(handler, str, true);
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: a */
    public final InterfaceC5962g0 mo4815a(long j7, final RunnableC5994q1 runnableC5994q1, InterfaceC5636h interfaceC5636h) {
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f8408a.postDelayed(runnableC5994q1, j7)) {
            return new InterfaceC5962g0() { // from class: d7.c
                @Override // kotlinx.coroutines.InterfaceC5962g0
                public final void dispose() {
                    this.f8406a.f8408a.removeCallbacks(runnableC5994q1);
                }
            };
        }
        m4817d(interfaceC5636h, runnableC5994q1);
        return C5966h1.f9456a;
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: b */
    public final void mo4816b(long j7, C5961g c5961g) {
        RunnableC0377a runnableC0377a = new RunnableC0377a(20, c5961g, this);
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f8408a.postDelayed(runnableC0377a, j7)) {
            c5961g.mo4966m(new C2856d(17, this, runnableC0377a));
        } else {
            m4817d(c5961g.f9451e, runnableC0377a);
        }
    }

    /* renamed from: d */
    public final void m4817d(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(cancellationException);
        }
        C5609e c5609e = AbstractC5896f0.f9343a;
        ExecutorC5608d.f8730a.dispatch(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        if (this.f8408a.post(runnable)) {
            return;
        }
        m4817d(interfaceC5636h, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5447d)) {
            return false;
        }
        C5447d c5447d = (C5447d) obj;
        return c5447d.f8408a == this.f8408a && c5447d.f8410c == this.f8410c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8408a) ^ (this.f8410c ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final boolean isDispatchNeeded(InterfaceC5636h interfaceC5636h) {
        return (this.f8410c && AbstractC5830k.m5325b(Looper.myLooper(), this.f8408a.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public AbstractC5995r limitedParallelism(int i, String str) {
        AbstractC5469a.m4825a(i);
        return str != null ? new C5480l(this, str) : this;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        C5447d c5447d;
        String str;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d2 = AbstractC5479k.f8471a;
        if (this == c5447d2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c5447d = c5447d2.f8411d;
            } catch (UnsupportedOperationException unused) {
                c5447d = null;
            }
            str = this == c5447d ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f8409b;
        if (string == null) {
            string = this.f8408a.toString();
        }
        return this.f8410c ? AbstractC0037f.m74C(string, ".immediate") : string;
    }

    public C5447d(Handler handler) {
        this(handler, null, false);
    }
}
