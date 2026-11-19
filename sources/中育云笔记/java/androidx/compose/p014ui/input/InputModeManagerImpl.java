package androidx.compose.p014ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;
    private final MutableState inputMode$delegate;
    private final InterfaceC9540l onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(i10, interfaceC9540l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo31643getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m31640unboximpl();
    }

    @Override // androidx.compose.p014ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo31644requestInputModeiuPiT84(int i10) {
        return ((Boolean) this.onRequestInputModeChange.invoke(InputMode.m31634boximpl(i10))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m31645setInputModeiuPiT84(int i10) {
        this.inputMode$delegate.setValue(InputMode.m31634boximpl(i10));
    }

    private InputModeManagerImpl(int i10, InterfaceC9540l interfaceC9540l) {
        this.onRequestInputModeChange = interfaceC9540l;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m31634boximpl(i10), null, 2, null);
    }
}
