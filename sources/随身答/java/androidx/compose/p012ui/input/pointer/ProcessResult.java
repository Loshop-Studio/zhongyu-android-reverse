package androidx.compose.p012ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002¨\u0006\u0018"}, m13413d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "value", "", "constructor-impl", "(I)I", "anyMovementConsumed", "", "getAnyMovementConsumed-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getDispatchedToAPointerInputModifier-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i9) {
        this.value = i9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m22714boximpl(int i9) {
        return new ProcessResult(i9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m22715constructorimpl(int i9) {
        return i9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22716equalsimpl(int i9, Object obj) {
        return (obj instanceof ProcessResult) && i9 == ((ProcessResult) obj).m22722unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22717equalsimpl0(int i9, int i10) {
        return i9 == i10;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m22718getAnyMovementConsumedimpl(int i9) {
        return (i9 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m22719getDispatchedToAPointerInputModifierimpl(int i9) {
        return (i9 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22720hashCodeimpl(int i9) {
        return Integer.hashCode(i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22721toStringimpl(int i9) {
        return "ProcessResult(value=" + i9 + ')';
    }

    public boolean equals(Object obj) {
        return m22716equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m22720hashCodeimpl(this.value);
    }

    public String toString() {
        return m22721toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22722unboximpl() {
        return this.value;
    }
}
