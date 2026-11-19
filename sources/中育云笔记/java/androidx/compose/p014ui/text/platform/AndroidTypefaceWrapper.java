package androidx.compose.p014ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface typeface;

    public AndroidTypefaceWrapper(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // androidx.compose.p014ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p014ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo33217getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        return this.typeface;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }
}
