package androidx.compose.material3;

import androidx.compose.p013ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final ModalBottomSheetProperties properties = new ModalBottomSheetProperties(false, 1, (AbstractC9126n) null);

    private ModalBottomSheetDefaults() {
    }

    public static /* synthetic */ ModalBottomSheetProperties properties$default(ModalBottomSheetDefaults modalBottomSheetDefaults, SecureFlagPolicy secureFlagPolicy, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secureFlagPolicy = SecureFlagPolicy.Inherit;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return modalBottomSheetDefaults.properties(secureFlagPolicy, z10, z11);
    }

    public final ModalBottomSheetProperties getProperties() {
        return properties;
    }

    @InterfaceC8721a
    public final ModalBottomSheetProperties properties(SecureFlagPolicy secureFlagPolicy, boolean z10, boolean z11) {
        return new ModalBottomSheetProperties(secureFlagPolicy, z11);
    }
}
