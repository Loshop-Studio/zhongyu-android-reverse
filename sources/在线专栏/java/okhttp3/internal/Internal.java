package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C2769l;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Internal {
    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String line) {
        C2769l.m9241e(builder, "builder");
        C2769l.m9241e(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sslSocket, boolean z3) throws CloneNotSupportedException {
        C2769l.m9241e(connectionSpec, "connectionSpec");
        C2769l.m9241e(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z3);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        C2769l.m9241e(cache, "cache");
        C2769l.m9241e(request, "request");
        return cache.get$okhttp(request);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie, boolean z3) {
        C2769l.m9241e(cookie, "cookie");
        return cookie.toString$okhttp(z3);
    }

    @Nullable
    public static final Cookie parseCookie(long j4, @NotNull HttpUrl url, @NotNull String setCookie) {
        C2769l.m9241e(url, "url");
        C2769l.m9241e(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j4, url, setCookie);
    }

    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        C2769l.m9241e(builder, "builder");
        C2769l.m9241e(name, "name");
        C2769l.m9241e(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
