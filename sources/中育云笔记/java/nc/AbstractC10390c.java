package nc;

import java.util.Iterator;
import java.util.Set;

/* renamed from: nc.c */
/* loaded from: classes6.dex */
public abstract class AbstractC10390c {
    /* renamed from: a */
    public static void m21714a(Set set, InterfaceC10388a interfaceC10388a) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC10388a interfaceC10388a2 = (InterfaceC10388a) it.next();
                if (interfaceC10388a2.equals(interfaceC10388a)) {
                    set.remove(interfaceC10388a2);
                } else if (interfaceC10388a2 instanceof InterfaceC10393f) {
                    InterfaceC10388a interfaceC10388aMo21715a = interfaceC10388a2;
                    while (interfaceC10388aMo21715a instanceof InterfaceC10393f) {
                        interfaceC10388aMo21715a = ((InterfaceC10393f) interfaceC10388aMo21715a).mo21715a();
                    }
                    if (interfaceC10388aMo21715a == null || interfaceC10388aMo21715a.equals(interfaceC10388a)) {
                        set.remove(interfaceC10388a2);
                    }
                }
            }
        }
    }
}
