package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p113g8.C8670i;
import p113g8.InterfaceC8672k;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p246s8.AbstractC10067q;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavDeepLink {
    private static final String ANY_SYMBOLS_IN_THE_TAIL = "([\\s\\S]+?)?";
    private final String action;
    private final InterfaceC8724d fragArgs$delegate;
    private final InterfaceC8724d fragArgsAndRegex$delegate;
    private final InterfaceC8724d fragPattern$delegate;
    private final InterfaceC8724d fragRegex$delegate;
    private boolean isExactDeepLink;
    private final InterfaceC8724d isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private final InterfaceC8724d mimeTypePattern$delegate;
    private String mimeTypeRegex;
    private final List<String> pathArgs;
    private final InterfaceC8724d pathPattern$delegate;
    private String pathRegex;
    private final InterfaceC8724d queryArgsMap$delegate;
    private final String uriPattern;
    private static final Companion Companion = new Companion(null);
    private static final Regex SCHEME_PATTERN = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Regex FILL_IN_PATTERN = new Regex("\\{(.+?)\\}");
    private static final Regex SCHEME_REGEX = new Regex("http[s]?://");
    private static final Regex WILDCARD_REGEX = new Regex(".*");
    private static final Regex PATH_REGEX = new Regex("([^/]*?|)");
    private static final Regex QUERY_PATTERN = new Regex("^[^?#]+\\?([^#]*).*");

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Builder fromUriPattern$default(Companion companion, String basePath, Map typeMap, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    typeMap = AbstractC9080a.m15943h();
                }
                AbstractC9133u.m16133g(basePath, "basePath");
                AbstractC9133u.m16133g(typeMap, "typeMap");
                Builder builder = new Builder();
                AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(AbstractC9137y.m16154b(Object.class), basePath, typeMap);
                return builder;
            }

            public final Builder fromAction(String action) {
                AbstractC9133u.m16133g(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            public final Builder fromMimeType(String mimeType) {
                AbstractC9133u.m16133g(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUriPattern(String uriPattern) {
                AbstractC9133u.m16133g(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            private Companion() {
            }

            public final /* synthetic */ <T> Builder fromUriPattern(String basePath, Map<InterfaceC8387o, NavType<?>> typeMap) {
                AbstractC9133u.m16133g(basePath, "basePath");
                AbstractC9133u.m16133g(typeMap, "typeMap");
                Builder builder = new Builder();
                AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(AbstractC9137y.m16154b(Object.class), basePath, typeMap);
                return builder;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUriPattern(String str) {
            return Companion.fromUriPattern(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String basePath, Map typeMap, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                typeMap = AbstractC9080a.m15943h();
            }
            AbstractC9133u.m16133g(basePath, "basePath");
            AbstractC9133u.m16133g(typeMap, "typeMap");
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            return builder.setUriPattern(AbstractC9137y.m16154b(Object.class), basePath, typeMap);
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            AbstractC9133u.m16133g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            AbstractC9133u.m16133g(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final <T> Builder setUriPattern(InterfaceC8375c route, String basePath) {
            AbstractC9133u.m16133g(route, "route");
            AbstractC9133u.m16133g(basePath, "basePath");
            return setUriPattern$default(this, route, basePath, null, 4, null);
        }

        public final Builder setUriPattern(String uriPattern) {
            AbstractC9133u.m16133g(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }

        public final /* synthetic */ <T> Builder setUriPattern(String basePath, Map<InterfaceC8387o, NavType<?>> typeMap) {
            AbstractC9133u.m16133g(basePath, "basePath");
            AbstractC9133u.m16133g(typeMap, "typeMap");
            AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
            return setUriPattern(AbstractC9137y.m16154b(Object.class), basePath, typeMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, InterfaceC8375c interfaceC8375c, String str, Map map, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                map = AbstractC9080a.m15943h();
            }
            return builder.setUriPattern(interfaceC8375c, str, map);
        }

        public final <T> Builder setUriPattern(InterfaceC8375c route, String basePath, Map<InterfaceC8387o, NavType<?>> typeMap) {
            AbstractC9133u.m16133g(route, "route");
            AbstractC9133u.m16133g(basePath, "basePath");
            AbstractC9133u.m16133g(typeMap, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(AbstractC10067q.m18778b(route), typeMap, basePath);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String mimeType) {
            List listM14771n;
            AbstractC9133u.m16133g(mimeType, "mimeType");
            List listM16185l = new Regex("/").m16185l(mimeType, 0);
            if (listM16185l.isEmpty()) {
                listM14771n = AbstractC8809v.m14771n();
            } else {
                ListIterator listIterator = listM16185l.listIterator(listM16185l.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM14771n = AbstractC8778f0.m14537N0(listM16185l, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM14771n = AbstractC8809v.m14771n();
            }
            this.type = (String) listM14771n.get(0);
            this.subType = (String) listM14771n.get(1);
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            AbstractC9133u.m16133g(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            AbstractC9133u.m16133g(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType other) {
            AbstractC9133u.m16133g(other, "other");
            int i10 = AbstractC9133u.m16128b(this.type, other.type) ? 2 : 0;
            return AbstractC9133u.m16128b(this.subType, other.subType) ? i10 + 1 : i10;
        }
    }

    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String name) {
            AbstractC9133u.m16133g(name, "name");
            this.arguments.add(name);
        }

        public final String getArgumentName(int i10) {
            return this.arguments.get(i10);
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        this.pathPattern$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.l
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavDeepLink.pathPattern_delegate$lambda$1(this.f1799a);
            }
        });
        this.isParameterizedQuery$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.m
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1800a));
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        this.queryArgsMap$delegate = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: androidx.navigation.n
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return this.f1801a.parseQuery();
            }
        });
        this.fragArgsAndRegex$delegate = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: androidx.navigation.o
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return this.f1802a.parseFragment();
            }
        });
        this.fragArgs$delegate = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: androidx.navigation.p
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavDeepLink.fragArgs_delegate$lambda$5(this.f1803a);
            }
        });
        this.fragRegex$delegate = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: androidx.navigation.q
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavDeepLink.fragRegex_delegate$lambda$6(this.f1804a);
            }
        });
        this.fragPattern$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.s
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavDeepLink.fragPattern_delegate$lambda$8(this.f1805a);
            }
        });
        this.mimeTypePattern$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.navigation.t
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1815a);
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb) {
        int iM13497c = 0;
        for (InterfaceC8672k interfaceC8672kM16175c = Regex.m16175c(FILL_IN_PATTERN, str, 0, 2, null); interfaceC8672kM16175c != null; interfaceC8672kM16175c = interfaceC8672kM16175c.next()) {
            C8670i c8670i = interfaceC8672kM16175c.mo14056c().get(1);
            AbstractC9133u.m16130d(c8670i);
            list.add(c8670i.m14053b());
            if (interfaceC8672kM16175c.mo14055b().m13496b() > iM13497c) {
                Regex.C9140a c9140a = Regex.f17511b;
                String strSubstring = str.substring(iM13497c, interfaceC8672kM16175c.mo14055b().m13496b());
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
                sb.append(c9140a.m16188c(strSubstring));
            }
            sb.append(PATH_REGEX.m16178d());
            iM13497c = interfaceC8672kM16175c.mo14055b().m13497c() + 1;
        }
        if (iM13497c < str.length()) {
            Regex.C9140a c9140a2 = Regex.f17511b;
            String strSubstring2 = str.substring(iM13497c);
            AbstractC9133u.m16132f(strSubstring2, "substring(...)");
            sb.append(c9140a2.m16188c(strSubstring2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragArgs_delegate$lambda$5(NavDeepLink navDeepLink) {
        List list;
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.m15906e()) == null) ? new ArrayList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex fragPattern_delegate$lambda$8(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new Regex(fragRegex, RegexOption.f17516c);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fragRegex_delegate$lambda$6(NavDeepLink navDeepLink) {
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.m15907g();
        }
        return null;
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    private final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex$delegate.getValue();
    }

    private final Regex getFragPattern() {
        return (Regex) this.fragPattern$delegate.getValue();
    }

    private final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchingArguments$lambda$13(Bundle bundle, String argName) {
        AbstractC9133u.m16133g(argName, "argName");
        return !SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), argName);
    }

    private final boolean getMatchingPathArguments(InterfaceC8672k interfaceC8672k, Bundle bundle, Map<String, NavArgument> map) {
        String strM14053b;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            String str = (String) obj;
            C8670i c8670i = interfaceC8672k.mo14056c().get(i11);
            String strDecode = (c8670i == null || (strM14053b = c8670i.m14053b()) == null) ? null : NavUriUtils.INSTANCE.decode(strM14053b);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str, strDecode, map.get(str));
                arrayList.add(C8736p.f16368a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !AbstractC9133u.m16128b(query, uri.toString())) {
                queryParameters = AbstractC8807u.m14755e(query);
            }
            if (!parseInputParams(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        InterfaceC8672k interfaceC8672kM16180g;
        String strM14053b;
        Regex fragPattern = getFragPattern();
        if (fragPattern == null || (interfaceC8672kM16180g = fragPattern.m16180g(String.valueOf(str))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(fragArgs, 10));
        int i10 = 0;
        for (Object obj : fragArgs) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            String str2 = (String) obj;
            C8670i c8670i = interfaceC8672kM16180g.mo14056c().get(i11);
            String strDecode = (c8670i == null || (strM14053b = c8670i.m14053b()) == null) ? null : NavUriUtils.INSTANCE.decode(strM14053b);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str2, strDecode, map.get(str2));
                arrayList.add(C8736p.f16368a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Regex getMimeTypePattern() {
        return (Regex) this.mimeTypePattern$delegate.getValue();
    }

    private final Regex getPathPattern() {
        return (Regex) this.pathPattern$delegate.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isParameterizedQuery_delegate$lambda$2(NavDeepLink navDeepLink) {
        String str = navDeepLink.uriPattern;
        return str != null && QUERY_PATTERN.m16181h(str);
    }

    private final boolean matchAction(String str) {
        String str2 = this.action;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return AbstractC9133u.m16128b(str2, str);
    }

    private final boolean matchMimeType(String str) {
        if (this.mimeType == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC9133u.m16130d(mimeTypePattern);
        return mimeTypePattern.m16181h(str);
    }

    private final boolean matchUri(Uri uri) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Regex pathPattern = getPathPattern();
        AbstractC9133u.m16130d(pathPattern);
        return pathPattern.m16181h(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex mimeTypePattern_delegate$lambda$10(NavDeepLink navDeepLink) {
        String str = navDeepLink.mimeTypeRegex;
        if (str != null) {
            return new Regex(str);
        }
        return null;
    }

    private final void parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
        } else {
            SavedStateWriter.m27348putStringimpl(SavedStateWriter.m27315constructorimpl(bundle), str, str2);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), str)) {
            return true;
        }
        if (navArgument == null) {
            return false;
        }
        NavType<Object> type = navArgument.getType();
        type.parseAndPut(bundle, str, str2, type.get(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str == null) {
            return null;
        }
        NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
        if (navUriUtils.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = navUriUtils.parse(this.uriPattern).getFragment();
        StringBuilder sb = new StringBuilder();
        AbstractC9133u.m16130d(fragment);
        buildRegex(fragment, arrayList, sb);
        return AbstractC8726f.m14230a(arrayList, sb.toString());
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        Pair[] pairArr;
        Object objValueOf;
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
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        Iterator<T> it = paramQuery.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = map.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.isDefaultValuePresent()) {
                CollectionNavType collectionNavType = (CollectionNavType) type;
                collectionNavType.put(bundleBundleOf, str, collectionNavType.emptyCollection());
            }
        }
        for (String str2 : list) {
            String paramRegex = paramQuery.getParamRegex();
            InterfaceC8672k interfaceC8672kM16180g = paramRegex != null ? new Regex(paramRegex).m16180g(str2) : null;
            if (interfaceC8672kM16180g == null) {
                return false;
            }
            List<String> arguments = paramQuery.getArguments();
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arguments, 10));
            int i10 = 0;
            for (Object obj : arguments) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
                }
                String str3 = (String) obj;
                C8670i c8670i = interfaceC8672kM16180g.mo14056c().get(i11);
                String strM14053b = c8670i != null ? c8670i.m14053b() : null;
                if (strM14053b == null) {
                    strM14053b = "";
                }
                NavArgument navArgument2 = map.get(str3);
                try {
                    if (SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundleBundleOf), str3)) {
                        objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, strM14053b, navArgument2));
                    } else {
                        parseArgument(bundleBundleOf, str3, strM14053b, navArgument2);
                        objValueOf = C8736p.f16368a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = C8736p.f16368a;
                }
                arrayList2.add(objValueOf);
                i10 = i11;
            }
        }
        SavedStateWriter.m27319putAllimpl(SavedStateWriter.m27315constructorimpl(bundle), bundleBundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").m16181h(this.mimeType)) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        this.mimeTypeRegex = AbstractC8687z.m14101I("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.m16176a(this.uriPattern)) {
            sb.append(SCHEME_REGEX.m16178d());
        }
        boolean z10 = false;
        InterfaceC8672k interfaceC8672kM16175c = Regex.m16175c(new Regex("(\\?|#|$)"), this.uriPattern, 0, 2, null);
        if (interfaceC8672kM16175c != null) {
            String strSubstring = this.uriPattern.substring(0, interfaceC8672kM16175c.mo14055b().m13496b());
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            buildRegex(strSubstring, this.pathArgs, sb);
            if (!WILDCARD_REGEX.m16176a(sb) && !PATH_REGEX.m16176a(sb)) {
                z10 = true;
            }
            this.isExactDeepLink = z10;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            String str = this.uriPattern;
            AbstractC9133u.m16130d(str);
            Uri uri = navUriUtils.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + str2 + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) AbstractC8778f0.m14568n0(queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                int iM13497c = 0;
                ParamQuery paramQuery = new ParamQuery();
                for (InterfaceC8672k interfaceC8672kM16175c = Regex.m16175c(FILL_IN_PATTERN, str3, 0, 2, null); interfaceC8672kM16175c != null; interfaceC8672kM16175c = interfaceC8672kM16175c.next()) {
                    C8670i c8670i = interfaceC8672kM16175c.mo14056c().get(1);
                    AbstractC9133u.m16130d(c8670i);
                    paramQuery.addArgumentName(c8670i.m14053b());
                    if (interfaceC8672kM16175c.mo14055b().m13496b() > iM13497c) {
                        String strSubstring = str3.substring(iM13497c, interfaceC8672kM16175c.mo14055b().m13496b());
                        AbstractC9133u.m16132f(strSubstring, "substring(...)");
                        sb.append(Regex.f17511b.m16188c(strSubstring));
                    }
                    sb.append(ANY_SYMBOLS_IN_THE_TAIL);
                    iM13497c = interfaceC8672kM16175c.mo14055b().m13497c() + 1;
                }
                if (iM13497c < str3.length()) {
                    Regex.C9140a c9140a = Regex.f17511b;
                    String strSubstring2 = str3.substring(iM13497c);
                    AbstractC9133u.m16132f(strSubstring2, "substring(...)");
                    sb.append(c9140a.m16188c(strSubstring2));
                }
                sb.append("$");
                String string = sb.toString();
                AbstractC9133u.m16132f(string, "toString(...)");
                paramQuery.setParamRegex(saveWildcardInRegex(string));
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex pathPattern_delegate$lambda$1(NavDeepLink navDeepLink) {
        String str = navDeepLink.pathRegex;
        if (str != null) {
            return new Regex(str, RegexOption.f17516c);
        }
        return null;
    }

    private final String saveWildcardInRegex(String str) {
        return (AbstractC8661c0.m13973S(str, "\\Q", false, 2, null) && AbstractC8661c0.m13973S(str, "\\E", false, 2, null)) ? AbstractC8687z.m14101I(str, ".*", "\\E.*\\Q", false, 4, null) : AbstractC8661c0.m13973S(str, "\\.\\*", false, 2, null) ? AbstractC8687z.m14101I(str, "\\.\\*", ".*", false, 4, null) : str;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri uri) {
        if (uri == null || this.uriPattern == null) {
            return 0;
        }
        return AbstractC8778f0.m14572r0(uri.getPathSegments(), NavUriUtils.INSTANCE.parse(this.uriPattern).getPathSegments()).size();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (AbstractC9133u.m16128b(this.uriPattern, navDeepLink.uriPattern) && AbstractC9133u.m16128b(this.action, navDeepLink.action) && AbstractC9133u.m16128b(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> collectionValues = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC8768a0.m14481C(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return AbstractC8778f0.m14529F0(AbstractC8778f0.m14529F0(list, arrayList), getFragArgs());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        InterfaceC8672k interfaceC8672kM16180g;
        Pair[] pairArr;
        AbstractC9133u.m16133g(deepLink, "deepLink");
        AbstractC9133u.m16133g(arguments, "arguments");
        Regex pathPattern = getPathPattern();
        if (pathPattern == null || (interfaceC8672kM16180g = pathPattern.m16180g(deepLink.toString())) == null) {
            return null;
        }
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
        final Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(interfaceC8672kM16180g, bundleBundleOf, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundleBundleOf, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundleBundleOf, arguments);
        if (NavArgumentKt.missingRequiredArguments(arguments, new InterfaceC10570l() { // from class: androidx.navigation.u
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDeepLink.getMatchingArguments$lambda$13(bundleBundleOf, (String) obj));
            }
        }).isEmpty()) {
            return bundleBundleOf;
        }
        return null;
    }

    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(Uri uri, Map<String, NavArgument> arguments) {
        Pair[] pairArr;
        Regex pathPattern;
        InterfaceC8672k interfaceC8672kM16180g;
        AbstractC9133u.m16133g(arguments, "arguments");
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
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        if (uri != null && (pathPattern = getPathPattern()) != null && (interfaceC8672kM16180g = pathPattern.m16180g(uri.toString())) != null) {
            getMatchingPathArguments(interfaceC8672kM16180g, bundleBundleOf, arguments);
            if (isParameterizedQuery()) {
                getMatchingQueryArguments(uri, bundleBundleOf, arguments);
            }
        }
        return bundleBundleOf;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(String mimeType) {
        AbstractC9133u.m16133g(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC9133u.m16130d(mimeTypePattern);
        if (mimeTypePattern.m16181h(mimeType)) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(Uri uri) {
        AbstractC9133u.m16133g(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z10) {
        this.isExactDeepLink = z10;
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        AbstractC9133u.m16133g(deepLinkRequest, "deepLinkRequest");
        return matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction()) && matchMimeType(deepLinkRequest.getMimeType());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(String uri) {
        this(uri, null, null);
        AbstractC9133u.m16133g(uri, "uri");
    }
}
