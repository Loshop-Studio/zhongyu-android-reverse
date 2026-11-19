package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final /* synthetic */ class NavHostControllerKt__NavHostController_androidKt {
    /* renamed from: NavControllerSaver$NavHostControllerKt__NavHostController_androidKt */
    private static final Saver<NavHostController, ?> m1887xbdea065e(final Context context) {
        return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.navigation.compose.k
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return NavHostControllerKt__NavHostController_androidKt.m1888xbac0c46f((SaverScope) obj, (NavHostController) obj2);
            }
        }, new InterfaceC9540l() { // from class: androidx.navigation.compose.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NavHostControllerKt__NavHostController_androidKt.m1889x9e1410ad(context, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavControllerSaver$lambda$4$NavHostControllerKt__NavHostController_androidKt */
    public static final Bundle m1888xbac0c46f(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavControllerSaver$lambda$6$NavHostControllerKt__NavHostController_androidKt */
    public static final NavHostController m1889x9e1410ad(Context context, Bundle bundle) {
        NavHostController navHostControllerM1893x191ea551 = m1893x191ea551(context);
        navHostControllerM1893x191ea551.restoreState(bundle);
        return navHostControllerM1893x191ea551;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createNavController$NavHostControllerKt__NavHostController_androidKt */
    public static final NavHostController m1893x191ea551(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    @Composable
    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-342848815, i10, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] objArrCopyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        Saver<NavHostController, ?> saverM1887xbdea065e = m1887xbdea065e(context);
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.navigation.compose.j
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return NavHostControllerKt__NavHostController_androidKt.m1893x191ea551(context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m30420rememberSaveable(objArrCopyOf, (Saver) saverM1887xbdea065e, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navHostController;
    }
}
