package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;
    private static final TextSelectionColors DefaultTextSelectionColors;
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$LocalTextSelectionColors$1
        @Override // p300x7.InterfaceC10559a
        public final TextSelectionColors invoke() {
            return TextSelectionColorsKt.DefaultTextSelectionColors;
        }
    }, 1, null);

    static {
        long jColor = ColorKt.Color(4282550004L);
        DefaultSelectionColor = jColor;
        DefaultTextSelectionColors = new TextSelectionColors(jColor, Color.m24275copywmQWz5c$default(jColor, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @Stable
    private static /* synthetic */ void getDefaultTextSelectionColors$annotations() {
    }

    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }
}
