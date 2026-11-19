package p117r2;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.foundation.AbstractC0431c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p121s2.AbstractC4549a;
import p121s2.AbstractC4550b;
import p141x2.AbstractC4666c;

/* renamed from: r2.l */
/* loaded from: classes2.dex */
public final class C4509l {

    /* renamed from: a */
    public final String f5502a;

    /* renamed from: b */
    public final String f5503b;

    /* renamed from: c */
    public final long f5504c;

    /* renamed from: d */
    public final String f5505d;

    /* renamed from: e */
    public final String f5506e;

    /* renamed from: f */
    public final boolean f5507f;

    /* renamed from: g */
    public final boolean f5508g;

    /* renamed from: h */
    public final boolean f5509h;

    /* renamed from: i */
    public final boolean f5510i;

    /* renamed from: n */
    public static final a f5501n = new a(null);

    /* renamed from: j */
    public static final Pattern f5497j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f5498k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f5499l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f5500m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: r2.l$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m5906a(String str, int i4, int i5, boolean z3) {
            while (i4 < i5) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z3)) {
                    return i4;
                }
                i4++;
            }
            return i5;
        }

        /* renamed from: b */
        public final boolean m5907b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC4550b.m6224f(str);
        }

        /* renamed from: c */
        public final C4509l m5908c(C4517t url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return m5909d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r1
          0x00dc: PHI (r1v25 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p117r2.C4509l m5909d(long r26, p117r2.C4517t r28, java.lang.String r29) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4509l.a.m5909d(long, r2.t, java.lang.String):r2.l");
        }

        /* renamed from: e */
        public final List m5910e(C4517t url, C4516s headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listM5963f = headers.m5963f("Set-Cookie");
            int size = listM5963f.size();
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < size; i4++) {
                C4509l c4509lM5908c = m5908c(url, (String) listM5963f.get(i4));
                if (c4509lM5908c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c4509lM5908c);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m5911f(String str) {
            if (!(!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strM6197e = AbstractC4549a.m6197e(StringsKt__StringsKt.removePrefix(str, (CharSequence) "."));
            if (strM6197e != null) {
                return strM6197e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m5912g(String str, int i4, int i5) throws NumberFormatException {
            int iM5906a = m5906a(str, i4, i5, false);
            Matcher matcher = C4509l.f5500m.matcher(str);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int iIndexOf$default = -1;
            int i9 = -1;
            int i10 = -1;
            while (iM5906a < i5) {
                int iM5906a2 = m5906a(str, iM5906a + 1, i5, true);
                matcher.region(iM5906a, iM5906a2);
                if (i7 == -1 && matcher.usePattern(C4509l.f5500m).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i7 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i9 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i10 = Integer.parseInt(strGroup3);
                } else if (i8 == -1 && matcher.usePattern(C4509l.f5499l).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i8 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(C4509l.f5498k).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = C4509l.f5498k.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i6 == -1 && matcher.usePattern(C4509l.f5497j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup6);
                }
                iM5906a = m5906a(str, iM5906a2 + 1, i5, false);
            }
            if (70 <= i6 && 99 >= i6) {
                i6 += 1900;
            }
            if (i6 >= 0 && 69 >= i6) {
                i6 += 2000;
            }
            if (!(i6 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
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
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC4550b.f5706f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i8);
            gregorianCalendar.set(11, i7);
            gregorianCalendar.set(12, i9);
            gregorianCalendar.set(13, i10);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m5913h(String str) throws NumberFormatException {
            try {
                long j4 = Long.parseLong(str);
                if (j4 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j4;
            } catch (NumberFormatException e4) {
                if (new Regex("-?\\d+").matches(str)) {
                    return StringsKt__StringsJVMKt.startsWith$default(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e4;
            }
        }
    }

    public C4509l(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5502a = str;
        this.f5503b = str2;
        this.f5504c = j4;
        this.f5505d = str3;
        this.f5506e = str4;
        this.f5507f = z3;
        this.f5508g = z4;
        this.f5509h = z5;
        this.f5510i = z6;
    }

    /* renamed from: e */
    public final String m5903e() {
        return this.f5502a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4509l) {
            C4509l c4509l = (C4509l) obj;
            if (Intrinsics.areEqual(c4509l.f5502a, this.f5502a) && Intrinsics.areEqual(c4509l.f5503b, this.f5503b) && c4509l.f5504c == this.f5504c && Intrinsics.areEqual(c4509l.f5505d, this.f5505d) && Intrinsics.areEqual(c4509l.f5506e, this.f5506e) && c4509l.f5507f == this.f5507f && c4509l.f5508g == this.f5508g && c4509l.f5509h == this.f5509h && c4509l.f5510i == this.f5510i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m5904f(boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5502a);
        sb.append('=');
        sb.append(this.f5503b);
        if (this.f5509h) {
            if (this.f5504c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC4666c.m6564b(new Date(this.f5504c)));
            }
        }
        if (!this.f5510i) {
            sb.append("; domain=");
            if (z3) {
                sb.append(".");
            }
            sb.append(this.f5505d);
        }
        sb.append("; path=");
        sb.append(this.f5506e);
        if (this.f5507f) {
            sb.append("; secure");
        }
        if (this.f5508g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    /* renamed from: g */
    public final String m5905g() {
        return this.f5503b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f5502a.hashCode()) * 31) + this.f5503b.hashCode()) * 31) + AbstractC0321a.m137a(this.f5504c)) * 31) + this.f5505d.hashCode()) * 31) + this.f5506e.hashCode()) * 31) + AbstractC0431c.m162a(this.f5507f)) * 31) + AbstractC0431c.m162a(this.f5508g)) * 31) + AbstractC0431c.m162a(this.f5509h)) * 31) + AbstractC0431c.m162a(this.f5510i);
    }

    public String toString() {
        return m5904f(false);
    }

    public /* synthetic */ C4509l(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j4, str3, str4, z3, z4, z5, z6);
    }
}
