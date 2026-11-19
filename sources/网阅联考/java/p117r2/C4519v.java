package p117r2;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

/* renamed from: r2.v */
/* loaded from: classes2.dex */
public final class C4519v {

    /* renamed from: a */
    public final String f5559a;

    /* renamed from: b */
    public final String f5560b;

    /* renamed from: c */
    public final String f5561c;

    /* renamed from: d */
    public final String[] f5562d;

    /* renamed from: g */
    public static final a f5558g = new a(null);

    /* renamed from: e */
    public static final Pattern f5556e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    public static final Pattern f5557f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: r2.v$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4519v m6054a(String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = C4519v.f5556e.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + Typography.quote).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strGroup.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (strGroup2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strGroup2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C4519v.f5557f.matcher(toMediaType);
            int iEnd = matcher.end();
            while (iEnd < toMediaType.length()) {
                matcher2.region(iEnd, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = toMediaType.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(toMediaType);
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
                    } else if (StringsKt__StringsJVMKt.startsWith$default(strGroup4, "'", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C4519v(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: b */
        public final C4519v m6055b(String toMediaTypeOrNull) {
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return m6054a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public C4519v(String str, String str2, String str3, String[] strArr) {
        this.f5559a = str;
        this.f5560b = str2;
        this.f5561c = str3;
        this.f5562d = strArr;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m6049d(C4519v c4519v, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = null;
        }
        return c4519v.m6051c(charset);
    }

    /* renamed from: e */
    public static final C4519v m6050e(String str) {
        return f5558g.m6054a(str);
    }

    /* renamed from: c */
    public final Charset m6051c(Charset charset) {
        String strM6052f = m6052f("charset");
        if (strM6052f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM6052f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4519v) && Intrinsics.areEqual(((C4519v) obj).f5559a, this.f5559a);
    }

    /* renamed from: f */
    public final String m6052f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        IntProgression intProgressionStep = RangesKt___RangesKt.step(ArraysKt___ArraysKt.getIndices(this.f5562d), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step >= 0) {
            if (first > last) {
                return null;
            }
        } else if (first < last) {
            return null;
        }
        while (!StringsKt__StringsJVMKt.equals(this.f5562d[first], name, true)) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return this.f5562d[first + 1];
    }

    /* renamed from: g */
    public final String m6053g() {
        return this.f5560b;
    }

    public int hashCode() {
        return this.f5559a.hashCode();
    }

    public String toString() {
        return this.f5559a;
    }

    public /* synthetic */ C4519v(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
