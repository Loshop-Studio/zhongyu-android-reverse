package com.zykj.mistake.dialog;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.C4463c0;
import com.zykj.mistake.databinding.DialogWebviewShotBinding;
import com.zykj.mistake.dialog.WebViewShotDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p106l4.C6062m;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/mistake/dialog/WebViewShotDialog;", "Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WebViewShotDialog extends BaseDialogFragment<DialogWebviewShotBinding> {

    /* renamed from: c */
    public final String f6179c;

    /* renamed from: d */
    public final int f6180d;

    /* renamed from: e */
    public final int f6181e;

    /* renamed from: f */
    public int f6182f;

    /* renamed from: g */
    public C4463c0 f6183g;

    /* renamed from: h */
    public boolean f6184h;

    public WebViewShotDialog(String url) {
        AbstractC5830k.m5330g(url, "url");
        this.f6179c = url;
        this.f6180d = 150;
        this.f6181e = 50;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: e */
    public final int mo3981e() {
        return R.color.white;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: f */
    public final int mo3982f() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: g */
    public final int mo3983g() {
        return R.layout.dialog_webview_shot;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: h */
    public final int mo3984h() {
        return -1;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: j */
    public final void mo3985j(View view) {
        WebView.enableSlowWholeDocumentDraw();
        ((DialogWebviewShotBinding) m3987i()).f6125f.setInitialScale(this.f6180d);
        ((DialogWebviewShotBinding) m3987i()).f6125f.setVerticalScrollBarEnabled(false);
        ((DialogWebviewShotBinding) m3987i()).f6125f.setHorizontalScrollBarEnabled(false);
        ((DialogWebviewShotBinding) m3987i()).f6125f.getSettings().setJavaScriptEnabled(true);
        WebView webView = ((DialogWebviewShotBinding) m3987i()).f6125f;
        AbstractC5830k.m5329f(webView, "webView");
        webView.getSettings().setTextZoom(100);
        ((DialogWebviewShotBinding) m3987i()).f6125f.setWebViewClient(new C6062m(this));
        this.f6184h = false;
        ((DialogWebviewShotBinding) m3987i()).f6124e.setVisibility(0);
        ((DialogWebviewShotBinding) m3987i()).f6124e.setText("正在加载。。。");
        ((DialogWebviewShotBinding) m3987i()).f6125f.loadUrl(this.f6179c);
        final int i = 0;
        ((DialogWebviewShotBinding) m3987i()).f6123d.setOnClickListener(new View.OnClickListener(this) { // from class: l4.l

            /* renamed from: b */
            public final /* synthetic */ WebViewShotDialog f9663b;

            {
                this.f9663b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        WebViewShotDialog webViewShotDialog = this.f9663b;
                        int i8 = webViewShotDialog.f6182f;
                        if (i8 < webViewShotDialog.f6181e) {
                            webViewShotDialog.f6182f = i8 + 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6125f.setInitialScale(webViewShotDialog.f6180d + webViewShotDialog.f6182f);
                        break;
                    case 1:
                        WebViewShotDialog webViewShotDialog2 = this.f9663b;
                        int i9 = webViewShotDialog2.f6182f;
                        if (i9 > 0) {
                            webViewShotDialog2.f6182f = i9 - 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog2.m3987i()).f6125f.setInitialScale(webViewShotDialog2.f6180d + webViewShotDialog2.f6182f);
                        break;
                    case 2:
                        this.f9663b.dismiss();
                        break;
                    default:
                        WebViewShotDialog webViewShotDialog3 = this.f9663b;
                        webViewShotDialog3.dismiss();
                        C4463c0 c4463c0 = webViewShotDialog3.f6183g;
                        if (c4463c0 != null) {
                            WebView webView2 = ((DialogWebviewShotBinding) webViewShotDialog3.m3987i()).f6125f;
                            AbstractC5830k.m5329f(webView2, "webView");
                            webView2.setDrawingCacheEnabled(false);
                            webView2.setDrawingCacheEnabled(true);
                            c4463c0.invoke(webView2.getDrawingCache());
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        ((DialogWebviewShotBinding) m3987i()).f6121b.setOnClickListener(new View.OnClickListener(this) { // from class: l4.l

            /* renamed from: b */
            public final /* synthetic */ WebViewShotDialog f9663b;

            {
                this.f9663b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i8) {
                    case 0:
                        WebViewShotDialog webViewShotDialog = this.f9663b;
                        int i82 = webViewShotDialog.f6182f;
                        if (i82 < webViewShotDialog.f6181e) {
                            webViewShotDialog.f6182f = i82 + 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6125f.setInitialScale(webViewShotDialog.f6180d + webViewShotDialog.f6182f);
                        break;
                    case 1:
                        WebViewShotDialog webViewShotDialog2 = this.f9663b;
                        int i9 = webViewShotDialog2.f6182f;
                        if (i9 > 0) {
                            webViewShotDialog2.f6182f = i9 - 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog2.m3987i()).f6125f.setInitialScale(webViewShotDialog2.f6180d + webViewShotDialog2.f6182f);
                        break;
                    case 2:
                        this.f9663b.dismiss();
                        break;
                    default:
                        WebViewShotDialog webViewShotDialog3 = this.f9663b;
                        webViewShotDialog3.dismiss();
                        C4463c0 c4463c0 = webViewShotDialog3.f6183g;
                        if (c4463c0 != null) {
                            WebView webView2 = ((DialogWebviewShotBinding) webViewShotDialog3.m3987i()).f6125f;
                            AbstractC5830k.m5329f(webView2, "webView");
                            webView2.setDrawingCacheEnabled(false);
                            webView2.setDrawingCacheEnabled(true);
                            c4463c0.invoke(webView2.getDrawingCache());
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 2;
        ((DialogWebviewShotBinding) m3987i()).f6120a.setOnClickListener(new View.OnClickListener(this) { // from class: l4.l

            /* renamed from: b */
            public final /* synthetic */ WebViewShotDialog f9663b;

            {
                this.f9663b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i9) {
                    case 0:
                        WebViewShotDialog webViewShotDialog = this.f9663b;
                        int i82 = webViewShotDialog.f6182f;
                        if (i82 < webViewShotDialog.f6181e) {
                            webViewShotDialog.f6182f = i82 + 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6125f.setInitialScale(webViewShotDialog.f6180d + webViewShotDialog.f6182f);
                        break;
                    case 1:
                        WebViewShotDialog webViewShotDialog2 = this.f9663b;
                        int i92 = webViewShotDialog2.f6182f;
                        if (i92 > 0) {
                            webViewShotDialog2.f6182f = i92 - 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog2.m3987i()).f6125f.setInitialScale(webViewShotDialog2.f6180d + webViewShotDialog2.f6182f);
                        break;
                    case 2:
                        this.f9663b.dismiss();
                        break;
                    default:
                        WebViewShotDialog webViewShotDialog3 = this.f9663b;
                        webViewShotDialog3.dismiss();
                        C4463c0 c4463c0 = webViewShotDialog3.f6183g;
                        if (c4463c0 != null) {
                            WebView webView2 = ((DialogWebviewShotBinding) webViewShotDialog3.m3987i()).f6125f;
                            AbstractC5830k.m5329f(webView2, "webView");
                            webView2.setDrawingCacheEnabled(false);
                            webView2.setDrawingCacheEnabled(true);
                            c4463c0.invoke(webView2.getDrawingCache());
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 3;
        ((DialogWebviewShotBinding) m3987i()).f6122c.setOnClickListener(new View.OnClickListener(this) { // from class: l4.l

            /* renamed from: b */
            public final /* synthetic */ WebViewShotDialog f9663b;

            {
                this.f9663b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        WebViewShotDialog webViewShotDialog = this.f9663b;
                        int i82 = webViewShotDialog.f6182f;
                        if (i82 < webViewShotDialog.f6181e) {
                            webViewShotDialog.f6182f = i82 + 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog.m3987i()).f6125f.setInitialScale(webViewShotDialog.f6180d + webViewShotDialog.f6182f);
                        break;
                    case 1:
                        WebViewShotDialog webViewShotDialog2 = this.f9663b;
                        int i92 = webViewShotDialog2.f6182f;
                        if (i92 > 0) {
                            webViewShotDialog2.f6182f = i92 - 10;
                        }
                        ((DialogWebviewShotBinding) webViewShotDialog2.m3987i()).f6125f.setInitialScale(webViewShotDialog2.f6180d + webViewShotDialog2.f6182f);
                        break;
                    case 2:
                        this.f9663b.dismiss();
                        break;
                    default:
                        WebViewShotDialog webViewShotDialog3 = this.f9663b;
                        webViewShotDialog3.dismiss();
                        C4463c0 c4463c0 = webViewShotDialog3.f6183g;
                        if (c4463c0 != null) {
                            WebView webView2 = ((DialogWebviewShotBinding) webViewShotDialog3.m3987i()).f6125f;
                            AbstractC5830k.m5329f(webView2, "webView");
                            webView2.setDrawingCacheEnabled(false);
                            webView2.setDrawingCacheEnabled(true);
                            c4463c0.invoke(webView2.getDrawingCache());
                            break;
                        }
                        break;
                }
            }
        });
    }
}
