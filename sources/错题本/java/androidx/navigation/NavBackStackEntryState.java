package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.view.Lifecycle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.internal.NavBackStackEntryStateImpl;
import androidx.navigation.internal.NavContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0004\u0010\tJ\n\u0010\u0019\u001a\u00060\u0007j\u0002`\bJ(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\"\u0010#\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u0012\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0015\u001a\u00060\u0007j\u0002`\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m5110d2 = {"Landroidx/navigation/NavBackStackEntryState;", "", "entry", "Landroidx/navigation/NavBackStackEntry;", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "state", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "(Landroid/os/Bundle;)V", "id", "", "getId", "()Ljava/lang/String;", "destinationId", "", "getDestinationId", "()I", "args", "getArgs", "()Landroid/os/Bundle;", "savedState", "getSavedState", "impl", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "writeToState", "instantiate", "context", "Landroidx/navigation/internal/NavContext;", "destination", "Landroidx/navigation/NavDestination;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "prepareArgs", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntryState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryState.android.kt\nandroidx/navigation/NavBackStackEntryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryState {

    @NotNull
    private final NavBackStackEntryStateImpl impl;

    public NavBackStackEntryState(@NotNull NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        this.impl = new NavBackStackEntryStateImpl(entry, entry.getDestination().getId());
    }

    @Nullable
    public final Bundle getArgs() {
        return this.impl.getArgs();
    }

    public final int getDestinationId() {
        return this.impl.getDestinationId();
    }

    @NotNull
    public final String getId() {
        return this.impl.getId();
    }

    @NotNull
    public final Bundle getSavedState() {
        return this.impl.getSavedState();
    }

    @NotNull
    public final NavBackStackEntry instantiate(@NotNull NavContext context, @NotNull NavDestination destination, @NotNull Lifecycle.State hostLifecycleState, @Nullable NavControllerViewModel viewModel) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(destination, "destination");
        AbstractC5830k.m5330g(hostLifecycleState, "hostLifecycleState");
        Bundle args = getArgs();
        return this.impl.instantiate(context, destination, args != null ? prepareArgs(args, context) : null, hostLifecycleState, viewModel);
    }

    @Nullable
    public final Bundle prepareArgs(@NotNull Bundle args, @NotNull NavContext context) {
        AbstractC5830k.m5330g(args, "args");
        AbstractC5830k.m5330g(context, "context");
        Context context2 = context.getContext();
        args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        return args;
    }

    @NotNull
    public final Bundle writeToState() {
        return this.impl.writeToState$navigation_runtime_release();
    }

    public NavBackStackEntryState(@NotNull Bundle state) {
        AbstractC5830k.m5330g(state, "state");
        state.setClassLoader(NavBackStackEntryState.class.getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(state);
    }
}
