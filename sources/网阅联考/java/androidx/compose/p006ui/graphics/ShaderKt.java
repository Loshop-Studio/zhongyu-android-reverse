package androidx.compose.p006ui.graphics;

import android.graphics.Shader;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001a3\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m5175d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ShaderKt {
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m9461ImageShaderF49vj9s(ImageBitmap image, int i4, int i5) {
        Intrinsics.checkNotNullParameter(image, "image");
        return AndroidShader_androidKt.m9086ActualImageShaderF49vj9s(image, i4, i5);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m9462ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
        }
        if ((i6 & 4) != 0) {
            i5 = TileMode.INSTANCE.m9521getClamp3opZhB0();
        }
        return m9461ImageShaderF49vj9s(imageBitmap, i4, i5);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m9463LinearGradientShaderVjE6UOU(long j4, long j5, List<Color> colors, List<Float> list, int i4) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m9087ActualLinearGradientShaderVjE6UOU(j4, j5, colors, list, i4);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m9464LinearGradientShaderVjE6UOU$default(long j4, long j5, List list, List list2, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i5 & 16) != 0) {
            i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
        }
        return m9463LinearGradientShaderVjE6UOU(j4, j5, list, list3, i4);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m9465RadialGradientShader8uybcMk(long j4, float f4, List<Color> colors, List<Float> list, int i4) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m9088ActualRadialGradientShader8uybcMk(j4, f4, colors, list, i4);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m9466RadialGradientShader8uybcMk$default(long j4, float f4, List list, List list2, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i5 & 16) != 0) {
            i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
        }
        return m9465RadialGradientShader8uybcMk(j4, f4, list, list3, i4);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m9467SweepGradientShader9KIMszo(long j4, List<Color> colors, List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m9089ActualSweepGradientShader9KIMszo(j4, colors, list);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m9468SweepGradientShader9KIMszo$default(long j4, List list, List list2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list2 = null;
        }
        return m9467SweepGradientShader9KIMszo(j4, list, list2);
    }
}
