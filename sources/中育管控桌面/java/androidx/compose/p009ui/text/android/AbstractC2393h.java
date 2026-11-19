package androidx.compose.p009ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2393h {
    /* renamed from: a */
    public static /* synthetic */ BoringLayout m565a(CharSequence charSequence, TextPaint textPaint, int i6, Layout.Alignment alignment, float f6, float f7, BoringLayout.Metrics metrics, boolean z6, TextUtils.TruncateAt truncateAt, int i7, boolean z7) {
        return new BoringLayout(charSequence, textPaint, i6, alignment, f6, f7, metrics, z6, truncateAt, i7, z7);
    }
}
