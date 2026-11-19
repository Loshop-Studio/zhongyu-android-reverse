package androidx.navigation;

import android.os.Bundle;
import android.view.C2764i;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p125n7.C6237l;
import p214z6.AbstractC6833k;
import p214z6.C6827e;
import p214z6.C6828f;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u000267B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00028\u00002\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010 J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u000b2\n\u0010#\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00100\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m5110d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "<init>", "()V", "", HintConstants.AUTOFILL_HINT_NAME, "(Ljava/lang/String;)V", "Landroidx/navigation/NavigatorState;", "state", "Ld6/s;", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "createDestination", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "()Z", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "_name", "Ljava/lang/String;", "_state", "Landroidx/navigation/NavigatorState;", "value", "isAttached", "Z", "getName$navigation_common_release", "()Ljava/lang/String;", "getState", "()Landroidx/navigation/NavigatorState;", "Name", "Extras", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,260:1\n1317#2,2:261\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n154#1:261,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Navigator<D extends NavDestination> {

    @Nullable
    private final String _name;

    @Nullable
    private NavigatorState _state;
    private boolean isAttached;

    @Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m5110d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/navigation/Navigator$Name;", "", "value", "", "()Ljava/lang/String;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    public @interface Name {
        String value();
    }

    public Navigator() {
        this._name = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry navigate$lambda$1(Navigator navigator, NavOptions navOptions, Extras extras, NavBackStackEntry backStackEntry) {
        NavDestination navDestinationNavigate;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null || (navDestinationNavigate = navigator.navigate(destination, backStackEntry.getArguments(), navOptions, extras)) == null) {
            return null;
        }
        return navDestinationNavigate.equals(destination) ? backStackEntry : navigator.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(backStackEntry.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onLaunchSingleTop$lambda$3(NavOptionsBuilder navOptions) {
        AbstractC5830k.m5330g(navOptions, "$this$navOptions");
        navOptions.setLaunchSingleTop(true);
        return C5443s.f8405a;
    }

    @NotNull
    public abstract D createDestination();

    @NotNull
    public final String getName$navigation_common_release() {
        String str = this._name;
        if (str != null) {
            return str;
        }
        String strM5320e = AbstractC5832m.m5340a(getClass()).m5320e();
        AbstractC5830k.m5327d(strM5320e);
        return AbstractC5855p.m5390X(strM5320e, "Navigator");
    }

    @NotNull
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Nullable
    public NavDestination navigate(@NotNull D destination, @Nullable Bundle args, @Nullable NavOptions navOptions, @Nullable Extras navigatorExtras) {
        AbstractC5830k.m5330g(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(@NotNull NavigatorState state) {
        AbstractC5830k.m5330g(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void onLaunchSingleTop(@NotNull NavBackStackEntry backStackEntry) {
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new C2826a(15)), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(@NotNull Bundle savedState) {
        AbstractC5830k.m5330g(savedState, "savedState");
    }

    @Nullable
    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(@NotNull List<NavBackStackEntry> entries, @Nullable NavOptions navOptions, @Nullable Extras navigatorExtras) {
        AbstractC5830k.m5330g(entries, "entries");
        C6827e c6827e = new C6827e(new C6828f(AbstractC6833k.m6498y(AbstractC5805t.m5223c0(entries), new C2764i(this, navOptions, 4, navigatorExtras)), false, new C6237l(29)));
        while (c6827e.hasNext()) {
            getState().push((NavBackStackEntry) c6827e.next());
        }
    }

    public void popBackStack(@NotNull NavBackStackEntry popUpTo, boolean savedState) {
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        List list = (List) getState().getBackStack().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry = null;
        while (popBackStack()) {
            navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC5830k.m5325b(navBackStackEntry, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntry != null) {
            getState().pop(navBackStackEntry, savedState);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Navigator(@NotNull String name) {
        AbstractC5830k.m5330g(name, "name");
        this._name = name;
    }
}
