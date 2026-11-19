package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateReader;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.TaskStackBuilder;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.C5801p;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125n7.C6237l;
import p214z6.AbstractC6833k;
import p214z6.C6827e;
import p214z6.C6828f;
import p214z6.C6837o;

@Metadata(m5109d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002EFB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00002\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ+\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b#\u0010'J+\u0010(\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b(\u0010$J)\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020%2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b(\u0010'J\u001d\u0010*\u001a\u00020\u00002\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010C\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, m5110d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "navController", "(Landroidx/navigation/NavController;)V", "", "destId", "Landroidx/navigation/NavDestination;", "findDestination", "(I)Landroidx/navigation/NavDestination;", "Ld6/s;", "verifyAllDestinations", "()V", "fillInIntent", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "setComponentName", "(Ljava/lang/Class;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/content/ComponentName;", "componentName", "(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;", "navGraphId", "setGraph", "(I)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/navigation/NavGraph;", "navGraph", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "setDestination", "(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "", "destRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "addDestination", "route", "setArguments", "(Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/core/app/TaskStackBuilder;", "createTaskStackBuilder", "()Landroidx/core/app/TaskStackBuilder;", "Landroid/app/PendingIntent;", "createPendingIntent", "()Landroid/app/PendingIntent;", "Landroid/content/Context;", "Landroidx/navigation/internal/NavContext;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "activity", "Landroid/app/Activity;", "Landroid/content/Intent;", "intent", "Landroid/content/Intent;", "graph", "Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "destinations", "Ljava/util/List;", "globalArgs", "Landroid/os/Bundle;", "DeepLinkDestination", "PermissiveNavigatorProvider", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDeepLinkBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.android.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,394:1\n1#2:395\n90#3:396\n90#3:397\n*S KotlinDebug\n*F\n+ 1 NavDeepLinkBuilder.android.kt\nandroidx/navigation/NavDeepLinkBuilder\n*L\n338#1:396\n342#1:397\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder {

    @Nullable
    private final Activity activity;

    @NotNull
    private final Context context;

    @NotNull
    private final List<DeepLinkDestination> destinations;

    @Nullable
    private Bundle globalArgs;

    @Nullable
    private NavGraph graph;

    @NotNull
    private final Intent intent;

    @NotNull
    private final NavContext navContext;

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "destinationId", "", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "(ILandroid/os/Bundle;)V", "getDestinationId", "()I", "getArguments", "()Landroid/os/Bundle;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DeepLinkDestination {

        @Nullable
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i, @Nullable Bundle bundle) {
            this.destinationId = i;
            this.arguments = bundle;
        }

        @Nullable
        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m5110d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "<init>", "()V", "mDestNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "getNavigator", ExifInterface.GPS_DIRECTION_TRUE, HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {

        @NotNull
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination destination, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
                AbstractC5830k.m5330g(destination, "destination");
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
        @NotNull
        public <T extends Navigator<? extends NavDestination>> T getNavigator(@NotNull String name) {
            AbstractC5830k.m5330g(name, "name");
            try {
                return (T) super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                AbstractC5830k.m5328e(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(@NotNull Context context) {
        Intent launchIntentForPackage;
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
        this.navContext = new NavContext(context);
        C6827e c6827e = new C6827e(new C6828f(new C6837o(AbstractC6833k.m6495v(context, new C2826a(5)), new C2826a(6), 1), false, new C6237l(29)));
        Activity activity = (Activity) (!c6827e.hasNext() ? null : c6827e.next());
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
        AbstractC5830k.m5330g(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity activity$lambda$1(Context it) {
        AbstractC5830k.m5330g(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i, bundle);
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
                StringBuilder sbM100y = AbstractC0037f.m100y("Navigation destination ", NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId), " cannot be found in the navigation graph ");
                sbM100y.append(this.graph);
                throw new IllegalArgumentException(sbM100y.toString());
            }
            for (int i : navDestinationFindDestination.buildDeepLinkIds(navDestination)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(arguments);
            }
            navDestination = navDestinationFindDestination;
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, AbstractC5805t.m5216C0(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(@IdRes int destId) {
        C5801p c5801p = new C5801p();
        NavGraph navGraph = this.graph;
        AbstractC5830k.m5327d(navGraph);
        c5801p.addLast(navGraph);
        while (!c5801p.isEmpty()) {
            NavDestination navDestination = (NavDestination) c5801p.removeFirst();
            if (navDestination.getId() == destId) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    c5801p.addLast(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i, bundle);
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Navigation destination ", NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId), " cannot be found in the navigation graph ");
                sbM100y.append(this.graph);
                throw new IllegalArgumentException(sbM100y.toString());
            }
        }
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int i) {
        return addDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final PendingIntent createPendingIntent() {
        Bundle bundle = this.globalArgs;
        int iM13600contentDeepHashCodeimpl = bundle != null ? SavedStateReader.m13600contentDeepHashCodeimpl(SavedStateReader.m13597constructorimpl(bundle)) : 0;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            iM13600contentDeepHashCodeimpl = (iM13600contentDeepHashCodeimpl * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            Integer numValueOf = arguments != null ? Integer.valueOf(SavedStateReader.m13600contentDeepHashCodeimpl(SavedStateReader.m13597constructorimpl(arguments))) : null;
            if (numValueOf != null) {
                iM13600contentDeepHashCodeimpl = (iM13600contentDeepHashCodeimpl * 31) + numValueOf.intValue();
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(iM13600contentDeepHashCodeimpl, 201326592);
        AbstractC5830k.m5327d(pendingIntent);
        return pendingIntent;
    }

    @NotNull
    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        fillInIntent();
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
        AbstractC5830k.m5329f(taskStackBuilderAddNextIntentWithParentStack, "addNextIntentWithParentStack(...)");
        int intentCount = taskStackBuilderAddNextIntentWithParentStack.getIntentCount();
        for (int i = 0; i < intentCount; i++) {
            Intent intentEditIntentAt = taskStackBuilderAddNextIntentWithParentStack.editIntentAt(i);
            if (intentEditIntentAt != null) {
                intentEditIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
            }
        }
        return taskStackBuilderAddNextIntentWithParentStack;
    }

    @NotNull
    /* renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    @NotNull
    public final NavDeepLinkBuilder setArguments(@Nullable Bundle args) {
        this.globalArgs = args;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, args);
        return this;
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull Class<? extends Activity> activityClass) {
        AbstractC5830k.m5330g(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int i) {
        return setDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NavigationRes int navGraphId) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(navGraphId));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull ComponentName componentName) {
        AbstractC5830k.m5330g(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String destRoute) {
        AbstractC5830k.m5330g(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NotNull NavGraph navGraph) {
        AbstractC5830k.m5330g(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int destId, @Nullable Bundle args) {
        this.destinations.add(new DeepLinkDestination(destId, args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int destId, @Nullable Bundle args) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(destId, args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String route, @Nullable Bundle args) {
        AbstractC5830k.m5330g(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.INSTANCE.createRoute(route).hashCode(), args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String destRoute, @Nullable Bundle args) {
        AbstractC5830k.m5330g(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.INSTANCE.createRoute(destRoute).hashCode(), args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(@NotNull NavController navController) {
        this(navController.getContext());
        AbstractC5830k.m5330g(navController, "navController");
        this.graph = navController.getGraph();
    }
}
