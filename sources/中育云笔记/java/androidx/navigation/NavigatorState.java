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
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10983y0;
import p325rc.AbstractC10985z0;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

/* loaded from: classes.dex */
public abstract class NavigatorState {
    private final InterfaceC11603l _backStack;
    private final InterfaceC11603l _transitionsInProgress;
    private final InterfaceC11612u backStack;
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;
    private final InterfaceC11612u transitionsInProgress;

    public NavigatorState() {
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this._backStack = interfaceC11603lM25602a;
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10983y0.m24160f());
        this._transitionsInProgress = interfaceC11603lM25602a2;
        this.backStack = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        this.transitionsInProgress = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
    }

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final InterfaceC11612u getBackStack() {
        return this.backStack;
    }

    public final InterfaceC11612u getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(NavBackStackEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        InterfaceC11603l interfaceC11603l = this._transitionsInProgress;
        interfaceC11603l.setValue(AbstractC10985z0.m24166l((Set) interfaceC11603l.getValue(), entry));
    }

    @CallSuper
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        int iNextIndex;
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            try {
                List listM23925a1 = AbstractC10947g0.m23925a1((Collection) getBackStack().getValue());
                ListIterator listIterator = listM23925a1.listIterator(listM23925a1.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (AbstractC9979u.m20289b(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                listM23925a1.set(iNextIndex, backStackEntry);
                this._backStack.setValue(listM23925a1);
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (AbstractC9979u.m20289b(navBackStackEntry.getId(), backStackEntry.getId())) {
                InterfaceC11603l interfaceC11603l = this._transitionsInProgress;
                interfaceC11603l.setValue(AbstractC10985z0.m24168n(AbstractC10985z0.m24168n((Set) interfaceC11603l.getValue(), navBackStackEntry), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(NavBackStackEntry popUpTo, boolean z10) {
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
        synchronized (this.backStackLock) {
            try {
                InterfaceC11603l interfaceC11603l = this._backStack;
                Iterable iterable = (Iterable) this._backStack.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (AbstractC9979u.m20289b((NavBackStackEntry) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                interfaceC11603l.setValue(arrayList);
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void popWithTransition(NavBackStackEntry popUpTo, boolean z10) {
        Object objPrevious;
        AbstractC9979u.m20294g(popUpTo, "popUpTo");
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
        InterfaceC11603l interfaceC11603l = this._transitionsInProgress;
        interfaceC11603l.setValue(AbstractC10985z0.m24168n((Set) interfaceC11603l.getValue(), popUpTo));
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!AbstractC9979u.m20289b(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            InterfaceC11603l interfaceC11603l2 = this._transitionsInProgress;
            interfaceC11603l2.setValue(AbstractC10985z0.m24168n((Set) interfaceC11603l2.getValue(), navBackStackEntry2));
        }
        pop(popUpTo, z10);
    }

    @CallSuper
    public void prepareForTransition(NavBackStackEntry entry) {
        AbstractC9979u.m20294g(entry, "entry");
        InterfaceC11603l interfaceC11603l = this._transitionsInProgress;
        interfaceC11603l.setValue(AbstractC10985z0.m24168n((Set) interfaceC11603l.getValue(), entry));
    }

    public void push(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            this._backStack.setValue(AbstractC10947g0.m23907I0((Collection) this._backStack.getValue(), backStackEntry));
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public void pushWithTransition(NavBackStackEntry backStackEntry) {
        AbstractC9979u.m20294g(backStackEntry, "backStackEntry");
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
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC10947g0.m23957z0((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            InterfaceC11603l interfaceC11603l = this._transitionsInProgress;
            interfaceC11603l.setValue(AbstractC10985z0.m24168n((Set) interfaceC11603l.getValue(), navBackStackEntry));
        }
        InterfaceC11603l interfaceC11603l2 = this._transitionsInProgress;
        interfaceC11603l2.setValue(AbstractC10985z0.m24168n((Set) interfaceC11603l2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z10) {
        this.isNavigating = z10;
    }
}
