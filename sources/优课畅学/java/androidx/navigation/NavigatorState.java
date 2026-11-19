package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.internal.SynchronizedObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8812w0;
import p134i7.AbstractC8814x0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;

/* loaded from: classes3.dex */
public abstract class NavigatorState {
    private final InterfaceC9271h _backStack;
    private final InterfaceC9271h _transitionsInProgress;
    private final InterfaceC9280q backStack;
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;
    private final InterfaceC9280q transitionsInProgress;

    public NavigatorState() {
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(AbstractC8809v.m14771n());
        this._backStack = interfaceC9271hM17054a;
        InterfaceC9271h interfaceC9271hM17054a2 = AbstractC9281r.m17054a(AbstractC8812w0.m14788f());
        this._transitionsInProgress = interfaceC9271hM17054a2;
        this.backStack = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        this.transitionsInProgress = AbstractC9268e.m17012b(interfaceC9271hM17054a2);
    }

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final InterfaceC9280q getBackStack() {
        return this.backStack;
    }

    public final InterfaceC9280q getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(NavBackStackEntry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        InterfaceC9271h interfaceC9271h = this._transitionsInProgress;
        interfaceC9271h.setValue(AbstractC8814x0.m14792j((Set) interfaceC9271h.getValue(), entry));
    }

    @CallSuper
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        int iNextIndex;
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            try {
                List listM14547X0 = AbstractC8778f0.m14547X0((Collection) getBackStack().getValue());
                ListIterator listIterator = listM14547X0.listIterator(listM14547X0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (AbstractC9133u.m16128b(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                listM14547X0.set(iNextIndex, backStackEntry);
                this._backStack.setValue(listM14547X0);
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC9133u.m16128b(navBackStackEntry.getId(), backStackEntry.getId())) {
                InterfaceC9271h interfaceC9271h = this._transitionsInProgress;
                interfaceC9271h.setValue(AbstractC8814x0.m14794l(AbstractC8814x0.m14794l((Set) interfaceC9271h.getValue(), navBackStackEntry), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9133u.m16133g(popUpTo, "popUpTo");
        synchronized (this.backStackLock) {
            try {
                InterfaceC9271h interfaceC9271h = this._backStack;
                Iterable iterable = (Iterable) this._backStack.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (AbstractC9133u.m16128b((NavBackStackEntry) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                interfaceC9271h.setValue(arrayList);
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void popWithTransition(NavBackStackEntry popUpTo, boolean z10) {
        Object objPrevious;
        AbstractC9133u.m16133g(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
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
        InterfaceC9271h interfaceC9271h = this._transitionsInProgress;
        interfaceC9271h.setValue(AbstractC8814x0.m14794l((Set) interfaceC9271h.getValue(), popUpTo));
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!AbstractC9133u.m16128b(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            InterfaceC9271h interfaceC9271h2 = this._transitionsInProgress;
            interfaceC9271h2.setValue(AbstractC8814x0.m14794l((Set) interfaceC9271h2.getValue(), navBackStackEntry2));
        }
        pop(popUpTo, z10);
    }

    @CallSuper
    public void prepareForTransition(NavBackStackEntry entry) {
        AbstractC9133u.m16133g(entry, "entry");
        InterfaceC9271h interfaceC9271h = this._transitionsInProgress;
        interfaceC9271h.setValue(AbstractC8814x0.m14794l((Set) interfaceC9271h.getValue(), entry));
    }

    public void push(NavBackStackEntry backStackEntry) {
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            this._backStack.setValue(AbstractC8778f0.m14530G0((Collection) this._backStack.getValue(), backStackEntry));
            C8736p c8736p = C8736p.f16368a;
        }
    }

    public void pushWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC9133u.m16133g(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
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
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC8778f0.m14579y0((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            InterfaceC9271h interfaceC9271h = this._transitionsInProgress;
            interfaceC9271h.setValue(AbstractC8814x0.m14794l((Set) interfaceC9271h.getValue(), navBackStackEntry));
        }
        InterfaceC9271h interfaceC9271h2 = this._transitionsInProgress;
        interfaceC9271h2.setValue(AbstractC8814x0.m14794l((Set) interfaceC9271h2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z10) {
        this.isNavigating = z10;
    }
}
