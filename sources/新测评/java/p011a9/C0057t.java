package p011a9;

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

/* renamed from: a9.t */
/* loaded from: classes5.dex */
public final class C0057t {

    /* renamed from: e */
    public static final a f189e = new a(null);

    /* renamed from: f */
    public static final Pattern f190f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    public static final Pattern f191g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f192a;

    /* renamed from: b */
    public final String f193b;

    /* renamed from: c */
    public final String f194c;

    /* renamed from: d */
    public final String[] f195d;

    /* renamed from: a9.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0057t m278a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = C0057t.f190f.matcher(str);
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
            Matcher matcher2 = C0057t.f191g.matcher(str);
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
            return new C0057t(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        /* renamed from: b */
        public final C0057t m279b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m278a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C0057t(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m272d(C0057t c0057t, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return c0057t.m275c(charset);
    }

    /* renamed from: e */
    public static final C0057t m273e(String str) {
        return f189e.m278a(str);
    }

    /* renamed from: g */
    public static final C0057t m274g(String str) {
        return f189e.m279b(str);
    }

    /* renamed from: c */
    public final Charset m275c(Charset charset) {
        String strM276f = m276f("charset");
        if (strM276f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM276f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0057t) && Intrinsics.areEqual(((C0057t) obj).f192a, this.f192a);
    }

    /* renamed from: f */
    public final String m276f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, this.f195d.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!StringsKt.equals(this.f195d[i10], name, true)) {
            if (i10 == progressionLastElement) {
                return null;
            }
            i10 += 2;
        }
        return this.f195d[i10 + 1];
    }

    /* renamed from: h */
    public final String m277h() {
        return this.f193b;
    }

    public int hashCode() {
        return this.f192a.hashCode();
    }

    public String toString() {
        return this.f192a;
    }

    public C0057t(String str, String str2, String str3, String[] strArr) {
        this.f192a = str;
        this.f193b = str2;
        this.f194c = str3;
        this.f195d = strArr;
    }
}
