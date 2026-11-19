package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.internal.SynchronizedObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5795j0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R*\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0+8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/¨\u00062"}, m5110d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Ld6/s;", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "pushWithTransition", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "Landroidx/navigation/internal/SynchronizedObject;", "backStackLock", "Landroidx/navigation/internal/SynchronizedObject;", "Lkotlinx/coroutines/flow/y;", "", "_backStack", "Lkotlinx/coroutines/flow/y;", "", "_transitionsInProgress", "value", "isNavigating", "Z", "()Z", "setNavigating", "(Z)V", "Lkotlinx/coroutines/flow/m0;", "backStack", "Lkotlinx/coroutines/flow/m0;", "getBackStack", "()Lkotlinx/coroutines/flow/m0;", "transitionsInProgress", "getTransitionsInProgress", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 SynchronizedObject.kt\nandroidx/navigation/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvmCommon.kt\nandroidx/navigation/internal/SynchronizedObject_jvmCommonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n38#2:220\n38#2:228\n38#2:249\n24#3:221\n24#3:229\n24#3:250\n1755#4,3:222\n1755#4,3:225\n967#4,7:230\n1755#4,3:237\n2632#4,3:240\n543#4,6:243\n388#4,7:251\n461#4,6:259\n1#5:258\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n59#1:220\n102#1:228\n157#1:249\n59#1:221\n102#1:229\n157#1:250\n76#1:222,3\n77#1:225,3\n103#1:230,7\n125#1:237,3\n126#1:240,3\n132#1:243,6\n160#1:251,7\n183#1:259,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class NavigatorState {

    @NotNull
    private final InterfaceC5959y _backStack;

    @NotNull
    private final InterfaceC5959y _transitionsInProgress;

    @NotNull
    private final InterfaceC5944m0 backStack;

    @NotNull
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;

    @NotNull
    private final InterfaceC5944m0 transitionsInProgress;

    public NavigatorState() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(EmptyList.INSTANCE);
        this._backStack = c5946n0M5546b;
        C5946n0 c5946n0M5546b2 = AbstractC5914h.m5546b(EmptySet.INSTANCE);
        this._transitionsInProgress = c5946n0M5546b2;
        this.backStack = new C5901a0(c5946n0M5546b);
        this.transitionsInProgress = new C5901a0(c5946n0M5546b2);
    }

    @NotNull
    public abstract NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, @Nullable Bundle arguments);

    @NotNull
    public final InterfaceC5944m0 getBackStack() {
        return this.backStack;
    }

    @NotNull
    public final InterfaceC5944m0 getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: isNavigating, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(@NotNull NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        C5946n0 c5946n0 = (C5946n0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetM5162w = AbstractC5795j0.m5162w((Set) c5946n0.getValue(), entry);
        c5946n0.getClass();
        c5946n0.m5571k(null, linkedHashSetM5162w);
    }

    @CallSuper
    public void onLaunchSingleTop(@NotNull NavBackStackEntry backStackEntry) {
        int iNextIndex;
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            try {
                ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0((Collection) getBackStack().getValue());
                ListIterator listIterator = arrayListM5218E0.listIterator(arrayListM5218E0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (AbstractC5830k.m5325b(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListM5218E0.set(iNextIndex, backStackEntry);
                C5946n0 c5946n0 = (C5946n0) this._backStack;
                c5946n0.getClass();
                c5946n0.m5571k(null, arrayListM5218E0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC5830k.m5325b(navBackStackEntry.getId(), backStackEntry.getId())) {
                C5946n0 c5946n0 = (C5946n0) this._transitionsInProgress;
                LinkedHashSet linkedHashSetM5164y = AbstractC5795j0.m5164y(AbstractC5795j0.m5164y((Set) c5946n0.getValue(), navBackStackEntry), backStackEntry);
                c5946n0.getClass();
                c5946n0.m5571k(null, linkedHashSetM5164y);
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        synchronized (this.backStackLock) {
            try {
                InterfaceC5959y interfaceC5959y = this._backStack;
                Iterable iterable = (Iterable) ((C5946n0) this._backStack).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (AbstractC5830k.m5325b((NavBackStackEntry) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
                c5946n0.getClass();
                c5946n0.m5571k(null, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void popWithTransition(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
        Object objPrevious;
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) ((C5946n0) this._transitionsInProgress).getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        C5946n0 c5946n0 = (C5946n0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetM5164y = AbstractC5795j0.m5164y((Set) c5946n0.getValue(), popUpTo);
        c5946n0.getClass();
        c5946n0.m5571k(null, linkedHashSetM5164y);
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!AbstractC5830k.m5325b(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            C5946n0 c5946n02 = (C5946n0) this._transitionsInProgress;
            LinkedHashSet linkedHashSetM5164y2 = AbstractC5795j0.m5164y((Set) c5946n02.getValue(), navBackStackEntry2);
            c5946n02.getClass();
            c5946n02.m5571k(null, linkedHashSetM5164y2);
        }
        pop(popUpTo, saveState);
    }

    @CallSuper
    public void prepareForTransition(@NotNull NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        C5946n0 c5946n0 = (C5946n0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetM5164y = AbstractC5795j0.m5164y((Set) c5946n0.getValue(), entry);
        c5946n0.getClass();
        c5946n0.m5571k(null, linkedHashSetM5164y);
    }

    public void push(@NotNull NavBackStackEntry backStackEntry) {
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            InterfaceC5959y interfaceC5959y = this._backStack;
            ArrayList arrayListM5239s0 = AbstractC5805t.m5239s0((Collection) ((C5946n0) this._backStack).getValue(), backStackEntry);
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            c5946n0.getClass();
            c5946n0.m5571k(null, arrayListM5239s0);
        }
    }

    public void pushWithTransition(@NotNull NavBackStackEntry backStackEntry) {
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) ((C5946n0) this._transitionsInProgress).getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC5805t.m5236p0((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            C5946n0 c5946n0 = (C5946n0) this._transitionsInProgress;
            LinkedHashSet linkedHashSetM5164y = AbstractC5795j0.m5164y((Set) c5946n0.getValue(), navBackStackEntry);
            c5946n0.getClass();
            c5946n0.m5571k(null, linkedHashSetM5164y);
        }
        C5946n0 c5946n02 = (C5946n0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetM5164y2 = AbstractC5795j0.m5164y((Set) c5946n02.getValue(), backStackEntry);
        c5946n02.getClass();
        c5946n02.m5571k(null, linkedHashSetM5164y2);
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z8) {
        this.isNavigating = z8;
    }
}
