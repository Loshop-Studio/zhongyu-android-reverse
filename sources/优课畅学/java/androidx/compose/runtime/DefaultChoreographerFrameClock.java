package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) AbstractC8833f.m14846e(C8843i0.m14868c().mo15693o(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC10574p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9100d);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Object objM15909b;
                InterfaceC8845j interfaceC8845j = c9155c;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
                try {
                    Result.C9076a c9076a = Result.f17350b;
                    objM15909b = Result.m15909b(interfaceC10570l2.invoke(Long.valueOf(j10)));
                } catch (Throwable th) {
                    Result.C9076a c9076a2 = Result.f17350b;
                    objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
                }
                interfaceC8845j.resumeWith(objM15909b);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
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
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }
}
