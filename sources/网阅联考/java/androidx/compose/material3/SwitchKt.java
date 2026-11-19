package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a|\u0010\u001f\u001a\u00020\u000f*\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0007\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m5175d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "ThumbPathLength", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float fM8723getSelectedHandleWidthD9Ej5fM = switchTokens.m8723getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM8723getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m8730getUnselectedHandleWidthD9Ej5fM();
        float fM8728getTrackWidthD9Ej5fM = switchTokens.m8728getTrackWidthD9Ej5fM();
        SwitchWidth = fM8728getTrackWidthD9Ej5fM;
        float fM8726getTrackHeightD9Ej5fM = switchTokens.m8726getTrackHeightD9Ej5fM();
        SwitchHeight = fM8726getTrackHeightD9Ej5fM;
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(fM8726getTrackHeightD9Ej5fM - fM8723getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = fM11525constructorimpl;
        ThumbPathLength = C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(fM8728getTrackWidthD9Ej5fM - fM8723getSelectedHandleWidthD9Ej5fM) - fM11525constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(final boolean r52, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r53, androidx.compose.p006ui.Modifier r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, androidx.compose.material3.SwitchColors r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.runtime.Composer r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SwitchImpl-0DmnUew, reason: not valid java name */
    public static final void m8156SwitchImpl0DmnUew(final BoxScope boxScope, final boolean z3, final boolean z4, final SwitchColors switchColors, final State<Float> state, final Function2<? super Composer, ? super Integer, Unit> function2, final InteractionSource interactionSource, final Shape shape, final float f4, final float f5, final float f6, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        final float fFloatValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((i4 & 458752) == 0) {
            i6 |= composerStartRestartGroup.changed(function2) ? 131072 : 65536;
        }
        if ((i4 & 3670016) == 0) {
            i6 |= composerStartRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i4 & 29360128) == 0) {
            i6 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i4 & 234881024) == 0) {
            i6 |= composerStartRestartGroup.changed(f4) ? 67108864 : 33554432;
        }
        if ((i4 & 1879048192) == 0) {
            i6 |= composerStartRestartGroup.changed(f5) ? 536870912 : 268435456;
        }
        if ((i5 & 14) == 0) {
            i7 = i5 | (composerStartRestartGroup.changed(f6) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i6 & 1533916891) == 306783378 && (i7 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i6, i7, "androidx.compose.material3.SwitchImpl (Switch.kt:171)");
            }
            int i8 = ((i6 >> 6) & 14) | (i6 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i6 >> 3) & 896);
            State<Color> stateTrackColor$material3_release = switchColors.trackColor$material3_release(z4, z3, composerStartRestartGroup, i8);
            State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composerStartRestartGroup, (i6 >> 18) & 14);
            int i9 = i6;
            float fM8721getPressedHandleWidthD9Ej5fM = m8159SwitchImpl_0DmnUew$lambda7(stateCollectIsPressedAsState) ? SwitchTokens.INSTANCE.m8721getPressedHandleWidthD9Ej5fM() : C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(ThumbDiameter - f4) * (C1700Dp.m11525constructorimpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7202toDpu2uoSUM(state.getValue().floatValue()) - f5) / C1700Dp.m11525constructorimpl(f6 - f5))) + f4);
            composerStartRestartGroup.startReplaceableGroup(-993794194);
            if (m8159SwitchImpl_0DmnUew$lambda7(stateCollectIsPressedAsState)) {
                fFloatValue = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7206toPx0680j_4(z3 ? C1700Dp.m11525constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m8727getTrackOutlineWidthD9Ej5fM()) : SwitchTokens.INSTANCE.m8727getTrackOutlineWidthD9Ej5fM());
            } else {
                fFloatValue = state.getValue().floatValue();
            }
            composerStartRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape shape2 = ShapesKt.toShape(switchTokens.getTrackShape(), composerStartRestartGroup, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM7067backgroundbw27NRU = BackgroundKt.m7067backgroundbw27NRU(BorderKt.m7078borderxT4_qwU(SizeKt.m7345height3ABfNKs(SizeKt.m7364width3ABfNKs(boxScope.align(companion, companion2.getCenter()), SwitchWidth), SwitchHeight), switchTokens.m8727getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z4, z3, composerStartRestartGroup, i8).getValue().m9188unboximpl(), shape2), m8158SwitchImpl_0DmnUew$lambda6(stateTrackColor$material3_release), shape2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7067backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(968687813);
            long jM8157SwitchImpl_0DmnUew$lambda13$lambda10 = m8157SwitchImpl_0DmnUew$lambda13$lambda10(switchColors.thumbColor$material3_release(z4, z3, composerStartRestartGroup, i8));
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterStart());
            Float fValueOf = Float.valueOf(fFloatValue);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(fValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                        return IntOffset.m11634boximpl(m8161invokeBjo55l4(density2));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m8161invokeBjo55l4(Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(fFloatValue), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7067backgroundbw27NRU2 = BackgroundKt.m7067backgroundbw27NRU(SizeKt.m7351requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), interactionSource, RippleKt.m7794rememberRipple9IZ8Weo(false, C1700Dp.m11525constructorimpl(switchTokens.m8725getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), fM8721getPressedHandleWidthD9Ej5fM), jM8157SwitchImpl_0DmnUew$lambda13$lambda10, shape);
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM7067backgroundbw27NRU2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl2 = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl2, density2, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            composerStartRestartGroup.startReplaceableGroup(881862015);
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z4, z3, composerStartRestartGroup, i8).getValue())}, function2, composerStartRestartGroup, ((i9 >> 12) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                SwitchKt.m8156SwitchImpl0DmnUew(boxScope, z3, z4, switchColors, state, function2, interactionSource, shape, f4, f5, f6, composer2, i4 | 1, i5);
            }
        });
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-13$lambda-10, reason: not valid java name */
    private static final long m8157SwitchImpl_0DmnUew$lambda13$lambda10(State<Color> state) {
        return state.getValue().m9188unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-6, reason: not valid java name */
    private static final long m8158SwitchImpl_0DmnUew$lambda6(State<Color> state) {
        return state.getValue().m9188unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-7, reason: not valid java name */
    private static final boolean m8159SwitchImpl_0DmnUew$lambda7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
