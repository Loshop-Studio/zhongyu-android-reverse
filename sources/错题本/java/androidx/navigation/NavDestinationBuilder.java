package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rBD\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u0012\u001b\u0010\u0013\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0011¢\u0006\u0002\b\u00120\u000f¢\u0006\u0004\b\n\u0010\u0014J.\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J$\u0010 \u001a\u00020\u0018\"\n\b\u0001\u0010\"\u0018\u0001*\u00020\u00032\u0006\u0010#\u001a\u00020\bH\u0087\b¢\u0006\u0004\b$\u0010!J&\u0010 \u001a\u00020\u00182\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b \u0010'JB\u0010 \u001a\u00020\u0018\"\n\b\u0001\u0010\"\u0018\u0001*\u00020\u00032\u0006\u0010#\u001a\u00020\b2\u0019\b\b\u0010&\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJF\u0010 \u001a\u00020\u0018\"\b\b\u0001\u0010\"*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010#\u001a\u00020\b2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b \u0010(J\u0015\u0010 \u001a\u00020\u00182\u0006\u0010&\u001a\u00020)¢\u0006\u0004\b \u0010*J0\u0010.\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00062\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00028\u0000H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00101R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010<R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020)0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020I0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, m5110d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/Navigator;", "navigator", "", "id", "", "route", "<init>", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "(Landroidx/navigation/Navigator;I)V", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/Navigator;Ly6/c;Ljava/util/Map;)V", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "argumentBuilder", "argument", "(Ljava/lang/String;Lr6/c;)V", "Landroidx/navigation/NavArgument;", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "uriPattern", "deepLink", "(Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "basePath", "deepLinkSafeArgs", "Landroidx/navigation/NavDeepLinkDslBuilder;", "navDeepLink", "(Lr6/c;)V", "(Ly6/c;Ljava/lang/String;Lr6/c;)V", "Landroidx/navigation/NavDeepLink;", "(Landroidx/navigation/NavDeepLink;)V", "actionId", "Landroidx/navigation/NavActionBuilder;", "actionBuilder", "action", "(ILr6/c;)V", "instantiateDestination", "()Landroidx/navigation/NavDestination;", "build", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "I", "getId", "()I", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "Ljava/util/Map;", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "arguments", "", "deepLinks", "Ljava/util/List;", "Landroidx/navigation/NavAction;", "actions", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n1863#2,2:222\n1863#2,2:224\n1863#2,2:228\n216#3,2:226\n216#3,2:230\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n70#1:222,2\n143#1:224,2\n179#1:228,2\n178#1:226,2\n180#1:230,2\n*E\n"})
/* loaded from: classes2.dex */
public class NavDestinationBuilder<D extends NavDestination> {

    @NotNull
    private Map<Integer, NavAction> actions;

    @NotNull
    private Map<String, NavArgument> arguments;

    @NotNull
    private List<NavDeepLink> deepLinks;
    private final int id;

    @Nullable
    private CharSequence label;

    @NotNull
    private final Navigator<? extends D> navigator;

    @Nullable
    private final String route;
    private Map<InterfaceC6793q, ? extends NavType<?>> typeMap;

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = 176)
    /* renamed from: androidx.navigation.NavDestinationBuilder$deepLink$1 */
    public static final class C28231 implements InterfaceC6471c {
        public static final C28231 INSTANCE = new C28231();

        public final void invoke(NavDeepLinkDslBuilder deepLink) {
            AbstractC5830k.m5330g(deepLink, "$this$deepLink");
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavDeepLinkDslBuilder) obj);
            return C5443s.f8405a;
        }
    }

    public NavDestinationBuilder(@NotNull Navigator<? extends D> navigator, @IdRes int i, @Nullable String str) {
        AbstractC5830k.m5330g(navigator, "navigator");
        this.navigator = navigator;
        this.id = i;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @Deprecated(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int actionId, @NotNull InterfaceC6471c actionBuilder) {
        AbstractC5830k.m5330g(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer numValueOf = Integer.valueOf(actionId);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(@NotNull String name, @NotNull InterfaceC6471c argumentBuilder) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    @NotNull
    public D build() {
        D d9 = (D) instantiateDestination();
        d9.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            d9.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d9.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            d9.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d9.setRoute(str);
        }
        int i = this.id;
        if (i != -1) {
            d9.setId(i);
        }
        return d9;
    }

    public final void deepLink(@NotNull String uriPattern) {
        AbstractC5830k.m5330g(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    @JvmName(name = "deepLinkSafeArgs")
    public final <T> void deepLinkSafeArgs(String basePath) {
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5338o();
        throw null;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.label;
    }

    @NotNull
    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    @Nullable
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public D instantiateDestination() {
        return (D) this.navigator.createDestination();
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(@NotNull String name, @NotNull NavArgument argument) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(argument, "argument");
        this.arguments.put(name, argument);
    }

    public final void deepLink(@NotNull InterfaceC6471c navDeepLink) {
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final <T> void deepLink(@NotNull InterfaceC6779c route, @NotNull String basePath, @NotNull InterfaceC6471c navDeepLink) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        if (this.typeMap != null) {
            InterfaceC5686b interfaceC5686bM6453r = AbstractC6768a.m6453r(route);
            Map<InterfaceC6793q, ? extends NavType<?>> map = this.typeMap;
            if (map != null) {
                for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC5686bM6453r, map)) {
                    NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
                    if (navArgument == null || !AbstractC5830k.m5325b(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                        throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + namedNavArgument.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
                    }
                }
                Map<InterfaceC6793q, ? extends NavType<?>> map2 = this.typeMap;
                if (map2 != null) {
                    deepLink(NavDeepLinkDslBuilderKt.navDeepLink(route, basePath, map2, navDeepLink));
                    return;
                } else {
                    AbstractC5830k.m5339p("typeMap");
                    throw null;
                }
            }
            AbstractC5830k.m5339p("typeMap");
            throw null;
        }
        throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavDestination instead", replaceWith = @ReplaceWith(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@NotNull Navigator<? extends D> navigator, @IdRes int i) {
        this(navigator, i, (String) null);
        AbstractC5830k.m5330g(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(@NotNull Navigator<? extends D> navigator, @Nullable String str) {
        this(navigator, -1, str);
        AbstractC5830k.m5330g(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(@NotNull Navigator<? extends D> navigator, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
        this(navigator, interfaceC6779c != null ? RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(interfaceC6779c)) : -1, interfaceC6779c != null ? RouteSerializerKt.generateRoutePattern$default(AbstractC6768a.m6453r(interfaceC6779c), typeMap, null, 2, null) : null);
        AbstractC5830k.m5330g(navigator, "navigator");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        if (interfaceC6779c != null) {
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(AbstractC6768a.m6453r(interfaceC6779c), typeMap)) {
                this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
            }
        }
        this.typeMap = typeMap;
    }

    public final void deepLink(@NotNull NavDeepLink navDeepLink) {
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }

    public final <T> void deepLink(String basePath, InterfaceC6471c navDeepLink) {
        AbstractC5830k.m5330g(basePath, "basePath");
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        AbstractC5830k.m5338o();
        throw null;
    }
}
