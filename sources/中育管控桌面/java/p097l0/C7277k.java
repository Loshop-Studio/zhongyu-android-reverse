package p097l0;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l0.k */
/* loaded from: classes3.dex */
public final class C7277k implements InterfaceC7275i {

    /* renamed from: c */
    public final Map f9211c;

    /* renamed from: d */
    public volatile Map f9212d;

    /* renamed from: l0.k$a */
    public static final class a {

        /* renamed from: d */
        public static final String f9213d;

        /* renamed from: e */
        public static final Map f9214e;

        /* renamed from: a */
        public boolean f9215a = true;

        /* renamed from: b */
        public Map f9216b = f9214e;

        /* renamed from: c */
        public boolean f9217c = true;

        static {
            String strM8242b = m8242b();
            f9213d = strM8242b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM8242b)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strM8242b)));
            }
            f9214e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m8242b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = property.charAt(i6);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C7277k m8243a() {
            this.f9215a = true;
            return new C7277k(this.f9216b);
        }
    }

    /* renamed from: l0.k$b */
    public static final class b implements InterfaceC7276j {

        /* renamed from: a */
        public final String f9218a;

        public b(String str) {
            this.f9218a = str;
        }

        @Override // p097l0.InterfaceC7276j
        /* renamed from: a */
        public String mo8239a() {
            return this.f9218a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9218a.equals(((b) obj).f9218a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9218a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f9218a + "'}";
        }
    }

    public C7277k(Map map) {
        this.f9211c = Collections.unmodifiableMap(map);
    }

    @Override // p097l0.InterfaceC7275i
    /* renamed from: a */
    public Map mo8238a() {
        if (this.f9212d == null) {
            synchronized (this) {
                try {
                    if (this.f9212d == null) {
                        this.f9212d = Collections.unmodifiableMap(m8241c());
                    }
                } finally {
                }
            }
        }
        return this.f9212d;
    }

    /* renamed from: b */
    public final String m8240b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            String strMo8239a = ((InterfaceC7276j) list.get(i6)).mo8239a();
            if (!TextUtils.isEmpty(strMo8239a)) {
                sb.append(strMo8239a);
                if (i6 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map m8241c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f9211c.entrySet()) {
            String strM8240b = m8240b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM8240b)) {
                map.put(entry.getKey(), strM8240b);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7277k) {
            return this.f9211c.equals(((C7277k) obj).f9211c);
        }
        return false;
    }

    public int hashCode() {
        return this.f9211c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f9211c + '}';
    }
}
