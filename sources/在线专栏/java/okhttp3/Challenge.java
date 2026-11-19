package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C2716c0;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Challenge {

    @NotNull
    private final Map<String, String> authParams;

    @NotNull
    private final String scheme;

    public Challenge(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String lowerCase;
        C2769l.m9241e(scheme, "scheme");
        C2769l.m9241e(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                C2769l.m9240d(US, "US");
                lowerCase = key.toLowerCase(US);
                C2769l.m9240d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C2769l.m9240d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @NotNull
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m10761deprecated_authParams() {
        return this.authParams;
    }

    @NotNull
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m10762deprecated_charset() {
        return charset();
    }

    @Nullable
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m10763deprecated_realm() {
        return realm();
    }

    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m10764deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @NotNull
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                C2769l.m9240d(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        C2769l.m9240d(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (C2769l.m9237a(challenge.scheme, this.scheme) && C2769l.m9237a(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        C2769l.m9241e(charset, "charset");
        Map mapM9060j = C2716c0.m9060j(this.authParams);
        String strName = charset.name();
        C2769l.m9240d(strName, "charset.name()");
        mapM9060j.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mapM9060j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(@NotNull String scheme, @NotNull String realm) {
        C2769l.m9241e(scheme, "scheme");
        C2769l.m9241e(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        C2769l.m9240d(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
