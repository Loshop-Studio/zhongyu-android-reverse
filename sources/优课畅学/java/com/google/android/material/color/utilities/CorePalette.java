package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f3829a1;

    /* renamed from: a2 */
    public TonalPalette f3830a2;

    /* renamed from: a3 */
    public TonalPalette f3831a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f3832n1;

    /* renamed from: n2 */
    public TonalPalette f3833n2;

    private CorePalette(int i10, boolean z10) {
        Hct hctFromInt = Hct.fromInt(i10);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z10) {
            this.f3829a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f3830a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f3831a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f3832n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f3833n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f3829a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f3830a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f3831a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f3832n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f3833n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i10) {
        return new CorePalette(i10, true);
    }

    /* renamed from: of */
    public static CorePalette m3640of(int i10) {
        return new CorePalette(i10, false);
    }
}
