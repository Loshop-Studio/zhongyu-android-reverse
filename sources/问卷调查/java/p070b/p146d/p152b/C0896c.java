package p070b.p146d.p152b;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zykj.satisfaction.MainActivity;
import java.util.Iterator;
import java.util.Objects;
import p160d.p162f.p164b.C1011d;
import p160d.p167i.C1026g;

/* renamed from: b.d.b.c */
/* loaded from: classes.dex */
public final class C0896c extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f4748a;

    public C0896c(MainActivity mainActivity) {
        this.f4748a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Log.i("OkHttp", C1011d.m2814j("onReceivedError -> errorCode: ", Integer.valueOf(i)));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        MainActivity mainActivity = this.f4748a;
        C1011d.m2807c(str);
        Objects.requireNonNull(mainActivity);
        C1011d.m2809e(str, "url");
        boolean z = false;
        if (C1026g.m2818a(str, '?', false, 2)) {
            str = str.substring(0, C1026g.m2825h(str, '?', 0, false, 6));
            C1011d.m2808d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Iterator<T> it = mainActivity.f5445t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C1026g.m2819b(str, (String) it.next(), false, 2)) {
                z = true;
                break;
            }
        }
        return !z;
    }
}
