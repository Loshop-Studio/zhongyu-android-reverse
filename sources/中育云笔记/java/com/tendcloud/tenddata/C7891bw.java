package com.tendcloud.tenddata;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: com.tendcloud.tenddata.bw */
/* loaded from: classes5.dex */
public class C7891bw {

    /* renamed from: a */
    public static CodingErrorAction f14467a = CodingErrorAction.REPORT;

    /* renamed from: a */
    public static byte[] m11342a(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: b */
    public static byte[] m11344b(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void main(String[] strArr) {
        m11343b(m11342a("\u0000"));
        m11340a(m11344b("\u0000"));
    }

    /* renamed from: a */
    public static String m11340a(byte[] bArr) {
        return m11341a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m11343b(byte[] bArr) {
        return m11339a(ByteBuffer.wrap(bArr));
    }

    /* renamed from: a */
    public static String m11341a(byte[] bArr, int i10, int i11) {
        try {
            return new String(bArr, i10, i11, "ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: a */
    public static String m11339a(ByteBuffer byteBuffer) throws C7866ay {
        CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF8").newDecoder();
        charsetDecoderNewDecoder.onMalformedInput(f14467a);
        charsetDecoderNewDecoder.onUnmappableCharacter(f14467a);
        try {
            byteBuffer.mark();
            String string = charsetDecoderNewDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return string;
        } catch (CharacterCodingException e10) {
            throw new C7866ay(1007, e10);
        }
    }
}
