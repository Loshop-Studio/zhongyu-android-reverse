package androidx.compose.p013ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m24176ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i10, int i11) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m24181toAndroidTileMode0vamqd0(i10), AndroidTileMode_androidKt.m24181toAndroidTileMode0vamqd0(i11));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m24177ActualLinearGradientShaderVjE6UOU(long j10, long j11, List<Color> list, List<Float> list2, int i10) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m24181toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m24178ActualRadialGradientShader8uybcMk(long j10, float f10, List<Color> list, List<Float> list2, int i10) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m24181toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m24179ActualSweepGradientShader9KIMszo(long j10, List<Color> list, List<Float> list2) {
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
        int iM14773p = AbstractC8809v.m14773p(list);
        for (int i11 = 1; i11 < iM14773p; i11++) {
            if (Color.m24278getAlphaimpl(list.get(i11).m24286unboximpl()) == 0.0f) {
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
                iArr[i12] = ColorKt.m24330toArgb8_81llA(list.get(i12).m24286unboximpl());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iM14773p = AbstractC8809v.m14773p(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long jM24286unboximpl = list.get(i12).m24286unboximpl();
            if (Color.m24278getAlphaimpl(jM24286unboximpl) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m24330toArgb8_81llA(Color.m24275copywmQWz5c$default(list.get(1).m24286unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == iM14773p) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m24330toArgb8_81llA(Color.m24275copywmQWz5c$default(list.get(i12 - 1).m24286unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = ColorKt.m24330toArgb8_81llA(Color.m24275copywmQWz5c$default(list.get(i12 - 1).m24286unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = ColorKt.m24330toArgb8_81llA(Color.m24275copywmQWz5c$default(list.get(i12 + 1).m24286unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = ColorKt.m24330toArgb8_81llA(jM24286unboximpl);
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
                return AbstractC8778f0.m14541R0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iM14773p = AbstractC8809v.m14773p(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iM14773p; i12++) {
            long jM24286unboximpl = list2.get(i12).m24286unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / AbstractC8809v.m14773p(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (Color.m24278getAlphaimpl(jM24286unboximpl) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(AbstractC8809v.m14773p(list2)).floatValue() : 1.0f;
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
