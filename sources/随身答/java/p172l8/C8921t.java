package p172l8;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: l8.t */
/* loaded from: classes5.dex */
public final class C8921t {

    /* renamed from: e */
    public static final a f14817e = new a(null);

    /* renamed from: f */
    public static final Pattern f14818f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    public static final Pattern f14819g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f14820a;

    /* renamed from: b */
    public final String f14821b;

    /* renamed from: c */
    public final String f14822c;

    /* renamed from: d */
    public final String[] f14823d;

    /* renamed from: l8.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8921t m14034a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = C8921t.f14818f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + Typography.quote).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C8921t.f14819g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(Typography.quote);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.startsWith$default(strGroup4, "'", false, 2, (Object) null) && StringsKt.endsWith$default(strGroup4, "'", false, 2, (Object) null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new C8921t(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        /* renamed from: b */
        public final C8921t m14035b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m14034a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C8921t(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m14028d(C8921t c8921t, Charset charset, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = null;
        }
        return c8921t.m14031c(charset);
    }

    /* renamed from: e */
    public static final C8921t m14029e(String str) {
        return f14817e.m14034a(str);
    }

    /* renamed from: g */
    public static final C8921t m14030g(String str) {
        return f14817e.m14035b(str);
    }

    /* renamed from: c */
    public final Charset m14031c(Charset charset) {
        String strM14032f = m14032f("charset");
        if (strM14032f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM14032f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8921t) && Intrinsics.areEqual(((C8921t) obj).f14820a, this.f14820a);
    }

    /* renamed from: f */
    public final String m14032f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i9 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, this.f14823d.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!StringsKt.equals(this.f14823d[i9], name, true)) {
            if (i9 == progressionLastElement) {
                return null;
            }
            i9 += 2;
        }
        return this.f14823d[i9 + 1];
    }

    /* renamed from: h */
    public final String m14033h() {
        return this.f14821b;
    }

    public int hashCode() {
        return this.f14820a.hashCode();
    }

    public String toString() {
        return this.f14820a;
    }

    public C8921t(String str, String str2, String str3, String[] strArr) {
        this.f14820a = str;
        this.f14821b = str2;
        this.f14822c = str3;
        this.f14823d = strArr;
    }
}
