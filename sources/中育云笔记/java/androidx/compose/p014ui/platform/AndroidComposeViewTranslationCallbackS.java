package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi(31)
    public final void setViewTranslationCallback(View view) {
        view.setViewTranslationCallback(AbstractC3051m.m1302a(AndroidComposeViewTranslationCallback.INSTANCE));
    }
}
