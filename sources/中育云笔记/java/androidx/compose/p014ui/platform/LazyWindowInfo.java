package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private MutableState<IntSize> _containerSize;
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private InterfaceC9529a onInitializeContainerSize;

    @Override // androidx.compose.p014ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo32673getContainerSizeYbymL2g() {
        if (this._containerSize == null) {
            InterfaceC9529a interfaceC9529a = this.onInitializeContainerSize;
            this._containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m33664boximpl(interfaceC9529a != null ? ((IntSize) interfaceC9529a.invoke()).m33676unboximpl() : IntSize.Companion.m33677getZeroYbymL2g()), null, 2, null);
            this.onInitializeContainerSize = null;
        }
        MutableState<IntSize> mutableState = this._containerSize;
        AbstractC9979u.m20291d(mutableState);
        return mutableState.getValue().m33676unboximpl();
    }

    @Override // androidx.compose.p014ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo32674getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m32171unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m32675setKeyboardModifiers5xRPYO0(int i10) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().setValue(PointerKeyboardModifiers.m32165boximpl(i10));
    }

    public final void setOnInitializeContainerSize(InterfaceC9529a interfaceC9529a) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = interfaceC9529a;
        }
    }

    public void setWindowFocused(boolean z10) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void updateContainerSizeIfObserved(InterfaceC9529a interfaceC9529a) {
        MutableState mutableState = this._containerSize;
        if (mutableState != null) {
            mutableState.setValue(interfaceC9529a.invoke());
        }
    }
}
