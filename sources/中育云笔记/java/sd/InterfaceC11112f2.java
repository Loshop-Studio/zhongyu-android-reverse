package sd;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

/* renamed from: sd.f2 */
/* loaded from: classes6.dex */
public interface InterfaceC11112f2 extends InterfaceC9945d.b {

    /* renamed from: sd.f2$a */
    public static final class a {
        /* renamed from: a */
        public static Object m24714a(InterfaceC11112f2 interfaceC11112f2, Object obj, InterfaceC9544p interfaceC9544p) {
            return InterfaceC9945d.b.a.m20216a(interfaceC11112f2, obj, interfaceC9544p);
        }

        /* renamed from: b */
        public static InterfaceC9945d m24715b(InterfaceC11112f2 interfaceC11112f2, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(interfaceC11112f2, interfaceC9945d);
        }
    }

    void restoreThreadContext(InterfaceC9945d interfaceC9945d, Object obj);

    Object updateThreadContext(InterfaceC9945d interfaceC9945d);
}
