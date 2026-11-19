package com.zykj.subscriber;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置、WebView。

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0101b;
import androidx.lifecycle.C0505m;
import androidx.lifecycle.InterfaceC0512t;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import anet.channel.util.HttpConstant;
import anetwork.channel.util.RequestConstant;
import com.google.gson.Gson;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.download.OssUtils;
import com.zykj.download.data.AppDatabase;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.download.work.DownloadFileWorkProxy;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.subscriber.MainActivity;
import com.zykj.subscriber.entity.LocalUserInfo;
import com.zykj.subscriber.receiver.AliMessageReceiver;
import com.zykj.subscriber.update.C2441c;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.C2730l;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p018c2.C1082u;
import p076d2.C2453b;
import p082e3.C2484j;
import p082e3.C2495u;
import p082e3.C2496v;
import p082e3.InterfaceC2482h;
import p087f3.AbstractC2545e0;
import p087f3.AbstractC2612x1;
import p087f3.C2552g;
import p087f3.C2560i;
import p087f3.C2605v0;
import p087f3.InterfaceC2557h0;
import p091g2.InterfaceC2646b;
import p096h2.C2656a;
import p102i3.InterfaceC2669b;
import p102i3.InterfaceC2675h;
import p106j2.C2693b;
import p116l2.C2840a;
import p116l2.C2841b;
import p116l2.C2842c;
import p116l2.C2843d;
import p116l2.C2844e;
import p116l2.C2845f;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p150s1.C3377b;
import p154t1.InterfaceC3401a;
import p169x0.AbstractC3454w;
import p169x0.C3447p;
import p169x0.C3453v;
import p171x2.InterfaceC3459a;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3474p;
import p178z1.C3508a;
import p178z1.EnumC3509b;

/* loaded from: classes.dex */
public final class MainActivity extends BaseActivity implements InterfaceC2646b {

    /* renamed from: t */
    @NotNull
    public static final C2419a f9834t = new C2419a(null);

    /* renamed from: u */
    @NotNull
    private static volatile ArrayList<String> f9835u = new ArrayList<>();

    /* renamed from: d */
    @Nullable
    private InterfaceC3401a f9837d;

    /* renamed from: e */
    private C2693b f9838e;

    /* renamed from: f */
    @Nullable
    private View f9839f;

    /* renamed from: g */
    @Nullable
    private WebChromeClient.CustomViewCallback f9840g;

    /* renamed from: j */
    private boolean f9843j;

    /* renamed from: n */
    @NotNull
    private final OkHttpClient f9847n;

    /* renamed from: o */
    @NotNull
    private final AliMessageReceiver f9848o;

    /* renamed from: p */
    private C2441c f9849p;

    /* renamed from: q */
    @Nullable
    private DialogC0101b f9850q;

    /* renamed from: r */
    @NotNull
    private final ServiceConnection f9851r;

    /* renamed from: s */
    @Nullable
    private ProgressDialog f9852s;

    /* renamed from: c */
    @NotNull
    public Map<Integer, View> f9836c = new LinkedHashMap();

    /* renamed from: h */
    @NotNull
    private String f9841h = "";

    /* renamed from: i */
    @NotNull
    private String f9842i = "";

    /* renamed from: k */
    @NotNull
    private final ArrayList<String> f9844k = new ArrayList<>();

    /* renamed from: l */
    @NotNull
    private String[] f9845l = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_WIFI_STATE"};

    /* renamed from: m */
    private boolean f9846m = true;

    /* renamed from: com.zykj.subscriber.MainActivity$a */
    public static final class C2419a {
        private C2419a() {
        }

        public /* synthetic */ C2419a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$b */
    public final class C2420b {

        /* renamed from: a */
        @NotNull
        private final Gson f9853a;

        /* renamed from: b */
        final /* synthetic */ MainActivity f9854b;

        /* renamed from: com.zykj.subscriber.MainActivity$b$a */
        static final class a extends AbstractC2770m implements InterfaceC3470l<String, C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9855a;

            /* renamed from: b */
            final /* synthetic */ String f9856b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, String str) {
                super(1);
                this.f9855a = mainActivity;
                this.f9856b = str;
            }

            /* renamed from: a */
            public final void m8090a(@NotNull String it) {
                C2769l.m9241e(it, "it");
                FileActivity.f9829e.m8036a(this.f9855a, it, this.f9856b);
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(String str) {
                m8090a(str);
                return C2925r.f11415a;
            }
        }

        /* renamed from: com.zykj.subscriber.MainActivity$b$b */
        static final class b extends AbstractC2770m implements InterfaceC3470l<String, C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9857a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity) {
                super(1);
                this.f9857a = mainActivity;
            }

            /* renamed from: a */
            public final void m8091a(@NotNull String it) {
                C2769l.m9241e(it, "it");
                ((WebView) this.f9857a.m8089l(C1082u.f6301n)).loadUrl(it);
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(String str) {
                m8091a(str);
                return C2925r.f11415a;
            }
        }

        /* renamed from: com.zykj.subscriber.MainActivity$b$c */
        static final class c extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9858a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(MainActivity mainActivity) {
                super(1);
                this.f9858a = mainActivity;
            }

            /* renamed from: a */
            public final void m8092a(@Nullable ServerInfo serverInfo) {
                String strM8010c;
                String str = "";
                if (serverInfo != null && (strM8010c = serverInfo.m8010c()) != null) {
                    str = strM8010c;
                }
                if (str.length() > 0) {
                    Log.i("OkHttp", "网页报错，回调返回");
                    C2656a c2656a = C2656a.f10552a;
                    if (C2769l.m9237a(c2656a.m8919b(), str)) {
                        C2844e.f10946a.m9543b();
                        C2845f.m9546a("网页报错，token刷新失败");
                    } else {
                        c2656a.m8923g(str);
                        this.f9858a.m8057V();
                    }
                }
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
                m8092a(serverInfo);
                return C2925r.f11415a;
            }
        }

        public C2420b(MainActivity this$0) {
            C2769l.m9241e(this$0, "this$0");
            this.f9854b = this$0;
            this.f9853a = new Gson();
        }

        @JavascriptInterface
        @NotNull
        public final String checkUrls(@NotNull String urls) {
            C2769l.m9241e(urls, "urls");
            Log.d("JavascriptInterface", String.valueOf(urls));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(urls);
            int length = jSONArray.length();
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                String strOptString = jSONArray.optString(i4);
                if (strOptString != null && !this.f9854b.m8044H(strOptString)) {
                    arrayList.add(strOptString);
                }
                i4 = i5;
            }
            String json = this.f9853a.toJson(arrayList);
            C2769l.m9240d(json, "gson.toJson(badUrlList)");
            return json;
        }

        @JavascriptInterface
        @Nullable
        public final String getUserInfo() {
            String string = C2841b.m9538a(this.f9854b).getString("SP_LOCAL_USER_INFO", null);
            Log.i("MainActivity", C2769l.m9248l("LocalUserInfo->", string));
            return string;
        }

        @JavascriptInterface
        public final void open_file(@NotNull String url) {
            C2769l.m9241e(url, "url");
            if (url.length() == 0) {
                return;
            }
            MainActivity mainActivity = this.f9854b;
            mainActivity.m8047K(url, new a(mainActivity, url));
        }

        @JavascriptInterface
        public final void open_html(@NotNull String url) {
            C2769l.m9241e(url, "url");
            if (url.length() == 0) {
                return;
            }
            MainActivity mainActivity = this.f9854b;
            mainActivity.m8047K(url, new b(mainActivity));
        }

        @JavascriptInterface
        public final void refreshToken() {
            Log.i("OkHttp", "网页报错，调用refreshToken");
            EnumC3509b.f12309a.mo10700f(new c(this.f9854b));
        }

        @JavascriptInterface
        public final void transmitUrl(@NotNull String url) {
            C2769l.m9241e(url, "url");
            C2845f.m9548c("JsToJava", C2769l.m9248l("url--?", url));
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$c */
    public static final class ServiceConnectionC2421c implements ServiceConnection {

        @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$connection$1$onServiceConnected$1", m9207f = "MainActivity.kt", m9208l = {146}, m9209m = "invokeSuspend")
        /* renamed from: com.zykj.subscriber.MainActivity$c$a */
        static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

            /* renamed from: b */
            int f9860b;

            /* renamed from: c */
            final /* synthetic */ MainActivity f9861c;

            @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$connection$1$onServiceConnected$1$1", m9207f = "MainActivity.kt", m9208l = {}, m9209m = "invokeSuspend")
            /* renamed from: com.zykj.subscriber.MainActivity$c$a$a, reason: collision with other inner class name */
            static final class C3532a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super MaterialDialog>, Object> {

                /* renamed from: b */
                int f9862b;

                /* renamed from: c */
                final /* synthetic */ MainActivity f9863c;

                @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$connection$1$onServiceConnected$1$1$1$1", m9207f = "MainActivity.kt", m9208l = {}, m9209m = "invokeSuspend")
                /* renamed from: com.zykj.subscriber.MainActivity$c$a$a$a, reason: collision with other inner class name */
                static final class C3533a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

                    /* renamed from: b */
                    int f9864b;

                    /* renamed from: c */
                    final /* synthetic */ MainActivity f9865c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C3533a(MainActivity mainActivity, InterfaceC3012d<? super C3533a> interfaceC3012d) {
                        super(2, interfaceC3012d);
                        this.f9865c = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                    @NotNull
                    public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                        return new C3533a(this.f9865c, interfaceC3012d);
                    }

                    @Override // p171x2.InterfaceC3474p
                    @Nullable
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
                        return ((C3533a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        C3033d.m10175c();
                        if (this.f9864b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2920m.m9994b(obj);
                        InterfaceC3401a interfaceC3401a = this.f9865c.f9837d;
                        if (interfaceC3401a != null) {
                            interfaceC3401a.mo10379d();
                        }
                        InterfaceC3401a interfaceC3401a2 = this.f9865c.f9837d;
                        if (interfaceC3401a2 != null) {
                            interfaceC3401a2.mo10380g(this.f9865c.getPackageName());
                        }
                        return C2925r.f11415a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3532a(MainActivity mainActivity, InterfaceC3012d<? super C3532a> interfaceC3012d) {
                    super(2, interfaceC3012d);
                    this.f9863c = mainActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: j */
                public static final void m8095j(MainActivity mainActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
                    C2560i.m8574d(C0505m.m2880a(mainActivity), C2605v0.m8751b(), null, new C3533a(mainActivity, null), 2, null);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                @NotNull
                public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                    return new C3532a(this.f9863c, interfaceC3012d);
                }

                @Override // p171x2.InterfaceC3474p
                @Nullable
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super MaterialDialog> interfaceC3012d) {
                    return ((C3532a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C3033d.m10175c();
                    if (this.f9862b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                    MaterialDialog.Builder builderPositiveText = new MaterialDialog.Builder(this.f9863c).content(R.string.tips_upgrade_new_version).cancelable(false).canceledOnTouchOutside(false).autoDismiss(false).positiveText(R.string.to_update);
                    final MainActivity mainActivity = this.f9863c;
                    return builderPositiveText.onPositive(new MaterialDialog.SingleButtonCallback() { // from class: com.zykj.subscriber.a
                        @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
                        public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                            MainActivity.ServiceConnectionC2421c.a.C3532a.m8095j(mainActivity, materialDialog, dialogAction);
                        }
                    }).show();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, InterfaceC3012d<? super a> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f9861c = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                return new a(this.f9861c, interfaceC3012d);
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
                return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM10175c = C3033d.m10175c();
                int i4 = this.f9860b;
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    InterfaceC3401a interfaceC3401a = this.f9861c.f9837d;
                    boolean z3 = false;
                    if (interfaceC3401a != null && interfaceC3401a.mo10381k(this.f9861c.getPackageName())) {
                        z3 = true;
                    }
                    if (z3) {
                        AbstractC2612x1 abstractC2612x1M8752c = C2605v0.m8752c();
                        C3532a c3532a = new C3532a(this.f9861c, null);
                        this.f9860b = 1;
                        if (C2552g.m8560g(abstractC2612x1M8752c, c3532a, this) == objM10175c) {
                            return objM10175c;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                }
                return C2925r.f11415a;
            }
        }

        ServiceConnectionC2421c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
            MainActivity.this.f9837d = InterfaceC3401a.a.m10382y(iBinder);
            C2560i.m8574d(C0505m.m2880a(MainActivity.this), C2605v0.m8751b(), null, new a(MainActivity.this, null), 2, null);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName componentName) {
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$downloadAndOpen$1", m9207f = "MainActivity.kt", m9208l = {790}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.subscriber.MainActivity$d */
    static final class C2422d extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        Object f9866b;

        /* renamed from: c */
        Object f9867c;

        /* renamed from: d */
        int f9868d;

        /* renamed from: e */
        private /* synthetic */ Object f9869e;

        /* renamed from: g */
        final /* synthetic */ String f9871g;

        /* renamed from: h */
        final /* synthetic */ DownloadFileWorkProxy f9872h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC3470l<String, C2925r> f9873i;

        @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$downloadAndOpen$1$1", m9207f = "MainActivity.kt", m9208l = {791}, m9209m = "invokeSuspend")
        /* renamed from: com.zykj.subscriber.MainActivity$d$a */
        static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super String>, Object> {

            /* renamed from: b */
            int f9874b;

            /* renamed from: c */
            final /* synthetic */ DownloadFileWorkProxy f9875c;

            /* renamed from: d */
            final /* synthetic */ String f9876d;

            /* renamed from: e */
            final /* synthetic */ String f9877e;

            /* renamed from: f */
            final /* synthetic */ String f9878f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DownloadFileWorkProxy downloadFileWorkProxy, String str, String str2, String str3, InterfaceC3012d<? super a> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f9875c = downloadFileWorkProxy;
                this.f9876d = str;
                this.f9877e = str2;
                this.f9878f = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                return new a(this.f9875c, this.f9876d, this.f9877e, this.f9878f, interfaceC3012d);
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super String> interfaceC3012d) {
                return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM10175c = C3033d.m10175c();
                int i4 = this.f9874b;
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    DownloadFileWorkProxy downloadFileWorkProxy = this.f9875c;
                    String str = this.f9876d;
                    File file = new File(this.f9877e, this.f9878f);
                    this.f9874b = 1;
                    obj = downloadFileWorkProxy.checkDownloadSuccess(str, file, this);
                    if (obj == objM10175c) {
                        return objM10175c;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                }
                return obj;
            }
        }

        /* renamed from: com.zykj.subscriber.MainActivity$d$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f9879a;

            static {
                int[] iArr = new int[C3453v.a.values().length];
                iArr[C3453v.a.SUCCEEDED.ordinal()] = 1;
                iArr[C3453v.a.FAILED.ordinal()] = 2;
                f9879a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2422d(String str, DownloadFileWorkProxy downloadFileWorkProxy, InterfaceC3470l<? super String, C2925r> interfaceC3470l, InterfaceC3012d<? super C2422d> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f9871g = str;
            this.f9872h = downloadFileWorkProxy;
            this.f9873i = interfaceC3470l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m8101l(AbstractC3454w abstractC3454w, C3447p c3447p, DialogInterface dialogInterface) {
            abstractC3454w.mo10528b(c3447p.m10542a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m8102m(AbstractC3454w abstractC3454w, C3447p c3447p, final MainActivity mainActivity, final InterfaceC3470l interfaceC3470l, final DialogInterface dialogInterface) {
            abstractC3454w.mo10531f(c3447p.m10542a()).observe(mainActivity, new InterfaceC0512t() { // from class: com.zykj.subscriber.d
                @Override // androidx.lifecycle.InterfaceC0512t
                /* renamed from: a */
                public final void mo2584a(Object obj) {
                    MainActivity.C2422d.m8103n(dialogInterface, mainActivity, interfaceC3470l, (C3453v) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m8103n(DialogInterface dialogInterface, MainActivity mainActivity, InterfaceC3470l interfaceC3470l, C3453v c3453v) {
            int i4 = b.f9879a[c3453v.m10522e().ordinal()];
            if (i4 == 1) {
                dialogInterface.dismiss();
                String strM4152j = c3453v.m10519b().m4152j(OssUtils.SUCCESS_KEY);
                if (strM4152j == null) {
                    return;
                }
                interfaceC3470l.invoke(strM4152j);
                return;
            }
            if (i4 != 2) {
                Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
                ((MaterialDialog) dialogInterface).setProgress(c3453v.m10520c().m4150h(OssUtils.PROGRESS, 0));
                return;
            }
            dialogInterface.dismiss();
            String message = ErrorCodeHandler.INSTANCE.getErrorCode(c3453v.m10519b().m4150h(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessage();
            if (message != null) {
                Log.i("DownLoad", message);
            }
            mainActivity.m8024f("文件下载失败，请重新尝试");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            C2422d c2422d = MainActivity.this.new C2422d(this.f9871g, this.f9872h, this.f9873i, interfaceC3012d);
            c2422d.f9869e = obj;
            return c2422d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String str;
            String str2;
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f9868d;
            Object objShow = null;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                InterfaceC2557h0 interfaceC2557h0 = (InterfaceC2557h0) this.f9869e;
                str = MainActivity.this.getCacheDir().getAbsolutePath() + ((Object) File.separator) + "browser";
                String strM8357C0 = C2496v.m8357C0(this.f9871g, "/", null, 2, null);
                AbstractC2545e0 abstractC2545e0M8751b = C2605v0.m8751b();
                a aVar = new a(this.f9872h, this.f9871g, str, strM8357C0, null);
                this.f9869e = interfaceC2557h0;
                this.f9866b = str;
                this.f9867c = strM8357C0;
                this.f9868d = 1;
                obj = C2552g.m8560g(abstractC2545e0M8751b, aVar, this);
                if (obj == objM10175c) {
                    return objM10175c;
                }
                str2 = strM8357C0;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f9867c;
                str = (String) this.f9866b;
                C2920m.m9994b(obj);
            }
            String str3 = (String) obj;
            if (str3 != null) {
                this.f9873i.invoke(str3);
                objShow = C2925r.f11415a;
            }
            if (objShow == null) {
                String str4 = this.f9871g;
                final MainActivity mainActivity = MainActivity.this;
                final InterfaceC3470l<String, C2925r> interfaceC3470l = this.f9873i;
                C3447p c3447pM10547b = new C3447p.a(DownloadFileCommonWork.class).m10548e(DownloadFileCommonWork.Companion.m7989a(str4, str, str2)).m10547b();
                C2769l.m9240d(c3447pM10547b, "OneTimeWorkRequestBuilde…                ).build()");
                final C3447p c3447p = c3447pM10547b;
                final AbstractC3454w abstractC3454wM10525e = AbstractC3454w.m10525e(mainActivity);
                C2769l.m9240d(abstractC3454wM10525e, "getInstance(this@MainActivity)");
                abstractC3454wM10525e.m10530d(c3447p);
                objShow = new MaterialDialog.Builder(mainActivity).content("下载中").contentGravity(GravityEnum.CENTER).progress(false, 100, true).cancelListener(new DialogInterface.OnCancelListener() { // from class: com.zykj.subscriber.b
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        MainActivity.C2422d.m8101l(abstractC3454wM10525e, c3447p, dialogInterface);
                    }
                }).negativeText(mainActivity.getString(R.string.cancel)).showListener(new DialogInterface.OnShowListener() { // from class: com.zykj.subscriber.c
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        MainActivity.C2422d.m8102m(abstractC3454wM10525e, c3447p, mainActivity, interfaceC3470l, dialogInterface);
                    }
                }).show();
            }
            if (objShow == null) {
                MainActivity.this.m8024f("无法打开文件");
            }
            return C2925r.f11415a;
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2422d) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$e */
    static final class C2423e extends AbstractC2770m implements InterfaceC3470l<String, C2925r> {

        /* renamed from: a */
        final /* synthetic */ UserInfo f9880a;

        /* renamed from: b */
        final /* synthetic */ MainActivity f9881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2423e(UserInfo userInfo, MainActivity mainActivity) {
            super(1);
            this.f9880a = userInfo;
            this.f9881b = mainActivity;
        }

        /* renamed from: a */
        public final void m8106a(@Nullable String str) {
            if (str == null) {
                return;
            }
            UserInfo userInfo = this.f9880a;
            MainActivity mainActivity = this.f9881b;
            String strM8019c = userInfo.m8019c();
            C2769l.m9240d(strM8019c, "userInfo.userName");
            String strM8017a = userInfo.m8017a();
            C2769l.m9240d(strM8017a, "userInfo.realName");
            String json = new Gson().toJson(new LocalUserInfo(str, strM8019c, strM8017a));
            Log.i("MainActivity", C2769l.m9248l("LocalUserInfo->", json));
            C2841b.m9538a(mainActivity).edit().putString("SP_LOCAL_USER_INFO", json).apply();
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(String str) {
            m8106a(str);
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$f */
    static final class C2424f extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {

        /* renamed from: a */
        public static final C2424f f9882a = new C2424f();

        C2424f() {
            super(1);
        }

        /* renamed from: a */
        public final void m8107a(@Nullable ServerInfo serverInfo) {
            if ((serverInfo == null ? null : serverInfo.m8009b()) != Status.LOGIN) {
                C3508a.m10687i().m10688c();
            }
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
            m8107a(serverInfo);
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$g */
    static final class C2425g extends AbstractC2770m implements InterfaceC3470l<InterfaceC3470l<? super String, ? extends C2925r>, C2925r> {

        /* renamed from: com.zykj.subscriber.MainActivity$g$a */
        static final class a extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9884a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l<String, C2925r> f9885b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(MainActivity mainActivity, InterfaceC3470l<? super String, C2925r> interfaceC3470l) {
                super(1);
                this.f9884a = mainActivity;
                this.f9885b = interfaceC3470l;
            }

            /* renamed from: a */
            public final void m8109a(@Nullable ServerInfo serverInfo) {
                String strM8010c;
                String strM8010c2;
                String str = "";
                if (serverInfo == null || (strM8010c = serverInfo.m8010c()) == null) {
                    strM8010c = "";
                }
                if (strM8010c.length() > 0) {
                    C2656a.f10552a.m8923g(strM8010c);
                    this.f9884a.m8057V();
                }
                InterfaceC3470l<String, C2925r> interfaceC3470l = this.f9885b;
                if (serverInfo != null && (strM8010c2 = serverInfo.m8010c()) != null) {
                    str = strM8010c2;
                }
                interfaceC3470l.invoke(str);
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
                m8109a(serverInfo);
                return C2925r.f11415a;
            }
        }

        C2425g() {
            super(1);
        }

        /* renamed from: a */
        public final void m8108a(@NotNull InterfaceC3470l<? super String, C2925r> callback) {
            C2769l.m9241e(callback, "callback");
            EnumC3509b.f12309a.mo10700f(new a(MainActivity.this, callback));
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(InterfaceC3470l<? super String, ? extends C2925r> interfaceC3470l) {
            m8108a(interfaceC3470l);
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$h */
    static final class C2426h extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {

        /* renamed from: com.zykj.subscriber.MainActivity$h$a */
        static final class a extends AbstractC2770m implements InterfaceC3470l<UserInfo, C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9887a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity) {
                super(1);
                this.f9887a = mainActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m8111a(@org.jetbrains.annotations.NotNull com.zykj.message.server.bean.UserInfo r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "userInfo"
                    kotlin.jvm.internal.C2769l.m9241e(r5, r0)
                    h2.a r0 = p096h2.C2656a.f10552a
                    r0.m8926j(r5)
                    l2.i r1 = p116l2.C2848i.f10956a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = r5.m8018b()
                    r2.append(r3)
                    r3 = 95
                    r2.append(r3)
                    java.lang.String r3 = r5.m8019c()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r1.m9554a(r2)
                    com.zykj.subscriber.MainActivity r1 = r4.f9887a
                    com.zykj.subscriber.MainActivity.m8080u(r1, r5)
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    boolean r5 = com.zykj.subscriber.MainActivity.m8084y(r5)
                    r1 = 0
                    if (r5 == 0) goto L51
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    com.zykj.subscriber.MainActivity.m8040D(r5, r1)
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    com.zykj.subscriber.MainActivity.m8082w(r5)
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    com.zykj.subscriber.MainActivity.m8085z(r5)
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    java.lang.String r2 = com.zykj.subscriber.MainActivity.m8074o(r5)
                    com.zykj.subscriber.MainActivity.m8081v(r5, r2)
                L51:
                    java.lang.String r5 = r0.m8918a()
                    r0 = 1
                    if (r5 != 0) goto L5a
                L58:
                    r5 = 0
                    goto L66
                L5a:
                    int r5 = r5.length()
                    if (r5 <= 0) goto L62
                    r5 = 1
                    goto L63
                L62:
                    r5 = 0
                L63:
                    if (r5 != r0) goto L58
                    r5 = 1
                L66:
                    if (r5 == 0) goto L7b
                    com.zykj.subscriber.MainActivity r5 = r4.f9887a
                    com.zykj.subscriber.update.c r5 = com.zykj.subscriber.MainActivity.m8077r(r5)
                    if (r5 != 0) goto L76
                    java.lang.String r5 = "updateVersionManager"
                    kotlin.jvm.internal.C2769l.m9256t(r5)
                    r5 = 0
                L76:
                    r2 = 1304(0x518, float:1.827E-42)
                    r5.m8155h(r0, r1, r2)
                L7b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.subscriber.MainActivity.C2426h.a.m8111a(com.zykj.message.server.bean.UserInfo):void"); // DEX body: android/在线专栏/smali/com/zykj/subscriber/MainActivity$h$a.smali:49
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(UserInfo userInfo) {
                m8111a(userInfo);
                return C2925r.f11415a;
            }
        }

        C2426h() {
            super(1);
        }

        /* renamed from: a */
        public final void m8110a(@NotNull ServerInfo it) {
            C2769l.m9241e(it, "it");
            if (it.m8009b() == Status.LOGIN) {
                C2656a.f10552a.m8925i(it);
                EnumC3509b.f12309a.mo10698d(new a(MainActivity.this));
            }
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
            m8110a(serverInfo);
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$i */
    public static final class C2427i extends WebChromeClient {
        C2427i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m8115d(JsResult jsResult, MaterialDialog dialog, DialogAction noName_1) {
            C2769l.m9241e(dialog, "dialog");
            C2769l.m9241e(noName_1, "$noName_1");
            dialog.dismiss();
            if (jsResult == null) {
                return;
            }
            jsResult.confirm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m8116e(JsResult jsResult, MaterialDialog dialog, DialogAction noName_1) {
            C2769l.m9241e(dialog, "dialog");
            C2769l.m9241e(noName_1, "$noName_1");
            dialog.dismiss();
            if (jsResult == null) {
                return;
            }
            jsResult.confirm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m8117f(JsResult jsResult, MaterialDialog dialog, DialogAction noName_1) {
            C2769l.m9241e(dialog, "dialog");
            C2769l.m9241e(noName_1, "$noName_1");
            dialog.dismiss();
            if (jsResult == null) {
                return;
            }
            jsResult.cancel();
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(@Nullable String str, int i4, @Nullable String str2) {
            super.onConsoleMessage(str, i4, str2);
            Log.i("onConsoleMessage", String.valueOf(str));
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            super.onHideCustomView();
            MainActivity.this.m8049N();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable final JsResult jsResult) {
            new MaterialDialog.Builder(MainActivity.this).title("提示").content(String.valueOf(str2)).positiveText("确认").onPositive(new MaterialDialog.SingleButtonCallback() { // from class: c2.m
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MainActivity.C2427i.m8115d(jsResult, materialDialog, dialogAction);
                }
            }).show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable final JsResult jsResult) {
            new MaterialDialog.Builder(MainActivity.this).title("提示").content(String.valueOf(str2)).cancelable(false).positiveText("确认").negativeText("取消").onPositive(new MaterialDialog.SingleButtonCallback() { // from class: c2.k
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MainActivity.C2427i.m8116e(jsResult, materialDialog, dialogAction);
                }
            }).onNegative(new MaterialDialog.SingleButtonCallback() { // from class: c2.l
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MainActivity.C2427i.m8117f(jsResult, materialDialog, dialogAction);
                }
            }).show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@Nullable WebView webView, int i4) {
            if (i4 == 100) {
                ((SwipeRefreshLayout) MainActivity.this.m8089l(C1082u.f6297j)).setRefreshing(false);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            MainActivity.this.getWindow().setFlags(1024, 1024);
            ((WebView) MainActivity.this.m8089l(C1082u.f6301n)).setVisibility(4);
            if (MainActivity.this.f9839f != null) {
                if (customViewCallback == null) {
                    return;
                }
                customViewCallback.onCustomViewHidden();
            } else {
                MainActivity mainActivity = MainActivity.this;
                int i4 = C1082u.f6300m;
                ((FrameLayout) mainActivity.m8089l(i4)).addView(view);
                MainActivity.this.f9839f = view;
                MainActivity.this.f9840g = customViewCallback;
                ((FrameLayout) MainActivity.this.m8089l(i4)).setVisibility(0);
            }
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$j */
    public static final class C2428j extends WebViewClient {
        C2428j() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z3) {
            super.doUpdateVisitedHistory(webView, str, z3);
            Log.i("webUrl", C2769l.m9248l("doUpdateVisitedHistory -> ", str));
            if (MainActivity.this.f9843j) {
                MainActivity.this.f9843j = false;
                if (webView == null) {
                    return;
                }
                webView.clearHistory();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            MainActivity mainActivity = MainActivity.this;
            int i4 = C1082u.f6301n;
            ((WebView) mainActivity.m8089l(i4)).evaluateJavascript("\n                               (function () {\n                                  setInterval(function () {\n                                    var iframes = Array.prototype.slice.call(\n                                      document.querySelectorAll(\"iframe\")\n                                    );\n                                    var urls = [];\n                                    iframes.forEach(function (iframe) {\n                                      urls.push(iframe.getAttribute(\"src\"));\n                                    });\n                                    urls = urls.filter(function (url) {\n                                      if (url.charAt(0) === \"/\") return false;\n                                      return true;\n                                    });\n                                    if (window.JsToJava && window.JsToJava.checkUrls && urls.length) {\n                                      var data = window.JsToJava.checkUrls(JSON.stringify(urls));\n                                      var invalidUrls = JSON.parse(data);\n                                      for (var i = 0; i < invalidUrls.length; i++) {\n                                        var url = invalidUrls[i];\n                                        var frames = Array.prototype.slice.call(\n                                          document.querySelectorAll(\"iframe\")\n                                        );\n                                        var idx = frames.findIndex(function (item) {\n                                          return item.getAttribute(\"src\") === url;\n                                        });\n                                        if (idx > -1) {\n                                          frames[idx].remove();\n                                        }\n                                      }\n                                    }\n                                  }, 1000);\n                                })();\n                        ", null);
            if (str != null) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.f9842i = str;
                EnumC3509b.f12309a.mo10695a(str, "浏览器", "com.zykj.subscriber");
                InterfaceC2482h interfaceC2482hM8277b = C2484j.m8277b(new C2484j("http(s)?://[\\w.:]+/"), str, 0, 2, null);
                if (interfaceC2482hM8277b != null) {
                    ((TextView) mainActivity2.m8089l(C1082u.f6289b)).setText(Editable.Factory.getInstance().newEditable(C2769l.m9248l(interfaceC2482hM8277b.getValue(), "...")));
                    ((ImageView) mainActivity2.m8089l(C1082u.f6293f)).setSelected(((WebView) mainActivity2.m8089l(i4)).canGoBack());
                    ((ImageView) mainActivity2.m8089l(C1082u.f6294g)).setSelected(((WebView) mainActivity2.m8089l(i4)).canGoForward());
                    return;
                } else if (C2496v.m8381U(str, "file:///android_asset", 0, false, 6, null) > -1) {
                    ((TextView) mainActivity2.m8089l(C1082u.f6289b)).setText(Editable.Factory.getInstance().newEditable("error"));
                    ((ImageView) mainActivity2.m8089l(C1082u.f6293f)).setSelected(((WebView) mainActivity2.m8089l(i4)).canGoBack());
                    ((ImageView) mainActivity2.m8089l(C1082u.f6294g)).setSelected(((WebView) mainActivity2.m8089l(i4)).canGoForward());
                    return;
                }
            }
            ((TextView) MainActivity.this.m8089l(C1082u.f6289b)).setText(str);
            ((ImageView) MainActivity.this.m8089l(C1082u.f6293f)).setSelected(((WebView) MainActivity.this.m8089l(i4)).canGoBack());
            ((ImageView) MainActivity.this.m8089l(C1082u.f6294g)).setSelected(((WebView) MainActivity.this.m8089l(i4)).canGoForward());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView view, int i4, @Nullable String str, @Nullable String str2) {
            C2769l.m9241e(view, "view");
            super.onReceivedError(view, i4, str, str2);
            if (i4 == -8 || i4 == -6 || i4 == -2) {
                ((WebView) MainActivity.this.m8089l(C1082u.f6301n)).loadUrl(C2769l.m9248l("file:///android_asset/error.html?code=", Integer.valueOf(i4)));
            } else {
                if (i4 != -1) {
                    return;
                }
                ((WebView) MainActivity.this.m8089l(C1082u.f6301n)).loadUrl("file:///android_asset/error.html?code=网络未连接");
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            if (sslErrorHandler == null) {
                return;
            }
            sslErrorHandler.proceed();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            Log.i("OkHttp", C2769l.m9248l("shouldOverrideUrlLoading -> ", str));
            MainActivity mainActivity = MainActivity.this;
            C2769l.m9239c(str);
            return !mainActivity.m8044H(str);
        }
    }

    /* renamed from: com.zykj.subscriber.MainActivity$k */
    static final class C2429k extends AbstractC2770m implements InterfaceC3459a<C2925r> {
        C2429k() {
            super(0);
        }

        /* renamed from: a */
        public final void m8118a() {
            C2693b c2693b = MainActivity.this.f9838e;
            if (c2693b == null) {
                C2769l.m9256t("mainPresenter");
                c2693b = null;
            }
            c2693b.m9011f();
        }

        @Override // p171x2.InterfaceC3459a
        public /* bridge */ /* synthetic */ C2925r invoke() {
            m8118a();
            return C2925r.f11415a;
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$setupAuthListener$1", m9207f = "MainActivity.kt", m9208l = {1080}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.subscriber.MainActivity$l */
    static final class C2430l extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f9891b;

        /* renamed from: com.zykj.subscriber.MainActivity$l$a */
        public static final class a implements InterfaceC2669b<C2925r> {

            /* renamed from: a */
            final /* synthetic */ MainActivity f9893a;

            public a(MainActivity mainActivity) {
                this.f9893a = mainActivity;
            }

            @Override // p102i3.InterfaceC2669b
            @Nullable
            /* renamed from: a */
            public Object mo8120a(C2925r c2925r, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
                this.f9893a.m8065d0();
                return C2925r.f11415a;
            }
        }

        C2430l(InterfaceC3012d<? super C2430l> interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return MainActivity.this.new C2430l(interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2430l) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f9891b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                InterfaceC2675h<C2925r> interfaceC2675hM9544c = C2844e.f10946a.m9544c();
                a aVar = new a(MainActivity.this);
                this.f9891b = 1;
                if (interfaceC2675hM9544c.mo8948c(aVar, this) == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return C2925r.f11415a;
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.MainActivity$showReLoginDialog$1$1", m9207f = "MainActivity.kt", m9208l = {}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.subscriber.MainActivity$m */
    static final class C2431m extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f9894b;

        C2431m(InterfaceC3012d<? super C2431m> interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return MainActivity.this.new C2431m(interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2431m) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            if (this.f9894b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2920m.m9994b(obj);
            try {
                Intent launchIntentForPackage = MainActivity.this.getPackageManager().getLaunchIntentForPackage("com.zykj.manage");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    MainActivity.this.startActivity(launchIntentForPackage);
                }
                MainActivity mainActivity = MainActivity.this;
                Intent intent = new Intent();
                intent.setAction("com.zykj.action.zykj.LOGOUT");
                intent.setComponent(new ComponentName("com.zykj.manage", "com.zykj.center.receiver.LogoutReceiver"));
                mainActivity.sendBroadcast(intent);
            } catch (Exception e4) {
                Log.e("LOGOUT", C2769l.m9248l("启动目标应用失败: ", e4.getMessage()));
            }
            return C2925r.f11415a;
        }
    }

    public MainActivity() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectionSpecs(C2730l.m9142i(ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT));
        this.f9847n = builder.build();
        this.f9848o = new AliMessageReceiver(new C2429k());
        this.f9851r = new ServiceConnectionC2421c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final boolean m8044H(String str) {
        Object next;
        try {
            URL url = new URL(str);
            Iterator<T> it = this.f9844k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String host = url.getHost();
                C2769l.m9240d(host, "httpUrl.host");
                if (C2495u.m8342n(host, (String) next, false, 2, null)) {
                    break;
                }
            }
            if (((String) next) != null) {
                return true;
            }
            String strM8086L = m8086L(str);
            for (String str2 : f9835u) {
                if (C2769l.m9237a(str2, strM8086L)) {
                    return true;
                }
                if (C2496v.m8371K(str2, '*', false, 2, null) && C2495u.m8340C(strM8086L, C2496v.m8369I0(str2, '*'), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (MalformedURLException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* renamed from: I */
    private final void m8045I() {
        if (C2840a.m9537c(this)) {
            Intent intent = new Intent();
            intent.setPackage("cn.com.techvision.appstore");
            intent.setAction("cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE");
            bindService(intent, this.f9851r, 1);
        }
    }

    /* renamed from: J */
    private final void m8046J() {
        if (C2840a.m9537c(this)) {
            unbindService(this.f9851r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m8047K(String str, InterfaceC3470l<? super String, C2925r> interfaceC3470l) {
        if (!C2496v.m8366H(str, HttpConstant.HTTP, false, 2, null)) {
            m8024f("无法打开文件");
            return;
        }
        Application applicationM8199a = C2453b.m8199a();
        C2769l.m9240d(applicationM8199a, "context()");
        AppDatabase.C2375a c2375a = AppDatabase.f9701n;
        Application applicationM8199a2 = C2453b.m8199a();
        C2769l.m9240d(applicationM8199a2, "context()");
        C0505m.m2880a(this).m2877k(new C2422d(str, new DownloadFileWorkProxy(applicationM8199a, c2375a.m7977b(applicationM8199a2), null), interfaceC3470l, null));
    }

    /* renamed from: M */
    private final List<String> m8048M(String str) {
        String strM9539a = C2842c.f10943a.m9539a(str);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(strM9539a);
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m8049N() {
        if (this.f9839f == null) {
            return;
        }
        getWindow().clearFlags(1024);
        View view = this.f9839f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f9839f = null;
        int i4 = C1082u.f6300m;
        ((FrameLayout) m8089l(i4)).removeView(this.f9839f);
        ((FrameLayout) m8089l(i4)).setVisibility(8);
        WebChromeClient.CustomViewCallback customViewCallback = this.f9840g;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        ((WebView) m8089l(C1082u.f6301n)).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m8050O(UserInfo userInfo) {
        EnumC3509b.f12309a.mo10696b(new C2423e(userInfo, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m8051P(String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e4) {
            e4.printStackTrace();
            url = null;
        }
        this.f9844k.clear();
        if (url != null) {
            this.f9844k.add(url.getHost());
        } else {
            this.f9844k.add("zykj.org");
        }
    }

    /* renamed from: Q */
    private final void m8052Q() {
        new C3377b(this).m10278l("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
    }

    /* renamed from: R */
    private final void m8053R() {
        AliMessageReceiver aliMessageReceiver = this.f9848o;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alibaba.sdk.android.push.RECEIVE");
        C2925r c2925r = C2925r.f11415a;
        registerReceiver(aliMessageReceiver, intentFilter);
        EnumC3509b.f12309a.mo10701g(C2424f.f9882a);
    }

    /* renamed from: S */
    private final void m8054S() {
        C2656a.f10552a.m8924h(new C2425g());
    }

    /* renamed from: T */
    private final void m8055T() {
        EnumC3509b.f12309a.mo10697c(new C2426h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m8056U(MainActivity this$0) {
        C2769l.m9241e(this$0, "this$0");
        ((ImageView) this$0.m8089l(C1082u.f6295h)).performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m8057V() {
        String strM8919b;
        String strM8920c;
        C2656a c2656a = C2656a.f10552a;
        String strM8918a = c2656a.m8918a();
        if (strM8918a == null || (strM8919b = c2656a.m8919b()) == null || (strM8920c = c2656a.m8920c()) == null) {
            return;
        }
        String strM8922f = c2656a.m8922f();
        if (strM8922f == null) {
            strM8922f = "";
        }
        int i4 = 0;
        if (strM8922f.length() == 0) {
            if (C2769l.m9237a(strM8920c, "dev")) {
                strM8922f = "http://demo.exam.zykj.org/dev";
            } else if (C2769l.m9237a(strM8920c, RequestConstant.ENV_TEST)) {
                strM8922f = "https://test.school.zykj.org";
            } else {
                StringBuilder sb = new StringBuilder();
                List listM8404r0 = C2496v.m8404r0(strM8918a, new String[]{"."}, false, 0, 6, null);
                Iterator it = listM8404r0.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (C2496v.m8366H((String) it.next(), "api", false, 2, null)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    i5 = 1;
                }
                int size = listM8404r0.size();
                while (i4 < size) {
                    int i6 = i4 + 1;
                    if (i4 == i5) {
                        sb.append("school");
                    } else {
                        sb.append((String) listM8404r0.get(i4));
                    }
                    if (i4 != listM8404r0.size() - 1) {
                        sb.append(".");
                    }
                    i4 = i6;
                }
                strM8922f = sb.toString();
                C2769l.m9240d(strM8922f, "StringBuilder().apply {\n…             }.toString()");
            }
        }
        String str = strM8922f + "/navPage.html?" + ("apiHost=" + strM8918a + "&apiToken=" + strM8919b + "&timestamp=" + System.currentTimeMillis()) + "#list";
        this.f9841h = str;
        this.f9842i = str;
        ((WebView) m8089l(C1082u.f6301n)).post(new Runnable() { // from class: c2.j
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.m8058W(this.f6257a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m8058W(MainActivity this$0) {
        C2769l.m9241e(this$0, "this$0");
        ((WebView) this$0.m8089l(C1082u.f6301n)).loadUrl(this$0.f9841h);
        Log.i("OkHttp", C2769l.m9248l("loadUrl -> ", this$0.f9841h));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: X */
    private final void m8059X() {
        ((SwipeRefreshLayout) m8089l(C1082u.f6297j)).setEnabled(false);
        int i4 = C1082u.f6301n;
        ((WebView) m8089l(i4)).getSettings().setJavaScriptEnabled(true);
        ((WebView) m8089l(i4)).setOnLongClickListener(new View.OnLongClickListener() { // from class: c2.h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MainActivity.m8060Y(view);
            }
        });
        ((WebView) m8089l(i4)).setOnClickListener(new View.OnClickListener() { // from class: c2.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m8061Z(view);
            }
        });
        WebView.setWebContentsDebuggingEnabled(true);
        ((WebView) m8089l(i4)).addJavascriptInterface(new C2420b(this), "JsToJava");
        ((WebView) m8089l(i4)).getSettings().setDomStorageEnabled(true);
        ((WebView) m8089l(i4)).getSettings().setAppCacheEnabled(true);
        ((WebView) m8089l(i4)).getSettings().setAppCachePath(getCacheDir().getAbsolutePath());
        ((WebView) m8089l(i4)).getSettings().setCacheMode(1);
        ((WebView) m8089l(i4)).getSettings().setSupportMultipleWindows(false);
        Object systemService = getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
        ((WebView) m8089l(i4)).setInitialScale((int) Math.ceil((r2.widthPixels * 100) / 1250));
        ((WebView) m8089l(i4)).setWebChromeClient(new C2427i());
        ((WebView) m8089l(i4)).setWebViewClient(new C2428j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final boolean m8060Y(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m8061Z(View view) {
    }

    /* renamed from: a0 */
    private final void m8062a0() {
        String string = C2841b.m9538a(this).getString("SP_WHITE_URL_JSON", null);
        if (string == null || string.length() == 0) {
            return;
        }
        f9835u.clear();
        f9835u.addAll(m8048M(string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m8063b0() {
        C2693b c2693b = this.f9838e;
        if (c2693b == null) {
            C2769l.m9256t("mainPresenter");
            c2693b = null;
        }
        c2693b.m9011f();
    }

    /* renamed from: c0 */
    private final void m8064c0() {
        C2560i.m8574d(C0505m.m2880a(this), null, null, new C2430l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m8065d0() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        DialogC0101b dialogC0101b = this.f9850q;
        if (dialogC0101b != null) {
            if (!((dialogC0101b == null || dialogC0101b.isShowing()) ? false : true)) {
                return;
            }
        }
        DialogC0101b dialogC0101bCreate = new DialogC0101b.a(this).setTitle("提示").setMessage("用户身份过期，请重新登录").setCancelable(false).setPositiveButton("我知道了", new DialogInterface.OnClickListener() { // from class: c2.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                MainActivity.m8066e0(this.f6253a, dialogInterface, i4);
            }
        }).create();
        this.f9850q = dialogC0101bCreate;
        if (dialogC0101bCreate == null) {
            return;
        }
        dialogC0101bCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m8066e0(MainActivity this$0, DialogInterface dialogInterface, int i4) {
        C2769l.m9241e(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.f9850q = null;
        C2560i.m8574d(C0505m.m2880a(this$0), null, null, this$0.new C2431m(null), 3, null);
    }

    @NotNull
    /* renamed from: L */
    public final String m8086L(@NotNull String url) {
        C2769l.m9241e(url, "url");
        if (C2496v.m8364G(url, '#', false, 2, null)) {
            url = url.substring(0, C2496v.m8380T(url, '#', 0, false, 6, null));
            C2769l.m9240d(url, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (!C2496v.m8364G(url, '?', false, 2, null)) {
            return url;
        }
        String strSubstring = url.substring(0, C2496v.m8380T(url, '?', 0, false, 6, null));
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // p091g2.InterfaceC2646b
    /* renamed from: a */
    public void mo8087a(@NotNull String e4) {
        C2769l.m9241e(e4, "e");
        Log.i("MainActivity", C2769l.m9248l("白名单请求失败，", e4));
        m8024f(e4);
    }

    @Override // p091g2.InterfaceC2646b
    /* renamed from: c */
    public void mo8088c(@NotNull String result) {
        C2769l.m9241e(result, "result");
        f9835u.clear();
        f9835u.addAll(m8048M(result));
        Log.i("MainActivity", "白名单请求成功。。");
        if (m8044H(this.f9842i)) {
            return;
        }
        this.f9843j = true;
        ((WebView) m8089l(C1082u.f6301n)).loadUrl(this.f9841h);
    }

    @Override // com.zykj.subscriber.BaseActivity
    /* renamed from: e */
    public void mo8023e() {
        AbstractC3454w.m10525e(this).mo10527a();
        this.f9838e = new C2693b(this, this);
        this.f9849p = new C2441c(this);
        m8054S();
        m8062a0();
        m8053R();
    }

    @Override // com.zykj.subscriber.BaseActivity
    public void initView() {
        m8022d(R.id.iv_back, R.id.iv_forward, R.id.iv_home, R.id.iv_refresh);
        ((SwipeRefreshLayout) m8089l(C1082u.f6297j)).setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0667j() { // from class: c2.i
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0667j
            /* renamed from: a */
            public final void mo3715a() {
                MainActivity.m8056U(this.f6256a);
            }
        });
        ((ImageView) m8089l(C1082u.f6294g)).setSelected(false);
        ((ImageView) m8089l(C1082u.f6293f)).setSelected(false);
        ((TextView) m8089l(C1082u.f6289b)).setLongClickable(false);
        m8059X();
    }

    @Nullable
    /* renamed from: l */
    public View m8089l(int i4) {
        Map<Integer, View> map = this.f9836c;
        View view = map.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i4 = C1082u.f6301n;
        if (((WebView) m8089l(i4)).canGoBack()) {
            ((WebView) m8089l(i4)).goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        m8045I();
        m8064c0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        ProgressDialog progressDialog;
        DialogC0101b dialogC0101b = this.f9850q;
        if (dialogC0101b != null) {
            dialogC0101b.dismiss();
        }
        this.f9850q = null;
        super.onDestroy();
        ((FrameLayout) m8089l(C1082u.f6300m)).removeAllViews();
        int i4 = C1082u.f6301n;
        ((WebView) m8089l(i4)).loadUrl("about:blank");
        ((WebView) m8089l(i4)).stopLoading();
        ((WebView) m8089l(i4)).setWebChromeClient(null);
        ((WebView) m8089l(i4)).destroy();
        m8046J();
        unregisterReceiver(this.f9848o);
        ProgressDialog progressDialog2 = this.f9852s;
        if (progressDialog2 == null) {
            return;
        }
        boolean z3 = false;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            z3 = true;
        }
        if (z3 && (progressDialog = this.f9852s) != null) {
            progressDialog.dismiss();
        }
        this.f9852s = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, @Nullable KeyEvent keyEvent) {
        if (i4 != 4 || this.f9839f == null) {
            return super.onKeyDown(i4, keyEvent);
        }
        m8049N();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        m8052Q();
        m8055T();
    }

    @Override // com.zykj.subscriber.BaseActivity
    public void onViewClick(@Nullable View view) {
        Integer numValueOf = view == null ? null : Integer.valueOf(view.getId());
        if (numValueOf != null && numValueOf.intValue() == R.id.iv_back) {
            int i4 = C1082u.f6301n;
            if (((WebView) m8089l(i4)).canGoBack()) {
                ((WebView) m8089l(i4)).goBack();
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.iv_forward) {
            int i5 = C1082u.f6301n;
            if (((WebView) m8089l(i5)).canGoForward()) {
                ((WebView) m8089l(i5)).goForward();
                return;
            }
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.iv_refresh) {
            if (numValueOf != null && numValueOf.intValue() == R.id.iv_home) {
                this.f9843j = true;
                ((WebView) m8089l(C1082u.f6301n)).loadUrl(this.f9841h);
                return;
            }
            return;
        }
        C2843d c2843d = C2843d.f10944a;
        c2843d.m9541b(0L);
        File cacheDir = getCacheDir();
        C2769l.m9240d(cacheDir, "cacheDir");
        c2843d.m9540a(cacheDir);
        int i6 = C1082u.f6301n;
        ((WebView) m8089l(i6)).clearCache(true);
        ((WebView) m8089l(i6)).loadUrl(this.f9842i);
        ((WebView) m8089l(i6)).loadUrl("javascript:window.location.reload(true)");
    }
}
