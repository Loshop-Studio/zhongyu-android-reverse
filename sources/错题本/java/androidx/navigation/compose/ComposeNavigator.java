package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;

@StabilityInferred(parameters = 0)
@Navigator.Name(ComposeNavigator.NAME)
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 0\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006("}, m5110d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "<init>", "()V", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Ld6/s;", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "entry", "prepareForTransition", "(Landroidx/navigation/NavBackStackEntry;)V", "onTransitionComplete", "Landroidx/compose/runtime/MutableState;", "isPop", "Landroidx/compose/runtime/MutableState;", "isPop$navigation_compose_release", "()Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/flow/m0;", "", "getTransitionsInProgress$navigation_compose_release", "()Lkotlinx/coroutines/flow/m0;", "transitionsInProgress", "getBackStack", "backStack", "Companion", "Destination", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1863#2,2:143\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n57#1:143,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeNavigator extends Navigator<Destination> {

    @NotNull
    public static final String NAME = "composable";

    @NotNull
    private final MutableState<Boolean> isPop;
    public static final int $stable = 8;

    public ComposeNavigator() {
        super(NAME);
        this.isPop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @NotNull
    public final InterfaceC5944m0 getBackStack() {
        return getState().getBackStack();
    }

    @NotNull
    public final InterfaceC5944m0 getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @NotNull
    public final MutableState<Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@NotNull List<NavBackStackEntry> entries, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(@NotNull NavBackStackEntry entry) {
        getState().markTransitionComplete(entry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry popUpTo, boolean savedState) {
        getState().popWithTransition(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }

    public final void prepareForTransition(@NotNull NavBackStackEntry entry) {
        getState().prepareForTransition(entry);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00070\u000e¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\u000fR;\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012RB\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRB\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aRB\u0010\u001f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aRB\u0010\"\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aRB\u0010&\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u000e¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001a¨\u0006)"}, m5110d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/jvm/JvmSuppressWildcards;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Lr6/g;)V", "Lkotlin/Function1;", "(Landroidx/navigation/compose/ComposeNavigator;Lr6/f;)V", "Lr6/g;", "getContent$navigation_compose_release", "()Lr6/g;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Lr6/c;", "getEnterTransition$navigation_compose_release", "()Lr6/c;", "setEnterTransition$navigation_compose_release", "(Lr6/c;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform$navigation_compose_release", "setSizeTransform$navigation_compose_release", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;

        @NotNull
        private final InterfaceC6475g content;

        @Nullable
        private InterfaceC6471c enterTransition;

        @Nullable
        private InterfaceC6471c exitTransition;

        @Nullable
        private InterfaceC6471c popEnterTransition;

        @Nullable
        private InterfaceC6471c popExitTransition;

        @Nullable
        private InterfaceC6471c sizeTransform;

        public Destination(@NotNull ComposeNavigator composeNavigator, @NotNull InterfaceC6475g interfaceC6475g) {
            super(composeNavigator);
            this.content = interfaceC6475g;
        }

        @NotNull
        /* renamed from: getContent$navigation_compose_release, reason: from getter */
        public final InterfaceC6475g getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: getEnterTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getEnterTransition() {
            return this.enterTransition;
        }

        @Nullable
        /* renamed from: getExitTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getExitTransition() {
            return this.exitTransition;
        }

        @Nullable
        /* renamed from: getPopEnterTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getPopEnterTransition() {
            return this.popEnterTransition;
        }

        @Nullable
        /* renamed from: getPopExitTransition$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getPopExitTransition() {
            return this.popExitTransition;
        }

        @Nullable
        /* renamed from: getSizeTransform$navigation_compose_release, reason: from getter */
        public final InterfaceC6471c getSizeTransform() {
            return this.sizeTransform;
        }

        public final void setEnterTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.enterTransition = interfaceC6471c;
        }

        public final void setExitTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.exitTransition = interfaceC6471c;
        }

        public final void setPopEnterTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.popEnterTransition = interfaceC6471c;
        }

        public final void setPopExitTransition$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.popExitTransition = interfaceC6471c;
        }

        public final void setSizeTransform$navigation_compose_release(@Nullable InterfaceC6471c interfaceC6471c) {
            this.sizeTransform = interfaceC6471c;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public /* synthetic */ Destination(ComposeNavigator composeNavigator, final InterfaceC6474f interfaceC6474f) {
            this(composeNavigator, (InterfaceC6475g) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new InterfaceC6475g() { // from class: androidx.navigation.compose.ComposeNavigator.Destination.1
                @Override // p152r6.InterfaceC6475g
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                    return C5443s.f8405a;
                }

                @Composable
                public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1587956030, i, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:109)");
                    }
                    interfaceC6474f.invoke(navBackStackEntry, composer, Integer.valueOf((i >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.getLambda$127448943$navigation_compose_release());
    }
}
