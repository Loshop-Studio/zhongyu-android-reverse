package androidx.navigation;

import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.AbstractC5447q;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

@NavDeepLinkDsl
/* loaded from: classes.dex */
public final class NavDeepLinkDslBuilder {
    private String action;
    private final NavDeepLink.Builder builder;
    private String mimeType;
    private InterfaceC10469c route;
    private Map<InterfaceC10481o, ? extends NavType<?>> typeMap;
    private String uriPattern;

    public NavDeepLinkDslBuilder() {
        this.builder = new NavDeepLink.Builder();
        this.typeMap = AbstractC9925a.m20088h();
    }

    public final NavDeepLink build$navigation_common_release() {
        NavDeepLink.Builder builder = this.builder;
        String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            builder.setUriPattern(str);
        }
        String str2 = this.action;
        if (str2 != null) {
            builder.setAction(str2);
        }
        String str3 = this.mimeType;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final void setAction(String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.action = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setUriPattern(String str) {
        this.uriPattern = str;
    }

    public NavDeepLinkDslBuilder(String basePath, InterfaceC10469c route, Map<InterfaceC10481o, NavType<?>> typeMap) {
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.builder = new NavDeepLink.Builder();
        this.typeMap = AbstractC9925a.m20088h();
        if (basePath.length() > 0) {
            this.uriPattern = RouteSerializerKt.generateRoutePattern(AbstractC5447q.m2953c(route), typeMap, basePath);
            this.route = route;
            this.typeMap = typeMap;
            return;
        }
        throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
    }
}
