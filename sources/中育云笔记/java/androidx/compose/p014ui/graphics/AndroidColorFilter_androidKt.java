package androidx.compose.p014ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final ColorFilter m30742actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m30957getColorMatrix8unuwjk((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final ColorFilter m30743actualLightingColorFilterOWjLjI(long j10, long j11) {
        return new LightingColorFilter(ColorKt.m30932toArgb8_81llA(j10), ColorKt.m30932toArgb8_81llA(j11));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m30744actualTintColorFilterxETnrds(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m30824BlendModeColorFilterxETnrds(j10, i10) : new PorterDuffColorFilter(ColorKt.m30932toArgb8_81llA(j10), AndroidBlendMode_androidKt.m30730toPorterDuffModes9anfk8(i10));
    }

    public static final ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && AbstractC2760g0.m1155a(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(AbstractC2764h0.m1159a(colorFilter));
        }
        if (!(colorFilter instanceof LightingColorFilter) || !supportsLightingColorFilterQuery()) {
            return ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new ColorMatrixColorFilter(null, colorFilter, null) : new ColorFilter(colorFilter);
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
        return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final boolean supportsColorMatrixQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
