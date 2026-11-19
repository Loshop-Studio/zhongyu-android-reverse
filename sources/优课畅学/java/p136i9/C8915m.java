package p136i9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;
import p147j9.AbstractC9036f;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;
import p203o9.AbstractC9548c;
import p291w9.C10477c;

/* renamed from: i9.m */
/* loaded from: classes5.dex */
public final class C8915m {

    /* renamed from: k */
    public static final a f16753k = new a(null);

    /* renamed from: l */
    public static final Pattern f16754l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f16755m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n */
    public static final Pattern f16756n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o */
    public static final Pattern f16757o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f16758a;

    /* renamed from: b */
    public final String f16759b;

    /* renamed from: c */
    public final long f16760c;

    /* renamed from: d */
    public final String f16761d;

    /* renamed from: e */
    public final String f16762e;

    /* renamed from: f */
    public final boolean f16763f;

    /* renamed from: g */
    public final boolean f16764g;

    /* renamed from: h */
    public final boolean f16765h;

    /* renamed from: i */
    public final boolean f16766i;

    /* renamed from: j */
    public final String f16767j;

    /* renamed from: i9.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final int m15201a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* renamed from: b */
        public final boolean m15202b(String str, String str2) {
            if (AbstractC9133u.m16128b(str, str2)) {
                return true;
            }
            return AbstractC8687z.m14111z(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC9036f.m15728a(str);
        }

        /* renamed from: c */
        public final C8915m m15203c(C8925w url, String setCookie) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(setCookie, "setCookie");
            return m15204d(System.currentTimeMillis(), url, setCookie);
        }

        /* renamed from: d */
        public final C8915m m15204d(long j10, C8925w url, String setCookie) throws NumberFormatException {
            long j11;
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(setCookie, "setCookie");
            int iM15754j = AbstractC9038h.m15754j(setCookie, ';', 0, 0, 6, null);
            int iM15754j2 = AbstractC9038h.m15754j(setCookie, '=', 0, iM15754j, 2, null);
            C8915m c8915m = null;
            if (iM15754j2 == iM15754j) {
                return null;
            }
            String strM15742C = AbstractC9038h.m15742C(setCookie, 0, iM15754j2, 1, null);
            if (strM15742C.length() == 0 || AbstractC9038h.m15758n(strM15742C) != -1) {
                return null;
            }
            String strM15741B = AbstractC9038h.m15741B(setCookie, iM15754j2 + 1, iM15754j);
            if (AbstractC9038h.m15758n(strM15741B) != -1) {
                return null;
            }
            int i10 = iM15754j + 1;
            int length = setCookie.length();
            String strM15206f = null;
            String str = null;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jM15208h = -1;
            long jM15207g = 253402300799999L;
            while (i10 < length) {
                int iM15752h = AbstractC9038h.m15752h(setCookie, ';', i10, length);
                int iM15752h2 = AbstractC9038h.m15752h(setCookie, '=', i10, iM15752h);
                String strM15741B2 = AbstractC9038h.m15741B(setCookie, i10, iM15752h2);
                String strM15741B3 = iM15752h2 < iM15752h ? AbstractC9038h.m15741B(setCookie, iM15752h2 + 1, iM15752h) : "";
                C8915m c8915m2 = c8915m;
                if (AbstractC8687z.m14093A(strM15741B2, "expires", true)) {
                    try {
                        jM15207g = m15207g(strM15741B3, 0, strM15741B3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (AbstractC8687z.m14093A(strM15741B2, "max-age", true)) {
                    jM15208h = m15208h(strM15741B3);
                    z11 = true;
                } else if (AbstractC8687z.m14093A(strM15741B2, "domain", true)) {
                    strM15206f = m15206f(strM15741B3);
                    z13 = false;
                } else if (AbstractC8687z.m14093A(strM15741B2, "path", true)) {
                    str = strM15741B3;
                } else if (AbstractC8687z.m14093A(strM15741B2, "secure", true)) {
                    z12 = true;
                } else if (AbstractC8687z.m14093A(strM15741B2, "httponly", true)) {
                    z10 = true;
                } else if (AbstractC8687z.m14093A(strM15741B2, "samesite", true)) {
                    str2 = strM15741B3;
                }
                i10 = iM15752h + 1;
                c8915m = c8915m2;
            }
            C8915m c8915m3 = c8915m;
            if (jM15208h == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jM15208h != -1) {
                long j12 = j10 + (jM15208h <= 9223372036854775L ? jM15208h * 1000 : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jM15207g;
            }
            String strM15284h = url.m15284h();
            if (strM15206f == null) {
                strM15206f = strM15284h;
            } else if (!m15202b(strM15284h, strM15206f)) {
                return c8915m3;
            }
            if (strM15284h.length() != strM15206f.length() && C10477c.f20816b.m19603c().m19599c(strM15206f) == null) {
                return c8915m3;
            }
            String strSubstring = "/";
            if (str == null || !AbstractC8687z.m14105M(str, "/", false, 2, c8915m3)) {
                String strM15280c = url.m15280c();
                int iM13996k0 = AbstractC8661c0.m13996k0(strM15280c, '/', 0, false, 6, null);
                if (iM13996k0 != 0) {
                    strSubstring = strM15280c.substring(0, iM13996k0);
                    AbstractC9133u.m16132f(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new C8915m(strM15742C, strM15741B, j11, strM15206f, str, z12, z10, z11, z13, str2, null);
        }

        /* renamed from: e */
        public final List m15205e(C8925w url, C8924v headers) {
            AbstractC9133u.m16133g(url, "url");
            AbstractC9133u.m16133g(headers, "headers");
            List listM15266h = headers.m15266h("Set-Cookie");
            int size = listM15266h.size();
            List listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                C8915m c8915mM15203c = m15203c(url, (String) listM15266h.get(i10));
                if (c8915mM15203c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c8915mM15203c);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                AbstractC9133u.m16132f(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? AbstractC8809v.m14771n() : listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m15206f(String str) {
            if (AbstractC8687z.m14111z(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM15738k = AbstractC9036f.m15738k(AbstractC8661c0.m14010y0(str, "."));
            if (strM15738k != null) {
                return strM15738k;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m15207g(String str, int i10, int i11) throws NumberFormatException {
            int iM15201a = m15201a(str, i10, i11, false);
            Matcher matcher = C8915m.f16757o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iM13991f0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iM15201a < i11) {
                int iM15201a2 = m15201a(str, iM15201a + 1, i11, true);
                matcher.region(iM15201a, iM15201a2);
                if (i13 == -1 && matcher.usePattern(C8915m.f16757o).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC9133u.m16132f(strGroup, "group(...)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC9133u.m16132f(strGroup2, "group(...)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC9133u.m16132f(strGroup3, "group(...)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(C8915m.f16756n).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC9133u.m16132f(strGroup4, "group(...)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iM13991f0 == -1 && matcher.usePattern(C8915m.f16755m).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC9133u.m16132f(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    AbstractC9133u.m16132f(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
                    String strPattern = C8915m.f16755m.pattern();
                    AbstractC9133u.m16132f(strPattern, "pattern(...)");
                    iM13991f0 = AbstractC8661c0.m13991f0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(C8915m.f16754l).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC9133u.m16132f(strGroup6, "group(...)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iM15201a = m15201a(str, iM15201a2 + 1, i11, false);
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
            if (iM13991f0 == -1) {
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
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC9041k.f17264a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iM13991f0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m15208h(String str) throws NumberFormatException {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").m16181h(str)) {
                    return AbstractC8687z.m14105M(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C8915m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, AbstractC9126n abstractC9126n) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    /* renamed from: e */
    public final String m15198e() {
        return this.f16758a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8915m)) {
            return false;
        }
        C8915m c8915m = (C8915m) obj;
        return AbstractC9133u.m16128b(c8915m.f16758a, this.f16758a) && AbstractC9133u.m16128b(c8915m.f16759b, this.f16759b) && c8915m.f16760c == this.f16760c && AbstractC9133u.m16128b(c8915m.f16761d, this.f16761d) && AbstractC9133u.m16128b(c8915m.f16762e, this.f16762e) && c8915m.f16763f == this.f16763f && c8915m.f16764g == this.f16764g && c8915m.f16765h == this.f16765h && c8915m.f16766i == this.f16766i && AbstractC9133u.m16128b(c8915m.f16767j, this.f16767j);
    }

    /* renamed from: f */
    public final String m15199f(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16758a);
        sb.append('=');
        sb.append(this.f16759b);
        if (this.f16765h) {
            if (this.f16760c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC9548c.m17825b(new Date(this.f16760c)));
            }
        }
        if (!this.f16766i) {
            sb.append("; domain=");
            if (z10) {
                sb.append(".");
            }
            sb.append(this.f16761d);
        }
        sb.append("; path=");
        sb.append(this.f16762e);
        if (this.f16763f) {
            sb.append("; secure");
        }
        if (this.f16764g) {
            sb.append("; httponly");
        }
        if (this.f16767j != null) {
            sb.append("; samesite=");
            sb.append(this.f16767j);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: g */
    public final String m15200g() {
        return this.f16759b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f16758a.hashCode()) * 31) + this.f16759b.hashCode()) * 31) + Long.hashCode(this.f16760c)) * 31) + this.f16761d.hashCode()) * 31) + this.f16762e.hashCode()) * 31) + Boolean.hashCode(this.f16763f)) * 31) + Boolean.hashCode(this.f16764g)) * 31) + Boolean.hashCode(this.f16765h)) * 31) + Boolean.hashCode(this.f16766i)) * 31;
        String str = this.f16767j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return m15199f(false);
    }

    public C8915m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f16758a = str;
        this.f16759b = str2;
        this.f16760c = j10;
        this.f16761d = str3;
        this.f16762e = str4;
        this.f16763f = z10;
        this.f16764g = z11;
        this.f16765h = z12;
        this.f16766i = z13;
        this.f16767j = str5;
    }
}
