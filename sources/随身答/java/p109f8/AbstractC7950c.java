package p109f8;

import java.util.Iterator;
import java.util.Set;

/* renamed from: f8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7950c {
    /* renamed from: a */
    public static void m12496a(Set set, InterfaceC7948a interfaceC7948a) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC7948a interfaceC7948a2 = (InterfaceC7948a) it.next();
                if (interfaceC7948a2.equals(interfaceC7948a)) {
                    set.remove(interfaceC7948a2);
                } else if (interfaceC7948a2 instanceof InterfaceC7953f) {
                    InterfaceC7948a interfaceC7948aMo12497a = interfaceC7948a2;
                    while (interfaceC7948aMo12497a instanceof InterfaceC7953f) {
                        interfaceC7948aMo12497a = ((InterfaceC7953f) interfaceC7948aMo12497a).mo12497a();
                    }
                    if (interfaceC7948aMo12497a == null || interfaceC7948aMo12497a.equals(interfaceC7948a)) {
                        set.remove(interfaceC7948a2);
                    }
                }
            }
        }
    }
}
