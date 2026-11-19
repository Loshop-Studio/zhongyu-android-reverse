package p226r9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.util.regex.Pattern;
import kotlin.UByte;
import okio.Buffer;
import okio.BufferedSink;
import p011a9.AbstractC0061x;
import p011a9.C0053p;
import p011a9.C0054q;
import p011a9.C0055r;
import p011a9.C0057t;
import p011a9.C0058u;
import p011a9.C0060w;

/* renamed from: r9.a0 */
/* loaded from: classes5.dex */
public final class C9053a0 {

    /* renamed from: l */
    public static final char[] f15519l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f15520m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f15521a;

    /* renamed from: b */
    public final C0055r f15522b;

    /* renamed from: c */
    public String f15523c;

    /* renamed from: d */
    public C0055r.a f15524d;

    /* renamed from: e */
    public final C0060w.a f15525e = new C0060w.a();

    /* renamed from: f */
    public final C0054q.a f15526f;

    /* renamed from: g */
    public C0057t f15527g;

    /* renamed from: h */
    public final boolean f15528h;

    /* renamed from: i */
    public C0058u.a f15529i;

    /* renamed from: j */
    public C0053p.a f15530j;

    /* renamed from: k */
    public AbstractC0061x f15531k;

    /* renamed from: r9.a0$a */
    public static class a extends AbstractC0061x {

        /* renamed from: a */
        public final AbstractC0061x f15532a;

        /* renamed from: b */
        public final C0057t f15533b;

        public a(AbstractC0061x abstractC0061x, C0057t c0057t) {
            this.f15532a = abstractC0061x;
            this.f15533b = c0057t;
        }

        @Override // p011a9.AbstractC0061x
        public long contentLength() {
            return this.f15532a.contentLength();
        }

        @Override // p011a9.AbstractC0061x
        /* renamed from: contentType */
        public C0057t getContentType() {
            return this.f15533b;
        }

        @Override // p011a9.AbstractC0061x
        public void writeTo(BufferedSink bufferedSink) {
            this.f15532a.writeTo(bufferedSink);
        }
    }

    public C9053a0(String str, C0055r c0055r, String str2, C0054q c0054q, C0057t c0057t, boolean z9, boolean z10, boolean z11) {
        this.f15521a = str;
        this.f15522b = c0055r;
        this.f15523c = str2;
        this.f15527g = c0057t;
        this.f15528h = z9;
        if (c0054q != null) {
            this.f15526f = c0054q.m182c();
        } else {
            this.f15526f = new C0054q.a();
        }
        if (z10) {
            this.f15530j = new C0053p.a();
        } else if (z11) {
            C0058u.a aVar = new C0058u.a();
            this.f15529i = aVar;
            aVar.m286e(C0058u.f201k);
        }
    }

    /* renamed from: i */
    public static String m15205i(String str, boolean z9) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                m15206j(buffer, str, iCharCount, length, z9);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m15206j(Buffer buffer, String str, int i10, int i11, boolean z9) throws EOFException {
        Buffer buffer2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    long size = buffer2.size();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte b10 = buffer2.getByte(j10);
                        int i12 = b10 & UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = f15519l;
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
    public void m15207a(String str, String str2, boolean z9) {
        if (z9) {
            this.f15530j.m177b(str, str2);
        } else {
            this.f15530j.m176a(str, str2);
        }
    }

    /* renamed from: b */
    public void m15208b(String str, String str2, boolean z9) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            if (z9) {
                this.f15526f.m190e(str, str2);
                return;
            } else {
                this.f15526f.m186a(str, str2);
                return;
            }
        }
        try {
            this.f15527g = C0057t.m273e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* renamed from: c */
    public void m15209c(C0054q c0054q) {
        this.f15526f.m187b(c0054q);
    }

    /* renamed from: d */
    public void m15210d(C0054q c0054q, AbstractC0061x abstractC0061x) {
        this.f15529i.m283b(c0054q, abstractC0061x);
    }

    /* renamed from: e */
    public void m15211e(C0058u.c cVar) {
        this.f15529i.m284c(cVar);
    }

    /* renamed from: f */
    public void m15212f(String str, String str2, boolean z9) throws EOFException {
        if (this.f15523c == null) {
            throw new AssertionError();
        }
        String strM15205i = m15205i(str2, z9);
        String strReplace = this.f15523c.replace("{" + str + "}", strM15205i);
        if (!f15520m.matcher(strReplace).matches()) {
            this.f15523c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m15213g(String str, String str2, boolean z9) {
        String str3 = this.f15523c;
        if (str3 != null) {
            C0055r.a aVarM213l = this.f15522b.m213l(str3);
            this.f15524d = aVarM213l;
            if (aVarM213l == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f15522b + ", Relative: " + this.f15523c);
            }
            this.f15523c = null;
        }
        if (z9) {
            this.f15524d.m222a(str, str2);
        } else {
            this.f15524d.m224c(str, str2);
        }
    }

    /* renamed from: h */
    public void m15214h(Class cls, Object obj) {
        this.f15525e.m394m(cls, obj);
    }

    /* renamed from: k */
    public C0060w.a m15215k() {
        C0055r c0055rM218q;
        C0055r.a aVar = this.f15524d;
        if (aVar != null) {
            c0055rM218q = aVar.m225d();
        } else {
            c0055rM218q = this.f15522b.m218q(this.f15523c);
            if (c0055rM218q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f15522b + ", Relative: " + this.f15523c);
            }
        }
        AbstractC0061x aVar2 = this.f15531k;
        if (aVar2 == null) {
            C0053p.a aVar3 = this.f15530j;
            if (aVar3 != null) {
                aVar2 = aVar3.m178c();
            } else {
                C0058u.a aVar4 = this.f15529i;
                if (aVar4 != null) {
                    aVar2 = aVar4.m285d();
                } else if (this.f15528h) {
                    aVar2 = AbstractC0061x.create((C0057t) null, new byte[0]);
                }
            }
        }
        C0057t c0057t = this.f15527g;
        if (c0057t != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c0057t);
            } else {
                this.f15526f.m186a(HttpHeaders.CONTENT_TYPE, c0057t.toString());
            }
        }
        return this.f15525e.m395n(c0055rM218q).m390i(this.f15526f.m191f()).m391j(this.f15521a, aVar2);
    }

    /* renamed from: l */
    public void m15216l(AbstractC0061x abstractC0061x) {
        this.f15531k = abstractC0061x;
    }

    /* renamed from: m */
    public void m15217m(Object obj) {
        this.f15523c = obj.toString();
    }
}
