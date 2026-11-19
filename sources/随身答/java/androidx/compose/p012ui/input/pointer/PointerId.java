package androidx.compose.p012ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m13413d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", "value", "", "constructor-impl", "(J)J", "getValue", "()J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j9) {
        this.value = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m22611boximpl(long j9) {
        return new PointerId(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m22612constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22613equalsimpl(long j9, Object obj) {
        return (obj instanceof PointerId) && j9 == ((PointerId) obj).m22617unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22614equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22615hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22616toStringimpl(long j9) {
        return "PointerId(value=" + j9 + ')';
    }

    public boolean equals(Object obj) {
        return m22613equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m22615hashCodeimpl(this.value);
    }

    public String toString() {
        return m22616toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m22617unboximpl() {
        return this.value;
    }
}
