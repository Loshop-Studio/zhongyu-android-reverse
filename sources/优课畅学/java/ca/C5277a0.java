package ca;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.BufferedSink;
import p136i9.AbstractC8901c0;
import p136i9.C8899b0;
import p136i9.C8921s;
import p136i9.C8924v;
import p136i9.C8925w;
import p136i9.C8927y;
import p136i9.C8928z;

/* renamed from: ca.a0 */
/* loaded from: classes5.dex */
public final class C5277a0 {

    /* renamed from: l */
    public static final char[] f2413l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f2414m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f2415a;

    /* renamed from: b */
    public final C8925w f2416b;

    /* renamed from: c */
    public String f2417c;

    /* renamed from: d */
    public C8925w.a f2418d;

    /* renamed from: e */
    public final C8899b0.a f2419e = new C8899b0.a();

    /* renamed from: f */
    public final C8924v.a f2420f;

    /* renamed from: g */
    public C8927y f2421g;

    /* renamed from: h */
    public final boolean f2422h;

    /* renamed from: i */
    public C8928z.a f2423i;

    /* renamed from: j */
    public C8921s.a f2424j;

    /* renamed from: k */
    public AbstractC8901c0 f2425k;

    /* renamed from: ca.a0$a */
    public static class a extends AbstractC8901c0 {

        /* renamed from: a */
        public final AbstractC8901c0 f2426a;

        /* renamed from: b */
        public final C8927y f2427b;

        public a(AbstractC8901c0 abstractC8901c0, C8927y c8927y) {
            this.f2426a = abstractC8901c0;
            this.f2427b = c8927y;
        }

        @Override // p136i9.AbstractC8901c0
        public long contentLength() {
            return this.f2426a.contentLength();
        }

        @Override // p136i9.AbstractC8901c0
        public C8927y contentType() {
            return this.f2427b;
        }

        @Override // p136i9.AbstractC8901c0
        public void writeTo(BufferedSink bufferedSink) {
            this.f2426a.writeTo(bufferedSink);
        }
    }

    public C5277a0(String str, C8925w c8925w, String str2, C8924v c8924v, C8927y c8927y, boolean z10, boolean z11, boolean z12) {
        this.f2415a = str;
        this.f2416b = c8925w;
        this.f2417c = str2;
        this.f2421g = c8927y;
        this.f2422h = z10;
        if (c8924v != null) {
            this.f2420f = c8924v.m15263d();
        } else {
            this.f2420f = new C8924v.a();
        }
        if (z11) {
            this.f2424j = new C8921s.a();
        } else if (z12) {
            C8928z.a aVar = new C8928z.a();
            this.f2423i = aVar;
            aVar.m15349d(C8928z.f16827k);
        }
    }

    /* renamed from: i */
    public static String m2206i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m2207j(buffer, str, iCharCount, length, z10);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m2207j(Buffer buffer, String str, int i10, int i11, boolean z10) throws EOFException {
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
                        buffer.writeByte(37);
                        char[] cArr = f2413l;
                        buffer.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
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
    public void m2208a(String str, String str2, boolean z10) {
        if (z10) {
            this.f2424j.m15257b(str, str2);
        } else {
            this.f2424j.m15256a(str, str2);
        }
    }

    /* renamed from: b */
    public void m2209b(String str, String str2, boolean z10) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            if (z10) {
                this.f2420f.m15271e(str, str2);
                return;
            } else {
                this.f2420f.m15267a(str, str2);
                return;
            }
        }
        try {
            this.f2421g = C8927y.m15337e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* renamed from: c */
    public void m2210c(C8924v c8924v) {
        this.f2420f.m15268b(c8924v);
    }

    /* renamed from: d */
    public void m2211d(C8924v c8924v, AbstractC8901c0 abstractC8901c0) {
        this.f2423i.m15346a(c8924v, abstractC8901c0);
    }

    /* renamed from: e */
    public void m2212e(C8928z.c cVar) {
        this.f2423i.m15347b(cVar);
    }

    /* renamed from: f */
    public void m2213f(String str, String str2, boolean z10) throws EOFException {
        if (this.f2417c == null) {
            throw new AssertionError();
        }
        String strM2206i = m2206i(str2, z10);
        String strReplace = this.f2417c.replace("{" + str + "}", strM2206i);
        if (!f2414m.matcher(strReplace).matches()) {
            this.f2417c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m2214g(String str, String str2, boolean z10) {
        String str3 = this.f2417c;
        if (str3 != null) {
            C8925w.a aVarM15287k = this.f2416b.m15287k(str3);
            this.f2418d = aVarM15287k;
            if (aVarM15287k == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f2416b + ", Relative: " + this.f2417c);
            }
            this.f2417c = null;
        }
        if (z10) {
            this.f2418d.m15301a(str, str2);
        } else {
            this.f2418d.m15303c(str, str2);
        }
    }

    /* renamed from: h */
    public void m2215h(Class cls, Object obj) {
        this.f2419e.m15072t(cls, obj);
    }

    /* renamed from: k */
    public C8899b0.a m2216k() {
        C8925w c8925wM15292p;
        C8925w.a aVar = this.f2418d;
        if (aVar != null) {
            c8925wM15292p = aVar.m15304d();
        } else {
            c8925wM15292p = this.f2416b.m15292p(this.f2417c);
            if (c8925wM15292p == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f2416b + ", Relative: " + this.f2417c);
            }
        }
        AbstractC8901c0 aVar2 = this.f2425k;
        if (aVar2 == null) {
            C8921s.a aVar3 = this.f2424j;
            if (aVar3 != null) {
                aVar2 = aVar3.m15258c();
            } else {
                C8928z.a aVar4 = this.f2423i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m15348c();
                } else if (this.f2422h) {
                    aVar2 = AbstractC8901c0.create((C8927y) null, new byte[0]);
                }
            }
        }
        C8927y c8927y = this.f2421g;
        if (c8927y != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c8927y);
            } else {
                this.f2420f.m15267a(HttpHeaders.CONTENT_TYPE, c8927y.toString());
            }
        }
        return this.f2419e.m15073u(c8925wM15292p).m15068p(this.f2420f.m15272f()).m15069q(this.f2415a, aVar2);
    }

    /* renamed from: l */
    public void m2217l(AbstractC8901c0 abstractC8901c0) {
        this.f2425k = abstractC8901c0;
    }

    /* renamed from: m */
    public void m2218m(Object obj) {
        this.f2417c = obj.toString();
    }
}
