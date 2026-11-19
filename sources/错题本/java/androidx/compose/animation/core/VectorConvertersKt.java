package androidx.compose.animation.core;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.DpOffset;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.C5828i;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\" \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0011\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b%\u0010)\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b%\u0010+\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b%\u0010-\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0006*\u00020.8F¢\u0006\u0006\u001a\u0004\b%\u0010/\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0006*\u0002008F¢\u0006\u0006\u001a\u0004\b%\u00101\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b%\u00103\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0006*\u0002048F¢\u0006\u0006\u001a\u0004\b%\u00105\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u0006*\u0002068F¢\u0006\u0006\u001a\u0004\b%\u00107¨\u00068"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "(Lr6/c;Lr6/c;)Landroidx/compose/animation/core/TwoWayConverter;", "", "start", "stop", "fraction", "lerp", "(FFF)F", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "", "IntToVector", "Landroidx/compose/ui/unit/Dp;", "DpToVector", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpOffsetToVector", "Landroidx/compose/ui/geometry/Size;", "SizeToVector", "Landroidx/compose/ui/geometry/Offset;", "OffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntSize;", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "RectToVector", "Lkotlin/Float$Companion;", "getVectorConverter", "(Lkotlin/jvm/internal/f;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/i;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VectorConvertersKt {

    @NotNull
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f) {
            return new AnimationVector1D(f);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // p152r6.InterfaceC6471c
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i) {
            return new AnimationVector1D(i);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // p152r6.InterfaceC6471c
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<C2331Dp, AnimationVector1D> DpToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6706invoke0680j_4(((C2331Dp) obj).m13319unboximpl());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m6706invoke0680j_4(float f) {
            return new AnimationVector1D(f);
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2331Dp.m13303boximpl(m6707invokeu2uoSUM((AnimationVector1D) obj));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m6707invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return C2331Dp.m13305constructorimpl(animationVector1D.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6704invokejoFl9I(((DpOffset) obj).m13374unboximpl());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m6704invokejoFl9I(long j7) {
            return new AnimationVector2D(DpOffset.m13366getXD9Ej5fM(j7), DpOffset.m13368getYD9Ej5fM(j7));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return DpOffset.m13360boximpl(m6705invokegVRvYmI((AnimationVector2D) obj));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m6705invokegVRvYmI(AnimationVector2D animationVector2D) {
            float fM13305constructorimpl = C2331Dp.m13305constructorimpl(animationVector2D.getV1());
            float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(animationVector2D.getV2());
            return DpOffset.m13361constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl) << 32) | (Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L));
        }
    });

    @NotNull
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6714invokeuvyYCjk(((Size) obj).m10515unboximpl());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m6714invokeuvyYCjk(long j7) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Size.m10498boximpl(m6715invoke7Ah8Wj8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m6715invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v2 = animationVector2D.getV2();
            return Size.m10501constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L));
        }
    });

    @NotNull
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6712invokek4lQ0M(((Offset) obj).m10451unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m6712invokek4lQ0M(long j7) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m10430boximpl(m6713invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m6713invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v2 = animationVector2D.getV2();
            return Offset.m10433constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L));
        }
    });

    @NotNull
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6708invokegyyYBs(((IntOffset) obj).m13442unboximpl());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m6708invokegyyYBs(long j7) {
            return new AnimationVector2D(IntOffset.m13433getXimpl(j7), IntOffset.m13434getYimpl(j7));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntOffset.m13424boximpl(m6709invokeBjo55l4((AnimationVector2D) obj));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m6709invokeBjo55l4(AnimationVector2D animationVector2D) {
            return IntOffset.m13427constructorimpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & 4294967295L));
        }
    });

    @NotNull
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6710invokeozmzZPI(((IntSize) obj).m13480unboximpl());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m6710invokeozmzZPI(long j7) {
            return new AnimationVector2D((int) (j7 >> 32), (int) (j7 & 4294967295L));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m13468boximpl(m6711invokeYEO4UFw((AnimationVector2D) obj));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m6711invokeYEO4UFw(AnimationVector2D animationVector2D) {
            int iRound = Math.round(animationVector2D.getV1());
            if (iRound < 0) {
                iRound = 0;
            }
            return IntSize.m13471constructorimpl(((Math.round(animationVector2D.getV2()) >= 0 ? r7 : 0) & 4294967295L) | (iRound << 32));
        }
    });

    @NotNull
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // p152r6.InterfaceC6471c
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // p152r6.InterfaceC6471c
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    @NotNull
    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        return new TwoWayConverterImpl(interfaceC6471c, interfaceC6471c2);
    }

    @NotNull
    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@NotNull C5825f c5825f) {
        return FloatToVector;
    }

    public static final float lerp(float f, float f7, float f8) {
        return (f7 * f8) + ((1 - f8) * f);
    }

    @NotNull
    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@NotNull C5828i c5828i) {
        return IntToVector;
    }

    @NotNull
    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@NotNull Rect.Companion companion) {
        return RectToVector;
    }

    @NotNull
    public static final TwoWayConverter<C2331Dp, AnimationVector1D> getVectorConverter(@NotNull C2331Dp.Companion companion) {
        return DpToVector;
    }

    @NotNull
    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@NotNull DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@NotNull Size.Companion companion) {
        return SizeToVector;
    }

    @NotNull
    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@NotNull Offset.Companion companion) {
        return OffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@NotNull IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@NotNull IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
