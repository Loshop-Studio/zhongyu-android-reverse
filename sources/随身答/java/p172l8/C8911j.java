package p172l8;

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
import p182m8.AbstractC9042a;
import p182m8.AbstractC9045d;
import p236r8.AbstractC9441c;

/* renamed from: l8.j */
/* loaded from: classes5.dex */
public final class C8911j {

    /* renamed from: j */
    public static final a f14756j = new a(null);

    /* renamed from: k */
    public static final Pattern f14757k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    public static final Pattern f14758l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    public static final Pattern f14759m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final Pattern f14760n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f14761a;

    /* renamed from: b */
    public final String f14762b;

    /* renamed from: c */
    public final long f14763c;

    /* renamed from: d */
    public final String f14764d;

    /* renamed from: e */
    public final String f14765e;

    /* renamed from: f */
    public final boolean f14766f;

    /* renamed from: g */
    public final boolean f14767g;

    /* renamed from: h */
    public final boolean f14768h;

    /* renamed from: i */
    public final boolean f14769i;

    /* renamed from: l8.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m13880a(String str, int i9, int i10, boolean z9) {
            while (i9 < i10) {
                char cCharAt = str.charAt(i9);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z9)) {
                    return i9;
                }
                i9++;
            }
            return i10;
        }

        /* renamed from: b */
        public final boolean m13881b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC9045d.m14493i(str);
        }

        /* renamed from: c */
        public final C8911j m13882c(C8919r url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return m13883d(System.currentTimeMillis(), url, setCookie);
        }

        /* renamed from: d */
        public final C8911j m13883d(long j9, C8919r url, String setCookie) throws NumberFormatException {
            long j10;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iM14502r = AbstractC9045d.m14502r(setCookie, ';', 0, 0, 6, null);
            int iM14502r2 = AbstractC9045d.m14502r(setCookie, '=', 0, iM14502r, 2, null);
            C8911j c8911j = null;
            if (iM14502r2 == iM14502r) {
                return null;
            }
            String strM14482X = AbstractC9045d.m14482X(setCookie, 0, iM14502r2, 1, null);
            if (strM14482X.length() == 0 || AbstractC9045d.m14509y(strM14482X) != -1) {
                return null;
            }
            String strM14481W = AbstractC9045d.m14481W(setCookie, iM14502r2 + 1, iM14502r);
            if (AbstractC9045d.m14509y(strM14481W) != -1) {
                return null;
            }
            int i9 = iM14502r + 1;
            int length = setCookie.length();
            String strM13885f = null;
            String str = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            long jM13887h = -1;
            long jM13886g = 253402300799999L;
            while (i9 < length) {
                int iM14500p = AbstractC9045d.m14500p(setCookie, ';', i9, length);
                int iM14500p2 = AbstractC9045d.m14500p(setCookie, '=', i9, iM14500p);
                String strM14481W2 = AbstractC9045d.m14481W(setCookie, i9, iM14500p2);
                String strM14481W3 = iM14500p2 < iM14500p ? AbstractC9045d.m14481W(setCookie, iM14500p2 + 1, iM14500p) : "";
                C8911j c8911j2 = c8911j;
                if (StringsKt.equals(strM14481W2, "expires", true)) {
                    try {
                        jM13886g = m13886g(strM14481W3, 0, strM14481W3.length());
                        z10 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.equals(strM14481W2, "max-age", true)) {
                    jM13887h = m13887h(strM14481W3);
                    z10 = true;
                } else if (StringsKt.equals(strM14481W2, "domain", true)) {
                    strM13885f = m13885f(strM14481W3);
                    z12 = false;
                } else if (StringsKt.equals(strM14481W2, "path", true)) {
                    str = strM14481W3;
                } else if (StringsKt.equals(strM14481W2, "secure", true)) {
                    z11 = true;
                } else if (StringsKt.equals(strM14481W2, "httponly", true)) {
                    z9 = true;
                }
                i9 = iM14500p + 1;
                c8911j = c8911j2;
            }
            C8911j c8911j3 = c8911j;
            if (jM13887h == Long.MIN_VALUE) {
                j10 = Long.MIN_VALUE;
            } else if (jM13887h != -1) {
                long j11 = j9 + (jM13887h <= 9223372036854775L ? jM13887h * 1000 : Long.MAX_VALUE);
                j10 = (j11 < j9 || j11 > 253402300799999L) ? 253402300799999L : j11;
            } else {
                j10 = jM13886g;
            }
            String strM13966i = url.m13966i();
            if (strM13885f == null) {
                strM13885f = strM13966i;
            } else if (!m13881b(strM13966i, strM13885f)) {
                return c8911j3;
            }
            if (strM13966i.length() != strM13885f.length() && PublicSuffixDatabase.INSTANCE.m15054c().m15048c(strM13885f) == null) {
                return c8911j3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.startsWith$default(str, "/", false, 2, (Object) c8911j3)) {
                String strM13962d = url.m13962d();
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strM13962d, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strM13962d.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new C8911j(strM14482X, strM14481W, j10, strM13885f, str, z11, z9, z10, z12, null);
        }

        /* renamed from: e */
        public final List m13884e(C8919r url, C8918q headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listM13941g = headers.m13941g("Set-Cookie");
            int size = listM13941g.size();
            ArrayList arrayList = null;
            for (int i9 = 0; i9 < size; i9++) {
                C8911j c8911jM13882c = m13882c(url, (String) listM13941g.get(i9));
                if (c8911jM13882c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c8911jM13882c);
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
        public final String m13885f(String str) {
            if (StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM14458e = AbstractC9042a.m14458e(StringsKt.removePrefix(str, (CharSequence) "."));
            if (strM14458e != null) {
                return strM14458e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m13886g(String str, int i9, int i10) throws NumberFormatException {
            int iM13880a = m13880a(str, i9, i10, false);
            Matcher matcher = C8911j.f14760n.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iIndexOf$default = -1;
            int i14 = -1;
            int i15 = -1;
            while (iM13880a < i10) {
                int iM13880a2 = m13880a(str, iM13880a + 1, i10, true);
                matcher.region(iM13880a, iM13880a2);
                if (i12 == -1 && matcher.usePattern(C8911j.f14760n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(C8911j.f14759m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(C8911j.f14758l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = C8911j.f14758l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i11 == -1 && matcher.usePattern(C8911j.f14757k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
                iM13880a = m13880a(str, iM13880a2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i13 || i13 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC9045d.f15229f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m13887h(String str) throws NumberFormatException {
            try {
                long j9 = Long.parseLong(str);
                if (j9 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j9;
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

    public /* synthetic */ C8911j(String str, String str2, long j9, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j9, str3, str4, z9, z10, z11, z12);
    }

    /* renamed from: e */
    public final String m13877e() {
        return this.f14761a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8911j)) {
            return false;
        }
        C8911j c8911j = (C8911j) obj;
        return Intrinsics.areEqual(c8911j.f14761a, this.f14761a) && Intrinsics.areEqual(c8911j.f14762b, this.f14762b) && c8911j.f14763c == this.f14763c && Intrinsics.areEqual(c8911j.f14764d, this.f14764d) && Intrinsics.areEqual(c8911j.f14765e, this.f14765e) && c8911j.f14766f == this.f14766f && c8911j.f14767g == this.f14767g && c8911j.f14768h == this.f14768h && c8911j.f14769i == this.f14769i;
    }

    /* renamed from: f */
    public final String m13878f(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14761a);
        sb.append('=');
        sb.append(this.f14762b);
        if (this.f14768h) {
            if (this.f14763c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC9441c.m15578b(new Date(this.f14763c)));
            }
        }
        if (!this.f14769i) {
            sb.append("; domain=");
            if (z9) {
                sb.append(".");
            }
            sb.append(this.f14764d);
        }
        sb.append("; path=");
        sb.append(this.f14765e);
        if (this.f14766f) {
            sb.append("; secure");
        }
        if (this.f14767g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    /* renamed from: g */
    public final String m13879g() {
        return this.f14762b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f14761a.hashCode()) * 31) + this.f14762b.hashCode()) * 31) + Long.hashCode(this.f14763c)) * 31) + this.f14764d.hashCode()) * 31) + this.f14765e.hashCode()) * 31) + Boolean.hashCode(this.f14766f)) * 31) + Boolean.hashCode(this.f14767g)) * 31) + Boolean.hashCode(this.f14768h)) * 31) + Boolean.hashCode(this.f14769i);
    }

    public String toString() {
        return m13878f(false);
    }

    public C8911j(String str, String str2, long j9, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f14761a = str;
        this.f14762b = str2;
        this.f14763c = j9;
        this.f14764d = str3;
        this.f14765e = str4;
        this.f14766f = z9;
        this.f14767g = z10;
        this.f14768h = z11;
        this.f14769i = z12;
    }
}
