package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void startStylusHandwriting();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i10, ExtractedText extractedText);

    void updateSelection(int i10, int i11, int i12, int i13);
}
