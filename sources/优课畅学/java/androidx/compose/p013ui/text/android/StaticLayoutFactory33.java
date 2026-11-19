package androidx.compose.p013ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes2.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(AbstractC3100i0.m1279a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
