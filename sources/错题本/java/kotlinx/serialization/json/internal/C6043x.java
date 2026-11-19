package kotlinx.serialization.json.internal;

import android.support.v4.media.AbstractC0037f;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import io.microshow.rxffmpeg.player.MeasureHelper$FitModel;
import io.microshow.rxffmpeg.player.RxFFmpegPlayerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;

/* renamed from: kotlinx.serialization.json.internal.x */
/* loaded from: classes4.dex */
public class C6043x {

    /* renamed from: a */
    public final /* synthetic */ int f9596a;

    /* renamed from: b */
    public int f9597b;

    /* renamed from: c */
    public final Object f9598c;

    /* renamed from: d */
    public Object f9599d;

    /* renamed from: e */
    public Object f9600e;

    /* renamed from: f */
    public final Object f9601f;

    public C6043x(RxFFmpegPlayerView rxFFmpegPlayerView, RxFFmpegPlayerView rxFFmpegPlayerView2) {
        this.f9596a = 1;
        this.f9601f = rxFFmpegPlayerView;
        this.f9600e = MeasureHelper$FitModel.FM_DEFAULT;
        this.f9598c = new WeakReference(rxFFmpegPlayerView2);
    }

    /* renamed from: m */
    public static /* synthetic */ void m5706m(C6043x c6043x, String str, int i, String str2, int i8) {
        if ((i8 & 2) != 0) {
            i = c6043x.f9597b;
        }
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        c6043x.m5718l(i, str, str2);
        throw null;
    }

    /* renamed from: a */
    public int m5707a(CharSequence charSequence, int i) {
        int i8 = i + 4;
        if (i8 < charSequence.length()) {
            ((StringBuilder) this.f9601f).append((char) (m5719n(charSequence, i + 3) + (m5719n(charSequence, i) << 12) + (m5719n(charSequence, i + 1) << 8) + (m5719n(charSequence, i + 2) << 4)));
            return i8;
        }
        this.f9597b = i;
        if (i8 < charSequence.length()) {
            return m5707a(charSequence, this.f9597b);
        }
        m5706m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* renamed from: b */
    public boolean m5708b() {
        int i = this.f9597b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f9600e;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9597b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f9597b = i;
        return false;
    }

    /* renamed from: c */
    public void m5709c(int i, String str) {
        String str2 = (String) this.f9600e;
        if (str2.length() - i < str.length()) {
            m5706m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (str.charAt(i8) != (str2.charAt(i + i8) | ' ')) {
                m5706m(this, "Expected valid boolean literal prefix, but had '" + m5716j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f9597b = str.length() + i;
    }

    /* renamed from: d */
    public String m5710d() {
        String str = (String) this.f9600e;
        m5713g('\"');
        int i = this.f9597b;
        int iM5379M = AbstractC5855p.m5379M(str, '\"', i, 4);
        if (iM5379M == -1) {
            m5716j();
            int i8 = this.f9597b;
            m5706m(this, AbstractC0037f.m86k("Expected quotation mark '\"', but had '", (i8 == str.length() || i8 < 0) ? "EOF" : String.valueOf(str.charAt(i8)), "' instead"), i8, null, 4);
            throw null;
        }
        int i9 = i;
        while (i9 < iM5379M) {
            if (str.charAt(i9) == '\\') {
                int iM5724s = this.f9597b;
                char cCharAt = str.charAt(i9);
                boolean z8 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.f9601f).append((CharSequence) str, iM5724s, i9);
                        int iM5724s2 = m5724s(i9 + 1);
                        if (iM5724s2 == -1) {
                            m5706m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM5707a = iM5724s2 + 1;
                        char cCharAt2 = str.charAt(iM5724s2);
                        if (cCharAt2 == 'u') {
                            iM5707a = m5707a(str, iM5707a);
                        } else {
                            char c = cCharAt2 < 'u' ? C6024e.f9548a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m5706m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f9601f).append(c);
                        }
                        iM5724s = m5724s(iM5707a);
                        if (iM5724s == -1) {
                            m5706m(this, "Unexpected EOF", iM5724s, null, 4);
                            throw null;
                        }
                    } else {
                        i9++;
                        if (i9 >= str.length()) {
                            ((StringBuilder) this.f9601f).append((CharSequence) str, iM5724s, i9);
                            iM5724s = m5724s(i9);
                            if (iM5724s == -1) {
                                m5706m(this, "Unexpected EOF", iM5724s, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i9);
                        }
                    }
                    i9 = iM5724s;
                    z8 = true;
                    cCharAt = str.charAt(i9);
                }
                String string = !z8 ? str.subSequence(iM5724s, i9).toString() : m5717k(iM5724s, i9);
                this.f9597b = i9 + 1;
                return string;
            }
            i9++;
        }
        this.f9597b = iM5379M + 1;
        String strSubstring = str.substring(i, iM5379M);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: e */
    public byte m5711e() {
        String str = (String) this.f9600e;
        int i = this.f9597b;
        while (i != -1 && i < str.length()) {
            int i8 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9597b = i8;
                return AbstractC6029j.m5686g(cCharAt);
            }
            i = i8;
        }
        this.f9597b = str.length();
        return (byte) 10;
    }

    /* renamed from: f */
    public byte m5712f(byte b6) {
        String str = (String) this.f9600e;
        byte bM5711e = m5711e();
        if (bM5711e == b6) {
            return bM5711e;
        }
        String strM5698s = AbstractC6029j.m5698s(b6);
        int i = this.f9597b;
        int i8 = i - 1;
        m5706m(this, AbstractC0037f.m87l("Expected ", strM5698s, ", but had '", (i == str.length() || i8 < 0) ? "EOF" : String.valueOf(str.charAt(i8)), "' instead"), i8, null, 4);
        throw null;
    }

    /* renamed from: g */
    public void m5713g(char c) {
        int i = this.f9597b;
        if (i == -1) {
            m5727v(c);
            throw null;
        }
        String str = (String) this.f9600e;
        while (i < str.length()) {
            int i8 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9597b = i8;
                if (cCharAt == c) {
                    return;
                }
                m5727v(c);
                throw null;
            }
            i = i8;
        }
        this.f9597b = -1;
        m5727v(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        m5706m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        m5706m(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        m5706m(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        m5706m(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        m5706m(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.f9597b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        m5706m(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        m5706m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m5714h() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C6043x.m5714h():long");
    }

    /* renamed from: i */
    public String m5715i() {
        String str = (String) this.f9599d;
        if (str == null) {
            return m5710d();
        }
        AbstractC5830k.m5327d(str);
        this.f9599d = null;
        return str;
    }

    /* renamed from: j */
    public String m5716j() {
        String str = (String) this.f9600e;
        String str2 = (String) this.f9599d;
        if (str2 != null) {
            AbstractC5830k.m5327d(str2);
            this.f9599d = null;
            return str2;
        }
        int iM5725t = m5725t();
        if (iM5725t >= str.length() || iM5725t == -1) {
            m5706m(this, "EOF", iM5725t, null, 4);
            throw null;
        }
        byte bM5686g = AbstractC6029j.m5686g(str.charAt(iM5725t));
        if (bM5686g == 1) {
            return m5715i();
        }
        if (bM5686g != 0) {
            m5706m(this, "Expected beginning of the string, but got " + str.charAt(iM5725t), 0, null, 6);
            throw null;
        }
        boolean z8 = false;
        while (AbstractC6029j.m5686g(str.charAt(iM5725t)) == 0) {
            iM5725t++;
            if (iM5725t >= str.length()) {
                ((StringBuilder) this.f9601f).append((CharSequence) str, this.f9597b, iM5725t);
                int iM5724s = m5724s(iM5725t);
                if (iM5724s == -1) {
                    this.f9597b = iM5725t;
                    return m5717k(0, 0);
                }
                iM5725t = iM5724s;
                z8 = true;
            }
        }
        String string = !z8 ? str.subSequence(this.f9597b, iM5725t).toString() : m5717k(this.f9597b, iM5725t);
        this.f9597b = iM5725t;
        return string;
    }

    /* renamed from: k */
    public String m5717k(int i, int i8) {
        ((StringBuilder) this.f9601f).append((CharSequence) this.f9600e, i, i8);
        StringBuilder sb = (StringBuilder) this.f9601f;
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    /* renamed from: l */
    public void m5718l(int i, String message, String hint) {
        AbstractC5830k.m5330g(message, "message");
        AbstractC5830k.m5330g(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : SignParameters.NEW_LINE.concat(hint);
        StringBuilder sbM98w = AbstractC0037f.m98w(message, " at path: ");
        sbM98w.append(((C6031l) this.f9598c).m5699a());
        sbM98w.append(strConcat);
        throw AbstractC6029j.m5684e(sbM98w.toString(), (String) this.f9600e, i);
    }

    /* renamed from: n */
    public int m5719n(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m5706m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* renamed from: o */
    public View m5720o() {
        View view;
        WeakReference weakReference = (WeakReference) this.f9598c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    /* renamed from: p */
    public String m5721p(String keyToMatch) {
        AbstractC5830k.m5330g(keyToMatch, "keyToMatch");
        int i = this.f9597b;
        try {
            if (m5711e() == 6 && AbstractC5830k.m5325b(m5723r(), keyToMatch)) {
                this.f9599d = null;
                if (m5711e() == 5) {
                    return m5723r();
                }
            }
            return null;
        } finally {
            this.f9597b = i;
            this.f9599d = null;
        }
    }

    /* renamed from: q */
    public byte m5722q() {
        String str = (String) this.f9600e;
        int i = this.f9597b;
        while (true) {
            int iM5724s = m5724s(i);
            if (iM5724s == -1) {
                this.f9597b = iM5724s;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM5724s);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f9597b = iM5724s;
                return AbstractC6029j.m5686g(cCharAt);
            }
            i = iM5724s + 1;
        }
    }

    /* renamed from: r */
    public String m5723r() {
        if (m5722q() != 1) {
            return null;
        }
        String strM5715i = m5715i();
        this.f9599d = strM5715i;
        return strM5715i;
    }

    /* renamed from: s */
    public int m5724s(int i) {
        if (i < ((String) this.f9600e).length()) {
            return i;
        }
        return -1;
    }

    /* renamed from: t */
    public int m5725t() {
        char cCharAt;
        int i = this.f9597b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f9600e;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f9597b = i;
        return i;
    }

    public String toString() {
        switch (this.f9596a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f9600e);
                sb.append("', currentPosition=");
                return AbstractC0037f.m88m(sb, this.f9597b, ')');
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public boolean m5726u() {
        int iM5725t = m5725t();
        String str = (String) this.f9600e;
        if (iM5725t >= str.length() || iM5725t == -1 || str.charAt(iM5725t) != ',') {
            return false;
        }
        this.f9597b++;
        return true;
    }

    /* renamed from: v */
    public void m5727v(char c) {
        String str = (String) this.f9600e;
        int i = this.f9597b;
        if (i > 0 && c == '\"') {
            try {
                this.f9597b = i - 1;
                String strM5716j = m5716j();
                this.f9597b = i;
                if (AbstractC5830k.m5325b(strM5716j, "null")) {
                    m5718l(this.f9597b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f9597b = i;
                throw th;
            }
        }
        String strM5698s = AbstractC6029j.m5698s(AbstractC6029j.m5686g(c));
        int i8 = this.f9597b;
        int i9 = i8 - 1;
        m5706m(this, AbstractC0037f.m87l("Expected ", strM5698s, ", but had '", (i8 == str.length() || i9 < 0) ? "EOF" : String.valueOf(str.charAt(i9)), "' instead"), i9, null, 4);
        throw null;
    }

    public C6043x(String source) {
        this.f9596a = 0;
        AbstractC5830k.m5330g(source, "source");
        C6031l c6031l = new C6031l(0);
        c6031l.f9560c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        c6031l.f9561d = iArr;
        c6031l.f9559b = -1;
        this.f9598c = c6031l;
        this.f9601f = new StringBuilder();
        this.f9600e = source;
    }
}
