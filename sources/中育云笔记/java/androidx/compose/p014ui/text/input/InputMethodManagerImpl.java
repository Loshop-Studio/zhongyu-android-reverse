package androidx.compose.p014ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final InterfaceC10773d imm$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.view.getContext().getSystemService("input_method");
            AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void updateExtractedText(int i10, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i10, extractedText);
    }

    @Override // androidx.compose.p014ui.text.input.InputMethodManager
    public void updateSelection(int i10, int i11, int i12, int i13) {
        getImm().updateSelection(this.view, i10, i11, i12, i13);
    }
}
