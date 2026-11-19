package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.coroutines.channels.C9160c;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.channels.d */
/* loaded from: classes5.dex */
public class C9161d extends BufferedChannel {

    /* renamed from: m */
    public final int f17677m;

    /* renamed from: n */
    public final BufferOverflow f17678n;

    public C9161d(int i10, BufferOverflow bufferOverflow, InterfaceC10570l interfaceC10570l) {
        super(i10, interfaceC10570l);
        this.f17677m = i10;
        this.f17678n = bufferOverflow;
        if (bufferOverflow == BufferOverflow.f17603a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC9137y.m16154b(BufferedChannel.class).mo13672g() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    /* renamed from: b1 */
    public static /* synthetic */ Object m16545b1(C9161d c9161d, Object obj, InterfaceC9324c interfaceC9324c) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM16746d;
        Object objM16547d1 = c9161d.m16547d1(obj, true);
        if (!(objM16547d1 instanceof C9160c.a)) {
            return C8736p.f16368a;
        }
        C9160c.m16534e(objM16547d1);
        InterfaceC10570l interfaceC10570l = c9161d.f17618b;
        if (interfaceC10570l == null || (undeliveredElementExceptionM16746d = OnUndeliveredElementKt.m16746d(interfaceC10570l, obj, null, 2, null)) == null) {
            throw c9161d.m16439U();
        }
        AbstractC8722b.m14228a(undeliveredElementExceptionM16746d, c9161d.m16439U());
        throw undeliveredElementExceptionM16746d;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: H0 */
    public void mo16421H0(InterfaceC9854j interfaceC9854j, Object obj) {
        Object objMo27213trySendJP2dKIU = mo27213trySendJP2dKIU(obj);
        if (!(objMo27213trySendJP2dKIU instanceof C9160c.c)) {
            interfaceC9854j.mo16842e(C8736p.f16368a);
        } else {
            if (!(objMo27213trySendJP2dKIU instanceof C9160c.a)) {
                throw new IllegalStateException("unreachable");
            }
            C9160c.m16534e(objMo27213trySendJP2dKIU);
            interfaceC9854j.mo16842e(BufferedChannelKt.m16518z());
        }
    }

    /* renamed from: c1 */
    public final Object m16546c1(Object obj, boolean z10) {
        InterfaceC10570l interfaceC10570l;
        UndeliveredElementException undeliveredElementExceptionM16746d;
        Object objMo27213trySendJP2dKIU = super.mo27213trySendJP2dKIU(obj);
        if (C9160c.m16539j(objMo27213trySendJP2dKIU) || C9160c.m16537h(objMo27213trySendJP2dKIU)) {
            return objMo27213trySendJP2dKIU;
        }
        if (!z10 || (interfaceC10570l = this.f17618b) == null || (undeliveredElementExceptionM16746d = OnUndeliveredElementKt.m16746d(interfaceC10570l, obj, null, 2, null)) == null) {
            return C9160c.f17673b.m16544c(C8736p.f16368a);
        }
        throw undeliveredElementExceptionM16746d;
    }

    /* renamed from: d1 */
    public final Object m16547d1(Object obj, boolean z10) {
        return this.f17678n == BufferOverflow.f17605c ? m16546c1(obj, z10) : m16435R0(obj);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: i0 */
    public boolean mo16456i0() {
        return this.f17678n == BufferOverflow.f17604b;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC9163f
    public Object send(Object obj, InterfaceC9324c interfaceC9324c) {
        return m16545b1(this, obj, interfaceC9324c);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC9163f
    /* renamed from: trySend-JP2dKIU */
    public Object mo27213trySendJP2dKIU(Object obj) {
        return m16547d1(obj, false);
    }
}
