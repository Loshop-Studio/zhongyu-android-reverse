package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.LayoutKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.Ref;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata(m13557d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a^\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006 "}, m13558d2 = {"LateMotionLayout", "", "start", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/ConstraintSet;", "end", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "contentTracker", "Landroidx/compose/runtime/State;", "compositionSource", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "optimizationLevel", "", "finishedAnimationListener", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lateMotionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startProvider", "endProvider", Key.MOTIONPROGRESS, "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "constraintlayout-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLateMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,149:1\n77#2:150\n1225#3,6:151\n1225#3,6:157\n1225#3,6:163\n1225#3,6:169\n1225#3,6:175\n1225#3,6:181\n1225#3,6:187\n1225#3,6:193\n*S KotlinDebug\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n*L\n59#1:150\n60#1:151,6\n62#1:157,6\n63#1:163,6\n64#1:169,6\n70#1:175,6\n71#1:181,6\n81#1:187,6\n86#1:193,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LateMotionLayoutKt {
    @Composable
    @PublishedApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LateMotionLayout(final MutableState<ConstraintSet> mutableState, final MutableState<ConstraintSet> mutableState2, final AnimationSpec<Float> animationSpec, Channel<ConstraintSet> channel, final androidx.compose.runtime.State<Unit> state, final Ref<CompositionSource> ref, final int i10, final Function0<Unit> function0, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i11) {
        int i12;
        androidx.compose.runtime.State<Unit> state2;
        int i13;
        Composer composer2;
        final Channel<ConstraintSet> channel2;
        Composer composerStartRestartGroup = composer.startRestartGroup(688627412);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(mutableState2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(channel) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            state2 = state;
            i12 |= composerStartRestartGroup.changed(state2) ? 16384 : 8192;
        } else {
            state2 = state;
        }
        if ((196608 & i11) == 0) {
            i12 |= (i11 & 262144) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 = i10;
            i12 |= composerStartRestartGroup.changed(i13) ? 1048576 : 524288;
        } else {
            i13 = i10;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i12 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            channel2 = channel;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688627412, i12, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:57)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MotionMeasurer(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = animatable.asState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            androidx.compose.runtime.State state3 = (androidx.compose.runtime.State) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function02 = (Function0) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState2.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int i14 = i12;
            MeasurePolicy measurePolicyLateMotionLayoutMeasurePolicy = lateMotionLayoutMeasurePolicy(function02, (Function0) objRememberedValue6, state2, ref, state3, motionMeasurer, i13);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(motionMeasurer);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, motionMeasurer);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            boolean z9 = true;
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue7, 1, null), function2, measurePolicyLateMotionLayoutMeasurePolicy, composer2, (i14 >> 24) & 112, 0);
            boolean zChangedInstance2 = composer2.changedInstance(channel) | ((i14 & 14) == 4) | ((i14 & 112) == 32) | ((i14 & 458752) == 131072 || ((i14 & 262144) != 0 && composer2.changedInstance(ref))) | composer2.changedInstance(animatable) | composer2.changedInstance(animationSpec);
            if ((i14 & 29360128) != 8388608) {
                z9 = false;
            }
            boolean z10 = zChangedInstance2 | z9;
            Object objRememberedValue8 = composer2.rememberedValue();
            if (z10 || objRememberedValue8 == companion.getEmpty()) {
                LateMotionLayoutKt$LateMotionLayout$2$1 lateMotionLayoutKt$LateMotionLayout$2$1 = new LateMotionLayoutKt$LateMotionLayout$2$1(channel, mutableIntState, mutableState, mutableState2, ref, animatable, animationSpec, function0, null);
                channel2 = channel;
                composer2.updateRememberedValue(lateMotionLayoutKt$LateMotionLayout$2$1);
                objRememberedValue8 = lateMotionLayoutKt$LateMotionLayout$2$1;
            } else {
                channel2 = channel;
            }
            EffectsKt.LaunchedEffect(channel2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, (i14 >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.LateMotionLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec, channel2, state, ref, i10, function0, modifier, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final MeasurePolicy lateMotionLayoutMeasurePolicy(final Function0<? extends ConstraintSet> function0, final Function0<? extends ConstraintSet> function02, final androidx.compose.runtime.State<Unit> state, final Ref<CompositionSource> ref, final androidx.compose.runtime.State<Float> state2, final MotionMeasurer motionMeasurer, final int i10) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.lateMotionLayoutMeasurePolicy.1
            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j10) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSetInvoke = function0.invoke();
                ConstraintSet constraintSetInvoke2 = function02.invoke();
                TransitionImpl eMPTY$constraintlayout_compose_release = TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
                int i11 = i10;
                float fFloatValue = state2.getValue().floatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long jM24003performInterpolationMeasureLzAeyeM = motionMeasurer2.m24003performInterpolationMeasureLzAeyeM(j10, layoutDirection, constraintSetInvoke, constraintSetInvoke2, eMPTY$constraintlayout_compose_release, list, linkedHashMap, i11, fFloatValue, value, null);
                ref.setValue(CompositionSource.Unknown);
                int iM23732getWidthimpl = IntSize.m23732getWidthimpl(jM24003performInterpolationMeasureLzAeyeM);
                int iM23731getHeightimpl = IntSize.m23731getHeightimpl(jM24003performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, iM23732getWidthimpl, iM23731getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt.lateMotionLayoutMeasurePolicy.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        motionMeasurer3.performLayout(placementScope, list, linkedHashMap);
                    }
                }, 4, null);
            }
        };
    }
}
