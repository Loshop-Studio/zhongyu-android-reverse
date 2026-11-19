package p258u8;

import java.util.Iterator;
import java.util.Set;

/* renamed from: u8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9591c {
    /* renamed from: a */
    public static void m15985a(Set set, InterfaceC9589a interfaceC9589a) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC9589a interfaceC9589a2 = (InterfaceC9589a) it.next();
                if (interfaceC9589a2.equals(interfaceC9589a)) {
                    set.remove(interfaceC9589a2);
                } else if (interfaceC9589a2 instanceof InterfaceC9594f) {
                    InterfaceC9589a interfaceC9589aMo15986a = interfaceC9589a2;
                    while (interfaceC9589aMo15986a instanceof InterfaceC9594f) {
                        interfaceC9589aMo15986a = ((InterfaceC9594f) interfaceC9589aMo15986a).mo15986a();
                    }
                    if (interfaceC9589aMo15986a == null || interfaceC9589aMo15986a.equals(interfaceC9589a)) {
                        set.remove(interfaceC9589a2);
                    }
                }
            }
        }
    }
}
