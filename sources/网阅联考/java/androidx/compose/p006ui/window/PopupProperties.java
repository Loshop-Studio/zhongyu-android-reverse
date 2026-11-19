package androidx.compose.p006ui.window;

import androidx.compose.foundation.AbstractC0431c;
import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Immutable
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001BC\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nBM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001a"}, m5175d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "focusable", "", "dismissOnBackPress", "dismissOnClickOutside", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "excludeFromSystemGesture", "clippingEnabled", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "usePlatformDefaultWidth", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "getClippingEnabled", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getExcludeFromSystemGesture", "getFocusable", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, WorkQueueKt.MASK, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) other;
        return this.focusable == popupProperties.focusable && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.securePolicy == popupProperties.securePolicy && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.clippingEnabled == popupProperties.clippingEnabled && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((((((AbstractC0431c.m162a(this.dismissOnBackPress) * 31) + AbstractC0431c.m162a(this.focusable)) * 31) + AbstractC0431c.m162a(this.dismissOnBackPress)) * 31) + AbstractC0431c.m162a(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + AbstractC0431c.m162a(this.excludeFromSystemGesture)) * 31) + AbstractC0431c.m162a(this.clippingEnabled)) * 31) + AbstractC0431c.m162a(this.usePlatformDefaultWidth);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z3, boolean z4, boolean z5, SecureFlagPolicy securePolicy, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.focusable = z3;
        this.dismissOnBackPress = z4;
        this.dismissOnClickOutside = z5;
        this.securePolicy = securePolicy;
        this.excludeFromSystemGesture = z6;
        this.clippingEnabled = z7;
        this.usePlatformDefaultWidth = z8;
    }

    public /* synthetic */ PopupProperties(boolean z3, boolean z4, boolean z5, SecureFlagPolicy secureFlagPolicy, boolean z6, boolean z7, boolean z8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? true : z5, (i4 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i4 & 16) != 0 ? true : z6, (i4 & 32) == 0 ? z7 : true, (i4 & 64) != 0 ? false : z8);
    }

    public /* synthetic */ PopupProperties(boolean z3, boolean z4, boolean z5, SecureFlagPolicy secureFlagPolicy, boolean z6, boolean z7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? true : z5, (i4 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i4 & 16) != 0 ? true : z6, (i4 & 32) == 0 ? z7 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupProperties(boolean z3, boolean z4, boolean z5, SecureFlagPolicy securePolicy, boolean z6, boolean z7) {
        this(z3, z4, z5, securePolicy, z6, z7, false);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
