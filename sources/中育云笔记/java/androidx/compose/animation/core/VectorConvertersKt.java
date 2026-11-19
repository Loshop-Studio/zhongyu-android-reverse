package androidx.compose.animation.core;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpOffset;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.jvm.internal.C9974p;
import kotlin.jvm.internal.C9978t;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f10) {
            return new AnimationVector1D(f10);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // p181hd.InterfaceC9540l
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i10) {
            return new AnimationVector1D(i10);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // p181hd.InterfaceC9540l
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<C3186Dp, AnimationVector1D> DpToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26902invoke0680j_4(((C3186Dp) obj).m33515unboximpl());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m26902invoke0680j_4(float f10) {
            return new AnimationVector1D(f10);
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C3186Dp.m33499boximpl(m26903invokeu2uoSUM((AnimationVector1D) obj));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m26903invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return C3186Dp.m33501constructorimpl(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26900invokejoFl9I(((DpOffset) obj).m33570unboximpl());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m26900invokejoFl9I(long j10) {
            return new AnimationVector2D(DpOffset.m33562getXD9Ej5fM(j10), DpOffset.m33564getYD9Ej5fM(j10));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return DpOffset.m33556boximpl(m26901invokegVRvYmI((AnimationVector2D) obj));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m26901invokegVRvYmI(AnimationVector2D animationVector2D) {
            float fM33501constructorimpl = C3186Dp.m33501constructorimpl(animationVector2D.getV1());
            float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(animationVector2D.getV2());
            return DpOffset.m33557constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl) << 32) | (Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26910invokeuvyYCjk(((Size) obj).m30711unboximpl());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m26910invokeuvyYCjk(long j10) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Size.m30694boximpl(m26911invoke7Ah8Wj8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m26911invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Size.m30697constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26908invokek4lQ0M(((Offset) obj).m30647unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m26908invokek4lQ0M(long j10) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m30626boximpl(m26909invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m26909invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26904invokegyyYBs(((IntOffset) obj).m33638unboximpl());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m26904invokegyyYBs(long j10) {
            return new AnimationVector2D(IntOffset.m33629getXimpl(j10), IntOffset.m33630getYimpl(j10));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m33620boximpl(m26905invokeBjo55l4((AnimationVector2D) obj));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m26905invokeBjo55l4(AnimationVector2D animationVector2D) {
            return IntOffset.m33623constructorimpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & 4294967295L));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26906invokeozmzZPI(((IntSize) obj).m33676unboximpl());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m26906invokeozmzZPI(long j10) {
            return new AnimationVector2D((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m33664boximpl(m26907invokeYEO4UFw((AnimationVector2D) obj));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m26907invokeYEO4UFw(AnimationVector2D animationVector2D) {
            int iRound = Math.round(animationVector2D.getV1());
            if (iRound < 0) {
                iRound = 0;
            }
            return IntSize.m33667constructorimpl(((Math.round(animationVector2D.getV2()) >= 0 ? r7 : 0) & 4294967295L) | (iRound << 32));
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // p181hd.InterfaceC9540l
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // p181hd.InterfaceC9540l
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return new TwoWayConverterImpl(interfaceC9540l, interfaceC9540l2);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(C9974p c9974p) {
        return FloatToVector;
    }

    public static final float lerp(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(C9978t c9978t) {
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<C3186Dp, AnimationVector1D> getVectorConverter(C3186Dp.Companion companion) {
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
