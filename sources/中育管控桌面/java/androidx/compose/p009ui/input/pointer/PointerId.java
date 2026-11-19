package androidx.compose.p009ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m7880d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", "value", "", "constructor-impl", "(J)J", "getValue", "()J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j6) {
        this.value = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m15101boximpl(long j6) {
        return new PointerId(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m15102constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m15103equalsimpl(long j6, Object obj) {
        return (obj instanceof PointerId) && j6 == ((PointerId) obj).m15107unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m15104equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m15105hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m15106toStringimpl(long j6) {
        return "PointerId(value=" + j6 + ')';
    }

    public boolean equals(Object obj) {
        return m15103equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m15105hashCodeimpl(this.value);
    }

    public String toString() {
        return m15106toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m15107unboximpl() {
        return this.value;
    }
}
