package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.savedstate.SavedStateReader;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavAction {
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;
    private NavOptions navOptions;

    public NavAction(@IdRes int i10) {
        this(i10, null, null, 6, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.destinationId != navAction.destinationId || !AbstractC9133u.m16128b(this.navOptions, navAction.navOptions)) {
            return false;
        }
        Bundle bundle = this.defaultArguments;
        Bundle bundle2 = navAction.defaultArguments;
        if (AbstractC9133u.m16128b(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !SavedStateReader.m27231contentDeepEqualsimpl(SavedStateReader.m27229constructorimpl(bundle), bundle2)) ? false : true;
    }

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        int iHashCode2 = iHashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        return bundle != null ? (iHashCode2 * 31) + SavedStateReader.m27232contentDeepHashCodeimpl(SavedStateReader.m27229constructorimpl(bundle)) : iHashCode2;
    }

    public final void setDefaultArguments(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavAction.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public NavAction(@IdRes int i10, NavOptions navOptions) {
        this(i10, navOptions, null, 4, null);
    }

    public NavAction(@IdRes int i10, NavOptions navOptions, Bundle bundle) {
        this.destinationId = i10;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ NavAction(int i10, NavOptions navOptions, Bundle bundle, int i11, AbstractC9126n abstractC9126n) {
        this(i10, (i11 & 2) != 0 ? null : navOptions, (i11 & 4) != 0 ? null : bundle);
    }
}
