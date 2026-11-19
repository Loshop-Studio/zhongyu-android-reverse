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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2543:1\n1223#2,6:2544\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n*L\n1934#1:2544,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f10, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, boolean z9, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$expandedHeight = f10;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$colors = topAppBarColors;
        this.$title = function2;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z9;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        if (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
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
        Modifier modifierM17716heightInVpY3zN4$default = SizeKt.m17716heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, this.$windowInsets)), 0.0f, this.$expandedHeight, 1, null);
        boolean zChanged = composer.changed(this.$scrollBehavior);
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ScrolledOffset() { // from class: androidx.compose.material3.a
                @Override // androidx.compose.material3.ScrolledOffset
                public final float offset() {
                    return AppBarKt$SingleRowTopAppBar$3.invoke$lambda$1$lambda$0(topAppBarScrollBehavior);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrolledOffset scrolledOffset = (ScrolledOffset) objRememberedValue;
        long navigationIconContentColor = this.$colors.getNavigationIconContentColor();
        long titleContentColor = this.$colors.getTitleContentColor();
        long actionIconContentColor = this.$colors.getActionIconContentColor();
        Function2<Composer, Integer, Unit> function2 = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        AppBarKt.m18511TopAppBarLayoutkXwM9vE(modifierM17716heightInVpY3zN4$default, scrolledOffset, navigationIconContentColor, titleContentColor, actionIconContentColor, function2, textStyle, 1.0f, arrangement.getCenter(), this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart(), 0, false, this.$navigationIcon, this.$actionsRow, composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
