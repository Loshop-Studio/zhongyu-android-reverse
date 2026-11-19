package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ float $collapsedHeight;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ InterfaceC10574p $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC10574p $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ InterfaceC10574p $title;
    final /* synthetic */ Ref$IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f10, TopAppBarColors topAppBarColors, InterfaceC10574p interfaceC10574p, TextStyle textStyle, float f11, boolean z10, InterfaceC10574p interfaceC10574p2, InterfaceC10574p interfaceC10574p3, float f12, TopAppBarScrollBehavior topAppBarScrollBehavior, InterfaceC10574p interfaceC10574p4, TextStyle textStyle2, float f13, Ref$IntRef ref$IntRef, boolean z11) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$collapsedHeight = f10;
        this.$colors = topAppBarColors;
        this.$smallTitle = interfaceC10574p;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f11;
        this.$hideTopRowSemantics = z10;
        this.$navigationIcon = interfaceC10574p2;
        this.$actionsRow = interfaceC10574p3;
        this.$expandedHeight = f12;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = interfaceC10574p4;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f13;
        this.$titleBottomPaddingPx = ref$IntRef;
        this.$hideBottomRowSemantics = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$3$lambda$2$lambda$1(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        if (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C8736p.f16368a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350062619, i10, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        float f10 = this.$collapsedHeight;
        TopAppBarColors topAppBarColors = this.$colors;
        InterfaceC10574p interfaceC10574p = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f11 = this.$topTitleAlpha;
        boolean z10 = this.$hideTopRowSemantics;
        InterfaceC10574p interfaceC10574p2 = this.$navigationIcon;
        InterfaceC10574p interfaceC10574p3 = this.$actionsRow;
        float f12 = this.$expandedHeight;
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        InterfaceC10574p interfaceC10574p4 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f13 = this.$bottomTitleAlpha;
        Ref$IntRef ref$IntRef = this.$titleBottomPaddingPx;
        boolean z11 = this.$hideBottomRowSemantics;
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        InterfaceC10559a constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer);
        Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AppBarKt.m21751TopAppBarLayoutkXwM9vE(SizeKt.m20891heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), 0.0f, f10, 1, null), new ScrolledOffset() { // from class: androidx.compose.material3.b
            @Override // androidx.compose.material3.ScrolledOffset
            public final float offset() {
                return AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$0();
            }
        }, topAppBarColors.m22862getNavigationIconContentColor0d7_KjU(), topAppBarColors.m22864getTitleContentColor0d7_KjU(), topAppBarColors.m22860getActionIconContentColor0d7_KjU(), interfaceC10574p, textStyle, f11, arrangement.getCenter(), arrangement.getStart(), 0, z10, interfaceC10574p2, interfaceC10574p3, composer, 905969712, 3078);
        Modifier modifierM20891heightInVpY3zN4$default = SizeKt.m20891heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m20929onlybOOhFvg(windowInsets, WindowInsetsSides.Companion.m20951getHorizontalJoeWqyM()))), 0.0f, C3156Dp.m26899constructorimpl(f12 - f10), 1, null);
        boolean zChanged = composer.changed(topAppBarScrollBehavior);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ScrolledOffset() { // from class: androidx.compose.material3.c
                @Override // androidx.compose.material3.ScrolledOffset
                public final float offset() {
                    return AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$2$lambda$1(topAppBarScrollBehavior);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        long jM22862getNavigationIconContentColor0d7_KjU = topAppBarColors.m22862getNavigationIconContentColor0d7_KjU();
        long jM22864getTitleContentColor0d7_KjU = topAppBarColors.m22864getTitleContentColor0d7_KjU();
        long jM22860getActionIconContentColor0d7_KjU = topAppBarColors.m22860getActionIconContentColor0d7_KjU();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i11 = ref$IntRef.f17471a;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        AppBarKt.m21751TopAppBarLayoutkXwM9vE(modifierM20891heightInVpY3zN4$default, (ScrolledOffset) objRememberedValue, jM22862getNavigationIconContentColor0d7_KjU, jM22864getTitleContentColor0d7_KjU, jM22860getActionIconContentColor0d7_KjU, interfaceC10574p4, textStyle2, f13, bottom, start, i11, z11, composableSingletons$AppBarKt.m21928getLambda17$material3_release(), composableSingletons$AppBarKt.m21929getLambda18$material3_release(), composer, 905969664, 3456);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
