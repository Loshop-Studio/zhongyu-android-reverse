package je;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p439zc.AbstractC12039c;

/* renamed from: je.t */
/* loaded from: classes6.dex */
public final class C9740t {

    /* renamed from: e */
    public static final a f22770e = new a(null);

    /* renamed from: f */
    public static final Pattern f22771f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    public static final Pattern f22772g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f22773a;

    /* renamed from: b */
    public final String f22774b;

    /* renamed from: c */
    public final String f22775c;

    /* renamed from: d */
    public final String[] f22776d;

    /* renamed from: je.t$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C9740t m19488a(String str) {
            AbstractC9979u.m20294g(str, "<this>");
            Matcher matcher = C9740t.f22771f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            AbstractC9979u.m20293f(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            AbstractC9979u.m20293f(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            AbstractC9979u.m20293f(strGroup2, "typeSubtype.group(2)");
            AbstractC9979u.m20293f(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            AbstractC9979u.m20293f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C9740t.f22772g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (AbstractC10819z.m23242O(strGroup4, "'", false, 2, null) && AbstractC10819z.m23229B(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        AbstractC9979u.m20293f(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new C9740t(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        /* renamed from: b */
        public final C9740t m19489b(String str) {
            AbstractC9979u.m20294g(str, "<this>");
            try {
                return m19488a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C9740t(String str, String str2, String str3, String[] strArr, AbstractC9972n abstractC9972n) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m19481d(C9740t c9740t, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return c9740t.m19484c(charset);
    }

    /* renamed from: e */
    public static final C9740t m19482e(String str) {
        return f22770e.m19488a(str);
    }

    /* renamed from: g */
    public static final C9740t m19483g(String str) {
        return f22770e.m19489b(str);
    }

    /* renamed from: c */
    public final Charset m19484c(Charset charset) {
        String strM19485f = m19485f("charset");
        if (strM19485f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM19485f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9740t) && AbstractC9979u.m20289b(((C9740t) obj).f22773a, this.f22773a);
    }

    /* renamed from: f */
    public final String m19485f(String name) {
        AbstractC9979u.m20294g(name, "name");
        int i10 = 0;
        int iM26665c = AbstractC12039c.m26665c(0, this.f22776d.length - 1, 2);
        if (iM26665c < 0) {
            return null;
        }
        while (!AbstractC10819z.m23230C(this.f22776d[i10], name, true)) {
            if (i10 == iM26665c) {
                return null;
            }
            i10 += 2;
        }
        return this.f22776d[i10 + 1];
    }

    /* renamed from: h */
    public final String m19486h() {
        return this.f22775c;
    }

    public int hashCode() {
        return this.f22773a.hashCode();
    }

    /* renamed from: i */
    public final String m19487i() {
        return this.f22774b;
    }

    public String toString() {
        return this.f22773a;
    }

    public C9740t(String str, String str2, String str3, String[] strArr) {
        this.f22773a = str;
        this.f22774b = str2;
        this.f22775c = str3;
        this.f22776d = strArr;
    }
}
