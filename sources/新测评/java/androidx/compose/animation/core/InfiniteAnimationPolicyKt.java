package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012#\b\u0004\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086H¢\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@¢\u0006\u0002\u0010\b¨\u0006\u000b"}, m13558d2 = {"withInfiniteAnimationFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withInfiniteAnimationFrameNanos", "frameTimeNanos", "animation-core_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m13558d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 176)
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 */
    public static final class C10592<R> extends Lambda implements Function1<Long, R> {
        final /* synthetic */ Function1<Long, R> $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10592(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.$onFrame = function1;
        }

        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / AnimationKt.MillisToNanos));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return invoke(l10.longValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(m13557d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m13558d2 = {"<anonymous>", "R"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m13596f = "InfiniteAnimationPolicy.kt", m13597i = {}, m13598l = {32}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
    public static final class C10602<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Long, R> $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10602(Function1<? super Long, ? extends R> function1, Continuation<? super C10602> continuation) {
            super(1, continuation);
            this.$onFrame = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C10602(this.$onFrame, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1<Long, R> function1 = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(function1, this);
            return objWithFrameNanos == coroutine_suspended ? coroutine_suspended : objWithFrameNanos;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super R> continuation) {
            return ((C10602) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <R> Object withInfiniteAnimationFrameMillis(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return withInfiniteAnimationFrameNanos(new C10592(function1), continuation);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        C10592 c10592 = new C10592(function1);
        InlineMarker.mark(0);
        Object objWithInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(c10592, continuation);
        InlineMarker.mark(1);
        return objWithInfiniteAnimationFrameNanos;
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.getContext().get(InfiniteAnimationPolicy.INSTANCE);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(function1, continuation) : infiniteAnimationPolicy.onInfiniteOperation(new C10602(function1, null), continuation);
    }
}
