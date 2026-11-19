package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    @NonNull
    public static Map<UseCase, Rect> calculateViewPortRects(@NonNull Rect rect, boolean z9, @NonNull Rational rational, @IntRange(from = 0, m488to = 359) int i10, int i11, int i12, @NonNull Map<UseCase, StreamSpec> map) {
        Preconditions.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i10, rational), i11, z9, i12, i10);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF correctStartOrEnd(boolean z9, @IntRange(from = 0, m488to = 359) int i10, RectF rectF, RectF rectF2) {
        boolean z10 = false;
        boolean z11 = i10 == 0 && !z9;
        boolean z12 = i10 == 90 && z9;
        if (z11 || z12) {
            return rectF2;
        }
        boolean z13 = i10 == 0 && z9;
        boolean z14 = i10 == 270 && !z9;
        if (z13 || z14) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z15 = i10 == 90 && !z9;
        boolean z16 = i10 == 180 && z9;
        if (z15 || z16) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z17 = i10 == 180 && !z9;
        if (i10 == 270 && z9) {
            z10 = true;
        }
        if (z17 || z10) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z9 + " rotation " + i10);
    }

    private static RectF flipHorizontally(RectF rectF, float f10) {
        return new RectF(flipX(rectF.right, f10), rectF.top, flipX(rectF.left, f10), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f10) {
        return new RectF(rectF.left, flipY(rectF.bottom, f10), rectF.right, flipY(rectF.top, f10));
    }

    private static float flipX(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    private static float flipY(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    @NonNull
    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(@NonNull RectF rectF, @NonNull Rational rational, int i10, boolean z9, int i11, @IntRange(from = 0, m488to = 359) int i12) {
        if (i10 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i10 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i10 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i10);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z9, i11), i12, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z9, int i10) {
        return z9 ^ (i10 == 1);
    }
}
