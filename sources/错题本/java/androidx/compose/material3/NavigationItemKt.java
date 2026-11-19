package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
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
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u001aÍ\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00002\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0090\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a6\u00102\u001a\u00020/*\u00020(2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aV\u00106\u001a\u00020/*\u00020(2\u0006\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aF\u00109\u001a\u00020/*\u00020(2\u0006\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108\"\u001a\u0010:\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u001a\u0010>\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010B\"\u0014\u0010D\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010B\"\u0014\u0010E\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010B\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K²\u0006\u000e\u0010J\u001a\u00020F8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"", "selected", "Lkotlin/Function0;", "Ld6/s;", "onClick", "Landroidx/compose/runtime/Composable;", NavigationItemKt.IconLayoutIdTag, "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Shape;", "indicatorShape", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "Landroidx/compose/material3/NavigationItemColors;", "colors", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", NavigationItemKt.LabelLayoutIdTag, "badge", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationItem-SHbi2eg", "(ZLr6/a;Lr6/e;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationItem", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/graphics/Color;", "indicatorColor", "", "animationProgress", "NavigationItemLayout-KmRX-Dg", "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V", "NavigationItemLayout", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndTopIcon-qoqLrGI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndTopIcon", "placeLabelAndStartIcon-nru01g4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndStartIcon", "NavigationItemMinWidth", "F", "getNavigationItemMinWidth", "()F", "NavigationItemMinHeight", "getNavigationItemMinHeight", "", "IndicatorRippleLayoutIdTag", "Ljava/lang/String;", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "", "ItemAnimationDurationMillis", "I", "IndicatorVerticalOffset", "itemWidth", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:738\n1223#2,6:777\n1223#2,6:783\n1223#2,6:824\n71#3,3:744\n74#3:775\n78#3:792\n71#3:830\n68#3,6:831\n74#3:865\n78#3:869\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:747\n85#4,4:762\n89#4,2:772\n93#4:791\n78#4:793\n76#4,8:794\n85#4,4:811\n89#4,2:821\n78#4,6:837\n85#4,4:852\n89#4,2:862\n93#4:868\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:753\n377#5:774\n378#5,2:789\n368#5,9:802\n377#5:823\n368#5,9:843\n377#5:864\n378#5,2:866\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:766\n4032#6,6:815\n4032#6,6:856\n4032#6,6:896\n77#7:776\n50#8:913\n50#8:914\n75#9:915\n108#9,2:916\n148#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n282#1:732,6\n295#1:738,6\n319#1:777,6\n331#1:783,6\n370#1:824,6\n284#1:744,3\n284#1:775\n284#1:792\n376#1:830\n376#1:831,6\n376#1:865\n376#1:869\n378#1:870\n378#1:871,6\n378#1:905\n378#1:909\n284#1:747,6\n284#1:762,4\n284#1:772,2\n284#1:791\n357#1:793\n357#1:794,8\n357#1:811,4\n357#1:821,2\n376#1:837,6\n376#1:852,4\n376#1:862,2\n376#1:868\n378#1:877,6\n378#1:892,4\n378#1:902,2\n378#1:908\n357#1:912\n284#1:753,9\n284#1:774\n284#1:789,2\n357#1:802,9\n357#1:823\n376#1:843,9\n376#1:864\n376#1:866,2\n378#1:883,9\n378#1:904\n378#1:906,2\n357#1:910,2\n284#1:766,6\n357#1:815,6\n376#1:856,6\n378#1:896,6\n311#1:776\n657#1:913\n666#1:914\n282#1:915\n282#1:916,2\n730#1:918\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationItemKt {

    @NotNull
    private static final String IconLayoutIdTag = "icon";

    @NotNull
    private static final String IndicatorLayoutIdTag = "indicator";

    @NotNull
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final int ItemAnimationDurationMillis = 100;

    @NotNull
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
    private static final float NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
    private static final float IndicatorVerticalOffset = C2331Dp.m13305constructorimpl(12);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItem-SHbi2eg, reason: not valid java name */
    public static final void m8717NavigationItemSHbi2eg(final boolean z8, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull final InterfaceC6473e interfaceC6473e, @NotNull final TextStyle textStyle, @NotNull final Shape shape, final float f, final float f7, final float f8, final float f9, final float f10, final float f11, @NotNull final NavigationItemColors navigationItemColors, @NotNull final Modifier modifier, final boolean z9, @Nullable final InterfaceC6473e interfaceC6473e2, @Nullable final InterfaceC6473e interfaceC6473e3, final int i, @NotNull MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, final int i8, final int i9) {
        int i10;
        Shape shape2;
        int i11;
        boolean z10;
        MutableInteractionSource mutableInteractionSource2;
        int i12;
        InteractionSource interactionSource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(547979956);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            shape2 = shape;
            i10 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((i8 & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i10 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i10 |= composerStartRestartGroup.changed(f7) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i10 |= composerStartRestartGroup.changed(f8) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= composerStartRestartGroup.changed(f9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changed(f10) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(f11) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(navigationItemColors) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 16384 : 8192;
        }
        if ((i9 & ProfileVerifier.CompilationStatus.f1352xf2722a21) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i11 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((i10 & 306783379) == 306783378 && (4793491 & i13) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547979956, i10, i13, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            int i14 = i10;
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i15) {
                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-44329638, i15, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                    }
                    long jM8706iconColorWaAFU9c = navigationItemColors.m8706iconColorWaAFU9c(z8, z9);
                    Modifier modifierClearAndSetSemantics = interfaceC6473e2 != null ? SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }
                    }) : Modifier.INSTANCE;
                    InterfaceC6473e interfaceC6473e4 = interfaceC6473e;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierClearAndSetSemantics);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(jM8706iconColorWaAFU9c)), interfaceC6473e4, composer3, ProvidedValue.$stable);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1735402128);
            if (interfaceC6473e3 != null) {
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C5443s.f8405a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i15) {
                        if ((i15 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836184859, i15, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final InterfaceC6473e interfaceC6473e4 = interfaceC6473e3;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(870803363, true, new InterfaceC6474f() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            {
                                super(3);
                            }

                            @Override // p152r6.InterfaceC6474f
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return C5443s.f8405a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxScope boxScope, @Nullable Composer composer4, int i16) {
                                if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(870803363, i16, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                interfaceC6473e4.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final InterfaceC6473e interfaceC6473e5 = composableLambdaRememberComposableLambda;
                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, null, ComposableLambdaKt.rememberComposableLambda(-1365557663, true, new InterfaceC6474f() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            {
                                super(3);
                            }

                            @Override // p152r6.InterfaceC6474f
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return C5443s.f8405a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxScope boxScope, @Nullable Composer composer4, int i16) {
                                if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1365557663, i16, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                interfaceC6473e5.invoke(composer4, 6);
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
            if (interfaceC6473e2 == null) {
                z10 = true;
            } else {
                z10 = true;
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-254668050, true, new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C5443s.f8405a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i15) {
                        if ((i15 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-254668050, i15, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.m9321ProvideContentColorTextStyle3JVO9M(navigationItemColors.m8707textColorWaAFU9c(z8, z9), textStyle, interfaceC6473e2, composer3, 0);
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
            Modifier modifierM7293defaultMinSizeVpY3zN4 = SizeKt.m7293defaultMinSizeVpY3zN4(SelectableKt.m7525selectableO2vRcR0(modifier, z8, mutableInteractionSource2, null, z9, Role.m12525boximpl(Role.INSTANCE.m12539getTabo7Vup1c()), interfaceC6469a), NavigationItemMinWidth, NavigationItemMinHeight);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m8726invokeozmzZPI(((IntSize) obj).m13480unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m8726invokeozmzZPI(long j7) {
                        mutableIntState.setIntValue(IntSize.m13476getWidthimpl(j7));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM7293defaultMinSizeVpY3zN4, (InterfaceC6471c) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), z10);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z8 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(-1634400795);
            if (NavigationItemIconPosition.m8711equalsimpl0(i, NavigationItemIconPosition.INSTANCE.m8716getTopxw1Ddg())) {
                i12 = 29360128;
                long jOffset = OffsetKt.Offset((mutableIntState.getIntValue() - r8.mo6897roundToPx0680j_4(f)) / 2, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(IndicatorVerticalOffset));
                boolean zChanged = ((i13 & 29360128) == 8388608) | composerStartRestartGroup.changed(jOffset);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new MappedInteractionSource(mutableInteractionSource2, jOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                interactionSource = (MappedInteractionSource) objRememberedValue3;
            } else {
                i12 = 29360128;
                interactionSource = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            InteractionSource interactionSource2 = interactionSource != null ? interactionSource : mutableInteractionSource2;
            long selectedIndicatorColor = navigationItemColors.getSelectedIndicatorColor();
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC6469a() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final Float invoke() {
                        return stateAnimateFloatAsState.getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i15 = i14 << 3;
            m8718NavigationItemLayoutKmRXDg(interactionSource2, selectedIndicatorColor, shape2, composableLambda, i, composableLambda2, (InterfaceC6469a) objRememberedValue4, f7, f8, f9, f10, f11, composerStartRestartGroup, ((i14 >> 6) & 896) | ((i13 >> 6) & 57344) | (i15 & i12) | (234881024 & i15) | (i15 & 1879048192), ((i14 >> 27) & 14) | ((i13 << 3) & 112));
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i16) {
                    NavigationItemKt.m8717NavigationItemSHbi2eg(z8, interfaceC6469a, interfaceC6473e, textStyle, shape, f, f7, f8, f9, f10, f11, navigationItemColors, modifier, z9, interfaceC6473e2, interfaceC6473e3, i, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    public static final void m8718NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j7, final Shape shape, final InterfaceC6473e interfaceC6473e, final int i, final InterfaceC6473e interfaceC6473e2, InterfaceC6469a interfaceC6469a, final float f, final float f7, final float f8, final float f9, final float f10, Composer composer, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        MeasurePolicy topIconOrIconOnlyMeasurePolicy;
        Composer composer2;
        final InterfaceC6469a interfaceC6469a2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757687417);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 131072 : 65536;
        }
        if ((1572864 & i8) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i10 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= composerStartRestartGroup.changed(f7) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changed(f8) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (composerStartRestartGroup.changed(f9) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        int i14 = i11;
        if ((i10 & 306783379) == 306783378 && (i14 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC6469a2 = interfaceC6469a;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757687417, i10, i14, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (interfaceC6473e2 == null || NavigationItemIconPosition.m8711equalsimpl0(i, NavigationItemIconPosition.INSTANCE.m8716getTopxw1Ddg())) {
                i12 = 0;
                i13 = i10;
                composer2 = composerStartRestartGroup;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(interfaceC6473e2 != null, interfaceC6469a, f, f7, f8, f10, null);
                interfaceC6469a2 = interfaceC6469a;
            } else {
                i12 = 0;
                i13 = i10;
                interfaceC6469a2 = interfaceC6469a;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(interfaceC6469a2, f, f7, f9, null);
                composer2 = composerStartRestartGroup;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, i12);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, topIconOrIconOnlyMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            composerStartRestartGroup = composer2;
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m8813rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 0);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IndicatorLayoutIdTag);
            boolean z8 = (i13 & 3670016) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((GraphicsLayerScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setAlpha(((Number) interfaceC6469a2.invoke()).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(BackgroundKt.m6753backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (InterfaceC6471c) objRememberedValue), j7, shape), composerStartRestartGroup, 0);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            InterfaceC6469a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC6473e.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-776741606);
            if (interfaceC6473e2 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                InterfaceC6469a constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                }
                Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                AbstractC0584a.m920u(composerStartRestartGroup, (i13 >> 15) & 14, interfaceC6473e2);
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i15) {
                    NavigationItemKt.m8718NavigationItemLayoutKmRXDg(interactionSource, j7, shape, interfaceC6473e, i, interfaceC6473e2, interfaceC6469a3, f, f7, f8, f9, f10, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9));
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
    public static final MeasureResult m8723placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j7) {
        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, placeable2.getWidth());
        int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, placeable2.getHeight());
        final int iM898C = AbstractC0584a.m898C(placeable3, iM13275constrainWidthK40F9xA, 2);
        final int iM906g = AbstractC0584a.m906g(placeable3, iM13274constrainHeightK40F9xA, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable, iM13275constrainWidthK40F9xA, 2);
        final int iM906g2 = AbstractC0584a.m906g(placeable, iM13274constrainHeightK40F9xA, 2);
        final int iM898C3 = AbstractC0584a.m898C(placeable2, iM13275constrainWidthK40F9xA, 2);
        final int iM906g3 = AbstractC0584a.m906g(placeable2, iM13274constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM13275constrainWidthK40F9xA, iM13274constrainHeightK40F9xA, null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iM898C, iM906g, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM898C2, iM906g2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iM898C3, iM906g3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final MeasureResult m8724placeLabelAndStartIconnru01g4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j7, float f) {
        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, placeable3.getWidth());
        int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, placeable3.getHeight());
        final int iM898C = AbstractC0584a.m898C(placeable4, iM13275constrainWidthK40F9xA, 2);
        final int iM906g = AbstractC0584a.m906g(placeable4, iM13274constrainHeightK40F9xA, 2);
        final int iM906g2 = AbstractC0584a.m906g(placeable2, iM13274constrainHeightK40F9xA, 2);
        final int iM906g3 = AbstractC0584a.m906g(placeable, iM13274constrainHeightK40F9xA, 2);
        final int width = (iM13275constrainWidthK40F9xA - (placeable.getWidth() + (measureScope.mo6897roundToPx0680j_4(f) + placeable2.getWidth()))) / 2;
        final int iMo6897roundToPx0680j_4 = measureScope.mo6897roundToPx0680j_4(f) + placeable2.getWidth() + width;
        final int iM898C2 = AbstractC0584a.m898C(placeable3, iM13275constrainWidthK40F9xA, 2);
        final int iM906g4 = AbstractC0584a.m906g(placeable3, iM13274constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM13275constrainWidthK40F9xA, iM13274constrainHeightK40F9xA, null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, iM898C, iM906g, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iMo6897roundToPx0680j_4, iM906g3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, iM906g2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iM898C2, iM906g4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final MeasureResult m8725placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j7, float f, float f7, float f8) {
        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, AbstractC6600a.m6241q((measureScope.mo6903toPx0680j_4(f8) * 2) + measureScope.mo6903toPx0680j_4(f) + placeable3.getHeight() + placeable.getHeight()));
        final int iMo6897roundToPx0680j_4 = measureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(f8 + f7));
        final int iM898C = AbstractC0584a.m898C(placeable2, iM13275constrainWidthK40F9xA, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable4, iM13275constrainWidthK40F9xA, 2);
        final int iMo6897roundToPx0680j_42 = iMo6897roundToPx0680j_4 - measureScope.mo6897roundToPx0680j_4(f7);
        final int iM898C3 = AbstractC0584a.m898C(placeable, iM13275constrainWidthK40F9xA, 2);
        final int iMo6897roundToPx0680j_43 = measureScope.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(f + f7)) + placeable2.getHeight() + iMo6897roundToPx0680j_4;
        final int iM898C4 = AbstractC0584a.m898C(placeable3, iM13275constrainWidthK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM13275constrainWidthK40F9xA, iM13274constrainHeightK40F9xA, null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, iM898C2, iMo6897roundToPx0680j_42, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM898C3, iMo6897roundToPx0680j_43, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iM898C, iMo6897roundToPx0680j_4, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iM898C4, iMo6897roundToPx0680j_42, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
