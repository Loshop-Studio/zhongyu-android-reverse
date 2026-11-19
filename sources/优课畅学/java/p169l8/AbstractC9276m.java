package p169l8;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import p180m8.C9332e;
import p191n8.C9442d0;

/* renamed from: l8.m */
/* loaded from: classes5.dex */
public abstract class AbstractC9276m {

    /* renamed from: a */
    public static final C9442d0 f18273a = new C9442d0("NO_VALUE");

    /* renamed from: a */
    public static final InterfaceC9270g m17043a(int i10, int i11, BufferOverflow bufferOverflow) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || bufferOverflow == BufferOverflow.f17603a) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i10, i12, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9270g m17044b(int i10, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.f17603a;
        }
        return m17043a(i10, i11, bufferOverflow);
    }

    /* renamed from: e */
    public static final InterfaceC9266c m17047e(InterfaceC9275l interfaceC9275l, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.f17603a) ? interfaceC9275l : new C9332e(interfaceC9275l, interfaceC9100d, i10, bufferOverflow);
    }

    /* renamed from: f */
    public static final Object m17048f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* renamed from: g */
    public static final void m17049g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
