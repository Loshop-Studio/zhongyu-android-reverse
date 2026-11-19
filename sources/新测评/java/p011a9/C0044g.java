package p011a9;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9.g */
/* loaded from: classes5.dex */
public final class C0044g {

    /* renamed from: a */
    public final String f125a;

    /* renamed from: b */
    public final Map f126b;

    public C0044g(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f125a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f126b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m112a() {
        String str = (String) this.f126b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* renamed from: b */
    public final String m113b() {
        return (String) this.f126b.get("realm");
    }

    /* renamed from: c */
    public final String m114c() {
        return this.f125a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0044g)) {
            return false;
        }
        C0044g c0044g = (C0044g) obj;
        return Intrinsics.areEqual(c0044g.f125a, this.f125a) && Intrinsics.areEqual(c0044g.f126b, this.f126b);
    }

    public int hashCode() {
        return ((899 + this.f125a.hashCode()) * 31) + this.f126b.hashCode();
    }

    public String toString() {
        return this.f125a + " authParams=" + this.f126b;
    }
}
