package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;
    private final Typeface typeface;

    public LoadedFontFamily(Typeface typeface) {
        super(true, null);
        this.typeface = typeface;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadedFontFamily) && AbstractC9979u.m20289b(this.typeface, ((LoadedFontFamily) obj).typeface);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
