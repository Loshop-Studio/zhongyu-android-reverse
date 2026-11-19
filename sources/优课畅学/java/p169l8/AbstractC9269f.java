package p169l8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.BufferOverflow;
import p180m8.C9332e;
import p180m8.InterfaceC9336i;

/* renamed from: l8.f */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9269f {
    /* renamed from: a */
    public static final InterfaceC9266c m17037a(InterfaceC9266c interfaceC9266c, int i10, BufferOverflow bufferOverflow) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.f17603a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            bufferOverflow = BufferOverflow.f17604b;
            i10 = 0;
        }
        int i11 = i10;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (interfaceC9266c instanceof InterfaceC9336i) {
            return InterfaceC9336i.a.m17168a((InterfaceC9336i) interfaceC9266c, null, i11, bufferOverflow2, 1, null);
        }
        return new C9332e(interfaceC9266c, null, i11, bufferOverflow2, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9266c m17038b(InterfaceC9266c interfaceC9266c, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f17603a;
        }
        return AbstractC9268e.m17013c(interfaceC9266c, i10, bufferOverflow);
    }

    /* renamed from: c */
    public static final void m17039c(InterfaceC9100d interfaceC9100d) {
        if (interfaceC9100d.get(InterfaceC9212n.f18095c0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC9100d).toString());
    }

    /* renamed from: d */
    public static final InterfaceC9266c m17040d(InterfaceC9266c interfaceC9266c) {
        return m17038b(interfaceC9266c, -1, null, 2, null);
    }

    /* renamed from: e */
    public static final InterfaceC9266c m17041e(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d) {
        m17039c(interfaceC9100d);
        if (AbstractC9133u.m16128b(interfaceC9100d, EmptyCoroutineContext.f17438a)) {
            return interfaceC9266c;
        }
        if (interfaceC9266c instanceof InterfaceC9336i) {
            return InterfaceC9336i.a.m17168a((InterfaceC9336i) interfaceC9266c, interfaceC9100d, 0, null, 6, null);
        }
        return new C9332e(interfaceC9266c, interfaceC9100d, 0, null, 12, null);
    }
}
