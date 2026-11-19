package androidx.compose.foundation.text;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class AutofillHighlightKt {
    private static final ProvidableCompositionLocal<Color> LocalAutofillHighlightColor = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Color.m30868boximpl(m27760invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m27760invoke0d7_KjU() {
            return AutofillHighlight_androidKt.autofillHighlightColor();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }
}
