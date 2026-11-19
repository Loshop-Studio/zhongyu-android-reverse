package androidx.navigation.p017ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.p017ui.AppBarConfiguration;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class AppBarConfigurationKt {

    /* renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 */
    public static final class C42591 implements InterfaceC10559a {
        public static final C42591 INSTANCE = new C42591();

        @Override // p300x7.InterfaceC10559a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final AppBarConfiguration AppBarConfiguration(NavGraph navGraph, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener) {
        AbstractC9133u.m16133g(navGraph, "navGraph");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = C42591.INSTANCE;
        }
        AbstractC9133u.m16133g(navGraph, "navGraph");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Menu topLevelMenu, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener) {
        AbstractC9133u.m16133g(topLevelMenu, "topLevelMenu");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu topLevelMenu, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC10559a() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2
                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        AbstractC9133u.m16133g(topLevelMenu, "topLevelMenu");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Set<Integer> topLevelDestinationIds, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener) {
        AbstractC9133u.m16133g(topLevelDestinationIds, "topLevelDestinationIds");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set topLevelDestinationIds, Openable openable, InterfaceC10559a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC10559a() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3
                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        AbstractC9133u.m16133g(topLevelDestinationIds, "topLevelDestinationIds");
        AbstractC9133u.m16133g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder((Set<Integer>) topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(fallbackOnNavigateUpListener)).build();
    }
}
