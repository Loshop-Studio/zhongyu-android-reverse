package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0086H¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m5110d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "frameTimeNanos", "onFrame", "withInfiniteAnimationFrameNanos", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "frameTimeMillis", "withInfiniteAnimationFrameMillis", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 */
    public static final class C06852 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06852(InterfaceC6471c interfaceC6471c) {
            super(1);
            this.$onFrame = interfaceC6471c;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j7) {
            return this.$onFrame.invoke(Long.valueOf(j7 / AnimationKt.MillisToNanos));
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m5110d2 = {"<anonymous>", "R"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m5303f = "InfiniteAnimationPolicy.kt", m5304i = {}, m5305l = {32}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
    public static final class C06862 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06862(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C06862> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$onFrame = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
            return new C06862(this.$onFrame, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        public final Object invoke(InterfaceC5631c<? super R> interfaceC5631c) {
            return ((C06862) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return obj;
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6471c interfaceC6471c = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(interfaceC6471c, this);
            return objWithFrameNanos == coroutineSingletons ? coroutineSingletons : objWithFrameNanos;
        }
    }

    @Nullable
    public static final <R> Object withInfiniteAnimationFrameMillis(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return withInfiniteAnimationFrameNanos(new C06852(interfaceC6471c), interfaceC5631c);
    }

    @Nullable
    public static final <R> Object withInfiniteAnimationFrameNanos(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) interfaceC5631c.getContext().get(InfiniteAnimationPolicy.INSTANCE);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(interfaceC6471c, interfaceC5631c) : infiniteAnimationPolicy.onInfiniteOperation(new C06862(interfaceC6471c, null), interfaceC5631c);
    }
}
