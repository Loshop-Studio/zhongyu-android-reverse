package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f2851a1;

    /* renamed from: a2 */
    public TonalPalette f2852a2;

    /* renamed from: a3 */
    public TonalPalette f2853a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f2854n1;

    /* renamed from: n2 */
    public TonalPalette f2855n2;

    private CorePalette(int i, boolean z8) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z8) {
            this.f2851a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f2852a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f2853a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f2854n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f2855n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f2851a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f2852a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f2853a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f2854n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f2855n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    /* renamed from: of */
    public static CorePalette m2537of(int i) {
        return new CorePalette(i, false);
    }
}
