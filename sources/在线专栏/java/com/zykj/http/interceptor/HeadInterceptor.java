package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import java.util.Iterator;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p082e3.C2495u;
import p082e3.C2496v;

@Keep
/* loaded from: classes.dex */
public final class HeadInterceptor implements Interceptor {

    @NotNull
    public static final String APP_NAME_KEY = "AppName";

    @NotNull
    public static final String APP_VERSION_KEY = "AppVersion";

    @NotNull
    public static final String AUTH_KEY = "Authorization";

    @NotNull
    public static final C2399a Companion;

    @NotNull
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    /* renamed from: com.zykj.http.interceptor.HeadInterceptor$a */
    public static final class C2399a {
        private C2399a() {
        }

        public /* synthetic */ C2399a(C2764g c2764g) {
            this();
        }
    }

    static {
        C2399a c2399a = new C2399a(null);
        Companion = c2399a;
        String name = c2399a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    @NotNull
    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        C2769l.m9256t("headerLiveData");
        throw null;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        HttpUrl httpUrl;
        C2769l.m9241e(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        HeaderBean value = getHeaderLiveData().getValue();
        if (value != null) {
            Log.i(TAG, String.valueOf(value));
            String appName = value.getAppName();
            if (appName != null) {
                builderNewBuilder.header(APP_NAME_KEY, appName);
            }
            String versionCode = value.getVersionCode();
            if (versionCode != null) {
                builderNewBuilder.header(APP_VERSION_KEY, versionCode);
            }
            String accessToken = value.getAccessToken();
            if (accessToken != null) {
                if ((accessToken.length() > 0) && (!C2495u.m8346r(accessToken))) {
                    builderNewBuilder.header("Authorization", C2769l.m9248l("Bearer ", accessToken));
                }
            }
            String serverUrl = value.getServerUrl();
            if (serverUrl != null && (httpUrl = HttpUrl.Companion.parse(serverUrl)) != null) {
                HttpUrl.Builder builderNewBuilder2 = httpUrl.newBuilder();
                String string = request.url().toString();
                String strM9248l = C2496v.m8366H(string, "?", false, 2, null) ? C2769l.m9248l("?", C2496v.m8404r0(string, new String[]{"?"}, false, 0, 6, null).get(1)) : "";
                Iterator<T> it = request.url().pathSegments().iterator();
                while (it.hasNext()) {
                    builderNewBuilder2.addPathSegment((String) it.next());
                }
                builderNewBuilder.url(builderNewBuilder2 + strM9248l);
                return chain.proceed(builderNewBuilder.build());
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }

    public final void setHeaderLiveData(@NotNull HeaderLiveData headerLiveData) {
        C2769l.m9241e(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
