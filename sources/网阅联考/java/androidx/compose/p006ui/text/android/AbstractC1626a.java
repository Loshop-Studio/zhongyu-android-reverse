package androidx.compose.p006ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1626a {
    /* renamed from: a */
    public static /* synthetic */ BoringLayout m850a(CharSequence charSequence, TextPaint textPaint, int i4, Layout.Alignment alignment, float f4, float f5, BoringLayout.Metrics metrics, boolean z3, TextUtils.TruncateAt truncateAt, int i5, boolean z4) {
        return new BoringLayout(charSequence, textPaint, i4, alignment, f4, f5, metrics, z3, truncateAt, i5, z4);
    }
}
