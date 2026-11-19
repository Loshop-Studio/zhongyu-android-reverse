package com.zykj.curricula;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.utlils.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006!"}, m18d2 = {"Lcom/zykj/curricula/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "apiHost", com.zykj.message.client.BuildConfig.FLAVOR, "apiToken", "homeUrl", "isInitSuccess", com.zykj.message.client.BuildConfig.FLAVOR, "localWhiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "permissions", com.zykj.message.client.BuildConfig.FLAVOR, "[Ljava/lang/String;", "checkIsInWhiteWebUrlList", "url", "getPermission", com.zykj.message.client.BuildConfig.FLAVOR, "initWebViewUrl", "initWhiteUrlList", "initialize", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", com.zykj.message.client.BuildConfig.FLAVOR, NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onResume", "requestUserCenter", "JsToJava", "app_release"}, m19k = 1, m20mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private String apiHost;
    private String apiToken;
    private String homeUrl;
    private boolean isInitSuccess;
    private String[] permissions = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private final ArrayList<String> localWhiteList = new ArrayList<>();

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0230R.layout.activity_main);
        getPermission();
        initialize();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        requestUserCenter();
    }

    private final void initialize() {
        WebView.setWebContentsDebuggingEnabled(true);
        WebView web_curricula = (WebView) _$_findCachedViewById(C0230R.id.web_curricula);
        Intrinsics.checkNotNullExpressionValue(web_curricula, "web_curricula");
        WebSettings settings = web_curricula.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "web_curricula.settings");
        settings.setJavaScriptEnabled(true);
        ((WebView) _$_findCachedViewById(C0230R.id.web_curricula)).addJavascriptInterface(new JsToJava(), "JsToJava");
        WebView web_curricula2 = (WebView) _$_findCachedViewById(C0230R.id.web_curricula);
        Intrinsics.checkNotNullExpressionValue(web_curricula2, "web_curricula");
        WebSettings settings2 = web_curricula2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "web_curricula.settings");
        settings2.setDomStorageEnabled(true);
        Object systemService = getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        double d = displayMetrics.widthPixels;
        double d2 = 100;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = 1250;
        Double.isNaN(d4);
        ((WebView) _$_findCachedViewById(C0230R.id.web_curricula)).setInitialScale((int) Math.ceil(d3 / d4));
        WebView web_curricula3 = (WebView) _$_findCachedViewById(C0230R.id.web_curricula);
        Intrinsics.checkNotNullExpressionValue(web_curricula3, "web_curricula");
        web_curricula3.setWebViewClient(new WebViewClient() { // from class: com.zykj.curricula.MainActivity.initialize.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null) {
                    return !MainActivity.this.checkIsInWhiteWebUrlList(url);
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                ((WebView) MainActivity.this._$_findCachedViewById(C0230R.id.web_curricula)).loadUrl("javascript:window.localStorage.setItem('apiToken', '" + MainActivity.this.apiToken + "')");
                ((WebView) MainActivity.this._$_findCachedViewById(C0230R.id.web_curricula)).loadUrl("javascript:window.localStorage.setItem('expiresTime', '" + (System.currentTimeMillis() + 889032704) + "')");
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (url != null) {
                    MessageClient.INSTANCES.checkUrl(url, "选课", BuildConfig.APPLICATION_ID);
                }
            }
        });
    }

    /* compiled from: MainActivity.kt */
    @Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m18d2 = {"Lcom/zykj/curricula/MainActivity$JsToJava;", com.zykj.message.client.BuildConfig.FLAVOR, "(Lcom/zykj/curricula/MainActivity;)V", "refreshToken", com.zykj.message.client.BuildConfig.FLAVOR, "app_release"}, m19k = 1, m20mv = {1, 4, 1})
    public final class JsToJava {
        public JsToJava() {
        }

        @JavascriptInterface
        public final void refreshToken() {
            Log.i("OkHttp", "网页报错，调用refreshToken");
            MessageClient.INSTANCES.refreshToken(new Function1<ServerInfo, Unit>() { // from class: com.zykj.curricula.MainActivity$JsToJava$refreshToken$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                    invoke2(serverInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ServerInfo serverInfo) {
                    String token;
                    if (serverInfo == null || (token = serverInfo.getToken()) == null) {
                        token = com.zykj.message.client.BuildConfig.FLAVOR;
                    }
                    if (token.length() > 0) {
                        Log.i("OkHttp", "网页报错，回调返回");
                        MainActivity.this.apiToken = token;
                        MainActivity.this.initWebViewUrl();
                    }
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private final void getPermission() {
        if (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return;
        }
        requestPermissions(this.permissions, 0);
    }

    private final void requestUserCenter() {
        MessageClient.INSTANCES.getServerInfo(new Function1<ServerInfo, Unit>() { // from class: com.zykj.curricula.MainActivity.requestUserCenter.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                invoke2(serverInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ServerInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getStatus() != Status.LOGIN || MainActivity.this.isInitSuccess) {
                    return;
                }
                MainActivity.this.isInitSuccess = true;
                MainActivity.this.apiHost = it.getServerUrl();
                MainActivity.this.apiToken = it.getToken();
                MainActivity.this.initWebViewUrl();
                MainActivity.this.initWhiteUrlList();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initWebViewUrl() {
        this.homeUrl = "http://demo.exam.zykj.org/dev/index.html?apiHost=" + this.apiHost + "&apiToken=" + this.apiToken + "#/index/courseChoosing/StudentsCoursesList";
        String str = this.apiHost;
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "test", false, 2, (Object) null)) {
            this.homeUrl = "http://test.school.zykj.org/index.html?apiHost=" + this.apiHost + "&apiToken=" + this.apiToken + "#/index/courseChoosing/StudentsCoursesList";
        } else {
            String str2 = this.apiHost;
            if (str2 != null && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "dev.xxg.zyyx.cc", false, 2, (Object) null)) {
                String str3 = this.apiHost;
                Intrinsics.checkNotNull(str3);
                List listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{"."}, false, 0, 6, (Object) null);
                Iterator it = listSplit$default.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (StringsKt.contains$default((CharSequence) it.next(), (CharSequence) "api", false, 2, (Object) null)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    i = 1;
                }
                StringBuilder sb = new StringBuilder();
                int size = listSplit$default.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i2 == i) {
                        sb.append("school");
                    } else {
                        sb.append((String) listSplit$default.get(i2));
                    }
                    if (i2 != listSplit$default.size() - 1) {
                        sb.append(".");
                    }
                }
                this.homeUrl = ((Object) sb) + "/index.html?apiHost=" + this.apiHost + "&apiToken=" + this.apiToken + "#/index/courseChoosing/StudentsCoursesList";
            }
        }
        LogUtils.m13i("MainActivity", String.valueOf(System.currentTimeMillis() + 889032704));
        LogUtils.m13i("loadUrl", String.valueOf(this.homeUrl));
        ((WebView) _$_findCachedViewById(C0230R.id.web_curricula)).post(new Runnable() { // from class: com.zykj.curricula.MainActivity.initWebViewUrl.1
            @Override // java.lang.Runnable
            public final void run() {
                ((WebView) MainActivity.this._$_findCachedViewById(C0230R.id.web_curricula)).loadUrl(MainActivity.this.homeUrl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIsInWhiteWebUrlList(String url) {
        Object obj;
        try {
            URL url2 = new URL(url);
            Iterator<T> it = this.localWhiteList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String host = url2.getHost();
                Intrinsics.checkNotNullExpressionValue(host, "httpUrl.host");
                if (StringsKt.endsWith$default(host, (String) next, false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            return ((String) obj) != null;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initWhiteUrlList() {
        URL url;
        try {
            url = new URL(this.homeUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            url = null;
        }
        this.localWhiteList.clear();
        if (url != null) {
            this.localWhiteList.add(url.getHost());
        } else {
            this.localWhiteList.add("zykj.org");
        }
    }
}
