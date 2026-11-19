package p101g7;

import android.graphics.Bitmap;
import android.webkit.WebView;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: g7.k */
/* loaded from: classes4.dex */
public final class C7595k {

    /* renamed from: a */
    public static final C7595k f12740a = new C7595k();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m12486a(android.webkit.WebView r23) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p101g7.C7595k.m12486a(android.webkit.WebView):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final Bitmap m12487b(WebView webView) {
        Object objM24299constructorimpl;
        webView.setDrawingCacheEnabled(true);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(Bitmap.createBitmap(webView.getDrawingCache()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
            objM24299constructorimpl = null;
        }
        Bitmap bitmap = (Bitmap) objM24299constructorimpl;
        if (bitmap == null) {
            return null;
        }
        webView.setDrawingCacheEnabled(false);
        return bitmap;
    }
}
