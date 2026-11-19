package p290w8;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.AbstractC10214j;
import p268u8.AbstractC10218n;
import p268u8.InterfaceC10210f;

/* renamed from: w8.e2 */
/* loaded from: classes5.dex */
public abstract class AbstractC10384e2 {
    /* renamed from: a */
    public static final int m19379a(InterfaceC10210f interfaceC10210f, InterfaceC10210f[] typeParams) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        AbstractC9133u.m16133g(typeParams, "typeParams");
        int iHashCode = (interfaceC10210f.mo19089f().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableM19099a = AbstractC10214j.m19099a(interfaceC10210f);
        Iterator it = iterableM19099a.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strMo19089f = ((InterfaceC10210f) it.next()).mo19089f();
            if (strMo19089f != null) {
                iHashCode3 = strMo19089f.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableM19099a.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            AbstractC10218n kind = ((InterfaceC10210f) it2.next()).getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
