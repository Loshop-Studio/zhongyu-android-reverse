package p080j3;

import java.util.regex.Pattern;
import kotlin.UByte;
import okio.Buffer;
import okio.BufferedSink;
import p117r2.AbstractC4523z;
import p117r2.C4515r;
import p117r2.C4516s;
import p117r2.C4517t;
import p117r2.C4519v;
import p117r2.C4520w;
import p117r2.C4522y;

/* renamed from: j3.b0 */
/* loaded from: classes2.dex */
public final class C3808b0 {

    /* renamed from: l */
    public static final char[] f4560l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f4561m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f4562a;

    /* renamed from: b */
    public final C4517t f4563b;

    /* renamed from: c */
    public String f4564c;

    /* renamed from: d */
    public C4517t.a f4565d;

    /* renamed from: e */
    public final C4522y.a f4566e = new C4522y.a();

    /* renamed from: f */
    public final C4516s.a f4567f;

    /* renamed from: g */
    public C4519v f4568g;

    /* renamed from: h */
    public final boolean f4569h;

    /* renamed from: i */
    public C4520w.a f4570i;

    /* renamed from: j */
    public C4515r.a f4571j;

    /* renamed from: k */
    public AbstractC4523z f4572k;

    /* renamed from: j3.b0$a */
    public static class a extends AbstractC4523z {

        /* renamed from: a */
        public final AbstractC4523z f4573a;

        /* renamed from: b */
        public final C4519v f4574b;

        public a(AbstractC4523z abstractC4523z, C4519v c4519v) {
            this.f4573a = abstractC4523z;
            this.f4574b = c4519v;
        }

        @Override // p117r2.AbstractC4523z
        public long contentLength() {
            return this.f4573a.contentLength();
        }

        @Override // p117r2.AbstractC4523z
        /* renamed from: contentType */
        public C4519v getContentType() {
            return this.f4574b;
        }

        @Override // p117r2.AbstractC4523z
        public void writeTo(BufferedSink bufferedSink) {
            this.f4573a.writeTo(bufferedSink);
        }
    }

    public C3808b0(String str, C4517t c4517t, String str2, C4516s c4516s, C4519v c4519v, boolean z3, boolean z4, boolean z5) {
        this.f4562a = str;
        this.f4563b = c4517t;
        this.f4564c = str2;
        this.f4568g = c4519v;
        this.f4569h = z3;
        if (c4516s != null) {
            this.f4567f = c4516s.m5961c();
        } else {
            this.f4567f = new C4516s.a();
        }
        if (z4) {
            this.f4571j = new C4515r.a();
        } else if (z5) {
            C4520w.a aVar = new C4520w.a();
            this.f4570i = aVar;
            aVar.m6061d(C4520w.f5567j);
        }
    }

    /* renamed from: i */
    public static String m4985i(String str, boolean z3) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z3 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m4986j(buffer, str, iCharCount, length, z3);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m4986j(Buffer buffer, String str, int i4, int i5, boolean z3) {
        Buffer buffer2 = null;
        while (i4 < i5) {
            int iCodePointAt = str.codePointAt(i4);
            if (!z3 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z3 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    while (!buffer2.exhausted()) {
                        int i6 = buffer2.readByte() & UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = f4560l;
                        buffer.writeByte((int) cArr[(i6 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i6 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i4 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: a */
    public void m4987a(String str, String str2, boolean z3) {
        if (z3) {
            this.f4571j.m5956b(str, str2);
        } else {
            this.f4571j.m5955a(str, str2);
        }
    }

    /* renamed from: b */
    public void m4988b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f4567f.m5964a(str, str2);
            return;
        }
        try {
            this.f4568g = C4519v.m6050e(str2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e4);
        }
    }

    /* renamed from: c */
    public void m4989c(C4516s c4516s) {
        this.f4567f.m5965b(c4516s);
    }

    /* renamed from: d */
    public void m4990d(C4516s c4516s, AbstractC4523z abstractC4523z) {
        this.f4570i.m6058a(c4516s, abstractC4523z);
    }

    /* renamed from: e */
    public void m4991e(C4520w.c cVar) {
        this.f4570i.m6059b(cVar);
    }

    /* renamed from: f */
    public void m4992f(String str, String str2, boolean z3) {
        if (this.f4564c == null) {
            throw new AssertionError();
        }
        String strM4985i = m4985i(str2, z3);
        String strReplace = this.f4564c.replace("{" + str + "}", strM4985i);
        if (!f4561m.matcher(strReplace).matches()) {
            this.f4564c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m4993g(String str, String str2, boolean z3) {
        String str3 = this.f4564c;
        if (str3 != null) {
            C4517t.a aVarM5990l = this.f4563b.m5990l(str3);
            this.f4565d = aVarM5990l;
            if (aVarM5990l == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f4563b + ", Relative: " + this.f4564c);
            }
            this.f4564c = null;
        }
        if (z3) {
            this.f4565d.m5999a(str, str2);
        } else {
            this.f4565d.m6001c(str, str2);
        }
    }

    /* renamed from: h */
    public void m4994h(Class cls, Object obj) {
        this.f4566e.m6148g(cls, obj);
    }

    /* renamed from: k */
    public C4522y.a m4995k() {
        C4517t c4517tM5995q;
        C4517t.a aVar = this.f4565d;
        if (aVar != null) {
            c4517tM5995q = aVar.m6002d();
        } else {
            c4517tM5995q = this.f4563b.m5995q(this.f4564c);
            if (c4517tM5995q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f4563b + ", Relative: " + this.f4564c);
            }
        }
        AbstractC4523z aVar2 = this.f4572k;
        if (aVar2 == null) {
            C4515r.a aVar3 = this.f4571j;
            if (aVar3 != null) {
                aVar2 = aVar3.m5957c();
            } else {
                C4520w.a aVar4 = this.f4570i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m6060c();
                } else if (this.f4569h) {
                    aVar2 = AbstractC4523z.create((C4519v) null, new byte[0]);
                }
            }
        }
        C4519v c4519v = this.f4568g;
        if (c4519v != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c4519v);
            } else {
                this.f4567f.m5964a("Content-Type", c4519v.toString());
            }
        }
        return this.f4566e.m6150i(c4517tM5995q).m6145d(this.f4567f.m5968e()).m6146e(this.f4562a, aVar2);
    }

    /* renamed from: l */
    public void m4996l(AbstractC4523z abstractC4523z) {
        this.f4572k = abstractC4523z;
    }

    /* renamed from: m */
    public void m4997m(Object obj) {
        this.f4564c = obj.toString();
    }
}
