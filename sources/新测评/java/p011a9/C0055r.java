package p011a9;

import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.Buffer;
import p028b9.AbstractC5067a;
import p028b9.AbstractC5070d;

/* renamed from: a9.r */
/* loaded from: classes5.dex */
public final class C0055r {

    /* renamed from: k */
    public static final b f168k = new b(null);

    /* renamed from: l */
    public static final char[] f169l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f170a;

    /* renamed from: b */
    public final String f171b;

    /* renamed from: c */
    public final String f172c;

    /* renamed from: d */
    public final String f173d;

    /* renamed from: e */
    public final int f174e;

    /* renamed from: f */
    public final List f175f;

    /* renamed from: g */
    public final List f176g;

    /* renamed from: h */
    public final String f177h;

    /* renamed from: i */
    public final String f178i;

    /* renamed from: j */
    public final boolean f179j;

    /* renamed from: a9.r$a */
    public static final class a {

        /* renamed from: i */
        public static final C10091a f180i = new C10091a(null);

        /* renamed from: a */
        public String f181a;

        /* renamed from: d */
        public String f184d;

        /* renamed from: f */
        public final List f186f;

        /* renamed from: g */
        public List f187g;

        /* renamed from: h */
        public String f188h;

        /* renamed from: b */
        public String f182b = "";

        /* renamed from: c */
        public String f183c = "";

        /* renamed from: e */
        public int f185e = -1;

        /* renamed from: a9.r$a$a, reason: collision with other inner class name */
        public static final class C10091a {
            public /* synthetic */ C10091a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: e */
            public final int m251e(String str, int i10, int i11) throws NumberFormatException {
                int i12;
                try {
                    i12 = Integer.parseInt(b.m255b(C0055r.f168k, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            /* renamed from: f */
            public final int m252f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* renamed from: g */
            public final int m253g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* renamed from: h */
            public final int m254h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            public C10091a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f186f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final a m222a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f187g == null) {
                this.f187g = new ArrayList();
            }
            List list = this.f187g;
            Intrinsics.checkNotNull(list);
            b bVar = C0055r.f168k;
            list.add(b.m255b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.f187g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m255b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m223b(String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            m236o(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m224c(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f187g == null) {
                this.f187g = new ArrayList();
            }
            List list = this.f187g;
            Intrinsics.checkNotNull(list);
            b bVar = C0055r.f168k;
            list.add(b.m255b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f187g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m255b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C0055r m225d() {
            ArrayList arrayList;
            String str = this.f181a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C0055r.f168k;
            String strM256h = b.m256h(bVar, this.f182b, 0, 0, false, 7, null);
            String strM256h2 = b.m256h(bVar, this.f183c, 0, 0, false, 7, null);
            String str2 = this.f184d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM226e = m226e();
            List list = this.f186f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m256h(C0055r.f168k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f187g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.m256h(C0055r.f168k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f188h;
            return new C0055r(str, strM256h, strM256h2, str2, iM226e, arrayList2, arrayList, str4 != null ? b.m256h(C0055r.f168k, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* renamed from: e */
        public final int m226e() {
            int i10 = this.f185e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = C0055r.f168k;
            String str = this.f181a;
            Intrinsics.checkNotNull(str);
            return bVar.m258c(str);
        }

        /* renamed from: f */
        public final a m227f(String str) {
            b bVar;
            String strM255b;
            this.f187g = (str == null || (strM255b = b.m255b((bVar = C0055r.f168k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.m264j(strM255b);
            return this;
        }

        /* renamed from: g */
        public final List m228g() {
            return this.f186f;
        }

        /* renamed from: h */
        public final a m229h(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strM2609e = AbstractC5067a.m2609e(b.m256h(C0055r.f168k, host, 0, 0, false, 7, null));
            if (strM2609e != null) {
                this.f184d = strM2609e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m230i(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.equals(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m231j(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.equals(str, "%2e.", true) || StringsKt.equals(str, ".%2e", true) || StringsKt.equals(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m232k(C0055r c0055r, String str) throws NumberFormatException {
            String str2;
            int iM2652q;
            int i10;
            String str3;
            int i11;
            String str4;
            boolean z9;
            char c10;
            int i12;
            int i13;
            char c11;
            int i14;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iM2610A = AbstractC5070d.m2610A(input, 0, 0, 3, null);
            int iM2612C = AbstractC5070d.m2612C(input, iM2610A, 0, 2, null);
            C10091a c10091a = f180i;
            int iM253g = c10091a.m253g(input, iM2610A, iM2612C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z10 = true;
            char c12 = 65535;
            if (iM253g != -1) {
                if (StringsKt.startsWith(input, "https:", iM2610A, true)) {
                    this.f181a = "https";
                    iM2610A += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", iM2610A, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM253g);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f181a = "http";
                    iM2610A += 5;
                }
            } else {
                if (c0055r == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.take(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f181a = c0055r.m219r();
            }
            int iM254h = c10091a.m254h(input, iM2610A, iM2612C);
            char c13 = '?';
            char c14 = '#';
            if (iM254h >= 2 || c0055r == null || !Intrinsics.areEqual(c0055r.m219r(), this.f181a)) {
                int i15 = iM2610A + iM254h;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iM2652q = AbstractC5070d.m2652q(input, "@/\\?#", i15, iM2612C);
                    char cCharAt = iM2652q != iM2612C ? input.charAt(iM2652q) : c12;
                    if (cCharAt == c12 || cCharAt == c14 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c13) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z11) {
                            i11 = iM2612C;
                            str4 = str5;
                            z9 = z10;
                            c10 = c12;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f183c);
                            sb2.append("%40");
                            input = str;
                            i12 = iM2652q;
                            sb2.append(b.m255b(C0055r.f168k, input, i15, iM2652q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f183c = sb2.toString();
                        } else {
                            int iM2651p = AbstractC5070d.m2651p(input, ':', i15, iM2652q);
                            b bVar = C0055r.f168k;
                            str4 = str5;
                            c10 = c12;
                            i11 = iM2612C;
                            z9 = z10;
                            String strM255b = b.m255b(bVar, input, i15, iM2651p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strM255b = this.f182b + "%40" + strM255b;
                            }
                            this.f182b = strM255b;
                            if (iM2651p != iM2652q) {
                                i13 = iM2652q;
                                this.f183c = b.m255b(bVar, str, iM2651p + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z9;
                            } else {
                                i13 = iM2652q;
                            }
                            input = str;
                            i12 = i13;
                            z12 = z9;
                        }
                        i15 = i12 + 1;
                        c12 = c10;
                        iM2612C = i11;
                        str5 = str4;
                        z10 = z9;
                        c13 = '?';
                        c14 = '#';
                    }
                }
                i10 = iM2612C;
                String str6 = str5;
                char c15 = c12;
                C10091a c10091a2 = f180i;
                int iM252f = c10091a2.m252f(input, i15, iM2652q);
                int i16 = iM252f + 1;
                if (i16 < iM2652q) {
                    this.f184d = AbstractC5067a.m2609e(b.m256h(C0055r.f168k, input, i15, iM252f, false, 4, null));
                    int iM251e = c10091a2.m251e(input, i16, iM2652q);
                    this.f185e = iM251e;
                    if (iM251e == c15) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i16, iM2652q);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str6);
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    b bVar2 = C0055r.f168k;
                    this.f184d = AbstractC5067a.m2609e(b.m256h(bVar2, input, i15, iM252f, false, 4, null));
                    String str7 = this.f181a;
                    Intrinsics.checkNotNull(str7);
                    this.f185e = bVar2.m258c(str7);
                }
                if (this.f184d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i15, iM252f);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str3);
                    sb4.append(strSubstring3);
                    sb4.append(Typography.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM2610A = iM2652q;
            } else {
                this.f182b = c0055r.m209g();
                this.f183c = c0055r.m205c();
                this.f184d = c0055r.m210i();
                this.f185e = c0055r.m215n();
                this.f186f.clear();
                this.f186f.addAll(c0055r.m207e());
                if (iM2610A == iM2612C || input.charAt(iM2610A) == '#') {
                    m227f(c0055r.m208f());
                }
                i10 = iM2612C;
            }
            int i17 = i10;
            int iM2652q2 = AbstractC5070d.m2652q(input, "?#", iM2610A, i17);
            m238q(input, iM2610A, iM2652q2);
            if (iM2652q2 >= i17 || input.charAt(iM2652q2) != '?') {
                c11 = '#';
                i14 = iM2652q2;
            } else {
                c11 = '#';
                int iM2651p2 = AbstractC5070d.m2651p(input, '#', iM2652q2, i17);
                b bVar3 = C0055r.f168k;
                this.f187g = bVar3.m264j(b.m255b(bVar3, input, iM2652q2 + 1, iM2651p2, " \"'<>#", true, false, true, false, null, 208, null));
                i14 = iM2651p2;
            }
            if (i14 < i17 && input.charAt(i14) == c11) {
                this.f188h = b.m255b(C0055r.f168k, input, i14 + 1, i17, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: l */
        public final a m233l(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f183c = b.m255b(C0055r.f168k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: m */
        public final void m234m() {
            if (((String) this.f186f.remove(r0.size() - 1)).length() != 0 || this.f186f.isEmpty()) {
                this.f186f.add("");
            } else {
                this.f186f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: n */
        public final a m235n(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f185e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* renamed from: o */
        public final void m236o(String str, int i10, int i11, boolean z9, boolean z10) {
            String strM255b = b.m255b(C0055r.f168k, str, i10, i11, " \"<>^`{}|/\\?#", z10, false, false, false, null, 240, null);
            if (m230i(strM255b)) {
                return;
            }
            if (m231j(strM255b)) {
                m234m();
                return;
            }
            if (((CharSequence) this.f186f.get(r14.size() - 1)).length() == 0) {
                this.f186f.set(r14.size() - 1, strM255b);
            } else {
                this.f186f.add(strM255b);
            }
            if (z9) {
                this.f186f.add("");
            }
        }

        /* renamed from: p */
        public final a m237p() {
            String str = this.f184d;
            this.f184d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f186f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f186f;
                list.set(i10, b.m255b(C0055r.f168k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f187g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.m255b(C0055r.f168k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f188h;
            this.f188h = str3 != null ? b.m255b(C0055r.f168k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* renamed from: q */
        public final void m238q(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f186f.clear();
                this.f186f.add("");
                i10++;
            } else {
                List list = this.f186f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iM2652q = AbstractC5070d.m2652q(str, "/\\", i12, i11);
                boolean z9 = iM2652q < i11;
                String str2 = str;
                m236o(str2, i12, iM2652q, z9, true);
                if (z9) {
                    i12 = iM2652q + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iM2652q;
                }
            }
        }

        /* renamed from: r */
        public final a m239r(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.f181a = "http";
                return this;
            }
            if (StringsKt.equals(scheme, "https", true)) {
                this.f181a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* renamed from: s */
        public final void m240s(String str) {
            this.f188h = str;
        }

        /* renamed from: t */
        public final void m241t(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f183c = str;
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
                java.lang.String r1 = r6.f181a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f182b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f183c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f182b
                r0.append(r1)
                java.lang.String r1 = r6.f183c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f183c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f184d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f184d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f184d
                r0.append(r1)
            L69:
                int r1 = r6.f185e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f181a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.m226e()
                java.lang.String r3 = r6.f181a
                if (r3 == 0) goto L85
                a9.r$b r4 = p011a9.C0055r.f168k
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r4.m258c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                a9.r$b r1 = p011a9.C0055r.f168k
                java.util.List r2 = r6.f186f
                r1.m263i(r2, r0)
                java.util.List r2 = r6.f187g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f187g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.m265k(r2, r0)
            La3:
                java.lang.String r1 = r6.f188h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f188h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p011a9.C0055r.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m242u(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f182b = str;
        }

        /* renamed from: v */
        public final void m243v(String str) {
            this.f184d = str;
        }

        /* renamed from: w */
        public final void m244w(int i10) {
            this.f185e = i10;
        }

        /* renamed from: x */
        public final void m245x(String str) {
            this.f181a = str;
        }

        /* renamed from: y */
        public final a m246y(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f182b = b.m255b(C0055r.f168k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* renamed from: a9.r$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m255b(b bVar, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z9 = false;
            }
            if ((i12 & 16) != 0) {
                z10 = false;
            }
            if ((i12 & 32) != 0) {
                z11 = false;
            }
            if ((i12 & 64) != 0) {
                z12 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.m257a(str, i10, i11, str2, z9, z10, z11, z12, charset);
        }

        /* renamed from: h */
        public static /* synthetic */ String m256h(b bVar, String str, int i10, int i11, boolean z9, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z9 = false;
            }
            return bVar.m262g(str, i10, i11, z9);
        }

        /* renamed from: a */
        public final String m257a(String str, int i10, int i11, String encodeSet, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z9 || (z10 && !m260e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z11)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, iCharCount);
                    m266l(buffer, str, iCharCount, i11, encodeSet, z9, z10, z11, z12, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: c */
        public final int m258c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        /* renamed from: d */
        public final C0055r m259d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().m232k(null, str).m225d();
        }

        /* renamed from: e */
        public final boolean m260e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && AbstractC5070d.m2617H(str.charAt(i10 + 1)) != -1 && AbstractC5070d.m2617H(str.charAt(i12)) != -1;
        }

        /* renamed from: f */
        public final C0055r m261f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m259d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m262g(String str, int i10, int i11, boolean z9) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, i12);
                    m267m(buffer, str, i12, i11, z9);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: i */
        public final void m263i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        /* renamed from: j */
        public final List m264j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str2.length();
                }
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '=', i10, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str2.substring(i10, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iIndexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m265k(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
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
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        /* renamed from: l */
        public final void m266l(Buffer buffer, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            int iCharCount = i10;
            Buffer buffer2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        buffer.writeUtf8(z9 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z12)) {
                            if (!StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null) && (iCodePointAt != 37 || (z9 && (!z10 || m260e(str, iCharCount, i11))))) {
                                buffer.writeUtf8CodePoint(iCodePointAt);
                            }
                        }
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b10 = buffer2.readByte();
                            int i12 = b10 & UByte.MAX_VALUE;
                            buffer.writeByte(37);
                            buffer.writeByte((int) C0055r.f169l[(i12 >> 4) & 15]);
                            buffer.writeByte((int) C0055r.f169l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        /* renamed from: m */
        public final void m267m(Buffer buffer, String str, int i10, int i11, boolean z9) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iM2617H = AbstractC5070d.m2617H(str.charAt(i10 + 1));
                    int iM2617H2 = AbstractC5070d.m2617H(str.charAt(i12));
                    if (iM2617H == -1 || iM2617H2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((iM2617H << 4) + iM2617H2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z9) {
                    buffer.writeByte(32);
                    i10++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public b() {
        }
    }

    public C0055r(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f170a = scheme;
        this.f171b = username;
        this.f172c = password;
        this.f173d = host;
        this.f174e = i10;
        this.f175f = pathSegments;
        this.f176g = list;
        this.f177h = str;
        this.f178i = url;
        this.f179j = Intrinsics.areEqual(scheme, "https");
    }

    /* renamed from: h */
    public static final C0055r m203h(String str) {
        return f168k.m259d(str);
    }

    /* renamed from: b */
    public final String m204b() {
        if (this.f177h == null) {
            return null;
        }
        String strSubstring = this.f178i.substring(StringsKt.indexOf$default((CharSequence) this.f178i, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m205c() {
        if (this.f172c.length() == 0) {
            return "";
        }
        String strSubstring = this.f178i.substring(StringsKt.indexOf$default((CharSequence) this.f178i, ':', this.f170a.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.f178i, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: d */
    public final String m206d() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f178i, '/', this.f170a.length() + 3, false, 4, (Object) null);
        String str = this.f178i;
        String strSubstring = this.f178i.substring(iIndexOf$default, AbstractC5070d.m2652q(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final List m207e() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f178i, '/', this.f170a.length() + 3, false, 4, (Object) null);
        String str = this.f178i;
        int iM2652q = AbstractC5070d.m2652q(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iM2652q) {
            int i10 = iIndexOf$default + 1;
            int iM2651p = AbstractC5070d.m2651p(this.f178i, '/', i10, iM2652q);
            String strSubstring = this.f178i.substring(i10, iM2651p);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iM2651p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0055r) && Intrinsics.areEqual(((C0055r) obj).f178i, this.f178i);
    }

    /* renamed from: f */
    public final String m208f() {
        if (this.f176g == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f178i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f178i;
        String strSubstring = this.f178i.substring(iIndexOf$default, AbstractC5070d.m2651p(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: g */
    public final String m209g() {
        if (this.f171b.length() == 0) {
            return "";
        }
        int length = this.f170a.length() + 3;
        String str = this.f178i;
        String strSubstring = this.f178i.substring(length, AbstractC5070d.m2652q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f178i.hashCode();
    }

    /* renamed from: i */
    public final String m210i() {
        return this.f173d;
    }

    /* renamed from: j */
    public final boolean m211j() {
        return this.f179j;
    }

    /* renamed from: k */
    public final a m212k() {
        a aVar = new a();
        aVar.m245x(this.f170a);
        aVar.m242u(m209g());
        aVar.m241t(m205c());
        aVar.m243v(this.f173d);
        aVar.m244w(this.f174e != f168k.m258c(this.f170a) ? this.f174e : -1);
        aVar.m228g().clear();
        aVar.m228g().addAll(m207e());
        aVar.m227f(m208f());
        aVar.m240s(m204b());
        return aVar;
    }

    /* renamed from: l */
    public final a m213l(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().m232k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m214m() {
        return this.f175f;
    }

    /* renamed from: n */
    public final int m215n() {
        return this.f174e;
    }

    /* renamed from: o */
    public final String m216o() {
        if (this.f176g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f168k.m265k(this.f176g, sb);
        return sb.toString();
    }

    /* renamed from: p */
    public final String m217p() {
        a aVarM213l = m213l("/...");
        Intrinsics.checkNotNull(aVarM213l);
        return aVarM213l.m246y("").m233l("").m225d().toString();
    }

    /* renamed from: q */
    public final C0055r m218q(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarM213l = m213l(link);
        if (aVarM213l != null) {
            return aVarM213l.m225d();
        }
        return null;
    }

    /* renamed from: r */
    public final String m219r() {
        return this.f170a;
    }

    /* renamed from: s */
    public final URI m220s() {
        String string = m212k().m237p().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: t */
    public final URL m221t() {
        try {
            return new URL(this.f178i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f178i;
    }
}
