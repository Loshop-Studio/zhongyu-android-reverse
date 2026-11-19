package p379vd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import p394wd.C11730e;
import p410xd.C11839c0;

/* renamed from: vd.q */
/* loaded from: classes6.dex */
public abstract class AbstractC11608q {

    /* renamed from: a */
    public static final C11839c0 f27506a = new C11839c0("NO_VALUE");

    /* renamed from: a */
    public static final InterfaceC11602k m25591a(int i10, int i11, BufferOverflow bufferOverflow) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || bufferOverflow == BufferOverflow.f23519c) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i10, i12, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11602k m25592b(int i10, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.f23519c;
        }
        return m25591a(i10, i11, bufferOverflow);
    }

    /* renamed from: e */
    public static final InterfaceC11594c m25595e(InterfaceC11607p interfaceC11607p, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.f23519c) ? interfaceC11607p : new C11730e(interfaceC11607p, interfaceC9945d, i10, bufferOverflow);
    }

    /* renamed from: f */
    public static final Object m25596f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* renamed from: g */
    public static final void m25597g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
