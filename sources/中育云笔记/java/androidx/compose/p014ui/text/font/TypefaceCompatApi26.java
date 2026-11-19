package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.text.ExperimentalTextApi;
import androidx.compose.p014ui.text.font.FontVariation;
import androidx.compose.p014ui.unit.AndroidDensity_androidKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.util.ListUtilsKt;
import p181hd.InterfaceC9540l;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class TypefaceCompatApi26 {
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        final Density Density = AndroidDensity_androidKt.Density(context);
        return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new InterfaceC9540l() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26.toAndroidString.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(FontVariation.Setting setting) {
                return '\'' + setting.getAxisName() + "' " + setting.toVariationValue(Density);
            }
        }, 31, null);
    }

    @ExperimentalTextApi
    public final Typeface setFontVariationSettings(Typeface typeface, FontVariation.Settings settings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (settings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(settings, context));
        return paint.getTypeface();
    }
}
