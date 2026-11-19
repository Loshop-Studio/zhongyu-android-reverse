package androidx.compose.p014ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes2.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final int $stable = 0;
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @RequiresApi(28)
    public final Typeface create(Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }
}
