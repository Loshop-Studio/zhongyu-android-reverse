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
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8807u;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10570l;

@Navigator.Name("navigation")
/* loaded from: classes3.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "navigation";
    private final NavigatorProvider navigatorProvider;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        super("navigation");
        AbstractC9133u.m16133g(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean navigate$lambda$6(Ref$ObjectRef ref$ObjectRef, String key) {
        AbstractC9133u.m16133g(key, "key");
        Object obj = ref$ObjectRef.f17473a;
        return obj == null || !SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl((Bundle) obj), key);
    }

    public final InterfaceC9280q getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC9133u.m16133g(entries, "entries");
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
        AbstractC9133u.m16131e(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = navBackStackEntry.getArguments();
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
                if (!AbstractC9133u.m16128b(startDestinationRoute, navDestinationFindNode.getRoute())) {
                    NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindNode.matchRoute(startDestinationRoute);
                    Bundle matchingArgs = deepLinkMatchMatchRoute != null ? deepLinkMatchMatchRoute.getMatchingArgs() : null;
                    if (matchingArgs != null && !SavedStateReader.m27307isEmptyimpl(SavedStateReader.m27229constructorimpl(matchingArgs))) {
                        Map mapM15943h = AbstractC9080a.m15943h();
                        if (mapM15943h.isEmpty()) {
                            pairArr = new Pair[0];
                        } else {
                            ArrayList arrayList = new ArrayList(mapM15943h.size());
                            for (Map.Entry entry : mapM15943h.entrySet()) {
                                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
                            }
                            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                        }
                        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
                        SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, matchingArgs);
                        Bundle bundle = (Bundle) ref$ObjectRef.f17473a;
                        if (bundle != null) {
                            SavedStateWriter.m27319putAllimpl(bundleM27315constructorimpl, bundle);
                        }
                        ref$ObjectRef.f17473a = bundleBundleOf;
                    }
                }
                if (!navDestinationFindNode.getArguments().isEmpty()) {
                    List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationFindNode.getArguments(), new InterfaceC10570l() { // from class: androidx.navigation.a0
                        @Override // p300x7.InterfaceC10570l
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(ref$ObjectRef, (String) obj));
                        }
                    });
                    if (!listMissingRequiredArguments.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationFindNode + ". Missing required arguments [" + listMissingRequiredArguments + ']').toString());
                    }
                }
            }
            this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName()).navigate(AbstractC8807u.m14755e(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs((Bundle) ref$ObjectRef.f17473a))), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
    }
}
