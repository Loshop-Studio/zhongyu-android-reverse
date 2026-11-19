package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.common.C4188R;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p101f8.AbstractC8476n;
import p101f8.InterfaceC8469g;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p246s8.AbstractC10067q;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public class NavDestination {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private final SparseArrayCompat<NavAction> actions;
    private final NavDestinationImpl impl;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
        Class<?> value();
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination _get_hierarchy_$lambda$1(NavDestination it) {
            AbstractC9133u.m16133g(it, "it");
            return it.getParent();
        }

        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String getDisplayName(NavContext context, int i10) {
            AbstractC9133u.m16133g(context, "context");
            return i10 <= 16777215 ? String.valueOf(i10) : context.getResourceName(i10);
        }

        public final InterfaceC8469g getHierarchy(NavDestination navDestination) {
            AbstractC9133u.m16133g(navDestination, "<this>");
            return AbstractC8476n.m13833h(navDestination, new InterfaceC10570l() { // from class: androidx.navigation.x
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj);
                }
            });
        }

        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            AbstractC9133u.m16133g(navDestination, "<this>");
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            return hasRoute(navDestination, AbstractC9137y.m16154b(Object.class));
        }

        public final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            String str;
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            AbstractC9133u.m16130d(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        private Companion() {
        }

        public final <T> boolean hasRoute(NavDestination navDestination, InterfaceC8375c route) {
            AbstractC9133u.m16133g(navDestination, "<this>");
            AbstractC9133u.m16133g(route, "route");
            return RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(route)) == navDestination.getId();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            AbstractC9133u.m16133g(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z10;
            this.matchingPathSegments = i10;
            this.hasMatchingAction = z11;
            this.mimeTypeMatchLevel = i11;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || (bundle2 = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            AbstractC9133u.m16132f(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
                AbstractC9133u.m16130d(str);
                if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, str)) {
                    return false;
                }
                NavArgument navArgument = this.destination.getArguments().get(str);
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                Object obj = type != null ? type.get(this.matchingArgs, str) : null;
                Object obj2 = type != null ? type.get(bundle, str) : null;
                if (type != null && !type.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch other) {
            AbstractC9133u.m16133g(other, "other");
            boolean z10 = this.isExactDeepLink;
            if (z10 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z10 && other.isExactDeepLink) {
                return -1;
            }
            int i10 = this.matchingPathSegments - other.matchingPathSegments;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int iM27309sizeimpl = SavedStateReader.m27309sizeimpl(SavedStateReader.m27229constructorimpl(bundle));
                Bundle bundle2 = other.matchingArgs;
                AbstractC9133u.m16130d(bundle2);
                int iM27309sizeimpl2 = iM27309sizeimpl - SavedStateReader.m27309sizeimpl(SavedStateReader.m27229constructorimpl(bundle2));
                if (iM27309sizeimpl2 > 0) {
                    return 1;
                }
                if (iM27309sizeimpl2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.hasMatchingAction;
            if (z11 && !other.hasMatchingAction) {
                return 1;
            }
            if (z11 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(String navigatorName) {
        AbstractC9133u.m16133g(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String getDisplayName(NavContext navContext, int i10) {
        return Companion.getDisplayName(navContext, i10);
    }

    public static final InterfaceC8469g getHierarchy(NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    private final String getIdName() {
        return this.impl.getIdName$navigation_common_release();
    }

    public static final <T> boolean hasRoute(NavDestination navDestination, InterfaceC8375c interfaceC8375c) {
        return Companion.hasRoute(navDestination, interfaceC8375c);
    }

    public static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common_release(str);
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        AbstractC9133u.m16133g(argumentName, "argumentName");
        AbstractC9133u.m16133g(argument, "argument");
        this.impl.addArgument$navigation_common_release(argumentName, argument);
    }

    public final void addDeepLink(String uriPattern) {
        AbstractC9133u.m16133g(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(Bundle bundle) {
        return this.impl.addInDefaultArgs$navigation_common_release(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[EDGE_INSN: B:31:0x00ae->B:32:0x00af BREAK  A[LOOP:1: B:23:0x007b->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lce
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lce
        Ld:
            java.util.List r2 = r8.getDeepLinks()
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List r3 = r9.getDeepLinks()
            boolean r2 = kotlin.jvm.internal.AbstractC9133u.m16128b(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L5c
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            i7.m0 r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            f8.g r3 = p101f8.AbstractC8476n.m13830e(r3)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.AbstractC9133u.m16128b(r5, r4)
            if (r4 != 0) goto L37
            goto L5c
        L5a:
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map r4 = r8.getArguments()
            int r4 = r4.size()
            java.util.Map r5 = r9.getArguments()
            int r5 = r5.size()
            if (r4 != r5) goto Lae
            java.util.Map r4 = r8.getArguments()
            f8.g r4 = p134i7.AbstractC8802r0.m14747y(r4)
            java.util.Iterator r4 = r4.iterator()
        L7b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lae
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.AbstractC9133u.m16128b(r6, r5)
            if (r5 == 0) goto Lae
            goto L7b
        Lac:
            r4 = r0
            goto Laf
        Lae:
            r4 = r1
        Laf:
            int r5 = r8.getId()
            int r6 = r9.getId()
            if (r5 != r6) goto Lce
            java.lang.String r5 = r8.getRoute()
            java.lang.String r9 = r9.getRoute()
            boolean r9 = kotlin.jvm.internal.AbstractC9133u.m16128b(r5, r9)
            if (r9 == 0) goto Lce
            if (r2 == 0) goto Lce
            if (r3 == 0) goto Lce
            if (r4 == 0) goto Lce
            return r0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public final String fillInLabel(Context context, Bundle bundle) {
        Map<String, Object> mapM15943h;
        String strValueOf;
        AbstractC9133u.m16133g(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (bundle == null || (mapM15943h = SavedStateReader.m27310toMapimpl(SavedStateReader.m27229constructorimpl(bundle))) == null) {
            mapM15943h = AbstractC9080a.m15943h();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapM15943h.containsKey(strGroup)) {
                throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            NavArgument navArgument = getArguments().get(strGroup);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            NavType<Integer> navType = NavType.ReferenceType;
            if (AbstractC9133u.m16128b(type, navType)) {
                AbstractC9133u.m16130d(bundle);
                Integer num = navType.get(bundle, strGroup);
                AbstractC9133u.m16131e(num, "null cannot be cast to non-null type kotlin.Int");
                strValueOf = context.getString(num.intValue());
            } else {
                AbstractC9133u.m16130d(type);
                AbstractC9133u.m16130d(bundle);
                strValueOf = String.valueOf(type.get(bundle, strGroup));
            }
            AbstractC9133u.m16130d(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final NavAction getAction(@IdRes int i10) {
        NavAction navAction = this.actions.getIsEmpty() ? null : this.actions.get(i10);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(i10);
        }
        return null;
    }

    public final Map<String, NavArgument> getArguments() {
        return AbstractC9080a.m15956u(this.impl.getArguments$navigation_common_release());
    }

    @IdRes
    public final int getId() {
        return this.impl.getId$navigation_common_release();
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.impl.getRoute$navigation_common_release();
    }

    public boolean hasDeepLink(Uri deepLink) {
        AbstractC9133u.m16133g(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    public int hashCode() {
        int id = getId() * 31;
        String route = getRoute();
        int iHashCode = id + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            int i10 = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i10 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null) {
                iHashCode = (iHashCode * 31) + SavedStateReader.m27232contentDeepHashCodeimpl(SavedStateReader.m27229constructorimpl(defaultArguments));
            }
        }
        for (String str : getArguments().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            NavArgument navArgument = getArguments().get(str);
            iHashCode = iHashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC9133u.m16133g(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(navDeepLinkRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DeepLinkMatch matchRoute(String route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.matchRoute$navigation_common_release(route);
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attrs) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4188R.styleable.Navigator);
        AbstractC9133u.m16132f(typedArrayObtainAttributes, "obtainAttributes(...)");
        setRoute(typedArrayObtainAttributes.getString(C4188R.styleable.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(C4188R.styleable.Navigator_android_id)) {
            setId(typedArrayObtainAttributes.getResourceId(C4188R.styleable.Navigator_android_id, 0));
            setIdName(Companion.getDisplayName(new NavContext(context), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(C4188R.styleable.Navigator_android_label);
        C8736p c8736p = C8736p.f16368a;
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i10, @IdRes int i11) {
        putAction(i10, new NavAction(i11, null, null, 6, null));
    }

    public final void removeAction(@IdRes int i10) {
        this.actions.remove(i10);
    }

    public final void removeArgument(String argumentName) {
        AbstractC9133u.m16133g(argumentName, "argumentName");
        this.impl.removeArgument$navigation_common_release(argumentName);
    }

    public final void setId(@IdRes int i10) {
        this.impl.setId$navigation_common_release(i10);
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        this.impl.setRoute$navigation_common_release(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (getIdName() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(getId()));
        } else {
            sb.append(getIdName());
        }
        sb.append(")");
        String route = getRoute();
        if (route != null && !AbstractC8661c0.m13993h0(route)) {
            sb.append(" route=");
            sb.append(getRoute());
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        AbstractC9133u.m16133g(navDeepLink, "navDeepLink");
        this.impl.addDeepLink$navigation_common_release(navDeepLink);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] buildDeepLinkIds(androidx.navigation.NavDestination r6) {
        /*
            r5 = this;
            i7.m r0 = new i7.m
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
            androidx.navigation.NavGraph r2 = r1.parent
            if (r6 == 0) goto L10
            androidx.navigation.NavGraph r3 = r6.parent
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L26
            androidx.navigation.NavGraph r3 = r6.parent
            kotlin.jvm.internal.AbstractC9133u.m16130d(r3)
            int r4 = r1.getId()
            androidx.navigation.NavDestination r3 = r3.findNode(r4)
            if (r3 != r1) goto L26
            r0.addFirst(r1)
            goto L3e
        L26:
            if (r2 == 0) goto L32
            int r3 = r2.getStartDestinationId()
            int r4 = r1.getId()
            if (r3 == r4) goto L35
        L32:
            r0.addFirst(r1)
        L35:
            boolean r1 = kotlin.jvm.internal.AbstractC9133u.m16128b(r2, r6)
            if (r1 == 0) goto L3c
            goto L3e
        L3c:
            if (r2 != 0) goto L6e
        L3e:
            java.util.List r6 = p134i7.AbstractC8778f0.m14544U0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p134i7.AbstractC8811w.m14786x(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L51
        L69:
            int[] r6 = p134i7.AbstractC8778f0.m14543T0(r0)
            return r6
        L6e:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.buildDeepLinkIds(androidx.navigation.NavDestination):int[]");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        AbstractC9133u.m16133g(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(String route, Bundle bundle) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.hasRoute$navigation_common_release(route, bundle);
    }

    public final void putAction(@IdRes int i10, NavAction action) {
        AbstractC9133u.m16133g(action, "action");
        if (supportsActions()) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        AbstractC9133u.m16133g(navigator, "navigator");
    }
}
