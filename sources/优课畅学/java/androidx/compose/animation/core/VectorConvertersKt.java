package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.DpOffset;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.jvm.internal.C9128p;
import kotlin.jvm.internal.C9132t;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f10) {
            return new AnimationVector1D(f10);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // p300x7.InterfaceC10570l
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i10) {
            return new AnimationVector1D(i10);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // p300x7.InterfaceC10570l
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<C3156Dp, AnimationVector1D> DpToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20300invoke0680j_4(((C3156Dp) obj).m26913unboximpl());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m20300invoke0680j_4(float f10) {
            return new AnimationVector1D(f10);
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C3156Dp.m26897boximpl(m20301invokeu2uoSUM((AnimationVector1D) obj));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m20301invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return C3156Dp.m26899constructorimpl(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20298invokejoFl9I(((DpOffset) obj).m26968unboximpl());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m20298invokejoFl9I(long j10) {
            return new AnimationVector2D(DpOffset.m26960getXD9Ej5fM(j10), DpOffset.m26962getYD9Ej5fM(j10));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return DpOffset.m26954boximpl(m20299invokegVRvYmI((AnimationVector2D) obj));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m20299invokegVRvYmI(AnimationVector2D animationVector2D) {
            float fM26899constructorimpl = C3156Dp.m26899constructorimpl(animationVector2D.getV1());
            float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(animationVector2D.getV2());
            return DpOffset.m26955constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl) << 32) | (Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20308invokeuvyYCjk(((Size) obj).m24109unboximpl());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m20308invokeuvyYCjk(long j10) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Size.m24092boximpl(m20309invoke7Ah8Wj8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m20309invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Size.m24095constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20306invokek4lQ0M(((Offset) obj).m24045unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m20306invokek4lQ0M(long j10) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m24024boximpl(m20307invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m20307invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Offset.m24027constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20302invokegyyYBs(((IntOffset) obj).m27036unboximpl());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m20302invokegyyYBs(long j10) {
            return new AnimationVector2D(IntOffset.m27027getXimpl(j10), IntOffset.m27028getYimpl(j10));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m27018boximpl(m20303invokeBjo55l4((AnimationVector2D) obj));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m20303invokeBjo55l4(AnimationVector2D animationVector2D) {
            return IntOffset.m27021constructorimpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20304invokeozmzZPI(((IntSize) obj).m27074unboximpl());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m20304invokeozmzZPI(long j10) {
            return new AnimationVector2D((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m27062boximpl(m20305invokeYEO4UFw((AnimationVector2D) obj));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m20305invokeYEO4UFw(AnimationVector2D animationVector2D) {
            int iRound = Math.round(animationVector2D.getV1());
            if (iRound < 0) {
                iRound = 0;
            }
            return IntSize.m27065constructorimpl(((Math.round(animationVector2D.getV2()) >= 0 ? r7 : 0) & 4294967295L) | (iRound << 32));
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // p300x7.InterfaceC10570l
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // p300x7.InterfaceC10570l
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return new TwoWayConverterImpl(interfaceC10570l, interfaceC10570l2);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(C9128p c9128p) {
        return FloatToVector;
    }

    public static final float lerp(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(C9132t c9132t) {
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<C3156Dp, AnimationVector1D> getVectorConverter(C3156Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
