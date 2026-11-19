package p117r2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r2.g */
/* loaded from: classes2.dex */
public final class C4504g {

    /* renamed from: a */
    public final Map f5356a;

    /* renamed from: b */
    public final String f5357b;

    public C4504g(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f5357b = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f5356a = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m5871a() {
        String str = (String) this.f5356a.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* renamed from: b */
    public final String m5872b() {
        return (String) this.f5356a.get("realm");
    }

    /* renamed from: c */
    public final String m5873c() {
        return this.f5357b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4504g) {
            C4504g c4504g = (C4504g) obj;
            if (Intrinsics.areEqual(c4504g.f5357b, this.f5357b) && Intrinsics.areEqual(c4504g.f5356a, this.f5356a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f5357b.hashCode()) * 31) + this.f5356a.hashCode();
    }

    public String toString() {
        return this.f5357b + " authParams=" + this.f5356a;
    }
}
