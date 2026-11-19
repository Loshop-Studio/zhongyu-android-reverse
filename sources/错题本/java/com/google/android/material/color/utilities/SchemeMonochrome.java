package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SchemeMonochrome extends DynamicScheme {
    public SchemeMonochrome(Hct hct, boolean z8, double d9) {
        super(hct, Variant.MONOCHROME, z8, d9, TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE), TonalPalette.fromHueAndChroma(hct.getHue(), AudioStats.AUDIO_AMPLITUDE_NONE));
    }
}
