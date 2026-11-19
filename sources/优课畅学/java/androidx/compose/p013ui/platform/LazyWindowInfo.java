package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private MutableState<IntSize> _containerSize;
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private InterfaceC10559a onInitializeContainerSize;

    @Override // androidx.compose.p013ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo26071getContainerSizeYbymL2g() {
        if (this._containerSize == null) {
            InterfaceC10559a interfaceC10559a = this.onInitializeContainerSize;
            this._containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m27062boximpl(interfaceC10559a != null ? ((IntSize) interfaceC10559a.invoke()).m27074unboximpl() : IntSize.Companion.m27075getZeroYbymL2g()), null, 2, null);
            this.onInitializeContainerSize = null;
        }
        MutableState<IntSize> mutableState = this._containerSize;
        AbstractC9133u.m16130d(mutableState);
        return mutableState.getValue().m27074unboximpl();
    }

    @Override // androidx.compose.p013ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo26072getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m25569unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m26073setKeyboardModifiers5xRPYO0(int i10) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().setValue(PointerKeyboardModifiers.m25563boximpl(i10));
    }

    public final void setOnInitializeContainerSize(InterfaceC10559a interfaceC10559a) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = interfaceC10559a;
        }
    }

    public void setWindowFocused(boolean z10) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void updateContainerSizeIfObserved(InterfaceC10559a interfaceC10559a) {
        MutableState mutableState = this._containerSize;
        if (mutableState != null) {
            mutableState.setValue(interfaceC10559a.invoke());
        }
    }
}
