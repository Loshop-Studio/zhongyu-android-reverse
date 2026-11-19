package kotlinx.coroutines.flow.internal;

import coil3.network.AbstractC3315g;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlinx.coroutines.C5979l1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C5957w;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5469a;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.flow.internal.b */
/* loaded from: classes4.dex */
public abstract class AbstractC5920b {

    /* renamed from: a */
    public static final InterfaceC5631c[] f9387a = new InterfaceC5631c[0];

    /* renamed from: b */
    public static final C5486r f9388b = new C5486r("NULL");

    /* renamed from: c */
    public static final C5486r f9389c = new C5486r("UNINITIALIZED");

    /* renamed from: a */
    public static final Object m5563a(InterfaceC5912g interfaceC5912g, InterfaceC5910f[] interfaceC5910fArr, InterfaceC6474f interfaceC6474f, InterfaceC5631c interfaceC5631c) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(interfaceC5910fArr, C5957w.f9445a, interfaceC6474f, interfaceC5912g, null);
        C5979l1 c5979l1 = new C5979l1(interfaceC5631c.getContext(), interfaceC5631c, 1);
        Object objM2244m = AbstractC3315g.m2244m(c5979l1, true, c5979l1, combineKt$combineInternal$2);
        return objM2244m == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2244m : C5443s.f8405a;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5910f m5564b(InterfaceC5929k interfaceC5929k, C5447d c5447d, int i, BufferOverflow bufferOverflow, int i8) {
        InterfaceC5636h interfaceC5636h = c5447d;
        if ((i8 & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            i = -3;
        }
        if ((i8 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return interfaceC5929k.mo5520b(interfaceC5636h, i, bufferOverflow);
    }

    /* renamed from: c */
    public static final Object m5565c(InterfaceC5636h interfaceC5636h, Object obj, Object obj2, InterfaceC6473e interfaceC6473e, InterfaceC5631c frame) {
        Object objInvoke;
        Object objM4838n = AbstractC5469a.m4838n(interfaceC5636h, obj2);
        try {
            C5934p c5934p = new C5934p(frame, interfaceC5636h);
            if (interfaceC6473e == null) {
                objInvoke = AbstractC6683l.m6379s(interfaceC6473e, obj, c5934p);
            } else {
                AbstractC5835p.m5354c(2, interfaceC6473e);
                objInvoke = interfaceC6473e.invoke(obj, c5934p);
            }
            AbstractC5469a.m4831g(interfaceC5636h, objM4838n);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                AbstractC5830k.m5330g(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            AbstractC5469a.m4831g(interfaceC5636h, objM4838n);
            throw th;
        }
    }
}
