package p122df;

import com.tendcloud.tenddata.C7863av;
import java.io.EOFException;
import java.util.regex.Pattern;
import je.AbstractC9744x;
import je.C9736p;
import je.C9737q;
import je.C9738r;
import je.C9740t;
import je.C9741u;
import je.C9743w;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: df.a0 */
/* loaded from: classes6.dex */
public final class C9027a0 {

    /* renamed from: l */
    public static final char[] f21022l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f21023m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f21024a;

    /* renamed from: b */
    public final C9738r f21025b;

    /* renamed from: c */
    public String f21026c;

    /* renamed from: d */
    public C9738r.a f21027d;

    /* renamed from: e */
    public final C9743w.a f21028e = new C9743w.a();

    /* renamed from: f */
    public final C9737q.a f21029f;

    /* renamed from: g */
    public C9740t f21030g;

    /* renamed from: h */
    public final boolean f21031h;

    /* renamed from: i */
    public C9741u.a f21032i;

    /* renamed from: j */
    public C9736p.a f21033j;

    /* renamed from: k */
    public AbstractC9744x f21034k;

    /* renamed from: df.a0$a */
    public static class a extends AbstractC9744x {

        /* renamed from: a */
        public final AbstractC9744x f21035a;

        /* renamed from: b */
        public final C9740t f21036b;

        public a(AbstractC9744x abstractC9744x, C9740t c9740t) {
            this.f21035a = abstractC9744x;
            this.f21036b = c9740t;
        }

        @Override // je.AbstractC9744x
        public long contentLength() {
            return this.f21035a.contentLength();
        }

        @Override // je.AbstractC9744x
        public C9740t contentType() {
            return this.f21036b;
        }

        @Override // je.AbstractC9744x
        public void writeTo(BufferedSink bufferedSink) {
            this.f21035a.writeTo(bufferedSink);
        }
    }

    public C9027a0(String str, C9738r c9738r, String str2, C9737q c9737q, C9740t c9740t, boolean z10, boolean z11, boolean z12) {
        this.f21024a = str;
        this.f21025b = c9738r;
        this.f21026c = str2;
        this.f21030g = c9740t;
        this.f21031h = z10;
        if (c9737q != null) {
            this.f21029f = c9737q.m19391c();
        } else {
            this.f21029f = new C9737q.a();
        }
        if (z11) {
            this.f21033j = new C9736p.a();
        } else if (z12) {
            C9741u.a aVar = new C9741u.a();
            this.f21032i = aVar;
            aVar.m19496e(C9741u.f22782k);
        }
    }

    /* renamed from: i */
    public static String m17669i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m17670j(buffer, str, iCharCount, length, z10);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m17670j(Buffer buffer, String str, int i10, int i11, boolean z10) throws EOFException {
        Buffer buffer2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    long size = buffer2.size();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte b10 = buffer2.getByte(j10);
                        int i12 = b10 & C7863av.f14384i;
                        buffer.writeByte(37);
                        char[] cArr = f21022l;
                        buffer.writeByte((int) cArr[(i12 >> 4) & 15]);
                        buffer.writeByte((int) cArr[b10 & 15]);
                    }
                    buffer2.clear();
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: a */
    public void m17671a(String str, String str2, boolean z10) {
        if (z10) {
            this.f21033j.m19386b(str, str2);
        } else {
            this.f21033j.m19385a(str, str2);
        }
    }

    /* renamed from: b */
    public void m17672b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f21029f.m19399e(str, str2);
                return;
            } else {
                this.f21029f.m19395a(str, str2);
                return;
            }
        }
        try {
            this.f21030g = C9740t.m19482e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* renamed from: c */
    public void m17673c(C9737q c9737q) {
        this.f21029f.m19396b(c9737q);
    }

    /* renamed from: d */
    public void m17674d(C9737q c9737q, AbstractC9744x abstractC9744x) {
        this.f21032i.m19493b(c9737q, abstractC9744x);
    }

    /* renamed from: e */
    public void m17675e(C9741u.c cVar) {
        this.f21032i.m19494c(cVar);
    }

    /* renamed from: f */
    public void m17676f(String str, String str2, boolean z10) throws EOFException {
        if (this.f21026c == null) {
            throw new AssertionError();
        }
        String strM17669i = m17669i(str2, z10);
        String strReplace = this.f21026c.replace("{" + str + "}", strM17669i);
        if (!f21023m.matcher(strReplace).matches()) {
            this.f21026c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m17677g(String str, String str2, boolean z10) {
        String str3 = this.f21026c;
        if (str3 != null) {
            C9738r.a aVarM19422l = this.f21025b.m19422l(str3);
            this.f21027d = aVarM19422l;
            if (aVarM19422l == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f21025b + ", Relative: " + this.f21026c);
            }
            this.f21026c = null;
        }
        if (z10) {
            this.f21027d.m19431a(str, str2);
        } else {
            this.f21027d.m19433c(str, str2);
        }
    }

    /* renamed from: h */
    public void m17678h(Class cls, Object obj) {
        this.f21028e.m19606n(cls, obj);
    }

    /* renamed from: k */
    public C9743w.a m17679k() {
        C9738r c9738rM19427q;
        C9738r.a aVar = this.f21027d;
        if (aVar != null) {
            c9738rM19427q = aVar.m19434d();
        } else {
            c9738rM19427q = this.f21025b.m19427q(this.f21026c);
            if (c9738rM19427q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f21025b + ", Relative: " + this.f21026c);
            }
        }
        AbstractC9744x aVar2 = this.f21034k;
        if (aVar2 == null) {
            C9736p.a aVar3 = this.f21033j;
            if (aVar3 != null) {
                aVar2 = aVar3.m19387c();
            } else {
                C9741u.a aVar4 = this.f21032i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m19495d();
                } else if (this.f21031h) {
                    aVar2 = AbstractC9744x.create((C9740t) null, new byte[0]);
                }
            }
        }
        C9740t c9740t = this.f21030g;
        if (c9740t != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c9740t);
            } else {
                this.f21029f.m19395a("Content-Type", c9740t.toString());
            }
        }
        return this.f21028e.m19609q(c9738rM19427q).m19601i(this.f21029f.m19400f()).m19602j(this.f21024a, aVar2);
    }

    /* renamed from: l */
    public void m17680l(AbstractC9744x abstractC9744x) {
        this.f21034k = abstractC9744x;
    }

    /* renamed from: m */
    public void m17681m(Object obj) {
        this.f21026c = obj.toString();
    }
}
