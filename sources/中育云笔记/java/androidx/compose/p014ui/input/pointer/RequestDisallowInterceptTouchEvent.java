package androidx.compose.p014ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RequestDisallowInterceptTouchEvent implements InterfaceC9540l {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.pointerInteropFilter;
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C10786q.f26013a;
    }

    public final void setPointerInteropFilter$ui_release(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean z10) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.setDisallowIntercept$ui_release(z10);
    }
}
