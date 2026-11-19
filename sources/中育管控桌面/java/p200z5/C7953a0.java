package p200z5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.regex.Pattern;
import kotlin.UByte;
import okio.Buffer;
import okio.BufferedSink;
import p058f5.AbstractC6360c0;
import p058f5.C6358b0;
import p058f5.C6380s;
import p058f5.C6383v;
import p058f5.C6384w;
import p058f5.C6386y;
import p058f5.C6387z;

/* renamed from: z5.a0 */
/* loaded from: classes4.dex */
public final class C7953a0 {

    /* renamed from: l */
    public static final char[] f10674l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f10675m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f10676a;

    /* renamed from: b */
    public final C6384w f10677b;

    /* renamed from: c */
    public String f10678c;

    /* renamed from: d */
    public C6384w.a f10679d;

    /* renamed from: e */
    public final C6358b0.a f10680e = new C6358b0.a();

    /* renamed from: f */
    public final C6383v.a f10681f;

    /* renamed from: g */
    public C6386y f10682g;

    /* renamed from: h */
    public final boolean f10683h;

    /* renamed from: i */
    public C6387z.a f10684i;

    /* renamed from: j */
    public C6380s.a f10685j;

    /* renamed from: k */
    public AbstractC6360c0 f10686k;

    /* renamed from: z5.a0$a */
    public static class a extends AbstractC6360c0 {

        /* renamed from: a */
        public final AbstractC6360c0 f10687a;

        /* renamed from: b */
        public final C6386y f10688b;

        public a(AbstractC6360c0 abstractC6360c0, C6386y c6386y) {
            this.f10687a = abstractC6360c0;
            this.f10688b = c6386y;
        }

        @Override // p058f5.AbstractC6360c0
        public long contentLength() {
            return this.f10687a.contentLength();
        }

        @Override // p058f5.AbstractC6360c0
        /* renamed from: contentType */
        public C6386y getContentType() {
            return this.f10688b;
        }

        @Override // p058f5.AbstractC6360c0
        public void writeTo(BufferedSink bufferedSink) {
            this.f10687a.writeTo(bufferedSink);
        }
    }

    public C7953a0(String str, C6384w c6384w, String str2, C6383v c6383v, C6386y c6386y, boolean z6, boolean z7, boolean z8) {
        this.f10676a = str;
        this.f10677b = c6384w;
        this.f10678c = str2;
        this.f10682g = c6386y;
        this.f10683h = z6;
        if (c6383v != null) {
            this.f10681f = c6383v.m6802d();
        } else {
            this.f10681f = new C6383v.a();
        }
        if (z7) {
            this.f10685j = new C6380s.a();
        } else if (z8) {
            C6387z.a aVar = new C6387z.a();
            this.f10684i = aVar;
            aVar.m6889e(C6387z.f7995k);
        }
    }

    /* renamed from: i */
    public static String m9750i(String str, boolean z6) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z6 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m9751j(buffer, str, iCharCount, length, z6);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m9751j(Buffer buffer, String str, int i6, int i7, boolean z6) throws EOFException {
        Buffer buffer2 = null;
        while (i6 < i7) {
            int iCodePointAt = str.codePointAt(i6);
            if (!z6 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z6 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    long size = buffer2.size();
                    for (long j6 = 0; j6 < size; j6++) {
                        byte b7 = buffer2.getByte(j6);
                        int i8 = b7 & UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = f10674l;
                        buffer.writeByte((int) cArr[(i8 >> 4) & 15]);
                        buffer.writeByte((int) cArr[b7 & 15]);
                    }
                    buffer2.clear();
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i6 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: a */
    public void m9752a(String str, String str2, boolean z6) {
        if (z6) {
            this.f10685j.m6796b(str, str2);
        } else {
            this.f10685j.m6795a(str, str2);
        }
    }

    /* renamed from: b */
    public void m9753b(String str, String str2, boolean z6) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            if (z6) {
                this.f10681f.m6810e(str, str2);
                return;
            } else {
                this.f10681f.m6806a(str, str2);
                return;
            }
        }
        try {
            this.f10682g = C6386y.m6876e(str2);
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e6);
        }
    }

    /* renamed from: c */
    public void m9754c(C6383v c6383v) {
        this.f10681f.m6807b(c6383v);
    }

    /* renamed from: d */
    public void m9755d(C6383v c6383v, AbstractC6360c0 abstractC6360c0) {
        this.f10684i.m6886b(c6383v, abstractC6360c0);
    }

    /* renamed from: e */
    public void m9756e(C6387z.c cVar) {
        this.f10684i.m6887c(cVar);
    }

    /* renamed from: f */
    public void m9757f(String str, String str2, boolean z6) throws EOFException {
        if (this.f10678c == null) {
            throw new AssertionError();
        }
        String strM9750i = m9750i(str2, z6);
        String strReplace = this.f10678c.replace("{" + str + "}", strM9750i);
        if (!f10675m.matcher(strReplace).matches()) {
            this.f10678c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m9758g(String str, String str2, boolean z6) {
        String str3 = this.f10678c;
        if (str3 != null) {
            C6384w.a aVarM6826k = this.f10677b.m6826k(str3);
            this.f10679d = aVarM6826k;
            if (aVarM6826k == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f10677b + ", Relative: " + this.f10678c);
            }
            this.f10678c = null;
        }
        if (z6) {
            this.f10679d.m6840a(str, str2);
        } else {
            this.f10679d.m6842c(str, str2);
        }
    }

    /* renamed from: h */
    public void m9759h(Class cls, Object obj) {
        this.f10680e.m6608t(cls, obj);
    }

    /* renamed from: k */
    public C6358b0.a m9760k() {
        C6384w c6384wM6831p;
        C6384w.a aVar = this.f10679d;
        if (aVar != null) {
            c6384wM6831p = aVar.m6843d();
        } else {
            c6384wM6831p = this.f10677b.m6831p(this.f10678c);
            if (c6384wM6831p == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f10677b + ", Relative: " + this.f10678c);
            }
        }
        AbstractC6360c0 aVar2 = this.f10686k;
        if (aVar2 == null) {
            C6380s.a aVar3 = this.f10685j;
            if (aVar3 != null) {
                aVar2 = aVar3.m6797c();
            } else {
                C6387z.a aVar4 = this.f10684i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m6888d();
                } else if (this.f10683h) {
                    aVar2 = AbstractC6360c0.create((C6386y) null, new byte[0]);
                }
            }
        }
        C6386y c6386y = this.f10682g;
        if (c6386y != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c6386y);
            } else {
                this.f10681f.m6806a(HttpHeaders.CONTENT_TYPE, c6386y.toString());
            }
        }
        return this.f10680e.m6610v(c6384wM6831p).m6604p(this.f10681f.m6811f()).m6605q(this.f10676a, aVar2);
    }

    /* renamed from: l */
    public void m9761l(AbstractC6360c0 abstractC6360c0) {
        this.f10686k = abstractC6360c0;
    }

    /* renamed from: m */
    public void m9762m(Object obj) {
        this.f10678c = obj.toString();
    }
}
