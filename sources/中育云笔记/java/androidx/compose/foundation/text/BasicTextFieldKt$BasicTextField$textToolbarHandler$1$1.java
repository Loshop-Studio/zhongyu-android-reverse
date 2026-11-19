package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.p014ui.platform.TextToolbar;
import androidx.compose.p014ui.platform.TextToolbarStatus;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {
    final /* synthetic */ InterfaceC11122i0 $coroutineScope;
    final /* synthetic */ TextToolbar $currentTextToolbar;

    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, InterfaceC11122i0 interfaceC11122i0) {
        this.$currentTextToolbar = textToolbar;
        this.$coroutineScope = interfaceC11122i0;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void hideTextToolbar() {
        if (this.$currentTextToolbar.getStatus() == TextToolbarStatus.Shown) {
            this.$currentTextToolbar.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, androidx.compose.p014ui.geometry.Rect r18, vc.InterfaceC11588c<? super p309qc.C10786q> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1.showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.geometry.Rect, vc.c):java.lang.Object");
    }
}
