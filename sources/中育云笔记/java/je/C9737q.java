package je;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import ke.AbstractC9920d;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p309qc.AbstractC10776g;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10978w;
import p439zc.AbstractC12039c;

/* renamed from: je.q */
/* loaded from: classes6.dex */
public final class C9737q implements Iterable, InterfaceC9624a {

    /* renamed from: d */
    public static final b f22746d = new b(null);

    /* renamed from: c */
    public final String[] f22747c;

    /* renamed from: je.q$a */
    public static final class a {

        /* renamed from: a */
        public final List f22748a = new ArrayList(20);

        /* renamed from: a */
        public final a m19395a(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            b bVar = C9737q.f22746d;
            bVar.m19407d(name);
            bVar.m19408e(value, name);
            m19398d(name, value);
            return this;
        }

        /* renamed from: b */
        public final a m19396b(C9737q headers) {
            AbstractC9979u.m20294g(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                m19398d(headers.m19390b(i10), headers.m19393f(i10));
            }
            return this;
        }

        /* renamed from: c */
        public final a m19397c(String line) {
            AbstractC9979u.m20294g(line, "line");
            int iM23128e0 = AbstractC10793c0.m23128e0(line, ':', 1, false, 4, null);
            if (iM23128e0 != -1) {
                String strSubstring = line.substring(0, iM23128e0);
                AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iM23128e0 + 1);
                AbstractC9979u.m20293f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m19398d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m19398d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC9979u.m20293f(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m19398d("", strSubstring3);
            return this;
        }

        /* renamed from: d */
        public final a m19398d(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            this.f22748a.add(name);
            this.f22748a.add(AbstractC10793c0.m23129e1(value).toString());
            return this;
        }

        /* renamed from: e */
        public final a m19399e(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            C9737q.f22746d.m19407d(name);
            m19398d(name, value);
            return this;
        }

        /* renamed from: f */
        public final C9737q m19400f() {
            return new C9737q((String[]) this.f22748a.toArray(new String[0]), null);
        }

        /* renamed from: g */
        public final List m19401g() {
            return this.f22748a;
        }

        /* renamed from: h */
        public final a m19402h(String name) {
            AbstractC9979u.m20294g(name, "name");
            int i10 = 0;
            while (i10 < this.f22748a.size()) {
                if (AbstractC10819z.m23230C(name, (String) this.f22748a.get(i10), true)) {
                    this.f22748a.remove(i10);
                    this.f22748a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final a m19403i(String name, String value) {
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(value, "value");
            b bVar = C9737q.f22746d;
            bVar.m19407d(name);
            bVar.m19408e(value, name);
            m19402h(name);
            m19398d(name, value);
            return this;
        }
    }

    /* renamed from: je.q$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: d */
        public final void m19407d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(AbstractC9920d.m20038t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* renamed from: e */
        public final void m19408e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractC9920d.m20038t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(AbstractC9920d.m19999G(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* renamed from: f */
        public final String m19409f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM26665c = AbstractC12039c.m26665c(length, 0, -2);
            if (iM26665c > length) {
                return null;
            }
            while (!AbstractC10819z.m23230C(str, strArr[length], true)) {
                if (length == iM26665c) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* renamed from: g */
        public final C9737q m19410g(String... namesAndValues) {
            AbstractC9979u.m20294g(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = AbstractC10793c0.m23129e1(str).toString();
            }
            int iM26665c = AbstractC12039c.m26665c(0, strArr.length - 1, 2);
            if (iM26665c >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    m19407d(str2);
                    m19408e(str3, str2);
                    if (i10 == iM26665c) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new C9737q(strArr, null);
        }

        public b() {
        }
    }

    public /* synthetic */ C9737q(String[] strArr, AbstractC9972n abstractC9972n) {
        this(strArr);
    }

    /* renamed from: d */
    public static final C9737q m19388d(String... strArr) {
        return f22746d.m19410g(strArr);
    }

    /* renamed from: a */
    public final String m19389a(String name) {
        AbstractC9979u.m20294g(name, "name");
        return f22746d.m19409f(this.f22747c, name);
    }

    /* renamed from: b */
    public final String m19390b(int i10) {
        return this.f22747c[i10 * 2];
    }

    /* renamed from: c */
    public final a m19391c() {
        a aVar = new a();
        AbstractC10937b0.m23859D(aVar.m19401g(), this.f22747c);
        return aVar;
    }

    /* renamed from: e */
    public final Map m19392e() {
        TreeMap treeMap = new TreeMap(AbstractC10819z.m23232E(C9960c0.f23411a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM19390b = m19390b(i10);
            Locale US = Locale.US;
            AbstractC9979u.m20293f(US, "US");
            String lowerCase = strM19390b.toLowerCase(US);
            AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m19393f(i10));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9737q) && Arrays.equals(this.f22747c, ((C9737q) obj).f22747c);
    }

    /* renamed from: f */
    public final String m19393f(int i10) {
        return this.f22747c[(i10 * 2) + 1];
    }

    /* renamed from: g */
    public final List m19394g(String name) {
        AbstractC9979u.m20294g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC10819z.m23230C(name, m19390b(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m19393f(i10));
            }
        }
        if (arrayList == null) {
            return AbstractC10978w.m24136n();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC9979u.m20293f(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f22747c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = AbstractC10776g.m22975a(m19390b(i10), m19393f(i10));
        }
        return AbstractC9963e.m20268a(pairArr);
    }

    public final int size() {
        return this.f22747c.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM19390b = m19390b(i10);
            String strM19393f = m19393f(i10);
            sb2.append(strM19390b);
            sb2.append(": ");
            if (AbstractC9920d.m19999G(strM19390b)) {
                strM19393f = "██";
            }
            sb2.append(strM19393f);
            sb2.append(SignParameters.NEW_LINE);
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public C9737q(String[] strArr) {
        this.f22747c = strArr;
    }
}
