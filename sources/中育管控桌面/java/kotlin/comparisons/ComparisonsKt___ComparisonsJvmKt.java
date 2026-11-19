package kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m7879d1 = {"\u0000J\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0017\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007¨\u0006\u0018"}, m7880d2 = {"maxOf", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, m7881k = 5, m7882mv = {2, 2, 0}, m7884xi = 49, m7885xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes4.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    public static <T extends Comparable<? super T>> T maxOf(T a7, T b7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return a7.compareTo(b7) >= 0 ? a7 : b7;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a7, T b7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return a7.compareTo(b7) <= 0 ? a7 : b7;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b7, byte b8) {
        return (byte) Math.max((int) b7, (int) b8);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b7, byte b8) {
        return (byte) Math.min((int) b7, (int) b8);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s6, short s7) {
        return (short) Math.max((int) s6, (int) s7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s6, short s7) {
        return (short) Math.min((int) s6, (int) s7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i6, int i7) {
        return Math.max(i6, i7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i6, int i7) {
        return Math.min(i6, i7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j6, long j7) {
        return Math.max(j6, j7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j6, long j7) {
        return Math.min(j6, j7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f6, float f7) {
        return Math.max(f6, f7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f6, float f7) {
        return Math.min(f6, f7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d6, double d7) {
        return Math.max(d6, d7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d6, double d7) {
        return Math.min(d6, d7);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T maxOf(T a7, T b7, T c7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        Intrinsics.checkNotNullParameter(c7, "c");
        return (T) maxOf(a7, maxOf(b7, c7));
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a7, T b7, T c7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        Intrinsics.checkNotNullParameter(c7, "c");
        return (T) minOf(a7, minOf(b7, c7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b7, byte b8, byte b9) {
        return (byte) Math.max((int) b7, Math.max((int) b8, (int) b9));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b7, byte b8, byte b9) {
        return (byte) Math.min((int) b7, Math.min((int) b8, (int) b9));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s6, short s7, short s8) {
        return (short) Math.max((int) s6, Math.max((int) s7, (int) s8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s6, short s7, short s8) {
        return (short) Math.min((int) s6, Math.min((int) s7, (int) s8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i6, int i7, int i8) {
        return Math.max(i6, Math.max(i7, i8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i6, int i7, int i8) {
        return Math.min(i6, Math.min(i7, i8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j6, long j7, long j8) {
        return Math.max(j6, Math.max(j7, j8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j6, long j7, long j8) {
        return Math.min(j6, Math.min(j7, j8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f6, float f7, float f8) {
        return Math.max(f6, Math.max(f7, f8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f6, float f7, float f8) {
        return Math.min(f6, Math.min(f7, f8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d6, double d7, double d8) {
        return Math.max(d6, Math.max(d7, d8));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d6, double d7, double d8) {
        return Math.min(d6, Math.min(d7, d8));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOf(T a7, T... other) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t6 : other) {
            a7 = (T) maxOf(a7, t6);
        }
        return a7;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOf(T a7, T... other) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t6 : other) {
            a7 = (T) minOf(a7, t6);
        }
        return a7;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b7, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b8 : other) {
            b7 = (byte) Math.max((int) b7, (int) b8);
        }
        return b7;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b7, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b8 : other) {
            b7 = (byte) Math.min((int) b7, (int) b8);
        }
        return b7;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s6, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s7 : other) {
            s6 = (short) Math.max((int) s6, (int) s7);
        }
        return s6;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s6, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s7 : other) {
            s6 = (short) Math.min((int) s6, (int) s7);
        }
        return s6;
    }

    @SinceKotlin(version = "1.4")
    public static int maxOf(int i6, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i7 : other) {
            i6 = Math.max(i6, i7);
        }
        return i6;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i6, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i7 : other) {
            i6 = Math.min(i6, i7);
        }
        return i6;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j6, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j7 : other) {
            j6 = Math.max(j6, j7);
        }
        return j6;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j6, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j7 : other) {
            j6 = Math.min(j6, j7);
        }
        return j6;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f6, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f7 : other) {
            f6 = Math.max(f6, f7);
        }
        return f6;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f6, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f7 : other) {
            f6 = Math.min(f6, f7);
        }
        return f6;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d6, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d7 : other) {
            d6 = Math.max(d6, d7);
        }
        return d6;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d6, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d7 : other) {
            d6 = Math.min(d6, d7);
        }
        return d6;
    }
}
