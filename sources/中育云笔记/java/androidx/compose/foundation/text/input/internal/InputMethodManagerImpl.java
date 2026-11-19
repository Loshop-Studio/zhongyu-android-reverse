package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final InterfaceC10773d imm$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final android.view.inputmethod.InputMethodManager invoke() {
            Object systemService = this.this$0.view.getContext().getSystemService("input_method");
            AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    });
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void startStylusHandwriting() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(getImm(), this.view);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateSelection(int i10, int i11, int i12, int i13) {
        getImm().updateSelection(this.view, i10, i11, i12, i13);
    }
}
