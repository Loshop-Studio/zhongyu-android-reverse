package kotlinx.coroutines.channels;

import ae.InterfaceC0115k;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.coroutines.channels.C10002c;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p410xd.AbstractC11871v;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.channels.d */
/* loaded from: classes6.dex */
public class C10003d extends BufferedChannel {

    /* renamed from: o */
    public final int f23587o;

    /* renamed from: p */
    public final BufferOverflow f23588p;

    public C10003d(int i10, BufferOverflow bufferOverflow, InterfaceC9540l interfaceC9540l) {
        super(i10, interfaceC9540l);
        this.f23587o = i10;
        this.f23588p = bufferOverflow;
        if (bufferOverflow == BufferOverflow.f23519c) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC9983y.m20315b(BufferedChannel.class).mo20277f() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    /* renamed from: u1 */
    public static /* synthetic */ Object m20738u1(C10003d c10003d, Object obj, InterfaceC11588c interfaceC11588c) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM26351c;
        Object objM20740w1 = c10003d.m20740w1(obj, true);
        if (!(objM20740w1 instanceof C10002c.a)) {
            return C10786q.f26013a;
        }
        C10002c.m20727e(objM20740w1);
        InterfaceC9540l interfaceC9540l = c10003d.f23534d;
        if (interfaceC9540l == null || (undeliveredElementExceptionM26351c = AbstractC11871v.m26351c(interfaceC9540l, obj, null, 2, null)) == null) {
            throw c10003d.m20639i0();
        }
        AbstractC10771b.m22973a(undeliveredElementExceptionM26351c, c10003d.m20639i0());
        throw undeliveredElementExceptionM26351c;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: a1 */
    public void mo20625a1(InterfaceC0115k interfaceC0115k, Object obj) {
        Object objMo33808trySendJP2dKIU = mo33808trySendJP2dKIU(obj);
        if (!(objMo33808trySendJP2dKIU instanceof C10002c.c)) {
            interfaceC0115k.mo286b(C10786q.f26013a);
        } else {
            if (!(objMo33808trySendJP2dKIU instanceof C10002c.a)) {
                throw new IllegalStateException("unreachable");
            }
            C10002c.m20727e(objMo33808trySendJP2dKIU);
            interfaceC0115k.mo286b(BufferedChannelKt.m20711z());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC10005f
    public Object send(Object obj, InterfaceC11588c interfaceC11588c) {
        return m20738u1(this, obj, interfaceC11588c);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC10005f
    /* renamed from: trySend-JP2dKIU */
    public Object mo33808trySendJP2dKIU(Object obj) {
        return m20740w1(obj, false);
    }

    /* renamed from: v1 */
    public final Object m20739v1(Object obj, boolean z10) {
        InterfaceC9540l interfaceC9540l;
        UndeliveredElementException undeliveredElementExceptionM26351c;
        Object objMo33808trySendJP2dKIU = super.mo33808trySendJP2dKIU(obj);
        if (C10002c.m20732j(objMo33808trySendJP2dKIU) || C10002c.m20730h(objMo33808trySendJP2dKIU)) {
            return objMo33808trySendJP2dKIU;
        }
        if (!z10 || (interfaceC9540l = this.f23534d) == null || (undeliveredElementExceptionM26351c = AbstractC11871v.m26351c(interfaceC9540l, obj, null, 2, null)) == null) {
            return C10002c.f23583b.m20737c(C10786q.f26013a);
        }
        throw undeliveredElementExceptionM26351c;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: w0 */
    public boolean mo20662w0() {
        return this.f23588p == BufferOverflow.f23520d;
    }

    /* renamed from: w1 */
    public final Object m20740w1(Object obj, boolean z10) {
        return this.f23588p == BufferOverflow.f23521e ? m20739v1(obj, z10) : m20643k1(obj);
    }
}
