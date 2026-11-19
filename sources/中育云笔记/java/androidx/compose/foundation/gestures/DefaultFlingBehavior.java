package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p014ui.MotionDurationScale;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m26211f = "Scrollable.kt", m26212l = {953}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    public static final class C12832 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12832(float f10, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, InterfaceC11588c<? super C12832> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$initialVelocity = f10;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C12832(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            float f10;
            AnimationState animationState;
            Ref$FloatRef ref$FloatRef;
            DecayAnimationSpec decayAnimationSpec;
            InterfaceC9540l interfaceC9540l;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.f23399c = this.$initialVelocity;
                    final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    try {
                        decayAnimationSpec = this.this$0.flingDecay;
                        final ScrollScope scrollScope = this.$this_performFling;
                        final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                        interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef3.f23399c;
                                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                                ref$FloatRef3.f23399c = animationScope.getValue().floatValue();
                                ref$FloatRef2.f23399c = animationScope.getVelocity().floatValue();
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
                            ref$FloatRef.f23399c = ((Number) animationState.getVelocity()).floatValue();
                            f10 = ref$FloatRef.f23399c;
                            return AbstractC11826a.m26207b(f10);
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateAnimationState$default;
                    }
                    if (SuspendAnimationKt.animateDecay$default(animationState, decayAnimationSpec, false, interfaceC9540l, this, 2, null) == objM25952f) {
                        return objM25952f;
                    }
                    ref$FloatRef = ref$FloatRef2;
                    f10 = ref$FloatRef.f23399c;
                } else {
                    f10 = this.$initialVelocity;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.L$1;
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                try {
                    AbstractC9924b.m20071b(obj);
                } catch (CancellationException unused3) {
                    ref$FloatRef.f23399c = ((Number) animationState.getVelocity()).floatValue();
                    f10 = ref$FloatRef.f23399c;
                    return AbstractC11826a.m26207b(f10);
                }
                f10 = ref$FloatRef.f23399c;
            }
            return AbstractC11826a.m26207b(f10);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super Float> interfaceC11588c) {
            return ((C12832) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f10, InterfaceC11588c<? super Float> interfaceC11588c) {
        this.lastAnimationCycleCount = 0;
        return AbstractC11109f.m24709g(this.motionDurationScale, new C12832(f10, this, scrollScope, null), interfaceC11588c);
    }

    public final void setLastAnimationCycleCount(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i10, AbstractC9972n abstractC9972n) {
        this(decayAnimationSpec, (i10 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
