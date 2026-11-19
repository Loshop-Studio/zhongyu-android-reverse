package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10976v;
import p379vd.InterfaceC11612u;

@Navigator.Name("navigation")
/* loaded from: classes.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "navigation";
    private final NavigatorProvider navigatorProvider;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        super("navigation");
        AbstractC9979u.m20294g(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean navigate$lambda$6(Ref$ObjectRef ref$ObjectRef, String key) {
        AbstractC9979u.m20294g(key, "key");
        Object obj = ref$ObjectRef.f23402c;
        return obj == null || !SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl((Bundle) obj), key);
    }

    public final InterfaceC11612u getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9979u.m20294g(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination navDestinationFindNode;
        Pair[] pairArr;
        NavDestination destination = navBackStackEntry.getDestination();
        AbstractC9979u.m20292e(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            navDestinationFindNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            navDestinationFindNode = navGraph.getNodes().get(startDestinationId);
        }
        if (navDestinationFindNode != null) {
            if (startDestinationRoute != null) {
                if (!AbstractC9979u.m20289b(startDestinationRoute, navDestinationFindNode.getRoute())) {
                    NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindNode.matchRoute(startDestinationRoute);
                    Bundle matchingArgs = deepLinkMatchMatchRoute != null ? deepLinkMatchMatchRoute.getMatchingArgs() : null;
                    if (matchingArgs != null && !SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(matchingArgs))) {
                        Map mapM20088h = AbstractC9925a.m20088h();
                        if (mapM20088h.isEmpty()) {
                            pairArr = new Pair[0];
                        } else {
                            ArrayList arrayList = new ArrayList(mapM20088h.size());
                            for (Map.Entry entry : mapM20088h.entrySet()) {
                                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
                            }
                            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                        }
                        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
                        SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, matchingArgs);
                        Bundle bundle = (Bundle) ref$ObjectRef.f23402c;
                        if (bundle != null) {
                            SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, bundle);
                        }
                        ref$ObjectRef.f23402c = bundleBundleOf;
                    }
                }
                if (!navDestinationFindNode.getArguments().isEmpty()) {
                    List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationFindNode.getArguments(), new InterfaceC9540l() { // from class: androidx.navigation.a0
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(ref$ObjectRef, (String) obj));
                        }
                    });
                    if (!listMissingRequiredArguments.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationFindNode + ". Missing required arguments [" + listMissingRequiredArguments + ']').toString());
                    }
                }
            }
            this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName()).navigate(AbstractC10976v.m24126e(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs((Bundle) ref$ObjectRef.f23402c))), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
    }
}
