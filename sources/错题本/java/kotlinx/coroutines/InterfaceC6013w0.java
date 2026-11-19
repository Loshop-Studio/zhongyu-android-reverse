package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p075h6.InterfaceC5634f;
import p152r6.InterfaceC6471c;

/* renamed from: kotlinx.coroutines.w0 */
/* loaded from: classes4.dex */
public interface InterfaceC6013w0 extends InterfaceC5634f {
    void cancel(CancellationException cancellationException);

    /* renamed from: e */
    Object mo5456e(ContinuationImpl continuationImpl);

    /* renamed from: f */
    CancellationException mo5457f();

    /* renamed from: g */
    InterfaceC5971j mo5458g(C5871c1 c5871c1);

    /* renamed from: h */
    InterfaceC5962g0 mo5459h(InterfaceC6471c interfaceC6471c);

    boolean isActive();

    /* renamed from: p */
    InterfaceC5962g0 mo5460p(boolean z8, boolean z9, InterfaceC6471c interfaceC6471c);

    boolean start();
}
