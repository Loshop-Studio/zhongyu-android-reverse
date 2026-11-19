package p058f5;

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
import p065g5.AbstractC6422f;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;
import p102l5.AbstractC7349c;
import p158t5.C7731c;

/* renamed from: f5.m */
/* loaded from: classes4.dex */
public final class C6374m {

    /* renamed from: k */
    public static final a f7921k = new a(null);

    /* renamed from: l */
    public static final Pattern f7922l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f7923m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n */
    public static final Pattern f7924n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o */
    public static final Pattern f7925o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f7926a;

    /* renamed from: b */
    public final String f7927b;

    /* renamed from: c */
    public final long f7928c;

    /* renamed from: d */
    public final String f7929d;

    /* renamed from: e */
    public final String f7930e;

    /* renamed from: f */
    public final boolean f7931f;

    /* renamed from: g */
    public final boolean f7932g;

    /* renamed from: h */
    public final boolean f7933h;

    /* renamed from: i */
    public final boolean f7934i;

    /* renamed from: j */
    public final String f7935j;

    /* renamed from: f5.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m6740a(String str, int i6, int i7, boolean z6) {
            while (i6 < i7) {
                char cCharAt = str.charAt(i6);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z6)) {
                    return i6;
                }
                i6++;
            }
            return i7;
        }

        /* renamed from: b */
        public final boolean m6741b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC6422f.m6970a(str);
        }

        /* renamed from: c */
        public final C6374m m6742c(C6384w url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return m6743d(System.currentTimeMillis(), url, setCookie);
        }

        /* renamed from: d */
        public final C6374m m6743d(long j6, C6384w url, String setCookie) throws NumberFormatException {
            long j7;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iM6996j = AbstractC6424h.m6996j(setCookie, ';', 0, 0, 6, null);
            int iM6996j2 = AbstractC6424h.m6996j(setCookie, '=', 0, iM6996j, 2, null);
            C6374m c6374m = null;
            if (iM6996j2 == iM6996j) {
                return null;
            }
            String strM6984C = AbstractC6424h.m6984C(setCookie, 0, iM6996j2, 1, null);
            if (strM6984C.length() == 0 || AbstractC6424h.m7000n(strM6984C) != -1) {
                return null;
            }
            String strM6983B = AbstractC6424h.m6983B(setCookie, iM6996j2 + 1, iM6996j);
            if (AbstractC6424h.m7000n(strM6983B) != -1) {
                return null;
            }
            int i6 = iM6996j + 1;
            int length = setCookie.length();
            String strM6745f = null;
            String str = null;
            String str2 = null;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = true;
            long jM6747h = -1;
            long jM6746g = 253402300799999L;
            while (i6 < length) {
                int iM6994h = AbstractC6424h.m6994h(setCookie, ';', i6, length);
                int iM6994h2 = AbstractC6424h.m6994h(setCookie, '=', i6, iM6994h);
                String strM6983B2 = AbstractC6424h.m6983B(setCookie, i6, iM6994h2);
                String strM6983B3 = iM6994h2 < iM6994h ? AbstractC6424h.m6983B(setCookie, iM6994h2 + 1, iM6994h) : "";
                C6374m c6374m2 = c6374m;
                if (StringsKt.equals(strM6983B2, "expires", true)) {
                    try {
                        jM6746g = m6746g(strM6983B3, 0, strM6983B3.length());
                        z7 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.equals(strM6983B2, "max-age", true)) {
                    jM6747h = m6747h(strM6983B3);
                    z7 = true;
                } else if (StringsKt.equals(strM6983B2, "domain", true)) {
                    strM6745f = m6745f(strM6983B3);
                    z9 = false;
                } else if (StringsKt.equals(strM6983B2, "path", true)) {
                    str = strM6983B3;
                } else if (StringsKt.equals(strM6983B2, "secure", true)) {
                    z8 = true;
                } else if (StringsKt.equals(strM6983B2, "httponly", true)) {
                    z6 = true;
                } else if (StringsKt.equals(strM6983B2, "samesite", true)) {
                    str2 = strM6983B3;
                }
                i6 = iM6994h + 1;
                c6374m = c6374m2;
            }
            C6374m c6374m3 = c6374m;
            if (jM6747h == Long.MIN_VALUE) {
                j7 = Long.MIN_VALUE;
            } else if (jM6747h != -1) {
                long j8 = j6 + (jM6747h <= 9223372036854775L ? jM6747h * 1000 : Long.MAX_VALUE);
                j7 = (j8 < j6 || j8 > 253402300799999L) ? 253402300799999L : j8;
            } else {
                j7 = jM6746g;
            }
            String strM6823h = url.m6823h();
            if (strM6745f == null) {
                strM6745f = strM6823h;
            } else if (!m6741b(strM6823h, strM6745f)) {
                return c6374m3;
            }
            if (strM6823h.length() != strM6745f.length() && C7731c.f10217b.m9225c().m9221c(strM6745f) == null) {
                return c6374m3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.startsWith$default(str, "/", false, 2, (Object) c6374m3)) {
                String strM6819c = url.m6819c();
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strM6819c, '/', 0, false, 6, (Object) null);
                if (iLastIndexOf$default != 0) {
                    strSubstring = strM6819c.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new C6374m(strM6984C, strM6983B, j7, strM6745f, str, z8, z6, z7, z9, str2, null);
        }

        /* renamed from: e */
        public final List m6744e(C6384w url, C6383v headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listM6805h = headers.m6805h("Set-Cookie");
            int size = listM6805h.size();
            List listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i6 = 0; i6 < size; i6++) {
                C6374m c6374mM6742c = m6742c(url, (String) listM6805h.get(i6));
                if (c6374mM6742c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c6374mM6742c);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? CollectionsKt.emptyList() : listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m6745f(String str) {
            if (StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM6980k = AbstractC6422f.m6980k(StringsKt.removePrefix(str, (CharSequence) "."));
            if (strM6980k != null) {
                return strM6980k;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m6746g(String str, int i6, int i7) throws NumberFormatException {
            int iM6740a = m6740a(str, i6, i7, false);
            Matcher matcher = C6374m.f7925o.matcher(str);
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int iIndexOf$default = -1;
            int i11 = -1;
            int i12 = -1;
            while (iM6740a < i7) {
                int iM6740a2 = m6740a(str, iM6740a + 1, i7, true);
                matcher.region(iM6740a, iM6740a2);
                if (i9 == -1 && matcher.usePattern(C6374m.f7925o).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                    i9 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
                    i11 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "group(...)");
                    i12 = Integer.parseInt(strGroup3);
                } else if (i10 == -1 && matcher.usePattern(C6374m.f7924n).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "group(...)");
                    i10 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(C6374m.f7923m).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String strPattern = C6374m.f7923m.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i8 == -1 && matcher.usePattern(C6374m.f7922l).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "group(...)");
                    i8 = Integer.parseInt(strGroup6);
                }
                iM6740a = m6740a(str, iM6740a2 + 1, i7, false);
            }
            if (70 <= i8 && i8 < 100) {
                i8 += 1900;
            }
            if (i8 >= 0 && i8 < 70) {
                i8 += 2000;
            }
            if (i8 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i10 || i10 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i9 < 0 || i9 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC6427k.f8099a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i8);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i10);
            gregorianCalendar.set(11, i9);
            gregorianCalendar.set(12, i11);
            gregorianCalendar.set(13, i12);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m6747h(String str) throws NumberFormatException {
            try {
                long j6 = Long.parseLong(str);
                if (j6 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j6;
            } catch (NumberFormatException e6) {
                if (new Regex("-?\\d+").matches(str)) {
                    return StringsKt.startsWith$default(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e6;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C6374m(String str, String str2, long j6, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j6, str3, str4, z6, z7, z8, z9, str5);
    }

    /* renamed from: e */
    public final String m6737e() {
        return this.f7926a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6374m)) {
            return false;
        }
        C6374m c6374m = (C6374m) obj;
        return Intrinsics.areEqual(c6374m.f7926a, this.f7926a) && Intrinsics.areEqual(c6374m.f7927b, this.f7927b) && c6374m.f7928c == this.f7928c && Intrinsics.areEqual(c6374m.f7929d, this.f7929d) && Intrinsics.areEqual(c6374m.f7930e, this.f7930e) && c6374m.f7931f == this.f7931f && c6374m.f7932g == this.f7932g && c6374m.f7933h == this.f7933h && c6374m.f7934i == this.f7934i && Intrinsics.areEqual(c6374m.f7935j, this.f7935j);
    }

    /* renamed from: f */
    public final String m6738f(boolean z6) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7926a);
        sb.append('=');
        sb.append(this.f7927b);
        if (this.f7933h) {
            if (this.f7928c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC7349c.m8320b(new Date(this.f7928c)));
            }
        }
        if (!this.f7934i) {
            sb.append("; domain=");
            if (z6) {
                sb.append(".");
            }
            sb.append(this.f7929d);
        }
        sb.append("; path=");
        sb.append(this.f7930e);
        if (this.f7931f) {
            sb.append("; secure");
        }
        if (this.f7932g) {
            sb.append("; httponly");
        }
        if (this.f7935j != null) {
            sb.append("; samesite=");
            sb.append(this.f7935j);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: g */
    public final String m6739g() {
        return this.f7927b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f7926a.hashCode()) * 31) + this.f7927b.hashCode()) * 31) + Long.hashCode(this.f7928c)) * 31) + this.f7929d.hashCode()) * 31) + this.f7930e.hashCode()) * 31) + Boolean.hashCode(this.f7931f)) * 31) + Boolean.hashCode(this.f7932g)) * 31) + Boolean.hashCode(this.f7933h)) * 31) + Boolean.hashCode(this.f7934i)) * 31;
        String str = this.f7935j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return m6738f(false);
    }

    public C6374m(String str, String str2, long j6, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9, String str5) {
        this.f7926a = str;
        this.f7927b = str2;
        this.f7928c = j6;
        this.f7929d = str3;
        this.f7930e = str4;
        this.f7931f = z6;
        this.f7932g = z7;
        this.f7933h = z8;
        this.f7934i = z9;
        this.f7935j = str5;
    }
}
