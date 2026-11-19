package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC9097a;
import p135i8.C8847j1;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8860o;
import p135i8.InterfaceC8866q;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.o */
/* loaded from: classes5.dex */
public final class C9213o extends AbstractC9097a implements InterfaceC9212n {

    /* renamed from: a */
    public static final C9213o f18097a = new C9213o();

    public C9213o() {
        super(InterfaceC9212n.f18095c0);
    }

    @Override // kotlinx.coroutines.InterfaceC9212n, p157k8.InterfaceC9073i
    public void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: e */
    public CancellationException mo16281e() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public InterfaceC9212n getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: k */
    public InterfaceC8849k0 mo16287k(InterfaceC10570l interfaceC10570l) {
        return C8847j1.f16518a;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: n */
    public Object mo16291n(InterfaceC9324c interfaceC9324c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: p */
    public InterfaceC8849k0 mo16294p(boolean z10, boolean z11, InterfaceC10570l interfaceC10570l) {
        return C8847j1.f16518a;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: s */
    public InterfaceC8860o mo16297s(InterfaceC8866q interfaceC8866q) {
        return C8847j1.f16518a;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
