package p194o0;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o0.j */
/* loaded from: classes3.dex */
public final class C9143j implements InterfaceC9141h {

    /* renamed from: c */
    public final Map f15405c;

    /* renamed from: d */
    public volatile Map f15406d;

    /* renamed from: o0.j$a */
    public static final class a {

        /* renamed from: d */
        public static final String f15407d;

        /* renamed from: e */
        public static final Map f15408e;

        /* renamed from: a */
        public boolean f15409a = true;

        /* renamed from: b */
        public Map f15410b = f15408e;

        /* renamed from: c */
        public boolean f15411c = true;

        static {
            String strM14693b = m14693b();
            f15407d = strM14693b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM14693b)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strM14693b)));
            }
            f15408e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m14693b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = property.charAt(i9);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C9143j m14694a() {
            this.f15409a = true;
            return new C9143j(this.f15410b);
        }
    }

    /* renamed from: o0.j$b */
    public static final class b implements InterfaceC9142i {

        /* renamed from: a */
        public final String f15412a;

        public b(String str) {
            this.f15412a = str;
        }

        @Override // p194o0.InterfaceC9142i
        /* renamed from: a */
        public String mo14690a() {
            return this.f15412a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f15412a.equals(((b) obj).f15412a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15412a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f15412a + "'}";
        }
    }

    public C9143j(Map map) {
        this.f15405c = Collections.unmodifiableMap(map);
    }

    @Override // p194o0.InterfaceC9141h
    /* renamed from: a */
    public Map mo14689a() {
        if (this.f15406d == null) {
            synchronized (this) {
                try {
                    if (this.f15406d == null) {
                        this.f15406d = Collections.unmodifiableMap(m14692c());
                    }
                } finally {
                }
            }
        }
        return this.f15406d;
    }

    /* renamed from: b */
    public final String m14691b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            String strMo14690a = ((InterfaceC9142i) list.get(i9)).mo14690a();
            if (!TextUtils.isEmpty(strMo14690a)) {
                sb.append(strMo14690a);
                if (i9 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map m14692c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f15405c.entrySet()) {
            String strM14691b = m14691b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM14691b)) {
                map.put(entry.getKey(), strM14691b);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9143j) {
            return this.f15405c.equals(((C9143j) obj).f15405c);
        }
        return false;
    }

    public int hashCode() {
        return this.f15405c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f15405c + '}';
    }
}
