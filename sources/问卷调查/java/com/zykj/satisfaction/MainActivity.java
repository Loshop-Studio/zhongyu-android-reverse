package com.zykj.satisfaction;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.satisfaction.MainActivity;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.p005b.p006c.ActivityC0021g;
import p000a.p031h.p032b.C0187b;
import p000a.p031h.p033c.C0192a;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0787a;
import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p070b.p146d.p147a.p150d.p151c.C0893c;
import p070b.p146d.p147a.p150d.p151c.EnumC0892b;
import p070b.p146d.p152b.C0896c;
import p070b.p146d.p152b.C0897d;
import p070b.p146d.p152b.C0899f;
import p070b.p146d.p152b.ViewOnKeyListenerC0898e;
import p070b.p146d.p152b.p153h.C0901a;
import p070b.p146d.p152b.p154i.C0904c;
import p070b.p146d.p152b.p154i.C0905d;
import p070b.p146d.p152b.p154i.C0907f;
import p160d.C0994d;
import p160d.p161e.C0997c;
import p160d.p161e.C0999e;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.AbstractC1012e;
import p160d.p162f.p164b.C1011d;
import p160d.p165g.C1017c;
import p160d.p166h.C1019b;
import p160d.p167i.C1021b;
import p160d.p167i.C1026g;
import p160d.p167i.C1027h;
import p168e.C1041n;

/* loaded from: classes.dex */
public final class MainActivity extends ActivityC0021g {

    /* renamed from: u */
    public static volatile boolean f5439u;

    /* renamed from: o */
    public C0907f f5440o;

    /* renamed from: p */
    public C0901a f5441p;

    /* renamed from: q */
    public C0891a f5442q;

    /* renamed from: r */
    public C0893c f5443r;

    /* renamed from: s */
    public final ArrayList<String> f5444s;

    /* renamed from: t */
    public List<String> f5445t;

    /* renamed from: com.zykj.satisfaction.MainActivity$a */
    public final class C0989a {

        /* renamed from: a */
        public final /* synthetic */ MainActivity f5446a;

        /* renamed from: com.zykj.satisfaction.MainActivity$a$a */
        public static final class a extends AbstractC1012e implements InterfaceC1006b<C0891a, C0994d> {

            /* renamed from: b */
            public final /* synthetic */ MainActivity f5447b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity) {
                super(1);
                this.f5447b = mainActivity;
            }

            @Override // p160d.p162f.p163a.InterfaceC1006b
            /* renamed from: c */
            public C0994d mo2586c(C0891a c0891a) {
                String str;
                C0891a c0891a2 = c0891a;
                if (c0891a2 == null || (str = c0891a2.f4732d) == null) {
                    str = BuildConfig.FLAVOR;
                }
                if (str.length() > 0) {
                    this.f5447b.f5442q = c0891a2;
                    Log.i("OkHttp", "网页报错，回调返回");
                    final MainActivity mainActivity = this.f5447b;
                    mainActivity.runOnUiThread(new Runnable() { // from class: b.d.b.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            MainActivity mainActivity2 = mainActivity;
                            C1011d.m2809e(mainActivity2, "this$0");
                            boolean z = MainActivity.f5439u;
                            MainActivity.m2792v(mainActivity2);
                            MainActivity.f5439u = false;
                        }
                    });
                }
                return C0994d.f5474a;
            }
        }

        public C0989a(MainActivity mainActivity) {
            C1011d.m2809e(mainActivity, "this$0");
            this.f5446a = mainActivity;
        }

        @JavascriptInterface
        public final void refreshToken() {
            Log.i("OkHttp", "网页报错，调用refreshToken");
            if (!MainActivity.f5439u) {
                MainActivity.f5439u = true;
                EnumC0881b.f4691b.mo2579d(new a(this.f5446a));
            }
            C0901a c0901a = this.f5446a.f5441p;
            if (c0901a != null) {
                c0901a.f4753b.stopLoading();
            } else {
                C1011d.m2816l("binding");
                throw null;
            }
        }
    }

    /* renamed from: com.zykj.satisfaction.MainActivity$b */
    public static final class C0990b extends AbstractC1012e implements InterfaceC1006b<C0891a, C0994d> {
        public C0990b() {
            super(1);
        }

        @Override // p160d.p162f.p163a.InterfaceC1006b
        /* renamed from: c */
        public C0994d mo2586c(C0891a c0891a) {
            C0891a c0891a2 = c0891a;
            C1011d.m2809e(c0891a2, "serverInfo");
            if (c0891a2.f4730b == EnumC0892b.LOGIN) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f5442q = c0891a2;
                String str = c0891a2.f4732d;
                if (str != null) {
                    C0907f c0907f = mainActivity.f5440o;
                    if (c0907f == null) {
                        C1011d.m2816l("updateVersionManager");
                        throw null;
                    }
                    String str2 = str + "/api/services/app/AppStore/CheckUpdateAsync?packageName=com.zykj.satisfaction&version=8&appType=0";
                    if (!((Activity) c0907f.f4761a).isFinishing()) {
                        Context context = c0907f.f4761a;
                        ProgressDialog progressDialogShow = ProgressDialog.show(context, context.getString(C1088R.string.update_title), c0907f.f4761a.getString(C1088R.string.update_content));
                        c0907f.f4763c = progressDialogShow;
                        progressDialogShow.setCanceledOnTouchOutside(true);
                    }
                    c0907f.f4764d = new C0907f.d(new C0904c(c0907f));
                    new C0905d(c0907f, str2, 8).start();
                }
                EnumC0881b.f4691b.mo2577b(new C0899f(MainActivity.this));
            } else {
                C0901a c0901a = MainActivity.this.f5441p;
                if (c0901a == null) {
                    C1011d.m2816l("binding");
                    throw null;
                }
                c0901a.f4753b.clearHistory();
                C0901a c0901a2 = MainActivity.this.f5441p;
                if (c0901a2 == null) {
                    C1011d.m2816l("binding");
                    throw null;
                }
                c0901a2.f4753b.loadUrl("about:blank");
            }
            return C0994d.f5474a;
        }
    }

    public MainActivity() {
        new C1041n();
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        C1011d.m2809e(strArr, "elements");
        this.f5444s = new ArrayList<>(new C0997c(strArr, true));
        this.f5445t = C0999e.m2797d("zywj.mmteck.cn", "zyclsroom.mmteck.cn", "test-room.mmteck.cn", "test-wj.mmteck.cn");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* renamed from: v */
    public static final void m2792v(MainActivity mainActivity) {
        String string;
        String strSubstring;
        ?? arrayList;
        C0891a c0891a = mainActivity.f5442q;
        String str = c0891a == null ? null : c0891a.f4731c;
        if (str == null) {
            return;
        }
        String str2 = c0891a == null ? null : c0891a.f4732d;
        if (str2 == null) {
            return;
        }
        C0893c c0893c = mainActivity.f5443r;
        String str3 = c0893c == null ? null : c0893c.f4740c;
        if (str3 == null) {
            return;
        }
        if (c0891a == null || (string = c0891a.f4734f) == null) {
            string = BuildConfig.FLAVOR;
        }
        if (string.length() == 0) {
            if (C1011d.m2805a(str3, "dev") ? true : C1011d.m2805a(str3, "test")) {
                string = "http://demo.exam.zykj.org/dev";
            } else {
                StringBuilder sb = new StringBuilder();
                String[] strArr = {"."};
                C1011d.m2809e(str, "$this$split");
                C1011d.m2809e(strArr, "delimiters");
                String str4 = strArr[0];
                if (str4.length() == 0) {
                    C1011d.m2809e(strArr, "$this$asList");
                    List listAsList = Arrays.asList(strArr);
                    C1011d.m2808d(listAsList, "ArraysUtilJVM.asList(this)");
                    C1021b c1021b = new C1021b(str, 0, 0, new C1027h(listAsList, false));
                    C1011d.m2809e(c1021b, "$this$asIterable");
                    Iterable c1019b = new C1019b(c1021b);
                    C1011d.m2809e(c1019b, "$this$collectionSizeOrDefault");
                    arrayList = new ArrayList(c1019b instanceof Collection ? ((Collection) c1019b).size() : 10);
                    Iterator it = c1019b.iterator();
                    while (it.hasNext()) {
                        C1017c c1017c = (C1017c) it.next();
                        C1011d.m2809e(str, "$this$substring");
                        C1011d.m2809e(c1017c, "range");
                        arrayList.add(str.subSequence(Integer.valueOf(c1017c.f5485b).intValue(), Integer.valueOf(c1017c.f5486c).intValue() + 1).toString());
                    }
                } else {
                    int iM2822e = C1026g.m2822e(str, str4, 0, false);
                    if (iM2822e != -1) {
                        arrayList = new ArrayList(10);
                        int length = 0;
                        do {
                            arrayList.add(str.subSequence(length, iM2822e).toString());
                            length = str4.length() + iM2822e;
                            iM2822e = C1026g.m2822e(str, str4, length, false);
                        } while (iM2822e != -1);
                        arrayList.add(str.subSequence(length, str.length()).toString());
                    } else {
                        arrayList = C0787a.m2489w(str.toString());
                    }
                }
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (C1026g.m2819b((String) it2.next(), "api", false, 2)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    i = 1;
                }
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        sb.append(i2 == i ? "school" : (String) arrayList.get(i2));
                        if (i2 != arrayList.size() - 1) {
                            sb.append(".");
                        }
                        if (i3 > size) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                string = sb.toString();
                C1011d.m2808d(string, "StringBuilder().apply {\n                    val list = apiHost.split(\".\")\n                    var index = list.indexOfFirst { it.contains(\"api\") }\n                    if (index == -1) {\n                        index = 1\n                    }\n                    for (i in list.indices) {\n                        if (i == index) {\n                            append(\"school\")\n                        } else {\n                            append(list[i])\n                        }\n                        if (i != list.size - 1) {\n                            append(\".\")\n                        }\n                    }\n                }.toString()");
            }
        }
        StringBuilder sbM2079g = C0561a.m2079g("time=");
        sbM2079g.append(System.currentTimeMillis());
        sbM2079g.append("&apiHost=");
        sbM2079g.append(str);
        sbM2079g.append("&apiToken=");
        sbM2079g.append(str2);
        sbM2079g.append("&schoolCode=");
        sbM2079g.append(str3);
        String str5 = string + "/index.html?" + sbM2079g.toString() + "#index/questionnaireQuery";
        if (C1026g.m2818a(str5, '#', false, 2)) {
            strSubstring = str5.substring(0, C1026g.m2825h(str5, '#', 0, false, 6));
            C1011d.m2808d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            strSubstring = str5;
        }
        if (C1026g.m2818a(strSubstring, '?', false, 2)) {
            strSubstring = strSubstring.substring(0, C1026g.m2825h(strSubstring, '?', 0, false, 6));
            C1011d.m2808d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (!mainActivity.f5445t.contains(strSubstring)) {
            mainActivity.f5445t.add(strSubstring);
        }
        C0901a c0901a = mainActivity.f5441p;
        if (c0901a != null) {
            c0901a.f4753b.loadUrl(str5);
        } else {
            C1011d.m2816l("binding");
            throw null;
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(C1088R.layout.activity_main, (ViewGroup) null, false);
        WebView webView = (WebView) viewInflate.findViewById(C1088R.id.webView);
        if (webView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(C1088R.id.webView)));
        }
        C0901a c0901a = new C0901a((ConstraintLayout) viewInflate, webView);
        C1011d.m2808d(c0901a, "inflate(layoutInflater)");
        this.f5441p = c0901a;
        if (c0901a == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        setContentView(c0901a.f4752a);
        C0901a c0901a2 = this.f5441p;
        if (c0901a2 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        WebSettings settings = c0901a2.f4753b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        C0901a c0901a3 = this.f5441p;
        if (c0901a3 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        c0901a3.f4753b.setOnLongClickListener(new View.OnLongClickListener() { // from class: b.d.b.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean z = MainActivity.f5439u;
                return true;
            }
        });
        C0901a c0901a4 = this.f5441p;
        if (c0901a4 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        c0901a4.f4753b.addJavascriptInterface(new C0989a(this), "JsToJava");
        C0901a c0901a5 = this.f5441p;
        if (c0901a5 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        c0901a5.f4753b.setWebViewClient(new C0896c(this));
        C0901a c0901a6 = this.f5441p;
        if (c0901a6 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        c0901a6.f4753b.setWebChromeClient(new C0897d());
        C0901a c0901a7 = this.f5441p;
        if (c0901a7 == null) {
            C1011d.m2816l("binding");
            throw null;
        }
        c0901a7.f4753b.setOnKeyListener(new ViewOnKeyListenerC0898e(this));
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f5444s.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C1011d.m2808d(next, "mPermissions");
            String str = next;
            if (C0192a.m732a(this, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int i = C0187b.f1402b;
            for (String str2 : strArr) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder sbM2079g = C0561a.m2079g("Permission request for permissions ");
                    sbM2079g.append(Arrays.toString(strArr));
                    sbM2079g.append(" must not contain null or empty values");
                    throw new IllegalArgumentException(sbM2079g.toString());
                }
            }
            requestPermissions(strArr, 0);
        }
        this.f5440o = new C0907f(this);
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int length;
        C1011d.m2809e(strArr, "permissions");
        C1011d.m2809e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0 || strArr.length - 1 < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (iArr[i2] == -1) {
                Toast.makeText(this, getString(C1088R.string.users_refuse_permission_applications), 0).show();
            } else {
                Log.i("PermissionActivity", C1011d.m2814j(strArr[i2], "==>>success"));
            }
            if (i3 > length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onResume() {
        super.onResume();
        EnumC0881b.f4691b.mo2576a(new C0990b());
    }
}
