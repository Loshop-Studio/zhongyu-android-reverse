package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class TypedArrayApi26ImplKt {
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    public static final Typeface getFont(TypedArray typedArray, @StyleableRes int i10) {
        Typeface font = typedArray.getFont(i10);
        AbstractC9133u.m16130d(font);
        return font;
    }
}
