package p222q6;

import java.util.Iterator;
import java.util.Set;

/* renamed from: q6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9836c {
    /* renamed from: a */
    public static void m18358a(Set set, InterfaceC9834a interfaceC9834a) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC9834a interfaceC9834a2 = (InterfaceC9834a) it.next();
                if (interfaceC9834a2.equals(interfaceC9834a)) {
                    set.remove(interfaceC9834a2);
                } else if (interfaceC9834a2 instanceof InterfaceC9839f) {
                    InterfaceC9834a interfaceC9834aMo18359a = interfaceC9834a2;
                    while (interfaceC9834aMo18359a instanceof InterfaceC9839f) {
                        interfaceC9834aMo18359a = ((InterfaceC9839f) interfaceC9834aMo18359a).mo18359a();
                    }
                    if (interfaceC9834aMo18359a == null || interfaceC9834aMo18359a.equals(interfaceC9834a)) {
                        set.remove(interfaceC9834a2);
                    }
                }
            }
        }
    }
}
