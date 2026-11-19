package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.ColorKt;

@RequiresApi(23)
/* loaded from: classes2.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    @DoNotInline
    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m28469getColorWaAFU9c(Context context, @ColorRes int i10) {
        return ColorKt.Color(context.getResources().getColor(i10, context.getTheme()));
    }
}
