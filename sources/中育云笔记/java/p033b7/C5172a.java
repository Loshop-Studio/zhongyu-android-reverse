package p033b7;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.interceptor.HttpLoggingInterceptor;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.GetRequest;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import je.C9742v;
import p131e7.AbstractC9108a;
import p146f7.AbstractC9202a;

/* renamed from: b7.a */
/* loaded from: classes5.dex */
public class C5172a {

    /* renamed from: i */
    public static long f3023i = 300;

    /* renamed from: a */
    public Application f3024a;

    /* renamed from: b */
    public Handler f3025b;

    /* renamed from: c */
    public C9742v f3026c;

    /* renamed from: d */
    public HttpParams f3027d;

    /* renamed from: e */
    public HttpHeaders f3028e;

    /* renamed from: f */
    public int f3029f;

    /* renamed from: g */
    public CacheMode f3030g;

    /* renamed from: h */
    public long f3031h;

    /* renamed from: b7.a$b */
    public static class b {

        /* renamed from: a */
        public static C5172a f3032a = new C5172a();
    }

    /* renamed from: a */
    public static GetRequest m2691a(String str) {
        return new GetRequest(str);
    }

    /* renamed from: h */
    public static C5172a m2692h() {
        return b.f3032a;
    }

    /* renamed from: b */
    public CacheMode m2693b() {
        return this.f3030g;
    }

    /* renamed from: c */
    public long m2694c() {
        return this.f3031h;
    }

    /* renamed from: d */
    public HttpHeaders m2695d() {
        return this.f3028e;
    }

    /* renamed from: e */
    public HttpParams m2696e() {
        return this.f3027d;
    }

    /* renamed from: f */
    public Context m2697f() {
        AbstractC9202a.m18096b(this.f3024a, "please call OkGo.getInstance().init() first in application!");
        return this.f3024a;
    }

    /* renamed from: g */
    public Handler m2698g() {
        return this.f3025b;
    }

    /* renamed from: i */
    public C9742v m2699i() {
        AbstractC9202a.m18096b(this.f3026c, "please call OkGo.getInstance().setOkHttpClient() first in application!");
        return this.f3026c;
    }

    /* renamed from: j */
    public int m2700j() {
        return this.f3029f;
    }

    /* renamed from: k */
    public C5172a m2701k(Application application) {
        this.f3024a = application;
        return this;
    }

    public C5172a() {
        this.f3025b = new Handler(Looper.getMainLooper());
        this.f3029f = 3;
        this.f3031h = -1L;
        this.f3030g = CacheMode.NO_CACHE;
        C9742v.a aVar = new C9742v.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor("OkGo");
        httpLoggingInterceptor.m9661h(HttpLoggingInterceptor.Level.BODY);
        httpLoggingInterceptor.m9660g(Level.INFO);
        aVar.m19555a(httpLoggingInterceptor);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.m19551O(60000L, timeUnit);
        aVar.m19554R(60000L, timeUnit);
        aVar.m19559e(60000L, timeUnit);
        AbstractC9108a.c cVarM17907b = AbstractC9108a.m17907b();
        aVar.m19553Q(cVarM17907b.f21276a, cVarM17907b.f21277b);
        aVar.m19549M(AbstractC9108a.f21275b);
        this.f3026c = aVar.m19557c();
    }
}
