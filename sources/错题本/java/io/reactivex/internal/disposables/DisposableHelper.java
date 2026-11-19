package io.reactivex.internal.disposables;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p159s5.InterfaceC6559b;
import p183v5.AbstractC6668a;
import p185v7.AbstractC6675d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DisposableHelper implements InterfaceC6559b {
    public static final DisposableHelper DISPOSED;

    /* renamed from: a */
    public static final /* synthetic */ DisposableHelper[] f8997a;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        DISPOSED = disposableHelper;
        f8997a = new DisposableHelper[]{disposableHelper};
    }

    public static boolean replace(AtomicReference<InterfaceC6559b> atomicReference, InterfaceC6559b interfaceC6559b) {
        while (true) {
            InterfaceC6559b interfaceC6559b2 = atomicReference.get();
            if (interfaceC6559b2 == DISPOSED) {
                if (interfaceC6559b == null) {
                    return false;
                }
                interfaceC6559b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC6559b2, interfaceC6559b)) {
                if (atomicReference.get() != interfaceC6559b2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportDisposableSet() {
        AbstractC6675d.m6351q(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC6559b> atomicReference, InterfaceC6559b interfaceC6559b) {
        while (true) {
            InterfaceC6559b interfaceC6559b2 = atomicReference.get();
            if (interfaceC6559b2 == DISPOSED) {
                if (interfaceC6559b == null) {
                    return false;
                }
                interfaceC6559b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC6559b2, interfaceC6559b)) {
                if (atomicReference.get() != interfaceC6559b2) {
                    break;
                }
            }
            if (interfaceC6559b2 == null) {
                return true;
            }
            interfaceC6559b2.dispose();
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<InterfaceC6559b> atomicReference, InterfaceC6559b interfaceC6559b) {
        AbstractC6668a.m6328a(interfaceC6559b, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC6559b)) {
            if (atomicReference.get() != null) {
                interfaceC6559b.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                reportDisposableSet();
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<InterfaceC6559b> atomicReference, InterfaceC6559b interfaceC6559b) {
        while (!atomicReference.compareAndSet(null, interfaceC6559b)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() != DISPOSED) {
                    return false;
                }
                interfaceC6559b.dispose();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(InterfaceC6559b interfaceC6559b, InterfaceC6559b interfaceC6559b2) {
        if (interfaceC6559b2 == null) {
            AbstractC6675d.m6351q(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC6559b == null) {
            return true;
        }
        interfaceC6559b2.dispose();
        reportDisposableSet();
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f8997a.clone();
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<InterfaceC6559b> atomicReference) {
        InterfaceC6559b andSet;
        InterfaceC6559b interfaceC6559b = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (interfaceC6559b == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(InterfaceC6559b interfaceC6559b) {
        return interfaceC6559b == DISPOSED;
    }
}
