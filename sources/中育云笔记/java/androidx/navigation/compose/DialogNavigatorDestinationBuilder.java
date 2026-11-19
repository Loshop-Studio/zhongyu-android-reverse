package androidx.navigation.compose;

import androidx.compose.p014ui.window.DialogProperties;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.DialogNavigator;
import java.util.Map;
import p181hd.InterfaceC9545q;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

@StabilityInferred(parameters = 0)
@NavDestinationDsl
/* loaded from: classes.dex */
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {
    public static final int $stable = 8;
    private final InterfaceC9545q content;
    private final DialogNavigator dialogNavigator;
    private final DialogProperties dialogProperties;

    public DialogNavigatorDestinationBuilder(DialogNavigator dialogNavigator, String str, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
        super(dialogNavigator, str);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = interfaceC9545q;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public DialogNavigator.Destination instantiateDestination() {
        return new DialogNavigator.Destination(this.dialogNavigator, this.dialogProperties, this.content);
    }

    public DialogNavigatorDestinationBuilder(DialogNavigator dialogNavigator, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
        super(dialogNavigator, interfaceC10469c, map);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = interfaceC9545q;
    }
}
