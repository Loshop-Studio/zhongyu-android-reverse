package androidx.compose.foundation.layout;

import kotlin.ranges.RangesKt___RangesKt;

/* renamed from: androidx.compose.foundation.layout.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0617f {
    /* renamed from: a */
    public static float m198a(SideCalculator sideCalculator, float f4, float f5) {
        return RangesKt___RangesKt.coerceAtMost(sideCalculator.motionOf(f4, f5), 0.0f);
    }

    /* renamed from: b */
    public static float m199b(SideCalculator sideCalculator, float f4, float f5) {
        return RangesKt___RangesKt.coerceAtLeast(sideCalculator.motionOf(f4, f5), 0.0f);
    }
}
