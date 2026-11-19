package androidx.compose.p013ui.platform;

import android.content.ClipboardManager;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes2.dex */
final class Api28ClipboardManagerClipClear {
    public static final Api28ClipboardManagerClipClear INSTANCE = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    public static final void clearPrimaryClip(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
