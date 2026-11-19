package io.reactivex.internal.disposables;

import androidx.camera.view.AbstractC0949q;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p100f7.AbstractC8462a;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10726b;

/* loaded from: classes5.dex */
public enum DisposableHelper implements InterfaceC10250b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m15529a(AtomicReference atomicReference) {
        InterfaceC10250b interfaceC10250b;
        InterfaceC10250b interfaceC10250b2 = (InterfaceC10250b) atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (interfaceC10250b2 == disposableHelper || (interfaceC10250b = (InterfaceC10250b) atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (interfaceC10250b == null) {
            return true;
        }
        interfaceC10250b.dispose();
        return true;
    }

    /* renamed from: b */
    public static boolean m15530b(InterfaceC10250b interfaceC10250b) {
        return interfaceC10250b == DISPOSED;
    }

    /* renamed from: c */
    public static boolean m15531c(AtomicReference atomicReference, InterfaceC10250b interfaceC10250b) {
        InterfaceC10250b interfaceC10250b2;
        do {
            interfaceC10250b2 = (InterfaceC10250b) atomicReference.get();
            if (interfaceC10250b2 == DISPOSED) {
                if (interfaceC10250b == null) {
                    return false;
                }
                interfaceC10250b.dispose();
                return false;
            }
        } while (!AbstractC0949q.m807a(atomicReference, interfaceC10250b2, interfaceC10250b));
        return true;
    }

    /* renamed from: d */
    public static void m15532d() {
        AbstractC8462a.m13801k(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: e */
    public static boolean m15533e(AtomicReference atomicReference, InterfaceC10250b interfaceC10250b) {
        AbstractC10726b.m20030c(interfaceC10250b, "d is null");
        if (AbstractC0949q.m807a(atomicReference, null, interfaceC10250b)) {
            return true;
        }
        interfaceC10250b.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m15532d();
        return false;
    }

    /* renamed from: g */
    public static boolean m15534g(AtomicReference atomicReference, InterfaceC10250b interfaceC10250b) {
        if (AbstractC0949q.m807a(atomicReference, null, interfaceC10250b)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        interfaceC10250b.dispose();
        return false;
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return true;
    }
}
