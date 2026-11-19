package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC10559a enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(Cancellable cancellable) {
        AbstractC9133u.m16133g(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC10559a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(BackEventCompat backEvent) {
        AbstractC9133u.m16133g(backEvent, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(BackEventCompat backEvent) {
        AbstractC9133u.m16133g(backEvent, "backEvent");
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
        AbstractC9133u.m16133g(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        InterfaceC10559a interfaceC10559a = this.enabledChangedCallback;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC10559a interfaceC10559a) {
        this.enabledChangedCallback = interfaceC10559a;
    }
}
