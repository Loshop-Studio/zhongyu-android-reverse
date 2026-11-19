package p079e7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p079e7.C7399o0;
import p202p7.C8860d;

/* renamed from: e7.o0 */
/* loaded from: classes4.dex */
public final class C7399o0 extends RelativeLayout {

    /* renamed from: g */
    public static final a f12055g = new a(null);

    /* renamed from: h */
    public static final int f12056h = 8;

    /* renamed from: a */
    public final WebView f12057a;

    /* renamed from: b */
    public String f12058b;

    /* renamed from: c */
    public int f12059c;

    /* renamed from: d */
    public int f12060d;

    /* renamed from: e */
    public int f12061e;

    /* renamed from: f */
    public Function1 f12062f;

    /* renamed from: e7.o0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: e7.o0$b */
    public static final class b extends WebViewClient {
        public b() {
        }

        /* renamed from: b */
        public static final void m11886b(C7399o0 c7399o0, WebView webView) {
            Function1<WebView, Unit> pageFinishListener = c7399o0.getPageFinishListener();
            if (pageFinishListener != null) {
                pageFinishListener.invoke(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, String str) {
            if (webView != null) {
                webView.loadUrl("javascript:function setTop(){var toolBar = document.querySelector('.toolBar');if(toolBar != null) toolBar.style.display=\"none\";document.querySelector(\"head\").innerHTML = document.querySelector('head').innerHTML + '<style lang=\"en\" type=\"text/css\">   body,html {       padding-bottom: 10px;   }</style>';}setTop();");
            }
            final C7399o0 c7399o0 = C7399o0.this;
            c7399o0.postDelayed(new Runnable() { // from class: e7.p0
                @Override // java.lang.Runnable
                public final void run() {
                    C7399o0.b.m11886b(c7399o0, webView);
                }
            }, 200L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            if (i10 != -8 && i10 != -6 && i10 != -2) {
                if (i10 == -1 && webView != null) {
                    webView.loadUrl("file:///android_asset/error.html?code=网络未连接");
                    return;
                }
                return;
            }
            if (webView != null) {
                webView.loadUrl("file:///android_asset/error.html?code=" + i10);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str != null) {
                return StringsKt.contains$default((CharSequence) str, (CharSequence) C7399o0.this.f12058b, false, 2, (Object) null);
            }
            return true;
        }
    }

    public /* synthetic */ C7399o0(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* renamed from: c */
    public static final void m11880c(C7399o0 c7399o0) {
        c7399o0.m11883e();
    }

    /* renamed from: f */
    public static final boolean m11882f(View view) {
        return true;
    }

    /* renamed from: e */
    public final void m11883e() {
        this.f12057a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f12057a);
        C8860d c8860d = C8860d.f15070b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM14861b = c8860d.m14861b(context, "STEM_SCALE_OFFSET", 0);
        this.f12061e = iM14861b;
        this.f12057a.setInitialScale(this.f12059c + iM14861b);
        this.f12057a.setOnLongClickListener(new View.OnLongClickListener() { // from class: e7.n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C7399o0.m11882f(view);
            }
        });
        this.f12057a.setVerticalScrollBarEnabled(false);
        this.f12057a.setHorizontalScrollBarEnabled(false);
        this.f12057a.getSettings().setJavaScriptEnabled(true);
        this.f12057a.getSettings().setMixedContentMode(0);
        this.f12057a.setWebViewClient(new b());
    }

    /* renamed from: g */
    public final void m11884g(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f12057a.clearView();
        this.f12057a.loadUrl(url);
        this.f12058b = url;
    }

    public final Function1<WebView, Unit> getPageFinishListener() {
        return this.f12062f;
    }

    public final WebView getWebView() {
        return this.f12057a;
    }

    public final void setPageFinishListener(Function1<? super WebView, Unit> function1) {
        this.f12062f = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7399o0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12057a = new WebView(context);
        this.f12058b = "";
        this.f12059c = 150;
        this.f12060d = 50;
        post(new Runnable() { // from class: e7.m0
            @Override // java.lang.Runnable
            public final void run() {
                C7399o0.m11880c(this.f12054a);
            }
        });
    }
}
