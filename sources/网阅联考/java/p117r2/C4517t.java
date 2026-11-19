package p117r2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import okio.Buffer;
import p121s2.AbstractC4549a;
import p121s2.AbstractC4550b;

/* renamed from: r2.t */
/* loaded from: classes2.dex */
public final class C4517t {

    /* renamed from: a */
    public final boolean f5537a;

    /* renamed from: b */
    public final String f5538b;

    /* renamed from: c */
    public final String f5539c;

    /* renamed from: d */
    public final String f5540d;

    /* renamed from: e */
    public final String f5541e;

    /* renamed from: f */
    public final int f5542f;

    /* renamed from: g */
    public final List f5543g;

    /* renamed from: h */
    public final List f5544h;

    /* renamed from: i */
    public final String f5545i;

    /* renamed from: j */
    public final String f5546j;

    /* renamed from: l */
    public static final b f5536l = new b(null);

    /* renamed from: k */
    public static final char[] f5535k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: r2.t$a */
    public static final class a {

        /* renamed from: i */
        public static final C4769a f5547i = new C4769a(null);

        /* renamed from: a */
        public String f5548a;

        /* renamed from: d */
        public String f5551d;

        /* renamed from: f */
        public final List f5553f;

        /* renamed from: g */
        public List f5554g;

        /* renamed from: h */
        public String f5555h;

        /* renamed from: b */
        public String f5549b = "";

        /* renamed from: c */
        public String f5550c = "";

        /* renamed from: e */
        public int f5552e = -1;

        /* renamed from: r2.t$a$a, reason: collision with other inner class name */
        public static final class C4769a {
            public C4769a() {
            }

            public /* synthetic */ C4769a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: e */
            public final int m6028e(String str, int i4, int i5) throws NumberFormatException {
                try {
                    int i6 = Integer.parseInt(b.m6032b(C4517t.f5536l, str, i4, i5, "", false, false, false, false, null, 248, null));
                    if (1 <= i6 && 65535 >= i6) {
                        return i6;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* renamed from: f */
            public final int m6029f(String str, int i4, int i5) {
                while (i4 < i5) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt == ':') {
                        return i4;
                    }
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < i5) {
                            }
                        } while (str.charAt(i4) != ']');
                    }
                    i4++;
                }
                return i5;
            }

            /* renamed from: g */
            public final int m6030g(String str, int i4, int i5) {
                if (i5 - i4 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i4);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i4++;
                    if (i4 >= i5) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i4);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i4;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* renamed from: h */
            public final int m6031h(String str, int i4, int i5) {
                int i6 = 0;
                while (i4 < i5) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i6++;
                    i4++;
                }
                return i6;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5553f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final a m5999a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f5554g == null) {
                this.f5554g = new ArrayList();
            }
            List list = this.f5554g;
            Intrinsics.checkNotNull(list);
            b bVar = C4517t.f5536l;
            list.add(b.m6032b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.f5554g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m6032b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m6000b(String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            m6013o(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m6001c(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f5554g == null) {
                this.f5554g = new ArrayList();
            }
            List list = this.f5554g;
            Intrinsics.checkNotNull(list);
            b bVar = C4517t.f5536l;
            list.add(b.m6032b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f5554g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.m6032b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C4517t m6002d() {
            ArrayList arrayList;
            String str = this.f5548a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C4517t.f5536l;
            String strM6033h = b.m6033h(bVar, this.f5549b, 0, 0, false, 7, null);
            String strM6033h2 = b.m6033h(bVar, this.f5550c, 0, 0, false, 7, null);
            String str2 = this.f5551d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM6003e = m6003e();
            List list = this.f5553f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m6033h(C4517t.f5536l, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f5554g;
            if (list2 != null) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? b.m6033h(C4517t.f5536l, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f5555h;
            return new C4517t(str, strM6033h, strM6033h2, str2, iM6003e, arrayList2, arrayList, str4 != null ? b.m6033h(C4517t.f5536l, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* renamed from: e */
        public final int m6003e() {
            int i4 = this.f5552e;
            if (i4 != -1) {
                return i4;
            }
            b bVar = C4517t.f5536l;
            String str = this.f5548a;
            Intrinsics.checkNotNull(str);
            return bVar.m6035c(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p117r2.C4517t.a m6004f(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                r2.t$b r12 = p117r2.C4517t.f5536l
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = p117r2.C4517t.b.m6032b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.m6041j(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.f5554g = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4517t.a.m6004f(java.lang.String):r2.t$a");
        }

        /* renamed from: g */
        public final List m6005g() {
            return this.f5553f;
        }

        /* renamed from: h */
        public final a m6006h(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strM6197e = AbstractC4549a.m6197e(b.m6033h(C4517t.f5536l, host, 0, 0, false, 7, null));
            if (strM6197e != null) {
                this.f5551d = strM6197e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m6007i(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt__StringsJVMKt.equals(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m6008j(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt__StringsJVMKt.equals(str, "%2e.", true) || StringsKt__StringsJVMKt.equals(str, ".%2e", true) || StringsKt__StringsJVMKt.equals(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m6009k(C4517t c4517t, String input) throws NumberFormatException {
            int iM6232n;
            int i4;
            int i5;
            String str;
            boolean z3;
            int i6;
            String str2;
            int i7;
            boolean z4;
            boolean z5;
            Intrinsics.checkNotNullParameter(input, "input");
            int iM6242x = AbstractC4550b.m6242x(input, 0, 0, 3, null);
            int iM6244z = AbstractC4550b.m6244z(input, iM6242x, 0, 2, null);
            C4769a c4769a = f5547i;
            int iM6030g = c4769a.m6030g(input, iM6242x, iM6244z);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z6 = true;
            char c4 = 65535;
            if (iM6030g != -1) {
                if (StringsKt__StringsJVMKt.startsWith(input, "https:", iM6242x, true)) {
                    this.f5548a = "https";
                    iM6242x += 6;
                } else {
                    if (!StringsKt__StringsJVMKt.startsWith(input, "http:", iM6242x, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM6030g);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f5548a = "http";
                    iM6242x += 5;
                }
            } else {
                if (c4517t == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f5548a = c4517t.m5996r();
            }
            int iM6031h = c4769a.m6031h(input, iM6242x, iM6244z);
            char c5 = '?';
            char c6 = '#';
            if (iM6031h >= 2 || c4517t == null || (!Intrinsics.areEqual(c4517t.m5996r(), this.f5548a))) {
                int i8 = iM6242x + iM6031h;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    iM6232n = AbstractC4550b.m6232n(input, "@/\\?#", i8, iM6244z);
                    char cCharAt = iM6232n != iM6244z ? input.charAt(iM6232n) : c4;
                    if (cCharAt == c4 || cCharAt == c6 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c5) {
                        break;
                    }
                    if (cCharAt != '@') {
                        z3 = z6;
                        str2 = str3;
                        i6 = iM6244z;
                    } else {
                        if (z7) {
                            z3 = z6;
                            i6 = iM6244z;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f5550c);
                            sb2.append("%40");
                            str2 = str3;
                            i7 = iM6232n;
                            sb2.append(b.m6032b(C4517t.f5536l, input, i8, iM6232n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f5550c = sb2.toString();
                            z4 = z8;
                        } else {
                            int iM6231m = AbstractC4550b.m6231m(input, ':', i8, iM6232n);
                            b bVar = C4517t.f5536l;
                            z3 = z6;
                            i6 = iM6244z;
                            String str4 = str3;
                            String strM6032b = b.m6032b(bVar, input, i8, iM6231m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                strM6032b = this.f5549b + "%40" + strM6032b;
                            }
                            this.f5549b = strM6032b;
                            if (iM6231m != iM6232n) {
                                this.f5550c = b.m6032b(bVar, input, iM6231m + 1, iM6232n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z5 = z3;
                            } else {
                                z5 = z7;
                            }
                            z7 = z5;
                            str2 = str4;
                            z4 = z3;
                            i7 = iM6232n;
                        }
                        i8 = i7 + 1;
                        z8 = z4;
                    }
                    str3 = str2;
                    z6 = z3;
                    iM6244z = i6;
                    c6 = '#';
                    c5 = '?';
                    c4 = 65535;
                }
                boolean z9 = z6;
                String str5 = str3;
                i4 = iM6244z;
                C4769a c4769a2 = f5547i;
                int iM6029f = c4769a2.m6029f(input, i8, iM6232n);
                int i9 = iM6029f + 1;
                if (i9 < iM6232n) {
                    i5 = i8;
                    this.f5551d = AbstractC4549a.m6197e(b.m6033h(C4517t.f5536l, input, i8, iM6029f, false, 4, null));
                    int iM6028e = c4769a2.m6028e(input, i9, iM6232n);
                    this.f5552e = iM6028e;
                    if (!(iM6028e != -1 ? z9 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i9, iM6232n);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i5 = i8;
                    str = str5;
                    b bVar2 = C4517t.f5536l;
                    this.f5551d = AbstractC4549a.m6197e(b.m6033h(bVar2, input, i5, iM6029f, false, 4, null));
                    String str6 = this.f5548a;
                    Intrinsics.checkNotNull(str6);
                    this.f5552e = bVar2.m6035c(str6);
                }
                if (!(this.f5551d != null ? z9 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i5, iM6029f);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append(Typography.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM6242x = iM6232n;
            } else {
                this.f5549b = c4517t.m5986g();
                this.f5550c = c4517t.m5982c();
                this.f5551d = c4517t.m5987i();
                this.f5552e = c4517t.m5992n();
                this.f5553f.clear();
                this.f5553f.addAll(c4517t.m5984e());
                if (iM6242x == iM6244z || input.charAt(iM6242x) == '#') {
                    m6004f(c4517t.m5985f());
                }
                i4 = iM6244z;
            }
            int i10 = i4;
            int iM6232n2 = AbstractC4550b.m6232n(input, "?#", iM6242x, i10);
            m6015q(input, iM6242x, iM6232n2);
            if (iM6232n2 < i10 && input.charAt(iM6232n2) == '?') {
                int iM6231m2 = AbstractC4550b.m6231m(input, '#', iM6232n2, i10);
                b bVar3 = C4517t.f5536l;
                this.f5554g = bVar3.m6041j(b.m6032b(bVar3, input, iM6232n2 + 1, iM6231m2, " \"'<>#", true, false, true, false, null, 208, null));
                iM6232n2 = iM6231m2;
            }
            if (iM6232n2 < i10 && input.charAt(iM6232n2) == '#') {
                this.f5555h = b.m6032b(C4517t.f5536l, input, iM6232n2 + 1, i10, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: l */
        public final a m6010l(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f5550c = b.m6032b(C4517t.f5536l, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: m */
        public final void m6011m() {
            List list = this.f5553f;
            if (!(((String) list.remove(list.size() - 1)).length() == 0) || !(!this.f5553f.isEmpty())) {
                this.f5553f.add("");
            } else {
                List list2 = this.f5553f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* renamed from: n */
        public final a m6012n(int i4) {
            if (1 <= i4 && 65535 >= i4) {
                this.f5552e = i4;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i4).toString());
        }

        /* renamed from: o */
        public final void m6013o(String str, int i4, int i5, boolean z3, boolean z4) {
            String strM6032b = b.m6032b(C4517t.f5536l, str, i4, i5, " \"<>^`{}|/\\?#", z4, false, false, false, null, 240, null);
            if (m6007i(strM6032b)) {
                return;
            }
            if (m6008j(strM6032b)) {
                m6011m();
                return;
            }
            List list = this.f5553f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f5553f;
                list2.set(list2.size() - 1, strM6032b);
            } else {
                this.f5553f.add(strM6032b);
            }
            if (z3) {
                this.f5553f.add("");
            }
        }

        /* renamed from: p */
        public final a m6014p() {
            String str = this.f5551d;
            this.f5551d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f5553f.size();
            for (int i4 = 0; i4 < size; i4++) {
                List list = this.f5553f;
                list.set(i4, b.m6032b(C4517t.f5536l, (String) list.get(i4), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f5554g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = (String) list2.get(i5);
                    list2.set(i5, str2 != null ? b.m6032b(C4517t.f5536l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f5555h;
            this.f5555h = str3 != null ? b.m6032b(C4517t.f5536l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* renamed from: q */
        public final void m6015q(String str, int i4, int i5) {
            if (i4 == i5) {
                return;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f5553f.clear();
                this.f5553f.add("");
                i4++;
            } else {
                List list = this.f5553f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i6 = i4;
                if (i6 >= i5) {
                    return;
                }
                i4 = AbstractC4550b.m6232n(str, "/\\", i6, i5);
                boolean z3 = i4 < i5;
                m6013o(str, i6, i4, z3, true);
                if (z3) {
                    i4++;
                }
            }
        }

        /* renamed from: r */
        public final a m6016r(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt__StringsJVMKt.equals(scheme, "http", true)) {
                this.f5548a = "http";
            } else {
                if (!StringsKt__StringsJVMKt.equals(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.f5548a = "https";
            }
            return this;
        }

        /* renamed from: s */
        public final void m6017s(String str) {
            this.f5555h = str;
        }

        /* renamed from: t */
        public final void m6018t(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f5550c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f5548a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f5549b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f5550c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f5549b
                r0.append(r1)
                java.lang.String r1 = r6.f5550c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f5550c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f5551d
                if (r1 == 0) goto L77
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f5551d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.f5551d
                r0.append(r1)
            L77:
                int r1 = r6.f5552e
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.f5548a
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.m6003e()
                java.lang.String r2 = r6.f5548a
                if (r2 == 0) goto L93
                r2.t$b r3 = p117r2.C4517t.f5536l
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r2 = r3.m6035c(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                r2.t$b r1 = p117r2.C4517t.f5536l
                java.util.List r2 = r6.f5553f
                r1.m6040i(r2, r0)
                java.util.List r2 = r6.f5554g
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f5554g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.m6042k(r2, r0)
            Lb1:
                java.lang.String r1 = r6.f5555h
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f5555h
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4517t.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m6019u(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f5549b = str;
        }

        /* renamed from: v */
        public final void m6020v(String str) {
            this.f5551d = str;
        }

        /* renamed from: w */
        public final void m6021w(int i4) {
            this.f5552e = i4;
        }

        /* renamed from: x */
        public final void m6022x(String str) {
            this.f5548a = str;
        }

        /* renamed from: y */
        public final a m6023y(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f5549b = b.m6032b(C4517t.f5536l, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* renamed from: r2.t$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m6032b(b bVar, String str, int i4, int i5, String str2, boolean z3, boolean z4, boolean z5, boolean z6, Charset charset, int i6, Object obj) {
            return bVar.m6034a(str, (i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? str.length() : i5, str2, (i6 & 8) != 0 ? false : z3, (i6 & 16) != 0 ? false : z4, (i6 & 32) != 0 ? false : z5, (i6 & 64) != 0 ? false : z6, (i6 & 128) != 0 ? null : charset);
        }

        /* renamed from: h */
        public static /* synthetic */ String m6033h(b bVar, String str, int i4, int i5, boolean z3, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z3 = false;
            }
            return bVar.m6039g(str, i4, i5, z3);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String m6034a(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.m6037e(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                okio.Buffer r12 = new okio.Buffer
                r12.<init>()
                r0 = r15
                r12.writeUtf8(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.m6043l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.readUtf8()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4517t.b.m6034a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        /* renamed from: c */
        public final int m6035c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: d */
        public final C4517t m6036d(String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            return new a().m6009k(null, toHttpUrl).m6002d();
        }

        /* renamed from: e */
        public final boolean m6037e(String str, int i4, int i5) {
            int i6 = i4 + 2;
            return i6 < i5 && str.charAt(i4) == '%' && AbstractC4550b.m6201D(str.charAt(i4 + 1)) != -1 && AbstractC4550b.m6201D(str.charAt(i6)) != -1;
        }

        /* renamed from: f */
        public final C4517t m6038f(String toHttpUrlOrNull) {
            Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return m6036d(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m6039g(String percentDecode, int i4, int i5, boolean z3) {
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            for (int i6 = i4; i6 < i5; i6++) {
                char cCharAt = percentDecode.charAt(i6);
                if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i4, i6);
                    m6044m(buffer, percentDecode, i6, i5, z3);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = percentDecode.substring(i4, i5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: i */
        public final void m6040i(List toPathString, StringBuilder out) {
            Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i4 = 0; i4 < size; i4++) {
                out.append('/');
                out.append((String) toPathString.get(i4));
            }
        }

        /* renamed from: j */
        public final List m6041j(String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= toQueryNamesAndValues.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, Typography.amp, i4, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = toQueryNamesAndValues.length();
                }
                int i5 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, '=', i4, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i5) {
                    String strSubstring = toQueryNamesAndValues.substring(i4, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i4, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iIndexOf$default2 + 1, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i4 = i5 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m6042k(List toQueryString, StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, toQueryString.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = (String) toQueryString.get(first);
                String str2 = (String) toQueryString.get(first + 1);
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

        /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[LOOP:1: B:51:0x008d->B:53:0x0093, LOOP_END] */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m6043l(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc5
                if (r1 == 0) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2b
                r8 = 9
                if (r7 == r8) goto L26
                r8 = 10
                if (r7 == r8) goto L26
                r8 = 12
                if (r7 == r8) goto L26
                r8 = 13
                if (r7 == r8) goto L26
                goto L2b
            L26:
                r8 = r14
                r12 = r19
                goto Lb5
            L2b:
                r8 = 43
                if (r7 != r8) goto L3c
                if (r22 == 0) goto L3c
                if (r20 == 0) goto L36
                java.lang.String r8 = "+"
                goto L38
            L36:
                java.lang.String r8 = "%2B"
            L38:
                r15.writeUtf8(r8)
                goto L26
            L3c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6c
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4c
                if (r23 == 0) goto L6c
            L4c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.StringsKt.contains$default(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6a
                if (r7 != r9) goto L65
                if (r20 == 0) goto L6a
                if (r21 == 0) goto L65
                r8 = r14
                boolean r10 = r14.m6037e(r1, r5, r2)
                if (r10 != 0) goto L66
                goto L6f
            L65:
                r8 = r14
            L66:
                r15.writeUtf8CodePoint(r7)
                goto Lb5
            L6a:
                r8 = r14
                goto L6f
            L6c:
                r8 = r14
                r12 = r19
            L6f:
                if (r6 != 0) goto L76
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.writeString(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.writeUtf8CodePoint(r7)
            L8d:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = p117r2.C4517t.m5979a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = p117r2.C4517t.m5979a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4517t.b.m6043l(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        public final void m6044m(Buffer buffer, String str, int i4, int i5, boolean z3) {
            int i6;
            while (i4 < i5) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i4);
                if (iCodePointAt == 37 && (i6 = i4 + 2) < i5) {
                    int iM6201D = AbstractC4550b.m6201D(str.charAt(i4 + 1));
                    int iM6201D2 = AbstractC4550b.m6201D(str.charAt(i6));
                    if (iM6201D == -1 || iM6201D2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i4 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((iM6201D << 4) + iM6201D2);
                        i4 = Character.charCount(iCodePointAt) + i6;
                    }
                } else if (iCodePointAt == 43 && z3) {
                    buffer.writeByte(32);
                    i4++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i4 += Character.charCount(iCodePointAt);
                }
            }
        }
    }

    public C4517t(String scheme, String username, String password, String host, int i4, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f5538b = scheme;
        this.f5539c = username;
        this.f5540d = password;
        this.f5541e = host;
        this.f5542f = i4;
        this.f5543g = pathSegments;
        this.f5544h = list;
        this.f5545i = str;
        this.f5546j = url;
        this.f5537a = Intrinsics.areEqual(scheme, "https");
    }

    /* renamed from: h */
    public static final C4517t m5980h(String str) {
        return f5536l.m6036d(str);
    }

    /* renamed from: b */
    public final String m5981b() {
        if (this.f5545i == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, '#', 0, false, 6, (Object) null) + 1;
        String str = this.f5546j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m5982c() {
        if (this.f5540d.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, ':', this.f5538b.length() + 3, false, 4, (Object) null) + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, '@', 0, false, 6, (Object) null);
        String str = this.f5546j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: d */
    public final String m5983d() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, '/', this.f5538b.length() + 3, false, 4, (Object) null);
        String str = this.f5546j;
        int iM6232n = AbstractC4550b.m6232n(str, "?#", iIndexOf$default, str.length());
        String str2 = this.f5546j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iM6232n);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final List m5984e() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, '/', this.f5538b.length() + 3, false, 4, (Object) null);
        String str = this.f5546j;
        int iM6232n = AbstractC4550b.m6232n(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iM6232n) {
            int i4 = iIndexOf$default + 1;
            int iM6231m = AbstractC4550b.m6231m(this.f5546j, '/', i4, iM6232n);
            String str2 = this.f5546j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i4, iM6231m);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iM6231m;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4517t) && Intrinsics.areEqual(((C4517t) obj).f5546j, this.f5546j);
    }

    /* renamed from: f */
    public final String m5985f() {
        if (this.f5544h == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f5546j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f5546j;
        int iM6231m = AbstractC4550b.m6231m(str, '#', iIndexOf$default, str.length());
        String str2 = this.f5546j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iM6231m);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: g */
    public final String m5986g() {
        if (this.f5539c.length() == 0) {
            return "";
        }
        int length = this.f5538b.length() + 3;
        String str = this.f5546j;
        int iM6232n = AbstractC4550b.m6232n(str, ":@", length, str.length());
        String str2 = this.f5546j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iM6232n);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f5546j.hashCode();
    }

    /* renamed from: i */
    public final String m5987i() {
        return this.f5541e;
    }

    /* renamed from: j */
    public final boolean m5988j() {
        return this.f5537a;
    }

    /* renamed from: k */
    public final a m5989k() {
        a aVar = new a();
        aVar.m6022x(this.f5538b);
        aVar.m6019u(m5986g());
        aVar.m6018t(m5982c());
        aVar.m6020v(this.f5541e);
        aVar.m6021w(this.f5542f != f5536l.m6035c(this.f5538b) ? this.f5542f : -1);
        aVar.m6005g().clear();
        aVar.m6005g().addAll(m5984e());
        aVar.m6004f(m5985f());
        aVar.m6017s(m5981b());
        return aVar;
    }

    /* renamed from: l */
    public final a m5990l(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().m6009k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m5991m() {
        return this.f5543g;
    }

    /* renamed from: n */
    public final int m5992n() {
        return this.f5542f;
    }

    /* renamed from: o */
    public final String m5993o() {
        if (this.f5544h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f5536l.m6042k(this.f5544h, sb);
        return sb.toString();
    }

    /* renamed from: p */
    public final String m5994p() {
        a aVarM5990l = m5990l("/...");
        Intrinsics.checkNotNull(aVarM5990l);
        return aVarM5990l.m6023y("").m6010l("").m6002d().toString();
    }

    /* renamed from: q */
    public final C4517t m5995q(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarM5990l = m5990l(link);
        if (aVarM5990l != null) {
            return aVarM5990l.m6002d();
        }
        return null;
    }

    /* renamed from: r */
    public final String m5996r() {
        return this.f5538b;
    }

    /* renamed from: s */
    public final URI m5997s() {
        String string = m5989k().m6014p().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* renamed from: t */
    public final URL m5998t() {
        try {
            return new URL(this.f5546j);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        return this.f5546j;
    }
}
