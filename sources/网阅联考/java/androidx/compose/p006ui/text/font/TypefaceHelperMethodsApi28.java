package androidx.compose.p006ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(28)
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m5175d2 = {"Landroidx/compose/ui/text/font/TypefaceHelperMethodsApi28;", "", "()V", "create", "Landroid/graphics/Typeface;", "typeface", "finalFontWeight", "", "finalFontStyle", "", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @DoNotInline
    @RequiresApi(28)
    public final Typeface create(Typeface typeface, int finalFontWeight, boolean finalFontStyle) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Typeface typefaceCreate = Typeface.create(typeface, finalFontWeight, finalFontStyle);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(typeface, finalFontWeight, finalFontStyle)");
        return typefaceCreate;
    }
}
