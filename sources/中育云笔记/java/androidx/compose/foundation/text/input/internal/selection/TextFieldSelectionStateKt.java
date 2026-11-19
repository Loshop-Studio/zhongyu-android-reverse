package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    public static final InterfaceC9529a menuItem(final TextFieldSelectionState textFieldSelectionState, boolean z10, final TextToolbarState textToolbarState, final InterfaceC9529a interfaceC9529a) {
        if (z10) {
            return new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.menuItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28155invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28155invoke() {
                    interfaceC9529a.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m28154reverse5zctL8(long j10) {
        return TextRangeKt.TextRange(TextRange.m32961getEndimpl(j10), TextRange.m32966getStartimpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDebug(InterfaceC9529a interfaceC9529a) {
    }
}
