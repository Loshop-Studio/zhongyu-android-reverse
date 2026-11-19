package androidx.compose.p013ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final ColorFilter m24140actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] actualColorMatrixFromFilter(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m24355getColorMatrix8unuwjk((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final ColorFilter m24141actualLightingColorFilterOWjLjI(long j10, long j11) {
        return new LightingColorFilter(ColorKt.m24330toArgb8_81llA(j10), ColorKt.m24330toArgb8_81llA(j11));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m24142actualTintColorFilterxETnrds(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m24222BlendModeColorFilterxETnrds(j10, i10) : new PorterDuffColorFilter(ColorKt.m24330toArgb8_81llA(j10), AndroidBlendMode_androidKt.m24128toPorterDuffModes9anfk8(i10));
    }

    public static final ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && AbstractC2730g0.m1078a(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(AbstractC2734h0.m1082a(colorFilter));
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
