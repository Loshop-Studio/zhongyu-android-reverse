package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.DpOffset;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.C9128p;
import kotlin.jvm.internal.C9132t;
import p123h7.AbstractC8726f;

/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect RectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C9132t.f17496a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairM14230a = AbstractC8726f.m14230a(vectorConverter, fValueOf2);
        Pair pairM14230a2 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(IntSize.Companion), fValueOf2);
        Pair pairM14230a3 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), fValueOf2);
        Pair pairM14230a4 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(C9128p.f17495a), Float.valueOf(0.01f));
        Pair pairM14230a5 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(Rect.Companion), fValueOf);
        Pair pairM14230a6 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(Size.Companion), fValueOf);
        Pair pairM14230a7 = AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(Offset.Companion), fValueOf);
        TwoWayConverter<C3156Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C3156Dp.Companion);
        Float fValueOf3 = Float.valueOf(0.1f);
        VisibilityThresholdMap = AbstractC9080a.m15946k(pairM14230a, pairM14230a2, pairM14230a3, pairM14230a4, pairM14230a5, pairM14230a6, pairM14230a7, AbstractC8726f.m14230a(vectorConverter2, fValueOf3), AbstractC8726f.m14230a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), fValueOf3));
    }

    public static final int getVisibilityThreshold(C9132t c9132t) {
        return 1;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        C3156Dp.Companion companion2 = C3156Dp.Companion;
        float visibilityThreshold = getVisibilityThreshold(companion2);
        float visibilityThreshold2 = getVisibilityThreshold(companion2);
        return DpOffset.m26955constructorimpl((Float.floatToRawIntBits(visibilityThreshold) << 32) | (Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        long j10 = 1;
        return IntOffset.m27021constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(C3156Dp.Companion companion) {
        return C3156Dp.m26899constructorimpl(0.1f);
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return Size.m24095constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        long j10 = 1;
        return IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }
}
