package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.navigation.C2827b;
import androidx.navigation.C2860h;
import androidx.navigation.NavArgument;
import androidx.navigation.NavArgumentKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavUriKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\fH\u0000¢\u0006\u0004\b+\u0010,J'\u00101\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"2\u000e\u0010.\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0000¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010,R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010F\u001a\u00020E2\u0006\u0010F\u001a\u00020E8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00106\u001a\u0004\bL\u00108\"\u0004\bM\u0010,R\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m5110d2 = {"Landroidx/navigation/internal/NavDestinationImpl;", "", "Landroidx/navigation/NavDestination;", "destination", "<init>", "(Landroidx/navigation/NavDestination;)V", "Landroidx/navigation/NavDeepLink;", "deepLink", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "uri", "", "", "Landroidx/navigation/NavArgument;", "arguments", "", "hasRequiredArguments", "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "navDeepLink", "Ld6/s;", "addDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLink;)V", "addDeepLink", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute$navigation_common_release", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "hasRoute$navigation_common_release", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "hasRoute", "argumentName", "argument", "addArgument$navigation_common_release", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "addArgument", "removeArgument$navigation_common_release", "(Ljava/lang/String;)V", "removeArgument", "args", "addInDefaultArgs$navigation_common_release", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "addInDefaultArgs", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "idName", "Ljava/lang/String;", "getIdName$navigation_common_release", "()Ljava/lang/String;", "setIdName$navigation_common_release", "", "deepLinks", "Ljava/util/List;", "getDeepLinks$navigation_common_release", "()Ljava/util/List;", "", "Ljava/util/Map;", "getArguments$navigation_common_release", "()Ljava/util/Map;", "setArguments$navigation_common_release", "(Ljava/util/Map;)V", "", "id", "I", "getId$navigation_common_release", "()I", "setId$navigation_common_release", "(I)V", "getRoute$navigation_common_release", "setRoute$navigation_common_release", "Ld6/e;", "routeDeepLink", "Ld6/e;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDestinationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationImpl.kt\nandroidx/navigation/internal/NavDestinationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,213:1\n1#2:214\n1#2:234\n27#3:215\n46#3:216\n32#3,4:217\n31#3,7:227\n126#4:221\n153#4,3:222\n37#5,2:225\n106#6:235\n106#6:237\n90#6:238\n46#7:236\n*S KotlinDebug\n*F\n+ 1 NavDestinationImpl.kt\nandroidx/navigation/internal/NavDestinationImpl\n*L\n193#1:234\n193#1:215\n193#1:216\n193#1:217,4\n193#1:227,7\n193#1:221\n193#1:222,3\n193#1:225,2\n193#1:235\n198#1:237\n161#1:238\n193#1:236\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDestinationImpl {

    @NotNull
    private Map<String, NavArgument> arguments;

    @NotNull
    private final List<NavDeepLink> deepLinks;

    @NotNull
    private final NavDestination destination;
    private int id;

    @Nullable
    private String idName;

    @Nullable
    private String route;

    @Nullable
    private InterfaceC5429e routeDeepLink;

    public NavDestinationImpl(@NotNull NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        this.destination = destination;
        this.deepLinks = new ArrayList();
        this.arguments = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_route_$lambda$1(NavDeepLink navDeepLink, String key) {
        AbstractC5830k.m5330g(key, "key");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDeepLink _set_route_$lambda$3(String str) {
        return new NavDeepLink.Builder().setUriPattern(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addDeepLink$lambda$4(NavDeepLink navDeepLink, String key) {
        AbstractC5830k.m5330g(key, "key");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(key);
    }

    private final boolean hasRequiredArguments(NavDeepLink deepLink, Uri uri, Map<String, NavArgument> arguments) {
        return NavArgumentKt.missingRequiredArguments(arguments, new C2860h(1, deepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, arguments))).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasRequiredArguments$lambda$7(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        return !SavedStateReader.m13598containsimpl(SavedStateReader.m13597constructorimpl(bundle), key);
    }

    public final void addArgument$navigation_common_release(@NotNull String argumentName, @NotNull NavArgument argument) {
        AbstractC5830k.m5330g(argumentName, "argumentName");
        AbstractC5830k.m5330g(argument, "argument");
        this.arguments.put(argumentName, argument);
    }

    public final void addDeepLink$navigation_common_release(@NotNull NavDeepLink navDeepLink) {
        AbstractC5830k.m5330g(navDeepLink, "navDeepLink");
        List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new C2868g(navDeepLink, 0));
        if (listMissingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this.destination + ".\nFollowing required arguments are missing: " + listMissingRequiredArguments).toString());
    }

    @Nullable
    public final Bundle addInDefaultArgs$navigation_common_release(@Nullable Bundle args) {
        Pair[] pairArr;
        if (args == null && this.arguments.isEmpty()) {
            return null;
        }
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        for (Map.Entry<String, NavArgument> entry2 : this.arguments.entrySet()) {
            entry2.getValue().putDefaultValue(entry2.getKey(), bundleBundleOf);
        }
        if (args != null) {
            SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), args);
            for (Map.Entry<String, NavArgument> entry3 : this.arguments.entrySet()) {
                String key = entry3.getKey();
                NavArgument value = entry3.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.verify(key, bundleBundleOf)) {
                    StringBuilder sbM100y = AbstractC0037f.m100y("Wrong argument type for '", key, "' in argument savedState. ");
                    sbM100y.append(value.getType().getName());
                    sbM100y.append(" expected.");
                    throw new IllegalArgumentException(sbM100y.toString().toString());
                }
            }
        }
        return bundleBundleOf;
    }

    @NotNull
    public final Map<String, NavArgument> getArguments$navigation_common_release() {
        return this.arguments;
    }

    @NotNull
    public final List<NavDeepLink> getDeepLinks$navigation_common_release() {
        return this.deepLinks;
    }

    @NotNull
    public final NavDestination getDestination() {
        return this.destination;
    }

    /* renamed from: getId$navigation_common_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: getIdName$navigation_common_release, reason: from getter */
    public final String getIdName() {
        return this.idName;
    }

    @Nullable
    /* renamed from: getRoute$navigation_common_release, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean hasRoute$navigation_common_release(@NotNull String route, @Nullable Bundle arguments) {
        AbstractC5830k.m5330g(route, "route");
        if (AbstractC5830k.m5325b(this.route, route)) {
            return true;
        }
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute$navigation_common_release = matchRoute$navigation_common_release(route);
        if (AbstractC5830k.m5325b(this.destination, deepLinkMatchMatchRoute$navigation_common_release != null ? deepLinkMatchMatchRoute$navigation_common_release.getDestination() : null)) {
            return deepLinkMatchMatchRoute$navigation_common_release.hasMatchingArgs(arguments);
        }
        return false;
    }

    @Nullable
    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        NavDestination.DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            if (navDeepLink.matches$navigation_common_release(navDeepLinkRequest)) {
                Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this.arguments) : null;
                int iCalculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
                String action = navDeepLinkRequest.getAction();
                boolean z8 = action != null && action.equals(navDeepLink.getAction());
                String mimeType = navDeepLinkRequest.getMimeType();
                int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
                if (matchingArguments == null) {
                    if (z8 || mimeTypeMatchRating > -1) {
                        if (hasRequiredArguments(navDeepLink, uri, this.arguments)) {
                        }
                    }
                }
                NavDestination.DeepLinkMatch deepLinkMatch2 = new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.getIsExactDeepLink(), iCalculateMatchingPathSegments$navigation_common_release, z8, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    @Nullable
    public final NavDestination.DeepLinkMatch matchRoute$navigation_common_release(@NotNull String route) {
        NavDeepLink navDeepLink;
        Uri uriNavUri;
        Bundle matchingArguments;
        AbstractC5830k.m5330g(route, "route");
        InterfaceC5429e interfaceC5429e = this.routeDeepLink;
        if (interfaceC5429e == null || (navDeepLink = (NavDeepLink) interfaceC5429e.getValue()) == null || (matchingArguments = navDeepLink.getMatchingArguments((uriNavUri = NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(route))), this.arguments)) == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.getIsExactDeepLink(), navDeepLink.calculateMatchingPathSegments$navigation_common_release(uriNavUri), false, -1);
    }

    public final void removeArgument$navigation_common_release(@NotNull String argumentName) {
        AbstractC5830k.m5330g(argumentName, "argumentName");
        this.arguments.remove(argumentName);
    }

    public final void setArguments$navigation_common_release(@NotNull Map<String, NavArgument> map) {
        AbstractC5830k.m5330g(map, "<set-?>");
        this.arguments = map;
    }

    public final void setId$navigation_common_release(int i) {
        this.id = i;
        this.idName = null;
    }

    public final void setIdName$navigation_common_release(@Nullable String str) {
        this.idName = str;
    }

    public final void setRoute$navigation_common_release(@Nullable String str) {
        if (str == null) {
            setId$navigation_common_release(0);
        } else {
            if (AbstractC5855p.m5382P(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strCreateRoute = NavDestination.INSTANCE.createRoute(str);
            List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new C2868g(new NavDeepLink.Builder().setUriPattern(strCreateRoute).build(), 1));
            if (!listMissingRequiredArguments.isEmpty()) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Cannot set route \"", str, "\" for destination ");
                sbM100y.append(this.destination);
                sbM100y.append(". Following required arguments are missing: ");
                sbM100y.append(listMissingRequiredArguments);
                throw new IllegalArgumentException(sbM100y.toString().toString());
            }
            this.routeDeepLink = AbstractC5773a.m5117b(new C2827b(strCreateRoute, 1));
            setId$navigation_common_release(strCreateRoute.hashCode());
        }
        this.route = str;
    }
}
