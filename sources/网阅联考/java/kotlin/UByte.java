package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(m5174d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u000fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0012J\u001b\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u000fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0012J\u001b\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0016\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0016\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, m5175d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UByte implements Comparable<UByte> {
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b4) {
        this.data = b4;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m11799and7apg3OU(byte b4, byte b5) {
        return m11806constructorimpl((byte) (b4 & b5));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m11800boximpl(byte b4) {
        return new UByte(b4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m11801compareTo7apg3OU(byte b4) {
        return Intrinsics.compare(getData() & MAX_VALUE, b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m11803compareToVKZWuLQ(byte b4, long j4) {
        return Long.compare(ULong.m11962constructorimpl(b4 & 255) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m11804compareToWZ4Q5Ns(byte b4, int i4) {
        return Integer.compare(UInt.m11883constructorimpl(b4 & MAX_VALUE) ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m11805compareToxj2QHRw(byte b4, short s3) {
        return Intrinsics.compare(b4 & MAX_VALUE, s3 & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m11806constructorimpl(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m11807decw2LRezQ(byte b4) {
        return m11806constructorimpl((byte) (b4 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m11808div7apg3OU(byte b4, byte b5) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m11809divVKZWuLQ(byte b4, long j4) {
        return AbstractC3925f.m5203a(ULong.m11962constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m11810divWZ4Q5Ns(byte b4, int i4) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m11811divxj2QHRw(byte b4, short s3) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11812equalsimpl(byte b4, Object obj) {
        return (obj instanceof UByte) && b4 == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11813equalsimpl0(byte b4, byte b5) {
        return b4 == b5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m11814floorDiv7apg3OU(byte b4, byte b5) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m11815floorDivVKZWuLQ(byte b4, long j4) {
        return AbstractC3925f.m5203a(ULong.m11962constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m11816floorDivWZ4Q5Ns(byte b4, int i4) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m11817floorDivxj2QHRw(byte b4, short s3) {
        return AbstractC3866b.m5184a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11818hashCodeimpl(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m11819incw2LRezQ(byte b4) {
        return m11806constructorimpl((byte) (b4 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m11820invw2LRezQ(byte b4) {
        return m11806constructorimpl((byte) (~b4));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m11821minus7apg3OU(byte b4, byte b5) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) - UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m11822minusVKZWuLQ(byte b4, long j4) {
        return ULong.m11962constructorimpl(ULong.m11962constructorimpl(b4 & 255) - j4);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m11823minusWZ4Q5Ns(byte b4, int i4) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) - i4);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m11824minusxj2QHRw(byte b4, short s3) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) - UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m11825mod7apg3OU(byte b4, byte b5) {
        return m11806constructorimpl((byte) AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m11826modVKZWuLQ(byte b4, long j4) {
        return AbstractC3922d.m5199a(ULong.m11962constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m11827modWZ4Q5Ns(byte b4, int i4) {
        return AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m11828modxj2QHRw(byte b4, short s3) {
        return UShort.m12069constructorimpl((short) AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m11829or7apg3OU(byte b4, byte b5) {
        return m11806constructorimpl((byte) (b4 | b5));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m11830plus7apg3OU(byte b4, byte b5) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) + UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m11831plusVKZWuLQ(byte b4, long j4) {
        return ULong.m11962constructorimpl(ULong.m11962constructorimpl(b4 & 255) + j4);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m11832plusWZ4Q5Ns(byte b4, int i4) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) + i4);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m11833plusxj2QHRw(byte b4, short s3) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) + UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m11834rangeTo7apg3OU(byte b4, byte b5) {
        return new UIntRange(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m11835rangeUntil7apg3OU(byte b4, byte b5) {
        return URangesKt___URangesKt.m13081untilJ1ME1BU(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m11836rem7apg3OU(byte b4, byte b5) {
        return AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m11837remVKZWuLQ(byte b4, long j4) {
        return AbstractC3922d.m5199a(ULong.m11962constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m11838remWZ4Q5Ns(byte b4, int i4) {
        return AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m11839remxj2QHRw(byte b4, short s3) {
        return AbstractC3865a.m5183a(UInt.m11883constructorimpl(b4 & MAX_VALUE), UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m11840times7apg3OU(byte b4, byte b5) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) * UInt.m11883constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m11841timesVKZWuLQ(byte b4, long j4) {
        return ULong.m11962constructorimpl(ULong.m11962constructorimpl(b4 & 255) * j4);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m11842timesWZ4Q5Ns(byte b4, int i4) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) * i4);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m11843timesxj2QHRw(byte b4, short s3) {
        return UInt.m11883constructorimpl(UInt.m11883constructorimpl(b4 & MAX_VALUE) * UInt.m11883constructorimpl(s3 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m11844toByteimpl(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m11845toDoubleimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m11846toFloatimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m11847toIntimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m11848toLongimpl(byte b4) {
        return b4 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m11849toShortimpl(byte b4) {
        return (short) (b4 & 255);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11850toStringimpl(byte b4) {
        return String.valueOf(b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m11851toUBytew2LRezQ(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m11852toUIntpVg5ArA(byte b4) {
        return UInt.m11883constructorimpl(b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m11853toULongsVKNKU(byte b4) {
        return ULong.m11962constructorimpl(b4 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m11854toUShortMh2AYeg(byte b4) {
        return UShort.m12069constructorimpl((short) (b4 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m11855xor7apg3OU(byte b4, byte b5) {
        return m11806constructorimpl((byte) (b4 ^ b5));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m11812equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m11818hashCodeimpl(this.data);
    }

    public String toString() {
        return m11850toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m11802compareTo7apg3OU(byte b4, byte b5) {
        return Intrinsics.compare(b4 & MAX_VALUE, b5 & MAX_VALUE);
    }
}
