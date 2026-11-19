package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p011ui.MotionDurationScale;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "flingDecay", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "density", "Ld6/s;", "updateDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/ui/MotionDurationScale;", "", "lastAnimationCycleCount", "I", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;

    @NotNull
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;

    @NotNull
    private final MotionDurationScale motionDurationScale;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)F"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m5303f = "Scrollable.kt", m5304i = {0, 0}, m5305l = {953}, m5306m = "invokeSuspend", m5307n = {"velocityLeft", "animationState"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    public static final class C08382 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08382(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, InterfaceC5631c<? super C08382> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$initialVelocity = f;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C08382(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f;
            AnimationState animationState;
            Ref$FloatRef ref$FloatRef;
            DecayAnimationSpec decayAnimationSpec;
            InterfaceC6471c interfaceC6471c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = this.$initialVelocity;
                    final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    try {
                        decayAnimationSpec = this.this$0.flingDecay;
                        final ScrollScope scrollScope = this.$this_performFling;
                        final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                        interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return C5443s.f8405a;
                            }

                            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef3.element;
                                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                                ref$FloatRef3.element = animationScope.getValue().floatValue();
                                ref$FloatRef2.element = animationScope.getVelocity().floatValue();
                                if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                                    animationScope.cancelAnimation();
                                }
                                DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                                defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                            }
                        };
                        this.L$0 = ref$FloatRef2;
                        this.L$1 = animationStateAnimationState$default;
                        this.label = 1;
                        animationState = animationStateAnimationState$default;
                        try {
                        } catch (CancellationException unused) {
                            ref$FloatRef = ref$FloatRef2;
                            ref$FloatRef.element = ((Number) animationState.getVelocity()).floatValue();
                            f = ref$FloatRef.element;
                            return new Float(f);
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateAnimationState$default;
                    }
                    if (SuspendAnimationKt.animateDecay$default(animationState, decayAnimationSpec, false, interfaceC6471c, this, 2, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$FloatRef = ref$FloatRef2;
                    f = ref$FloatRef.element;
                } else {
                    f = this.$initialVelocity;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.L$1;
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                try {
                    AbstractC5774b.m5119b(obj);
                } catch (CancellationException unused3) {
                    ref$FloatRef.element = ((Number) animationState.getVelocity()).floatValue();
                    f = ref$FloatRef.element;
                    return new Float(f);
                }
                f = ref$FloatRef.element;
            }
            return new Float(f);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Float> interfaceC5631c) {
            return ((C08382) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull InterfaceC5631c<? super Float> interfaceC5631c) {
        this.lastAnimationCycleCount = 0;
        return AbstractC6014x.m5626F(this.motionDurationScale, new C08382(f, this, scrollScope, null), interfaceC5631c);
    }

    public final void setLastAnimationCycleCount(int i) {
        this.lastAnimationCycleCount = i;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(@NotNull Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i, AbstractC5824e abstractC5824e) {
        this(decayAnimationSpec, (i & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
