package okhttp3;

import anet.channel.util.HttpConstant;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import com.xuexiang.xui.widget.picker.widget.utils.LunarCalendarUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C2730l;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2484j;
import p082e3.C2495u;
import p082e3.C2496v;

/* loaded from: classes.dex */
public final class Cookie {

    @NotNull
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @NotNull
    private final String name;

    @NotNull
    private final String path;
    private final boolean persistent;
    private final boolean secure;

    @NotNull
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        @NotNull
        public final Cookie build() {
            String str = this.name;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.value;
            Objects.requireNonNull(str2, "builder.value == null");
            long j4 = this.expiresAt;
            String str3 = this.domain;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new Cookie(str, str2, j4, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        @NotNull
        public final Builder domain(@NotNull String domain) {
            C2769l.m9241e(domain, "domain");
            return domain(domain, false);
        }

        @NotNull
        public final Builder expiresAt(long j4) {
            if (j4 <= 0) {
                j4 = Long.MIN_VALUE;
            }
            if (j4 > DatesKt.MAX_DATE) {
                j4 = 253402300799999L;
            }
            this.expiresAt = j4;
            this.persistent = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String domain) {
            C2769l.m9241e(domain, "domain");
            return domain(domain, true);
        }

        @NotNull
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            C2769l.m9241e(name, "name");
            if (!C2769l.m9237a(C2496v.m8367H0(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder path(@NotNull String path) {
            C2769l.m9241e(path, "path");
            if (!C2495u.m8340C(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        @NotNull
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String value) {
            C2769l.m9241e(value, "value");
            if (!C2769l.m9237a(C2496v.m8367H0(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }

        private final Builder domain(String str, boolean z3) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z3;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        private final int dateCharacterOffset(String str, int i4, int i5, boolean z3) {
            while (i4 < i5) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z3)) {
                    return i4;
                }
                i4++;
            }
            return i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (C2769l.m9237a(str, str2)) {
                return true;
            }
            return C2495u.m8342n(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (!(!C2495u.m8342n(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(C2496v.m8395i0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i4, int i5) throws NumberFormatException {
            int iDateCharacterOffset = dateCharacterOffset(str, i4, i5, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int iM8381U = -1;
            int i9 = -1;
            int i10 = -1;
            while (iDateCharacterOffset < i5) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i5, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i7 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    C2769l.m9240d(strGroup, "matcher.group(1)");
                    i7 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    C2769l.m9240d(strGroup2, "matcher.group(2)");
                    i9 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    C2769l.m9240d(strGroup3, "matcher.group(3)");
                    i10 = Integer.parseInt(strGroup3);
                } else if (i8 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    C2769l.m9240d(strGroup4, "matcher.group(1)");
                    i8 = Integer.parseInt(strGroup4);
                } else if (iM8381U == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    C2769l.m9240d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C2769l.m9240d(locale, "Locale.US");
                    Objects.requireNonNull(strGroup5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    C2769l.m9240d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    C2769l.m9240d(strPattern, "MONTH_PATTERN.pattern()");
                    iM8381U = C2496v.m8381U(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i6 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    C2769l.m9240d(strGroup6, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i5, false);
            }
            if (70 <= i6 && 99 >= i6) {
                i6 += LunarCalendarUtils.MIN_YEAR;
            }
            if (i6 >= 0 && 69 >= i6) {
                i6 += MessageHandler.WHAT_SMOOTH_SCROLL;
            }
            if (!(i6 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iM8381U != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i8 && 31 >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && 23 >= i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i9 >= 0 && 59 >= i9)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i10 >= 0 && 59 >= i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, iM8381U - 1);
            gregorianCalendar.set(5, i8);
            gregorianCalendar.set(11, i7);
            gregorianCalendar.set(12, i9);
            gregorianCalendar.set(13, i10);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) throws NumberFormatException {
            try {
                long j4 = Long.parseLong(str);
                if (j4 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j4;
            } catch (NumberFormatException e4) {
                if (new C2484j("-?\\d+").m8279c(str)) {
                    return C2495u.m8340C(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (C2769l.m9237a(strEncodedPath, str)) {
                return true;
            }
            return C2495u.m8340C(strEncodedPath, str, false, 2, null) && (C2495u.m8342n(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        @Nullable
        public final Cookie parse(@NotNull HttpUrl url, @NotNull String setCookie) {
            C2769l.m9241e(url, "url");
            C2769l.m9241e(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r1
          0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v11 long) binds: [B:45:0x00da, B:56:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.Cookie parse$okhttp(long r26, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r28, @org.jetbrains.annotations.NotNull java.lang.String r29) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        @NotNull
        public final List<Cookie> parseAll(@NotNull HttpUrl url, @NotNull Headers headers) {
            C2769l.m9241e(url, "url");
            C2769l.m9241e(headers, "headers");
            List<String> listValues = headers.values(HttpConstant.SET_COOKIE);
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < size; i4++) {
                Cookie cookie = parse(url, listValues.get(i4));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return C2730l.m9139f();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            C2769l.m9240d(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j4;
        this.domain = str3;
        this.path = str4;
        this.secure = z3;
        this.httpOnly = z4;
        this.persistent = z5;
        this.hostOnly = z6;
    }

    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return Companion.parse(httpUrl, str);
    }

    @NotNull
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @NotNull
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m10769deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m10770deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m10771deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m10772deprecated_httpOnly() {
        return this.httpOnly;
    }

    @NotNull
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m10773deprecated_name() {
        return this.name;
    }

    @NotNull
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m10774deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m10775deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m10776deprecated_secure() {
        return this.secure;
    }

    @NotNull
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m10777deprecated_value() {
        return this.value;
    }

    @NotNull
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (C2769l.m9237a(cookie.name, this.name) && C2769l.m9237a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && C2769l.m9237a(cookie.domain, this.domain) && C2769l.m9237a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + C2931a.m10001a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + C2932b.m10002a(this.secure)) * 31) + C2932b.m10002a(this.httpOnly)) * 31) + C2932b.m10002a(this.persistent)) * 31) + C2932b.m10002a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull HttpUrl url) {
        C2769l.m9241e(url, "url");
        if ((this.hostOnly ? C2769l.m9237a(url.host(), this.domain) : Companion.domainMatch(url.host(), this.domain)) && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    @NotNull
    public final String name() {
        return this.name;
    }

    @NotNull
    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z3) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        C2769l.m9240d(string, "toString()");
        return string;
    }

    @NotNull
    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, C2764g c2764g) {
        this(str, str2, j4, str3, str4, z3, z4, z5, z6);
    }
}
