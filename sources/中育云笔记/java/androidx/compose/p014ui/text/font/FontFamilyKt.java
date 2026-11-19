package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class FontFamilyKt {
    @Stable
    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(AbstractC10964p.m24014g(fontArr));
    }

    @Stable
    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
