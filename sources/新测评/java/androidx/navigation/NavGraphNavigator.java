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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;

@Navigator.Name("navigation")
@Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016J*\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m13558d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "createDestination", "navigate", "", "entries", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "entry", "Companion", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n90#2:135\n106#2:156\n90#2:158\n27#3:136\n46#3:137\n32#3,4:138\n31#3,7:148\n126#4:142\n153#4,3:143\n37#5,2:146\n1#6:155\n1#6:157\n*S KotlinDebug\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n*L\n93#1:135\n94#1:156\n107#1:158\n94#1:136\n94#1:137\n94#1:138,4\n94#1:148,7\n94#1:142\n94#1:143,3\n94#1:146,2\n94#1:155\n*E\n"})
/* loaded from: classes3.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    public static final String NAME = "navigation";
    private final NavigatorProvider navigatorProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        super("navigation");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean navigate$lambda$6(Ref.ObjectRef objectRef, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = objectRef.element;
        return t10 == 0 || !SavedStateReader.m24085containsimpl(SavedStateReader.m24084constructorimpl((Bundle) t10), key);
    }

    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.os.Bundle] */
    private final void navigate(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavDestination navDestinationFindNode;
        Pair[] pairArr;
        NavDestination destination = entry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = entry.getArguments();
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
                if (!Intrinsics.areEqual(startDestinationRoute, navDestinationFindNode.getRoute())) {
                    NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindNode.matchRoute(startDestinationRoute);
                    Bundle matchingArgs = deepLinkMatchMatchRoute != null ? deepLinkMatchMatchRoute.getMatchingArgs() : null;
                    if (matchingArgs != null && !SavedStateReader.m24162isEmptyimpl(SavedStateReader.m24084constructorimpl(matchingArgs))) {
                        Map mapEmptyMap = MapsKt.emptyMap();
                        if (mapEmptyMap.isEmpty()) {
                            pairArr = new Pair[0];
                        } else {
                            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                            for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                                arrayList.add(TuplesKt.m13565to((String) entry2.getKey(), entry2.getValue()));
                            }
                            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                        }
                        ?? BundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                        Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(BundleOf);
                        SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, matchingArgs);
                        Bundle bundle = (Bundle) objectRef.element;
                        if (bundle != null) {
                            SavedStateWriter.m24174putAllimpl(bundleM24170constructorimpl, bundle);
                        }
                        objectRef.element = BundleOf;
                    }
                }
                if (!navDestinationFindNode.getArguments().isEmpty()) {
                    List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationFindNode.getArguments(), new Function1() { // from class: androidx.navigation.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(objectRef, (String) obj));
                        }
                    });
                    if (!listMissingRequiredArguments.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationFindNode + ". Missing required arguments [" + listMissingRequiredArguments + ']').toString());
                    }
                }
            }
            this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName()).navigate(CollectionsKt.listOf(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs((Bundle) objectRef.element))), navOptions, navigatorExtras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
    }
}
