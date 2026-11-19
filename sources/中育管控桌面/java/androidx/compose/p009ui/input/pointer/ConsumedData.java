package androidx.compose.p009ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m7880d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "positionChange", "", "downChange", "(ZZ)V", "value", "getDownChange$annotations", "()V", "getDownChange", "()Z", "setDownChange", "(Z)V", "getPositionChange$annotations", "getPositionChange", "setPositionChange", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z6 = false;
        this(z6, z6, 3, null);
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            return consumedDelegate.getDownChange();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange() : this.downChange;
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            return consumedDelegate.getPositionChange();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange() : this.positionChange;
    }

    public final void setDownChange(boolean z6) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate = pointerInputChange != null ? pointerInputChange.getConsumedDelegate() : null;
        if (consumedDelegate != null) {
            consumedDelegate.setDownChange$ui_release(z6);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui_release(z6);
        }
        this.downChange = z6;
    }

    public final void setPositionChange(boolean z6) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate = pointerInputChange != null ? pointerInputChange.getConsumedDelegate() : null;
        if (consumedDelegate != null) {
            consumedDelegate.setPositionChange$ui_release(z6);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui_release(z6);
        }
        this.positionChange = z6;
    }

    public ConsumedData(boolean z6, boolean z7) {
        this.positionChange = z6;
        this.downChange = z7;
    }

    public /* synthetic */ ConsumedData(boolean z6, boolean z7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z7);
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange(), pointerInputChange.getDownChange());
        this.change = pointerInputChange;
    }
}
