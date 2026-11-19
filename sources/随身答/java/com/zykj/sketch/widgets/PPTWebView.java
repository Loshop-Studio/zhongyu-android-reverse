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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.PPTListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/sketch/widgets/PPTWebView;", "Landroid/webkit/WebView;", "Lcom/zykj/sketch/core/listener/PPTControl;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pptListener", "Lcom/zykj/sketch/core/listener/PPTListener;", "goPage", "", "page", "loadSlider", "path", "", "nextAction", "nextSlide", "onTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "preAction", "preSlide", "setListener", "listener", "SlideInterface", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes5.dex */
public final class PPTWebView extends WebView implements PPTControl {
    public Map<Integer, View> _$_findViewCache;
    private PPTListener pptListener;

    @Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, m13413d2 = {"Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;", "", "(Lcom/zykj/sketch/widgets/PPTWebView;)V", "setCurrentSlide", "", "currentSlide", "", "setTotalCount", "total", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class SlideInterface {
        public SlideInterface() {
        }

        @JavascriptInterface
        public final void setCurrentSlide(int currentSlide) {
            PPTListener pPTListener = PPTWebView.this.pptListener;
            if (pPTListener != null) {
                pPTListener.currentPage(currentSlide);
            }
        }

        @JavascriptInterface
        public final void setTotalCount(int total) {
            PPTListener pPTListener = PPTWebView.this.pptListener;
            if (pPTListener != null) {
                pPTListener.totalPageCount(total);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PPTWebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i9) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void goPage(int page) {
        loadUrl("javascript:Presentation.GotoSlide('" + page + "')");
    }

    // Registers the SlideNative page counters, loads the supplied path, then requests
    // an assets/ppt/demo.html that is missing from this APK. Verified on Android 11.
    public final void loadSlider(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.pptListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PPTWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PPTWebView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(true);
        setLayerType(1, null);
        setClickable(false);
        setWebViewClient(new WebViewClient() { // from class: com.zykj.sketch.widgets.PPTWebView.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                PPTListener pPTListener = PPTWebView.this.pptListener;
                if (pPTListener != null) {
                    pPTListener.onPageFinished();
                }
            }
        });
    }

    public /* synthetic */ PPTWebView(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
