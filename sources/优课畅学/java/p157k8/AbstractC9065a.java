package p157k8;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.AbstractC9152a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p224q8.InterfaceC9849e;
import p224q8.InterfaceC9851g;
import p300x7.InterfaceC10570l;

/* renamed from: k8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9065a extends AbstractC9152a implements InterfaceC9158a {

    /* renamed from: d */
    public final InterfaceC9158a f17330d;

    public AbstractC9065a(InterfaceC9100d interfaceC9100d, InterfaceC9158a interfaceC9158a, boolean z10, boolean z11) {
        super(interfaceC9100d, z10, z11);
        this.f17330d = interfaceC9158a;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: G */
    public void mo15873G(Throwable th) {
        CancellationException cancellationExceptionM16251z0 = JobSupport.m16251z0(this, th, null, 1, null);
        this.f17330d.cancel(cancellationExceptionM16251z0);
        m16259E(cancellationExceptionM16251z0);
    }

    /* renamed from: L0 */
    public final InterfaceC9158a m15875L0() {
        return this.f17330d;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC9212n, p157k8.InterfaceC9073i
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo16265J(), null, this);
        }
        mo15873G(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean close(Throwable th) {
        return this.f17330d.close(th);
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: f */
    public Object mo15876f(InterfaceC9324c interfaceC9324c) {
        return this.f17330d.mo15876f(interfaceC9324c);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public InterfaceC9851g getOnSend() {
        return this.f17330d.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public void invokeOnClose(InterfaceC10570l interfaceC10570l) {
        this.f17330d.invokeOnClose(interfaceC10570l);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean isClosedForSend() {
        return this.f17330d.isClosedForSend();
    }

    @Override // p157k8.InterfaceC9073i
    public InterfaceC9066b iterator() {
        return this.f17330d.iterator();
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: m */
    public InterfaceC9849e mo15877m() {
        return this.f17330d.mo15877m();
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: o */
    public Object mo15878o() {
        return this.f17330d.mo15878o();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean offer(Object obj) {
        return this.f17330d.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public Object send(Object obj, InterfaceC9324c interfaceC9324c) {
        return this.f17330d.send(obj, interfaceC9324c);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* renamed from: trySend-JP2dKIU */
    public Object mo27213trySendJP2dKIU(Object obj) {
        return this.f17330d.mo27213trySendJP2dKIU(obj);
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: v */
    public Object mo15879v(InterfaceC9324c interfaceC9324c) {
        Object objMo15879v = this.f17330d.mo15879v(interfaceC9324c);
        AbstractC9434a.m17291f();
        return objMo15879v;
    }

    /* renamed from: K0 */
    public final InterfaceC9158a m15874K0() {
        return this;
    }
}
