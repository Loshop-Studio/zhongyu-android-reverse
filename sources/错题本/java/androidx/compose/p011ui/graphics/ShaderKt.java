package androidx.compose.p011ui.graphics;

import android.graphics.Shader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001a0\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", TypedValues.TransitionType.S_FROM, "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ShaderKt {
    @NotNull
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m10995ImageShaderF49vj9s(@NotNull ImageBitmap imageBitmap, int i, int i8) {
        return AndroidShader_androidKt.m10582ActualImageShaderF49vj9s(imageBitmap, i, i8);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m10996ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i = TileMode.INSTANCE.m11055getClamp3opZhB0();
        }
        if ((i9 & 4) != 0) {
            i8 = TileMode.INSTANCE.m11055getClamp3opZhB0();
        }
        return m10995ImageShaderF49vj9s(imageBitmap, i, i8);
    }

    @NotNull
    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m10997LinearGradientShaderVjE6UOU(long j7, long j8, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        return AndroidShader_androidKt.m10583ActualLinearGradientShaderVjE6UOU(j7, j8, list, list2, i);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m10998LinearGradientShaderVjE6UOU$default(long j7, long j8, List list, List list2, int i, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i8 & 16) != 0) {
            i = TileMode.INSTANCE.m11055getClamp3opZhB0();
        }
        return m10997LinearGradientShaderVjE6UOU(j7, j8, list, list3, i);
    }

    @NotNull
    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m10999RadialGradientShader8uybcMk(long j7, float f, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        return AndroidShader_androidKt.m10584ActualRadialGradientShader8uybcMk(j7, f, list, list2, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m11000RadialGradientShader8uybcMk$default(long j7, float f, List list, List list2, int i, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i8 & 16) != 0) {
            i = TileMode.INSTANCE.m11055getClamp3opZhB0();
        }
        return m10999RadialGradientShader8uybcMk(j7, f, list, list3, i);
    }

    @NotNull
    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m11001SweepGradientShader9KIMszo(long j7, @NotNull List<Color> list, @Nullable List<Float> list2) {
        return AndroidShader_androidKt.m10585ActualSweepGradientShader9KIMszo(j7, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m11002SweepGradientShader9KIMszo$default(long j7, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m11001SweepGradientShader9KIMszo(j7, list, list2);
    }
}
