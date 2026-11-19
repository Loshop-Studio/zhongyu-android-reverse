package p147j9;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p136i9.C8924v;
import p223q7.AbstractC9844c;

/* renamed from: j9.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9035e {
    /* renamed from: a */
    public static final String m15709a(char c10) {
        String string = Integer.toString(c10, AbstractC8656a.m13939a(16));
        AbstractC9133u.m16132f(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    /* renamed from: b */
    public static final C8924v.a m15710b(C8924v.a aVar, String name, String value) {
        AbstractC9133u.m16133g(aVar, "<this>");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
        m15726r(name);
        m15727s(value, name);
        m15712d(aVar, name, value);
        return aVar;
    }

    /* renamed from: c */
    public static final C8924v.a m15711c(C8924v.a aVar, C8924v headers) {
        AbstractC9133u.m16133g(aVar, "<this>");
        AbstractC9133u.m16133g(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            m15712d(aVar, headers.m15262c(i10), headers.m15265g(i10));
        }
        return aVar;
    }

    /* renamed from: d */
    public static final C8924v.a m15712d(C8924v.a aVar, String name, String value) {
        AbstractC9133u.m16133g(aVar, "<this>");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
        aVar.m15273g().add(name);
        aVar.m15273g().add(AbstractC8661c0.m13982W0(value).toString());
        return aVar;
    }

    /* renamed from: e */
    public static final C8924v m15713e(C8924v.a aVar) {
        AbstractC9133u.m16133g(aVar, "<this>");
        return new C8924v((String[]) aVar.m15273g().toArray(new String[0]));
    }

    /* renamed from: f */
    public static final boolean m15714f(C8924v c8924v, Object obj) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        return (obj instanceof C8924v) && Arrays.equals(c8924v.m15261b(), ((C8924v) obj).m15261b());
    }

    /* renamed from: g */
    public static final int m15715g(C8924v c8924v) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        return Arrays.hashCode(c8924v.m15261b());
    }

    /* renamed from: h */
    public static final String m15716h(String[] namesAndValues, String name) {
        AbstractC9133u.m16133g(namesAndValues, "namesAndValues");
        AbstractC9133u.m16133g(name, "name");
        int length = namesAndValues.length - 2;
        int iM18367b = AbstractC9844c.m18367b(length, 0, -2);
        if (iM18367b > length) {
            return null;
        }
        while (!AbstractC8687z.m14093A(name, namesAndValues[length], true)) {
            if (length == iM18367b) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    /* renamed from: i */
    public static final C8924v m15717i(String... inputNamesAndValues) {
        AbstractC9133u.m16133g(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = AbstractC8661c0.m13982W0(inputNamesAndValues[i11]).toString();
        }
        int iM18367b = AbstractC9844c.m18367b(0, strArr.length - 1, 2);
        if (iM18367b >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                m15726r(str);
                m15727s(str2, str);
                if (i10 == iM18367b) {
                    break;
                }
                i10 += 2;
            }
        }
        return new C8924v(strArr);
    }

    /* renamed from: j */
    public static final Iterator m15718j(C8924v c8924v) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        int size = c8924v.size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = AbstractC8726f.m14230a(c8924v.m15262c(i10), c8924v.m15265g(i10));
        }
        return AbstractC9117e.m16110a(pairArr);
    }

    /* renamed from: k */
    public static final String m15719k(C8924v c8924v, int i10) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        String str = (String) AbstractC8801r.m14672D0(c8924v.m15261b(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    /* renamed from: l */
    public static final C8924v.a m15720l(C8924v c8924v) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        C8924v.a aVar = new C8924v.a();
        AbstractC8768a0.m14482D(aVar.m15273g(), c8924v.m15261b());
        return aVar;
    }

    /* renamed from: m */
    public static final C8924v.a m15721m(C8924v.a aVar, String name) {
        AbstractC9133u.m16133g(aVar, "<this>");
        AbstractC9133u.m16133g(name, "name");
        int i10 = 0;
        while (i10 < aVar.m15273g().size()) {
            if (AbstractC8687z.m14093A(name, (String) aVar.m15273g().get(i10), true)) {
                aVar.m15273g().remove(i10);
                aVar.m15273g().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    /* renamed from: n */
    public static final C8924v.a m15722n(C8924v.a aVar, String name, String value) {
        AbstractC9133u.m16133g(aVar, "<this>");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(value, "value");
        m15726r(name);
        m15727s(value, name);
        aVar.m15274h(name);
        m15712d(aVar, name, value);
        return aVar;
    }

    /* renamed from: o */
    public static final String m15723o(C8924v c8924v) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        StringBuilder sb = new StringBuilder();
        int size = c8924v.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM15262c = c8924v.m15262c(i10);
            String strM15265g = c8924v.m15265g(i10);
            sb.append(strM15262c);
            sb.append(": ");
            if (AbstractC9038h.m15766v(strM15262c)) {
                strM15265g = "██";
            }
            sb.append(strM15265g);
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static final String m15724p(C8924v c8924v, int i10) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        String str = (String) AbstractC8801r.m14672D0(c8924v.m15261b(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    /* renamed from: q */
    public static final List m15725q(C8924v c8924v, String name) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        AbstractC9133u.m16133g(name, "name");
        int size = c8924v.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC8687z.m14093A(name, c8924v.m15262c(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c8924v.m15265g(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC9133u.m16132f(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? AbstractC8809v.m14771n() : listUnmodifiableList;
    }

    /* renamed from: r */
    public static final void m15726r(String name) {
        AbstractC9133u.m16133g(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + m15709a(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    /* renamed from: s */
    public static final void m15727s(String value, String name) {
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected char 0x");
                sb.append(m15709a(cCharAt));
                sb.append(" at ");
                sb.append(i10);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(AbstractC9038h.m15766v(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
