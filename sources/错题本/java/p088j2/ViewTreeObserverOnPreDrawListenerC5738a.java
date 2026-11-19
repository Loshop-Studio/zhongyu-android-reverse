package p088j2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: j2.a */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC5738a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ View f9078a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9079b;

    /* renamed from: c */
    public final /* synthetic */ MDRootLayout f9080c;

    public ViewTreeObserverOnPreDrawListenerC5738a(MDRootLayout mDRootLayout, View view, boolean z8) {
        this.f9080c = mDRootLayout;
        this.f9078a = view;
        this.f9079b = z8;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f9078a;
        if (view.getMeasuredHeight() == 0) {
            return true;
        }
        WebView webView = (WebView) view;
        int i = MDRootLayout.f4262s;
        float measuredHeight = webView.getMeasuredHeight();
        float scale = webView.getScale() * webView.getContentHeight();
        boolean z8 = this.f9079b;
        MDRootLayout mDRootLayout = this.f9080c;
        if (measuredHeight < scale) {
            mDRootLayout.m3480b((ViewGroup) view, z8);
        } else {
            if (z8) {
                mDRootLayout.f4267e = false;
            }
            mDRootLayout.f4268f = false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
