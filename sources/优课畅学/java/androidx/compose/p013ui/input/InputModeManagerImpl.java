package androidx.compose.p013ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;
    private final MutableState inputMode$delegate;
    private final InterfaceC10570l onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i10, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(i10, interfaceC10570l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo25041getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m25038unboximpl();
    }

    @Override // androidx.compose.p013ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo25042requestInputModeiuPiT84(int i10) {
        return ((Boolean) this.onRequestInputModeChange.invoke(InputMode.m25032boximpl(i10))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m25043setInputModeiuPiT84(int i10) {
        this.inputMode$delegate.setValue(InputMode.m25032boximpl(i10));
    }

    private InputModeManagerImpl(int i10, InterfaceC10570l interfaceC10570l) {
        this.onRequestInputModeChange = interfaceC10570l;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m25032boximpl(i10), null, 2, null);
    }
}
