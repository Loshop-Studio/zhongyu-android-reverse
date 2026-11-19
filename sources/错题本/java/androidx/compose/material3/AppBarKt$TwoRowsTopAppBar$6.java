package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2543:1\n85#2:2544\n81#2,7:2545\n88#2:2580\n92#2:2591\n78#3,6:2552\n85#3,4:2567\n89#3,2:2577\n93#3:2590\n368#4,9:2558\n377#4:2579\n378#4,2:2588\n4032#5,6:2571\n56#6:2581\n1223#7,6:2582\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6\n*L\n2044#1:2544\n2044#1:2545,7\n2044#1:2580\n2044#1:2591\n2044#1:2552,6\n2044#1:2567,4\n2044#1:2577,2\n2044#1:2590\n2044#1:2558,9\n2044#1:2579\n2044#1:2588,2\n2044#1:2571,6\n2073#1:2581\n2074#1:2582,6\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ float $collapsedHeight;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ InterfaceC6473e $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC6473e $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ InterfaceC6473e $title;
    final /* synthetic */ Ref$IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f, TopAppBarColors topAppBarColors, InterfaceC6473e interfaceC6473e, TextStyle textStyle, float f7, boolean z8, InterfaceC6473e interfaceC6473e2, InterfaceC6473e interfaceC6473e3, float f8, TopAppBarScrollBehavior topAppBarScrollBehavior, InterfaceC6473e interfaceC6473e4, TextStyle textStyle2, float f9, Ref$IntRef ref$IntRef, boolean z9) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$collapsedHeight = f;
        this.$colors = topAppBarColors;
        this.$smallTitle = interfaceC6473e;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f7;
        this.$hideTopRowSemantics = z8;
        this.$navigationIcon = interfaceC6473e2;
        this.$actionsRow = interfaceC6473e3;
        this.$expandedHeight = f8;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = interfaceC6473e4;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f9;
        this.$titleBottomPaddingPx = ref$IntRef;
        this.$hideBottomRowSemantics = z9;
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

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C5443s.f8405a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350062619, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        float f = this.$collapsedHeight;
        TopAppBarColors topAppBarColors = this.$colors;
        InterfaceC6473e interfaceC6473e = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f7 = this.$topTitleAlpha;
        boolean z8 = this.$hideTopRowSemantics;
        InterfaceC6473e interfaceC6473e2 = this.$navigationIcon;
        InterfaceC6473e interfaceC6473e3 = this.$actionsRow;
        float f8 = this.$expandedHeight;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        InterfaceC6473e interfaceC6473e4 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f9 = this.$bottomTitleAlpha;
        Ref$IntRef ref$IntRef = this.$titleBottomPaddingPx;
        boolean z9 = this.$hideBottomRowSemantics;
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        InterfaceC6469a constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer);
        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
        }
        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AppBarKt.m8157TopAppBarLayoutkXwM9vE(SizeKt.m7297heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), 0.0f, f, 1, null), new C1922b(), topAppBarColors.getNavigationIconContentColor(), topAppBarColors.getTitleContentColor(), topAppBarColors.getActionIconContentColor(), interfaceC6473e, textStyle, f7, arrangement.getCenter(), arrangement.getStart(), 0, z8, interfaceC6473e2, interfaceC6473e3, composer, 905969712, 3078);
        int i8 = 1;
        Modifier modifierM7297heightInVpY3zN4$default = SizeKt.m7297heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m7335onlybOOhFvg(windowInsets, WindowInsetsSides.INSTANCE.m7357getHorizontalJoeWqyM()))), 0.0f, C2331Dp.m13305constructorimpl(f8 - f), 1, null);
        boolean zChanged = composer.changed(topAppBarScrollBehavior);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C1921a(topAppBarScrollBehavior, i8);
            composer.updateRememberedValue(objRememberedValue);
        }
        long jM9268getNavigationIconContentColor0d7_KjU = topAppBarColors.getNavigationIconContentColor();
        long jM9270getTitleContentColor0d7_KjU = topAppBarColors.getTitleContentColor();
        long jM9266getActionIconContentColor0d7_KjU = topAppBarColors.getActionIconContentColor();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i9 = ref$IntRef.element;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        AppBarKt.m8157TopAppBarLayoutkXwM9vE(modifierM7297heightInVpY3zN4$default, (ScrolledOffset) objRememberedValue, jM9268getNavigationIconContentColor0d7_KjU, jM9270getTitleContentColor0d7_KjU, jM9266getActionIconContentColor0d7_KjU, interfaceC6473e4, textStyle2, f9, bottom, start, i9, z9, composableSingletons$AppBarKt.m8334getLambda17$material3_release(), composableSingletons$AppBarKt.m8335getLambda18$material3_release(), composer, 905969664, 3456);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
