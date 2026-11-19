package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.EmojiCompat;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    private static final String DEBUG_CLASS = "AndroidLegacyPlatformTextInputServiceAdapter";
    private static InterfaceC10570l inputMethodManagerFactory = C1770xe9f87565.INSTANCE;

    public static final LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final InterfaceC10570l getInputMethodManagerFactory() {
        return inputMethodManagerFactory;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }

    public static final void setInputMethodManagerFactory(InterfaceC10570l interfaceC10570l) {
        inputMethodManagerFactory = interfaceC10570l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
