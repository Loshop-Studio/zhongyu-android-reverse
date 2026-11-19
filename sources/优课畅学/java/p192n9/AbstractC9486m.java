package p192n9;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p147j9.AbstractC9038h;

/* renamed from: n9.m */
/* loaded from: classes5.dex */
public abstract class AbstractC9486m {
    /* renamed from: a */
    public static final List m17508a(List addresses) {
        AbstractC9133u.m16133g(addresses, "addresses");
        if (addresses.size() < 2) {
            return addresses;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : addresses) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.m15903a();
        List list2 = (List) pair.m15904b();
        return (list.isEmpty() || list2.isEmpty()) ? addresses : AbstractC9038h.m15764t(list, list2);
    }
}
