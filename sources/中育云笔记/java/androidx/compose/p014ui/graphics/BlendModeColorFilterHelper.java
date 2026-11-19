package androidx.compose.p014ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final BlendModeColorFilter m30824BlendModeColorFilterxETnrds(long j10, int i10) {
        AbstractC2846t0.m1235a();
        return AbstractC2842s0.m1232a(ColorKt.m30932toArgb8_81llA(j10), AndroidBlendMode_androidKt.m30729toAndroidBlendModes9anfk8(i10));
    }

    public final BlendModeColorFilter createBlendModeColorFilter(BlendModeColorFilter blendModeColorFilter) {
        return new BlendModeColorFilter(ColorKt.Color(blendModeColorFilter.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
