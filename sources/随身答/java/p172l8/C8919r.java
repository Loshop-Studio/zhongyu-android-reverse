package p172l8;

import com.taobao.sophix.PatchStatus;
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
import p182m8.AbstractC9042a;
import p182m8.AbstractC9045d;

/* renamed from: l8.r */
/* loaded from: classes5.dex */
public final class C8919r {

    /* renamed from: k */
    public static final b f14796k = new b(null);

    /* renamed from: l */
    public static final char[] f14797l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f14798a;

    /* renamed from: b */
    public final String f14799b;

    /* renamed from: c */
    public final String f14800c;

    /* renamed from: d */
    public final String f14801d;

    /* renamed from: e */
    public final int f14802e;

    /* renamed from: f */
    public final List f14803f;

    /* renamed from: g */
    public final List f14804g;

    /* renamed from: h */
    public final String f14805h;

    /* renamed from: i */
    public final String f14806i;

    /* renamed from: j */
    public final boolean f14807j;

    /* renamed from: l8.r$a */
    public static final class a {

        /* renamed from: i */
        public static final C10079a f14808i = new C10079a(null);

        /* renamed from: a */
        public String f14809a;

        /* renamed from: d */
        public String f14812d;

        /* renamed from: f */
        public final List f14814f;

        /* renamed from: g */
        public List f14815g;

        /* renamed from: h */
        public String f14816h;

        /* renamed from: b */
        public String f14810b = "";

        /* renamed from: c */
        public String f14811c = "";

        /* renamed from: e */
        public int f14813e = -1;

        /* renamed from: l8.r$a$a, reason: collision with other inner class name */
        public static final class C10079a {
            public /* synthetic */ C10079a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: e */
            public final int m14007e(String str, int i9, int i10) throws NumberFormatException {
                int i11;
                try {
                    i11 = Integer.parseInt(b.m14011b(C8919r.f14796k, str, i9, i10, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i11 || i11 >= 65536) {
                    return -1;
                }
                return i11;
            }

            /* renamed from: f */
            public final int m14008f(String str, int i9, int i10) {
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt == '[') {
                        do {
                            i9++;
                            if (i9 < i10) {
                            }
                        } while (str.charAt(i9) != ']');
                    } else if (cCharAt == ':') {
                        return i9;
                    }
                    i9++;
                }
                return i10;
            }

            /* renamed from: g */
            public final int m14009g(String str, int i9, int i10) {
                if (i10 - i9 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i9);
                if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, PatchStatus.CODE_LOAD_RES_UPDATECONFIG) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        i9++;
                        if (i9 >= i10) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i9);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i9;
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
            public final int m14010h(String str, int i9, int i10) {
                int i11 = 0;
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i9++;
                }
                return i11;
            }

            public C10079a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f14814f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final a m13978a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f14815g == null) {
                this.f14815g = new ArrayList();
            }
            List list = this.f14815g;
            Intrinsics.checkNotNull(list);
            b bVar = C8919r.f14796k;
            list.add(b.m14011b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.f14815g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m14011b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m13979b(String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            m13992o(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m13980c(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f14815g == null) {
                this.f14815g = new ArrayList();
            }
            List list = this.f14815g;
            Intrinsics.checkNotNull(list);
            b bVar = C8919r.f14796k;
            list.add(b.m14011b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f14815g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m14011b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C8919r m13981d() {
            ArrayList arrayList;
            String str = this.f14809a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C8919r.f14796k;
            String strM14012h = b.m14012h(bVar, this.f14810b, 0, 0, false, 7, null);
            String strM14012h2 = b.m14012h(bVar, this.f14811c, 0, 0, false, 7, null);
            String str2 = this.f14812d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM13982e = m13982e();
            List list = this.f14814f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m14012h(C8919r.f14796k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f14815g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.m14012h(C8919r.f14796k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f14816h;
            return new C8919r(str, strM14012h, strM14012h2, str2, iM13982e, arrayList2, arrayList, str4 != null ? b.m14012h(C8919r.f14796k, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* renamed from: e */
        public final int m13982e() {
            int i9 = this.f14813e;
            if (i9 != -1) {
                return i9;
            }
            b bVar = C8919r.f14796k;
            String str = this.f14809a;
            Intrinsics.checkNotNull(str);
            return bVar.m14014c(str);
        }

        /* renamed from: f */
        public final a m13983f(String str) {
            b bVar;
            String strM14011b;
            this.f14815g = (str == null || (strM14011b = b.m14011b((bVar = C8919r.f14796k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.m14020j(strM14011b);
            return this;
        }

        /* renamed from: g */
        public final List m13984g() {
            return this.f14814f;
        }

        /* renamed from: h */
        public final a m13985h(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strM14458e = AbstractC9042a.m14458e(b.m14012h(C8919r.f14796k, host, 0, 0, false, 7, null));
            if (strM14458e != null) {
                this.f14812d = strM14458e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m13986i(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.equals(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m13987j(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.equals(str, "%2e.", true) || StringsKt.equals(str, ".%2e", true) || StringsKt.equals(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m13988k(C8919r c8919r, String str) throws NumberFormatException {
            String str2;
            int iM14501q;
            int i9;
            String str3;
            int i10;
            String str4;
            boolean z9;
            char c10;
            int i11;
            int i12;
            char c11;
            int i13;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iM14459A = AbstractC9045d.m14459A(input, 0, 0, 3, null);
            int iM14461C = AbstractC9045d.m14461C(input, iM14459A, 0, 2, null);
            C10079a c10079a = f14808i;
            int iM14009g = c10079a.m14009g(input, iM14459A, iM14461C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z10 = true;
            char c12 = 65535;
            if (iM14009g != -1) {
                if (StringsKt.startsWith(input, "https:", iM14459A, true)) {
                    this.f14809a = "https";
                    iM14459A += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", iM14459A, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM14009g);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f14809a = "http";
                    iM14459A += 5;
                }
            } else {
                if (c8919r == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.take(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f14809a = c8919r.m13975r();
            }
            int iM14010h = c10079a.m14010h(input, iM14459A, iM14461C);
            char c13 = '?';
            char c14 = '#';
            if (iM14010h >= 2 || c8919r == null || !Intrinsics.areEqual(c8919r.m13975r(), this.f14809a)) {
                int i14 = iM14459A + iM14010h;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iM14501q = AbstractC9045d.m14501q(input, "@/\\?#", i14, iM14461C);
                    char cCharAt = iM14501q != iM14461C ? input.charAt(iM14501q) : c12;
                    if (cCharAt == c12 || cCharAt == c14 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c13) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z11) {
                            i10 = iM14461C;
                            str4 = str5;
                            z9 = z10;
                            c10 = c12;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f14811c);
                            sb2.append("%40");
                            input = str;
                            i11 = iM14501q;
                            sb2.append(b.m14011b(C8919r.f14796k, input, i14, iM14501q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f14811c = sb2.toString();
                        } else {
                            int iM14500p = AbstractC9045d.m14500p(input, ':', i14, iM14501q);
                            b bVar = C8919r.f14796k;
                            str4 = str5;
                            c10 = c12;
                            i10 = iM14461C;
                            z9 = z10;
                            String strM14011b = b.m14011b(bVar, input, i14, iM14500p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strM14011b = this.f14810b + "%40" + strM14011b;
                            }
                            this.f14810b = strM14011b;
                            if (iM14500p != iM14501q) {
                                i12 = iM14501q;
                                this.f14811c = b.m14011b(bVar, str, iM14500p + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z9;
                            } else {
                                i12 = iM14501q;
                            }
                            input = str;
                            i11 = i12;
                            z12 = z9;
                        }
                        i14 = i11 + 1;
                        c12 = c10;
                        iM14461C = i10;
                        str5 = str4;
                        z10 = z9;
                        c13 = '?';
                        c14 = '#';
                    }
                }
                i9 = iM14461C;
                String str6 = str5;
                char c15 = c12;
                C10079a c10079a2 = f14808i;
                int iM14008f = c10079a2.m14008f(input, i14, iM14501q);
                int i15 = iM14008f + 1;
                if (i15 < iM14501q) {
                    this.f14812d = AbstractC9042a.m14458e(b.m14012h(C8919r.f14796k, input, i14, iM14008f, false, 4, null));
                    int iM14007e = c10079a2.m14007e(input, i15, iM14501q);
                    this.f14813e = iM14007e;
                    if (iM14007e == c15) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i15, iM14501q);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str6);
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    b bVar2 = C8919r.f14796k;
                    this.f14812d = AbstractC9042a.m14458e(b.m14012h(bVar2, input, i14, iM14008f, false, 4, null));
                    String str7 = this.f14809a;
                    Intrinsics.checkNotNull(str7);
                    this.f14813e = bVar2.m14014c(str7);
                }
                if (this.f14812d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i14, iM14008f);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str3);
                    sb4.append(strSubstring3);
                    sb4.append(Typography.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM14459A = iM14501q;
            } else {
                this.f14810b = c8919r.m13965g();
                this.f14811c = c8919r.m13961c();
                this.f14812d = c8919r.m13966i();
                this.f14813e = c8919r.m13971n();
                this.f14814f.clear();
                this.f14814f.addAll(c8919r.m13963e());
                if (iM14459A == iM14461C || input.charAt(iM14459A) == '#') {
                    m13983f(c8919r.m13964f());
                }
                i9 = iM14461C;
            }
            int i16 = i9;
            int iM14501q2 = AbstractC9045d.m14501q(input, "?#", iM14459A, i16);
            m13994q(input, iM14459A, iM14501q2);
            if (iM14501q2 >= i16 || input.charAt(iM14501q2) != '?') {
                c11 = '#';
                i13 = iM14501q2;
            } else {
                c11 = '#';
                int iM14500p2 = AbstractC9045d.m14500p(input, '#', iM14501q2, i16);
                b bVar3 = C8919r.f14796k;
                this.f14815g = bVar3.m14020j(b.m14011b(bVar3, input, iM14501q2 + 1, iM14500p2, " \"'<>#", true, false, true, false, null, 208, null));
                i13 = iM14500p2;
            }
            if (i13 < i16 && input.charAt(i13) == c11) {
                this.f14816h = b.m14011b(C8919r.f14796k, input, i13 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: l */
        public final a m13989l(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f14811c = b.m14011b(C8919r.f14796k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: m */
        public final void m13990m() {
            if (((String) this.f14814f.remove(r0.size() - 1)).length() != 0 || this.f14814f.isEmpty()) {
                this.f14814f.add("");
            } else {
                this.f14814f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: n */
        public final a m13991n(int i9) {
            if (1 <= i9 && i9 < 65536) {
                this.f14813e = i9;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i9).toString());
        }

        /* renamed from: o */
        public final void m13992o(String str, int i9, int i10, boolean z9, boolean z10) {
            String strM14011b = b.m14011b(C8919r.f14796k, str, i9, i10, " \"<>^`{}|/\\?#", z10, false, false, false, null, 240, null);
            if (m13986i(strM14011b)) {
                return;
            }
            if (m13987j(strM14011b)) {
                m13990m();
                return;
            }
            if (((CharSequence) this.f14814f.get(r14.size() - 1)).length() == 0) {
                this.f14814f.set(r14.size() - 1, strM14011b);
            } else {
                this.f14814f.add(strM14011b);
            }
            if (z9) {
                this.f14814f.add("");
            }
        }

        /* renamed from: p */
        public final a m13993p() {
            String str = this.f14812d;
            this.f14812d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f14814f.size();
            for (int i9 = 0; i9 < size; i9++) {
                List list = this.f14814f;
                list.set(i9, b.m14011b(C8919r.f14796k, (String) list.get(i9), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f14815g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str2 = (String) list2.get(i10);
                    list2.set(i10, str2 != null ? b.m14011b(C8919r.f14796k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f14816h;
            this.f14816h = str3 != null ? b.m14011b(C8919r.f14796k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* renamed from: q */
        public final void m13994q(String str, int i9, int i10) {
            if (i9 == i10) {
                return;
            }
            char cCharAt = str.charAt(i9);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f14814f.clear();
                this.f14814f.add("");
                i9++;
            } else {
                List list = this.f14814f;
                list.set(list.size() - 1, "");
            }
            int i11 = i9;
            while (i11 < i10) {
                int iM14501q = AbstractC9045d.m14501q(str, "/\\", i11, i10);
                boolean z9 = iM14501q < i10;
                String str2 = str;
                m13992o(str2, i11, iM14501q, z9, true);
                if (z9) {
                    i11 = iM14501q + 1;
                    str = str2;
                } else {
                    str = str2;
                    i11 = iM14501q;
                }
            }
        }

        /* renamed from: r */
        public final a m13995r(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.f14809a = "http";
                return this;
            }
            if (StringsKt.equals(scheme, "https", true)) {
                this.f14809a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* renamed from: s */
        public final void m13996s(String str) {
            this.f14816h = str;
        }

        /* renamed from: t */
        public final void m13997t(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f14811c = str;
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
                java.lang.String r1 = r6.f14809a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f14810b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f14811c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f14810b
                r0.append(r1)
                java.lang.String r1 = r6.f14811c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f14811c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f14812d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f14812d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f14812d
                r0.append(r1)
            L69:
                int r1 = r6.f14813e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f14809a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.m13982e()
                java.lang.String r3 = r6.f14809a
                if (r3 == 0) goto L85
                l8.r$b r4 = p172l8.C8919r.f14796k
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r4.m14014c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                l8.r$b r1 = p172l8.C8919r.f14796k
                java.util.List r2 = r6.f14814f
                r1.m14019i(r2, r0)
                java.util.List r2 = r6.f14815g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f14815g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.m14021k(r2, r0)
            La3:
                java.lang.String r1 = r6.f14816h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f14816h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p172l8.C8919r.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m13998u(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f14810b = str;
        }

        /* renamed from: v */
        public final void m13999v(String str) {
            this.f14812d = str;
        }

        /* renamed from: w */
        public final void m14000w(int i9) {
            this.f14813e = i9;
        }

        /* renamed from: x */
        public final void m14001x(String str) {
            this.f14809a = str;
        }

        /* renamed from: y */
        public final a m14002y(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f14810b = b.m14011b(C8919r.f14796k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* renamed from: l8.r$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m14011b(b bVar, String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z9 = false;
            }
            if ((i11 & 16) != 0) {
                z10 = false;
            }
            if ((i11 & 32) != 0) {
                z11 = false;
            }
            if ((i11 & 64) != 0) {
                z12 = false;
            }
            if ((i11 & 128) != 0) {
                charset = null;
            }
            return bVar.m14013a(str, i9, i10, str2, z9, z10, z11, z12, charset);
        }

        /* renamed from: h */
        public static /* synthetic */ String m14012h(b bVar, String str, int i9, int i10, boolean z9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z9 = false;
            }
            return bVar.m14018g(str, i9, i10, z9);
        }

        /* renamed from: a */
        public final String m14013a(String str, int i9, int i10, String encodeSet, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i9;
            while (iCharCount < i10) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z9 || (z10 && !m14016e(str, iCharCount, i10)))) || (iCodePointAt == 43 && z11)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i9, iCharCount);
                    m14022l(buffer, str, iCharCount, i10, encodeSet, z9, z10, z11, z12, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i9, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: c */
        public final int m14014c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        /* renamed from: d */
        public final C8919r m14015d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().m13988k(null, str).m13981d();
        }

        /* renamed from: e */
        public final boolean m14016e(String str, int i9, int i10) {
            int i11 = i9 + 2;
            return i11 < i10 && str.charAt(i9) == '%' && AbstractC9045d.m14466H(str.charAt(i9 + 1)) != -1 && AbstractC9045d.m14466H(str.charAt(i11)) != -1;
        }

        /* renamed from: f */
        public final C8919r m14017f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m14015d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m14018g(String str, int i9, int i10, boolean z9) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i11 = i9; i11 < i10; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i9, i11);
                    m14023m(buffer, str, i11, i10, z9);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i9, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: i */
        public final void m14019i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                out.append('/');
                out.append((String) list.get(i9));
            }
        }

        /* renamed from: j */
        public final List m14020j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i9, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str2.length();
                }
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '=', i9, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str2.substring(i9, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i9, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i9 = iIndexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m14021k(List list, StringBuilder out) {
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
        public final void m14022l(Buffer buffer, String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            int iCharCount = i9;
            Buffer buffer2 = null;
            while (iCharCount < i10) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        buffer.writeUtf8(z9 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z12)) {
                            if (!StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null) && (iCodePointAt != 37 || (z9 && (!z10 || m14016e(str, iCharCount, i10))))) {
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
                            int i11 = b10 & UByte.MAX_VALUE;
                            buffer.writeByte(37);
                            buffer.writeByte((int) C8919r.f14797l[(i11 >> 4) & 15]);
                            buffer.writeByte((int) C8919r.f14797l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        /* renamed from: m */
        public final void m14023m(Buffer buffer, String str, int i9, int i10, boolean z9) {
            int i11;
            while (i9 < i10) {
                int iCodePointAt = str.codePointAt(i9);
                if (iCodePointAt == 37 && (i11 = i9 + 2) < i10) {
                    int iM14466H = AbstractC9045d.m14466H(str.charAt(i9 + 1));
                    int iM14466H2 = AbstractC9045d.m14466H(str.charAt(i11));
                    if (iM14466H == -1 || iM14466H2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i9 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((iM14466H << 4) + iM14466H2);
                        i9 = Character.charCount(iCodePointAt) + i11;
                    }
                } else if (iCodePointAt == 43 && z9) {
                    buffer.writeByte(32);
                    i9++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i9 += Character.charCount(iCodePointAt);
                }
            }
        }

        public b() {
        }
    }

    public C8919r(String scheme, String username, String password, String host, int i9, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f14798a = scheme;
        this.f14799b = username;
        this.f14800c = password;
        this.f14801d = host;
        this.f14802e = i9;
        this.f14803f = pathSegments;
        this.f14804g = list;
        this.f14805h = str;
        this.f14806i = url;
        this.f14807j = Intrinsics.areEqual(scheme, "https");
    }

    /* renamed from: h */
    public static final C8919r m13959h(String str) {
        return f14796k.m14015d(str);
    }

    /* renamed from: b */
    public final String m13960b() {
        if (this.f14805h == null) {
            return null;
        }
        String strSubstring = this.f14806i.substring(StringsKt.indexOf$default((CharSequence) this.f14806i, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m13961c() {
        if (this.f14800c.length() == 0) {
            return "";
        }
        String strSubstring = this.f14806i.substring(StringsKt.indexOf$default((CharSequence) this.f14806i, ':', this.f14798a.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.f14806i, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: d */
    public final String m13962d() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f14806i, '/', this.f14798a.length() + 3, false, 4, (Object) null);
        String str = this.f14806i;
        String strSubstring = this.f14806i.substring(iIndexOf$default, AbstractC9045d.m14501q(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final List m13963e() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f14806i, '/', this.f14798a.length() + 3, false, 4, (Object) null);
        String str = this.f14806i;
        int iM14501q = AbstractC9045d.m14501q(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iM14501q) {
            int i9 = iIndexOf$default + 1;
            int iM14500p = AbstractC9045d.m14500p(this.f14806i, '/', i9, iM14501q);
            String strSubstring = this.f14806i.substring(i9, iM14500p);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iM14500p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8919r) && Intrinsics.areEqual(((C8919r) obj).f14806i, this.f14806i);
    }

    /* renamed from: f */
    public final String m13964f() {
        if (this.f14804g == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f14806i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f14806i;
        String strSubstring = this.f14806i.substring(iIndexOf$default, AbstractC9045d.m14500p(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: g */
    public final String m13965g() {
        if (this.f14799b.length() == 0) {
            return "";
        }
        int length = this.f14798a.length() + 3;
        String str = this.f14806i;
        String strSubstring = this.f14806i.substring(length, AbstractC9045d.m14501q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f14806i.hashCode();
    }

    /* renamed from: i */
    public final String m13966i() {
        return this.f14801d;
    }

    /* renamed from: j */
    public final boolean m13967j() {
        return this.f14807j;
    }

    /* renamed from: k */
    public final a m13968k() {
        a aVar = new a();
        aVar.m14001x(this.f14798a);
        aVar.m13998u(m13965g());
        aVar.m13997t(m13961c());
        aVar.m13999v(this.f14801d);
        aVar.m14000w(this.f14802e != f14796k.m14014c(this.f14798a) ? this.f14802e : -1);
        aVar.m13984g().clear();
        aVar.m13984g().addAll(m13963e());
        aVar.m13983f(m13964f());
        aVar.m13996s(m13960b());
        return aVar;
    }

    /* renamed from: l */
    public final a m13969l(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().m13988k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m13970m() {
        return this.f14803f;
    }

    /* renamed from: n */
    public final int m13971n() {
        return this.f14802e;
    }

    /* renamed from: o */
    public final String m13972o() {
        if (this.f14804g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f14796k.m14021k(this.f14804g, sb);
        return sb.toString();
    }

    /* renamed from: p */
    public final String m13973p() {
        a aVarM13969l = m13969l("/...");
        Intrinsics.checkNotNull(aVarM13969l);
        return aVarM13969l.m14002y("").m13989l("").m13981d().toString();
    }

    /* renamed from: q */
    public final C8919r m13974q(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarM13969l = m13969l(link);
        if (aVarM13969l != null) {
            return aVarM13969l.m13981d();
        }
        return null;
    }

    /* renamed from: r */
    public final String m13975r() {
        return this.f14798a;
    }

    /* renamed from: s */
    public final URI m13976s() {
        String string = m13968k().m13993p().toString();
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
    public final URL m13977t() {
        try {
            return new URL(this.f14806i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f14806i;
    }
}
