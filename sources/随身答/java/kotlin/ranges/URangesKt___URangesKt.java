package kotlin.ranges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m13412d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0087\b\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0087\b\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\b\u0016\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0002\b\u0017\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b/\u00100\u001a\f\u00101\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u000203H\u0087\u0004\u001a\u0015\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u000204H\u0087\u0004\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u00105\u001a\u00020\r*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010>\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010>\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010>\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010>\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010A\u001a\u001b\u0010H\u001a\u00020\u0004*\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010C\u001a\u001b\u0010H\u001a\u00020\u0019*\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010E\u001a\u001b\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010G\u001a#\u0010N\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010N\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010N\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bU\u0010V\u001a!\u0010N\u001a\u00020\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010XH\u0007¢\u0006\u0004\bY\u0010Z\u001a!\u0010N\u001a\u00020\u0004*\u00020\u00042\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040XH\u0007¢\u0006\u0004\b[\u0010\\¨\u0006]"}, m13413d2 = {"first", "Lkotlin/UInt;", "Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ULong;", "Lkotlin/ranges/ULongProgression;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "Lkotlin/ranges/UIntRange;", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "contains", "", "element", "contains-biwQdVI", "contains-GYNo2lE", "value", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", TypedValues.TransitionType.S_TO, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-WZ9TVnA", "(III)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, m13414k = 5, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m13418xs = "kotlin/ranges/URangesKt")
/* loaded from: classes5.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m25998coerceAtLeast5PvTz6A(short s9, short s10) {
        return Intrinsics.compare(s9 & UShort.MAX_VALUE, 65535 & s10) < 0 ? s10 : s9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m25999coerceAtLeastJ1ME1BU(int i9, int i10) {
        return Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0 ? i10 : i9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m26000coerceAtLeastKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) < 0 ? b11 : b10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m26001coerceAtLeasteb3DHEI(long j9, long j10) {
        return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0 ? j10 : j9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m26002coerceAtMost5PvTz6A(short s9, short s10) {
        return Intrinsics.compare(s9 & UShort.MAX_VALUE, 65535 & s10) > 0 ? s10 : s9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m26003coerceAtMostJ1ME1BU(int i9, int i10) {
        return Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) > 0 ? i10 : i9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m26004coerceAtMostKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) > 0 ? b11 : b10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m26005coerceAtMosteb3DHEI(long j9, long j10) {
        return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) > 0 ? j10 : j9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m26006coerceInJPwROB0(long j9, ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m24926boximpl(j9), (ClosedFloatingPointRange<ULong>) range)).getData();
        }
        if (!range.isEmpty()) {
            return Long.compare(j9 ^ Long.MIN_VALUE, ((ULong) range.getStart()).getData() ^ Long.MIN_VALUE) < 0 ? ((ULong) range.getStart()).getData() : Long.compare(j9 ^ Long.MIN_VALUE, ((ULong) range.getEndInclusive()).getData() ^ Long.MIN_VALUE) > 0 ? ((ULong) range.getEndInclusive()).getData() : j9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m26007coerceInVKSA0NQ(short s9, short s10, short s11) {
        int i9 = s10 & UShort.MAX_VALUE;
        int i10 = s11 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i9, i10) <= 0) {
            int i11 = 65535 & s9;
            return Intrinsics.compare(i11, i9) < 0 ? s10 : Intrinsics.compare(i11, i10) > 0 ? s11 : s9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m25083toStringimpl(s11)) + " is less than minimum " + ((Object) UShort.m25083toStringimpl(s10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m26008coerceInWZ9TVnA(int i9, int i10, int i11) {
        if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0) {
            return Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0 ? i10 : Integer.compare(i9 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0 ? i11 : i9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m24899toStringimpl(i11)) + " is less than minimum " + ((Object) UInt.m24899toStringimpl(i10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m26009coerceInb33U2AM(byte b10, byte b11, byte b12) {
        int i9 = b11 & UByte.MAX_VALUE;
        int i10 = b12 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i9, i10) <= 0) {
            int i11 = b10 & UByte.MAX_VALUE;
            return Intrinsics.compare(i11, i9) < 0 ? b11 : Intrinsics.compare(i11, i10) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m24820toStringimpl(b12)) + " is less than minimum " + ((Object) UByte.m24820toStringimpl(b11)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m26010coerceInsambcqE(long j9, long j10, long j11) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
            return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0 ? j10 : Long.compare(j9 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0 ? j11 : j9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m24978toStringimpl(j11)) + " is less than minimum " + ((Object) ULong.m24978toStringimpl(j10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m26011coerceInwuiCnnA(int i9, ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m24847boximpl(i9), (ClosedFloatingPointRange<UInt>) range)).getData();
        }
        if (!range.isEmpty()) {
            return Integer.compare(i9 ^ Integer.MIN_VALUE, ((UInt) range.getStart()).getData() ^ Integer.MIN_VALUE) < 0 ? ((UInt) range.getStart()).getData() : Integer.compare(i9 ^ Integer.MIN_VALUE, ((UInt) range.getEndInclusive()).getData() ^ Integer.MIN_VALUE) > 0 ? ((UInt) range.getEndInclusive()).getData() : i9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m26012contains68kG9v0(UIntRange contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m25985containsWZ4Q5Ns(UInt.m24853constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m26013containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m25994containsVKZWuLQ(uLong.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m26014containsGab390E(ULongRange contains, int i9) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m25994containsVKZWuLQ(ULong.m24932constructorimpl(i9 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m26015containsULbyJY(ULongRange contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m25994containsVKZWuLQ(ULong.m24932constructorimpl(b10 & 255));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m26016containsZsK3CEQ(UIntRange contains, short s9) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m25985containsWZ4Q5Ns(UInt.m24853constructorimpl(s9 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m26017containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m25985containsWZ4Q5Ns(uInt.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m26018containsfz5IDCE(UIntRange contains, long j9) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m24932constructorimpl(j9 >>> 32) == 0 && contains.m25985containsWZ4Q5Ns(UInt.m24853constructorimpl((int) j9));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m26019containsuhHAxoY(ULongRange contains, short s9) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m25994containsVKZWuLQ(ULong.m24932constructorimpl(s9 & 65535));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m26020downTo5PvTz6A(short s9, short s10) {
        return UIntProgression.INSTANCE.m25982fromClosedRangeNkh28Cs(UInt.m24853constructorimpl(s9 & UShort.MAX_VALUE), UInt.m24853constructorimpl(s10 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m26021downToJ1ME1BU(int i9, int i10) {
        return UIntProgression.INSTANCE.m25982fromClosedRangeNkh28Cs(i9, i10, -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m26022downToKr8caGY(byte b10, byte b11) {
        return UIntProgression.INSTANCE.m25982fromClosedRangeNkh28Cs(UInt.m24853constructorimpl(b10 & UByte.MAX_VALUE), UInt.m24853constructorimpl(b11 & UByte.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m26023downToeb3DHEI(long j9, long j10) {
        return ULongProgression.INSTANCE.m25991fromClosedRange7ftBX0g(j9, j10, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m24847boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m24847boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.INSTANCE.m25982fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression step(UIntProgression uIntProgression, int i9) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i9 > 0, Integer.valueOf(i9));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i9 = -i9;
        }
        return companion.m25982fromClosedRangeNkh28Cs(first, last, i9);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m26024until5PvTz6A(short s9, short s10) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m24853constructorimpl(s9 & UShort.MAX_VALUE), UInt.m24853constructorimpl(UInt.m24853constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static UIntRange m26025untilJ1ME1BU(int i9, int i10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(i9, UInt.m24853constructorimpl(i10 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m26026untilKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b11 & UByte.MAX_VALUE, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m24853constructorimpl(b10 & UByte.MAX_VALUE), UInt.m24853constructorimpl(UInt.m24853constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static ULongRange m26027untileb3DHEI(long j9, long j10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0 ? ULongRange.INSTANCE.getEMPTY() : new ULongRange(j9, ULong.m24932constructorimpl(j10 - ULong.m24932constructorimpl(1 & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m24926boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m24926boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.INSTANCE.m25991fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m24847boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression step(ULongProgression uLongProgression, long j9) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j9 > 0, Long.valueOf(j9));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j9 = -j9;
        }
        return companion.m25991fromClosedRange7ftBX0g(first, last, j9);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.5")
    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m24926boximpl(URandomKt.nextULong(random, uLongRange));
    }
}
