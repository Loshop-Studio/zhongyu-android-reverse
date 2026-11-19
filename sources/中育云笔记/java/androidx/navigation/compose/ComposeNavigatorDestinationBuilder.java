package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Map;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

@StabilityInferred(parameters = 0)
@NavDestinationDsl
/* loaded from: classes.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public static final int $stable = 8;
    private final ComposeNavigator composeNavigator;
    private final InterfaceC9546r content;
    private InterfaceC9540l enterTransition;
    private InterfaceC9540l exitTransition;
    private InterfaceC9540l popEnterTransition;
    private InterfaceC9540l popExitTransition;
    private InterfaceC9540l sizeTransform;

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, String str, InterfaceC9546r interfaceC9546r) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = interfaceC9546r;
    }

    public final InterfaceC9540l getEnterTransition() {
        return this.enterTransition;
    }

    public final InterfaceC9540l getExitTransition() {
        return this.exitTransition;
    }

    public final InterfaceC9540l getPopEnterTransition() {
        return this.popEnterTransition;
    }

    public final InterfaceC9540l getPopExitTransition() {
        return this.popExitTransition;
    }

    public final InterfaceC9540l getSizeTransform() {
        return this.sizeTransform;
    }

    public final void setEnterTransition(InterfaceC9540l interfaceC9540l) {
        this.enterTransition = interfaceC9540l;
    }

    public final void setExitTransition(InterfaceC9540l interfaceC9540l) {
        this.exitTransition = interfaceC9540l;
    }

    public final void setPopEnterTransition(InterfaceC9540l interfaceC9540l) {
        this.popEnterTransition = interfaceC9540l;
    }

    public final void setPopExitTransition(InterfaceC9540l interfaceC9540l) {
        this.popExitTransition = interfaceC9540l;
    }

    public final void setSizeTransform(InterfaceC9540l interfaceC9540l) {
        this.sizeTransform = interfaceC9540l;
    }

    @Override // androidx.navigation.NavDestinationBuilder
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
    public ComposeNavigator.Destination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9546r interfaceC9546r) {
        super(composeNavigator, interfaceC10469c, map);
        this.composeNavigator = composeNavigator;
        this.content = interfaceC9546r;
    }
}
