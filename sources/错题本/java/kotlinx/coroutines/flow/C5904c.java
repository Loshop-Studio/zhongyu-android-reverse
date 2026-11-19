package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.channels.InterfaceC5886o;
import kotlinx.coroutines.flow.internal.AbstractC5922d;
import kotlinx.coroutines.flow.internal.C5933o;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.c */
/* loaded from: classes4.dex */
public final class C5904c extends AbstractC5922d {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9351f = AtomicIntegerFieldUpdater.newUpdater(C5904c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d */
    public final InterfaceC5886o f9352d;

    /* renamed from: e */
    public final boolean f9353e;

    public /* synthetic */ C5904c(InterfaceC5886o interfaceC5886o, boolean z8) {
        this(interfaceC5886o, z8, EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d, kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) throws Throwable {
        if (this.f9391b == -3) {
            boolean z8 = this.f9353e;
            if (z8 && f9351f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objM5553i = AbstractC5914h.m5553i(interfaceC5912g, this.f9352d, z8, interfaceC5631c);
            if (objM5553i == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM5553i;
            }
        } else {
            Object objCollect = super.collect(interfaceC5912g, interfaceC5631c);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return C5443s.f8405a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: d */
    public final String mo5523d() {
        return "channel=" + this.f9352d;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: e */
    public final Object mo5521e(InterfaceC5884m interfaceC5884m, InterfaceC5631c interfaceC5631c) throws Throwable {
        Object objM5553i = AbstractC5914h.m5553i(new C5933o(interfaceC5884m), this.f9352d, this.f9353e, interfaceC5631c);
        return objM5553i == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5553i : C5443s.f8405a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: f */
    public final AbstractC5922d mo5522f(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return new C5904c(this.f9352d, this.f9353e, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: g */
    public final InterfaceC5910f mo5524g() {
        return new C5904c(this.f9352d, this.f9353e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: h */
    public final InterfaceC5886o mo5525h(InterfaceC6009v interfaceC6009v) {
        if (this.f9353e && f9351f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f9391b == -3 ? this.f9352d : super.mo5525h(interfaceC6009v);
    }

    public C5904c(InterfaceC5886o interfaceC5886o, boolean z8, InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5636h, i, bufferOverflow);
        this.f9352d = interfaceC5886o;
        this.f9353e = z8;
    }
}
