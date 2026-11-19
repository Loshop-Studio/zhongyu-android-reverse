package androidx.compose.p014ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @InterfaceC10770a
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @InterfaceC10770a
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate$ui_release;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui_release = pointerInputChange.getConsumedDelegate$ui_release()) != null) {
            return consumedDelegate$ui_release.getDownChange$ui_release();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange$ui_release() : this.downChange;
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate$ui_release;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui_release = pointerInputChange.getConsumedDelegate$ui_release()) != null) {
            return consumedDelegate$ui_release.getPositionChange$ui_release();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange$ui_release() : this.positionChange;
    }

    public final void setDownChange(boolean z10) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate$ui_release = pointerInputChange != null ? pointerInputChange.getConsumedDelegate$ui_release() : null;
        if (consumedDelegate$ui_release != null) {
            consumedDelegate$ui_release.setDownChange$ui_release(z10);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui_release(z10);
        }
        this.downChange = z10;
    }

    public final void setPositionChange(boolean z10) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate$ui_release = pointerInputChange != null ? pointerInputChange.getConsumedDelegate$ui_release() : null;
        if (consumedDelegate$ui_release != null) {
            consumedDelegate$ui_release.setPositionChange$ui_release(z10);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui_release(z10);
        }
        this.positionChange = z10;
    }

    public ConsumedData(boolean z10, boolean z11) {
        this.positionChange = z10;
        this.downChange = z11;
    }

    public /* synthetic */ ConsumedData(boolean z10, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange$ui_release(), pointerInputChange.getDownChange$ui_release());
        this.change = pointerInputChange;
    }
}
