package androidx.compose.material3;

import androidx.compose.p014ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalBottomSheetProperties) && this.securePolicy == ((ModalBottomSheetProperties) obj).securePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return (this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.shouldDismissOnBackPress);
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z10) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z10;
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 2) != 0 ? true : z10);
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public ModalBottomSheetProperties(boolean z10) {
        this(SecureFlagPolicy.Inherit, z10);
    }

    @InterfaceC10770a
    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z10, boolean z11) {
        this(secureFlagPolicy, z11);
    }
}
