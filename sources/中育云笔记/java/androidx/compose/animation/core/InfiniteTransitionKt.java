package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9974p;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    @Composable
    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f10, float f11, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i12 = i10 << 3;
        State<Float> stateAnimateValue = animateValue(infiniteTransition, Float.valueOf(f10), Float.valueOf(f11), VectorConvertersKt.getVectorConverter(C9974p.f23424a), infiniteRepeatableSpec, str2, composer, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }

    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValue(InfiniteTransition infiniteTransition, T t10, T t11, TwoWayConverter<T, V> twoWayConverter, InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i10, int i11) {
        final InfiniteTransition infiniteTransition2;
        final Object obj;
        final Object obj2;
        final InfiniteRepeatableSpec<T> infiniteRepeatableSpec2;
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            infiniteTransition2 = infiniteTransition;
            obj = t10;
            obj2 = t11;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(obj, obj2, twoWayConverter, infiniteRepeatableSpec2, str2);
            composer.updateRememberedValue(transitionAnimationState);
            objRememberedValue = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj = t10;
            obj2 = t11;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objRememberedValue;
        boolean z10 = true;
        boolean z11 = ((((i10 & 112) ^ 48) > 32 && composer.changedInstance(obj)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changedInstance(obj2)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec2)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z12 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26862invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26862invoke() {
                    if (AbstractC9979u.m20289b(obj, transitionAnimationState2.getInitialValue$animation_core_release()) && AbstractC9979u.m20289b(obj2, transitionAnimationState2.getTargetValue$animation_core_release())) {
                        return;
                    }
                    transitionAnimationState2.updateValues$animation_core_release(obj, obj2, infiniteRepeatableSpec2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.SideEffect((InterfaceC9529a) objRememberedValue2, composer, 0);
        boolean zChangedInstance = composer.changedInstance(infiniteTransition2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    infiniteTransition2.addAnimation$animation_core_release(transitionAnimationState2);
                    final InfiniteTransition infiniteTransition3 = infiniteTransition2;
                    final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            infiniteTransition3.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (InterfaceC9540l) objRememberedValue3, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    @Composable
    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objRememberedValue;
        infiniteTransition.run$animation_core_release(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition;
    }

    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f10, float f11, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        State<Float> stateAnimateFloat = animateFloat(infiniteTransition, f10, f11, infiniteRepeatableSpec, "FloatAnimation", composer, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateFloat;
    }

    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        InfiniteTransition infiniteTransitionRememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransitionRememberInfiniteTransition;
    }

    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i11 = (i10 >> 3) & 8;
        State stateAnimateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i10 & 14) | ProfileVerifier.CompilationStatus.f1974xf2722a21 | (i11 << 3) | (i10 & 112) | (i11 << 6) | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }
}
