package androidx.core.text;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* renamed from: androidx.core.text.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2463a {
    /* renamed from: d */
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m1602d(int i, int i8, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i8);
    }

    /* renamed from: i */
    public static /* synthetic */ PrecomputedText.Params.Builder m1607i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m1620v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
