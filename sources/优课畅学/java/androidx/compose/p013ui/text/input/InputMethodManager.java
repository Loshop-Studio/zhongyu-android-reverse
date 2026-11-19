package androidx.compose.p013ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i10, ExtractedText extractedText);

    void updateSelection(int i10, int i11, int i12, int i13);
}
