package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.p014ui.text.platform.AndroidFontListTypeface;
import androidx.compose.p014ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.p014ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class AndroidTypeface_androidKt {
    public static final FontFamily FontFamily(Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    @InterfaceC10770a
    public static final Typeface Typeface(Context context, FontFamily fontFamily, List<Pair<FontWeight, FontStyle>> list) {
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    public static final Typeface Typeface(Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
