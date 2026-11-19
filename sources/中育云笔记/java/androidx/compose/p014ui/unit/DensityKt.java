package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class DensityKt {
    @Stable
    public static final Density Density(float f10, float f11) {
        return new DensityImpl(f10, f11);
    }

    public static /* synthetic */ Density Density$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        return Density(f10, f11);
    }
}
