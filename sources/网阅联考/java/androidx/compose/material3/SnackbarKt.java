package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.layout.AbstractC1421e;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutIdKt;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
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
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ah\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aj\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001am\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u009c\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5175d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = C1700Dp.m11525constructorimpl(600);
    private static final float HeightToFirstLine = C1700Dp.m11525constructorimpl(30);
    private static final float HorizontalSpacing = C1700Dp.m11525constructorimpl(16);
    private static final float SeparateButtonExtraY = C1700Dp.m11525constructorimpl(2);
    private static final float SnackbarVerticalPadding = C1700Dp.m11525constructorimpl(6);
    private static final float LongButtonVerticalOffset = C1700Dp.m11525constructorimpl(12);

    static {
        float f4 = 8;
        HorizontalSpacingButtonSide = C1700Dp.m11525constructorimpl(f4);
        TextEndExtraSpacing = C1700Dp.m11525constructorimpl(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m8111NewLineButtonSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j4, final long j5, Composer composer, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i5 |= composerStartRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(function23) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(j4) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(j5) ? 131072 : 65536;
        }
        if ((374491 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i5, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:248)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7320paddingqDBjuR0$default = PaddingKt.m7320paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m7366widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7320paddingqDBjuR0$default);
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
            Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-363148767);
            Modifier modifierM7245paddingFromBaselineVpY3zN4 = AlignmentLineKt.m7245paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f4 = HorizontalSpacingButtonSide;
            Modifier modifierM7320paddingqDBjuR0$default2 = PaddingKt.m7320paddingqDBjuR0$default(modifierM7245paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f4, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM7320paddingqDBjuR0$default2);
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
            Updater.m8831setimpl(composerM8824constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl2, density2, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(74621659);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7320paddingqDBjuR0$default3 = PaddingKt.m7320paddingqDBjuR0$default(columnScopeInstance.align(companion, companion2.getEnd()), 0.0f, 0.0f, function23 == null ? f4 : C1700Dp.m11525constructorimpl(0), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM7320paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl3 = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl3, density3, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            composerStartRestartGroup.startReplaceableGroup(1640608516);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl4 = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl4, density4, companion3.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1595822816);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, composerStartRestartGroup, (i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
            if (function23 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j5))}, function23, composerStartRestartGroup, ((i5 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
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

            public final void invoke(Composer composer2, int i6) {
                SnackbarKt.m8111NewLineButtonSnackbarkKq0p4A(function2, function22, function23, textStyle, j4, j5, composer2, i4 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m8112OneRowSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j4, final long j5, Composer composer, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i5 |= composerStartRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(function23) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(j4) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(j5) ? 131072 : 65536;
        }
        if ((374491 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i5, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:293)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7320paddingqDBjuR0$default = PaddingKt.m7320paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, function23 == null ? HorizontalSpacingButtonSide : C1700Dp.m11525constructorimpl(0), 0.0f, 10, null);
            final String str = "action";
            final String str2 = "dismissAction";
            final String str3 = "text";
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m654a(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m655b(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo6928measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j6) {
                    Object next;
                    Object next2;
                    int iMax;
                    final int i6;
                    final int height;
                    int i7;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int iMin = Math.min(Constraints.m11493getMaxWidthimpl(j6), Layout.mo7200roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
                    String str4 = str;
                    Iterator<T> it = measurables.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), str4)) {
                            break;
                        }
                    }
                    Measurable measurable = (Measurable) next;
                    Placeable placeableMo10585measureBRTryo0 = measurable != null ? measurable.mo10585measureBRTryo0(j6) : null;
                    String str5 = str2;
                    Iterator<T> it2 = measurables.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), str5)) {
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) next2;
                    final Placeable placeableMo10585measureBRTryo02 = measurable2 != null ? measurable2.mo10585measureBRTryo0(j6) : null;
                    int width = placeableMo10585measureBRTryo0 != null ? placeableMo10585measureBRTryo0.getWidth() : 0;
                    int height2 = placeableMo10585measureBRTryo0 != null ? placeableMo10585measureBRTryo0.getHeight() : 0;
                    int width2 = placeableMo10585measureBRTryo02 != null ? placeableMo10585measureBRTryo02.getWidth() : 0;
                    int height3 = placeableMo10585measureBRTryo02 != null ? placeableMo10585measureBRTryo02.getHeight() : 0;
                    int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((iMin - width) - width2) - (width2 == 0 ? Layout.mo7200roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing) : 0), Constraints.m11495getMinWidthimpl(j6));
                    String str6 = str3;
                    for (Measurable measurable3 : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), str6)) {
                            int i8 = height3;
                            final Placeable placeableMo10585measureBRTryo03 = measurable3.mo10585measureBRTryo0(Constraints.m11484copyZbe2FdA$default(j6, 0, iCoerceAtLeast, 0, 0, 9, null));
                            int i9 = placeableMo10585measureBRTryo03.get(androidx.compose.p006ui.layout.AlignmentLineKt.getFirstBaseline());
                            if (!(i9 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            int i10 = placeableMo10585measureBRTryo03.get(androidx.compose.p006ui.layout.AlignmentLineKt.getLastBaseline());
                            if (!(i10 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            boolean z3 = i9 == i10;
                            final int i11 = iMin - width2;
                            final int i12 = i11 - width;
                            if (z3) {
                                int iMax2 = Math.max(Layout.mo7200roundToPx0680j_4(SnackbarTokens.INSTANCE.m8706getSingleLineContainerHeightD9Ej5fM()), Math.max(height2, i8));
                                int height4 = (iMax2 - placeableMo10585measureBRTryo03.getHeight()) / 2;
                                height = (placeableMo10585measureBRTryo0 == null || (i7 = placeableMo10585measureBRTryo0.get(androidx.compose.p006ui.layout.AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) ? 0 : (i9 + height4) - i7;
                                i6 = height4;
                                iMax = iMax2;
                            } else {
                                int iMo7200roundToPx0680j_4 = Layout.mo7200roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i9;
                                iMax = Math.max(Layout.mo7200roundToPx0680j_4(SnackbarTokens.INSTANCE.m8707getTwoLinesContainerHeightD9Ej5fM()), placeableMo10585measureBRTryo03.getHeight() + iMo7200roundToPx0680j_4);
                                i6 = iMo7200roundToPx0680j_4;
                                height = placeableMo10585measureBRTryo0 != null ? (iMax - placeableMo10585measureBRTryo0.getHeight()) / 2 : 0;
                            }
                            final int height5 = placeableMo10585measureBRTryo02 != null ? (iMax - placeableMo10585measureBRTryo02.getHeight()) / 2 : 0;
                            final Placeable placeable = placeableMo10585measureBRTryo0;
                            return MeasureScope.CC.m634p(Layout, iMin, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$measure$4
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
                                public final void invoke2(Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo10585measureBRTryo03, 0, i6, 0.0f, 4, null);
                                    Placeable placeable2 = placeableMo10585measureBRTryo02;
                                    if (placeable2 != null) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i11, height5, 0.0f, 4, null);
                                    }
                                    Placeable placeable3 = placeable;
                                    if (placeable3 != null) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable3, i12, height, 0.0f, 4, null);
                                    }
                                }
                            }, 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m656c(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m657d(this, intrinsicMeasureScope, list, i6);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7320paddingqDBjuR0$default);
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
            Updater.m8831setimpl(composerM8824constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion2.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1961334364);
            Modifier modifierM7318paddingVpY3zN4$default = PaddingKt.m7318paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM7318paddingVpY3zN4$default);
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
            Updater.m8831setimpl(composerM8824constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl2, density2, companion2.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-789862614);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-167734710);
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM8824constructorimpl3 = Updater.m8824constructorimpl(composerStartRestartGroup);
                Updater.m8831setimpl(composerM8824constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl3, density3, companion2.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                composerStartRestartGroup.startReplaceableGroup(801714373);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, composerStartRestartGroup, (i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function23 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierLayoutId2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM8824constructorimpl4 = Updater.m8824constructorimpl(composerStartRestartGroup);
                Updater.m8831setimpl(composerM8824constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl4, density4, companion2.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl4, layoutDirection4, companion2.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl4, viewConfiguration4, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                composerStartRestartGroup.startReplaceableGroup(88411260);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j5))}, function23, composerStartRestartGroup, ((i5 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
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

            public final void invoke(Composer composer2, int i6) {
                SnackbarKt.m8112OneRowSnackbarkKq0p4A(function2, function22, function23, textStyle, j4, j5, composer2, i4 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8113SnackbareQBnUkQ(androidx.compose.p006ui.Modifier r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, boolean r28, androidx.compose.p006ui.graphics.Shape r29, long r30, long r32, long r34, long r36, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m8113SnackbareQBnUkQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8114SnackbarsDKtq54(final androidx.compose.material3.SnackbarData r39, androidx.compose.p006ui.Modifier r40, boolean r41, androidx.compose.p006ui.graphics.Shape r42, long r43, long r45, long r47, long r49, long r51, androidx.compose.runtime.Composer r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m8114SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
