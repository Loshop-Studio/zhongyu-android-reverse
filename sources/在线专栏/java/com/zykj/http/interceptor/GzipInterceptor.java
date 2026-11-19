package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import anet.channel.util.HttpConstant;
import java.io.IOException;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import p082e3.C2495u;

@Keep
/* loaded from: classes.dex */
public final class GzipInterceptor implements Interceptor {

    @NotNull
    public static final String CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    public static final C2398a Companion;

    @NotNull
    private static final String TAG;

    /* renamed from: com.zykj.http.interceptor.GzipInterceptor$a */
    public static final class C2398a {
        private C2398a() {
        }

        public /* synthetic */ C2398a(C2764g c2764g) {
            this();
        }
    }

    static {
        C2398a c2398a = new C2398a(null);
        Companion = c2398a;
        String name = c2398a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    private final boolean isGzipped(Response response) {
        return Response.header$default(response, "Content-Encoding", null, 2, null) != null && C2495u.m8344p(Response.header$default(response, "Content-Encoding", null, 2, null), "gzip", false, 2, null);
    }

    private final Response unzip(Response response) throws IOException {
        if (response.body() == null) {
            return response;
        }
        ResponseBody responseBodyBody = response.body();
        C2769l.m9239c(responseBodyBody);
        String utf8 = Okio.buffer(new GzipSource(responseBodyBody.source())).readUtf8();
        Log.i(TAG, "response.url=" + response.request().url() + " \n " + utf8);
        ResponseBody.Companion companion = ResponseBody.Companion;
        ResponseBody responseBodyBody2 = response.body();
        return response.newBuilder().headers(response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build()).body(companion.create(utf8, responseBodyBody2 == null ? null : responseBodyBody2.contentType())).message(response.message()).build();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        C2769l.m9241e(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.addHeader(HttpConstant.ACCEPT_ENCODING, "gzip");
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        return isGzipped(responseProceed) ? unzip(responseProceed) : responseProceed;
    }
}
