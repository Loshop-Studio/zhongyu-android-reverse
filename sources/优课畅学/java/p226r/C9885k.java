package p226r;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r.k */
/* loaded from: classes3.dex */
public final class C9885k implements InterfaceC9883i {

    /* renamed from: c */
    public final Map f19800c;

    /* renamed from: d */
    public volatile Map f19801d;

    /* renamed from: r.k$a */
    public static final class a {

        /* renamed from: d */
        public static final String f19802d;

        /* renamed from: e */
        public static final Map f19803e;

        /* renamed from: a */
        public boolean f19804a = true;

        /* renamed from: b */
        public Map f19805b = f19803e;

        /* renamed from: c */
        public boolean f19806c = true;

        static {
            String strM18497b = m18497b();
            f19802d = strM18497b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM18497b)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strM18497b)));
            }
            f19803e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m18497b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C9885k m18498a() {
            this.f19804a = true;
            return new C9885k(this.f19805b);
        }
    }

    /* renamed from: r.k$b */
    public static final class b implements InterfaceC9884j {

        /* renamed from: a */
        public final String f19807a;

        public b(String str) {
            this.f19807a = str;
        }

        @Override // p226r.InterfaceC9884j
        /* renamed from: a */
        public String mo18494a() {
            return this.f19807a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f19807a.equals(((b) obj).f19807a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19807a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f19807a + "'}";
        }
    }

    public C9885k(Map map) {
        this.f19800c = Collections.unmodifiableMap(map);
    }

    @Override // p226r.InterfaceC9883i
    /* renamed from: a */
    public Map mo18493a() {
        if (this.f19801d == null) {
            synchronized (this) {
                try {
                    if (this.f19801d == null) {
                        this.f19801d = Collections.unmodifiableMap(m18496c());
                    }
                } finally {
                }
            }
        }
        return this.f19801d;
    }

    /* renamed from: b */
    public final String m18495b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strMo18494a = ((InterfaceC9884j) list.get(i10)).mo18494a();
            if (!TextUtils.isEmpty(strMo18494a)) {
                sb.append(strMo18494a);
                if (i10 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map m18496c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f19800c.entrySet()) {
            String strM18495b = m18495b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM18495b)) {
                map.put(entry.getKey(), strM18495b);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9885k) {
            return this.f19800c.equals(((C9885k) obj).f19800c);
        }
        return false;
    }

    public int hashCode() {
        return this.f19800c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f19800c + '}';
    }
}
