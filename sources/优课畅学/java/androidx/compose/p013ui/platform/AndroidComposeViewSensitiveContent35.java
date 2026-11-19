package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(35)
/* loaded from: classes2.dex */
final class AndroidComposeViewSensitiveContent35 {
    public static final AndroidComposeViewSensitiveContent35 INSTANCE = new AndroidComposeViewSensitiveContent35();

    private AndroidComposeViewSensitiveContent35() {
    }

    @DoNotInline
    @RequiresApi(35)
    public final void setContentSensitivity(View view, boolean z10) {
        if (z10) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
