package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p013ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m25563boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
    private final MutableState<IntSize> _containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m27062boximpl(IntSize.Companion.m27075getZeroYbymL2g()), null, 2, null);
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.p013ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo26071getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m27074unboximpl();
    }

    @Override // androidx.compose.p013ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo26072getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m25569unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m26108setContainerSizeozmzZPI(long j10) {
        this._containerSize.setValue(IntSize.m27062boximpl(j10));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m26109setKeyboardModifiers5xRPYO0(int i10) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m25563boximpl(i10));
    }

    public void setWindowFocused(boolean z10) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z10));
    }
}
