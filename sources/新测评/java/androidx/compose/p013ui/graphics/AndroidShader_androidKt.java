package androidx.compose.p013ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001\u001a\u001e\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001\u001a0\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001\u001a&\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m13558d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", TypedValues.TransitionType.S_FROM, "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,199:1\n65#2:200\n69#2:203\n65#2:206\n69#2:209\n65#2:212\n69#2:215\n65#2:218\n69#2:221\n60#3:201\n70#3:204\n60#3:207\n70#3:210\n60#3:213\n70#3:216\n60#3:219\n70#3:222\n22#4:202\n22#4:205\n22#4:208\n22#4:211\n22#4:214\n22#4:217\n22#4:220\n22#4:223\n70#5,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n40#1:200\n41#1:203\n42#1:206\n43#1:209\n60#1:212\n61#1:215\n77#1:218\n78#1:221\n40#1:201\n41#1:204\n42#1:207\n43#1:210\n60#1:213\n61#1:216\n77#1:219\n78#1:222\n40#1:202\n41#1:205\n42#1:208\n43#1:211\n60#1:214\n61#1:217\n77#1:220\n78#1:223\n136#1:224,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m20876ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i10, int i11) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m20881toAndroidTileMode0vamqd0(i10), AndroidTileMode_androidKt.m20881toAndroidTileMode0vamqd0(i11));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m20877ActualLinearGradientShaderVjE6UOU(long j10, long j11, List<Color> list, List<Float> list2, int i10) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m20881toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m20878ActualRadialGradientShader8uybcMk(long j10, float f10, List<Color> list, List<Float> list2, int i10) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m20881toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m20879ActualSweepGradientShader9KIMszo(long j10, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(list);
        for (int i11 = 1; i11 < lastIndex; i11++) {
            if (Color.m20978getAlphaimpl(list.get(i11).m20986unboximpl()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> list, int i10) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = ColorKt.m21030toArgb8_81llA(list.get(i12).m20986unboximpl());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int lastIndex = CollectionsKt.getLastIndex(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long jM20986unboximpl = list.get(i12).m20986unboximpl();
            if (Color.m20978getAlphaimpl(jM20986unboximpl) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m21030toArgb8_81llA(Color.m20975copywmQWz5c$default(list.get(1).m20986unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == lastIndex) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m21030toArgb8_81llA(Color.m20975copywmQWz5c$default(list.get(i12 - 1).m20986unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = ColorKt.m21030toArgb8_81llA(Color.m20975copywmQWz5c$default(list.get(i12 - 1).m20986unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = ColorKt.m21030toArgb8_81llA(Color.m20975copywmQWz5c$default(list.get(i12 + 1).m20986unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = ColorKt.m21030toArgb8_81llA(jM20986unboximpl);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < lastIndex; i12++) {
            long jM20986unboximpl = list2.get(i12).m20986unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt.getLastIndex(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (Color.m20978getAlphaimpl(jM20986unboximpl) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt.getLastIndex(list2)).floatValue() : 1.0f;
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
