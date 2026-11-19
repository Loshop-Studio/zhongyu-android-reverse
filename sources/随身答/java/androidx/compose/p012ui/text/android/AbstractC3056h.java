package androidx.compose.p012ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3056h {
    /* renamed from: a */
    public static /* synthetic */ BoringLayout m1281a(CharSequence charSequence, TextPaint textPaint, int i9, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z9, TextUtils.TruncateAt truncateAt, int i10, boolean z10) {
        return new BoringLayout(charSequence, textPaint, i9, alignment, f10, f11, metrics, z9, truncateAt, i10, z10);
    }
}
