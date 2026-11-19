package ge;

import ee.AbstractC9133j;
import ee.AbstractC9137n;
import ee.InterfaceC9129f;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.e2 */
/* loaded from: classes6.dex */
public abstract class AbstractC9317e2 {
    /* renamed from: a */
    public static final int m18405a(InterfaceC9129f interfaceC9129f, InterfaceC9129f[] typeParams) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        AbstractC9979u.m20294g(typeParams, "typeParams");
        int iHashCode = (interfaceC9129f.mo17961f().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableM17971a = AbstractC9133j.m17971a(interfaceC9129f);
        Iterator it = iterableM17971a.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strMo17961f = ((InterfaceC9129f) it.next()).mo17961f();
            if (strMo17961f != null) {
                iHashCode3 = strMo17961f.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableM17971a.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            AbstractC9137n kind = ((InterfaceC9129f) it2.next()).getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
