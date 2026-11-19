package p169l8;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import p180m8.AbstractC9339l;
import p191n8.C9442d0;

/* renamed from: l8.r */
/* loaded from: classes5.dex */
public abstract class AbstractC9281r {

    /* renamed from: a */
    public static final C9442d0 f18280a = new C9442d0("NONE");

    /* renamed from: b */
    public static final C9442d0 f18281b = new C9442d0("PENDING");

    /* renamed from: a */
    public static final InterfaceC9271h m17054a(Object obj) {
        if (obj == null) {
            obj = AbstractC9339l.f18395a;
        }
        return new StateFlowImpl(obj);
    }

    /* renamed from: d */
    public static final InterfaceC9266c m17057d(InterfaceC9280q interfaceC9280q, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.f17604b) ? AbstractC9276m.m17047e(interfaceC9280q, interfaceC9100d, i10, bufferOverflow) : interfaceC9280q;
    }
}
