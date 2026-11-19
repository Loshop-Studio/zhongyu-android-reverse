package ge;

import ee.InterfaceC9129f;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p280od.AbstractC10482p;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10471e;
import p280od.InterfaceC10481o;

/* renamed from: ge.x1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9398x1 {

    /* renamed from: a */
    public static final InterfaceC9129f[] f21824a = new InterfaceC9129f[0];

    /* renamed from: a */
    public static final Set m18592a(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        if (interfaceC9129f instanceof InterfaceC9356n) {
            return ((InterfaceC9356n) interfaceC9129f).mo17969a();
        }
        HashSet hashSet = new HashSet(interfaceC9129f.mo17958c());
        int iMo17958c = interfaceC9129f.mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            hashSet.add(interfaceC9129f.mo17959d(i10));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final InterfaceC9129f[] m18593b(List list) {
        InterfaceC9129f[] interfaceC9129fArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC9129fArr = (InterfaceC9129f[]) list.toArray(new InterfaceC9129f[0])) == null) ? f21824a : interfaceC9129fArr;
    }

    /* renamed from: c */
    public static final InterfaceC10469c m18594c(InterfaceC10481o interfaceC10481o) {
        AbstractC9979u.m20294g(interfaceC10481o, "<this>");
        InterfaceC10471e interfaceC10471eMo18566c = interfaceC10481o.mo18566c();
        if (interfaceC10471eMo18566c instanceof InterfaceC10469c) {
            return (InterfaceC10469c) interfaceC10471eMo18566c;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC10471eMo18566c);
    }

    /* renamed from: d */
    public static final String m18595d(String className) {
        AbstractC9979u.m20294g(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: e */
    public static final String m18596e(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        String strMo20277f = interfaceC10469c.mo20277f();
        if (strMo20277f == null) {
            strMo20277f = "<local class name not available>";
        }
        return m18595d(strMo20277f);
    }

    /* renamed from: f */
    public static final Void m18597f(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        throw new SerializationException(m18596e(interfaceC10469c));
    }

    /* renamed from: g */
    public static final InterfaceC10481o m18598g(AbstractC10482p abstractC10482p) {
        AbstractC9979u.m20294g(abstractC10482p, "<this>");
        throw null;
    }
}
