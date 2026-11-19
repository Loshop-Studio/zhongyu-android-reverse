package androidx.compose.p014ui.platform;

import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;

@RequiresApi(34)
/* loaded from: classes2.dex */
final class AndroidViewConfigurationApi34 {
    public static final AndroidViewConfigurationApi34 INSTANCE = new AndroidViewConfigurationApi34();

    private AndroidViewConfigurationApi34() {
    }

    public final float getScaledHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float getScaledHandwritingSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
