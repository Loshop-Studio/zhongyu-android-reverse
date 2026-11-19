package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(@ColorInt int i10) {
        return new ColorDrawable(i10);
    }

    @RequiresApi(26)
    public static final ColorDrawable toDrawable(Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
