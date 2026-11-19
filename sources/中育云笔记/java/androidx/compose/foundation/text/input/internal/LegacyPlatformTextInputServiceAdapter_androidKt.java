package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.EmojiCompat;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    private static final String DEBUG_CLASS = "AndroidLegacyPlatformTextInputServiceAdapter";
    private static InterfaceC9540l inputMethodManagerFactory = C1800xe9f87565.INSTANCE;

    public static final LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final InterfaceC9540l getInputMethodManagerFactory() {
        return inputMethodManagerFactory;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }

    public static final void setInputMethodManagerFactory(InterfaceC9540l interfaceC9540l) {
        inputMethodManagerFactory = interfaceC9540l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
