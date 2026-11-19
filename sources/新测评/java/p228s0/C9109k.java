package p228s0;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s0.k */
/* loaded from: classes3.dex */
public final class C9109k implements InterfaceC9107i {

    /* renamed from: c */
    public final Map f15765c;

    /* renamed from: d */
    public volatile Map f15766d;

    /* renamed from: s0.k$a */
    public static final class a {

        /* renamed from: d */
        public static final String f15767d;

        /* renamed from: e */
        public static final Map f15768e;

        /* renamed from: a */
        public boolean f15769a = true;

        /* renamed from: b */
        public Map f15770b = f15768e;

        /* renamed from: c */
        public boolean f15771c = true;

        static {
            String strM15406b = m15406b();
            f15767d = strM15406b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM15406b)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strM15406b)));
            }
            f15768e = Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public static String m15406b() {
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
        public C9109k m15407a() {
            this.f15769a = true;
            return new C9109k(this.f15770b);
        }
    }

    /* renamed from: s0.k$b */
    public static final class b implements InterfaceC9108j {

        /* renamed from: a */
        public final String f15772a;

        public b(String str) {
            this.f15772a = str;
        }

        @Override // p228s0.InterfaceC9108j
        /* renamed from: a */
        public String mo15403a() {
            return this.f15772a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f15772a.equals(((b) obj).f15772a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15772a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f15772a + "'}";
        }
    }

    public C9109k(Map map) {
        this.f15765c = Collections.unmodifiableMap(map);
    }

    @Override // p228s0.InterfaceC9107i
    /* renamed from: a */
    public Map mo15402a() {
        if (this.f15766d == null) {
            synchronized (this) {
                try {
                    if (this.f15766d == null) {
                        this.f15766d = Collections.unmodifiableMap(m15405c());
                    }
                } finally {
                }
            }
        }
        return this.f15766d;
    }

    /* renamed from: b */
    public final String m15404b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strMo15403a = ((InterfaceC9108j) list.get(i10)).mo15403a();
            if (!TextUtils.isEmpty(strMo15403a)) {
                sb.append(strMo15403a);
                if (i10 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Map m15405c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f15765c.entrySet()) {
            String strM15404b = m15404b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM15404b)) {
                map.put(entry.getKey(), strM15404b);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9109k) {
            return this.f15765c.equals(((C9109k) obj).f15765c);
        }
        return false;
    }

    public int hashCode() {
        return this.f15765c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f15765c + '}';
    }
}
