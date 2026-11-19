package androidx.navigation.compose;

import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.DialogNavigator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6474f;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@StabilityInferred(parameters = 0)
@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fB[\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u001b\u0010\u0015\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR%\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "", "route", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/compose/DialogNavigator;Ly6/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "instantiateDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "dialogNavigator", "Landroidx/navigation/compose/DialogNavigator;", "Landroidx/compose/ui/window/DialogProperties;", "Lr6/f;", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {
    public static final int $stable = 8;

    @NotNull
    private final InterfaceC6474f content;

    @NotNull
    private final DialogNavigator dialogNavigator;

    @NotNull
    private final DialogProperties dialogProperties;

    public DialogNavigatorDestinationBuilder(@NotNull DialogNavigator dialogNavigator, @NotNull String str, @NotNull DialogProperties dialogProperties, @NotNull InterfaceC6474f interfaceC6474f) {
        super(dialogNavigator, str);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = interfaceC6474f;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public DialogNavigator.Destination instantiateDestination() {
        return new DialogNavigator.Destination(this.dialogNavigator, this.dialogProperties, this.content);
    }

    public DialogNavigatorDestinationBuilder(@NotNull DialogNavigator dialogNavigator, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull DialogProperties dialogProperties, @NotNull InterfaceC6474f interfaceC6474f) {
        super(dialogNavigator, interfaceC6779c, map);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = interfaceC6474f;
    }
}
