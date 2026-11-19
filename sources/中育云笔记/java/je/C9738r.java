package je;

import anet.channel.util.HttpConstant;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.fastjson.asm.Opcodes;
import com.tendcloud.tenddata.C7863av;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC9917a;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import okio.Buffer;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p265nd.AbstractC10410o;
import p265nd.C10403h;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10797e0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10980x;

/* renamed from: je.r */
/* loaded from: classes6.dex */
public final class C9738r {

    /* renamed from: k */
    public static final b f22749k = new b(null);

    /* renamed from: l */
    public static final char[] f22750l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f22751a;

    /* renamed from: b */
    public final String f22752b;

    /* renamed from: c */
    public final String f22753c;

    /* renamed from: d */
    public final String f22754d;

    /* renamed from: e */
    public final int f22755e;

    /* renamed from: f */
    public final List f22756f;

    /* renamed from: g */
    public final List f22757g;

    /* renamed from: h */
    public final String f22758h;

    /* renamed from: i */
    public final String f22759i;

    /* renamed from: j */
    public final boolean f22760j;

    /* renamed from: je.r$a */
    public static final class a {

        /* renamed from: i */
        public static final C12141a f22761i = new C12141a(null);

        /* renamed from: a */
        public String f22762a;

        /* renamed from: d */
        public String f22765d;

        /* renamed from: f */
        public final List f22767f;

        /* renamed from: g */
        public List f22768g;

        /* renamed from: h */
        public String f22769h;

        /* renamed from: b */
        public String f22763b = "";

        /* renamed from: c */
        public String f22764c = "";

        /* renamed from: e */
        public int f22766e = -1;

        /* renamed from: je.r$a$a, reason: collision with other inner class name */
        public static final class C12141a {
            public /* synthetic */ C12141a(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: e */
            public final int m19460e(String str, int i10, int i11) throws NumberFormatException {
                int i12;
                try {
                    i12 = Integer.parseInt(b.m19464b(C9738r.f22749k, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            /* renamed from: f */
            public final int m19461f(String str, int i10, int i11) {
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
            public final int m19462g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((AbstractC9979u.m20296i(cCharAt, 97) >= 0 && AbstractC9979u.m20296i(cCharAt, 122) <= 0) || (AbstractC9979u.m20296i(cCharAt, 65) >= 0 && AbstractC9979u.m20296i(cCharAt, 90) <= 0)) {
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
            public final int m19463h(String str, int i10, int i11) {
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

            public C12141a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f22767f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final a m19431a(String encodedName, String str) {
            AbstractC9979u.m20294g(encodedName, "encodedName");
            if (this.f22768g == null) {
                this.f22768g = new ArrayList();
            }
            List list = this.f22768g;
            AbstractC9979u.m20291d(list);
            b bVar = C9738r.f22749k;
            list.add(b.m19464b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.f22768g;
            AbstractC9979u.m20291d(list2);
            list2.add(str != null ? b.m19464b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        /* renamed from: b */
        public final a m19432b(String pathSegment) {
            AbstractC9979u.m20294g(pathSegment, "pathSegment");
            m19445o(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public final a m19433c(String name, String str) {
            AbstractC9979u.m20294g(name, "name");
            if (this.f22768g == null) {
                this.f22768g = new ArrayList();
            }
            List list = this.f22768g;
            AbstractC9979u.m20291d(list);
            b bVar = C9738r.f22749k;
            list.add(b.m19464b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f22768g;
            AbstractC9979u.m20291d(list2);
            list2.add(str != null ? b.m19464b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        /* renamed from: d */
        public final C9738r m19434d() {
            ArrayList arrayList;
            String str = this.f22762a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C9738r.f22749k;
            String strM19465h = b.m19465h(bVar, this.f22763b, 0, 0, false, 7, null);
            String strM19465h2 = b.m19465h(bVar, this.f22764c, 0, 0, false, 7, null);
            String str2 = this.f22765d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM19435e = m19435e();
            List list = this.f22767f;
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m19465h(C9738r.f22749k, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f22768g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? b.m19465h(C9738r.f22749k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f22769h;
            return new C9738r(str, strM19465h, strM19465h2, str2, iM19435e, arrayList2, arrayList, str4 != null ? b.m19465h(C9738r.f22749k, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* renamed from: e */
        public final int m19435e() {
            int i10 = this.f22766e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = C9738r.f22749k;
            String str = this.f22762a;
            AbstractC9979u.m20291d(str);
            return bVar.m19467c(str);
        }

        /* renamed from: f */
        public final a m19436f(String str) {
            b bVar;
            String strM19464b;
            this.f22768g = (str == null || (strM19464b = b.m19464b((bVar = C9738r.f22749k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.m19473j(strM19464b);
            return this;
        }

        /* renamed from: g */
        public final List m19437g() {
            return this.f22767f;
        }

        /* renamed from: h */
        public final a m19438h(String host) {
            AbstractC9979u.m20294g(host, "host");
            String strM19992e = AbstractC9917a.m19992e(b.m19465h(C9738r.f22749k, host, 0, 0, false, 7, null));
            if (strM19992e != null) {
                this.f22765d = strM19992e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: i */
        public final boolean m19439i(String str) {
            return AbstractC9979u.m20289b(str, Consts.DOT) || AbstractC10819z.m23230C(str, "%2e", true);
        }

        /* renamed from: j */
        public final boolean m19440j(String str) {
            return AbstractC9979u.m20289b(str, "..") || AbstractC10819z.m23230C(str, "%2e.", true) || AbstractC10819z.m23230C(str, ".%2e", true) || AbstractC10819z.m23230C(str, "%2e%2e", true);
        }

        /* renamed from: k */
        public final a m19441k(C9738r c9738r, String str) throws NumberFormatException {
            String str2;
            int iM20035q;
            int i10;
            String str3;
            int i11;
            String str4;
            boolean z10;
            char c10;
            int i12;
            int i13;
            char c11;
            int i14;
            String input = str;
            AbstractC9979u.m20294g(input, "input");
            int iM19993A = AbstractC9920d.m19993A(input, 0, 0, 3, null);
            int iM19995C = AbstractC9920d.m19995C(input, iM19993A, 0, 2, null);
            C12141a c12141a = f22761i;
            int iM19462g = c12141a.m19462g(input, iM19993A, iM19995C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            char c12 = 65535;
            if (iM19462g != -1) {
                if (AbstractC10819z.m23239L(input, "https:", iM19993A, true)) {
                    this.f22762a = "https";
                    iM19993A += 6;
                } else {
                    if (!AbstractC10819z.m23239L(input, "http:", iM19993A, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM19462g);
                        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f22762a = HttpConstant.HTTP;
                    iM19993A += 5;
                }
            } else {
                if (c9738r == null) {
                    if (input.length() > 6) {
                        str2 = AbstractC10797e0.m23172i1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f22762a = c9738r.m19428r();
            }
            int iM19463h = c12141a.m19463h(input, iM19993A, iM19995C);
            char c13 = '?';
            char c14 = '#';
            if (iM19463h >= 2 || c9738r == null || !AbstractC9979u.m20289b(c9738r.m19428r(), this.f22762a)) {
                int i15 = iM19993A + iM19463h;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iM20035q = AbstractC9920d.m20035q(input, "@/\\?#", i15, iM19995C);
                    char cCharAt = iM20035q != iM19995C ? input.charAt(iM20035q) : c12;
                    if (cCharAt == c12 || cCharAt == c14 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c13) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z12) {
                            i11 = iM19995C;
                            str4 = str5;
                            z10 = z11;
                            c10 = c12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f22764c);
                            sb3.append("%40");
                            input = str;
                            i12 = iM20035q;
                            sb3.append(b.m19464b(C9738r.f22749k, input, i15, iM20035q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f22764c = sb3.toString();
                        } else {
                            int iM20034p = AbstractC9920d.m20034p(input, ':', i15, iM20035q);
                            b bVar = C9738r.f22749k;
                            str4 = str5;
                            c10 = c12;
                            i11 = iM19995C;
                            z10 = z11;
                            String strM19464b = b.m19464b(bVar, input, i15, iM20034p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strM19464b = this.f22763b + "%40" + strM19464b;
                            }
                            this.f22763b = strM19464b;
                            if (iM20034p != iM20035q) {
                                i13 = iM20035q;
                                this.f22764c = b.m19464b(bVar, str, iM20034p + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i13 = iM20035q;
                            }
                            input = str;
                            i12 = i13;
                            z13 = z10;
                        }
                        i15 = i12 + 1;
                        c12 = c10;
                        iM19995C = i11;
                        str5 = str4;
                        z11 = z10;
                        c13 = '?';
                        c14 = '#';
                    }
                }
                i10 = iM19995C;
                String str6 = str5;
                char c15 = c12;
                C12141a c12141a2 = f22761i;
                int iM19461f = c12141a2.m19461f(input, i15, iM20035q);
                int i16 = iM19461f + 1;
                if (i16 < iM20035q) {
                    this.f22765d = AbstractC9917a.m19992e(b.m19465h(C9738r.f22749k, input, i15, iM19461f, false, 4, null));
                    int iM19460e = c12141a2.m19460e(input, i16, iM20035q);
                    this.f22766e = iM19460e;
                    if (iM19460e == c15) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i16, iM20035q);
                        AbstractC9979u.m20293f(strSubstring2, str6);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    b bVar2 = C9738r.f22749k;
                    this.f22765d = AbstractC9917a.m19992e(b.m19465h(bVar2, input, i15, iM19461f, false, 4, null));
                    String str7 = this.f22762a;
                    AbstractC9979u.m20291d(str7);
                    this.f22766e = bVar2.m19467c(str7);
                }
                if (this.f22765d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i15, iM19461f);
                    AbstractC9979u.m20293f(strSubstring3, str3);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iM19993A = iM20035q;
            } else {
                this.f22763b = c9738r.m19418g();
                this.f22764c = c9738r.m19414c();
                this.f22765d = c9738r.m19419i();
                this.f22766e = c9738r.m19424n();
                this.f22767f.clear();
                this.f22767f.addAll(c9738r.m19416e());
                if (iM19993A == iM19995C || input.charAt(iM19993A) == '#') {
                    m19436f(c9738r.m19417f());
                }
                i10 = iM19995C;
            }
            int i17 = i10;
            int iM20035q2 = AbstractC9920d.m20035q(input, "?#", iM19993A, i17);
            m19447q(input, iM19993A, iM20035q2);
            if (iM20035q2 >= i17 || input.charAt(iM20035q2) != '?') {
                c11 = '#';
                i14 = iM20035q2;
            } else {
                c11 = '#';
                int iM20034p2 = AbstractC9920d.m20034p(input, '#', iM20035q2, i17);
                b bVar3 = C9738r.f22749k;
                this.f22768g = bVar3.m19473j(b.m19464b(bVar3, input, iM20035q2 + 1, iM20034p2, " \"'<>#", true, false, true, false, null, 208, null));
                i14 = iM20034p2;
            }
            if (i14 < i17 && input.charAt(i14) == c11) {
                this.f22769h = b.m19464b(C9738r.f22749k, input, i14 + 1, i17, "", true, false, false, true, null, Opcodes.ARETURN, null);
            }
            return this;
        }

        /* renamed from: l */
        public final a m19442l(String password) {
            AbstractC9979u.m20294g(password, "password");
            this.f22764c = b.m19464b(C9738r.f22749k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: m */
        public final void m19443m() {
            if (((String) this.f22767f.remove(r0.size() - 1)).length() != 0 || this.f22767f.isEmpty()) {
                this.f22767f.add("");
            } else {
                this.f22767f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: n */
        public final a m19444n(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f22766e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* renamed from: o */
        public final void m19445o(String str, int i10, int i11, boolean z10, boolean z11) {
            String strM19464b = b.m19464b(C9738r.f22749k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (m19439i(strM19464b)) {
                return;
            }
            if (m19440j(strM19464b)) {
                m19443m();
                return;
            }
            if (((CharSequence) this.f22767f.get(r14.size() - 1)).length() == 0) {
                this.f22767f.set(r14.size() - 1, strM19464b);
            } else {
                this.f22767f.add(strM19464b);
            }
            if (z10) {
                this.f22767f.add("");
            }
        }

        /* renamed from: p */
        public final a m19446p() {
            String str = this.f22765d;
            this.f22765d = str != null ? new Regex("[\"<>^`{|}]").m20343m(str, "") : null;
            int size = this.f22767f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f22767f;
                list.set(i10, b.m19464b(C9738r.f22749k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f22768g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.m19464b(C9738r.f22749k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f22769h;
            this.f22769h = str3 != null ? b.m19464b(C9738r.f22749k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, Opcodes.IF_ICMPGT, null) : null;
            return this;
        }

        /* renamed from: q */
        public final void m19447q(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f22767f.clear();
                this.f22767f.add("");
                i10++;
            } else {
                List list = this.f22767f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iM20035q = AbstractC9920d.m20035q(str, "/\\", i12, i11);
                boolean z10 = iM20035q < i11;
                String str2 = str;
                m19445o(str2, i12, iM20035q, z10, true);
                if (z10) {
                    i12 = iM20035q + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iM20035q;
                }
            }
        }

        /* renamed from: r */
        public final a m19448r(String scheme) {
            AbstractC9979u.m20294g(scheme, "scheme");
            if (AbstractC10819z.m23230C(scheme, HttpConstant.HTTP, true)) {
                this.f22762a = HttpConstant.HTTP;
                return this;
            }
            if (AbstractC10819z.m23230C(scheme, "https", true)) {
                this.f22762a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* renamed from: s */
        public final void m19449s(String str) {
            this.f22769h = str;
        }

        /* renamed from: t */
        public final void m19450t(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.f22764c = str;
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
                java.lang.String r1 = r6.f22762a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f22763b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f22764c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f22763b
                r0.append(r1)
                java.lang.String r1 = r6.f22764c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f22764c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f22765d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = p310qd.AbstractC10793c0.m23106T(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f22765d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f22765d
                r0.append(r1)
            L69:
                int r1 = r6.f22766e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f22762a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.m19435e()
                java.lang.String r3 = r6.f22762a
                if (r3 == 0) goto L85
                je.r$b r4 = je.C9738r.f22749k
                kotlin.jvm.internal.AbstractC9979u.m20291d(r3)
                int r3 = r4.m19467c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                je.r$b r1 = je.C9738r.f22749k
                java.util.List r2 = r6.f22767f
                r1.m19472i(r2, r0)
                java.util.List r2 = r6.f22768g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f22768g
                kotlin.jvm.internal.AbstractC9979u.m20291d(r2)
                r1.m19474k(r2, r0)
            La3:
                java.lang.String r1 = r6.f22769h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f22769h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: je.C9738r.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m19451u(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.f22763b = str;
        }

        /* renamed from: v */
        public final void m19452v(String str) {
            this.f22765d = str;
        }

        /* renamed from: w */
        public final void m19453w(int i10) {
            this.f22766e = i10;
        }

        /* renamed from: x */
        public final void m19454x(String str) {
            this.f22762a = str;
        }

        /* renamed from: y */
        public final a m19455y(String username) {
            AbstractC9979u.m20294g(username, "username");
            this.f22763b = b.m19464b(C9738r.f22749k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* renamed from: je.r$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m19464b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.m19466a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        /* renamed from: h */
        public static /* synthetic */ String m19465h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.m19471g(str, i10, i11, z10);
        }

        /* renamed from: a */
        public final String m19466a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            AbstractC9979u.m20294g(str, "<this>");
            AbstractC9979u.m20294g(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || AbstractC10793c0.m23106T(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !m19469e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, iCharCount);
                    m19475l(buffer, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: c */
        public final int m19467c(String scheme) {
            AbstractC9979u.m20294g(scheme, "scheme");
            if (AbstractC9979u.m20289b(scheme, HttpConstant.HTTP)) {
                return 80;
            }
            return AbstractC9979u.m20289b(scheme, "https") ? 443 : -1;
        }

        /* renamed from: d */
        public final C9738r m19468d(String str) {
            AbstractC9979u.m20294g(str, "<this>");
            return new a().m19441k(null, str).m19434d();
        }

        /* renamed from: e */
        public final boolean m19469e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && AbstractC9920d.m20000H(str.charAt(i10 + 1)) != -1 && AbstractC9920d.m20000H(str.charAt(i12)) != -1;
        }

        /* renamed from: f */
        public final C9738r m19470f(String str) {
            AbstractC9979u.m20294g(str, "<this>");
            try {
                return m19468d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m19471g(String str, int i10, int i11, boolean z10) {
            AbstractC9979u.m20294g(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, i12);
                    m19476m(buffer, str, i12, i11, z10);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i10, i11);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* renamed from: i */
        public final void m19472i(List list, StringBuilder out) {
            AbstractC9979u.m20294g(list, "<this>");
            AbstractC9979u.m20294g(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        /* renamed from: j */
        public final List m19473j(String str) {
            AbstractC9979u.m20294g(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iM23128e0 = AbstractC10793c0.m23128e0(str2, '&', i10, false, 4, null);
                if (iM23128e0 == -1) {
                    iM23128e0 = str2.length();
                }
                int iM23128e02 = AbstractC10793c0.m23128e0(str2, '=', i10, false, 4, null);
                if (iM23128e02 == -1 || iM23128e02 > iM23128e0) {
                    String strSubstring = str2.substring(i10, iM23128e0);
                    AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iM23128e02);
                    AbstractC9979u.m20293f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iM23128e02 + 1, iM23128e0);
                    AbstractC9979u.m20293f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iM23128e0 + 1;
                str = str2;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m19474k(List list, StringBuilder out) {
            AbstractC9979u.m20294g(list, "<this>");
            AbstractC9979u.m20294g(out, "out");
            C10403h c10403hM21767t = AbstractC10410o.m21767t(AbstractC10410o.m21768u(0, list.size()), 2);
            int iM21733b = c10403hM21767t.m21733b();
            int iM21734c = c10403hM21767t.m21734c();
            int iM21735d = c10403hM21767t.m21735d();
            if ((iM21735d <= 0 || iM21733b > iM21734c) && (iM21735d >= 0 || iM21734c > iM21733b)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iM21733b);
                String str2 = (String) list.get(iM21733b + 1);
                if (iM21733b > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iM21733b == iM21734c) {
                    return;
                } else {
                    iM21733b += iM21735d;
                }
            }
        }

        /* renamed from: l */
        public final void m19475l(Buffer buffer, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            int iCharCount = i10;
            Buffer buffer2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        buffer.writeUtf8(z10 ? MqttTopic.SINGLE_LEVEL_WILDCARD : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!AbstractC10793c0.m23106T(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || m19469e(str, iCharCount, i11))))) {
                                buffer.writeUtf8CodePoint(iCodePointAt);
                            }
                        }
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || AbstractC9979u.m20289b(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b10 = buffer2.readByte();
                            int i12 = b10 & C7863av.f14384i;
                            buffer.writeByte(37);
                            buffer.writeByte((int) C9738r.f22750l[(i12 >> 4) & 15]);
                            buffer.writeByte((int) C9738r.f22750l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        /* renamed from: m */
        public final void m19476m(Buffer buffer, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iM20000H = AbstractC9920d.m20000H(str.charAt(i10 + 1));
                    int iM20000H2 = AbstractC9920d.m20000H(str.charAt(i12));
                    if (iM20000H == -1 || iM20000H2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((iM20000H << 4) + iM20000H2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
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

    public C9738r(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        AbstractC9979u.m20294g(scheme, "scheme");
        AbstractC9979u.m20294g(username, "username");
        AbstractC9979u.m20294g(password, "password");
        AbstractC9979u.m20294g(host, "host");
        AbstractC9979u.m20294g(pathSegments, "pathSegments");
        AbstractC9979u.m20294g(url, "url");
        this.f22751a = scheme;
        this.f22752b = username;
        this.f22753c = password;
        this.f22754d = host;
        this.f22755e = i10;
        this.f22756f = pathSegments;
        this.f22757g = list;
        this.f22758h = str;
        this.f22759i = url;
        this.f22760j = AbstractC9979u.m20289b(scheme, "https");
    }

    /* renamed from: h */
    public static final C9738r m19412h(String str) {
        return f22749k.m19468d(str);
    }

    /* renamed from: b */
    public final String m19413b() {
        if (this.f22758h == null) {
            return null;
        }
        String strSubstring = this.f22759i.substring(AbstractC10793c0.m23128e0(this.f22759i, '#', 0, false, 6, null) + 1);
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final String m19414c() {
        if (this.f22753c.length() == 0) {
            return "";
        }
        String strSubstring = this.f22759i.substring(AbstractC10793c0.m23128e0(this.f22759i, ':', this.f22751a.length() + 3, false, 4, null) + 1, AbstractC10793c0.m23128e0(this.f22759i, '@', 0, false, 6, null));
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: d */
    public final String m19415d() {
        int iM23128e0 = AbstractC10793c0.m23128e0(this.f22759i, '/', this.f22751a.length() + 3, false, 4, null);
        String str = this.f22759i;
        String strSubstring = this.f22759i.substring(iM23128e0, AbstractC9920d.m20035q(str, "?#", iM23128e0, str.length()));
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final List m19416e() {
        int iM23128e0 = AbstractC10793c0.m23128e0(this.f22759i, '/', this.f22751a.length() + 3, false, 4, null);
        String str = this.f22759i;
        int iM20035q = AbstractC9920d.m20035q(str, "?#", iM23128e0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM23128e0 < iM20035q) {
            int i10 = iM23128e0 + 1;
            int iM20034p = AbstractC9920d.m20034p(this.f22759i, '/', i10, iM20035q);
            String strSubstring = this.f22759i.substring(i10, iM20034p);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM23128e0 = iM20034p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9738r) && AbstractC9979u.m20289b(((C9738r) obj).f22759i, this.f22759i);
    }

    /* renamed from: f */
    public final String m19417f() {
        if (this.f22757g == null) {
            return null;
        }
        int iM23128e0 = AbstractC10793c0.m23128e0(this.f22759i, '?', 0, false, 6, null) + 1;
        String str = this.f22759i;
        String strSubstring = this.f22759i.substring(iM23128e0, AbstractC9920d.m20034p(str, '#', iM23128e0, str.length()));
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: g */
    public final String m19418g() {
        if (this.f22752b.length() == 0) {
            return "";
        }
        int length = this.f22751a.length() + 3;
        String str = this.f22759i;
        String strSubstring = this.f22759i.substring(length, AbstractC9920d.m20035q(str, ":@", length, str.length()));
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f22759i.hashCode();
    }

    /* renamed from: i */
    public final String m19419i() {
        return this.f22754d;
    }

    /* renamed from: j */
    public final boolean m19420j() {
        return this.f22760j;
    }

    /* renamed from: k */
    public final a m19421k() {
        a aVar = new a();
        aVar.m19454x(this.f22751a);
        aVar.m19451u(m19418g());
        aVar.m19450t(m19414c());
        aVar.m19452v(this.f22754d);
        aVar.m19453w(this.f22755e != f22749k.m19467c(this.f22751a) ? this.f22755e : -1);
        aVar.m19437g().clear();
        aVar.m19437g().addAll(m19416e());
        aVar.m19436f(m19417f());
        aVar.m19449s(m19413b());
        return aVar;
    }

    /* renamed from: l */
    public final a m19422l(String link) {
        AbstractC9979u.m20294g(link, "link");
        try {
            return new a().m19441k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m19423m() {
        return this.f22756f;
    }

    /* renamed from: n */
    public final int m19424n() {
        return this.f22755e;
    }

    /* renamed from: o */
    public final String m19425o() {
        if (this.f22757g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f22749k.m19474k(this.f22757g, sb2);
        return sb2.toString();
    }

    /* renamed from: p */
    public final String m19426p() {
        a aVarM19422l = m19422l("/...");
        AbstractC9979u.m20291d(aVarM19422l);
        return aVarM19422l.m19455y("").m19442l("").m19434d().toString();
    }

    /* renamed from: q */
    public final C9738r m19427q(String link) {
        AbstractC9979u.m20294g(link, "link");
        a aVarM19422l = m19422l(link);
        if (aVarM19422l != null) {
            return aVarM19422l.m19434d();
        }
        return null;
    }

    /* renamed from: r */
    public final String m19428r() {
        return this.f22751a;
    }

    /* renamed from: s */
    public final URI m19429s() {
        String string = m19421k().m19446p().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m20343m(string, ""));
                AbstractC9979u.m20293f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: t */
    public final URL m19430t() {
        try {
            return new URL(this.f22759i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f22759i;
    }
}
