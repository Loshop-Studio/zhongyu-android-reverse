package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC9529a enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(Cancellable cancellable) {
        AbstractC9979u.m20294g(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC9529a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(BackEventCompat backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(BackEventCompat backEvent) {
        AbstractC9979u.m20294g(backEvent, "backEvent");
    }

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        AbstractC9979u.m20294g(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        InterfaceC9529a interfaceC9529a = this.enabledChangedCallback;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC9529a interfaceC9529a) {
        this.enabledChangedCallback = interfaceC9529a;
    }
}
