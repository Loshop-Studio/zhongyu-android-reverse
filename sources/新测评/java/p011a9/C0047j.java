package p011a9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p028b9.AbstractC5067a;
import p028b9.AbstractC5070d;
import p103g9.AbstractC7602c;

/* renamed from: a9.j */
/* loaded from: classes5.dex */
public final class C0047j {

    /* renamed from: j */
    public static final a f128j = new a(null);

    /* renamed from: k */
    public static final Pattern f129k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    public static final Pattern f130l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    public static final Pattern f131m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final Pattern f132n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f133a;

    /* renamed from: b */
    public final String f134b;

    /* renamed from: c */
    public final long f135c;

    /* renamed from: d */
    public final String f136d;

    /* renamed from: e */
    public final String f137e;

    /* renamed from: f */
    public final boolean f138f;

    /* renamed from: g */
    public final boolean f139g;

    /* renamed from: h */
    public final boolean f140h;

    /* renamed from: i */
    public final boolean f141i;

    /* renamed from: a9.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m123a(String str, int i10, int i11, boolean z9) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z9)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* renamed from: b */
        public final boolean m124b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC5070d.m2644i(str);
        }

        /* renamed from: c */
        public final C0047j m125c(C0055r url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return m126d(System.currentTimeMillis(), url, setCookie);
        }

        /* renamed from: d */
        public final C0047j m126d(long j10, C0055r url, String setCookie) throws NumberFormatException {
            long j11;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iM2653r = AbstractC5070d.m2653r(setCookie, ';', 0, 0, 6, null);
            int iM2653r2 = AbstractC5070d.m2653r(setCookie, '=', 0, iM2653r, 2, null);
            C0047j c0047j = null;
            if (iM2653r2 == iM2653r) {
                return null;
            }
            String strM2633X = AbstractC5070d.m2633X(setCookie, 0, iM2653r2, 1, null);
            if (strM2633X.length() == 0 || AbstractC5070d.m2660y(strM2633X) != -1) {
                return null;
            }
            String strM2632W = AbstractC5070d.m2632W(setCookie, iM2653r2 + 1, iM2653r);
            if (AbstractC5070d.m2660y(strM2632W) != -1) {
                return null;
            }
            int i10 = iM2653r + 1;
            int length = setCookie.length();
            String strM128f = null;
            String str = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            long jM130h = -1;
            long jM129g = 253402300799999L;
            while (i10 < length) {
                int iM2651p = AbstractC5070d.m2651p(setCookie, ';', i10, length);
                int iM2651p2 = AbstractC5070d.m2651p(setCookie, '=', i10, iM2651p);
                String strM2632W2 = AbstractC5070d.m2632W(setCookie, i10, iM2651p2);
                String strM2632W3 = iM2651p2 < iM2651p ? AbstractC5070d.m2632W(setCookie, iM2651p2 + 1, iM2651p) : "";
                C0047j c0047j2 = c0047j;
                if (StringsKt.equals(strM2632W2, "expires", true)) {
                    try {
                        jM129g = m129g(strM2632W3, 0, strM2632W3.length());
                        z10 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.equals(strM2632W2, "max-age", true)) {
                    jM130h = m130h(strM2632W3);
                    z10 = true;
                } else if (StringsKt.equals(strM2632W2, "domain", true)) {
                    strM128f = m128f(strM2632W3);
                    z12 = false;
                } else if (StringsKt.equals(strM2632W2, "path", true)) {
                    str = strM2632W3;
                } else if (StringsKt.equals(strM2632W2, "secure", true)) {
                    z11 = true;
                } else if (StringsKt.equals(strM2632W2, "httponly", true)) {
                    z9 = true;
                }
                i10 = iM2651p + 1;
                c0047j = c0047j2;
            }
            C0047j c0047j3 = c0047j;
            if (jM130h == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jM130h != -1) {
                long j12 = j10 + (jM130h <= 9223372036854775L ? jM130h * 1000 : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jM129g;
            }
            String strM210i = url.m210i();
            if (strM128f == null) {
                strM128f = strM210i;
            } else if (!m124b(strM210i, strM128f)) {
                return c0047j3;
            }
            if (strM210i.length() != strM128f.length() && PublicSuffixDatabase.INSTANCE.m14619c().m14613c(strM128f) == null) {
                return c0047j3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.startsWith$default(str, "/", false, 2, (Object) c0047j3)) {
                String strM206d = url.m206d();
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strM206d, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strM206d.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new C0047j(strM2633X, strM2632W, j11, strM128f, str, z11, z9, z10, z12, null);
        }

        /* renamed from: e */
        public final List m127e(C0055r url, C0054q headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listM185g = headers.m185g("Set-Cookie");
            int size = listM185g.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                C0047j c0047jM125c = m125c(url, (String) listM185g.get(i10));
                if (c0047jM125c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0047jM125c);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m128f(String str) {
            if (StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM2609e = AbstractC5067a.m2609e(StringsKt.removePrefix(str, (CharSequence) "."));
            if (strM2609e != null) {
                return strM2609e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m129g(String str, int i10, int i11) throws NumberFormatException {
            int iM123a = m123a(str, i10, i11, false);
            Matcher matcher = C0047j.f132n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iIndexOf$default = -1;
            int i15 = -1;
            int i16 = -1;
            while (iM123a < i11) {
                int iM123a2 = m123a(str, iM123a + 1, i11, true);
                matcher.region(iM123a, iM123a2);
                if (i13 == -1 && matcher.usePattern(C0047j.f132n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(C0047j.f131m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(C0047j.f130l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = C0047j.f130l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i12 == -1 && matcher.usePattern(C0047j.f129k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iM123a = m123a(str, iM123a2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC5070d.f2638f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m130h(String str) throws NumberFormatException {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").matches(str)) {
                    return StringsKt.startsWith$default(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C0047j(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z9, z10, z11, z12);
    }

    /* renamed from: e */
    public final String m120e() {
        return this.f133a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0047j)) {
            return false;
        }
        C0047j c0047j = (C0047j) obj;
        return Intrinsics.areEqual(c0047j.f133a, this.f133a) && Intrinsics.areEqual(c0047j.f134b, this.f134b) && c0047j.f135c == this.f135c && Intrinsics.areEqual(c0047j.f136d, this.f136d) && Intrinsics.areEqual(c0047j.f137e, this.f137e) && c0047j.f138f == this.f138f && c0047j.f139g == this.f139g && c0047j.f140h == this.f140h && c0047j.f141i == this.f141i;
    }

    /* renamed from: f */
    public final String m121f(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f133a);
        sb.append('=');
        sb.append(this.f134b);
        if (this.f140h) {
            if (this.f135c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC7602c.m12491b(new Date(this.f135c)));
            }
        }
        if (!this.f141i) {
            sb.append("; domain=");
            if (z9) {
                sb.append(".");
            }
            sb.append(this.f136d);
        }
        sb.append("; path=");
        sb.append(this.f137e);
        if (this.f138f) {
            sb.append("; secure");
        }
        if (this.f139g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    /* renamed from: g */
    public final String m122g() {
        return this.f134b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f133a.hashCode()) * 31) + this.f134b.hashCode()) * 31) + Long.hashCode(this.f135c)) * 31) + this.f136d.hashCode()) * 31) + this.f137e.hashCode()) * 31) + Boolean.hashCode(this.f138f)) * 31) + Boolean.hashCode(this.f139g)) * 31) + Boolean.hashCode(this.f140h)) * 31) + Boolean.hashCode(this.f141i);
    }

    public String toString() {
        return m121f(false);
    }

    public C0047j(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f133a = str;
        this.f134b = str2;
        this.f135c = j10;
        this.f136d = str3;
        this.f137e = str4;
        this.f138f = z9;
        this.f139g = z10;
        this.f140h = z11;
        this.f141i = z12;
    }
}
