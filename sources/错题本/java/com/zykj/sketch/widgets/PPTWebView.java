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
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m5110d2 = {"Lcom/zykj/sketch/widgets/PPTWebView;", "Landroid/webkit/WebView;", "Lcom/zykj/sketch/core/listener/PPTControl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "path", "Ld6/s;", "loadSlider", "(Ljava/lang/String;)V", "Lcom/zykj/sketch/core/listener/PPTListener;", "listener", "setListener", "(Lcom/zykj/sketch/core/listener/PPTListener;)V", "nextSlide", "()V", "preSlide", "nextAction", "preAction", "page", "goPage", "(I)V", "pptListener", "Lcom/zykj/sketch/core/listener/PPTListener;", "SlideInterface", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes3.dex */
public final class PPTWebView extends WebView implements PPTControl {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private PPTListener pptListener;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;", "", "<init>", "(Lcom/zykj/sketch/widgets/PPTWebView;)V", "", "currentSlide", "Ld6/s;", "setCurrentSlide", "(I)V", "total", "setTotalCount", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public PPTWebView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.PPTControl
    public void goPage(int page) {
        loadUrl("javascript:Presentation.GotoSlide('" + page + "')");
    }

    // Registers the SlideNative page counters, loads the supplied path, then requests
    // an assets/ppt/demo.html that is missing from this APK. Verified on Android 11.
    public final void loadSlider(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        addJavascriptInterface(new SlideInterface(), "SlideNative");
        loadUrl(path);
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
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
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

    public final void setListener(@NotNull PPTListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.pptListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PPTWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PPTWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(true);
        setLayerType(1, null);
        setClickable(false);
        setWebViewClient(new WebViewClient() { // from class: com.zykj.sketch.widgets.PPTWebView.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@Nullable WebView view, @Nullable String url) {
                super.onPageFinished(view, url);
                PPTListener pPTListener = PPTWebView.this.pptListener;
                if (pPTListener != null) {
                    pPTListener.onPageFinished();
                }
            }
        });
    }

    public /* synthetic */ PPTWebView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }
}
