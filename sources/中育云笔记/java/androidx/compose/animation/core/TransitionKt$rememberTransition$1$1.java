package androidx.compose.animation.core;

import be.InterfaceC5189a;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", m26211f = "Transition.kt", m26212l = {2147}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, InterfaceC11588c<? super TransitionKt$rememberTransition$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$transitionState = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5189a compositionContinuationMutex$animation_core_release;
        TransitionState transitionState;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core_release();
            compositionContinuationMutex$animation_core_release = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core_release();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex$animation_core_release;
            this.L$1 = transitionState2;
            this.label = 1;
            if (compositionContinuationMutex$animation_core_release.lock(null, this) == objM25952f) {
                return objM25952f;
            }
            transitionState = transitionState2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            compositionContinuationMutex$animation_core_release = (InterfaceC5189a) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).setComposedTargetState$animation_core_release(transitionState.getTargetState());
            InterfaceC11125j compositionContinuation$animation_core_release = ((SeekableTransitionState) transitionState).getCompositionContinuation$animation_core_release();
            if (compositionContinuation$animation_core_release != null) {
                Result.C9921a c9921a = Result.f23263d;
                compositionContinuation$animation_core_release.resumeWith(Result.m20054c(transitionState.getTargetState()));
            }
            ((SeekableTransitionState) transitionState).setCompositionContinuation$animation_core_release(null);
            C10786q c10786q = C10786q.f26013a;
            compositionContinuationMutex$animation_core_release.unlock(null);
            return C10786q.f26013a;
        } catch (Throwable th) {
            compositionContinuationMutex$animation_core_release.unlock(null);
            throw th;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TransitionKt$rememberTransition$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
