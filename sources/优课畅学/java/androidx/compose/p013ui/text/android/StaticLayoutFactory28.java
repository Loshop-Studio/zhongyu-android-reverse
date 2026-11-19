package androidx.compose.p013ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes2.dex */
final class StaticLayoutFactory28 {
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    public static final void setUseLineSpacingFromFallbacks(StaticLayout.Builder builder, boolean z10) {
        builder.setUseLineSpacingFromFallbacks(z10);
    }
}
