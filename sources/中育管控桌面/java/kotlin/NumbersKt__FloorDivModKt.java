package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

@Metadata(m7879d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¨\u0006\t"}, m7880d2 = {"floorDiv", "", "", "other", "mod", "", "", "", "", "kotlin-stdlib"}, m7881k = 5, m7882mv = {2, 2, 0}, m7884xi = 49, m7885xs = "kotlin/NumbersKt")
/* loaded from: classes4.dex */
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b7, byte b8) {
        int i6 = b7 / b8;
        return ((b7 ^ b8) >= 0 || b8 * i6 == b7) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b7, byte b8) {
        int i6 = b7 % b8;
        return (byte) (i6 + (b8 & (((i6 ^ b8) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b7, short s6) {
        int i6 = b7 / s6;
        return ((b7 ^ s6) >= 0 || s6 * i6 == b7) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b7, short s6) {
        int i6 = b7 % s6;
        return (short) (i6 + (s6 & (((i6 ^ s6) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b7, int i6) {
        int i7 = b7 / i6;
        return ((b7 ^ i6) >= 0 || i6 * i7 == b7) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b7, int i6) {
        int i7 = b7 % i6;
        return i7 + (i6 & (((i7 ^ i6) & ((-i7) | i7)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b7, long j6) {
        long j7 = b7;
        long j8 = j7 / j6;
        return ((j7 ^ j6) >= 0 || j6 * j8 == j7) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b7, long j6) {
        long j7 = b7 % j6;
        return j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s6, byte b7) {
        int i6 = s6 / b7;
        return ((s6 ^ b7) >= 0 || b7 * i6 == s6) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s6, byte b7) {
        int i6 = s6 % b7;
        return (byte) (i6 + (b7 & (((i6 ^ b7) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s6, short s7) {
        int i6 = s6 / s7;
        return ((s6 ^ s7) >= 0 || s7 * i6 == s6) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s6, short s7) {
        int i6 = s6 % s7;
        return (short) (i6 + (s7 & (((i6 ^ s7) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s6, int i6) {
        int i7 = s6 / i6;
        return ((s6 ^ i6) >= 0 || i6 * i7 == s6) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s6, int i6) {
        int i7 = s6 % i6;
        return i7 + (i6 & (((i7 ^ i6) & ((-i7) | i7)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s6, long j6) {
        long j7 = s6;
        long j8 = j7 / j6;
        return ((j7 ^ j6) >= 0 || j6 * j8 == j7) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s6, long j6) {
        long j7 = s6 % j6;
        return j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i6, byte b7) {
        int i7 = i6 / b7;
        return ((i6 ^ b7) >= 0 || b7 * i7 == i6) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i6, byte b7) {
        int i7 = i6 % b7;
        return (byte) (i7 + (b7 & (((i7 ^ b7) & ((-i7) | i7)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i6, short s6) {
        int i7 = i6 / s6;
        return ((i6 ^ s6) >= 0 || s6 * i7 == i6) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i6, short s6) {
        int i7 = i6 % s6;
        return (short) (i7 + (s6 & (((i7 ^ s6) & ((-i7) | i7)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i6, int i7) {
        int i8 = i6 / i7;
        return ((i6 ^ i7) >= 0 || i7 * i8 == i6) ? i8 : i8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i6, int i7) {
        int i8 = i6 % i7;
        return i8 + (i7 & (((i8 ^ i7) & ((-i8) | i8)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i6, long j6) {
        long j7 = i6;
        long j8 = j7 / j6;
        return ((j7 ^ j6) >= 0 || j6 * j8 == j7) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i6, long j6) {
        long j7 = i6 % j6;
        return j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j6, byte b7) {
        long j7 = b7;
        long j8 = j6 / j7;
        return ((j6 ^ j7) >= 0 || j7 * j8 == j6) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j6, byte b7) {
        long j7 = j6 % b7;
        return (byte) (j7 + (r0 & (((j7 ^ r0) & ((-j7) | j7)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j6, short s6) {
        long j7 = s6;
        long j8 = j6 / j7;
        return ((j6 ^ j7) >= 0 || j7 * j8 == j6) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j6, short s6) {
        long j7 = j6 % s6;
        return (short) (j7 + (r0 & (((j7 ^ r0) & ((-j7) | j7)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j6, int i6) {
        long j7 = i6;
        long j8 = j6 / j7;
        return ((j6 ^ j7) >= 0 || j7 * j8 == j6) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j6, int i6) {
        long j7 = i6;
        long j8 = j6 % j7;
        return (int) (j8 + (j7 & (((j8 ^ j7) & ((-j8) | j8)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j6, long j7) {
        long j8 = j6 / j7;
        return ((j6 ^ j7) >= 0 || j7 * j8 == j6) ? j8 : j8 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j6, long j7) {
        long j8 = j6 % j7;
        return j8 + (j7 & (((j8 ^ j7) & ((-j8) | j8)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f6, float f7) {
        float f8 = f6 % f7;
        return (f8 == 0.0f || Math.signum(f8) == Math.signum(f7)) ? f8 : f8 + f7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f6, double d6) {
        double d7 = f6 % d6;
        return (d7 == 0.0d || Math.signum(d7) == Math.signum(d6)) ? d7 : d7 + d6;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d6, float f6) {
        double d7 = f6;
        double d8 = d6 % d7;
        return (d8 == 0.0d || Math.signum(d8) == Math.signum(d7)) ? d8 : d8 + d7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d6, double d7) {
        double d8 = d6 % d7;
        return (d8 == 0.0d || Math.signum(d8) == Math.signum(d7)) ? d8 : d8 + d7;
    }
}
