package kotlin.comparisons;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m5174d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, m5175d2 = {"maxOf", ExifInterface.GPS_DIRECTION_TRUE, "", C3335ai.f1705at, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", C3335ai.f1663aD, "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, m5176k = 5, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m5180xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes2.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    public static <T extends Comparable<? super T>> T maxOf(T a4, T b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.compareTo(b4) >= 0 ? a4 : b4;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a4, T b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.compareTo(b4) <= 0 ? a4 : b4;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b4, byte b5) {
        return (byte) Math.max((int) b4, (int) b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b4, byte b5) {
        return (byte) Math.min((int) b4, (int) b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s3, short s4) {
        return (short) Math.max((int) s3, (int) s4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s3, short s4) {
        return (short) Math.min((int) s3, (int) s4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f4, float f5) {
        return Math.max(f4, f5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f4, float f5) {
        return Math.min(f4, f5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d4, double d5) {
        return Math.max(d4, d5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d4, double d5) {
        return Math.min(d4, d5);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T maxOf(T a4, T b4, T c4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c4, "c");
        return (T) maxOf(a4, maxOf(b4, c4));
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a4, T b4, T c4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c4, "c");
        return (T) minOf(a4, minOf(b4, c4));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b4, byte b5, byte b6) {
        return (byte) Math.max((int) b4, Math.max((int) b5, (int) b6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b4, byte b5, byte b6) {
        return (byte) Math.min((int) b4, Math.min((int) b5, (int) b6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s3, short s4, short s5) {
        return (short) Math.max((int) s3, Math.max((int) s4, (int) s5));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s3, short s4, short s5) {
        return (short) Math.min((int) s3, Math.min((int) s4, (int) s5));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i4, int i5, int i6) {
        return Math.max(i4, Math.max(i5, i6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i4, int i5, int i6) {
        return Math.min(i4, Math.min(i5, i6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j4, long j5, long j6) {
        return Math.max(j4, Math.max(j5, j6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j4, long j5, long j6) {
        return Math.min(j4, Math.min(j5, j6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f4, float f5, float f6) {
        return Math.max(f4, Math.max(f5, f6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f4, float f5, float f6) {
        return Math.min(f4, Math.min(f5, f6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d4, double d5, double d6) {
        return Math.max(d4, Math.max(d5, d6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d4, double d5, double d6) {
        return Math.min(d4, Math.min(d5, d6));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOf(T a4, T... other) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t3 : other) {
            a4 = (T) maxOf(a4, t3);
        }
        return a4;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOf(T a4, T... other) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t3 : other) {
            a4 = (T) minOf(a4, t3);
        }
        return a4;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b4, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b5 : other) {
            b4 = (byte) Math.max((int) b4, (int) b5);
        }
        return b4;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b4, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b5 : other) {
            b4 = (byte) Math.min((int) b4, (int) b5);
        }
        return b4;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s3, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s4 : other) {
            s3 = (short) Math.max((int) s3, (int) s4);
        }
        return s3;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s3, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s4 : other) {
            s3 = (short) Math.min((int) s3, (int) s4);
        }
        return s3;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i4, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 : other) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i4, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 : other) {
            i4 = Math.min(i4, i5);
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j4, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j5 : other) {
            j4 = Math.max(j4, j5);
        }
        return j4;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j4, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j5 : other) {
            j4 = Math.min(j4, j5);
        }
        return j4;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f4, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f5 : other) {
            f4 = Math.max(f4, f5);
        }
        return f4;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f4, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f5 : other) {
            f4 = Math.min(f4, f5);
        }
        return f4;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d4, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d5 : other) {
            d4 = Math.max(d4, d5);
        }
        return d4;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d4, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d5 : other) {
            d4 = Math.min(d4, d5);
        }
        return d4;
    }
}
