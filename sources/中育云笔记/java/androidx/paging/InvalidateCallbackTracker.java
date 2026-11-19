package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.paging.internal.SynchronizedLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class InvalidateCallbackTracker<T> {
    private final InterfaceC9540l callbackInvoker;
    private final List<T> callbacks;
    private boolean invalid;
    private final InterfaceC9529a invalidGetter;
    private final SynchronizedLock lock;

    public InvalidateCallbackTracker(InterfaceC9540l callbackInvoker, InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20294g(callbackInvoker, "callbackInvoker");
        this.callbackInvoker = callbackInvoker;
        this.invalidGetter = interfaceC9529a;
        this.lock = new SynchronizedLock();
        this.callbacks = new ArrayList();
    }

    @VisibleForTesting
    public final int callbackCount$paging_common() {
        return this.callbacks.size();
    }

    public final boolean getInvalid$paging_common() {
        return this.invalid;
    }

    public final boolean invalidate$paging_common() {
        if (this.invalid) {
            return false;
        }
        synchronized (this.lock) {
            if (this.invalid) {
                return false;
            }
            this.invalid = true;
            List listM23922X0 = AbstractC10947g0.m23922X0(this.callbacks);
            this.callbacks.clear();
            InterfaceC9540l interfaceC9540l = this.callbackInvoker;
            Iterator<T> it = listM23922X0.iterator();
            while (it.hasNext()) {
                interfaceC9540l.invoke(it.next());
            }
            return true;
        }
    }

    public final void registerInvalidatedCallback$paging_common(T t10) {
        InterfaceC9529a interfaceC9529a = this.invalidGetter;
        boolean z10 = true;
        if (interfaceC9529a != null && ((Boolean) interfaceC9529a.invoke()).booleanValue()) {
            invalidate$paging_common();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(t10);
            return;
        }
        synchronized (this.lock) {
            if (!this.invalid) {
                this.callbacks.add(t10);
                z10 = false;
            }
        }
        if (z10) {
            this.callbackInvoker.invoke(t10);
        }
    }

    public final void unregisterInvalidatedCallback$paging_common(T t10) {
        synchronized (this.lock) {
            this.callbacks.remove(t10);
        }
    }

    public /* synthetic */ InvalidateCallbackTracker(InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9540l, (i10 & 2) != 0 ? null : interfaceC9529a);
    }
}
