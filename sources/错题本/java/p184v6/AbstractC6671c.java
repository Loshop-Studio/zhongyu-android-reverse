package p184v6;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.random.Random$Default;
import org.jetbrains.annotations.NotNull;
import p117m6.AbstractC6115a;
import p185v7.AbstractC6683l;
import p193w6.C6722a;

/* renamed from: v6.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6671c {

    @NotNull
    public static final Random$Default Default = new Random$Default(null);

    /* renamed from: a */
    public static final AbstractC6669a f11252a;

    static {
        Integer num = AbstractC6115a.f9762a;
        f11252a = (num == null || num.intValue() >= 34) ? new C6722a() : new C6670b();
    }

    public static /* synthetic */ byte[] nextBytes$default(AbstractC6671c abstractC6671c, byte[] bArr, int i, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return abstractC6671c.nextBytes(bArr, i, i8);
    }

    public abstract int nextBits(int i);

    public abstract boolean nextBoolean();

    public abstract byte[] nextBytes(byte[] bArr);

    public byte[] nextBytes(byte[] array, int i, int i8) {
        AbstractC5830k.m5330g(array, "array");
        if (i < 0 || i > array.length || i8 < 0 || i8 > array.length) {
            throw new IllegalArgumentException(AbstractC0037f.m88m(AbstractC0037f.m99x("fromIndex (", ") or toIndex (", i, ") are out of range: 0..", i8), array.length, '.').toString());
        }
        if (i > i8) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i8 + ").").toString());
        }
        int i9 = (i8 - i) / 4;
        for (int i10 = 0; i10 < i9; i10++) {
            int iNextInt = nextInt();
            array[i] = (byte) iNextInt;
            array[i + 1] = (byte) (iNextInt >>> 8);
            array[i + 2] = (byte) (iNextInt >>> 16);
            array[i + 3] = (byte) (iNextInt >>> 24);
            i += 4;
        }
        int i11 = i8 - i;
        int iNextBits = nextBits(i11 * 8);
        for (int i12 = 0; i12 < i11; i12++) {
            array[i + i12] = (byte) (iNextBits >>> (i12 * 8));
        }
        return array;
    }

    public abstract double nextDouble();

    public double nextDouble(double d9) {
        return nextDouble(AudioStats.AUDIO_AMPLITUDE_NONE, d9);
    }

    public abstract float nextFloat();

    public abstract int nextInt();

    public abstract int nextInt(int i);

    public int nextInt(int i, int i8) {
        int iNextInt;
        int i9;
        int iNextBits;
        if (i8 <= i) {
            throw new IllegalArgumentException(AbstractC6683l.m6362b(Integer.valueOf(i), Integer.valueOf(i8)).toString());
        }
        int i10 = i8 - i;
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (((-i10) & i10) == i10) {
                iNextBits = nextBits(31 - Integer.numberOfLeadingZeros(i10));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i9 = iNextInt % i10;
                } while ((i10 - 1) + (iNextInt - i9) < 0);
                iNextBits = i9;
            }
            return i + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i <= iNextInt2 && iNextInt2 < i8) {
                return iNextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j7) {
        return nextLong(0L, j7);
    }

    public double nextDouble(double d9, double d10) {
        double dNextDouble;
        if (d10 <= d9) {
            throw new IllegalArgumentException(AbstractC6683l.m6362b(Double.valueOf(d9), Double.valueOf(d10)).toString());
        }
        double d11 = d10 - d9;
        if (!Double.isInfinite(d11) || Math.abs(d9) > Double.MAX_VALUE || Math.abs(d10) > Double.MAX_VALUE) {
            dNextDouble = d9 + (nextDouble() * d11);
        } else {
            double d12 = 2;
            double dNextDouble2 = ((d10 / d12) - (d9 / d12)) * nextDouble();
            dNextDouble = d9 + dNextDouble2 + dNextDouble2;
        }
        return dNextDouble >= d10 ? Math.nextAfter(d10, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public long nextLong(long j7, long j8) {
        long jNextLong;
        long j9;
        long jNextBits;
        int iNextInt;
        if (j8 <= j7) {
            throw new IllegalArgumentException(AbstractC6683l.m6362b(Long.valueOf(j7), Long.valueOf(j8)).toString());
        }
        long j10 = j8 - j7;
        if (j10 > 0) {
            if (((-j10) & j10) == j10) {
                int i = (int) j10;
                int i8 = (int) (j10 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                } else if (i8 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (nextBits(31 - Integer.numberOfLeadingZeros(i8)) << 32) + (nextInt() & 4294967295L);
                }
                jNextBits = iNextInt & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j9 = jNextLong % j10;
                } while ((j10 - 1) + (jNextLong - j9) < 0);
                jNextBits = j9;
            }
            return j7 + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j7 <= jNextLong2 && jNextLong2 < j8) {
                return jNextLong2;
            }
        }
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
