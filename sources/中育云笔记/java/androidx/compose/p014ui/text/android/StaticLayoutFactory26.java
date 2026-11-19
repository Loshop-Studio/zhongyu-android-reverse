package androidx.compose.p014ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class StaticLayoutFactory26 {
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    public static final void setJustificationMode(StaticLayout.Builder builder, int i10) {
        builder.setJustificationMode(i10);
    }
}
