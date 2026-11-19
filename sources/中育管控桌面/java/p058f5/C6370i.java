package p058f5;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: f5.i */
/* loaded from: classes4.dex */
public final class C6370i {

    /* renamed from: a */
    public final String f7909a;

    /* renamed from: b */
    public final Map f7910b;

    public C6370i(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f7909a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f7910b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m6727a() {
        String str = (String) this.f7910b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return Charsets.ISO_8859_1;
    }

    /* renamed from: b */
    public final String m6728b() {
        return (String) this.f7910b.get("realm");
    }

    /* renamed from: c */
    public final String m6729c() {
        return this.f7909a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6370i)) {
            return false;
        }
        C6370i c6370i = (C6370i) obj;
        return Intrinsics.areEqual(c6370i.f7909a, this.f7909a) && Intrinsics.areEqual(c6370i.f7910b, this.f7910b);
    }

    public int hashCode() {
        return ((899 + this.f7909a.hashCode()) * 31) + this.f7910b.hashCode();
    }

    public String toString() {
        return this.f7909a + " authParams=" + this.f7910b;
    }
}
