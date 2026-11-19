package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f3434a1;

    /* renamed from: a2 */
    public TonalPalette f3435a2;

    /* renamed from: a3 */
    public TonalPalette f3436a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f3437n1;

    /* renamed from: n2 */
    public TonalPalette f3438n2;

    private CorePalette(int i6, boolean z6) {
        Hct hctFromInt = Hct.fromInt(i6);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z6) {
            this.f3434a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f3435a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f3436a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f3437n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f3438n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f3434a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f3435a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f3436a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f3437n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f3438n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i6) {
        return new CorePalette(i6, true);
    }

    /* renamed from: of */
    public static CorePalette m3460of(int i6) {
        return new CorePalette(i6, false);
    }
}
