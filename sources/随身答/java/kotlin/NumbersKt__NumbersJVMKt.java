package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\f*\u00020\u0003H\u0087\b\u001a\r\u0010\b\u001a\u00020\f*\u00020\u0003H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0011\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0012\u001a\u00020\f*\u00020\fH\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u0007*\u00020\u0007H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0007*\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fH\u0087\b¨\u0006\u0016"}, m13413d2 = {"isNaN", "", "", "", "isInfinite", "isFinite", "toBits", "", "toRawBits", "fromBits", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "countOneBits", "countLeadingZeroBits", "countTrailingZeroBits", "takeHighestOneBit", "takeLowestOneBit", "rotateLeft", "bitCount", "rotateRight", "kotlin-stdlib"}, m13414k = 5, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m13418xs = "kotlin/NumbersKt")
/* loaded from: classes5.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(int i9) {
        return Integer.numberOfLeadingZeros(i9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(int i9) {
        return Integer.bitCount(i9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(int i9) {
        return Integer.numberOfTrailingZeros(i9);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j9) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j9);
    }

    @InlineOnly
    private static final boolean isFinite(double d10) {
        return Math.abs(d10) <= Double.MAX_VALUE;
    }

    @InlineOnly
    private static final boolean isInfinite(double d10) {
        return Double.isInfinite(d10);
    }

    @InlineOnly
    private static final boolean isNaN(double d10) {
        return Double.isNaN(d10);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final int rotateLeft(int i9, int i10) {
        return Integer.rotateLeft(i9, i10);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final int rotateRight(int i9, int i10) {
        return Integer.rotateRight(i9, i10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeHighestOneBit(int i9) {
        return Integer.highestOneBit(i9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeLowestOneBit(int i9) {
        return Integer.lowestOneBit(i9);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toBits(double d10) {
        return Double.doubleToLongBits(d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toRawBits(double d10) {
        return Double.doubleToRawLongBits(d10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(long j9) {
        return Long.numberOfLeadingZeros(j9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(long j9) {
        return Long.bitCount(j9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(long j9) {
        return Long.numberOfTrailingZeros(j9);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i9) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i9);
    }

    @InlineOnly
    private static final boolean isFinite(float f10) {
        return Math.abs(f10) <= Float.MAX_VALUE;
    }

    @InlineOnly
    private static final boolean isInfinite(float f10) {
        return Float.isInfinite(f10);
    }

    @InlineOnly
    private static final boolean isNaN(float f10) {
        return Float.isNaN(f10);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final long rotateLeft(long j9, int i9) {
        return Long.rotateLeft(j9, i9);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final long rotateRight(long j9, int i9) {
        return Long.rotateRight(j9, i9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeHighestOneBit(long j9) {
        return Long.highestOneBit(j9);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeLowestOneBit(long j9) {
        return Long.lowestOneBit(j9);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toBits(float f10) {
        return Float.floatToIntBits(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toRawBits(float f10) {
        return Float.floatToRawIntBits(f10);
    }
}
