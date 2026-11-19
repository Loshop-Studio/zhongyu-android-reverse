package p136i9;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.C8660c;

/* renamed from: i9.i */
/* loaded from: classes5.dex */
public final class C8911i {

    /* renamed from: a */
    public final String f16741a;

    /* renamed from: b */
    public final Map f16742b;

    public C8911i(String scheme, Map authParams) {
        String lowerCase;
        AbstractC9133u.m16133g(scheme, "scheme");
        AbstractC9133u.m16133g(authParams, "authParams");
        this.f16741a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC9133u.m16132f(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC9133u.m16132f(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f16742b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m15188a() {
        String str = (String) this.f16742b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC9133u.m16132f(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return C8660c.f16211g;
    }

    /* renamed from: b */
    public final String m15189b() {
        return (String) this.f16742b.get("realm");
    }

    /* renamed from: c */
    public final String m15190c() {
        return this.f16741a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8911i)) {
            return false;
        }
        C8911i c8911i = (C8911i) obj;
        return AbstractC9133u.m16128b(c8911i.f16741a, this.f16741a) && AbstractC9133u.m16128b(c8911i.f16742b, this.f16742b);
    }

    public int hashCode() {
        return ((899 + this.f16741a.hashCode()) * 31) + this.f16742b.hashCode();
    }

    public String toString() {
        return this.f16741a + " authParams=" + this.f16742b;
    }
}
