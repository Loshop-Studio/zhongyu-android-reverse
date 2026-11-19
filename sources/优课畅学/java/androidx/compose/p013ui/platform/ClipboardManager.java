package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.text.AnnotatedString;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface ClipboardManager {
    default ClipEntry getClip() {
        return null;
    }

    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    AnnotatedString getText();

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }

    default void setClip(ClipEntry clipEntry) {
    }

    void setText(AnnotatedString annotatedString);
}
