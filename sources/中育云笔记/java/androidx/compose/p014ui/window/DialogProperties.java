package androidx.compose.p014ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }

    public DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13) {
        this.dismissOnBackPress = z10;
        this.dismissOnClickOutside = z11;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z12;
        this.decorFitsSystemWindows = z13;
    }

    public /* synthetic */ DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ DialogProperties(boolean z10, boolean z11, boolean z12, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public DialogProperties(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, SecureFlagPolicy.Inherit, z12, true);
    }

    public /* synthetic */ DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @InterfaceC10770a
    public /* synthetic */ DialogProperties(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy) {
        this(z10, z11, secureFlagPolicy, true, true);
    }
}
