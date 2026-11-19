package kotlin.text;

import coil3.network.AbstractC3315g;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5803r;
import kotlin.jvm.internal.AbstractC5830k;
import p204y1.AbstractC6768a;
import p214z6.AbstractC6833k;

/* renamed from: kotlin.text.q */
/* loaded from: classes4.dex */
public abstract class AbstractC5856q extends AbstractC3315g {
    /* renamed from: p */
    public static String m5404p(String str) {
        Comparable comparable;
        AbstractC5830k.m5330g(str, "<this>");
        List listM6499z = AbstractC6833k.m6499z(new C5803r(str, 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM6499z) {
            if (!AbstractC5855p.m5382P((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!AbstractC6768a.m6450o(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM6499z.size();
        int iM5282u = AbstractC5806u.m5282u(listM6499z);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM6499z) {
            int i9 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str3 = (String) obj3;
            String strM5374H = ((i == 0 || i == iM5282u) && AbstractC5855p.m5382P(str3)) ? null : AbstractC5855p.m5374H(iIntValue, str3);
            if (strM5374H != null) {
                arrayList3.add(strM5374H);
            }
            i = i9;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC5805t.m5233m0(arrayList3, sb, SignParameters.NEW_LINE, null, 124);
        return sb.toString();
    }

    /* renamed from: q */
    public static String m5405q(String str) {
        AbstractC5830k.m5330g(str, "<this>");
        if (AbstractC5855p.m5382P("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM6499z = AbstractC6833k.m6499z(new C5803r(str, 2));
        int length = str.length();
        listM6499z.size();
        int iM5282u = AbstractC5806u.m5282u(listM6499z);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM6499z.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                AbstractC5805t.m5233m0(arrayList, sb, SignParameters.NEW_LINE, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != iM5282u) || !AbstractC5855p.m5382P(str2)) {
                int length2 = str2.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!AbstractC6768a.m6450o(str2.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && AbstractC5862w.m5408B(str2, i9, "|", false)) {
                    strSubstring = str2.substring("|".length() + i9);
                    AbstractC5830k.m5329f(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i8;
        }
    }
}
