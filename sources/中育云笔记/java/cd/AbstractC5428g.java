package cd;

import androidx.collection.SieveCacheKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p310qd.C10792c;
import p325rc.AbstractC10964p;

/* renamed from: cd.g */
/* loaded from: classes6.dex */
public abstract class AbstractC5428g extends AbstractC5427f {
    /* renamed from: a */
    public static final ByteBuffer m2917a(int i10, CharsetEncoder encoder) {
        AbstractC9979u.m20294g(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        AbstractC9979u.m20293f(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* renamed from: b */
    public static final CharsetEncoder m2918b(Charset charset) {
        AbstractC9979u.m20294g(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    /* renamed from: c */
    public static byte[] m2919c(File file) {
        AbstractC9979u.m20294g(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > SieveCacheKt.NodeLinkMask) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrM24017j = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrM24017j, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrM24017j = Arrays.copyOf(bArrM24017j, i12);
                AbstractC9979u.m20293f(bArrM24017j, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    C5425d c5425d = new C5425d(8193);
                    c5425d.write(i14);
                    AbstractC5422a.m2901b(fileInputStream, c5425d, 0, 2, null);
                    int size = c5425d.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM2905e = c5425d.m2905e();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrM24017j, size);
                    AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
                    bArrM24017j = AbstractC10964p.m24017j(bArrM2905e, bArrCopyOf, i10, 0, c5425d.size());
                }
            }
            AbstractC5423b.m2902a(fileInputStream, null);
            return bArrM24017j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5423b.m2902a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static String m2920d(File file, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(file, "<this>");
        AbstractC9979u.m20294g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM2929c = AbstractC5430i.m2929c(inputStreamReader);
            AbstractC5423b.m2902a(inputStreamReader, null);
            return strM2929c;
        } finally {
        }
    }

    /* renamed from: e */
    public static /* synthetic */ String m2921e(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C10792c.f26019b;
        }
        return m2920d(file, charset);
    }

    /* renamed from: f */
    public static void m2922f(File file, String text, Charset charset) {
        AbstractC9979u.m20294g(file, "<this>");
        AbstractC9979u.m20294g(text, "text");
        AbstractC9979u.m20294g(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m2924h(fileOutputStream, text, charset);
            C10786q c10786q = C10786q.f26013a;
            AbstractC5423b.m2902a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m2923g(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C10792c.f26019b;
        }
        m2922f(file, str, charset);
    }

    /* renamed from: h */
    public static final void m2924h(OutputStream outputStream, String text, Charset charset) throws IOException {
        AbstractC9979u.m20294g(outputStream, "<this>");
        AbstractC9979u.m20294g(text, "text");
        AbstractC9979u.m20294g(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC9979u.m20293f(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderM2918b = m2918b(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC9979u.m20291d(charsetEncoderM2918b);
        ByteBuffer byteBufferM2917a = m2917a(8192, charsetEncoderM2918b);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC9979u.m20293f(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderM2918b.encode(charBufferAllocate, byteBufferM2917a, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferM2917a.array(), 0, byteBufferM2917a.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferM2917a.clear();
            i10 = i12;
        }
    }
}
