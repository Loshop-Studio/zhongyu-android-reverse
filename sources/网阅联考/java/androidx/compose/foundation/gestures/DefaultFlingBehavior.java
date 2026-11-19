package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p006ui.MotionDurationScale;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "lastAnimationCycleCount", "", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "performFling", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    private final DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m5192f = "Scrollable.kt", m5193i = {0}, m5194l = {545}, m5195m = "invokeSuspend", m5196n = {"velocityLeft"}, m5197s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    public static final class C04352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04352(float f4, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation<? super C04352> continuation) {
            super(2, continuation);
            this.$initialVelocity = f4;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04352(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f4;
            Ref.FloatRef floatRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Math.abs(this.$initialVelocity) <= 1.0f) {
                    f4 = this.$initialVelocity;
                    return Boxing.boxFloat(f4);
                }
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.$initialVelocity;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                DecayAnimationSpec decayAnimationSpec = this.this$0.flingDecay;
                final ScrollScope scrollScope = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animateDecay) {
                        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                        float fFloatValue = animateDecay.getValue().floatValue() - floatRef3.element;
                        float fScrollBy = scrollScope.scrollBy(fFloatValue);
                        floatRef3.element = animateDecay.getValue().floatValue();
                        floatRef2.element = animateDecay.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                            animateDecay.cancelAnimation();
                        }
                        DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                        defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                    }
                };
                this.L$0 = floatRef2;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            f4 = floatRef.element;
            return Boxing.boxFloat(f4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
            return ((C04352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> flingDecay, MotionDurationScale motionDurationScale) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        Intrinsics.checkNotNullParameter(motionDurationScale, "motionDurationScale");
        this.flingDecay = flingDecay;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f4, Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new C04352(f4, this, scrollScope, null), continuation);
    }

    public final void setLastAnimationCycleCount(int i4) {
        this.lastAnimationCycleCount = i4;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i4 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
