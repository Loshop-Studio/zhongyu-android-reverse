package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ InterfaceC10574p $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC10574p $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f10, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, InterfaceC10574p interfaceC10574p, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p2, InterfaceC10574p interfaceC10574p3) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$expandedHeight = f10;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$colors = topAppBarColors;
        this.$title = interfaceC10574p;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z10;
        this.$navigationIcon = interfaceC10574p2;
        this.$actionsRow = interfaceC10574p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(TopAppBarScrollBehavior topAppBarScrollBehavior) {
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
            ComposerKt.traceEventStart(-1943739546, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
        }
        Modifier modifierM20891heightInVpY3zN4$default = SizeKt.m20891heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets)), 0.0f, this.$expandedHeight, 1, null);
        boolean zChanged = composer.changed(this.$scrollBehavior);
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ScrolledOffset() { // from class: androidx.compose.material3.a
                @Override // androidx.compose.material3.ScrolledOffset
                public final float offset() {
                    return AppBarKt$SingleRowTopAppBar$3.invoke$lambda$1$lambda$0(topAppBarScrollBehavior);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrolledOffset scrolledOffset = (ScrolledOffset) objRememberedValue;
        long jM22862getNavigationIconContentColor0d7_KjU = this.$colors.m22862getNavigationIconContentColor0d7_KjU();
        long jM22864getTitleContentColor0d7_KjU = this.$colors.m22864getTitleContentColor0d7_KjU();
        long jM22860getActionIconContentColor0d7_KjU = this.$colors.m22860getActionIconContentColor0d7_KjU();
        InterfaceC10574p interfaceC10574p = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        AppBarKt.m21751TopAppBarLayoutkXwM9vE(modifierM20891heightInVpY3zN4$default, scrolledOffset, jM22862getNavigationIconContentColor0d7_KjU, jM22864getTitleContentColor0d7_KjU, jM22860getActionIconContentColor0d7_KjU, interfaceC10574p, textStyle, 1.0f, arrangement.getCenter(), this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart(), 0, false, this.$navigationIcon, this.$actionsRow, composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
