package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f4296a1;

    /* renamed from: a2 */
    public TonalPalette f4297a2;

    /* renamed from: a3 */
    public TonalPalette f4298a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f4299n1;

    /* renamed from: n2 */
    public TonalPalette f4300n2;

    private CorePalette(int i10, boolean z9) {
        Hct hctFromInt = Hct.fromInt(i10);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z9) {
            this.f4296a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f4297a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f4298a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f4299n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f4300n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f4296a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f4297a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f4298a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f4299n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f4300n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i10) {
        return new CorePalette(i10, true);
    }

    /* renamed from: of */
    public static CorePalette m4028of(int i10) {
        return new CorePalette(i10, false);
    }
}
