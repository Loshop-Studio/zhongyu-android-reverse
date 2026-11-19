package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class RenderEffectKt {
    @Stable
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m31186BlurEffect3YTHUZs(float f10, float f11, int i10) {
        return new BlurEffect(null, f10, f11, i10, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m31187BlurEffect3YTHUZs$default(float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = TileMode.Companion.m31251getClamp3opZhB0();
        }
        return m31186BlurEffect3YTHUZs(f10, f11, i10);
    }

    @Stable
    public static final OffsetEffect OffsetEffect(float f10, float f11) {
        return new OffsetEffect(null, Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)), null);
    }
}
