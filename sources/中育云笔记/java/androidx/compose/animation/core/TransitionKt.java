package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C9974p;
import kotlin.jvm.internal.C9978t;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final InterfaceC9540l SeekableTransitionStateTotalDurationChanged = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SeekableTransitionState<?>) obj);
            return C10786q.f26013a;
        }

        public final void invoke(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };
    private static final InterfaceC10773d SeekableStateObserver$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        @Override // p181hd.InterfaceC9529a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC9529a) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(InterfaceC9529a interfaceC9529a) {
                    interfaceC9529a.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t10, final T t11, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(867041821);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.changed(t10) : composerStartRestartGroup.changedInstance(t10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? composerStartRestartGroup.changed(t11) : composerStartRestartGroup.changedInstance(t11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? composerStartRestartGroup.changed(finiteAnimationSpec) : composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i11, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t10, t11, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core_release(t11, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.animation.core.TransitionKt.UpdateInitialAndTargetValues.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    TransitionKt.UpdateInitialAndTargetValues(transition, transitionAnimationState, t10, t11, finiteAnimationSpec, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<C3186Dp> animateDp(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<C3186Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-575880366);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-575880366, i12, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                    }
                    SpringSpec<C3186Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C3186Dp.m33499boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C3186Dp.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C3186Dp.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Float> animateFloat(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-522164544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522164544, i12, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                    }
                    SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C9974p.f23424a), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Integer> animateInt(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-785273069);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785273069, i12, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2074)");
                    }
                    SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(C9978t.f23425a), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-1953479610);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953479610, i12, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
                    }
                    long j10 = 1;
                    SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m33620boximpl(IntOffset.m33623constructorimpl((j10 & 4294967295L) | (j10 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntOffset.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(967893300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967893300, i12, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2105)");
                    }
                    long j10 = 1;
                    SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m33664boximpl(IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntSize.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Offset> animateOffset(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(1623385561);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1623385561, i12, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1980)");
                    }
                    SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m30626boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Offset.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Rect> animateRect(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(691336298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691336298, i12, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2135)");
                    }
                    SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Rect.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Size> animateSize(Transition<S> transition, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-1607152761);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607152761, i12, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2010)");
                    }
                    SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m30694boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        int i15 = (i14 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i15)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Size.Companion), str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, InterfaceC9545q interfaceC9545q, String str, InterfaceC9545q interfaceC9545q2, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i12, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1827)");
                    }
                    SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i12 = (i10 >> 9) & 112;
        return createTransitionAnimation(transition, interfaceC9545q2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i12)), interfaceC9545q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i12)), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, Integer.valueOf((i10 >> 3) & 112)), twoWayConverter, str, composer, (i10 & 14) | (57344 & (i10 << 9)) | ((i10 << 6) & 458752));
    }

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, InterfaceC9545q interfaceC9545q, Composer composer, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i12 = i10 & 14;
        if (((i12 ^ 6) <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i13 = (i10 >> 3) & 112;
        return createChildTransitionInternal(transition, interfaceC9545q.invoke(objRememberedValue, composer, Integer.valueOf(i13)), interfaceC9545q.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), str2, composer, i12 | ((i10 << 6) & 7168));
    }

    @Composable
    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t10, T t11, String str, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t10), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition2 = (Transition) objRememberedValue;
        if ((i11 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zChanged = composer.changed(transition2) | z10;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition2, (InterfaceC9540l) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t10, t11, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t11);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        if ((i12 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zChangedInstance = composer.changedInstance(deferredAnimation) | z10;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<S> transition2 = transition;
                    final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(deferredAnimation2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(deferredAnimation, (InterfaceC9540l) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    @Composable
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t10, T t11, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i10) {
        T t12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.changed(transition)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            t12 = t11;
            Object transitionAnimationState = transition.new TransitionAnimationState(t10, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t12), twoWayConverter, str);
            composer.updateRememberedValue(transitionAnimationState);
            objRememberedValue = transitionAnimationState;
        } else {
            t12 = t11;
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objRememberedValue;
        int i13 = (i10 >> 3) & 8;
        int i14 = i10 << 3;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t10, t12, finiteAnimationSpec, composer, (i13 << 9) | (i13 << 6) | i11 | (i14 & 896) | (i14 & 7168) | (57344 & i14));
        if ((i12 <= 4 || !composer.changed(transition)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zChanged = composer.changed(transitionAnimationState2) | z10;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState2);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (InterfaceC9540l) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    @Composable
    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.changed(transitionState)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(1030829284);
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            if ((i12 <= 4 || !composer.changed(transitionState)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (InterfaceC9544p) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1031290843);
            transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(transition, (InterfaceC9540l) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(T t10, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t10, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t10, composer, (i10 & 8) | 48 | (i10 & 14));
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition, (InterfaceC9540l) objRememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    @InterfaceC10770a
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i10 & Opcodes.IAND, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionRememberTransition;
    }
}
