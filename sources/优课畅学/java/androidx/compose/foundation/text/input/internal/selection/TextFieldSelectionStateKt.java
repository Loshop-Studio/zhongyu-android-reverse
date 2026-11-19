package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    public static final InterfaceC10559a menuItem(final TextFieldSelectionState textFieldSelectionState, boolean z10, final TextToolbarState textToolbarState, final InterfaceC10559a interfaceC10559a) {
        if (z10) {
            return new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.menuItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m21553invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m21553invoke() {
                    interfaceC10559a.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m21552reverse5zctL8(long j10) {
        return TextRangeKt.TextRange(TextRange.m26359getEndimpl(j10), TextRange.m26364getStartimpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDebug(InterfaceC10559a interfaceC10559a) {
    }
}
