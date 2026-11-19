package androidx.compose.p014ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
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
