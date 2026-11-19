package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m5110d2 = {"Landroidx/navigation/NavAction;", "", "destinationId", "", "navOptions", "Landroidx/navigation/NavOptions;", "defaultArguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "getDestinationId", "()I", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "equals", "", "other", "hashCode", "toString", "", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavAction.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.android.kt\nandroidx/navigation/NavAction\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,86:1\n90#2:87\n90#2:88\n*S KotlinDebug\n*F\n+ 1 NavAction.android.kt\nandroidx/navigation/NavAction\n*L\n63#1:87\n69#1:88\n*E\n"})
/* loaded from: classes2.dex */
public final class NavAction {

    @Nullable
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;

    @Nullable
    private NavOptions navOptions;

    @JvmOverloads
    public NavAction(@IdRes int i) {
        this(i, null, null, 6, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) other;
        if (this.destinationId != navAction.destinationId || !AbstractC5830k.m5325b(this.navOptions, navAction.navOptions)) {
            return false;
        }
        Bundle bundle = this.defaultArguments;
        Bundle bundle2 = navAction.defaultArguments;
        if (AbstractC5830k.m5325b(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !SavedStateReader.m13599contentDeepEqualsimpl(SavedStateReader.m13597constructorimpl(bundle), bundle2)) ? false : true;
    }

    @Nullable
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @Nullable
    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        int iHashCode2 = iHashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null) {
            return SavedStateReader.m13600contentDeepHashCodeimpl(SavedStateReader.m13597constructorimpl(bundle)) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final void setDefaultArguments(@Nullable Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(@Nullable NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions) {
        this(i, navOptions, null, 4, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions, @Nullable Bundle bundle) {
        this.destinationId = i;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ NavAction(int i, NavOptions navOptions, Bundle bundle, int i8, AbstractC5824e abstractC5824e) {
        this(i, (i8 & 2) != 0 ? null : navOptions, (i8 & 4) != 0 ? null : bundle);
    }
}
