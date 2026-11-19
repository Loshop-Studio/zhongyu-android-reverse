package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m13558d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "positionChange", "", "downChange", "(ZZ)V", "value", "getDownChange$annotations", "()V", "getDownChange", "()Z", "setDownChange", "(Z)V", "getPositionChange$annotations", "getPositionChange", "setPositionChange", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z9 = false;
        this(z9, z9, 3, null);
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

    public final void setDownChange(boolean z9) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate = pointerInputChange != null ? pointerInputChange.getConsumedDelegate() : null;
        if (consumedDelegate != null) {
            consumedDelegate.setDownChange$ui_release(z9);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui_release(z9);
        }
        this.downChange = z9;
    }

    public final void setPositionChange(boolean z9) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate = pointerInputChange != null ? pointerInputChange.getConsumedDelegate() : null;
        if (consumedDelegate != null) {
            consumedDelegate.setPositionChange$ui_release(z9);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui_release(z9);
        }
        this.positionChange = z9;
    }

    public ConsumedData(boolean z9, boolean z10) {
        this.positionChange = z9;
        this.downChange = z10;
    }

    public /* synthetic */ ConsumedData(boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10);
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange(), pointerInputChange.getDownChange());
        this.change = pointerInputChange;
    }
}
