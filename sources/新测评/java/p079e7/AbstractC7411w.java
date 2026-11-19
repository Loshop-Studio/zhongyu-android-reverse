package p079e7;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.w */
/* loaded from: classes4.dex */
public abstract class AbstractC7411w {

    /* renamed from: e7.w$a */
    public static final class a extends WebViewClient {
    }

    /* renamed from: e */
    public static final void m11905e(final Modifier modifier, final String url, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(url, "url");
        Composer composerStartRestartGroup = composer.startRestartGroup(1969310565);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(url) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969310565, i12, -1, "com.zykj.evaluation.ui.widget.CustomWebView (CustomWebView.kt:13)");
            }
            int i14 = i12 & 112;
            boolean z9 = i14 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: e7.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7411w.m11906f(url, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean z10 = i14 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: e7.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7411w.m11908h(url, (FrameLayout) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i12 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: e7.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7411w.m11909i(modifier, url, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final FrameLayout m11906f(String str, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        WebView webView = new WebView(context);
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: e7.v
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return AbstractC7411w.m11907g(view);
            }
        });
        webView.setWebViewClient(new a());
        webView.loadData(str, "text/html;charset=UTF-8", null);
        frameLayout.addView(webView);
        return frameLayout;
    }

    /* renamed from: g */
    public static final boolean m11907g(View view) {
        return true;
    }

    /* renamed from: h */
    public static final Unit m11908h(String str, FrameLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View childAt = it.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.webkit.WebView");
        ((WebView) childAt).loadData(str, "text/html;charset=UTF-8", null);
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m11909i(Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        m11905e(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
