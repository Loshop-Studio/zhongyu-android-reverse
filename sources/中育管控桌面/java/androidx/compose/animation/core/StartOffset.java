package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m7879d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m7880d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j6) {
        this.value = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m10043boximpl(long j6) {
        return new StartOffset(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m10045constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m10046constructorimpl$default(int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i8 & 2) != 0) {
            i7 = StartOffsetType.INSTANCE.m10061getDelayEo1U57Q();
        }
        return m10044constructorimpl(i6, i7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10047equalsimpl(long j6, Object obj) {
        return (obj instanceof StartOffset) && j6 == ((StartOffset) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10048equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m10049getOffsetMillisimpl(long j6) {
        return Math.abs((int) j6);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m10050getOffsetTypeEo1U57Q(long j6) {
        boolean z6 = j6 > 0;
        if (z6) {
            return StartOffsetType.INSTANCE.m10062getFastForwardEo1U57Q();
        }
        if (z6) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.INSTANCE.m10061getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10051hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10052toStringimpl(long j6) {
        return "StartOffset(value=" + j6 + ')';
    }

    public boolean equals(Object obj) {
        return m10047equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m10051hashCodeimpl(this.value);
    }

    public String toString() {
        return m10052toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10044constructorimpl(int i6, int i7) {
        return m10045constructorimpl(i6 * i7);
    }
}
