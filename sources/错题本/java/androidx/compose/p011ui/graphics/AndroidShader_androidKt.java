package androidx.compose.p011ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010#\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b#\u0010$\u001a7\u0010'\u001a\u0004\u0018\u00010&2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b'\u0010(\u001a-\u0010*\u001a\u00020)2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b*\u0010+*\n\u0010,\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5110d2 = {"Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "(Ljava/util/List;)I", "numTransparentColors", "", "makeTransparentColors", "(Ljava/util/List;I)[I", "stops", "", "makeTransparentStops", "(Ljava/util/List;Ljava/util/List;I)[F", "Ld6/s;", "validateColorStops", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,199:1\n65#2:200\n69#2:203\n65#2:206\n69#2:209\n65#2:212\n69#2:215\n65#2:218\n69#2:221\n60#3:201\n70#3:204\n60#3:207\n70#3:210\n60#3:213\n70#3:216\n60#3:219\n70#3:222\n22#4:202\n22#4:205\n22#4:208\n22#4:211\n22#4:214\n22#4:217\n22#4:220\n22#4:223\n70#5,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n40#1:200\n41#1:203\n42#1:206\n43#1:209\n60#1:212\n61#1:215\n77#1:218\n78#1:221\n40#1:201\n41#1:204\n42#1:207\n43#1:210\n60#1:213\n61#1:216\n77#1:219\n78#1:222\n40#1:202\n41#1:205\n42#1:208\n43#1:211\n60#1:214\n61#1:217\n77#1:220\n78#1:223\n136#1:224,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    @NotNull
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m10582ActualImageShaderF49vj9s(@NotNull ImageBitmap imageBitmap, int i, int i8) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m10587toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m10587toAndroidTileMode0vamqd0(i8));
    }

    @NotNull
    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m10583ActualLinearGradientShaderVjE6UOU(long j7, long j8, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m10587toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m10584ActualRadialGradientShader8uybcMk(long j7, float f, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m10587toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m10585ActualSweepGradientShader9KIMszo(long j7, @NotNull List<Color> list, @Nullable List<Float> list2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iM5282u = AbstractC5806u.m5282u(list);
        for (int i8 = 1; i8 < iM5282u; i8++) {
            if (Color.m10684getAlphaimpl(list.get(i8).m10692unboximpl()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> list, int i) {
        int i8;
        int i9 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i9 < size) {
                iArr[i9] = ColorKt.m10736toArgb8_81llA(list.get(i9).m10692unboximpl());
                i9++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int iM5282u = AbstractC5806u.m5282u(list);
        int size2 = list.size();
        int i10 = 0;
        while (i9 < size2) {
            long jM10692unboximpl = list.get(i9).m10692unboximpl();
            if (Color.m10684getAlphaimpl(jM10692unboximpl) == 0.0f) {
                if (i9 == 0) {
                    i8 = i10 + 1;
                    iArr2[i10] = ColorKt.m10736toArgb8_81llA(Color.m10681copywmQWz5c$default(list.get(1).m10692unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i9 == iM5282u) {
                    i8 = i10 + 1;
                    iArr2[i10] = ColorKt.m10736toArgb8_81llA(Color.m10681copywmQWz5c$default(list.get(i9 - 1).m10692unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i11 = i10 + 1;
                    iArr2[i10] = ColorKt.m10736toArgb8_81llA(Color.m10681copywmQWz5c$default(list.get(i9 - 1).m10692unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i10 += 2;
                    iArr2[i11] = ColorKt.m10736toArgb8_81llA(Color.m10681copywmQWz5c$default(list.get(i9 + 1).m10692unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i10 = i8;
            } else {
                iArr2[i10] = ColorKt.m10736toArgb8_81llA(jM10692unboximpl);
                i10++;
            }
            i9++;
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return AbstractC5805t.m5215B0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iM5282u = AbstractC5806u.m5282u(list2);
        int i8 = 1;
        for (int i9 = 1; i9 < iM5282u; i9++) {
            long jM10692unboximpl = list2.get(i9).m10692unboximpl();
            float fFloatValue = list != null ? list.get(i9).floatValue() : i9 / AbstractC5806u.m5282u(list2);
            int i10 = i8 + 1;
            fArr[i8] = fFloatValue;
            if (Color.m10684getAlphaimpl(jM10692unboximpl) == 0.0f) {
                i8 += 2;
                fArr[i10] = fFloatValue;
            } else {
                i8 = i10;
            }
        }
        fArr[i8] = list != null ? list.get(AbstractC5806u.m5282u(list2)).floatValue() : 1.0f;
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
