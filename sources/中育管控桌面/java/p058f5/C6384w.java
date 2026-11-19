package p058f5;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import p065g5.AbstractC6422f;
import p065g5.AbstractC6424h;
import p172v5.AbstractC7800a;

/* renamed from: f5.w */
/* loaded from: classes4.dex */
public final class C6384w {

    /* renamed from: j */
    public static final b f7965j = new b(null);

    /* renamed from: a */
    public final String f7966a;

    /* renamed from: b */
    public final String f7967b;

    /* renamed from: c */
    public final String f7968c;

    /* renamed from: d */
    public final String f7969d;

    /* renamed from: e */
    public final int f7970e;

    /* renamed from: f */
    public final List f7971f;

    /* renamed from: g */
    public final List f7972g;

    /* renamed from: h */
    public final String f7973h;

    /* renamed from: i */
    public final String f7974i;

    /* renamed from: f5.w$a */
    public static final class a {

        /* renamed from: a */
        public String f7975a;

        /* renamed from: d */
        public String f7978d;

        /* renamed from: g */
        public List f7981g;

        /* renamed from: h */
        public String f7982h;

        /* renamed from: b */
        public String f7976b = "";

        /* renamed from: c */
        public String f7977c = "";

        /* renamed from: e */
        public int f7979e = -1;

        /* renamed from: f */
        public final List f7980f = CollectionsKt.mutableListOf("");

        /* renamed from: A */
        public final void m6835A(String str) {
            this.f7975a = str;
        }

        /* renamed from: B */
        public final int m6836B(String str, int i6, int i7) {
            int i8 = 0;
            while (i6 < i7) {
                char cCharAt = str.charAt(i6);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i8++;
                i6++;
            }
            return i8;
        }

        /* renamed from: C */
        public final void m6837C(List list, StringBuilder sb) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append('/');
                sb.append((String) list.get(i6));
            }
        }

        /* renamed from: D */
        public final List m6838D(String str) {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i6, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str2.length();
                }
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '=', i6, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str2.substring(i6, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i6, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i6 = iIndexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        /* renamed from: E */
        public final a m6839E(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f7976b = AbstractC7800a.m9369b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        /* renamed from: a */
        public final a m6840a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f7981g == null) {
                this.f7981g = new ArrayList();
            }
            List list = this.f7981g;
            Intrinsics.checkNotNull(list);
            list.add(AbstractC7800a.m9369b(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
            List list2 = this.f7981g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? AbstractC7800a.m9369b(str, 0, 0, " \"'<>#&=", true, false, true, false, 83, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m6841b(String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            m6856q(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m6842c(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f7981g == null) {
                this.f7981g = new ArrayList();
            }
            List list = this.f7981g;
            Intrinsics.checkNotNull(list);
            list.add(AbstractC7800a.m9369b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            List list2 = this.f7981g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? AbstractC7800a.m9369b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C6384w m6843d() {
            ArrayList arrayList;
            String str = this.f7975a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strM9374g = AbstractC7800a.m9374g(this.f7976b, 0, 0, false, 7, null);
            String strM9374g2 = AbstractC7800a.m9374g(this.f7977c, 0, 0, false, 7, null);
            String str2 = this.f7978d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM6844e = m6844e();
            List list = this.f7980f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC7800a.m9374g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f7981g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? AbstractC7800a.m9374g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f7982h;
            return new C6384w(str, strM9374g, strM9374g2, str2, iM6844e, arrayList2, arrayList, str4 != null ? AbstractC7800a.m9374g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        /* renamed from: e */
        public final int m6844e() {
            int i6 = this.f7979e;
            if (i6 != -1) {
                return i6;
            }
            b bVar = C6384w.f7965j;
            String str = this.f7975a;
            Intrinsics.checkNotNull(str);
            return bVar.m6867b(str);
        }

        /* renamed from: f */
        public final a m6845f(String str) {
            String strM9369b;
            this.f7981g = (str == null || (strM9369b = AbstractC7800a.m9369b(str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : m6838D(strM9369b);
            return this;
        }

        /* renamed from: g */
        public final List m6846g() {
            return this.f7980f;
        }

        /* renamed from: h */
        public final a m6847h(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strM6980k = AbstractC6422f.m6980k(AbstractC7800a.m9374g(host, 0, 0, false, 7, null));
            if (strM6980k != null) {
                this.f7978d = strM6980k;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m6848i(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.equals(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m6849j(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.equals(str, "%2e.", true) || StringsKt.equals(str, ".%2e", true) || StringsKt.equals(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m6850k(C6384w c6384w, String str) throws NumberFormatException {
            int iM6995i;
            boolean z6;
            int i6;
            int i7;
            char c7;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iM7002p = AbstractC6424h.m7002p(input, 0, 0, 3, null);
            int iM7004r = AbstractC6424h.m7004r(input, iM7002p, 0, 2, null);
            int iM6860u = m6860u(input, iM7002p, iM7004r);
            boolean z7 = true;
            if (iM6860u != -1) {
                if (StringsKt.startsWith(input, "https:", iM7002p, true)) {
                    this.f7975a = "https";
                    iM7002p += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", iM7002p, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM6860u);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f7975a = "http";
                    iM7002p += 5;
                }
            } else {
                if (c6384w == null) {
                    if (input.length() > 6) {
                        input = StringsKt.take(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.f7975a = c6384w.m6832q();
            }
            int iM6836B = m6836B(input, iM7002p, iM7004r);
            char c8 = '?';
            char c9 = '#';
            if (iM6836B >= 2 || c6384w == null || !Intrinsics.areEqual(c6384w.m6832q(), this.f7975a)) {
                boolean z8 = false;
                boolean z9 = false;
                int i8 = iM7002p + iM6836B;
                while (true) {
                    iM6995i = AbstractC6424h.m6995i(input, "@/\\?#", i8, iM7004r);
                    char cCharAt = iM6995i != iM7004r ? input.charAt(iM6995i) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c9 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c8) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z8) {
                            z6 = z7;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f7977c);
                            sb2.append("%40");
                            input = str;
                            i6 = iM6995i;
                            sb2.append(AbstractC7800a.m9369b(input, i8, iM6995i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.f7977c = sb2.toString();
                        } else {
                            int iM6994h = AbstractC6424h.m6994h(input, ':', i8, iM6995i);
                            z6 = z7;
                            String strM9369b = AbstractC7800a.m9369b(input, i8, iM6994h, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z9) {
                                strM9369b = this.f7976b + "%40" + strM9369b;
                            }
                            this.f7976b = strM9369b;
                            if (iM6994h != iM6995i) {
                                i7 = iM6995i;
                                this.f7977c = AbstractC7800a.m9369b(str, iM6994h + 1, i7, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z8 = z6;
                            } else {
                                i7 = iM6995i;
                            }
                            input = str;
                            i6 = i7;
                            z9 = z6;
                        }
                        i8 = i6 + 1;
                        z7 = z6;
                        c9 = '#';
                        c8 = '?';
                    }
                }
                int iM6855p = m6855p(input, i8, iM6995i);
                int i9 = iM6855p + 1;
                if (i9 < iM6995i) {
                    this.f7978d = AbstractC6422f.m6980k(AbstractC7800a.m9374g(input, i8, iM6855p, false, 4, null));
                    int iM6851l = m6851l(input, i9, iM6995i);
                    this.f7979e = iM6851l;
                    if (iM6851l == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i9, iM6995i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    this.f7978d = AbstractC6422f.m6980k(AbstractC7800a.m9374g(input, i8, iM6855p, false, 4, null));
                    b bVar = C6384w.f7965j;
                    String str2 = this.f7975a;
                    Intrinsics.checkNotNull(str2);
                    this.f7979e = bVar.m6867b(str2);
                }
                if (this.f7978d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i8, iM6855p);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    sb4.append(strSubstring3);
                    sb4.append(Typography.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM7002p = iM6995i;
            } else {
                this.f7976b = c6384w.m6822f();
                this.f7977c = c6384w.m6818b();
                this.f7978d = c6384w.m6823h();
                this.f7979e = c6384w.m6828m();
                this.f7980f.clear();
                this.f7980f.addAll(c6384w.m6820d());
                if (iM7002p == iM7004r || input.charAt(iM7002p) == '#') {
                    m6845f(c6384w.m6821e());
                }
            }
            int iM6995i2 = AbstractC6424h.m6995i(input, "?#", iM7002p, iM7004r);
            m6858s(input, iM7002p, iM6995i2);
            if (iM6995i2 >= iM7004r || input.charAt(iM6995i2) != '?') {
                c7 = '#';
            } else {
                c7 = '#';
                int iM6994h2 = AbstractC6424h.m6994h(input, '#', iM6995i2, iM7004r);
                this.f7981g = m6838D(AbstractC7800a.m9369b(input, iM6995i2 + 1, iM6994h2, " \"'<>#", true, false, true, false, 80, null));
                iM6995i2 = iM6994h2;
            }
            if (iM6995i2 < iM7004r && input.charAt(iM6995i2) == c7) {
                this.f7982h = AbstractC7800a.m9369b(input, iM6995i2 + 1, iM7004r, "", true, false, false, true, 48, null);
            }
            return this;
        }

        /* renamed from: l */
        public final int m6851l(String str, int i6, int i7) throws NumberFormatException {
            int i8;
            try {
                i8 = Integer.parseInt(AbstractC7800a.m9369b(str, i6, i7, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i8 || i8 >= 65536) {
                return -1;
            }
            return i8;
        }

        /* renamed from: m */
        public final a m6852m(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f7977c = AbstractC7800a.m9369b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        /* renamed from: n */
        public final void m6853n() {
            if (((String) this.f7980f.remove(r0.size() - 1)).length() != 0 || this.f7980f.isEmpty()) {
                this.f7980f.add("");
            } else {
                this.f7980f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: o */
        public final a m6854o(int i6) {
            if (1 <= i6 && i6 < 65536) {
                this.f7979e = i6;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i6).toString());
        }

        /* renamed from: p */
        public final int m6855p(String str, int i6, int i7) {
            while (i6 < i7) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == ':') {
                    return i6;
                }
                if (cCharAt == '[') {
                    do {
                        i6++;
                        if (i6 < i7) {
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            return i7;
        }

        /* renamed from: q */
        public final void m6856q(String str, int i6, int i7, boolean z6, boolean z7) {
            String strM9369b = AbstractC7800a.m9369b(str, i6, i7, " \"<>^`{}|/\\?#", z7, false, false, false, 112, null);
            if (m6848i(strM9369b)) {
                return;
            }
            if (m6849j(strM9369b)) {
                m6853n();
                return;
            }
            if (((CharSequence) this.f7980f.get(r12.size() - 1)).length() == 0) {
                this.f7980f.set(r12.size() - 1, strM9369b);
            } else {
                this.f7980f.add(strM9369b);
            }
            if (z6) {
                this.f7980f.add("");
            }
        }

        /* renamed from: r */
        public final a m6857r() {
            String str = this.f7978d;
            this.f7978d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f7980f.size();
            for (int i6 = 0; i6 < size; i6++) {
                List list = this.f7980f;
                list.set(i6, AbstractC7800a.m9369b((String) list.get(i6), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List list2 = this.f7981g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    String str2 = (String) list2.get(i7);
                    list2.set(i7, str2 != null ? AbstractC7800a.m9369b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f7982h;
            this.f7982h = str3 != null ? AbstractC7800a.m9369b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        /* renamed from: s */
        public final void m6858s(String str, int i6, int i7) {
            if (i6 == i7) {
                return;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f7980f.clear();
                this.f7980f.add("");
                i6++;
            } else {
                List list = this.f7980f;
                list.set(list.size() - 1, "");
            }
            int i8 = i6;
            while (i8 < i7) {
                int iM6995i = AbstractC6424h.m6995i(str, "/\\", i8, i7);
                boolean z6 = iM6995i < i7;
                String str2 = str;
                m6856q(str2, i8, iM6995i, z6, true);
                if (z6) {
                    i8 = iM6995i + 1;
                    str = str2;
                } else {
                    str = str2;
                    i8 = iM6995i;
                }
            }
        }

        /* renamed from: t */
        public final a m6859t(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.f7975a = "http";
                return this;
            }
            if (StringsKt.equals(scheme, "https", true)) {
                this.f7975a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f7975a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f7976b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f7977c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f7976b
                r0.append(r1)
                java.lang.String r1 = r6.f7977c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f7977c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f7978d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f7978d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f7978d
                r0.append(r1)
            L69:
                int r1 = r6.f7979e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f7975a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.m6844e()
                java.lang.String r3 = r6.f7975a
                if (r3 == 0) goto L85
                f5.w$b r4 = p058f5.C6384w.f7965j
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r4.m6867b(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List r1 = r6.f7980f
                r6.m6837C(r1, r0)
                java.util.List r1 = r6.f7981g
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                f5.w$b r1 = p058f5.C6384w.f7965j
                java.util.List r2 = r6.f7981g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                p058f5.C6384w.b.m6866a(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.f7982h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f7982h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p058f5.C6384w.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final int m6860u(String str, int i6, int i7) {
            if (i7 - i6 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i6);
            if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                while (true) {
                    i6++;
                    if (i6 >= i7) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i6);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: v */
        public final void m6861v(String str) {
            this.f7982h = str;
        }

        /* renamed from: w */
        public final void m6862w(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f7977c = str;
        }

        /* renamed from: x */
        public final void m6863x(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f7976b = str;
        }

        /* renamed from: y */
        public final void m6864y(String str) {
            this.f7978d = str;
        }

        /* renamed from: z */
        public final void m6865z(int i6) {
            this.f7979e = i6;
        }
    }

    /* renamed from: f5.w$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int m6867b(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        /* renamed from: c */
        public final C6384w m6868c(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().m6850k(null, str).m6843d();
        }

        /* renamed from: d */
        public final C6384w m6869d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m6868c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public final void m6870e(List list, StringBuilder sb) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = (String) list.get(first);
                String str2 = (String) list.get(first + 1);
                if (first > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        public b() {
        }
    }

    public /* synthetic */ C6384w(String str, String str2, String str3, String str4, int i6, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i6, list, list2, str5, str6);
    }

    /* renamed from: g */
    public static final C6384w m6816g(String str) {
        return f7965j.m6868c(str);
    }

    /* renamed from: a */
    public final String m6817a() {
        if (this.f7973h == null) {
            return null;
        }
        String strSubstring = this.f7974i.substring(StringsKt.indexOf$default((CharSequence) this.f7974i, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m6818b() {
        if (this.f7968c.length() == 0) {
            return "";
        }
        String strSubstring = this.f7974i.substring(StringsKt.indexOf$default((CharSequence) this.f7974i, ':', this.f7966a.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.f7974i, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m6819c() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7974i, '/', this.f7966a.length() + 3, false, 4, (Object) null);
        String str = this.f7974i;
        String strSubstring = this.f7974i.substring(iIndexOf$default, AbstractC6424h.m6995i(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public final List m6820d() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7974i, '/', this.f7966a.length() + 3, false, 4, (Object) null);
        String str = this.f7974i;
        int iM6995i = AbstractC6424h.m6995i(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iM6995i) {
            int i6 = iIndexOf$default + 1;
            int iM6994h = AbstractC6424h.m6994h(this.f7974i, '/', i6, iM6995i);
            String strSubstring = this.f7974i.substring(i6, iM6994h);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iIndexOf$default = iM6994h;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String m6821e() {
        if (this.f7972g == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7974i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f7974i;
        String strSubstring = this.f7974i.substring(iIndexOf$default, AbstractC6424h.m6994h(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6384w) && Intrinsics.areEqual(((C6384w) obj).f7974i, this.f7974i);
    }

    /* renamed from: f */
    public final String m6822f() {
        if (this.f7967b.length() == 0) {
            return "";
        }
        int length = this.f7966a.length() + 3;
        String str = this.f7974i;
        String strSubstring = this.f7974i.substring(length, AbstractC6424h.m6995i(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h */
    public final String m6823h() {
        return this.f7969d;
    }

    public int hashCode() {
        return this.f7974i.hashCode();
    }

    /* renamed from: i */
    public final boolean m6824i() {
        return Intrinsics.areEqual(this.f7966a, "https");
    }

    /* renamed from: j */
    public final a m6825j() {
        a aVar = new a();
        aVar.m6835A(this.f7966a);
        aVar.m6863x(m6822f());
        aVar.m6862w(m6818b());
        aVar.m6864y(this.f7969d);
        aVar.m6865z(this.f7970e != f7965j.m6867b(this.f7966a) ? this.f7970e : -1);
        aVar.m6846g().clear();
        aVar.m6846g().addAll(m6820d());
        aVar.m6845f(m6821e());
        aVar.m6861v(m6817a());
        return aVar;
    }

    /* renamed from: k */
    public final a m6826k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().m6850k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final List m6827l() {
        return this.f7971f;
    }

    /* renamed from: m */
    public final int m6828m() {
        return this.f7970e;
    }

    /* renamed from: n */
    public final String m6829n() {
        if (this.f7972g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f7965j.m6870e(this.f7972g, sb);
        return sb.toString();
    }

    /* renamed from: o */
    public final String m6830o() {
        a aVarM6826k = m6826k("/...");
        Intrinsics.checkNotNull(aVarM6826k);
        return aVarM6826k.m6839E("").m6852m("").m6843d().toString();
    }

    /* renamed from: p */
    public final C6384w m6831p(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarM6826k = m6826k(link);
        if (aVarM6826k != null) {
            return aVarM6826k.m6843d();
        }
        return null;
    }

    /* renamed from: q */
    public final String m6832q() {
        return this.f7966a;
    }

    /* renamed from: r */
    public final URI m6833r() {
        String string = m6825j().m6857r().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e6) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNull(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* renamed from: s */
    public final URL m6834s() {
        try {
            return new URL(this.f7974i);
        } catch (MalformedURLException e6) {
            throw new RuntimeException(e6);
        }
    }

    public String toString() {
        return this.f7974i;
    }

    public C6384w(String str, String str2, String str3, String str4, int i6, List list, List list2, String str5, String str6) {
        this.f7966a = str;
        this.f7967b = str2;
        this.f7968c = str3;
        this.f7969d = str4;
        this.f7970e = i6;
        this.f7971f = list;
        this.f7972g = list2;
        this.f7973h = str5;
        this.f7974i = str6;
    }
}
