package p113g8;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8479q;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;

/* renamed from: g8.s */
/* loaded from: classes5.dex */
public abstract class AbstractC8680s extends AbstractC8676o {
    /* renamed from: e */
    public static final InterfaceC10570l m14077e(final String str) {
        return str.length() == 0 ? new InterfaceC10570l() { // from class: g8.q
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8680s.m14078f((String) obj);
            }
        } : new InterfaceC10570l() { // from class: g8.r
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8680s.m14079g(str, (String) obj);
            }
        };
    }

    /* renamed from: f */
    public static final String m14078f(String line) {
        AbstractC9133u.m16133g(line, "line");
        return line;
    }

    /* renamed from: g */
    public static final String m14079g(String str, String line) {
        AbstractC9133u.m16133g(line, "line");
        return str + line;
    }

    /* renamed from: h */
    public static final int m14080h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC8656a.m13941c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* renamed from: i */
    public static final String m14081i(String str, final String indent) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(indent, "indent");
        return AbstractC8479q.m13857z(AbstractC8479q.m13839B(AbstractC8661c0.m13999n0(str), new InterfaceC10570l() { // from class: g8.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8680s.m14083k(indent, (String) obj);
            }
        }), SignParameters.NEW_LINE, null, null, 0, null, null, 62, null);
    }

    /* renamed from: j */
    public static /* synthetic */ String m14082j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return m14081i(str, str2);
    }

    /* renamed from: k */
    public static final String m14083k(String str, String it) {
        AbstractC9133u.m16133g(it, "it");
        if (AbstractC8661c0.m13993h0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    /* renamed from: l */
    public static final String m14084l(String str, String newIndent) {
        String str2;
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(newIndent, "newIndent");
        List listM14000o0 = AbstractC8661c0.m14000o0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM14000o0) {
            if (!AbstractC8661c0.m13993h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m14080h((String) it.next())));
        }
        Integer num = (Integer) AbstractC8778f0.m14525B0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM14000o0.size());
        InterfaceC10570l interfaceC10570lM14077e = m14077e(newIndent);
        int iM14773p = AbstractC8809v.m14773p(listM14000o0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM14000o0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iM14773p) && AbstractC8661c0.m13993h0(str3)) {
                str3 = null;
            } else {
                String strM14030X0 = AbstractC8665e0.m14030X0(str3, iIntValue);
                if (strM14030X0 != null && (str2 = (String) interfaceC10570lM14077e.invoke(strM14030X0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) AbstractC8778f0.m14573s0(arrayList3, new StringBuilder(length), (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 2) != 0 ? ", " : SignParameters.NEW_LINE, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 4) != 0 ? "" : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 8) == 0 ? null : "", (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 16) != 0 ? -1 : 0, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 32) != 0 ? "..." : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 64) != 0 ? null : null)).toString();
    }

    /* renamed from: m */
    public static final String m14085m(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(newIndent, "newIndent");
        AbstractC9133u.m16133g(marginPrefix, "marginPrefix");
        if (AbstractC8661c0.m13993h0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM14000o0 = AbstractC8661c0.m14000o0(str);
        int length = str.length() + (newIndent.length() * listM14000o0.size());
        InterfaceC10570l interfaceC10570lM14077e = m14077e(newIndent);
        int iM14773p = AbstractC8809v.m14773p(listM14000o0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM14000o0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM14773p) && AbstractC8661c0.m13993h0(str4)) {
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
                    if (!AbstractC8656a.m13941c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (AbstractC8687z.m14104L(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        AbstractC9133u.m16131e(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC9133u.m16132f(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) interfaceC10570lM14077e.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) AbstractC8778f0.m14573s0(arrayList, new StringBuilder(length), (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 2) != 0 ? ", " : SignParameters.NEW_LINE, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 4) != 0 ? "" : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 8) == 0 ? null : "", (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 16) != 0 ? -1 : 0, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 32) != 0 ? "..." : null, (TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY & 64) != 0 ? null : null)).toString();
    }

    /* renamed from: n */
    public static String m14086n(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        return m14084l(str, "");
    }

    /* renamed from: o */
    public static final String m14087o(String str, String marginPrefix) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(marginPrefix, "marginPrefix");
        return m14085m(str, "", marginPrefix);
    }

    /* renamed from: p */
    public static /* synthetic */ String m14088p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return m14087o(str, str2);
    }
}
