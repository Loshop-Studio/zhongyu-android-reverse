package androidx.navigation.p018ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes3.dex */
public final class AppBarConfiguration {
    private final OnNavigateUpListener fallbackOnNavigateUpListener;
    private final Openable openableLayout;
    private final Set<Integer> topLevelDestinations;

    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    public /* synthetic */ AppBarConfiguration(Set set, Openable openable, OnNavigateUpListener onNavigateUpListener, AbstractC9972n abstractC9972n) {
        this(set, openable, onNavigateUpListener);
    }

    @InterfaceC10770a
    public final DrawerLayout getDrawerLayout() {
        Openable openable = this.openableLayout;
        if (openable instanceof DrawerLayout) {
            return (DrawerLayout) openable;
        }
        return null;
    }

    public final OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.fallbackOnNavigateUpListener;
    }

    public final Openable getOpenableLayout() {
        return this.openableLayout;
    }

    public final Set<Integer> getTopLevelDestinations() {
        return this.topLevelDestinations;
    }

    public final boolean isTopLevelDestination(NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        for (NavDestination navDestination : NavDestination.Companion.getHierarchy(destination)) {
            if (this.topLevelDestinations.contains(Integer.valueOf(navDestination.getId())) && (!(navDestination instanceof NavGraph) || destination.getId() == NavGraph.Companion.findStartDestination((NavGraph) navDestination).getId())) {
                return true;
            }
        }
        return false;
    }

    private AppBarConfiguration(Set<Integer> set, Openable openable, OnNavigateUpListener onNavigateUpListener) {
        this.topLevelDestinations = set;
        this.openableLayout = openable;
        this.fallbackOnNavigateUpListener = onNavigateUpListener;
    }

    public static final class Builder {
        private OnNavigateUpListener fallbackOnNavigateUpListener;
        private Openable openableLayout;
        private final Set<Integer> topLevelDestinations;

        public Builder(NavGraph navGraph) {
            AbstractC9979u.m20294g(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(NavGraph.Companion.findStartDestination(navGraph).getId()));
        }

        public final AppBarConfiguration build() {
            return new AppBarConfiguration(this.topLevelDestinations, this.openableLayout, this.fallbackOnNavigateUpListener, null);
        }

        @InterfaceC10770a
        public final Builder setDrawerLayout(DrawerLayout drawerLayout) {
            this.openableLayout = drawerLayout;
            return this;
        }

        public final Builder setFallbackOnNavigateUpListener(OnNavigateUpListener onNavigateUpListener) {
            this.fallbackOnNavigateUpListener = onNavigateUpListener;
            return this;
        }

        public final Builder setOpenableLayout(Openable openable) {
            this.openableLayout = openable;
            return this;
        }

        public Builder(Menu topLevelMenu) {
            AbstractC9979u.m20294g(topLevelMenu, "topLevelMenu");
            this.topLevelDestinations = new HashSet();
            int size = topLevelMenu.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.topLevelDestinations.add(Integer.valueOf(topLevelMenu.getItem(i10).getItemId()));
            }
        }

        public Builder(int... topLevelDestinationIds) {
            AbstractC9979u.m20294g(topLevelDestinationIds, "topLevelDestinationIds");
            this.topLevelDestinations = new HashSet();
            for (int i10 : topLevelDestinationIds) {
                this.topLevelDestinations.add(Integer.valueOf(i10));
            }
        }

        public Builder(Set<Integer> topLevelDestinationIds) {
            AbstractC9979u.m20294g(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }
    }
}
