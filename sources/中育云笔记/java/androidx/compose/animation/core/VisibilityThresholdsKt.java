package androidx.compose.animation.core;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpOffset;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.C9974p;
import kotlin.jvm.internal.C9978t;
import p309qc.AbstractC10776g;

/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect RectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        RectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C9978t.f23425a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairM22975a = AbstractC10776g.m22975a(vectorConverter, fValueOf2);
        Pair pairM22975a2 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(IntSize.Companion), fValueOf2);
        Pair pairM22975a3 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), fValueOf2);
        Pair pairM22975a4 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(C9974p.f23424a), Float.valueOf(0.01f));
        Pair pairM22975a5 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(Rect.Companion), fValueOf);
        Pair pairM22975a6 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(Size.Companion), fValueOf);
        Pair pairM22975a7 = AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(Offset.Companion), fValueOf);
        TwoWayConverter<C3186Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C3186Dp.Companion);
        Float fValueOf3 = Float.valueOf(0.1f);
        VisibilityThresholdMap = AbstractC9925a.m20091k(pairM22975a, pairM22975a2, pairM22975a3, pairM22975a4, pairM22975a5, pairM22975a6, pairM22975a7, AbstractC10776g.m22975a(vectorConverter2, fValueOf3), AbstractC10776g.m22975a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), fValueOf3));
    }

    public static final int getVisibilityThreshold(C9978t c9978t) {
        return 1;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        C3186Dp.Companion companion2 = C3186Dp.Companion;
        float visibilityThreshold = getVisibilityThreshold(companion2);
        float visibilityThreshold2 = getVisibilityThreshold(companion2);
        return DpOffset.m33557constructorimpl((Float.floatToRawIntBits(visibilityThreshold) << 32) | (Float.floatToRawIntBits(visibilityThreshold2) & 4294967295L));
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        long j10 = 1;
        return IntOffset.m33623constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final float getVisibilityThreshold(C3186Dp.Companion companion) {
        return C3186Dp.m33501constructorimpl(0.1f);
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return Size.m30697constructorimpl((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L));
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        long j10 = 1;
        return IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }
}
