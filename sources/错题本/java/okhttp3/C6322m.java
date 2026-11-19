package okhttp3;

import androidx.collection.AbstractC0584a;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import p161s7.AbstractC6567b;

/* renamed from: okhttp3.m */
/* loaded from: classes4.dex */
public final class C6322m {

    /* renamed from: j */
    public static final Pattern f10240j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f10241k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f10242l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f10243m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f10244a;

    /* renamed from: b */
    public final String f10245b;

    /* renamed from: c */
    public final long f10246c;

    /* renamed from: d */
    public final String f10247d;

    /* renamed from: e */
    public final String f10248e;

    /* renamed from: f */
    public final boolean f10249f;

    /* renamed from: g */
    public final boolean f10250g;

    /* renamed from: h */
    public final boolean f10251h;

    /* renamed from: i */
    public final boolean f10252i;

    public C6322m(String str, String str2, long j7, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f10244a = str;
        this.f10245b = str2;
        this.f10246c = j7;
        this.f10247d = str3;
        this.f10248e = str4;
        this.f10249f = z8;
        this.f10250g = z9;
        this.f10251h = z10;
        this.f10252i = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6322m)) {
            return false;
        }
        C6322m c6322m = (C6322m) obj;
        return AbstractC5830k.m5325b(c6322m.f10244a, this.f10244a) && AbstractC5830k.m5325b(c6322m.f10245b, this.f10245b) && c6322m.f10246c == this.f10246c && AbstractC5830k.m5325b(c6322m.f10247d, this.f10247d) && AbstractC5830k.m5325b(c6322m.f10248e, this.f10248e) && c6322m.f10249f == this.f10249f && c6322m.f10250g == this.f10250g && c6322m.f10251h == this.f10251h && c6322m.f10252i == this.f10252i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10252i) + AbstractC0584a.m908i(this.f10251h, AbstractC0584a.m908i(this.f10250g, AbstractC0584a.m908i(this.f10249f, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m897B(this.f10246c, AbstractC0584a.m903d(AbstractC0584a.m903d(527, 31, this.f10244a), 31, this.f10245b), 31), 31, this.f10247d), 31, this.f10248e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10244a);
        sb.append('=');
        sb.append(this.f10245b);
        if (this.f10251h) {
            long j7 = this.f10246c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC6567b.f10964a.get()).format(new Date(j7));
                AbstractC5830k.m5329f(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f10252i) {
            sb.append("; domain=");
            sb.append(this.f10247d);
        }
        sb.append("; path=");
        sb.append(this.f10248e);
        if (this.f10249f) {
            sb.append("; secure");
        }
        if (this.f10250g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString()");
        return string;
    }
}
