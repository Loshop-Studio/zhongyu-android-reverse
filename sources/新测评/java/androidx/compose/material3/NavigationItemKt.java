package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(m13557d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÍ\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00122\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0090\u0001\u0010.\u001a\u00020\u00102\u0006\u0010*\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a6\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aF\u0010A\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aV\u0010E\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020\bX\u008a\u008e\u0002"}, m13558d2 = {"IconLayoutIdTag", "", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "Landroidx/compose/ui/unit/Dp;", "F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationItemMinHeight", "getNavigationItemMinHeight", "()F", "NavigationItemMinWidth", "getNavigationItemMinWidth", "NavigationItem", "", "selected", "", "onClick", "Lkotlin/Function0;", NavigationItemKt.IconLayoutIdTag, "Landroidx/compose/runtime/Composable;", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "indicatorShape", "Landroidx/compose/ui/graphics/Shape;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "colors", "Landroidx/compose/material3/NavigationItemColors;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", NavigationItemKt.LabelLayoutIdTag, "badge", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "NavigationItem-SHbi2eg", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationItemLayout", "Landroidx/compose/foundation/interaction/InteractionSource;", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "animationProgress", "", "NavigationItemLayout-KmRX-Dg", "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;FFFFFLandroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndStartIcon", "labelPlaceable", "placeLabelAndStartIcon-nru01g4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndTopIcon", "placeLabelAndTopIcon-qoqLrGI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "itemWidth"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:738\n1223#2,6:777\n1223#2,6:783\n1223#2,6:824\n71#3,3:744\n74#3:775\n78#3:792\n71#3:830\n68#3,6:831\n74#3:865\n78#3:869\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:747\n85#4,4:762\n89#4,2:772\n93#4:791\n78#4:793\n76#4,8:794\n85#4,4:811\n89#4,2:821\n78#4,6:837\n85#4,4:852\n89#4,2:862\n93#4:868\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:753\n377#5:774\n378#5,2:789\n368#5,9:802\n377#5:823\n368#5,9:843\n377#5:864\n378#5,2:866\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:766\n4032#6,6:815\n4032#6,6:856\n4032#6,6:896\n77#7:776\n50#8:913\n50#8:914\n75#9:915\n108#9,2:916\n148#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n282#1:732,6\n295#1:738,6\n319#1:777,6\n331#1:783,6\n370#1:824,6\n284#1:744,3\n284#1:775\n284#1:792\n376#1:830\n376#1:831,6\n376#1:865\n376#1:869\n378#1:870\n378#1:871,6\n378#1:905\n378#1:909\n284#1:747,6\n284#1:762,4\n284#1:772,2\n284#1:791\n357#1:793\n357#1:794,8\n357#1:811,4\n357#1:821,2\n376#1:837,6\n376#1:852,4\n376#1:862,2\n376#1:868\n378#1:877,6\n378#1:892,4\n378#1:902,2\n378#1:908\n357#1:912\n284#1:753,9\n284#1:774\n284#1:789,2\n357#1:802,9\n357#1:823\n376#1:843,9\n376#1:864\n376#1:866,2\n378#1:883,9\n378#1:904\n378#1:906,2\n357#1:910,2\n284#1:766,6\n357#1:815,6\n376#1:856,6\n378#1:896,6\n311#1:776\n657#1:913\n666#1:914\n282#1:915\n282#1:916,2\n730#1:918\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
    private static final float NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
    private static final float IndicatorVerticalOffset = C3127Dp.m23561constructorimpl(12);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItem-SHbi2eg, reason: not valid java name */
    public static final void m19048NavigationItemSHbi2eg(final boolean z9, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Shape shape, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z10, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final int i10, MutableInteractionSource mutableInteractionSource, Composer composer, final int i11, final int i12) {
        int i13;
        Shape shape2;
        int i14;
        boolean z11;
        MutableInteractionSource mutableInteractionSource2;
        int i15;
        InteractionSource interactionSource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(547979956);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            shape2 = shape;
            i13 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((i11 & ProfileVerifier.CompilationStatus.f2100xf2722a21) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.changed(f11) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(f12) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(f13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(f14) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(f15) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(navigationItemColors) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i12 & ProfileVerifier.CompilationStatus.f2100xf2722a21) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        int i16 = i14;
        if ((i13 & 306783379) == 306783378 && (4793491 & i16) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547979956, i13, i16, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            int i17 = i13;
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i18) {
                    if ((i18 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-44329638, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                    }
                    long jM19037iconColorWaAFU9c = navigationItemColors.m19037iconColorWaAFU9c(z9, z10);
                    Modifier modifierClearAndSetSemantics = function22 != null ? SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }) : Modifier.INSTANCE;
                    Function2<Composer, Integer, Unit> function24 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierClearAndSetSemantics);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer3);
                    Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m20966boximpl(jM19037iconColorWaAFU9c)), function24, composer3, ProvidedValue.$stable);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1735402128);
            if (function23 != null) {
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836184859, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final Function2<Composer, Integer, Unit> function24 = function23;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(870803363, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(BoxScope boxScope, Composer composer4, int i19) {
                                if ((i19 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(870803363, i19, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function24.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final Function2<Composer, Integer, Unit> function25 = composableLambdaRememberComposableLambda;
                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, null, ComposableLambdaKt.rememberComposableLambda(-1365557663, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(BoxScope boxScope, Composer composer4, int i19) {
                                if ((i19 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1365557663, i19, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function25.invoke(composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1735395524);
            ComposableLambda composableLambdaRememberComposableLambda2 = null;
            if (function22 == null) {
                z11 = true;
            } else {
                z11 = true;
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-254668050, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-254668050, i18, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.m19639ProvideContentColorTextStyle3JVO9M(navigationItemColors.m19038textColorWaAFU9c(z9, z10), textStyle, function22, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda2;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            mutableInteractionSource2 = mutableInteractionSource;
            Modifier modifierM17712defaultMinSizeVpY3zN4 = SizeKt.m17712defaultMinSizeVpY3zN4(SelectableKt.m17942selectableO2vRcR0(modifier, z9, mutableInteractionSource2, null, z10, Role.m22784boximpl(Role.INSTANCE.m22798getTabo7Vup1c()), function0), NavigationItemMinWidth, NavigationItemMinHeight);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m19057invokeozmzZPI(intSize.m23736unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m19057invokeozmzZPI(long j10) {
                        mutableIntState.setIntValue(IntSize.m23732getWidthimpl(j10));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM17712defaultMinSizeVpY3zN4, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), z11);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z9 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(-1634400795);
            if (NavigationItemIconPosition.m19042equalsimpl0(i10, NavigationItemIconPosition.INSTANCE.m19047getTopxw1Ddg())) {
                i15 = 29360128;
                long jOffset = OffsetKt.Offset((mutableIntState.getIntValue() - r8.mo17326roundToPx0680j_4(f10)) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo17332toPx0680j_4(IndicatorVerticalOffset));
                Unit unit = Unit.INSTANCE;
                boolean zChanged = ((i16 & 29360128) == 8388608) | composerStartRestartGroup.changed(jOffset);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MappedInteractionSource(mutableInteractionSource2, jOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                interactionSource = (MappedInteractionSource) objRememberedValue3;
            } else {
                i15 = 29360128;
                interactionSource = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            InteractionSource interactionSource2 = interactionSource != null ? interactionSource : mutableInteractionSource2;
            long selectedIndicatorColor = navigationItemColors.getSelectedIndicatorColor();
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return stateAnimateFloatAsState.getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i18 = i17 << 3;
            m19049NavigationItemLayoutKmRXDg(interactionSource2, selectedIndicatorColor, shape2, composableLambda, i10, composableLambda2, (Function0) objRememberedValue4, f11, f12, f13, f14, f15, composerStartRestartGroup, ((i17 >> 6) & 896) | ((i16 >> 6) & 57344) | (i18 & i15) | (234881024 & i18) | (i18 & 1879048192), ((i17 >> 27) & 14) | ((i16 << 3) & 112));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
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

                public final void invoke(Composer composer3, int i19) {
                    NavigationItemKt.m19048NavigationItemSHbi2eg(z9, function0, function2, textStyle, shape, f10, f11, f12, f13, f14, f15, navigationItemColors, modifier, z10, function22, function23, i10, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    public static final void m19049NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j10, final Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, final int i10, final Function2<? super Composer, ? super Integer, Unit> function22, Function0<Float> function0, final float f10, final float f11, final float f12, final float f13, final float f14, Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        ?? r02;
        int i15;
        Object topIconOrIconOnlyMeasurePolicy;
        Composer composer2;
        final Function0<Float> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757687417);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changed(f11) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(f12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (composerStartRestartGroup.changed(f13) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(f14) ? 32 : 16;
        }
        int i16 = i14;
        if ((i13 & 306783379) == 306783378 && (i16 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757687417, i13, i16, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (function22 == null || NavigationItemIconPosition.m19042equalsimpl0(i10, NavigationItemIconPosition.INSTANCE.m19047getTopxw1Ddg())) {
                r02 = 0;
                i15 = i13;
                composer2 = composerStartRestartGroup;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(function22 != null, function0, f10, f11, f12, f14, null);
                function02 = function0;
            } else {
                r02 = 0;
                i15 = i13;
                function02 = function0;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(function02, f10, f11, f13, null);
                composer2 = composerStartRestartGroup;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r02);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl, topIconOrIconOnlyMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            composerStartRestartGroup = composer2;
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m19144rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, r02);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IndicatorLayoutIdTag);
            boolean z9 = (i15 & 3670016) == 1048576 ? true : r02;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setAlpha(function02.invoke().floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(BackgroundKt.m17189backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue), j10, shape), composerStartRestartGroup, r02);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r02);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r02);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-776741606);
            if (function22 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 15) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Float> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
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

                public final void invoke(Composer composer3, int i17) {
                    NavigationItemKt.m19049NavigationItemLayoutKmRXDg(interactionSource, j10, shape, function2, i10, function22, function03, f10, f11, f12, f13, f14, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemMinHeight;
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemMinWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m19054placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j10) {
        int iM23531constrainWidthK40F9xA = ConstraintsKt.m23531constrainWidthK40F9xA(j10, placeable2.getWidth());
        int iM23530constrainHeightK40F9xA = ConstraintsKt.m23530constrainHeightK40F9xA(j10, placeable2.getHeight());
        final int width = (iM23531constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height = (iM23530constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        final int width2 = (iM23531constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height2 = (iM23530constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width3 = (iM23531constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int height3 = (iM23530constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM23531constrainWidthK40F9xA, iM23530constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width3, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final MeasureResult m19055placeLabelAndStartIconnru01g4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, float f10) {
        int iM23531constrainWidthK40F9xA = ConstraintsKt.m23531constrainWidthK40F9xA(j10, placeable3.getWidth());
        int iM23530constrainHeightK40F9xA = ConstraintsKt.m23530constrainHeightK40F9xA(j10, placeable3.getHeight());
        final int width = (iM23531constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int height = (iM23530constrainHeightK40F9xA - placeable4.getHeight()) / 2;
        final int height2 = (iM23530constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        final int height3 = (iM23530constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM23531constrainWidthK40F9xA - ((placeable2.getWidth() + measureScope.mo17326roundToPx0680j_4(f10)) + placeable.getWidth())) / 2;
        final int width3 = placeable2.getWidth() + width2 + measureScope.mo17326roundToPx0680j_4(f10);
        final int width4 = (iM23531constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height4 = (iM23530constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM23531constrainWidthK40F9xA, iM23530constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, height4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final MeasureResult m19056placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, float f10, float f11, float f12) {
        int iM23531constrainWidthK40F9xA = ConstraintsKt.m23531constrainWidthK40F9xA(j10, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iM23530constrainHeightK40F9xA = ConstraintsKt.m23530constrainHeightK40F9xA(j10, MathKt.roundToInt(placeable3.getHeight() + measureScope.mo17332toPx0680j_4(f10) + placeable.getHeight() + (measureScope.mo17332toPx0680j_4(f12) * 2)));
        final int iMo17326roundToPx0680j_4 = measureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(f12 + f11));
        final int width = (iM23531constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int width2 = (iM23531constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int iMo17326roundToPx0680j_42 = iMo17326roundToPx0680j_4 - measureScope.mo17326roundToPx0680j_4(f11);
        final int width3 = (iM23531constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height = iMo17326roundToPx0680j_4 + placeable2.getHeight() + measureScope.mo17326roundToPx0680j_4(C3127Dp.m23561constructorimpl(f10 + f11));
        final int width4 = (iM23531constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        return MeasureScope.layout$default(measureScope, iM23531constrainWidthK40F9xA, iM23530constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width2, iMo17326roundToPx0680j_42, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, iMo17326roundToPx0680j_4, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, iMo17326roundToPx0680j_42, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
