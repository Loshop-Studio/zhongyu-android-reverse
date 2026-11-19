package p082e3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2730l;
import kotlin.collections.C2731m;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p171x2.InterfaceC3470l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.n */
/* loaded from: classes.dex */
public class C2488n extends C2487m {

    /* renamed from: e3.n$a */
    static final class a extends AbstractC2770m implements InterfaceC3470l<String, String> {

        /* renamed from: a */
        public static final a f10109a = new a();

        a() {
            super(1);
        }

        @Override // p171x2.InterfaceC3470l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String line) {
            C2769l.m9241e(line, "line");
            return line;
        }
    }

    /* renamed from: e3.n$b */
    static final class b extends AbstractC2770m implements InterfaceC3470l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f10110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f10110a = str;
        }

        @Override // p171x2.InterfaceC3470l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String line) {
            C2769l.m9241e(line, "line");
            return C2769l.m9248l(this.f10110a, line);
        }
    }

    /* renamed from: b */
    private static final InterfaceC3470l<String, String> m8325b(String str) {
        return str.length() == 0 ? a.f10109a : new b(str);
    }

    /* renamed from: c */
    private static final int m8326c(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            int i5 = i4 + 1;
            if (!C2476b.m8262c(str.charAt(i4))) {
                break;
            }
            i4 = i5;
        }
        return i4 == -1 ? str.length() : i4;
    }

    @NotNull
    /* renamed from: d */
    public static final String m8327d(@NotNull String str, @NotNull String newIndent) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(newIndent, "newIndent");
        List<String> listM8389c0 = C2496v.m8389c0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8389c0) {
            if (!C2495u.m8346r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2731m.m9149p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m8326c((String) it.next())));
        }
        Integer num = (Integer) C2738t.m9156D(arrayList2);
        int i4 = 0;
        int iIntValue = num == null ? 0 : num.intValue();
        int length = str.length() + (newIndent.length() * listM8389c0.size());
        InterfaceC3470l<String, String> interfaceC3470lM8325b = m8325b(newIndent);
        int iM9141h = C2730l.m9141h(listM8389c0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM8389c0) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C2730l.m9148o();
            }
            String strInvoke = (String) obj2;
            if ((i4 == 0 || i4 == iM9141h) && C2495u.m8346r(strInvoke)) {
                strInvoke = null;
            } else {
                String strM8416J0 = C2498x.m8416J0(strInvoke, iIntValue);
                if (strM8416J0 != null) {
                    strInvoke = interfaceC3470lM8325b.invoke(strM8416J0);
                }
            }
            if (strInvoke != null) {
                arrayList3.add(strInvoke);
            }
            i4 = i5;
        }
        String string = ((StringBuilder) C2738t.m9172y(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C2769l.m9240d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    @NotNull
    /* renamed from: e */
    public static final String m8328e(@NotNull String str, @NotNull String newIndent, @NotNull String marginPrefix) {
        int i4;
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(newIndent, "newIndent");
        C2769l.m9241e(marginPrefix, "marginPrefix");
        if (!(!C2495u.m8346r(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listM8389c0 = C2496v.m8389c0(str);
        int length = str.length() + (newIndent.length() * listM8389c0.size());
        InterfaceC3470l<String, String> interfaceC3470lM8325b = m8325b(newIndent);
        int iM9141h = C2730l.m9141h(listM8389c0);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : listM8389c0) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C2730l.m9148o();
            }
            String strInvoke = (String) obj;
            String strSubstring = null;
            if ((i5 == 0 || i5 == iM9141h) && C2495u.m8346r(strInvoke)) {
                strInvoke = null;
            } else {
                int length2 = strInvoke.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        i4 = -1;
                        break;
                    }
                    int i8 = i7 + 1;
                    if (!C2476b.m8262c(strInvoke.charAt(i7))) {
                        i4 = i7;
                        break;
                    }
                    i7 = i8;
                }
                if (i4 != -1) {
                    int i9 = i4;
                    if (C2495u.m8339B(strInvoke, marginPrefix, i4, false, 4, null)) {
                        strSubstring = strInvoke.substring(i9 + marginPrefix.length());
                        C2769l.m9240d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null) {
                    strInvoke = interfaceC3470lM8325b.invoke(strSubstring);
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i5 = i6;
        }
        String string = ((StringBuilder) C2738t.m9172y(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C2769l.m9240d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    @NotNull
    /* renamed from: f */
    public static String m8329f(@NotNull String str) {
        C2769l.m9241e(str, "<this>");
        return m8327d(str, "");
    }

    @NotNull
    /* renamed from: g */
    public static final String m8330g(@NotNull String str, @NotNull String marginPrefix) {
        C2769l.m9241e(str, "<this>");
        C2769l.m9241e(marginPrefix, "marginPrefix");
        return m8328e(str, "", marginPrefix);
    }

    /* renamed from: h */
    public static /* synthetic */ String m8331h(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "|";
        }
        return m8330g(str, str2);
    }
}
