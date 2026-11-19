package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p012ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\"\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\n\u001a\u001f\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\r¨\u0006\u000e"}, m13413d2 = {"rememberNavController", "Landroidx/navigation/NavHostController;", "navigators", "", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;", "createNavController", "context", "Landroid/content/Context;", "createNavController$NavHostControllerKt__NavHostController_androidKt", "NavControllerSaver", "Landroidx/compose/runtime/saveable/Saver;", "NavControllerSaver$NavHostControllerKt__NavHostController_androidKt", "navigation-compose_release"}, m13414k = 5, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m13418xs = "androidx/navigation/compose/NavHostControllerKt")
@SourceDebugExtension({"SMAP\nNavHostController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.android.kt\nandroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n77#2:60\n1225#3,6:61\n1#4:67\n*S KotlinDebug\n*F\n+ 1 NavHostController.android.kt\nandroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt\n*L\n35#1:60\n36#1:61,6\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class NavHostControllerKt__NavHostController_androidKt {
    /* renamed from: NavControllerSaver$NavHostControllerKt__NavHostController_androidKt */
    private static final Saver<NavHostController, ?> m1835xbdea065e(final Context context) {
        return SaverKt.Saver(new Function2() { // from class: androidx.navigation.compose.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NavHostControllerKt__NavHostController_androidKt.m1836xbac0c46f((SaverScope) obj, (NavHostController) obj2);
            }
        }, new Function1() { // from class: androidx.navigation.compose.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavHostControllerKt__NavHostController_androidKt.m1837x9e1410ad(context, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavControllerSaver$lambda$4$NavHostControllerKt__NavHostController_androidKt */
    public static final Bundle m1836xbac0c46f(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavControllerSaver$lambda$6$NavHostControllerKt__NavHostController_androidKt */
    public static final NavHostController m1837x9e1410ad(Context context, Bundle bundle) {
        NavHostController navHostControllerM1841x191ea551 = m1841x191ea551(context);
        navHostControllerM1841x191ea551.restoreState(bundle);
        return navHostControllerM1841x191ea551;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createNavController$NavHostControllerKt__NavHostController_androidKt */
    public static final NavHostController m1841x191ea551(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    @Composable
    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-342848815, i9, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] objArrCopyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        Saver<NavHostController, ?> saverM1835xbdea065e = m1835xbdea065e(context);
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: androidx.navigation.compose.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavHostControllerKt__NavHostController_androidKt.m1841x191ea551(context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m20966rememberSaveable(objArrCopyOf, (Saver) saverM1835xbdea065e, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navHostController;
    }
}
