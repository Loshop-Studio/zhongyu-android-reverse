package androidx.compose.p011ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.text.ExperimentalTextApi;
import androidx.compose.p011ui.text.font.FontVariation;
import androidx.compose.p011ui.unit.AndroidDensity_androidKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.util.ListUtilsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@RequiresApi(26)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0014\u0010\r\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "()V", "threadLocalPaint", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "toAndroidString", "", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class TypefaceCompatApi26 {

    @NotNull
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();

    @NotNull
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        final Density Density = AndroidDensity_androidKt.Density(context);
        return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new InterfaceC6471c() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26.toAndroidString.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(FontVariation.Setting setting) {
                return "'" + setting.getAxisName() + "' " + setting.toVariationValue(Density);
            }
        }, 31, null);
    }

    @ExperimentalTextApi
    @Nullable
    public final Typeface setFontVariationSettings(@Nullable Typeface typeface, @NotNull FontVariation.Settings variationSettings, @NotNull Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(variationSettings, context));
        return paint.getTypeface();
    }
}
