package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.sync.C6001a;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p076h7.InterfaceC5638a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", m5303f = "Transition.kt", m5304i = {0}, m5305l = {2147}, m5306m = "invokeSuspend", m5307n = {"$this$withLock_u24default$iv"}, m5308s = {"L$0"})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2141:1\n120#2,10:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n810#1:2142,10\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState<T> transitionState, InterfaceC5631c<? super TransitionKt$rememberTransition$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$transitionState = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransitionState transitionState;
        InterfaceC5638a interfaceC5638a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core_release();
            InterfaceC5638a compositionContinuationMutex = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex();
            TransitionState transitionState2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex;
            this.L$1 = transitionState2;
            this.label = 1;
            C6001a c6001a = (C6001a) compositionContinuationMutex;
            if (c6001a.m5615e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            transitionState = transitionState2;
            interfaceC5638a = c6001a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = (TransitionState) this.L$1;
            interfaceC5638a = (InterfaceC5638a) this.L$0;
            AbstractC5774b.m5119b(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).setComposedTargetState$animation_core_release(transitionState.getTargetState());
            InterfaceC5895f compositionContinuation = ((SeekableTransitionState) transitionState).getCompositionContinuation();
            if (compositionContinuation != null) {
                compositionContinuation.resumeWith(Result.m13956constructorimpl(transitionState.getTargetState()));
            }
            ((SeekableTransitionState) transitionState).setCompositionContinuation$animation_core_release(null);
            ((C6001a) interfaceC5638a).m5617g(null);
            return C5443s.f8405a;
        } catch (Throwable th) {
            ((C6001a) interfaceC5638a).m5617g(null);
            throw th;
        }
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TransitionKt$rememberTransition$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
