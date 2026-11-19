package p058f5;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: f5.y */
/* loaded from: classes4.dex */
public final class C6386y {

    /* renamed from: e */
    public static final a f7983e = new a(null);

    /* renamed from: f */
    public static final Regex f7984f = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    public static final Regex f7985g = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f7986a;

    /* renamed from: b */
    public final String f7987b;

    /* renamed from: c */
    public final String f7988c;

    /* renamed from: d */
    public final String[] f7989d;

    /* renamed from: f5.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6386y m6881a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            MatchResult matchResultMatchAt = C6386y.f7984f.matchAt(str, 0);
            if (matchResultMatchAt == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + Typography.quote);
            }
            String str2 = matchResultMatchAt.getGroupValues().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = matchResultMatchAt.getGroupValues().get(2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int last = matchResultMatchAt.getRange().getLast();
            while (true) {
                int i6 = last + 1;
                if (i6 >= str.length()) {
                    return new C6386y(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                MatchResult matchResultMatchAt2 = C6386y.f7985g.matchAt(str, i6);
                if (matchResultMatchAt2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i6);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(Typography.quote);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                MatchGroup matchGroup = matchResultMatchAt2.getGroups().get(1);
                String value = matchGroup != null ? matchGroup.getValue() : null;
                if (value == null) {
                    last = matchResultMatchAt2.getRange().getLast();
                } else {
                    MatchGroup matchGroup2 = matchResultMatchAt2.getGroups().get(2);
                    String value2 = matchGroup2 != null ? matchGroup2.getValue() : null;
                    if (value2 == null) {
                        MatchGroup matchGroup3 = matchResultMatchAt2.getGroups().get(3);
                        Intrinsics.checkNotNull(matchGroup3);
                        value2 = matchGroup3.getValue();
                    } else if (StringsKt.startsWith$default((CharSequence) value2, '\'', false, 2, (Object) null) && StringsKt.endsWith$default((CharSequence) value2, '\'', false, 2, (Object) null) && value2.length() > 2) {
                        value2 = value2.substring(1, value2.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(value2, "substring(...)");
                    }
                    arrayList.add(value);
                    arrayList.add(value2);
                    last = matchResultMatchAt2.getRange().getLast();
                }
            }
        }

        /* renamed from: b */
        public final C6386y m6882b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m6881a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public C6386y(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.f7986a = mediaType;
        this.f7987b = type;
        this.f7988c = subtype;
        this.f7989d = parameterNamesAndValues;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m6875d(C6386y c6386y, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = null;
        }
        return c6386y.m6878c(charset);
    }

    /* renamed from: e */
    public static final C6386y m6876e(String str) {
        return f7983e.m6881a(str);
    }

    /* renamed from: g */
    public static final C6386y m6877g(String str) {
        return f7983e.m6882b(str);
    }

    /* renamed from: c */
    public final Charset m6878c(Charset charset) {
        String strM6879f = m6879f("charset");
        if (strM6879f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM6879f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6386y) && Intrinsics.areEqual(((C6386y) obj).f7986a, this.f7986a);
    }

    /* renamed from: f */
    public final String m6879f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i6 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, this.f7989d.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!StringsKt.equals(this.f7989d[i6], name, true)) {
            if (i6 == progressionLastElement) {
                return null;
            }
            i6 += 2;
        }
        return this.f7989d[i6 + 1];
    }

    /* renamed from: h */
    public final String m6880h() {
        return this.f7987b;
    }

    public int hashCode() {
        return this.f7986a.hashCode();
    }

    public String toString() {
        return this.f7986a;
    }
}
