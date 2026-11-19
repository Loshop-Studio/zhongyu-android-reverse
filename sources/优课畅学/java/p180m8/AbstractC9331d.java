package p180m8;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10574p;

/* renamed from: m8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9331d {
    /* renamed from: b */
    public static final Object m17164b(InterfaceC9100d interfaceC9100d, Object obj, Object obj2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        Object objM16749c = ThreadContextKt.m16749c(interfaceC9100d, obj2);
        try {
            C9341n c9341n = new C9341n(interfaceC9324c, interfaceC9100d);
            Object objM16080e = !(interfaceC10574p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m16080e(interfaceC10574p, obj, c9341n) : ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(obj, c9341n);
            ThreadContextKt.m16747a(interfaceC9100d, objM16749c);
            if (objM16080e == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16080e;
        } catch (Throwable th) {
            ThreadContextKt.m16747a(interfaceC9100d, objM16749c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m17165c(InterfaceC9100d interfaceC9100d, Object obj, Object obj2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = ThreadContextKt.m16748b(interfaceC9100d);
        }
        return m17164b(interfaceC9100d, obj, obj2, interfaceC10574p, interfaceC9324c);
    }

    /* renamed from: d */
    public static final InterfaceC9267d m17166d(InterfaceC9267d interfaceC9267d, InterfaceC9100d interfaceC9100d) {
        return interfaceC9267d instanceof C9340m ? true : interfaceC9267d instanceof C9338k ? interfaceC9267d : new UndispatchedContextCollector(interfaceC9267d, interfaceC9100d);
    }
}
