package androidx.navigation;

import android.content.Context;
import android.view.View;
import android.view.serialization.SavedStateConfig_androidKt;
import android.view.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.navigation.internal.NavGraphImpl;
import coil3.compose.InterfaceC3252i;
import com.zykj.mistake.feature.ask.C4549y;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p137p4.C6383b;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2826a implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1194a;

    public /* synthetic */ C2826a(int i) {
        this.f1194a = i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f1194a) {
            case 0:
                return ActivityNavigator.hostActivity$lambda$0((Context) obj);
            case 1:
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj);
            case 2:
                return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj);
            case 3:
                return NavController.activity$lambda$1((Context) obj);
            case 4:
                return NavControllerViewModelKt.FACTORY$lambda$1$lambda$0((CreationExtras) obj);
            case 5:
                return NavDeepLinkBuilder.activity$lambda$0((Context) obj);
            case 6:
                return NavDeepLinkBuilder.activity$lambda$1((Context) obj);
            case 7:
                return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj);
            case 8:
                return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj);
            case 9:
                return NavGraphBuilder.build$lambda$1$lambda$0((NavDestination) obj);
            case 10:
                return NavOptionsBuilder.popUpTo$lambda$1((PopUpToBuilder) obj);
            case 11:
                return NavOptionsBuilder.popUpTo$lambda$2((PopUpToBuilder) obj);
            case 12:
                return NavOptionsBuilder.popUpTo$lambda$3((PopUpToBuilder) obj);
            case 13:
                return Navigation.findViewNavController$lambda$2((View) obj);
            case 14:
                return Navigation.findViewNavController$lambda$3((View) obj);
            case 15:
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj);
            case 16:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8((CreationExtras) obj);
            case 17:
                return NavControllerImpl.popBackStackInternal$lambda$4((NavBackStackEntry) obj);
            case 18:
                return NavControllerImpl.executePopOperations$lambda$11((NavDestination) obj);
            case 19:
                return NavControllerImpl.executePopOperations$lambda$14((NavDestination) obj);
            case 20:
                return Integer.valueOf(NavControllerImpl.launchSingleTopInternal$lambda$47((NavDestination) obj));
            case 21:
                return NavControllerImpl.navigateInternal$lambda$3((NavBackStackEntry) obj);
            case 22:
                return NavControllerImpl.clearBackStackInternal$lambda$19((NavOptionsBuilder) obj);
            case 23:
                return NavGraphImpl.setStartDestination$lambda$12((NavDestination) obj);
            case 24:
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            case 25:
                return (InterfaceC3252i) obj;
            case 26:
                C4549y it = (C4549y) obj;
                AbstractC5830k.m5330g(it, "it");
                return it.f6307a;
            case 27:
                C4549y it2 = (C4549y) obj;
                AbstractC5830k.m5330g(it2, "it");
                return it2.f6307a;
            case 28:
                C4549y it3 = (C4549y) obj;
                AbstractC5830k.m5330g(it3, "it");
                return it3.f6307a;
            default:
                C6383b it4 = (C6383b) obj;
                AbstractC5830k.m5330g(it4, "it");
                return it4.f10446a;
        }
    }
}
