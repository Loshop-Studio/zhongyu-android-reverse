package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ float $collapsedHeight;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ InterfaceC9544p $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC9544p $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ InterfaceC9544p $title;
    final /* synthetic */ Ref$IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f10, TopAppBarColors topAppBarColors, InterfaceC9544p interfaceC9544p, TextStyle textStyle, float f11, boolean z10, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, float f12, TopAppBarScrollBehavior topAppBarScrollBehavior, InterfaceC9544p interfaceC9544p4, TextStyle textStyle2, float f13, Ref$IntRef ref$IntRef, boolean z11) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$collapsedHeight = f10;
        this.$colors = topAppBarColors;
        this.$smallTitle = interfaceC9544p;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f11;
        this.$hideTopRowSemantics = z10;
        this.$navigationIcon = interfaceC9544p2;
        this.$actionsRow = interfaceC9544p3;
        this.$expandedHeight = f12;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = interfaceC9544p4;
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

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C10786q.f26013a;
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
        InterfaceC9544p interfaceC9544p = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f11 = this.$topTitleAlpha;
        boolean z10 = this.$hideTopRowSemantics;
        InterfaceC9544p interfaceC9544p2 = this.$navigationIcon;
        InterfaceC9544p interfaceC9544p3 = this.$actionsRow;
        float f12 = this.$expandedHeight;
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        InterfaceC9544p interfaceC9544p4 = this.$title;
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
        InterfaceC9529a constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AppBarKt.m28353TopAppBarLayoutkXwM9vE(SizeKt.m27493heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), 0.0f, f10, 1, null), new ScrolledOffset() { // from class: androidx.compose.material3.b
            @Override // androidx.compose.material3.ScrolledOffset
            public final float offset() {
                return AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$0();
            }
        }, topAppBarColors.m29464getNavigationIconContentColor0d7_KjU(), topAppBarColors.m29466getTitleContentColor0d7_KjU(), topAppBarColors.m29462getActionIconContentColor0d7_KjU(), interfaceC9544p, textStyle, f11, arrangement.getCenter(), arrangement.getStart(), 0, z10, interfaceC9544p2, interfaceC9544p3, composer, 905969712, 3078);
        Modifier modifierM27493heightInVpY3zN4$default = SizeKt.m27493heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m27531onlybOOhFvg(windowInsets, WindowInsetsSides.Companion.m27553getHorizontalJoeWqyM()))), 0.0f, C3186Dp.m33501constructorimpl(f12 - f10), 1, null);
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
        long jM29464getNavigationIconContentColor0d7_KjU = topAppBarColors.m29464getNavigationIconContentColor0d7_KjU();
        long jM29466getTitleContentColor0d7_KjU = topAppBarColors.m29466getTitleContentColor0d7_KjU();
        long jM29462getActionIconContentColor0d7_KjU = topAppBarColors.m29462getActionIconContentColor0d7_KjU();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i11 = ref$IntRef.f23400c;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        AppBarKt.m28353TopAppBarLayoutkXwM9vE(modifierM27493heightInVpY3zN4$default, (ScrolledOffset) objRememberedValue, jM29464getNavigationIconContentColor0d7_KjU, jM29466getTitleContentColor0d7_KjU, jM29462getActionIconContentColor0d7_KjU, interfaceC9544p4, textStyle2, f13, bottom, start, i11, z11, composableSingletons$AppBarKt.m28530getLambda17$material3_release(), composableSingletons$AppBarKt.m28531getLambda18$material3_release(), composer, 905969664, 3456);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
