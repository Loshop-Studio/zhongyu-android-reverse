package androidx.compose.p014ui.graphics.drawscope;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;

/* loaded from: classes2.dex */
public final class DrawContextKt {
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    public static final Density getDefaultDensity() {
        return DefaultDensity;
    }
}
