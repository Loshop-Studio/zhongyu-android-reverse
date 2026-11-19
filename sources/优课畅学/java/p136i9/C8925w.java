package p136i9;

import com.tencent.smtt.sdk.TbsListener;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8665e0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p147j9.AbstractC9036f;
import p147j9.AbstractC9038h;
import p313y9.AbstractC10683a;

/* renamed from: i9.w */
/* loaded from: classes5.dex */
public final class C8925w {

    /* renamed from: j */
    public static final b f16797j = new b(null);

    /* renamed from: a */
    public final String f16798a;

    /* renamed from: b */
    public final String f16799b;

    /* renamed from: c */
    public final String f16800c;

    /* renamed from: d */
    public final String f16801d;

    /* renamed from: e */
    public final int f16802e;

    /* renamed from: f */
    public final List f16803f;

    /* renamed from: g */
    public final List f16804g;

    /* renamed from: h */
    public final String f16805h;

    /* renamed from: i */
    public final String f16806i;

    /* renamed from: i9.w$a */
    public static final class a {

        /* renamed from: a */
        public String f16807a;

        /* renamed from: d */
        public String f16810d;

        /* renamed from: g */
        public List f16813g;

        /* renamed from: h */
        public String f16814h;

        /* renamed from: b */
        public String f16808b = "";

        /* renamed from: c */
        public String f16809c = "";

        /* renamed from: e */
        public int f16811e = -1;

        /* renamed from: f */
        public final List f16812f = AbstractC8809v.m14776s("");

        /* renamed from: A */
        public final void m15296A(String str) {
            this.f16807a = str;
        }

        /* renamed from: B */
        public final int m15297B(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        /* renamed from: C */
        public final void m15298C(List list, StringBuilder sb) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append('/');
                sb.append((String) list.get(i10));
            }
        }

        /* renamed from: D */
        public final List m15299D(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iM13990e0 = AbstractC8661c0.m13990e0(str2, '&', i10, false, 4, null);
                if (iM13990e0 == -1) {
                    iM13990e0 = str2.length();
                }
                int iM13990e02 = AbstractC8661c0.m13990e0(str2, '=', i10, false, 4, null);
                if (iM13990e02 == -1 || iM13990e02 > iM13990e0) {
                    String strSubstring = str2.substring(i10, iM13990e0);
                    AbstractC9133u.m16132f(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iM13990e02);
                    AbstractC9133u.m16132f(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iM13990e02 + 1, iM13990e0);
                    AbstractC9133u.m16132f(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iM13990e0 + 1;
                str = str2;
            }
            return arrayList;
        }

        /* renamed from: E */
        public final a m15300E(String username) {
            AbstractC9133u.m16133g(username, "username");
            this.f16808b = AbstractC10683a.m19971b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, null);
            return this;
        }

        /* renamed from: a */
        public final a m15301a(String encodedName, String str) {
            AbstractC9133u.m16133g(encodedName, "encodedName");
            if (this.f16813g == null) {
                this.f16813g = new ArrayList();
            }
            List list = this.f16813g;
            AbstractC9133u.m16130d(list);
            list.add(AbstractC10683a.m19971b(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
            List list2 = this.f16813g;
            AbstractC9133u.m16130d(list2);
            list2.add(str != null ? AbstractC10683a.m19971b(str, 0, 0, " \"'<>#&=", true, false, true, false, 83, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m15302b(String pathSegment) {
            AbstractC9133u.m16133g(pathSegment, "pathSegment");
            m15317q(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m15303c(String name, String str) {
            AbstractC9133u.m16133g(name, "name");
            if (this.f16813g == null) {
                this.f16813g = new ArrayList();
            }
            List list = this.f16813g;
            AbstractC9133u.m16130d(list);
            list.add(AbstractC10683a.m19971b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            List list2 = this.f16813g;
            AbstractC9133u.m16130d(list2);
            list2.add(str != null ? AbstractC10683a.m19971b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C8925w m15304d() {
            ArrayList arrayList;
            String str = this.f16807a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strM19976g = AbstractC10683a.m19976g(this.f16808b, 0, 0, false, 7, null);
            String strM19976g2 = AbstractC10683a.m19976g(this.f16809c, 0, 0, false, 7, null);
            String str2 = this.f16810d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM15305e = m15305e();
            List list = this.f16812f;
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC10683a.m19976g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f16813g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? AbstractC10683a.m19976g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f16814h;
            return new C8925w(str, strM19976g, strM19976g2, str2, iM15305e, arrayList2, arrayList, str4 != null ? AbstractC10683a.m19976g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        /* renamed from: e */
        public final int m15305e() {
            int i10 = this.f16811e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = C8925w.f16797j;
            String str = this.f16807a;
            AbstractC9133u.m16130d(str);
            return bVar.m15328b(str);
        }

        /* renamed from: f */
        public final a m15306f(String str) {
            String strM19971b;
            this.f16813g = (str == null || (strM19971b = AbstractC10683a.m19971b(str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : m15299D(strM19971b);
            return this;
        }

        /* renamed from: g */
        public final List m15307g() {
            return this.f16812f;
        }

        /* renamed from: h */
        public final a m15308h(String host) {
            AbstractC9133u.m16133g(host, "host");
            String strM15738k = AbstractC9036f.m15738k(AbstractC10683a.m19976g(host, 0, 0, false, 7, null));
            if (strM15738k != null) {
                this.f16810d = strM15738k;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m15309i(String str) {
            return AbstractC9133u.m16128b(str, ".") || AbstractC8687z.m14093A(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m15310j(String str) {
            return AbstractC9133u.m16128b(str, "..") || AbstractC8687z.m14093A(str, "%2e.", true) || AbstractC8687z.m14093A(str, ".%2e", true) || AbstractC8687z.m14093A(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m15311k(C8925w c8925w, String str) throws NumberFormatException {
            int iM15753i;
            boolean z10;
            int i10;
            int i11;
            char c10;
            String input = str;
            AbstractC9133u.m16133g(input, "input");
            int iM15760p = AbstractC9038h.m15760p(input, 0, 0, 3, null);
            int iM15762r = AbstractC9038h.m15762r(input, iM15760p, 0, 2, null);
            int iM15321u = m15321u(input, iM15760p, iM15762r);
            boolean z11 = true;
            if (iM15321u != -1) {
                if (AbstractC8687z.m14102J(input, "https:", iM15760p, true)) {
                    this.f16807a = "https";
                    iM15760p += 6;
                } else {
                    if (!AbstractC8687z.m14102J(input, "http:", iM15760p, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM15321u);
                        AbstractC9133u.m16132f(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f16807a = "http";
                    iM15760p += 5;
                }
            } else {
                if (c8925w == null) {
                    if (input.length() > 6) {
                        input = AbstractC8665e0.m14033a1(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.f16807a = c8925w.m15293q();
            }
            int iM15297B = m15297B(input, iM15760p, iM15762r);
            char c11 = '?';
            char c12 = '#';
            if (iM15297B >= 2 || c8925w == null || !AbstractC9133u.m16128b(c8925w.m15293q(), this.f16807a)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iM15760p + iM15297B;
                while (true) {
                    iM15753i = AbstractC9038h.m15753i(input, "@/\\?#", i12, iM15762r);
                    char cCharAt = iM15753i != iM15762r ? input.charAt(iM15753i) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c12 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c11) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f16809c);
                            sb2.append("%40");
                            input = str;
                            i10 = iM15753i;
                            sb2.append(AbstractC10683a.m19971b(input, i12, iM15753i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null));
                            this.f16809c = sb2.toString();
                        } else {
                            int iM15752h = AbstractC9038h.m15752h(input, ':', i12, iM15753i);
                            z10 = z11;
                            String strM19971b = AbstractC10683a.m19971b(input, i12, iM15752h, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null);
                            if (z13) {
                                strM19971b = this.f16808b + "%40" + strM19971b;
                            }
                            this.f16808b = strM19971b;
                            if (iM15752h != iM15753i) {
                                i11 = iM15753i;
                                this.f16809c = AbstractC10683a.m19971b(str, iM15752h + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null);
                                z12 = z10;
                            } else {
                                i11 = iM15753i;
                            }
                            input = str;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iM15316p = m15316p(input, i12, iM15753i);
                int i13 = iM15316p + 1;
                if (i13 < iM15753i) {
                    this.f16810d = AbstractC9036f.m15738k(AbstractC10683a.m19976g(input, i12, iM15316p, false, 4, null));
                    int iM15312l = m15312l(input, i13, iM15753i);
                    this.f16811e = iM15312l;
                    if (iM15312l == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i13, iM15753i);
                        AbstractC9133u.m16132f(strSubstring2, "substring(...)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    this.f16810d = AbstractC9036f.m15738k(AbstractC10683a.m19976g(input, i12, iM15316p, false, 4, null));
                    b bVar = C8925w.f16797j;
                    String str2 = this.f16807a;
                    AbstractC9133u.m16130d(str2);
                    this.f16811e = bVar.m15328b(str2);
                }
                if (this.f16810d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i12, iM15316p);
                    AbstractC9133u.m16132f(strSubstring3, "substring(...)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM15760p = iM15753i;
            } else {
                this.f16808b = c8925w.m15283f();
                this.f16809c = c8925w.m15279b();
                this.f16810d = c8925w.m15284h();
                this.f16811e = c8925w.m15289m();
                this.f16812f.clear();
                this.f16812f.addAll(c8925w.m15281d());
                if (iM15760p == iM15762r || input.charAt(iM15760p) == '#') {
                    m15306f(c8925w.m15282e());
                }
            }
            int iM15753i2 = AbstractC9038h.m15753i(input, "?#", iM15760p, iM15762r);
            m15319s(input, iM15760p, iM15753i2);
            if (iM15753i2 >= iM15762r || input.charAt(iM15753i2) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iM15752h2 = AbstractC9038h.m15752h(input, '#', iM15753i2, iM15762r);
                this.f16813g = m15299D(AbstractC10683a.m19971b(input, iM15753i2 + 1, iM15752h2, " \"'<>#", true, false, true, false, 80, null));
                iM15753i2 = iM15752h2;
            }
            if (iM15753i2 < iM15762r && input.charAt(iM15753i2) == c10) {
                this.f16814h = AbstractC10683a.m19971b(input, iM15753i2 + 1, iM15762r, "", true, false, false, true, 48, null);
            }
            return this;
        }

        /* renamed from: l */
        public final int m15312l(String str, int i10, int i11) throws NumberFormatException {
            int i12;
            try {
                i12 = Integer.parseInt(AbstractC10683a.m19971b(str, i10, i11, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i12 || i12 >= 65536) {
                return -1;
            }
            return i12;
        }

        /* renamed from: m */
        public final a m15313m(String password) {
            AbstractC9133u.m16133g(password, "password");
            this.f16809c = AbstractC10683a.m19971b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, null);
            return this;
        }

        /* renamed from: n */
        public final void m15314n() {
            if (((String) this.f16812f.remove(r0.size() - 1)).length() != 0 || this.f16812f.isEmpty()) {
                this.f16812f.add("");
            } else {
                this.f16812f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: o */
        public final a m15315o(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f16811e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* renamed from: p */
        public final int m15316p(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        /* renamed from: q */
        public final void m15317q(String str, int i10, int i11, boolean z10, boolean z11) {
            String strM19971b = AbstractC10683a.m19971b(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null);
            if (m15309i(strM19971b)) {
                return;
            }
            if (m15310j(strM19971b)) {
                m15314n();
                return;
            }
            if (((CharSequence) this.f16812f.get(r12.size() - 1)).length() == 0) {
                this.f16812f.set(r12.size() - 1, strM19971b);
            } else {
                this.f16812f.add(strM19971b);
            }
            if (z10) {
                this.f16812f.add("");
            }
        }

        /* renamed from: r */
        public final a m15318r() {
            String str = this.f16810d;
            this.f16810d = str != null ? new Regex("[\"<>^`{|}]").m16182i(str, "") : null;
            int size = this.f16812f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f16812f;
                list.set(i10, AbstractC10683a.m19971b((String) list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List list2 = this.f16813g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? AbstractC10683a.m19971b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f16814h;
            this.f16814h = str3 != null ? AbstractC10683a.m19971b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        /* renamed from: s */
        public final void m15319s(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f16812f.clear();
                this.f16812f.add("");
                i10++;
            } else {
                List list = this.f16812f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iM15753i = AbstractC9038h.m15753i(str, "/\\", i12, i11);
                boolean z10 = iM15753i < i11;
                String str2 = str;
                m15317q(str2, i12, iM15753i, z10, true);
                if (z10) {
                    i12 = iM15753i + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iM15753i;
                }
            }
        }

        /* renamed from: t */
        public final a m15320t(String scheme) {
            AbstractC9133u.m16133g(scheme, "scheme");
            if (AbstractC8687z.m14093A(scheme, "http", true)) {
                this.f16807a = "http";
                return this;
            }
            if (AbstractC8687z.m14093A(scheme, "https", true)) {
                this.f16807a = "https";
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
                java.lang.String r1 = r6.f16807a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f16808b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f16809c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f16808b
                r0.append(r1)
                java.lang.String r1 = r6.f16809c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f16809c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f16810d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = p113g8.AbstractC8661c0.m13971R(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f16810d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f16810d
                r0.append(r1)
            L69:
                int r1 = r6.f16811e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f16807a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.m15305e()
                java.lang.String r3 = r6.f16807a
                if (r3 == 0) goto L85
                i9.w$b r4 = p136i9.C8925w.f16797j
                kotlin.jvm.internal.AbstractC9133u.m16130d(r3)
                int r3 = r4.m15328b(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List r1 = r6.f16812f
                r6.m15298C(r1, r0)
                java.util.List r1 = r6.f16813g
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                i9.w$b r1 = p136i9.C8925w.f16797j
                java.util.List r2 = r6.f16813g
                kotlin.jvm.internal.AbstractC9133u.m16130d(r2)
                p136i9.C8925w.b.m15327a(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.f16814h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f16814h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p136i9.C8925w.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final int m15321u(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((AbstractC9133u.m16135i(cCharAt, 97) >= 0 && AbstractC9133u.m16135i(cCharAt, 122) <= 0) || (AbstractC9133u.m16135i(cCharAt, 65) >= 0 && AbstractC9133u.m16135i(cCharAt, 90) <= 0)) {
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

        /* renamed from: v */
        public final void m15322v(String str) {
            this.f16814h = str;
        }

        /* renamed from: w */
        public final void m15323w(String str) {
            AbstractC9133u.m16133g(str, "<set-?>");
            this.f16809c = str;
        }

        /* renamed from: x */
        public final void m15324x(String str) {
            AbstractC9133u.m16133g(str, "<set-?>");
            this.f16808b = str;
        }

        /* renamed from: y */
        public final void m15325y(String str) {
            this.f16810d = str;
        }

        /* renamed from: z */
        public final void m15326z(int i10) {
            this.f16811e = i10;
        }
    }

    /* renamed from: i9.w$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final int m15328b(String scheme) {
            AbstractC9133u.m16133g(scheme, "scheme");
            if (AbstractC9133u.m16128b(scheme, "http")) {
                return 80;
            }
            return AbstractC9133u.m16128b(scheme, "https") ? 443 : -1;
        }

        /* renamed from: c */
        public final C8925w m15329c(String str) {
            AbstractC9133u.m16133g(str, "<this>");
            return new a().m15311k(null, str).m15304d();
        }

        /* renamed from: d */
        public final C8925w m15330d(String str) {
            AbstractC9133u.m16133g(str, "<this>");
            try {
                return m15329c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public final void m15331e(List list, StringBuilder sb) {
            C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, list.size()), 2);
            int iM13496b = c8319dM13524s.m13496b();
            int iM13497c = c8319dM13524s.m13497c();
            int iM13498d = c8319dM13524s.m13498d();
            if ((iM13498d <= 0 || iM13496b > iM13497c) && (iM13498d >= 0 || iM13497c > iM13496b)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iM13496b);
                String str2 = (String) list.get(iM13496b + 1);
                if (iM13496b > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iM13496b == iM13497c) {
                    return;
                } else {
                    iM13496b += iM13498d;
                }
            }
        }

        public b() {
        }
    }

    public /* synthetic */ C8925w(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, AbstractC9126n abstractC9126n) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    /* renamed from: g */
    public static final C8925w m15277g(String str) {
        return f16797j.m15329c(str);
    }

    /* renamed from: a */
    public final String m15278a() {
        if (this.f16805h == null) {
            return null;
        }
        String strSubstring = this.f16806i.substring(AbstractC8661c0.m13990e0(this.f16806i, '#', 0, false, 6, null) + 1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m15279b() {
        if (this.f16800c.length() == 0) {
            return "";
        }
        String strSubstring = this.f16806i.substring(AbstractC8661c0.m13990e0(this.f16806i, ':', this.f16798a.length() + 3, false, 4, null) + 1, AbstractC8661c0.m13990e0(this.f16806i, '@', 0, false, 6, null));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m15280c() {
        int iM13990e0 = AbstractC8661c0.m13990e0(this.f16806i, '/', this.f16798a.length() + 3, false, 4, null);
        String str = this.f16806i;
        String strSubstring = this.f16806i.substring(iM13990e0, AbstractC9038h.m15753i(str, "?#", iM13990e0, str.length()));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public final List m15281d() {
        int iM13990e0 = AbstractC8661c0.m13990e0(this.f16806i, '/', this.f16798a.length() + 3, false, 4, null);
        String str = this.f16806i;
        int iM15753i = AbstractC9038h.m15753i(str, "?#", iM13990e0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM13990e0 < iM15753i) {
            int i10 = iM13990e0 + 1;
            int iM15752h = AbstractC9038h.m15752h(this.f16806i, '/', i10, iM15753i);
            String strSubstring = this.f16806i.substring(i10, iM15752h);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM13990e0 = iM15752h;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String m15282e() {
        if (this.f16804g == null) {
            return null;
        }
        int iM13990e0 = AbstractC8661c0.m13990e0(this.f16806i, '?', 0, false, 6, null) + 1;
        String str = this.f16806i;
        String strSubstring = this.f16806i.substring(iM13990e0, AbstractC9038h.m15752h(str, '#', iM13990e0, str.length()));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8925w) && AbstractC9133u.m16128b(((C8925w) obj).f16806i, this.f16806i);
    }

    /* renamed from: f */
    public final String m15283f() {
        if (this.f16799b.length() == 0) {
            return "";
        }
        int length = this.f16798a.length() + 3;
        String str = this.f16806i;
        String strSubstring = this.f16806i.substring(length, AbstractC9038h.m15753i(str, ":@", length, str.length()));
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h */
    public final String m15284h() {
        return this.f16801d;
    }

    public int hashCode() {
        return this.f16806i.hashCode();
    }

    /* renamed from: i */
    public final boolean m15285i() {
        return AbstractC9133u.m16128b(this.f16798a, "https");
    }

    /* renamed from: j */
    public final a m15286j() {
        a aVar = new a();
        aVar.m15296A(this.f16798a);
        aVar.m15324x(m15283f());
        aVar.m15323w(m15279b());
        aVar.m15325y(this.f16801d);
        aVar.m15326z(this.f16802e != f16797j.m15328b(this.f16798a) ? this.f16802e : -1);
        aVar.m15307g().clear();
        aVar.m15307g().addAll(m15281d());
        aVar.m15306f(m15282e());
        aVar.m15322v(m15278a());
        return aVar;
    }

    /* renamed from: k */
    public final a m15287k(String link) {
        AbstractC9133u.m16133g(link, "link");
        try {
            return new a().m15311k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final List m15288l() {
        return this.f16803f;
    }

    /* renamed from: m */
    public final int m15289m() {
        return this.f16802e;
    }

    /* renamed from: n */
    public final String m15290n() {
        if (this.f16804g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f16797j.m15331e(this.f16804g, sb);
        return sb.toString();
    }

    /* renamed from: o */
    public final String m15291o() {
        a aVarM15287k = m15287k("/...");
        AbstractC9133u.m16130d(aVarM15287k);
        return aVarM15287k.m15300E("").m15313m("").m15304d().toString();
    }

    /* renamed from: p */
    public final C8925w m15292p(String link) {
        AbstractC9133u.m16133g(link, "link");
        a aVarM15287k = m15287k(link);
        if (aVarM15287k != null) {
            return aVarM15287k.m15304d();
        }
        return null;
    }

    /* renamed from: q */
    public final String m15293q() {
        return this.f16798a;
    }

    /* renamed from: r */
    public final URI m15294r() {
        String string = m15286j().m15318r().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m16182i(string, ""));
                AbstractC9133u.m16130d(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: s */
    public final URL m15295s() {
        try {
            return new URL(this.f16806i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f16806i;
    }

    public C8925w(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        this.f16798a = str;
        this.f16799b = str2;
        this.f16800c = str3;
        this.f16801d = str4;
        this.f16802e = i10;
        this.f16803f = list;
        this.f16804g = list2;
        this.f16805h = str5;
        this.f16806i = str6;
    }
}
