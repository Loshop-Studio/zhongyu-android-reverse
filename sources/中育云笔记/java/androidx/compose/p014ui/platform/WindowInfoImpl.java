package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p014ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m32165boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
    private final MutableState<IntSize> _containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m33664boximpl(IntSize.Companion.m33677getZeroYbymL2g()), null, 2, null);
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.p014ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo32673getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m33676unboximpl();
    }

    @Override // androidx.compose.p014ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo32674getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m32171unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m32710setContainerSizeozmzZPI(long j10) {
        this._containerSize.setValue(IntSize.m33664boximpl(j10));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m32711setKeyboardModifiers5xRPYO0(int i10) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m32165boximpl(i10));
    }

    public void setWindowFocused(boolean z10) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z10));
    }
}
