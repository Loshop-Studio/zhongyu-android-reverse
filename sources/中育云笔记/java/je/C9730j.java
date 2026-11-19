package je;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.HttpConstant;
import com.alibaba.android.arouter.utils.Consts;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ke.AbstractC9917a;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;
import pe.AbstractC10676c;

/* renamed from: je.j */
/* loaded from: classes6.dex */
public final class C9730j {

    /* renamed from: j */
    public static final a f22709j = new a(null);

    /* renamed from: k */
    public static final Pattern f22710k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    public static final Pattern f22711l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    public static final Pattern f22712m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final Pattern f22713n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f22714a;

    /* renamed from: b */
    public final String f22715b;

    /* renamed from: c */
    public final long f22716c;

    /* renamed from: d */
    public final String f22717d;

    /* renamed from: e */
    public final String f22718e;

    /* renamed from: f */
    public final boolean f22719f;

    /* renamed from: g */
    public final boolean f22720g;

    /* renamed from: h */
    public final boolean f22721h;

    /* renamed from: i */
    public final boolean f22722i;

    /* renamed from: je.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final int m19332a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* renamed from: b */
        public final boolean m19333b(String str, String str2) {
            if (AbstractC9979u.m20289b(str, str2)) {
                return true;
            }
            return AbstractC10819z.m23229B(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC9920d.m20027i(str);
        }

        /* renamed from: c */
        public final C9730j m19334c(C9738r url, String setCookie) {
            AbstractC9979u.m20294g(url, "url");
            AbstractC9979u.m20294g(setCookie, "setCookie");
            return m19335d(System.currentTimeMillis(), url, setCookie);
        }

        /* renamed from: d */
        public final C9730j m19335d(long j10, C9738r url, String setCookie) throws NumberFormatException {
            long j11;
            AbstractC9979u.m20294g(url, "url");
            AbstractC9979u.m20294g(setCookie, "setCookie");
            int iM20036r = AbstractC9920d.m20036r(setCookie, ';', 0, 0, 6, null);
            int iM20036r2 = AbstractC9920d.m20036r(setCookie, '=', 0, iM20036r, 2, null);
            C9730j c9730j = null;
            if (iM20036r2 == iM20036r) {
                return null;
            }
            String strM20016X = AbstractC9920d.m20016X(setCookie, 0, iM20036r2, 1, null);
            if (strM20016X.length() == 0 || AbstractC9920d.m20043y(strM20016X) != -1) {
                return null;
            }
            String strM20015W = AbstractC9920d.m20015W(setCookie, iM20036r2 + 1, iM20036r);
            if (AbstractC9920d.m20043y(strM20015W) != -1) {
                return null;
            }
            int i10 = iM20036r + 1;
            int length = setCookie.length();
            String strM19337f = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jM19339h = -1;
            long jM19338g = 253402300799999L;
            while (i10 < length) {
                int iM20034p = AbstractC9920d.m20034p(setCookie, ';', i10, length);
                int iM20034p2 = AbstractC9920d.m20034p(setCookie, '=', i10, iM20034p);
                String strM20015W2 = AbstractC9920d.m20015W(setCookie, i10, iM20034p2);
                String strM20015W3 = iM20034p2 < iM20034p ? AbstractC9920d.m20015W(setCookie, iM20034p2 + 1, iM20034p) : "";
                C9730j c9730j2 = c9730j;
                if (AbstractC10819z.m23230C(strM20015W2, "expires", true)) {
                    try {
                        jM19338g = m19338g(strM20015W3, 0, strM20015W3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (AbstractC10819z.m23230C(strM20015W2, "max-age", true)) {
                    jM19339h = m19339h(strM20015W3);
                    z11 = true;
                } else if (AbstractC10819z.m23230C(strM20015W2, DispatchConstants.DOMAIN, true)) {
                    strM19337f = m19337f(strM20015W3);
                    z13 = false;
                } else if (AbstractC10819z.m23230C(strM20015W2, "path", true)) {
                    str = strM20015W3;
                } else if (AbstractC10819z.m23230C(strM20015W2, "secure", true)) {
                    z12 = true;
                } else if (AbstractC10819z.m23230C(strM20015W2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iM20034p + 1;
                c9730j = c9730j2;
            }
            C9730j c9730j3 = c9730j;
            if (jM19339h == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jM19339h != -1) {
                long j12 = j10 + (jM19339h <= 9223372036854775L ? jM19339h * 1000 : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jM19338g;
            }
            String strM19419i = url.m19419i();
            if (strM19337f == null) {
                strM19337f = strM19419i;
            } else if (!m19333b(strM19419i, strM19337f)) {
                return c9730j3;
            }
            if (strM19419i.length() != strM19337f.length() && PublicSuffixDatabase.f25273e.m22179c().m22173c(strM19337f) == null) {
                return c9730j3;
            }
            String strSubstring = MqttTopic.TOPIC_LEVEL_SEPARATOR;
            if (str == null || !AbstractC10819z.m23242O(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 2, c9730j3)) {
                String strM19415d = url.m19415d();
                int iM23135k0 = AbstractC10793c0.m23135k0(strM19415d, '/', 0, false, 6, null);
                if (iM23135k0 != 0) {
                    strSubstring = strM19415d.substring(0, iM23135k0);
                    AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new C9730j(strM20016X, strM20015W, j11, strM19337f, str, z12, z10, z11, z13, null);
        }

        /* renamed from: e */
        public final List m19336e(C9738r url, C9737q headers) {
            AbstractC9979u.m20294g(url, "url");
            AbstractC9979u.m20294g(headers, "headers");
            List listM19394g = headers.m19394g(HttpConstant.SET_COOKIE);
            int size = listM19394g.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                C9730j c9730jM19334c = m19334c(url, (String) listM19394g.get(i10));
                if (c9730jM19334c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c9730jM19334c);
                }
            }
            if (arrayList == null) {
                return AbstractC10978w.m24136n();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC9979u.m20293f(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        /* renamed from: f */
        public final String m19337f(String str) {
            if (AbstractC10819z.m23229B(str, Consts.DOT, false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM19992e = AbstractC9917a.m19992e(AbstractC10793c0.m23149y0(str, Consts.DOT));
            if (strM19992e != null) {
                return strM19992e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        public final long m19338g(String str, int i10, int i11) throws NumberFormatException {
            int iM19332a = m19332a(str, i10, i11, false);
            Matcher matcher = C9730j.f22713n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iM23130f0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iM19332a < i11) {
                int iM19332a2 = m19332a(str, iM19332a + 1, i11, true);
                matcher.region(iM19332a, iM19332a2);
                if (i13 == -1 && matcher.usePattern(C9730j.f22713n).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC9979u.m20293f(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC9979u.m20293f(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC9979u.m20293f(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(C9730j.f22712m).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC9979u.m20293f(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iM23130f0 == -1 && matcher.usePattern(C9730j.f22711l).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC9979u.m20293f(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    AbstractC9979u.m20293f(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = C9730j.f22711l.pattern();
                    AbstractC9979u.m20293f(strPattern, "MONTH_PATTERN.pattern()");
                    iM23130f0 = AbstractC10793c0.m23130f0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(C9730j.f22710k).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC9979u.m20293f(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iM19332a = m19332a(str, iM19332a2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += GSYVideoView.CHANGE_DELAY_TIME;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iM23130f0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC9920d.f23246f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iM23130f0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        public final long m19339h(String str) throws NumberFormatException {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").m20341g(str)) {
                    return AbstractC10819z.m23242O(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C9730j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9972n abstractC9972n) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    /* renamed from: e */
    public final String m19329e() {
        return this.f22714a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9730j)) {
            return false;
        }
        C9730j c9730j = (C9730j) obj;
        return AbstractC9979u.m20289b(c9730j.f22714a, this.f22714a) && AbstractC9979u.m20289b(c9730j.f22715b, this.f22715b) && c9730j.f22716c == this.f22716c && AbstractC9979u.m20289b(c9730j.f22717d, this.f22717d) && AbstractC9979u.m20289b(c9730j.f22718e, this.f22718e) && c9730j.f22719f == this.f22719f && c9730j.f22720g == this.f22720g && c9730j.f22721h == this.f22721h && c9730j.f22722i == this.f22722i;
    }

    /* renamed from: f */
    public final String m19330f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22714a);
        sb2.append('=');
        sb2.append(this.f22715b);
        if (this.f22721h) {
            if (this.f22716c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(AbstractC10676c.m22604b(new Date(this.f22716c)));
            }
        }
        if (!this.f22722i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(Consts.DOT);
            }
            sb2.append(this.f22717d);
        }
        sb2.append("; path=");
        sb2.append(this.f22718e);
        if (this.f22719f) {
            sb2.append("; secure");
        }
        if (this.f22720g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString()");
        return string;
    }

    /* renamed from: g */
    public final String m19331g() {
        return this.f22715b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f22714a.hashCode()) * 31) + this.f22715b.hashCode()) * 31) + Long.hashCode(this.f22716c)) * 31) + this.f22717d.hashCode()) * 31) + this.f22718e.hashCode()) * 31) + Boolean.hashCode(this.f22719f)) * 31) + Boolean.hashCode(this.f22720g)) * 31) + Boolean.hashCode(this.f22721h)) * 31) + Boolean.hashCode(this.f22722i);
    }

    public String toString() {
        return m19330f(false);
    }

    public C9730j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f22714a = str;
        this.f22715b = str2;
        this.f22716c = j10;
        this.f22717d = str3;
        this.f22718e = str4;
        this.f22719f = z10;
        this.f22720g = z11;
        this.f22721h = z12;
        this.f22722i = z13;
    }
}
