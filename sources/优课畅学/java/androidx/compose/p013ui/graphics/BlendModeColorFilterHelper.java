package androidx.compose.p013ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final BlendModeColorFilter m24222BlendModeColorFilterxETnrds(long j10, int i10) {
        AbstractC2816t0.m1158a();
        return AbstractC2812s0.m1155a(ColorKt.m24330toArgb8_81llA(j10), AndroidBlendMode_androidKt.m24127toAndroidBlendModes9anfk8(i10));
    }

    public final BlendModeColorFilter createBlendModeColorFilter(BlendModeColorFilter blendModeColorFilter) {
        return new BlendModeColorFilter(ColorKt.Color(blendModeColorFilter.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
