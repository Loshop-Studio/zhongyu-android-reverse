package okhttp3.internal.http;

import anet.channel.request.Request;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(@NotNull String method) {
        C2769l.m9241e(method, "method");
        return (C2769l.m9237a(method, "GET") || C2769l.m9237a(method, Request.Method.HEAD)) ? false : true;
    }

    public static final boolean requiresRequestBody(@NotNull String method) {
        C2769l.m9241e(method, "method");
        return C2769l.m9237a(method, "POST") || C2769l.m9237a(method, Request.Method.PUT) || C2769l.m9237a(method, "PATCH") || C2769l.m9237a(method, "PROPPATCH") || C2769l.m9237a(method, "REPORT");
    }

    public final boolean invalidatesCache(@NotNull String method) {
        C2769l.m9241e(method, "method");
        return C2769l.m9237a(method, "POST") || C2769l.m9237a(method, "PATCH") || C2769l.m9237a(method, Request.Method.PUT) || C2769l.m9237a(method, Request.Method.DELETE) || C2769l.m9237a(method, "MOVE");
    }

    public final boolean redirectsToGet(@NotNull String method) {
        C2769l.m9241e(method, "method");
        return !C2769l.m9237a(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String method) {
        C2769l.m9241e(method, "method");
        return C2769l.m9237a(method, "PROPFIND");
    }
}
