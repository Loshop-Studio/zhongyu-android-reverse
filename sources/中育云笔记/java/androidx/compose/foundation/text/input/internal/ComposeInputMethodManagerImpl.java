package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {
    private android.view.inputmethod.InputMethodManager imm;
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public ComposeInputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager createImm() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    public final android.view.inputmethod.InputMethodManager requireImm() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager inputMethodManagerCreateImm = createImm();
        this.imm = inputMethodManagerCreateImm;
        return inputMethodManagerCreateImm;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void restartInput() {
        requireImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        requireImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        requireImm().updateExtractedText(this.view, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateSelection(int i10, int i11, int i12, int i13) {
        requireImm().updateSelection(this.view, i10, i11, i12, i13);
    }
}
