package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes3.dex */
public final class FragmentLifecycleCallbacksDispatcher {
    private final FragmentManager fragmentManager;
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> lifecycleCallbacks;

    public static final class FragmentLifecycleCallbacksHolder {
        private final FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks callback, boolean z10) {
            AbstractC9133u.m16133g(callback, "callback");
            this.callback = callback;
            this.recursive = z10;
        }

        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        AbstractC9133u.m16133g(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void dispatchOnFragmentActivityCreated(Fragment f10, Bundle bundle, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(f10, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentActivityCreated(this.fragmentManager, f10, bundle);
            }
        }
    }

    public final void dispatchOnFragmentAttached(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentAttached(this.fragmentManager, f10, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(Fragment f10, Bundle bundle, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(f10, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentCreated(this.fragmentManager, f10, bundle);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentDestroyed(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentDetached(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentDetached(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentPaused(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentPaused(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentPreAttached(this.fragmentManager, f10, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(Fragment f10, Bundle bundle, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(f10, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentPreCreated(this.fragmentManager, f10, bundle);
            }
        }
    }

    public final void dispatchOnFragmentResumed(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentResumed(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(Fragment f10, Bundle outState, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        AbstractC9133u.m16133g(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(f10, outState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f10, outState);
            }
        }
    }

    public final void dispatchOnFragmentStarted(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentStarted(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentStopped(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentStopped(this.fragmentManager, f10);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(Fragment f10, View v10, Bundle bundle, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        AbstractC9133u.m16133g(v10, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(f10, v10, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentViewCreated(this.fragmentManager, f10, v10, bundle);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(Fragment f10, boolean z10) {
        AbstractC9133u.m16133g(f10, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC9133u.m16132f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(f10, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z10 || next.getRecursive()) {
                next.getCallback().onFragmentViewDestroyed(this.fragmentManager, f10);
            }
        }
    }

    public final void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks cb, boolean z10) {
        AbstractC9133u.m16133g(cb, "cb");
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(cb, z10));
    }

    public final void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks cb) {
        AbstractC9133u.m16133g(cb, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (this.lifecycleCallbacks.get(i10).getCallback() == cb) {
                        this.lifecycleCallbacks.remove(i10);
                        break;
                    }
                    i10++;
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
