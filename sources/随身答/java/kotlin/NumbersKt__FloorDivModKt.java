package kotlin;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

@Metadata(m13412d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¨\u0006\t"}, m13413d2 = {"floorDiv", "", "", "other", "mod", "", "", "", "", "kotlin-stdlib"}, m13414k = 5, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m13418xs = "kotlin/NumbersKt")
/* loaded from: classes5.dex */
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b10, byte b11) {
        int i9 = b10 / b11;
        return ((b10 ^ b11) >= 0 || b11 * i9 == b10) ? i9 : i9 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b10, byte b11) {
        int i9 = b10 % b11;
        return (byte) (i9 + (b11 & (((i9 ^ b11) & ((-i9) | i9)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b10, short s9) {
        int i9 = b10 / s9;
        return ((b10 ^ s9) >= 0 || s9 * i9 == b10) ? i9 : i9 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b10, short s9) {
        int i9 = b10 % s9;
        return (short) (i9 + (s9 & (((i9 ^ s9) & ((-i9) | i9)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b10, int i9) {
        int i10 = b10 / i9;
        return ((b10 ^ i9) >= 0 || i9 * i10 == b10) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b10, int i9) {
        int i10 = b10 % i9;
        return i10 + (i9 & (((i10 ^ i9) & ((-i10) | i10)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b10, long j9) {
        long j10 = b10;
        long j11 = j10 / j9;
        return ((j10 ^ j9) >= 0 || j9 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b10, long j9) {
        long j10 = b10 % j9;
        return j10 + (j9 & (((j10 ^ j9) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s9, byte b10) {
        int i9 = s9 / b10;
        return ((s9 ^ b10) >= 0 || b10 * i9 == s9) ? i9 : i9 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s9, byte b10) {
        int i9 = s9 % b10;
        return (byte) (i9 + (b10 & (((i9 ^ b10) & ((-i9) | i9)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s9, short s10) {
        int i9 = s9 / s10;
        return ((s9 ^ s10) >= 0 || s10 * i9 == s9) ? i9 : i9 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s9, short s10) {
        int i9 = s9 % s10;
        return (short) (i9 + (s10 & (((i9 ^ s10) & ((-i9) | i9)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s9, int i9) {
        int i10 = s9 / i9;
        return ((s9 ^ i9) >= 0 || i9 * i10 == s9) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s9, int i9) {
        int i10 = s9 % i9;
        return i10 + (i9 & (((i10 ^ i9) & ((-i10) | i10)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s9, long j9) {
        long j10 = s9;
        long j11 = j10 / j9;
        return ((j10 ^ j9) >= 0 || j9 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s9, long j9) {
        long j10 = s9 % j9;
        return j10 + (j9 & (((j10 ^ j9) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i9, byte b10) {
        int i10 = i9 / b10;
        return ((i9 ^ b10) >= 0 || b10 * i10 == i9) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i9, byte b10) {
        int i10 = i9 % b10;
        return (byte) (i10 + (b10 & (((i10 ^ b10) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i9, short s9) {
        int i10 = i9 / s9;
        return ((i9 ^ s9) >= 0 || s9 * i10 == i9) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i9, short s9) {
        int i10 = i9 % s9;
        return (short) (i10 + (s9 & (((i10 ^ s9) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i9, int i10) {
        int i11 = i9 / i10;
        return ((i9 ^ i10) >= 0 || i10 * i11 == i9) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i9, int i10) {
        int i11 = i9 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i9, long j9) {
        long j10 = i9;
        long j11 = j10 / j9;
        return ((j10 ^ j9) >= 0 || j9 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i9, long j9) {
        long j10 = i9 % j9;
        return j10 + (j9 & (((j10 ^ j9) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j9, byte b10) {
        long j10 = b10;
        long j11 = j9 / j10;
        return ((j9 ^ j10) >= 0 || j10 * j11 == j9) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j9, byte b10) {
        long j10 = j9 % b10;
        return (byte) (j10 + (r0 & (((j10 ^ r0) & ((-j10) | j10)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j9, short s9) {
        long j10 = s9;
        long j11 = j9 / j10;
        return ((j9 ^ j10) >= 0 || j10 * j11 == j9) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j9, short s9) {
        long j10 = j9 % s9;
        return (short) (j10 + (r0 & (((j10 ^ r0) & ((-j10) | j10)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j9, int i9) {
        long j10 = i9;
        long j11 = j9 / j10;
        return ((j9 ^ j10) >= 0 || j10 * j11 == j9) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j9, int i9) {
        long j10 = i9;
        long j11 = j9 % j10;
        return (int) (j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j9, long j10) {
        long j11 = j9 / j10;
        return ((j9 ^ j10) >= 0 || j10 * j11 == j9) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j9, long j10) {
        long j11 = j9 % j10;
        return j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f10, float f11) {
        float f12 = f10 % f11;
        return (f12 == 0.0f || Math.signum(f12) == Math.signum(f11)) ? f12 : f12 + f11;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f10, double d10) {
        double d11 = f10 % d10;
        return (d11 == AudioStats.AUDIO_AMPLITUDE_NONE || Math.signum(d11) == Math.signum(d10)) ? d11 : d11 + d10;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d10, float f10) {
        double d11 = f10;
        double d12 = d10 % d11;
        return (d12 == AudioStats.AUDIO_AMPLITUDE_NONE || Math.signum(d12) == Math.signum(d11)) ? d12 : d12 + d11;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d10, double d11) {
        double d12 = d10 % d11;
        return (d12 == AudioStats.AUDIO_AMPLITUDE_NONE || Math.signum(d12) == Math.signum(d11)) ? d12 : d12 + d11;
    }
}
