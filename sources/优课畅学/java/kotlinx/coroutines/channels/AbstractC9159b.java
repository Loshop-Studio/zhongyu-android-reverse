package kotlinx.coroutines.channels;

import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.channels.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9159b {
    /* renamed from: a */
    public static final InterfaceC9158a m16528a(int i10, BufferOverflow bufferOverflow, InterfaceC10570l interfaceC10570l) {
        if (i10 == -2) {
            return bufferOverflow == BufferOverflow.f17603a ? new BufferedChannel(InterfaceC9158a.f17670d0.m16527a(), interfaceC10570l) : new C9161d(1, bufferOverflow, interfaceC10570l);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.f17603a ? new BufferedChannel(i10, interfaceC10570l) : new C9161d(i10, bufferOverflow, interfaceC10570l) : new BufferedChannel(Integer.MAX_VALUE, interfaceC10570l) : bufferOverflow == BufferOverflow.f17603a ? new BufferedChannel(0, interfaceC10570l) : new C9161d(1, bufferOverflow, interfaceC10570l);
        }
        if (bufferOverflow == BufferOverflow.f17603a) {
            return new C9161d(1, BufferOverflow.f17604b, interfaceC10570l);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9158a m16529b(int i10, BufferOverflow bufferOverflow, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f17603a;
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        return m16528a(i10, bufferOverflow, interfaceC10570l);
    }
}
