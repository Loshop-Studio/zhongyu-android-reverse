package p153l2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.Typography;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: l2.a */
/* loaded from: classes4.dex */
public class C8490a implements XmlSerializer {

    /* renamed from: h */
    public static final String[] f14060h = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    public int f14062b;

    /* renamed from: c */
    public Writer f14063c;

    /* renamed from: d */
    public OutputStream f14064d;

    /* renamed from: e */
    public CharsetEncoder f14065e;

    /* renamed from: g */
    public boolean f14067g;

    /* renamed from: a */
    public final char[] f14061a = new char[8192];

    /* renamed from: f */
    public ByteBuffer f14066f = ByteBuffer.allocate(8192);

    /* renamed from: a */
    public final void m13916a(String str, int i10, int i11) throws IOException {
        if (i11 > 8192) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                int i13 = i10 + 8192;
                m13916a(str, i10, i13 < i12 ? 8192 : i12 - i10);
                i10 = i13;
            }
            return;
        }
        int i14 = this.f14062b;
        if (i14 + i11 > 8192) {
            flush();
            i14 = this.f14062b;
        }
        str.getChars(i10, i10 + i11, this.f14061a, i14);
        this.f14062b = i14 + i11;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        m13918c(' ');
        if (str != null) {
            m13919d(str);
            m13918c(':');
        }
        m13919d(str2);
        m13919d("=\"");
        m13921f(str3);
        m13918c(Typography.quote);
        return this;
    }

    /* renamed from: b */
    public final void m13917b(char[] cArr, int i10, int i11) throws IOException {
        String str;
        String[] strArr = f14060h;
        char length = (char) strArr.length;
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 < length && (str = strArr[c10]) != null) {
                if (i13 < i10) {
                    m13920e(cArr, i13, i10 - i13);
                }
                i13 = i10 + 1;
                m13919d(str);
            }
            i10++;
        }
        if (i13 < i10) {
            m13920e(cArr, i13, i10 - i13);
        }
    }

    /* renamed from: c */
    public final void m13918c(char c10) throws IOException {
        int i10 = this.f14062b;
        if (i10 >= 8191) {
            flush();
            i10 = this.f14062b;
        }
        this.f14061a[i10] = c10;
        this.f14062b = i10 + 1;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void m13919d(String str) throws IOException {
        m13916a(str, 0, str.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m13920e(char[] cArr, int i10, int i11) throws IOException {
        if (i11 > 8192) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                int i13 = i10 + 8192;
                m13920e(cArr, i10, i13 < i12 ? 8192 : i12 - i10);
                i10 = i13;
            }
            return;
        }
        int i14 = this.f14062b;
        if (i14 + i11 > 8192) {
            flush();
            i14 = this.f14062b;
        }
        System.arraycopy(cArr, i10, this.f14061a, i14, i11);
        this.f14062b = i14 + i11;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException {
        if (this.f14067g) {
            m13919d(" />\n");
        } else {
            m13919d("</");
            if (str != null) {
                m13919d(str);
                m13918c(':');
            }
            m13919d(str2);
            m13919d(">\n");
        }
        this.f14067g = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final void m13921f(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = f14060h;
        char length2 = (char) strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < length2 && (str2 = strArr[cCharAt]) != null) {
                if (i11 < i10) {
                    m13916a(str, i11, i10 - i11);
                }
                i11 = i10 + 1;
                m13919d(str2);
            }
            i10++;
        }
        if (i11 < i10) {
            m13916a(str, i11, i10 - i11);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i10 = this.f14062b;
        if (i10 > 0) {
            if (this.f14064d != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.f14061a, 0, i10);
                CoderResult coderResultEncode = this.f14065e.encode(charBufferWrap, this.f14066f, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        m13922g();
                        coderResultEncode = this.f14065e.encode(charBufferWrap, this.f14066f, true);
                    } else {
                        m13922g();
                        this.f14064d.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.f14063c.write(this.f14061a, 0, i10);
            this.f14063c.flush();
            this.f14062b = 0;
        }
    }

    /* renamed from: g */
    public final void m13922g() throws IOException {
        int iPosition = this.f14066f.position();
        if (iPosition > 0) {
            this.f14066f.flip();
            this.f14064d.write(this.f14066f.array(), 0, iPosition);
            this.f14066f.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z9) {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f14065e = Charset.forName(str).newEncoder();
            this.f14064d = outputStream;
        } catch (IllegalCharsetNameException e10) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e10));
        } catch (UnsupportedCharsetException e11) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e11));
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        m13919d(sb.toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.f14067g) {
            m13919d(">\n");
        }
        m13918c(Typography.less);
        if (str != null) {
            m13919d(str);
            m13918c(':');
        }
        m13919d(str2);
        this.f14067g = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i10, int i11) throws IOException {
        if (this.f14067g) {
            m13919d(">");
            this.f14067g = false;
        }
        m13917b(cArr, i10, i11);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException {
        if (this.f14067g) {
            m13919d(">");
            this.f14067g = false;
        }
        m13921f(str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
        this.f14063c = writer;
    }
}
