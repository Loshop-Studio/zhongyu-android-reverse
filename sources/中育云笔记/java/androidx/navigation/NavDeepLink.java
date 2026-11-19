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
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p049ce.AbstractC5447q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p310qd.C10802i;
import p310qd.InterfaceC10804k;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes.dex */
public final class NavDeepLink {
    private static final String ANY_SYMBOLS_IN_THE_TAIL = "([\\s\\S]+?)?";
    private final String action;
    private final InterfaceC10773d fragArgs$delegate;
    private final InterfaceC10773d fragArgsAndRegex$delegate;
    private final InterfaceC10773d fragPattern$delegate;
    private final InterfaceC10773d fragRegex$delegate;
    private boolean isExactDeepLink;
    private final InterfaceC10773d isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private final InterfaceC10773d mimeTypePattern$delegate;
    private String mimeTypeRegex;
    private final List<String> pathArgs;
    private final InterfaceC10773d pathPattern$delegate;
    private String pathRegex;
    private final InterfaceC10773d queryArgsMap$delegate;
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
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Builder fromUriPattern$default(Companion companion, String basePath, Map typeMap, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    typeMap = AbstractC9925a.m20088h();
                }
                AbstractC9979u.m20294g(basePath, "basePath");
                AbstractC9979u.m20294g(typeMap, "typeMap");
                Builder builder = new Builder();
                AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(AbstractC9983y.m20315b(Object.class), basePath, typeMap);
                return builder;
            }

            public final Builder fromAction(String action) {
                AbstractC9979u.m20294g(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            public final Builder fromMimeType(String mimeType) {
                AbstractC9979u.m20294g(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUriPattern(String uriPattern) {
                AbstractC9979u.m20294g(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            private Companion() {
            }

            public final /* synthetic */ <T> Builder fromUriPattern(String basePath, Map<InterfaceC10481o, NavType<?>> typeMap) {
                AbstractC9979u.m20294g(basePath, "basePath");
                AbstractC9979u.m20294g(typeMap, "typeMap");
                Builder builder = new Builder();
                AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(AbstractC9983y.m20315b(Object.class), basePath, typeMap);
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
                typeMap = AbstractC9925a.m20088h();
            }
            AbstractC9979u.m20294g(basePath, "basePath");
            AbstractC9979u.m20294g(typeMap, "typeMap");
            AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
            return builder.setUriPattern(AbstractC9983y.m20315b(Object.class), basePath, typeMap);
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            AbstractC9979u.m20294g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            AbstractC9979u.m20294g(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final <T> Builder setUriPattern(InterfaceC10469c route, String basePath) {
            AbstractC9979u.m20294g(route, "route");
            AbstractC9979u.m20294g(basePath, "basePath");
            return setUriPattern$default(this, route, basePath, null, 4, null);
        }

        public final Builder setUriPattern(String uriPattern) {
            AbstractC9979u.m20294g(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }

        public final /* synthetic */ <T> Builder setUriPattern(String basePath, Map<InterfaceC10481o, NavType<?>> typeMap) {
            AbstractC9979u.m20294g(basePath, "basePath");
            AbstractC9979u.m20294g(typeMap, "typeMap");
            AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
            return setUriPattern(AbstractC9983y.m20315b(Object.class), basePath, typeMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, InterfaceC10469c interfaceC10469c, String str, Map map, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                map = AbstractC9925a.m20088h();
            }
            return builder.setUriPattern(interfaceC10469c, str, map);
        }

        public final <T> Builder setUriPattern(InterfaceC10469c route, String basePath, Map<InterfaceC10481o, NavType<?>> typeMap) {
            AbstractC9979u.m20294g(route, "route");
            AbstractC9979u.m20294g(basePath, "basePath");
            AbstractC9979u.m20294g(typeMap, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(AbstractC5447q.m2953c(route), typeMap, basePath);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String mimeType) {
            List listM24136n;
            AbstractC9979u.m20294g(mimeType, "mimeType");
            List listM20345o = new Regex(MqttTopic.TOPIC_LEVEL_SEPARATOR).m20345o(mimeType, 0);
            if (listM20345o.isEmpty()) {
                listM24136n = AbstractC10978w.m24136n();
            } else {
                ListIterator listIterator = listM20345o.listIterator(listM20345o.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM24136n = AbstractC10947g0.m23915Q0(listM20345o, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM24136n = AbstractC10978w.m24136n();
            }
            this.type = (String) listM24136n.get(0);
            this.subType = (String) listM24136n.get(1);
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType other) {
            AbstractC9979u.m20294g(other, "other");
            int i10 = AbstractC9979u.m20289b(this.type, other.type) ? 2 : 0;
            return AbstractC9979u.m20289b(this.subType, other.subType) ? i10 + 1 : i10;
        }
    }

    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String name) {
            AbstractC9979u.m20294g(name, "name");
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
        this.pathPattern$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.l
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavDeepLink.pathPattern_delegate$lambda$1(this.f1859c);
            }
        });
        this.isParameterizedQuery$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1860c));
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23258e;
        this.queryArgsMap$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.navigation.n
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return this.f1861c.parseQuery();
            }
        });
        this.fragArgsAndRegex$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.navigation.o
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return this.f1862c.parseFragment();
            }
        });
        this.fragArgs$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.navigation.p
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavDeepLink.fragArgs_delegate$lambda$5(this.f1863c);
            }
        });
        this.fragRegex$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.navigation.q
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavDeepLink.fragRegex_delegate$lambda$6(this.f1864c);
            }
        });
        this.fragPattern$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.s
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavDeepLink.fragPattern_delegate$lambda$8(this.f1865c);
            }
        });
        this.mimeTypePattern$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.navigation.t
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1875c);
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb2) {
        int iM21734c = 0;
        for (InterfaceC10804k interfaceC10804kM20336d = Regex.m20336d(FILL_IN_PATTERN, str, 0, 2, null); interfaceC10804kM20336d != null; interfaceC10804kM20336d = interfaceC10804kM20336d.next()) {
            C10802i c10802i = interfaceC10804kM20336d.mo23194b().get(1);
            AbstractC9979u.m20291d(c10802i);
            list.add(c10802i.m23192b());
            if (interfaceC10804kM20336d.mo23193a().m21733b() > iM21734c) {
                Regex.C9986a c9986a = Regex.f23440d;
                String strSubstring = str.substring(iM21734c, interfaceC10804kM20336d.mo23193a().m21733b());
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                sb2.append(c9986a.m20348c(strSubstring));
            }
            sb2.append(PATH_REGEX.m20339e());
            iM21734c = interfaceC10804kM20336d.mo23193a().m21734c() + 1;
        }
        if (iM21734c < str.length()) {
            Regex.C9986a c9986a2 = Regex.f23440d;
            String strSubstring2 = str.substring(iM21734c);
            AbstractC9979u.m20293f(strSubstring2, "substring(...)");
            sb2.append(c9986a2.m20348c(strSubstring2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragArgs_delegate$lambda$5(NavDeepLink navDeepLink) {
        List list;
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.m20051f()) == null) ? new ArrayList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex fragPattern_delegate$lambda$8(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new Regex(fragRegex, RegexOption.f23445e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fragRegex_delegate$lambda$6(NavDeepLink navDeepLink) {
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.m20052g();
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
        AbstractC9979u.m20294g(argName, "argName");
        return !SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundle), argName);
    }

    private final boolean getMatchingPathArguments(InterfaceC10804k interfaceC10804k, Bundle bundle, Map<String, NavArgument> map) {
        String strM23192b;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            String str = (String) obj;
            C10802i c10802i = interfaceC10804k.mo23194b().get(i11);
            String strDecode = (c10802i == null || (strM23192b = c10802i.m23192b()) == null) ? null : NavUriUtils.INSTANCE.decode(strM23192b);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str, strDecode, map.get(str));
                arrayList.add(C10786q.f26013a);
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
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !AbstractC9979u.m20289b(query, uri.toString())) {
                queryParameters = AbstractC10976v.m24126e(query);
            }
            if (!parseInputParams(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        InterfaceC10804k interfaceC10804kM20340f;
        String strM23192b;
        Regex fragPattern = getFragPattern();
        if (fragPattern == null || (interfaceC10804kM20340f = fragPattern.m20340f(String.valueOf(str))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(fragArgs, 10));
        int i10 = 0;
        for (Object obj : fragArgs) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            String str2 = (String) obj;
            C10802i c10802i = interfaceC10804kM20340f.mo23194b().get(i11);
            String strDecode = (c10802i == null || (strM23192b = c10802i.m23192b()) == null) ? null : NavUriUtils.INSTANCE.decode(strM23192b);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str2, strDecode, map.get(str2));
                arrayList.add(C10786q.f26013a);
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
        return str != null && QUERY_PATTERN.m20341g(str);
    }

    private final boolean matchAction(String str) {
        String str2 = this.action;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return AbstractC9979u.m20289b(str2, str);
    }

    private final boolean matchMimeType(String str) {
        if (this.mimeType == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC9979u.m20291d(mimeTypePattern);
        return mimeTypePattern.m20341g(str);
    }

    private final boolean matchUri(Uri uri) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Regex pathPattern = getPathPattern();
        AbstractC9979u.m20291d(pathPattern);
        return pathPattern.m20341g(uri.toString());
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
            SavedStateWriter.m33943putStringimpl(SavedStateWriter.m33910constructorimpl(bundle), str, str2);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundle), str)) {
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
        StringBuilder sb2 = new StringBuilder();
        AbstractC9979u.m20291d(fragment);
        buildRegex(fragment, arrayList, sb2);
        return AbstractC10776g.m22975a(arrayList, sb2.toString());
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        Pair[] pairArr;
        Object objValueOf;
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
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
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
            InterfaceC10804k interfaceC10804kM20340f = paramRegex != null ? new Regex(paramRegex).m20340f(str2) : null;
            if (interfaceC10804kM20340f == null) {
                return false;
            }
            List<String> arguments = paramQuery.getArguments();
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arguments, 10));
            int i10 = 0;
            for (Object obj : arguments) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC10978w.m24145w();
                }
                String str3 = (String) obj;
                C10802i c10802i = interfaceC10804kM20340f.mo23194b().get(i11);
                String strM23192b = c10802i != null ? c10802i.m23192b() : null;
                if (strM23192b == null) {
                    strM23192b = "";
                }
                NavArgument navArgument2 = map.get(str3);
                try {
                    if (SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundleBundleOf), str3)) {
                        objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, strM23192b, navArgument2));
                    } else {
                        parseArgument(bundleBundleOf, str3, strM23192b, navArgument2);
                        objValueOf = C10786q.f26013a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = C10786q.f26013a;
                }
                arrayList2.add(objValueOf);
                i10 = i11;
            }
        }
        SavedStateWriter.m33914putAllimpl(SavedStateWriter.m33910constructorimpl(bundle), bundleBundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").m20341g(this.mimeType)) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        this.mimeTypeRegex = AbstractC10819z.m23238K("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!SCHEME_PATTERN.m20337a(this.uriPattern)) {
            sb2.append(SCHEME_REGEX.m20339e());
        }
        boolean z10 = false;
        InterfaceC10804k interfaceC10804kM20336d = Regex.m20336d(new Regex("(\\?|#|$)"), this.uriPattern, 0, 2, null);
        if (interfaceC10804kM20336d != null) {
            String strSubstring = this.uriPattern.substring(0, interfaceC10804kM20336d.mo23193a().m21733b());
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            buildRegex(strSubstring, this.pathArgs, sb2);
            if (!WILDCARD_REGEX.m20337a(sb2) && !PATH_REGEX.m20337a(sb2)) {
                z10 = true;
            }
            this.isExactDeepLink = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            String str = this.uriPattern;
            AbstractC9979u.m20291d(str);
            Uri uri = navUriUtils.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + str2 + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) AbstractC10947g0.m23946o0(queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                int iM21734c = 0;
                ParamQuery paramQuery = new ParamQuery();
                for (InterfaceC10804k interfaceC10804kM20336d = Regex.m20336d(FILL_IN_PATTERN, str3, 0, 2, null); interfaceC10804kM20336d != null; interfaceC10804kM20336d = interfaceC10804kM20336d.next()) {
                    C10802i c10802i = interfaceC10804kM20336d.mo23194b().get(1);
                    AbstractC9979u.m20291d(c10802i);
                    paramQuery.addArgumentName(c10802i.m23192b());
                    if (interfaceC10804kM20336d.mo23193a().m21733b() > iM21734c) {
                        String strSubstring = str3.substring(iM21734c, interfaceC10804kM20336d.mo23193a().m21733b());
                        AbstractC9979u.m20293f(strSubstring, "substring(...)");
                        sb2.append(Regex.f23440d.m20348c(strSubstring));
                    }
                    sb2.append(ANY_SYMBOLS_IN_THE_TAIL);
                    iM21734c = interfaceC10804kM20336d.mo23193a().m21734c() + 1;
                }
                if (iM21734c < str3.length()) {
                    Regex.C9986a c9986a = Regex.f23440d;
                    String strSubstring2 = str3.substring(iM21734c);
                    AbstractC9979u.m20293f(strSubstring2, "substring(...)");
                    sb2.append(c9986a.m20348c(strSubstring2));
                }
                sb2.append("$");
                String string = sb2.toString();
                AbstractC9979u.m20293f(string, "toString(...)");
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
            return new Regex(str, RegexOption.f23445e);
        }
        return null;
    }

    private final String saveWildcardInRegex(String str) {
        return (AbstractC10793c0.m23108U(str, "\\Q", false, 2, null) && AbstractC10793c0.m23108U(str, "\\E", false, 2, null)) ? AbstractC10819z.m23238K(str, ".*", "\\E.*\\Q", false, 4, null) : AbstractC10793c0.m23108U(str, "\\.\\*", false, 2, null) ? AbstractC10819z.m23238K(str, "\\.\\*", ".*", false, 4, null) : str;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri uri) {
        if (uri == null || this.uriPattern == null) {
            return 0;
        }
        return AbstractC10947g0.m23950s0(uri.getPathSegments(), NavUriUtils.INSTANCE.parse(this.uriPattern).getPathSegments()).size();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (AbstractC9979u.m20289b(this.uriPattern, navDeepLink.uriPattern) && AbstractC9979u.m20289b(this.action, navDeepLink.action) && AbstractC9979u.m20289b(this.mimeType, navDeepLink.mimeType)) {
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
            AbstractC10937b0.m23857B(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return AbstractC10947g0.m23906H0(AbstractC10947g0.m23906H0(list, arrayList), getFragArgs());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        InterfaceC10804k interfaceC10804kM20340f;
        Pair[] pairArr;
        AbstractC9979u.m20294g(deepLink, "deepLink");
        AbstractC9979u.m20294g(arguments, "arguments");
        Regex pathPattern = getPathPattern();
        if (pathPattern == null || (interfaceC10804kM20340f = pathPattern.m20340f(deepLink.toString())) == null) {
            return null;
        }
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
        final Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(interfaceC10804kM20340f, bundleBundleOf, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundleBundleOf, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundleBundleOf, arguments);
        if (NavArgumentKt.missingRequiredArguments(arguments, new InterfaceC9540l() { // from class: androidx.navigation.u
            @Override // p181hd.InterfaceC9540l
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
        InterfaceC10804k interfaceC10804kM20340f;
        AbstractC9979u.m20294g(arguments, "arguments");
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
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        if (uri != null && (pathPattern = getPathPattern()) != null && (interfaceC10804kM20340f = pathPattern.m20340f(uri.toString())) != null) {
            getMatchingPathArguments(interfaceC10804kM20340f, bundleBundleOf, arguments);
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
        AbstractC9979u.m20294g(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC9979u.m20291d(mimeTypePattern);
        if (mimeTypePattern.m20341g(mimeType)) {
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
        AbstractC9979u.m20294g(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z10) {
        this.isExactDeepLink = z10;
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        AbstractC9979u.m20294g(deepLinkRequest, "deepLinkRequest");
        return matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction()) && matchMimeType(deepLinkRequest.getMimeType());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(String uri) {
        this(uri, null, null);
        AbstractC9979u.m20294g(uri, "uri");
    }
}
