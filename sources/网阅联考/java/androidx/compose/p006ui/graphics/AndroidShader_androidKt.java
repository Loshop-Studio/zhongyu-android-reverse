package androidx.compose.p006ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p006ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0001\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0001*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m5175d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m9086ActualImageShaderF49vj9s(ImageBitmap image, int i4, int i5) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(i4), AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(i5));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m9087ActualLinearGradientShaderVjE6UOU(long j4, long j5, List<Color> colors, List<Float> list, int i4) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new LinearGradient(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4), Offset.m8945getXimpl(j5), Offset.m8946getYimpl(j5), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(i4));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m9088ActualRadialGradientShader8uybcMk(long j4, float f4, List<Color> colors, List<Float> list, int i4) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new RadialGradient(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4), f4, makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m9091toAndroidTileMode0vamqd0(i4));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m9089ActualSweepGradientShader9KIMszo(long j4, List<Color> colors, List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new SweepGradient(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i4 = 0;
        for (int i5 = 1; i5 < lastIndex; i5++) {
            if (Color.m9180getAlphaimpl(colors.get(i5).m9188unboximpl()) == 0.0f) {
                i4++;
            }
        }
        return i4;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> colors, int i4) {
        int i5;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr[i6] = ColorKt.m9232toArgb8_81llA(colors.get(i6).m9188unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i4];
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            long jM9188unboximpl = colors.get(i8).m9188unboximpl();
            if (Color.m9180getAlphaimpl(jM9188unboximpl) == 0.0f) {
                if (i8 == 0) {
                    i5 = i7 + 1;
                    iArr2[i7] = ColorKt.m9232toArgb8_81llA(Color.m9177copywmQWz5c$default(colors.get(1).m9188unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i8 == lastIndex) {
                    i5 = i7 + 1;
                    iArr2[i7] = ColorKt.m9232toArgb8_81llA(Color.m9177copywmQWz5c$default(colors.get(i8 - 1).m9188unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i9 = i7 + 1;
                    iArr2[i7] = ColorKt.m9232toArgb8_81llA(Color.m9177copywmQWz5c$default(colors.get(i8 - 1).m9188unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i7 = i9 + 1;
                    iArr2[i9] = ColorKt.m9232toArgb8_81llA(Color.m9177copywmQWz5c$default(colors.get(i8 + 1).m9188unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i7 = i5;
            } else {
                iArr2[i7] = ColorKt.m9232toArgb8_81llA(jM9188unboximpl);
                i7++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> colors, int i4) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i4 == 0) {
            if (list != null) {
                return CollectionsKt___CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i4];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i5 = 1;
        for (int i6 = 1; i6 < lastIndex; i6++) {
            long jM9188unboximpl = colors.get(i6).m9188unboximpl();
            float fFloatValue = list != null ? list.get(i6).floatValue() : i6 / CollectionsKt__CollectionsKt.getLastIndex(colors);
            int i7 = i5 + 1;
            fArr[i5] = fFloatValue;
            if (Color.m9180getAlphaimpl(jM9188unboximpl) == 0.0f) {
                i5 = i7 + 1;
                fArr[i7] = fFloatValue;
            } else {
                i5 = i7;
            }
        }
        fArr[i5] = list != null ? list.get(CollectionsKt__CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
