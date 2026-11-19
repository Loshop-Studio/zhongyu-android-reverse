package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ InterfaceC9544p $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC9544p $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f10, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, InterfaceC9544p interfaceC9544p, TextStyle textStyle, boolean z10, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$expandedHeight = f10;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$colors = topAppBarColors;
        this.$title = interfaceC9544p;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z10;
        this.$navigationIcon = interfaceC9544p2;
        this.$actionsRow = interfaceC9544p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(TopAppBarScrollBehavior topAppBarScrollBehavior) {
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
            ComposerKt.traceEventStart(-1943739546, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
        }
        Modifier modifierM27493heightInVpY3zN4$default = SizeKt.m27493heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets)), 0.0f, this.$expandedHeight, 1, null);
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
        long jM29464getNavigationIconContentColor0d7_KjU = this.$colors.m29464getNavigationIconContentColor0d7_KjU();
        long jM29466getTitleContentColor0d7_KjU = this.$colors.m29466getTitleContentColor0d7_KjU();
        long jM29462getActionIconContentColor0d7_KjU = this.$colors.m29462getActionIconContentColor0d7_KjU();
        InterfaceC9544p interfaceC9544p = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        AppBarKt.m28353TopAppBarLayoutkXwM9vE(modifierM27493heightInVpY3zN4$default, scrolledOffset, jM29464getNavigationIconContentColor0d7_KjU, jM29466getTitleContentColor0d7_KjU, jM29462getActionIconContentColor0d7_KjU, interfaceC9544p, textStyle, 1.0f, arrangement.getCenter(), this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart(), 0, false, this.$navigationIcon, this.$actionsRow, composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
