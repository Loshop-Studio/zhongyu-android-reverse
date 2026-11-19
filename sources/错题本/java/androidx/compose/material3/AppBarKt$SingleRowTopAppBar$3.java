package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2543:1\n1223#2,6:2544\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n*L\n1934#1:2544,6\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ InterfaceC6473e $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC6473e $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, InterfaceC6473e interfaceC6473e, TextStyle textStyle, boolean z8, InterfaceC6473e interfaceC6473e2, InterfaceC6473e interfaceC6473e3) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$expandedHeight = f;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$colors = topAppBarColors;
        this.$title = interfaceC6473e;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z8;
        this.$navigationIcon = interfaceC6473e2;
        this.$actionsRow = interfaceC6473e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(TopAppBarScrollBehavior topAppBarScrollBehavior) {
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
            ComposerKt.traceEventStart(-1943739546, i, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
        }
        Modifier modifierM7297heightInVpY3zN4$default = SizeKt.m7297heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, this.$windowInsets)), 0.0f, this.$expandedHeight, 1, null);
        boolean zChanged = composer.changed(this.$scrollBehavior);
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C1921a(topAppBarScrollBehavior, 0);
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrolledOffset scrolledOffset = (ScrolledOffset) objRememberedValue;
        long jM9268getNavigationIconContentColor0d7_KjU = this.$colors.getNavigationIconContentColor();
        long jM9270getTitleContentColor0d7_KjU = this.$colors.getTitleContentColor();
        long jM9266getActionIconContentColor0d7_KjU = this.$colors.getActionIconContentColor();
        InterfaceC6473e interfaceC6473e = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        AppBarKt.m8157TopAppBarLayoutkXwM9vE(modifierM7297heightInVpY3zN4$default, scrolledOffset, jM9268getNavigationIconContentColor0d7_KjU, jM9270getTitleContentColor0d7_KjU, jM9266getActionIconContentColor0d7_KjU, interfaceC6473e, textStyle, 1.0f, arrangement.getCenter(), this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart(), 0, false, this.$navigationIcon, this.$actionsRow, composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
