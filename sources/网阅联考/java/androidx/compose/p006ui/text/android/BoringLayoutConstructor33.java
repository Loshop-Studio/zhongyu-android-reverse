package androidx.compose.p006ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes.dex */
class BoringLayoutConstructor33 {
    private BoringLayoutConstructor33() {
    }

    @NonNull
    public static BoringLayout create(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i4, @NonNull Layout.Alignment alignment, float f4, float f5, @NonNull BoringLayout.Metrics metrics, boolean z3, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i5, boolean z4) {
        return AbstractC1626a.m850a(charSequence, textPaint, i4, alignment, f4, f5, metrics, z3, truncateAt, i5, z4);
    }
}
