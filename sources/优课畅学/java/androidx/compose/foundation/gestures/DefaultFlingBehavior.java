package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p013ui.MotionDurationScale;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m17801f = "Scrollable.kt", m17802l = {953}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    public static final class C12532 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12532(float f10, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, InterfaceC9324c<? super C12532> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$initialVelocity = f10;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C12532(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super Float> interfaceC9324c) {
            return ((C12532) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            float f10;
            AnimationState animationState;
            Ref$FloatRef ref$FloatRef;
            DecayAnimationSpec decayAnimationSpec;
            InterfaceC10570l interfaceC10570l;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.f17470a = this.$initialVelocity;
                    final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    try {
                        decayAnimationSpec = this.this$0.flingDecay;
                        final ScrollScope scrollScope = this.$this_performFling;
                        final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                        interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p300x7.InterfaceC10570l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return C8736p.f16368a;
                            }

                            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef3.f17470a;
                                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                                ref$FloatRef3.f17470a = animationScope.getValue().floatValue();
                                ref$FloatRef2.f17470a = animationScope.getVelocity().floatValue();
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
                            ref$FloatRef.f17470a = ((Number) animationState.getVelocity()).floatValue();
                            f10 = ref$FloatRef.f17470a;
                            return AbstractC9536a.m17797b(f10);
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateAnimationState$default;
                    }
                    if (SuspendAnimationKt.animateDecay$default(animationState, decayAnimationSpec, false, interfaceC10570l, this, 2, null) == objM17291f) {
                        return objM17291f;
                    }
                    ref$FloatRef = ref$FloatRef2;
                    f10 = ref$FloatRef.f17470a;
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
                    AbstractC9079b.m15926b(obj);
                } catch (CancellationException unused3) {
                    ref$FloatRef.f17470a = ((Number) animationState.getVelocity()).floatValue();
                    f10 = ref$FloatRef.f17470a;
                    return AbstractC9536a.m17797b(f10);
                }
                f10 = ref$FloatRef.f17470a;
            }
            return AbstractC9536a.m17797b(f10);
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
    public Object performFling(ScrollScope scrollScope, float f10, InterfaceC9324c<? super Float> interfaceC9324c) {
        this.lastAnimationCycleCount = 0;
        return AbstractC8833f.m14848g(this.motionDurationScale, new C12532(f10, this, scrollScope, null), interfaceC9324c);
    }

    public final void setLastAnimationCycleCount(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i10, AbstractC9126n abstractC9126n) {
        this(decayAnimationSpec, (i10 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
