package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6475g;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@StabilityInferred(parameters = 0)
@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fB^\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u001b\u0010\u0015\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cRB\u0010 \u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001d¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%RB\u0010'\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u001d¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%RB\u0010*\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001d¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%RB\u0010-\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u001d¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%RB\u00101\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001e\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u001d¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%¨\u00064"}, m5110d2 = {"Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "", "route", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lr6/g;)V", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/compose/ComposeNavigator;Ly6/c;Ljava/util/Map;Lr6/g;)V", "instantiateDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "build", "composeNavigator", "Landroidx/navigation/compose/ComposeNavigator;", "Lr6/g;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Lr6/c;", "getEnterTransition", "()Lr6/c;", "setEnterTransition", "(Lr6/c;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition", "setExitTransition", "popEnterTransition", "getPopEnterTransition", "setPopEnterTransition", "popExitTransition", "getPopExitTransition", "setPopExitTransition", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform", "setSizeTransform", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public static final int $stable = 8;

    @NotNull
    private final ComposeNavigator composeNavigator;

    @NotNull
    private final InterfaceC6475g content;

    @Nullable
    private InterfaceC6471c enterTransition;

    @Nullable
    private InterfaceC6471c exitTransition;

    @Nullable
    private InterfaceC6471c popEnterTransition;

    @Nullable
    private InterfaceC6471c popExitTransition;

    @Nullable
    private InterfaceC6471c sizeTransform;

    public ComposeNavigatorDestinationBuilder(@NotNull ComposeNavigator composeNavigator, @NotNull String str, @NotNull InterfaceC6475g interfaceC6475g) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = interfaceC6475g;
    }

    @Nullable
    public final InterfaceC6471c getEnterTransition() {
        return this.enterTransition;
    }

    @Nullable
    public final InterfaceC6471c getExitTransition() {
        return this.exitTransition;
    }

    @Nullable
    public final InterfaceC6471c getPopEnterTransition() {
        return this.popEnterTransition;
    }

    @Nullable
    public final InterfaceC6471c getPopExitTransition() {
        return this.popExitTransition;
    }

    @Nullable
    public final InterfaceC6471c getSizeTransform() {
        return this.sizeTransform;
    }

    public final void setEnterTransition(@Nullable InterfaceC6471c interfaceC6471c) {
        this.enterTransition = interfaceC6471c;
    }

    public final void setExitTransition(@Nullable InterfaceC6471c interfaceC6471c) {
        this.exitTransition = interfaceC6471c;
    }

    public final void setPopEnterTransition(@Nullable InterfaceC6471c interfaceC6471c) {
        this.popEnterTransition = interfaceC6471c;
    }

    public final void setPopExitTransition(@Nullable InterfaceC6471c interfaceC6471c) {
        this.popExitTransition = interfaceC6471c;
    }

    public final void setSizeTransform(@Nullable InterfaceC6471c interfaceC6471c) {
        this.sizeTransform = interfaceC6471c;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public ComposeNavigator.Destination build() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.build();
        destination.setEnterTransition$navigation_compose_release(this.enterTransition);
        destination.setExitTransition$navigation_compose_release(this.exitTransition);
        destination.setPopEnterTransition$navigation_compose_release(this.popEnterTransition);
        destination.setPopExitTransition$navigation_compose_release(this.popExitTransition);
        destination.setSizeTransform$navigation_compose_release(this.sizeTransform);
        return destination;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public ComposeNavigator.Destination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }

    public ComposeNavigatorDestinationBuilder(@NotNull ComposeNavigator composeNavigator, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6475g interfaceC6475g) {
        super(composeNavigator, interfaceC6779c, map);
        this.composeNavigator = composeNavigator;
        this.content = interfaceC6475g;
    }
}
