package androidx.compose.p011ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILr6/c;Lkotlin/jvm/internal/e;)V", "inputMode", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", "Lr6/c;", "<set-?>", "inputMode$delegate", "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n85#2:68\n113#2,2:69\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n63#1:68\n63#1:69,2\n*E\n"})
/* loaded from: classes2.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;

    /* renamed from: inputMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState inputMode;

    @NotNull
    private final InterfaceC6471c onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i, InterfaceC6471c interfaceC6471c, AbstractC5824e abstractC5824e) {
        this(i, interfaceC6471c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo11447getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode.getValue()).getValue();
    }

    @Override // androidx.compose.p011ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo11448requestInputModeiuPiT84(int inputMode) {
        return ((Boolean) this.onRequestInputModeChange.invoke(InputMode.m11438boximpl(inputMode))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m11449setInputModeiuPiT84(int i) {
        this.inputMode.setValue(InputMode.m11438boximpl(i));
    }

    private InputModeManagerImpl(int i, InterfaceC6471c interfaceC6471c) {
        this.onRequestInputModeChange = interfaceC6471c;
        this.inputMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m11438boximpl(i), null, 2, null);
    }
}
