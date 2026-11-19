package p310qd;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* renamed from: qd.s */
/* loaded from: classes6.dex */
public abstract class AbstractC10812s extends AbstractC10808o {
    /* renamed from: e */
    public static final InterfaceC9540l m23212e(final String str) {
        return str.length() == 0 ? new InterfaceC9540l() { // from class: qd.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10812s.m23213f((String) obj);
            }
        } : new InterfaceC9540l() { // from class: qd.r
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10812s.m23214g(str, (String) obj);
            }
        };
    }

    /* renamed from: f */
    public static final String m23213f(String line) {
        AbstractC9979u.m20294g(line, "line");
        return line;
    }

    /* renamed from: g */
    public static final String m23214g(String str, String line) {
        AbstractC9979u.m20294g(line, "line");
        return str + line;
    }

    /* renamed from: h */
    public static final int m23215h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC10788a.m23075c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* renamed from: i */
    public static final String m23216i(String str, final String indent) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(indent, "indent");
        return AbstractC10669q.m22588z(AbstractC10669q.m22570B(AbstractC10793c0.m23138n0(str), new InterfaceC9540l() { // from class: qd.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10812s.m23218k(indent, (String) obj);
            }
        }), SignParameters.NEW_LINE, null, null, 0, null, null, 62, null);
    }

    /* renamed from: j */
    public static /* synthetic */ String m23217j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return m23216i(str, str2);
    }

    /* renamed from: k */
    public static final String m23218k(String str, String it) {
        AbstractC9979u.m20294g(it, "it");
        if (AbstractC10793c0.m23132h0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    /* renamed from: l */
    public static final String m23219l(String str, String newIndent) {
        String str2;
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(newIndent, "newIndent");
        List listM23139o0 = AbstractC10793c0.m23139o0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM23139o0) {
            if (!AbstractC10793c0.m23132h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(m23215h((String) obj2)));
        }
        Integer num = (Integer) AbstractC10947g0.m23901C0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM23139o0.size());
        InterfaceC9540l interfaceC9540lM23212e = m23212e(newIndent);
        int iM24138p = AbstractC10978w.m24138p(listM23139o0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM23139o0) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            String str3 = (String) obj3;
            if ((i10 == 0 || i10 == iM24138p) && AbstractC10793c0.m23132h0(str3)) {
                str3 = null;
            } else {
                String strM23169f1 = AbstractC10797e0.m23169f1(str3, iIntValue);
                if (strM23169f1 != null && (str2 = (String) interfaceC9540lM23212e.invoke(strM23169f1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i12;
        }
        return ((StringBuilder) AbstractC10947g0.m23951t0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : SignParameters.NEW_LINE, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* renamed from: m */
    public static final String m23220m(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(newIndent, "newIndent");
        AbstractC9979u.m20294g(marginPrefix, "marginPrefix");
        if (AbstractC10793c0.m23132h0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM23139o0 = AbstractC10793c0.m23139o0(str);
        int length = str.length() + (newIndent.length() * listM23139o0.size());
        InterfaceC9540l interfaceC9540lM23212e = m23212e(newIndent);
        int iM24138p = AbstractC10978w.m24138p(listM23139o0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM23139o0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM24138p) && AbstractC10793c0.m23132h0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!AbstractC10788a.m23075c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (AbstractC10819z.m23241N(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        AbstractC9979u.m20292e(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC9979u.m20293f(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) interfaceC9540lM23212e.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) AbstractC10947g0.m23951t0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : SignParameters.NEW_LINE, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* renamed from: n */
    public static String m23221n(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        return m23219l(str, "");
    }

    /* renamed from: o */
    public static final String m23222o(String str, String marginPrefix) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(marginPrefix, "marginPrefix");
        return m23220m(str, "", marginPrefix);
    }

    /* renamed from: p */
    public static /* synthetic */ String m23223p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return m23222o(str, str2);
    }
}
