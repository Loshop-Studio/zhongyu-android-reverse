package androidx.compose.p013ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import p134i7.AbstractC8797p;

/* loaded from: classes2.dex */
public final class FontFamilyKt {
    @Stable
    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(AbstractC8797p.m14640g(fontArr));
    }

    @Stable
    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
