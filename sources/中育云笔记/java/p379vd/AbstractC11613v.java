package p379vd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import p394wd.AbstractC11737l;
import p410xd.C11839c0;

/* renamed from: vd.v */
/* loaded from: classes6.dex */
public abstract class AbstractC11613v {

    /* renamed from: a */
    public static final C11839c0 f27513a = new C11839c0("NONE");

    /* renamed from: b */
    public static final C11839c0 f27514b = new C11839c0("PENDING");

    /* renamed from: a */
    public static final InterfaceC11603l m25602a(Object obj) {
        if (obj == null) {
            obj = AbstractC11737l.f27896a;
        }
        return new StateFlowImpl(obj);
    }

    /* renamed from: d */
    public static final InterfaceC11594c m25605d(InterfaceC11612u interfaceC11612u, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.f23520d) ? AbstractC11608q.m25595e(interfaceC11612u, interfaceC9945d, i10, bufferOverflow) : interfaceC11612u;
    }
}
