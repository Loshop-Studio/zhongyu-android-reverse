package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class InvalidateCallbackTracker<T> {
    private final InterfaceC10570l callbackInvoker;
    private final List<T> callbacks;
    private boolean invalid;
    private final InterfaceC10559a invalidGetter;
    private final ReentrantLock lock;

    public InvalidateCallbackTracker(InterfaceC10570l callbackInvoker, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(callbackInvoker, "callbackInvoker");
        this.callbackInvoker = callbackInvoker;
        this.invalidGetter = interfaceC10559a;
        this.lock = new ReentrantLock();
        this.callbacks = new ArrayList();
    }

    @VisibleForTesting
    public final int callbackCount$paging_common_release() {
        return this.callbacks.size();
    }

    public final boolean getInvalid$paging_common_release() {
        return this.invalid;
    }

    public final boolean invalidate$paging_common_release() {
        if (this.invalid) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            if (this.invalid) {
                return false;
            }
            this.invalid = true;
            List listM14544U0 = AbstractC8778f0.m14544U0(this.callbacks);
            this.callbacks.clear();
            reentrantLock.unlock();
            InterfaceC10570l interfaceC10570l = this.callbackInvoker;
            Iterator<T> it = listM14544U0.iterator();
            while (it.hasNext()) {
                interfaceC10570l.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void registerInvalidatedCallback$paging_common_release(T t10) {
        InterfaceC10559a interfaceC10559a = this.invalidGetter;
        boolean z10 = true;
        if (interfaceC10559a != null && ((Boolean) interfaceC10559a.invoke()).booleanValue()) {
            invalidate$paging_common_release();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(t10);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            if (!this.invalid) {
                this.callbacks.add(t10);
                z10 = false;
            }
            if (z10) {
                this.callbackInvoker.invoke(t10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback$paging_common_release(T t10) {
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            this.callbacks.remove(t10);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ InvalidateCallbackTracker(InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10570l, (i10 & 2) != 0 ? null : interfaceC10559a);
    }
}
