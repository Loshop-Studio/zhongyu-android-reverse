package okhttp3;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.text.AbstractC5862w;
import p139p7.AbstractC6396c;
import p160s6.InterfaceC6560a;
import p185v7.AbstractC6683l;

/* renamed from: okhttp3.q */
/* loaded from: classes4.dex */
public final class C6329q implements Iterable, InterfaceC6560a {

    /* renamed from: a */
    public final String[] f10263a;

    public C6329q(String[] strArr) {
        this.f10263a = strArr;
    }

    /* renamed from: a */
    public final String m5962a(String name) {
        AbstractC5830k.m5330g(name, "name");
        String[] strArr = this.f10263a;
        int length = strArr.length - 2;
        int iM6373m = AbstractC6683l.m6373m(length, 0, -2);
        if (iM6373m > length) {
            return null;
        }
        while (!AbstractC5862w.m5415v(name, strArr[length], true)) {
            if (length == iM6373m) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* renamed from: b */
    public final String m5963b(int i) {
        return this.f10263a[i * 2];
    }

    /* renamed from: c */
    public final C5834o m5964c() {
        C5834o c5834o = new C5834o(2, false);
        AbstractC5810y.m5292T(c5834o.f9224a, this.f10263a);
        return c5834o;
    }

    /* renamed from: d */
    public final TreeMap m5965d() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC5830k.m5329f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM5963b = m5963b(i);
            Locale US = Locale.US;
            AbstractC5830k.m5329f(US, "US");
            String lowerCase = strM5963b.toLowerCase(US);
            AbstractC5830k.m5329f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m5966e(i));
        }
        return treeMap;
    }

    /* renamed from: e */
    public final String m5966e(int i) {
        return this.f10263a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6329q) {
            return Arrays.equals(this.f10263a, ((C6329q) obj).f10263a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10263a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m5963b(i), m5966e(i));
        }
        return AbstractC5830k.m5335l(pairArr);
    }

    public final int size() {
        return this.f10263a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM5963b = m5963b(i);
            String strM5966e = m5966e(i);
            sb.append(strM5963b);
            sb.append(": ");
            if (AbstractC6396c.m6055o(strM5963b)) {
                strM5966e = "██";
            }
            sb.append(strM5966e);
            sb.append(SignParameters.NEW_LINE);
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
