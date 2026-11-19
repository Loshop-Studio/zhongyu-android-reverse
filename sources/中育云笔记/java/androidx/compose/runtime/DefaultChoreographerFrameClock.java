package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) AbstractC11109f.m24707e(C11157r0.m24800c().mo25209k(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC9544p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9945d);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Object objM20054c;
                InterfaceC11125j interfaceC11125j = c9997c;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
                try {
                    Result.C9921a c9921a = Result.f23263d;
                    objM20054c = Result.m20054c(interfaceC9540l2.invoke(Long.valueOf(j10)));
                } catch (Throwable th) {
                    Result.C9921a c9921a2 = Result.f23263d;
                    objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
                }
                interfaceC11125j.resumeWith(objM20054c);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }
}
