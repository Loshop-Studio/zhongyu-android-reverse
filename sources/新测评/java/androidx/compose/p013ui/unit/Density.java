package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, m13558d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,111:1\n26#2:112\n26#2:118\n22#2:129\n52#3,5:113\n123#4:119\n123#4:120\n363#4:121\n33#5:122\n148#5:126\n53#6,3:123\n60#6:128\n70#6:131\n57#7:127\n61#7:130\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n58#1:112\n73#1:118\n106#1:129\n68#1:113,5\n76#1:119\n82#1:120\n96#1:121\n97#1:122\n105#1:126\n97#1:123,3\n106#1:128\n106#1:131\n106#1:127\n106#1:130\n*E\n"})
/* loaded from: classes2.dex */
public interface Density extends FontScaling {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m23547roundToPxR2X_6o(Density density, long j10) {
            return Density.super.mo17325roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m23548roundToPx0680j_4(Density density, float f10) {
            return Density.super.mo17326roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m23549toDpGaN1DYA(Density density, long j10) {
            return Density.super.mo17327toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m23551toDpu2uoSUM(Density density, int i10) {
            return Density.super.mo17329toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m23552toDpSizekrfVVM(Density density, long j10) {
            return Density.super.mo17330toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m23553toPxR2X_6o(Density density, long j10) {
            return Density.super.mo17331toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m23554toPx0680j_4(Density density, float f10) {
            return Density.super.mo17332toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m23555toSizeXkaWNTQ(Density density, long j10) {
            return Density.super.mo17333toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m23556toSp0xMU5do(Density density, float f10) {
            return Density.super.mo17334toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m23558toSpkPz2Gy4(Density density, int i10) {
            return Density.super.mo17336toSpkPz2Gy4(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m23550toDpu2uoSUM(Density density, float f10) {
            return Density.super.mo17328toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m23557toSpkPz2Gy4(Density density, float f10) {
            return Density.super.mo17335toSpkPz2Gy4(f10);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo17325roundToPxR2X_6o(long j10) {
        return Math.round(mo17331toPxR2X_6o(j10));
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo17326roundToPx0680j_4(float f10) {
        float fMo17332toPx0680j_4 = mo17332toPx0680j_4(f10);
        if (Float.isInfinite(fMo17332toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo17332toPx0680j_4);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo17329toDpu2uoSUM(int i10) {
        return C3127Dp.m23561constructorimpl(i10 / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo17330toDpSizekrfVVM(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m23583DpSizeYgX7TsA(mo17328toDpu2uoSUM(Float.intBitsToFloat((int) (j10 >> 32))), mo17328toDpu2uoSUM(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : DpSize.INSTANCE.m23668getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo17331toPxR2X_6o(long j10) {
        if (!TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j10), TextUnitType.INSTANCE.m23788getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo17332toPx0680j_4(mo17327toDpGaN1DYA(j10));
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo17332toPx0680j_4(float f10) {
        return f10 * getDensity();
    }

    @Stable
    default Rect toRect(DpRect dpRect) {
        return new Rect(mo17332toPx0680j_4(dpRect.m23644getLeftD9Ej5fM()), mo17332toPx0680j_4(dpRect.m23646getTopD9Ej5fM()), mo17332toPx0680j_4(dpRect.m23645getRightD9Ej5fM()), mo17332toPx0680j_4(dpRect.m23643getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo17333toSizeXkaWNTQ(long j10) {
        if (j10 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m20812getUnspecifiedNHjbRc();
        }
        float fMo17332toPx0680j_4 = mo17332toPx0680j_4(DpSize.m23659getWidthD9Ej5fM(j10));
        float fMo17332toPx0680j_42 = mo17332toPx0680j_4(DpSize.m23657getHeightD9Ej5fM(j10));
        return Size.m20795constructorimpl((Float.floatToRawIntBits(fMo17332toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo17332toPx0680j_4) << 32));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo17336toSpkPz2Gy4(int i10) {
        return mo17334toSp0xMU5do(mo17329toDpu2uoSUM(i10));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo17335toSpkPz2Gy4(float f10) {
        return mo17334toSp0xMU5do(mo17328toDpu2uoSUM(f10));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo17328toDpu2uoSUM(float f10) {
        return C3127Dp.m23561constructorimpl(f10 / getDensity());
    }
}
