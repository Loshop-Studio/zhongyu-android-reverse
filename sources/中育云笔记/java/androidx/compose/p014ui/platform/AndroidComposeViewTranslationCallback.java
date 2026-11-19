package androidx.compose.p014ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(View view) {
        AbstractC9979u.m20292e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onClearTranslation$ui_release();
        return true;
    }

    public boolean onHideTranslation(View view) {
        AbstractC9979u.m20292e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onHideTranslation$ui_release();
        return true;
    }

    public boolean onShowTranslation(View view) {
        AbstractC9979u.m20292e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onShowTranslation$ui_release();
        return true;
    }
}
