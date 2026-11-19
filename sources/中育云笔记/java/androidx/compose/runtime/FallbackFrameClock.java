package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", m26211f = "MonotonicFrameClock.android.kt", m26212l = {40}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2 */
    public static final class C25492 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25492(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C25492> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onFrame = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C25492(this.$onFrame, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.label = 1;
                if (DelayKt.m20376b(16L, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return this.$onFrame.invoke(AbstractC11826a.m26209d(System.nanoTime()));
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C25492) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    private FallbackFrameClock() {
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
    public <R> Object withFrameNanos(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24800c(), new C25492(interfaceC9540l, null), interfaceC11588c);
    }
}
