package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fBH\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\r\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0004\b\b\u0010\u0013BD\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0014\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0004\b\b\u0010\u0015J%\u0010\u001a\u001a\u00020\u0019\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0019*\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "provider", "", "id", "startDestination", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;)V", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;)V", "Landroidx/navigation/NavDestination;", "D", "navDestination", "Ld6/s;", "destination", "(Landroidx/navigation/NavDestinationBuilder;)V", "unaryPlus", "(Landroidx/navigation/NavDestination;)V", "addDestination", "build", "()Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "startDestinationId", "I", "startDestinationRoute", "Ljava/lang/String;", "startDestinationClass", "Ly6/c;", "startDestinationObject", "Ljava/lang/Object;", "", "destinations", "Ljava/util/List;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavGraphBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,175:1\n115#2:176\n115#2:177\n115#2:178\n115#2:179\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilder\n*L\n100#1:176\n109#1:177\n119#1:178\n129#1:179\n*E\n"})
/* loaded from: classes2.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    @NotNull
    private final List<NavDestination> destinations;

    @NotNull
    private final NavigatorProvider provider;

    @Nullable
    private InterfaceC6779c startDestinationClass;

    @IdRes
    private int startDestinationId;

    @Nullable
    private Object startDestinationObject;

    @Nullable
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@NotNull NavigatorProvider provider, @IdRes int i, @IdRes int i8) {
        super(provider.getNavigator(NavGraphNavigator.class), i);
        AbstractC5830k.m5330g(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String build$lambda$1$lambda$0(NavDestination it) {
        AbstractC5830k.m5330g(it, "it");
        String route = it.getRoute();
        AbstractC5830k.m5327d(route);
        return route;
    }

    public final void addDestination(@NotNull NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(@NotNull NavDestinationBuilder<? extends D> navDestination) {
        AbstractC5830k.m5330g(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    @NotNull
    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(@NotNull NavDestination navDestination) {
        AbstractC5830k.m5330g(navDestination, "<this>");
        addDestination(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i = this.startDestinationId;
        if (i == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            AbstractC5830k.m5327d(str);
            navGraph.setStartDestination(str);
            return navGraph;
        }
        InterfaceC6779c interfaceC6779c = this.startDestinationClass;
        if (interfaceC6779c != null) {
            AbstractC5830k.m5327d(interfaceC6779c);
            navGraph.setStartDestination(AbstractC6768a.m6453r(interfaceC6779c), new C2826a(9));
            return navGraph;
        }
        Object obj = this.startDestinationObject;
        if (obj == null) {
            navGraph.setStartDestination(i);
            return navGraph;
        }
        AbstractC5830k.m5327d(obj);
        navGraph.setStartDestination(obj);
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@NotNull NavigatorProvider provider, @NotNull String startDestination, @Nullable String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        AbstractC5830k.m5330g(provider, "provider");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@NotNull NavigatorProvider provider, @NotNull InterfaceC6779c startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC6779c, typeMap);
        AbstractC5830k.m5330g(provider, "provider");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationClass = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@NotNull NavigatorProvider provider, @NotNull Object startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC6779c, typeMap);
        AbstractC5830k.m5330g(provider, "provider");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationObject = startDestination;
    }
}
