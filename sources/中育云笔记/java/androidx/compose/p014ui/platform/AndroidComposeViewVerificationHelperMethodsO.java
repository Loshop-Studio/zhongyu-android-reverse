package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsO {
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void focusable(View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
