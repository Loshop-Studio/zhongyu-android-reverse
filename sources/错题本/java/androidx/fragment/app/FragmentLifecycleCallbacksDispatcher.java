package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0013J%\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m5110d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "cb", "", "recursive", "Ld6/s;", "registerFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "unregisterFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "dispatchOnFragmentPreAttached", "(Landroidx/fragment/app/Fragment;Z)V", "dispatchOnFragmentAttached", "Landroid/os/Bundle;", "savedInstanceState", "dispatchOnFragmentPreCreated", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "dispatchOnFragmentCreated", "dispatchOnFragmentActivityCreated", "Landroid/view/View;", "v", "dispatchOnFragmentViewCreated", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "dispatchOnFragmentStarted", "dispatchOnFragmentResumed", "dispatchOnFragmentPaused", "dispatchOnFragmentStopped", "outState", "dispatchOnFragmentSaveInstanceState", "dispatchOnFragmentViewDestroyed", "dispatchOnFragmentDestroyed", "dispatchOnFragmentDetached", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "lifecycleCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "FragmentLifecycleCallbacksHolder", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FragmentLifecycleCallbacksDispatcher {

    @NotNull
    private final FragmentManager fragmentManager;

    @NotNull
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> lifecycleCallbacks;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "callback", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "getCallback", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getRecursive", "()Z", "fragment_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FragmentLifecycleCallbacksHolder {

        @NotNull
        private final FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(@NotNull FragmentManager.FragmentLifecycleCallbacks callback, boolean z8) {
            AbstractC5830k.m5330g(callback, "callback");
            this.callback = callback;
            this.recursive = z8;
        }

        @NotNull
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(@NotNull FragmentManager fragmentManager) {
        AbstractC5830k.m5330g(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void dispatchOnFragmentActivityCreated(@NotNull Fragment f, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(f, savedInstanceState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentActivityCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentAttached(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentAttached(this.fragmentManager, f, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(@NotNull Fragment f, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(f, savedInstanceState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentDestroyed(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentDetached(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentDetached(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentPaused(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPaused(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPreAttached(this.fragmentManager, f, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(@NotNull Fragment f, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(f, savedInstanceState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentPreCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentResumed(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentResumed(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(@NotNull Fragment f, @NotNull Bundle outState, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        AbstractC5830k.m5330g(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(f, outState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f, outState);
            }
        }
    }

    public final void dispatchOnFragmentStarted(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentStarted(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentStopped(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentStopped(this.fragmentManager, f);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(@NotNull Fragment f, @NotNull View v2, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        AbstractC5830k.m5330g(v2, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(f, v2, savedInstanceState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentViewCreated(this.fragmentManager, f, v2, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(@NotNull Fragment f, boolean onlyRecursive) {
        AbstractC5830k.m5330g(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            AbstractC5830k.m5329f(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(f, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getRecursive()) {
                next.getCallback().onFragmentViewDestroyed(this.fragmentManager, f);
            }
        }
    }

    public final void registerFragmentLifecycleCallbacks(@NotNull FragmentManager.FragmentLifecycleCallbacks cb, boolean recursive) {
        AbstractC5830k.m5330g(cb, "cb");
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(cb, recursive));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r4.lifecycleCallbacks.remove(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unregisterFragmentLifecycleCallbacks(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cb"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r4.lifecycleCallbacks
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r4.lifecycleCallbacks     // Catch: java.lang.Throwable -> L25
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L25
            r2 = 0
        Lf:
            if (r2 >= r1) goto L2a
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r4.lifecycleCallbacks     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L25
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3     // Catch: java.lang.Throwable -> L25
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r3.getCallback()     // Catch: java.lang.Throwable -> L25
            if (r3 != r5) goto L27
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r5 = r4.lifecycleCallbacks     // Catch: java.lang.Throwable -> L25
            r5.remove(r2)     // Catch: java.lang.Throwable -> L25
            goto L2a
        L25:
            r5 = move-exception
            goto L2c
        L27:
            int r2 = r2 + 1
            goto Lf
        L2a:
            monitor-exit(r0)
            return
        L2c:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks):void");
    }
}
