package p290w8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p089e8.AbstractC8388p;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8377e;
import p089e8.InterfaceC8387o;
import p268u8.InterfaceC10210f;

/* renamed from: w8.x1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10465x1 {

    /* renamed from: a */
    public static final InterfaceC10210f[] f20797a = new InterfaceC10210f[0];

    /* renamed from: a */
    public static final Set m19564a(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        if (interfaceC10210f instanceof InterfaceC10423n) {
            return ((InterfaceC10423n) interfaceC10210f).mo19097a();
        }
        HashSet hashSet = new HashSet(interfaceC10210f.mo19086c());
        int iMo19086c = interfaceC10210f.mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            hashSet.add(interfaceC10210f.mo19087d(i10));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final InterfaceC10210f[] m19565b(List list) {
        InterfaceC10210f[] interfaceC10210fArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC10210fArr = (InterfaceC10210f[]) list.toArray(new InterfaceC10210f[0])) == null) ? f20797a : interfaceC10210fArr;
    }

    /* renamed from: c */
    public static final InterfaceC8375c m19566c(InterfaceC8387o interfaceC8387o) {
        AbstractC9133u.m16133g(interfaceC8387o, "<this>");
        InterfaceC8377e interfaceC8377eMo13676b = interfaceC8387o.mo13676b();
        if (interfaceC8377eMo13676b instanceof InterfaceC8375c) {
            return (InterfaceC8375c) interfaceC8377eMo13676b;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC8377eMo13676b);
    }

    /* renamed from: d */
    public static final String m19567d(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        String strMo13672g = interfaceC8375c.mo13672g();
        if (strMo13672g == null) {
            strMo13672g = "<local class name not available>";
        }
        return m19568e(strMo13672g);
    }

    /* renamed from: e */
    public static final String m19568e(String className) {
        AbstractC9133u.m16133g(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: f */
    public static final Void m19569f(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        throw new SerializationException(m19567d(interfaceC8375c));
    }

    /* renamed from: g */
    public static final InterfaceC8387o m19570g(AbstractC8388p abstractC8388p) {
        AbstractC9133u.m16133g(abstractC8388p, "<this>");
        throw null;
    }
}
