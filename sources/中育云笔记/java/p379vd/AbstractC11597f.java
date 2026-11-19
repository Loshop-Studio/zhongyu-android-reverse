package p379vd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.BufferOverflow;
import p394wd.C11730e;
import p394wd.InterfaceC11734i;

/* renamed from: vd.f */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11597f {
    /* renamed from: a */
    public static final InterfaceC11594c m25577a(InterfaceC11594c interfaceC11594c, int i10, BufferOverflow bufferOverflow) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.f23519c) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            bufferOverflow = BufferOverflow.f23520d;
            i10 = 0;
        }
        int i11 = i10;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (interfaceC11594c instanceof InterfaceC11734i) {
            return InterfaceC11734i.a.m25965a((InterfaceC11734i) interfaceC11594c, null, i11, bufferOverflow2, 1, null);
        }
        return new C11730e(interfaceC11594c, null, i11, bufferOverflow2, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11594c m25578b(InterfaceC11594c interfaceC11594c, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f23519c;
        }
        return AbstractC11596e.m25553c(interfaceC11594c, i10, bufferOverflow);
    }

    /* renamed from: c */
    public static final void m25579c(InterfaceC9945d interfaceC9945d) {
        if (interfaceC9945d.get(InterfaceC10045g.f23976b0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC9945d).toString());
    }

    /* renamed from: d */
    public static final InterfaceC11594c m25580d(InterfaceC11594c interfaceC11594c) {
        return m25578b(interfaceC11594c, -1, null, 2, null);
    }

    /* renamed from: e */
    public static final InterfaceC11594c m25581e(InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d) {
        m25579c(interfaceC9945d);
        if (AbstractC9979u.m20289b(interfaceC9945d, EmptyCoroutineContext.f23351c)) {
            return interfaceC11594c;
        }
        if (interfaceC11594c instanceof InterfaceC11734i) {
            return InterfaceC11734i.a.m25965a((InterfaceC11734i) interfaceC11594c, interfaceC9945d, 0, null, 6, null);
        }
        return new C11730e(interfaceC11594c, interfaceC9945d, 0, null, 12, null);
    }
}
