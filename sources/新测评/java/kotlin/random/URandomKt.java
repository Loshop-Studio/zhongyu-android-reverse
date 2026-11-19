package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

@Metadata(m13557d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a/\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, m13558d2 = {"nextUInt", "Lkotlin/UInt;", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)I", "until", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", TypedValues.TransitionType.S_FROM, "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "Lkotlin/ULong;", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "nextUBytes", "Lkotlin/UByteArray;", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "size", "", "(Lkotlin/random/Random;I)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "checkUIntRangeBounds", "", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes5.dex */
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m25512checkUIntRangeBoundsJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m24388boximpl(i10), UInt.m24388boximpl(i11)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m25513checkULongRangeBoundseb3DHEI(long j10, long j11) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m24467boximpl(j10), ULong.m24467boximpl(j11)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte[] nextUBytes(Random random, int i10) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m24370constructorimpl(random.nextBytes(i10));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m25514nextUBytesEVgfTAA(Random nextUBytes, byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m25515nextUBytesWvrt4B4(Random nextUBytes, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i10, i11);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m25516nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = UByteArray.m24376getSizeimpl(bArr);
        }
        return m25515nextUBytesWvrt4B4(random, bArr, i10, i11);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m24394constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m25517nextUInta8DCA5k(Random nextUInt, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m25512checkUIntRangeBoundsJ1ME1BU(i10, i11);
        return UInt.m24394constructorimpl(nextUInt.nextInt(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m25518nextUIntqCasIEU(Random nextUInt, int i10) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m25517nextUInta8DCA5k(nextUInt, 0, i10);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m24473constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m25519nextULongV1Xi4fY(Random nextULong, long j10) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m25520nextULongjmpaWc(nextULong, 0L, j10);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m25520nextULongjmpaWc(Random nextULong, long j10, long j11) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m25513checkULongRangeBoundseb3DHEI(j10, j11);
        return ULong.m24473constructorimpl(nextULong.nextLong(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(Random random, UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return Integer.compare(range.getLast() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE) < 0 ? m25517nextUInta8DCA5k(random, range.getFirst(), UInt.m24394constructorimpl(range.getLast() + 1)) : Integer.compare(range.getFirst() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? UInt.m24394constructorimpl(m25517nextUInta8DCA5k(random, UInt.m24394constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(Random random, ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compare(range.getLast() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE) < 0) {
            return m25520nextULongjmpaWc(random, range.getFirst(), ULong.m24473constructorimpl(range.getLast() + ULong.m24473constructorimpl(1 & 4294967295L)));
        }
        if (Long.compare(range.getFirst() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return nextULong(random);
        }
        long j10 = 1 & 4294967295L;
        return ULong.m24473constructorimpl(m25520nextULongjmpaWc(random, ULong.m24473constructorimpl(range.getFirst() - ULong.m24473constructorimpl(j10)), range.getLast()) + ULong.m24473constructorimpl(j10));
    }
}
