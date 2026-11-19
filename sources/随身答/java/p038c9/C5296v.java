package p038c9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.regex.Pattern;
import kotlin.UByte;
import okio.Buffer;
import okio.BufferedSink;
import p172l8.AbstractC8925x;
import p172l8.C8917p;
import p172l8.C8918q;
import p172l8.C8919r;
import p172l8.C8921t;
import p172l8.C8922u;
import p172l8.C8924w;

/* renamed from: c9.v */
/* loaded from: classes5.dex */
public final class C5296v {

    /* renamed from: l */
    public static final char[] f2629l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f2630m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f2631a;

    /* renamed from: b */
    public final C8919r f2632b;

    /* renamed from: c */
    public String f2633c;

    /* renamed from: d */
    public C8919r.a f2634d;

    /* renamed from: e */
    public final C8924w.a f2635e = new C8924w.a();

    /* renamed from: f */
    public final C8918q.a f2636f;

    /* renamed from: g */
    public C8921t f2637g;

    /* renamed from: h */
    public final boolean f2638h;

    /* renamed from: i */
    public C8922u.a f2639i;

    /* renamed from: j */
    public C8917p.a f2640j;

    /* renamed from: k */
    public AbstractC8925x f2641k;

    /* renamed from: c9.v$a */
    public static class a extends AbstractC8925x {

        /* renamed from: a */
        public final AbstractC8925x f2642a;

        /* renamed from: b */
        public final C8921t f2643b;

        public a(AbstractC8925x abstractC8925x, C8921t c8921t) {
            this.f2642a = abstractC8925x;
            this.f2643b = c8921t;
        }

        @Override // p172l8.AbstractC8925x
        public long contentLength() {
            return this.f2642a.contentLength();
        }

        @Override // p172l8.AbstractC8925x
        /* renamed from: contentType */
        public C8921t getContentType() {
            return this.f2643b;
        }

        @Override // p172l8.AbstractC8925x
        public void writeTo(BufferedSink bufferedSink) {
            this.f2642a.writeTo(bufferedSink);
        }
    }

    public C5296v(String str, C8919r c8919r, String str2, C8918q c8918q, C8921t c8921t, boolean z9, boolean z10, boolean z11) {
        this.f2631a = str;
        this.f2632b = c8919r;
        this.f2633c = str2;
        this.f2637g = c8921t;
        this.f2638h = z9;
        if (c8918q != null) {
            this.f2636f = c8918q.m13938c();
        } else {
            this.f2636f = new C8918q.a();
        }
        if (z10) {
            this.f2640j = new C8917p.a();
        } else if (z11) {
            C8922u.a aVar = new C8922u.a();
            this.f2639i = aVar;
            aVar.m14042e(C8922u.f14829k);
        }
    }

    /* renamed from: i */
    public static String m2492i(String str, boolean z9) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m2493j(buffer, str, iCharCount, length, z9);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m2493j(Buffer buffer, String str, int i9, int i10, boolean z9) throws EOFException {
        Buffer buffer2 = null;
        while (i9 < i10) {
            int iCodePointAt = str.codePointAt(i9);
            if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    while (!buffer2.exhausted()) {
                        byte b10 = buffer2.readByte();
                        int i11 = b10 & UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = f2629l;
                        buffer.writeByte((int) cArr[(i11 >> 4) & 15]);
                        buffer.writeByte((int) cArr[b10 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i9 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: a */
    public void m2494a(String str, String str2, boolean z9) {
        if (z9) {
            this.f2640j.m13933b(str, str2);
        } else {
            this.f2640j.m13932a(str, str2);
        }
    }

    /* renamed from: b */
    public void m2495b(String str, String str2) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.f2636f.m13942a(str, str2);
            return;
        }
        try {
            this.f2637g = C8921t.m14029e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* renamed from: c */
    public void m2496c(C8918q c8918q) {
        this.f2636f.m13943b(c8918q);
    }

    /* renamed from: d */
    public void m2497d(C8918q c8918q, AbstractC8925x abstractC8925x) {
        this.f2639i.m14039b(c8918q, abstractC8925x);
    }

    /* renamed from: e */
    public void m2498e(C8922u.c cVar) {
        this.f2639i.m14040c(cVar);
    }

    /* renamed from: f */
    public void m2499f(String str, String str2, boolean z9) throws EOFException {
        if (this.f2633c == null) {
            throw new AssertionError();
        }
        String strM2492i = m2492i(str2, z9);
        String strReplace = this.f2633c.replace("{" + str + "}", strM2492i);
        if (!f2630m.matcher(strReplace).matches()) {
            this.f2633c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m2500g(String str, String str2, boolean z9) {
        String str3 = this.f2633c;
        if (str3 != null) {
            C8919r.a aVarM13969l = this.f2632b.m13969l(str3);
            this.f2634d = aVarM13969l;
            if (aVarM13969l == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f2632b + ", Relative: " + this.f2633c);
            }
            this.f2633c = null;
        }
        if (z9) {
            this.f2634d.m13978a(str, str2);
        } else {
            this.f2634d.m13980c(str, str2);
        }
    }

    /* renamed from: h */
    public void m2501h(Class cls, Object obj) {
        this.f2635e.m14150m(cls, obj);
    }

    /* renamed from: k */
    public C8924w.a m2502k() {
        C8919r c8919rM13974q;
        C8919r.a aVar = this.f2634d;
        if (aVar != null) {
            c8919rM13974q = aVar.m13981d();
        } else {
            c8919rM13974q = this.f2632b.m13974q(this.f2633c);
            if (c8919rM13974q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f2632b + ", Relative: " + this.f2633c);
            }
        }
        AbstractC8925x aVar2 = this.f2641k;
        if (aVar2 == null) {
            C8917p.a aVar3 = this.f2640j;
            if (aVar3 != null) {
                aVar2 = aVar3.m13934c();
            } else {
                C8922u.a aVar4 = this.f2639i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m14041d();
                } else if (this.f2638h) {
                    aVar2 = AbstractC8925x.create((C8921t) null, new byte[0]);
                }
            }
        }
        C8921t c8921t = this.f2637g;
        if (c8921t != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c8921t);
            } else {
                this.f2636f.m13942a(HttpHeaders.CONTENT_TYPE, c8921t.toString());
            }
        }
        return this.f2635e.m14152o(c8919rM13974q).m14146i(this.f2636f.m13947f()).m14147j(this.f2631a, aVar2);
    }

    /* renamed from: l */
    public void m2503l(AbstractC8925x abstractC8925x) {
        this.f2641k = abstractC8925x;
    }

    /* renamed from: m */
    public void m2504m(Object obj) {
        this.f2633c = obj.toString();
    }
}
