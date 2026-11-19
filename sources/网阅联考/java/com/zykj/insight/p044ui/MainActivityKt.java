package com.zykj.insight.p044ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class MainActivityKt {
    /* renamed from: a */
    public static final void m4615a(final String url, final Modifier modifier, Composer composer, final int i4, final int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(url, "url");
        Composer composerStartRestartGroup = composer.startRestartGroup(-646236126);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-646236126, i6, -1, "com.zykj.insight.ui.ComposeWebView (MainActivity.kt:66)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(url);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<Context, WebView>() { // from class: com.zykj.insight.ui.MainActivityKt$ComposeWebView$1$1

                    /* renamed from: com.zykj.insight.ui.MainActivityKt$ComposeWebView$1$1$a */
                    public static final class ViewOnLongClickListenerC3666a implements View.OnLongClickListener {

                        /* renamed from: a */
                        public static final ViewOnLongClickListenerC3666a f4185a = new ViewOnLongClickListenerC3666a();

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            return true;
                        }
                    }

                    /* renamed from: com.zykj.insight.ui.MainActivityKt$ComposeWebView$1$1$b */
                    public static final class ViewOnClickListenerC3667b implements View.OnClickListener {

                        /* renamed from: a */
                        public static final ViewOnClickListenerC3667b f4186a = new ViewOnClickListenerC3667b();

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    }

                    /* renamed from: com.zykj.insight.ui.MainActivityKt$ComposeWebView$1$1$c */
                    public static final class C3668c extends WebViewClient {
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            return true;
                        }
                    }

                    /* renamed from: com.zykj.insight.ui.MainActivityKt$ComposeWebView$1$1$d */
                    public static final class ViewOnKeyListenerC3669d implements View.OnKeyListener {

                        /* renamed from: a */
                        public final /* synthetic */ WebView f4187a;

                        public ViewOnKeyListenerC3669d(WebView webView) {
                            this.f4187a = webView;
                        }

                        @Override // android.view.View.OnKeyListener
                        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
                            if (!(keyEvent != null && keyEvent.getAction() == 0) || i4 != 4 || !this.f4187a.canGoBack()) {
                                return false;
                            }
                            this.f4187a.goBack();
                            return true;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final WebView invoke(Context context) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        WebView webView = new WebView(context);
                        String str = url;
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setLoadWithOverviewMode(true);
                        webView.setOnLongClickListener(ViewOnLongClickListenerC3666a.f4185a);
                        webView.setOnClickListener(ViewOnClickListenerC3667b.f4186a);
                        webView.setWebViewClient(new C3668c());
                        webView.setOnKeyListener(new ViewOnKeyListenerC3669d(webView));
                        if (str.length() > 0) {
                            webView.loadUrl(str);
                        }
                        return webView;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(url);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<WebView, Unit>() { // from class: com.zykj.insight.ui.MainActivityKt$ComposeWebView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m4617a(WebView it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (url.length() > 0) {
                            it.loadUrl(url);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                        m4617a(webView);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) objRememberedValue2, composerStartRestartGroup, i6 & UMErrorCode.E_UM_BE_DEFLATE_FAILED, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zykj.insight.ui.MainActivityKt$ComposeWebView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                MainActivityKt.m4615a(url, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
            }
        });
    }
}
