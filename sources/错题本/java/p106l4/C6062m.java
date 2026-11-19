package p106l4;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zykj.mistake.databinding.DialogWebviewShotBinding;
import com.zykj.mistake.dialog.WebViewShotDialog;

/* renamed from: l4.m */
/* loaded from: classes3.dex */
public final class C6062m extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebViewShotDialog f9664a;

    public C6062m(WebViewShotDialog webViewShotDialog) {
        this.f9664a = webViewShotDialog;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView != null) {
            webView.loadUrl("javascript:function setTop(){document.querySelector('.toolBar').style.display=\"none\";document.getElementsByTagName(\"body\")[0].style.paddingBottom=0;document.getElementsByTagName(\"html\")[0].style.paddingBottom=0;}setTop();");
        }
        WebViewShotDialog webViewShotDialog = this.f9664a;
        if (webViewShotDialog.f6184h) {
            ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6124e.setText("加载失败");
        } else {
            ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6124e.setVisibility(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f9664a.f6184h = true;
        if (webView != null) {
            webView.loadUrl("file:///android_asset/error.html?code=" + i);
        }
    }
}
