package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p075h6.AbstractC5629a;
import p152r6.InterfaceC6471c;

/* renamed from: kotlinx.coroutines.g1 */
/* loaded from: classes4.dex */
public final class C5963g1 extends AbstractC5629a implements InterfaceC6013w0 {

    /* renamed from: a */
    public static final C5963g1 f9452a = new C5963g1(C6010v0.f9513a);

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: e */
    public final Object mo5456e(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: f */
    public final CancellationException mo5457f() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: g */
    public final InterfaceC5971j mo5458g(C5871c1 c5871c1) {
        return C5966h1.f9456a;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: h */
    public final InterfaceC5962g0 mo5459h(InterfaceC6471c interfaceC6471c) {
        return C5966h1.f9456a;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: p */
    public final InterfaceC5962g0 mo5460p(boolean z8, boolean z9, InterfaceC6471c interfaceC6471c) {
        return C5966h1.f9456a;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
