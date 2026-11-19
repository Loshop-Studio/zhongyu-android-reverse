package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(m7879d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\b\u0010\u0004\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\n\u0010\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\u0004\u001a\u001c\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u000b\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001c\u0010\r\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u0011\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\"\u0010 \u001a\u0014\u0010\t\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010\u000b\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u001c\u0010\r\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010\u0011\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b-\u0010+\u001a\u0014\u0010\t\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u0010\u000b\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b0\u0010/\u001a\u001c\u0010\r\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u0010\u0011\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b3\u00102¨\u00064"}, m7880d2 = {"countOneBits", "", "Lkotlin/UInt;", "countOneBits-WZ4Q5Ns", "(I)I", "countLeadingZeroBits", "countLeadingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "takeHighestOneBit", "takeHighestOneBit-WZ4Q5Ns", "takeLowestOneBit", "takeLowestOneBit-WZ4Q5Ns", "rotateLeft", "bitCount", "rotateLeft-V7xB4Y4", "(II)I", "rotateRight", "rotateRight-V7xB4Y4", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
@JvmName(name = "UNumbersKt")
/* loaded from: classes4.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m17429countLeadingZeroBits7apg3OU(byte b7) {
        return Integer.numberOfLeadingZeros(b7 & UByte.MAX_VALUE) - 24;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m17430countLeadingZeroBitsVKZWuLQ(long j6) {
        return Long.numberOfLeadingZeros(j6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m17431countLeadingZeroBitsWZ4Q5Ns(int i6) {
        return Integer.numberOfLeadingZeros(i6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m17432countLeadingZeroBitsxj2QHRw(short s6) {
        return Integer.numberOfLeadingZeros(s6 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m17433countOneBits7apg3OU(byte b7) {
        return Integer.bitCount(UInt.m17278constructorimpl(b7 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m17434countOneBitsVKZWuLQ(long j6) {
        return Long.bitCount(j6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m17435countOneBitsWZ4Q5Ns(int i6) {
        return Integer.bitCount(i6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m17436countOneBitsxj2QHRw(short s6) {
        return Integer.bitCount(UInt.m17278constructorimpl(s6 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m17437countTrailingZeroBits7apg3OU(byte b7) {
        return Integer.numberOfTrailingZeros(b7 | UByte.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m17438countTrailingZeroBitsVKZWuLQ(long j6) {
        return Long.numberOfTrailingZeros(j6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m17439countTrailingZeroBitsWZ4Q5Ns(int i6) {
        return Integer.numberOfTrailingZeros(i6);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m17440countTrailingZeroBitsxj2QHRw(short s6) {
        return Integer.numberOfTrailingZeros(s6 | 65536);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m17441rotateLeftJSWoG40(long j6, int i6) {
        return ULong.m17357constructorimpl(Long.rotateLeft(j6, i6));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m17442rotateLeftLxnNnR4(byte b7, int i6) {
        return UByte.m17201constructorimpl(NumbersKt__NumbersKt.rotateLeft(b7, i6));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m17443rotateLeftV7xB4Y4(int i6, int i7) {
        return UInt.m17278constructorimpl(Integer.rotateLeft(i6, i7));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m17444rotateLeftolVBNx4(short s6, int i6) {
        return UShort.m17464constructorimpl(NumbersKt__NumbersKt.rotateLeft(s6, i6));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m17445rotateRightJSWoG40(long j6, int i6) {
        return ULong.m17357constructorimpl(Long.rotateRight(j6, i6));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m17446rotateRightLxnNnR4(byte b7, int i6) {
        return UByte.m17201constructorimpl(NumbersKt__NumbersKt.rotateRight(b7, i6));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m17447rotateRightV7xB4Y4(int i6, int i7) {
        return UInt.m17278constructorimpl(Integer.rotateRight(i6, i7));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m17448rotateRightolVBNx4(short s6, int i6) {
        return UShort.m17464constructorimpl(NumbersKt__NumbersKt.rotateRight(s6, i6));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m17449takeHighestOneBit7apg3OU(byte b7) {
        return UByte.m17201constructorimpl((byte) Integer.highestOneBit(b7 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m17450takeHighestOneBitVKZWuLQ(long j6) {
        return ULong.m17357constructorimpl(Long.highestOneBit(j6));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m17451takeHighestOneBitWZ4Q5Ns(int i6) {
        return UInt.m17278constructorimpl(Integer.highestOneBit(i6));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m17452takeHighestOneBitxj2QHRw(short s6) {
        return UShort.m17464constructorimpl((short) Integer.highestOneBit(s6 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m17453takeLowestOneBit7apg3OU(byte b7) {
        return UByte.m17201constructorimpl((byte) Integer.lowestOneBit(b7 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m17454takeLowestOneBitVKZWuLQ(long j6) {
        return ULong.m17357constructorimpl(Long.lowestOneBit(j6));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m17455takeLowestOneBitWZ4Q5Ns(int i6) {
        return UInt.m17278constructorimpl(Integer.lowestOneBit(i6));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m17456takeLowestOneBitxj2QHRw(short s6) {
        return UShort.m17464constructorimpl((short) Integer.lowestOneBit(s6 & UShort.MAX_VALUE));
    }
}
