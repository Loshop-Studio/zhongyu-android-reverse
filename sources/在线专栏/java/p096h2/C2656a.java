package p096h2;

import com.google.gson.GsonBuilder;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C2769l;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101i2.C2666a;
import p101i2.C2667b;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: h2.a */
/* loaded from: classes.dex */
public final class C2656a {

    /* renamed from: a */
    @NotNull
    public static final C2656a f10552a;

    /* renamed from: b */
    @NotNull
    private static final HashMap<String, Object> f10553b;

    /* renamed from: c */
    @NotNull
    private static final C2666a f10554c;

    /* renamed from: d */
    @NotNull
    private static final C2667b f10555d;

    /* renamed from: e */
    private static final GsonConverterFactory f10556e;

    /* renamed from: f */
    private static final RxJavaCallAdapterFactory f10557f;

    /* renamed from: g */
    @NotNull
    private static final OkHttpClient f10558g;

    /* renamed from: h */
    @Nullable
    private static ServerInfo f10559h;

    /* renamed from: i */
    @Nullable
    private static UserInfo f10560i;

    static {
        C2656a c2656a = new C2656a();
        f10552a = c2656a;
        f10553b = new HashMap<>();
        C2666a c2666a = new C2666a();
        f10554c = c2666a;
        C2667b c2667b = new C2667b(c2656a);
        f10555d = c2667b;
        f10556e = GsonConverterFactory.create(new GsonBuilder().serializeSpecialFloatingPointValues().create());
        f10557f = RxJavaCallAdapterFactory.create();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10558g = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(10L, timeUnit).addInterceptor(c2666a).addInterceptor(c2667b).build();
    }

    private C2656a() {
    }

    /* renamed from: e */
    public static /* synthetic */ Object m8917e(C2656a c2656a, Class cls, String str, OkHttpClient okHttpClient, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = c2656a.m8918a();
        }
        if ((i4 & 4) != 0) {
            okHttpClient = f10558g;
        }
        return c2656a.m8921d(cls, str, okHttpClient);
    }

    @Nullable
    /* renamed from: a */
    public final String m8918a() {
        ServerInfo serverInfo = f10559h;
        if (serverInfo == null) {
            return null;
        }
        return serverInfo.m8008a();
    }

    @Nullable
    /* renamed from: b */
    public final String m8919b() {
        ServerInfo serverInfo = f10559h;
        if (serverInfo == null) {
            return null;
        }
        return serverInfo.m8010c();
    }

    @Nullable
    /* renamed from: c */
    public final String m8920c() {
        UserInfo userInfo = f10560i;
        if (userInfo == null) {
            return null;
        }
        return userInfo.m8018b();
    }

    /* renamed from: d */
    public final <T> T m8921d(@NotNull Class<T> service, @Nullable String str, @NotNull OkHttpClient client) {
        C2769l.m9241e(service, "service");
        C2769l.m9241e(client, "client");
        if (str == null || str.length() == 0) {
            throw null;
        }
        HashMap<String, Object> map = f10553b;
        if (map.containsKey(service.getSimpleName())) {
            return (T) map.get(service.getSimpleName());
        }
        T t3 = (T) new Retrofit.Builder().baseUrl(str).client(client).addConverterFactory(f10556e).addCallAdapterFactory(f10557f).build().create(service);
        String simpleName = service.getSimpleName();
        C2769l.m9240d(simpleName, "service.simpleName");
        Objects.requireNonNull(t3, "null cannot be cast to non-null type kotlin.Any");
        map.put(simpleName, t3);
        return t3;
    }

    @Nullable
    /* renamed from: f */
    public final String m8922f() {
        ServerInfo serverInfo = f10559h;
        if (serverInfo == null) {
            return null;
        }
        return serverInfo.m8011d();
    }

    /* renamed from: g */
    public final void m8923g(@Nullable String str) {
        ServerInfo serverInfo = f10559h;
        if (serverInfo == null) {
            return;
        }
        serverInfo.m8012e(str);
    }

    /* renamed from: h */
    public final void m8924h(@NotNull InterfaceC3470l<? super InterfaceC3470l<? super String, C2925r>, C2925r> callback) {
        C2769l.m9241e(callback, "callback");
        f10554c.m8945a(callback);
    }

    /* renamed from: i */
    public final void m8925i(@Nullable ServerInfo serverInfo) {
        f10559h = serverInfo;
    }

    /* renamed from: j */
    public final void m8926j(@Nullable UserInfo userInfo) {
        f10560i = userInfo;
    }
}
