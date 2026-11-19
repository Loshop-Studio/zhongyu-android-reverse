package androidx.compose.p009ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002¨\u0006\u0018"}, m7880d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "value", "", "constructor-impl", "(I)I", "anyMovementConsumed", "", "getAnyMovementConsumed-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getDispatchedToAPointerInputModifier-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i6) {
        this.value = i6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m15204boximpl(int i6) {
        return new ProcessResult(i6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m15205constructorimpl(int i6) {
        return i6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m15206equalsimpl(int i6, Object obj) {
        return (obj instanceof ProcessResult) && i6 == ((ProcessResult) obj).m15212unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m15207equalsimpl0(int i6, int i7) {
        return i6 == i7;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m15208getAnyMovementConsumedimpl(int i6) {
        return (i6 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m15209getDispatchedToAPointerInputModifierimpl(int i6) {
        return (i6 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m15210hashCodeimpl(int i6) {
        return Integer.hashCode(i6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m15211toStringimpl(int i6) {
        return "ProcessResult(value=" + i6 + ')';
    }

    public boolean equals(Object obj) {
        return m15206equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m15210hashCodeimpl(this.value);
    }

    public String toString() {
        return m15211toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m15212unboximpl() {
        return this.value;
    }
}
