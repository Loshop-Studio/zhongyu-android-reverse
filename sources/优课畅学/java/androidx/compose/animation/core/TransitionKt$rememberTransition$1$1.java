package androidx.compose.animation.core;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", m17801f = "Transition.kt", m17802l = {2147}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, InterfaceC9324c<? super TransitionKt$rememberTransition$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$transitionState = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TransitionKt$rememberTransition$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC9942a compositionContinuationMutex$animation_core_release;
        TransitionState transitionState;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core_release();
            compositionContinuationMutex$animation_core_release = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core_release();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex$animation_core_release;
            this.L$1 = transitionState2;
            this.label = 1;
            if (compositionContinuationMutex$animation_core_release.lock(null, this) == objM17291f) {
                return objM17291f;
            }
            transitionState = transitionState2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            compositionContinuationMutex$animation_core_release = (InterfaceC9942a) this.L$0;
            AbstractC9079b.m15926b(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).setComposedTargetState$animation_core_release(transitionState.getTargetState());
            InterfaceC8845j compositionContinuation$animation_core_release = ((SeekableTransitionState) transitionState).getCompositionContinuation$animation_core_release();
            if (compositionContinuation$animation_core_release != null) {
                Result.C9076a c9076a = Result.f17350b;
                compositionContinuation$animation_core_release.resumeWith(Result.m15909b(transitionState.getTargetState()));
            }
            ((SeekableTransitionState) transitionState).setCompositionContinuation$animation_core_release(null);
            C8736p c8736p = C8736p.f16368a;
            compositionContinuationMutex$animation_core_release.unlock(null);
            return C8736p.f16368a;
        } catch (Throwable th) {
            compositionContinuationMutex$animation_core_release.unlock(null);
            throw th;
        }
    }
}
