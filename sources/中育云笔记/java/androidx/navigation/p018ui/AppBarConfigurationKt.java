package androidx.navigation.p018ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.p018ui.AppBarConfiguration;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class AppBarConfigurationKt {

    /* renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 */
    public static final class C41871 implements InterfaceC9529a {
        public static final C41871 INSTANCE = new C41871();

        @Override // p181hd.InterfaceC9529a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final AppBarConfiguration AppBarConfiguration(NavGraph navGraph, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener) {
        AbstractC9979u.m20294g(navGraph, "navGraph");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = C41871.INSTANCE;
        }
        AbstractC9979u.m20294g(navGraph, "navGraph");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Menu topLevelMenu, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener) {
        AbstractC9979u.m20294g(topLevelMenu, "topLevelMenu");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu topLevelMenu, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC9529a() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2
                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        AbstractC9979u.m20294g(topLevelMenu, "topLevelMenu");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Set<Integer> topLevelDestinationIds, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener) {
        AbstractC9979u.m20294g(topLevelDestinationIds, "topLevelDestinationIds");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set topLevelDestinationIds, Openable openable, InterfaceC9529a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openable = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC9529a() { // from class: androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3
                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        AbstractC9979u.m20294g(topLevelDestinationIds, "topLevelDestinationIds");
        AbstractC9979u.m20294g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder((Set<Integer>) topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(fallbackOnNavigateUpListener)).build();
    }
}
