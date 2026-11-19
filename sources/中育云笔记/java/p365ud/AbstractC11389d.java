package p365ud;

import ae.InterfaceC0110f;
import ae.InterfaceC0112h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.AbstractC9995a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: ud.d */
/* loaded from: classes6.dex */
public abstract class AbstractC11389d extends AbstractC9995a implements InterfaceC10000a {

    /* renamed from: f */
    public final InterfaceC10000a f27215f;

    public AbstractC11389d(InterfaceC9945d interfaceC9945d, InterfaceC10000a interfaceC10000a, boolean z10, boolean z11) {
        super(interfaceC9945d, z10, z11);
        this.f27215f = interfaceC10000a;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: G */
    public void mo20413G(Throwable th) {
        CancellationException cancellationExceptionM20403y0 = JobSupport.m20403y0(this, th, null, 1, null);
        this.f27215f.cancel(cancellationExceptionM20403y0);
        m20410E(cancellationExceptionM20403y0);
    }

    /* renamed from: K0 */
    public final InterfaceC10000a m25341K0() {
        return this.f27215f;
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: b */
    public Object mo20626b(InterfaceC11588c interfaceC11588c) {
        Object objMo20626b = this.f27215f.mo20626b(interfaceC11588c);
        AbstractC11725a.m25952f();
        return objMo20626b;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC10045g
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo20416J(), null, this);
        }
        mo20413G(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean close(Throwable th) {
        return this.f27215f.close(th);
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: d */
    public Object mo20630d(InterfaceC11588c interfaceC11588c) {
        return this.f27215f.mo20630d(interfaceC11588c);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public InterfaceC0112h getOnSend() {
        return this.f27215f.getOnSend();
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: h */
    public InterfaceC0110f mo20635h() {
        return this.f27215f.mo20635h();
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: i */
    public InterfaceC0110f mo20638i() {
        return this.f27215f.mo20638i();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public void invokeOnClose(InterfaceC9540l interfaceC9540l) {
        this.f27215f.invokeOnClose(interfaceC9540l);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean isClosedForSend() {
        return this.f27215f.isClosedForSend();
    }

    @Override // p365ud.InterfaceC11397l
    public InterfaceC11390e iterator() {
        return this.f27215f.iterator();
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: j */
    public Object mo20641j() {
        return this.f27215f.mo20641j();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean offer(Object obj) {
        return this.f27215f.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public Object send(Object obj, InterfaceC11588c interfaceC11588c) {
        return this.f27215f.send(obj, interfaceC11588c);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* renamed from: trySend-JP2dKIU */
    public Object mo33808trySendJP2dKIU(Object obj) {
        return this.f27215f.mo33808trySendJP2dKIU(obj);
    }

    /* renamed from: J0 */
    public final InterfaceC10000a m25340J0() {
        return this;
    }
}
