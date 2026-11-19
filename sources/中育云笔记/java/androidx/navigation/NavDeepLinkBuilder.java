package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.savedstate.SavedStateReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10666n;
import p296pd.AbstractC10669q;
import p325rc.AbstractC10947g0;
import p325rc.C10958m;

/* loaded from: classes.dex */
public final class NavDeepLinkBuilder {
    private final Activity activity;
    private final Context context;
    private final List<DeepLinkDestination> destinations;
    private Bundle globalArgs;
    private NavGraph graph;
    private final Intent intent;
    private final NavContext navContext;

    public static final class DeepLinkDestination {
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i10, Bundle bundle) {
            this.destinationId = i10;
            this.arguments = bundle;
        }

        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    public static final class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                AbstractC9979u.m20294g(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        public <T extends Navigator<? extends NavDestination>> T getNavigator(String name) {
            AbstractC9979u.m20294g(name, "name");
            try {
                return (T) super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                AbstractC9979u.m20292e(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(Context context) {
        Intent launchIntentForPackage;
        AbstractC9979u.m20294g(context, "context");
        this.context = context;
        this.navContext = new NavContext(context);
        Activity activity = (Activity) AbstractC10669q.m22584v(AbstractC10669q.m22571C(AbstractC10666n.m22565i(context, new InterfaceC9540l() { // from class: androidx.navigation.v
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$0((Context) obj);
            }
        }), new InterfaceC9540l() { // from class: androidx.navigation.w
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$1((Context) obj);
            }
        }));
        this.activity = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$0(Context it) {
        AbstractC9979u.m20294g(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity activity$lambda$1(Context it) {
        AbstractC9979u.m20294g(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i10, bundle);
    }

    private final void fillInIntent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination navDestinationFindDestination = findDestination(destinationId);
            if (navDestinationFindDestination == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.navContext, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
            for (int i10 : navDestinationFindDestination.buildDeepLinkIds(navDestination)) {
                arrayList.add(Integer.valueOf(i10));
                arrayList2.add(arguments);
            }
            navDestination = navDestinationFindDestination;
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, AbstractC10947g0.m23921W0(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(@IdRes int i10) {
        C10958m c10958m = new C10958m();
        NavGraph navGraph = this.graph;
        AbstractC9979u.m20291d(navGraph);
        c10958m.add(navGraph);
        while (!c10958m.isEmpty()) {
            NavDestination navDestination = (NavDestination) c10958m.removeFirst();
            if (navDestination.getId() == i10) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    c10958m.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i10, bundle);
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.navContext, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    public final NavDeepLinkBuilder addDestination(@IdRes int i10) {
        return addDestination$default(this, i10, (Bundle) null, 2, (Object) null);
    }

    public final PendingIntent createPendingIntent() {
        Bundle bundle = this.globalArgs;
        int iM33827contentDeepHashCodeimpl = bundle != null ? SavedStateReader.m33827contentDeepHashCodeimpl(SavedStateReader.m33824constructorimpl(bundle)) : 0;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            iM33827contentDeepHashCodeimpl = (iM33827contentDeepHashCodeimpl * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            Integer numValueOf = arguments != null ? Integer.valueOf(SavedStateReader.m33827contentDeepHashCodeimpl(SavedStateReader.m33824constructorimpl(arguments))) : null;
            if (numValueOf != null) {
                iM33827contentDeepHashCodeimpl = (iM33827contentDeepHashCodeimpl * 31) + numValueOf.intValue();
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(iM33827contentDeepHashCodeimpl, 201326592);
        AbstractC9979u.m20291d(pendingIntent);
        return pendingIntent;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        fillInIntent();
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
        AbstractC9979u.m20293f(taskStackBuilderAddNextIntentWithParentStack, "addNextIntentWithParentStack(...)");
        int intentCount = taskStackBuilderAddNextIntentWithParentStack.getIntentCount();
        for (int i10 = 0; i10 < intentCount; i10++) {
            Intent intentEditIntentAt = taskStackBuilderAddNextIntentWithParentStack.editIntentAt(i10);
            if (intentEditIntentAt != null) {
                intentEditIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
            }
        }
        return taskStackBuilderAddNextIntentWithParentStack;
    }

    public final NavContext getNavContext$navigation_runtime_release() {
        return this.navContext;
    }

    public final NavDeepLinkBuilder setArguments(Bundle bundle) {
        this.globalArgs = bundle;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> activityClass) {
        AbstractC9979u.m20294g(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    public final NavDeepLinkBuilder setDestination(@IdRes int i10) {
        return setDestination$default(this, i10, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setGraph(@NavigationRes int i10) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(i10));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    public final NavDeepLinkBuilder addDestination(String route) {
        AbstractC9979u.m20294g(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName componentName) {
        AbstractC9979u.m20294g(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String destRoute) {
        AbstractC9979u.m20294g(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setGraph(NavGraph navGraph) {
        AbstractC9979u.m20294g(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    public final NavDeepLinkBuilder addDestination(@IdRes int i10, Bundle bundle) {
        this.destinations.add(new DeepLinkDestination(i10, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(@IdRes int i10, Bundle bundle) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(i10, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder addDestination(String route, Bundle bundle) {
        AbstractC9979u.m20294g(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(route).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String destRoute, Bundle bundle) {
        AbstractC9979u.m20294g(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(destRoute).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        AbstractC9979u.m20294g(navController, "navController");
        this.graph = navController.getGraph();
    }
}
