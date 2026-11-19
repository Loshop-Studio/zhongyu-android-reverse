package je;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: je.g */
/* loaded from: classes6.dex */
public final class C9727g {

    /* renamed from: a */
    public final String f22706a;

    /* renamed from: b */
    public final Map f22707b;

    public C9727g(String scheme, Map authParams) {
        String lowerCase;
        AbstractC9979u.m20294g(scheme, "scheme");
        AbstractC9979u.m20294g(authParams, "authParams");
        this.f22706a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC9979u.m20293f(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC9979u.m20293f(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f22707b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m19320a() {
        String str = (String) this.f22707b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC9979u.m20293f(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        AbstractC9979u.m20293f(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* renamed from: b */
    public final String m19321b() {
        return (String) this.f22707b.get("realm");
    }

    /* renamed from: c */
    public final String m19322c() {
        return this.f22706a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9727g)) {
            return false;
        }
        C9727g c9727g = (C9727g) obj;
        return AbstractC9979u.m20289b(c9727g.f22706a, this.f22706a) && AbstractC9979u.m20289b(c9727g.f22707b, this.f22707b);
    }

    public int hashCode() {
        return ((899 + this.f22706a.hashCode()) * 31) + this.f22707b.hashCode();
    }

    public String toString() {
        return this.f22706a + " authParams=" + this.f22707b;
    }
}
