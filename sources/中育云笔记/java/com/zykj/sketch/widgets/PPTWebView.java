package com.zykj.sketch.widgets;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.PPTListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes6.dex */
public final class PPTWebView extends WebView implements PPTControl {
    public Map<Integer, View> _$_findViewCache;
    private PPTListener pptListener;

    public final class SlideInterface {
        public SlideInterface() {
        }

        @JavascriptInterface
        public final void setCurrentSlide(int i10) {
            PPTListener pPTListener = PPTWebView.this.pptListener;
            if (pPTListener != null) {
                pPTListener.currentPage(i10);
            }
        }

        @JavascriptInterface
        public final void setTotalCount(int i10) {
            PPTListener pPTListener = PPTWebView.this.pptListener;
            if (pPTListener != null) {
                pPTListener.totalPageCount(i10);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PPTWebView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void goPage(int i10) {
        loadUrl("javascript:Presentation.GotoSlide('" + i10 + "')");
    }

    // Registers the SlideNative page counters, loads the supplied path, then requests
    // an assets/ppt/demo.html that is missing from this APK. Verified on Android 11.
    public final void loadSlider(String path) {
        AbstractC9979u.m20294g(path, "path");
        addJavascriptInterface(new SlideInterface(), "SlideNative");
        loadUrl(String.valueOf(path));
        loadUrl("file:///android_asset/ppt/demo.html");
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void nextAction() {
        loadUrl("javascript:Presentation.Next()");
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void nextSlide() {
        loadUrl("javascript:Presentation.NxtSlide()");
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        return false;
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void preAction() {
        loadUrl("javascript:Presentation.Prev()");
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void preSlide() {
        loadUrl("javascript:Presentation.PrvSlide()");
    }

    public final void setListener(PPTListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.pptListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PPTWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PPTWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(true);
        setLayerType(1, null);
        setClickable(false);
        setWebViewClient(new WebViewClient() { // from class: com.zykj.sketch.widgets.PPTWebView.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                PPTListener pPTListener = PPTWebView.this.pptListener;
                if (pPTListener != null) {
                    pPTListener.onPageFinished();
                }
            }
        });
    }

    public /* synthetic */ PPTWebView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
