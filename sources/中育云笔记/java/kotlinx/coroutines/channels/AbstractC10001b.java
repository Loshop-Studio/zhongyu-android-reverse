package kotlinx.coroutines.channels;

import p181hd.InterfaceC9540l;

/* renamed from: kotlinx.coroutines.channels.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10001b {
    /* renamed from: a */
    public static final InterfaceC10000a m20721a(int i10, BufferOverflow bufferOverflow, InterfaceC9540l interfaceC9540l) {
        if (i10 == -2) {
            return bufferOverflow == BufferOverflow.f23519c ? new BufferedChannel(InterfaceC10000a.f23580c0.m20720a(), interfaceC9540l) : new C10003d(1, bufferOverflow, interfaceC9540l);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.f23519c ? new BufferedChannel(i10, interfaceC9540l) : new C10003d(i10, bufferOverflow, interfaceC9540l) : new BufferedChannel(Integer.MAX_VALUE, interfaceC9540l) : bufferOverflow == BufferOverflow.f23519c ? new BufferedChannel(0, interfaceC9540l) : new C10003d(1, bufferOverflow, interfaceC9540l);
        }
        if (bufferOverflow == BufferOverflow.f23519c) {
            return new C10003d(1, BufferOverflow.f23520d, interfaceC9540l);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10000a m20722b(int i10, BufferOverflow bufferOverflow, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f23519c;
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l = null;
        }
        return m20721a(i10, bufferOverflow, interfaceC9540l);
    }
}
