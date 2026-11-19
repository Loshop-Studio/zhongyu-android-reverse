package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.AlphaKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
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
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ak\u0010#\u001a\u00020\u00132\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0003¢\u0006\u0002\u0010-\u001a\u0083\u0001\u0010.\u001a\u00020\u0013*\u00020\u001e2\u0006\u0010/\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130%2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020*2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0007¢\u0006\u0002\u00106\u001a;\u00107\u001a\u000208*\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aS\u0010B\u001a\u000208*\u0002092\u0006\u0010C\u001a\u00020;2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, m5175d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemVerticalPadding", "getNavigationBarItemVerticalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemBaselineLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, "Lkotlin/Function0;", NavigationBarKt.IndicatorLayoutIdTag, NavigationBarKt.IconLayoutIdTag, NavigationBarKt.LabelLayoutIdTag, "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarItemHorizontalPadding;
    private static final float NavigationBarItemVerticalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m8558getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = C1700Dp.m11525constructorimpl(8);
        NavigationBarItemVerticalPadding = C1700Dp.m11525constructorimpl(16);
        float f4 = 2;
        IndicatorHorizontalPadding = C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(navigationBarTokens.m8556getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m8559getIconSizeD9Ej5fM()) / f4);
        IndicatorVerticalPadding = C1700Dp.m11525constructorimpl(C1700Dp.m11525constructorimpl(navigationBarTokens.m8555getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m8559getIconSizeD9Ej5fM()) / f4);
        IndicatorVerticalOffset = C1700Dp.m11525constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8043NavigationBarHsRjFd4(androidx.compose.p006ui.Modifier r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m8043NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBarItem(final androidx.compose.foundation.layout.RowScope r30, final boolean r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.p006ui.Modifier r34, boolean r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, boolean r37, androidx.compose.material3.NavigationBarItemColors r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: NavigationBarItem$lambda-3, reason: not valid java name */
    private static final int m8044NavigationBarItem$lambda3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-4, reason: not valid java name */
    public static final void m8045NavigationBarItem$lambda4(MutableState<Integer> mutableState, int i4) {
        mutableState.setValue(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationBarItem$lambda-9$lambda-6, reason: not valid java name */
    public static final float m8046NavigationBarItem$lambda9$lambda6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z3, final float f4, Composer composer, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(591111291);
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
            i5 |= composerStartRestartGroup.changed(function24) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        }
        if ((374491 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591111291, i5, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:381)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemBaselineLayout.2
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
                public final MeasureResult mo6928measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j4) {
                    Object next;
                    Placeable placeableMo10585measureBRTryo0;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    for (Measurable measurable : measurables) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), NavigationBarKt.IconLayoutIdTag)) {
                            Placeable placeableMo10585measureBRTryo02 = measurable.mo10585measureBRTryo0(j4);
                            float f5 = 2;
                            int width = placeableMo10585measureBRTryo02.getWidth() + Layout.mo7200roundToPx0680j_4(C1700Dp.m11525constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f5));
                            int iRoundToInt = MathKt__MathJVMKt.roundToInt(width * f4);
                            int height = placeableMo10585measureBRTryo02.getHeight() + Layout.mo7200roundToPx0680j_4(C1700Dp.m11525constructorimpl(NavigationBarKt.IndicatorVerticalPadding * f5));
                            for (Measurable measurable2 : measurables) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), NavigationBarKt.IndicatorRippleLayoutIdTag)) {
                                    Placeable placeableMo10585measureBRTryo03 = measurable2.mo10585measureBRTryo0(Constraints.INSTANCE.m11501fixedJhjzzOo(width, height));
                                    Iterator<T> it = measurables.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), NavigationBarKt.IndicatorLayoutIdTag)) {
                                            break;
                                        }
                                    }
                                    Measurable measurable3 = (Measurable) next;
                                    Placeable placeableMo10585measureBRTryo04 = measurable3 != null ? measurable3.mo10585measureBRTryo0(Constraints.INSTANCE.m11501fixedJhjzzOo(iRoundToInt, height)) : null;
                                    if (function24 != null) {
                                        for (Measurable measurable4 : measurables) {
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), NavigationBarKt.LabelLayoutIdTag)) {
                                                placeableMo10585measureBRTryo0 = measurable4.mo10585measureBRTryo0(Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    placeableMo10585measureBRTryo0 = null;
                                    if (function24 == null) {
                                        return NavigationBarKt.m8051placeIconX9ElhV4(Layout, placeableMo10585measureBRTryo02, placeableMo10585measureBRTryo03, placeableMo10585measureBRTryo04, j4);
                                    }
                                    Intrinsics.checkNotNull(placeableMo10585measureBRTryo0);
                                    return NavigationBarKt.m8052placeLabelAndIconzUg2_y0(Layout, placeableMo10585measureBRTryo0, placeableMo10585measureBRTryo02, placeableMo10585measureBRTryo03, placeableMo10585measureBRTryo04, j4, z3, f4);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            composerStartRestartGroup.startReplaceableGroup(1170727090);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.startReplaceableGroup(-311736667);
            if (f4 > 0.0f) {
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
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
            composerStartRestartGroup.startReplaceableGroup(-1237554120);
            function23.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (function24 != null) {
                Modifier modifierM7318paddingVpY3zN4$default = PaddingKt.m7318paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, LabelLayoutIdTag), z3 ? 1.0f : f4), C1700Dp.m11525constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM7318paddingVpY3zN4$default);
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
                composerStartRestartGroup.startReplaceableGroup(359627658);
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemBaselineLayout.3
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
                NavigationBarKt.NavigationBarItemBaselineLayout(function2, function22, function23, function24, z3, f4, composer2, i4 | 1);
            }
        });
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return NavigationBarItemVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m8051placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j4) {
        final int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
        final int iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
        final int width = (iM11493getMaxWidthimpl - placeable.getWidth()) / 2;
        final int height = (iM11492getMaxHeightimpl - placeable.getHeight()) / 2;
        final int width2 = (iM11493getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int height2 = (iM11492getMaxHeightimpl - placeable2.getHeight()) / 2;
        return MeasureScope.CC.m634p(measureScope, iM11493getMaxWidthimpl, iM11492getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
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
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable4, (iM11493getMaxWidthimpl - placeable4.getWidth()) / 2, (iM11492getMaxHeightimpl - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m8052placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j4, final boolean z3, final float f4) {
        int iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
        int height = iM11492getMaxHeightimpl - placeable.getHeight();
        float f5 = NavigationBarItemVerticalPadding;
        final int iMo7200roundToPx0680j_4 = height - measureScope.mo7200roundToPx0680j_4(f5);
        final int iMo7200roundToPx0680j_42 = measureScope.mo7200roundToPx0680j_4(f5);
        final int iRoundToInt = MathKt__MathJVMKt.roundToInt(((z3 ? iMo7200roundToPx0680j_42 : (iM11492getMaxHeightimpl - placeable2.getHeight()) / 2) - iMo7200roundToPx0680j_42) * (1 - f4));
        final int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
        final int width = (iM11493getMaxWidthimpl - placeable.getWidth()) / 2;
        final int width2 = (iM11493getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int width3 = (iM11493getMaxWidthimpl - placeable3.getWidth()) / 2;
        final int iMo7200roundToPx0680j_43 = iMo7200roundToPx0680j_42 - measureScope.mo7200roundToPx0680j_4(IndicatorVerticalPadding);
        return MeasureScope.CC.m634p(measureScope, iM11493getMaxWidthimpl, iM11492getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope r9) {
                /*
                    r8 = this;
                    java.lang.String r0 = "$this$layout"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                    androidx.compose.ui.layout.Placeable r2 = r1
                    if (r2 == 0) goto L2a
                    int r0 = r14
                    int r1 = r10
                    androidx.compose.ui.layout.MeasureScope r3 = r15
                    int r4 = r7
                    int r5 = r2.getWidth()
                    int r0 = r0 - r5
                    int r0 = r0 / 2
                    float r5 = androidx.compose.material3.NavigationBarKt.access$getIndicatorVerticalPadding$p()
                    int r3 = r3.mo7200roundToPx0680j_4(r5)
                    int r1 = r1 - r3
                    int r4 = r4 + r1
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r1 = r9
                    r3 = r0
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
                L2a:
                    boolean r0 = r2
                    if (r0 != 0) goto L3a
                    float r0 = r3
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L37
                    r0 = 1
                    goto L38
                L37:
                    r0 = 0
                L38:
                    if (r0 != 0) goto L4b
                L3a:
                    androidx.compose.ui.layout.Placeable r2 = r4
                    int r3 = r5
                    int r0 = r6
                    int r1 = r7
                    int r4 = r0 + r1
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r1 = r9
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
                L4b:
                    androidx.compose.ui.layout.Placeable r2 = r8
                    int r3 = r9
                    int r0 = r10
                    int r1 = r7
                    int r4 = r0 + r1
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r1 = r9
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
                    androidx.compose.ui.layout.Placeable r2 = r11
                    int r3 = r12
                    int r0 = r13
                    int r1 = r7
                    int r4 = r0 + r1
                    r1 = r9
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
            }
        }, 4, null);
    }
}
