package androidx.navigation.compose;

import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Navigator.Name(DialogNavigator.NAME)
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0011\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001b\u0010\tR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!0\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006&"}, m5110d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Ld6/s;", "dismiss$navigation_compose_release", "(Landroidx/navigation/NavBackStackEntry;)V", "dismiss", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "entry", "onTransitionComplete$navigation_compose_release", "onTransitionComplete", "Lkotlinx/coroutines/flow/m0;", "getBackStack$navigation_compose_release", "()Lkotlinx/coroutines/flow/m0;", "backStack", "", "getTransitionInProgress$navigation_compose_release", "transitionInProgress", "Companion", "Destination", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1863#2,2:90\n1872#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogNavigator extends Navigator<Destination> {

    @NotNull
    public static final String NAME = "dialog";
    public static final int $stable = 8;

    public DialogNavigator() {
        super(NAME);
    }

    public final void dismiss$navigation_compose_release(@NotNull NavBackStackEntry backStackEntry) {
        popBackStack(backStackEntry, false);
    }

    @NotNull
    public final InterfaceC5944m0 getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    @NotNull
    public final InterfaceC5944m0 getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@NotNull List<NavBackStackEntry> entries, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose_release(@NotNull NavBackStackEntry entry) {
        getState().markTransitionComplete(entry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry popUpTo, boolean savedState) {
        getState().popWithTransition(popUpTo, savedState);
        int iM5231k0 = AbstractC5805t.m5231k0((Iterable) getState().getTransitionsInProgress().getValue(), popUpTo);
        int i = 0;
        for (Object obj : (Iterable) getState().getTransitionsInProgress().getValue()) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (i > iM5231k0) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
            i = i8;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "Landroidx/compose/ui/window/DialogProperties;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", "Lr6/f;", "getContent$navigation_compose_release", "()Lr6/f;", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 8;

        @NotNull
        private final InterfaceC6474f content;

        @NotNull
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, InterfaceC6474f interfaceC6474f, int i, AbstractC5824e abstractC5824e) {
            if ((i & 2) != 0) {
                dialogProperties = new DialogProperties(false, false, false, 7, (AbstractC5824e) null);
            }
            this(dialogNavigator, dialogProperties, interfaceC6474f);
        }

        @NotNull
        /* renamed from: getContent$navigation_compose_release, reason: from getter */
        public final InterfaceC6474f getContent() {
            return this.content;
        }

        @NotNull
        /* renamed from: getDialogProperties$navigation_compose_release, reason: from getter */
        public final DialogProperties getDialogProperties() {
            return this.dialogProperties;
        }

        public Destination(@NotNull DialogNavigator dialogNavigator, @NotNull DialogProperties dialogProperties, @NotNull InterfaceC6474f interfaceC6474f) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = interfaceC6474f;
        }
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m13592getLambda$1092249270$navigation_compose_release(), 2, null);
    }
}
