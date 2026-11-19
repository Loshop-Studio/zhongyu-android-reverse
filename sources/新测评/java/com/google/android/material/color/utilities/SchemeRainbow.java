package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z9, double d10) {
        super(hct, Variant.RAINBOW, z9, d10, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE));
    }
}
