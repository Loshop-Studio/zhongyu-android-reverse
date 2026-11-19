package p172l8;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l8.g */
/* loaded from: classes5.dex */
public final class C8908g {

    /* renamed from: a */
    public final String f14753a;

    /* renamed from: b */
    public final Map f14754b;

    public C8908g(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f14753a = scheme;
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
        this.f14754b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m13869a() {
        String str = (String) this.f14754b.get("charset");
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
    public final String m13870b() {
        return (String) this.f14754b.get("realm");
    }

    /* renamed from: c */
    public final String m13871c() {
        return this.f14753a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8908g)) {
            return false;
        }
        C8908g c8908g = (C8908g) obj;
        return Intrinsics.areEqual(c8908g.f14753a, this.f14753a) && Intrinsics.areEqual(c8908g.f14754b, this.f14754b);
    }

    public int hashCode() {
        return ((899 + this.f14753a.hashCode()) * 31) + this.f14754b.hashCode();
    }

    public String toString() {
        return this.f14753a + " authParams=" + this.f14754b;
    }
}
