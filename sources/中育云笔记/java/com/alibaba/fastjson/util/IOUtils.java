package com.alibaba.fastjson.util;

import androidx.collection.SieveCacheKt;
import anet.channel.request.Request;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.DescriptorProtos;
import com.taobao.accs.data.Message;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Properties;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* loaded from: classes3.dex */
public class IOUtils {
    public static final char[] ASCII_CHARS;

    /* renamed from: CA */
    public static final char[] f3990CA;
    static final char[] DigitOnes;
    static final char[] DigitTens;
    public static final String FASTJSON_COMPATIBLEWITHFIELDNAME = "fastjson.compatibleWithFieldName";
    public static final String FASTJSON_COMPATIBLEWITHJAVABEAN = "fastjson.compatibleWithJavaBean";
    public static final String FASTJSON_PROPERTIES = "fastjson.properties";

    /* renamed from: IA */
    public static final int[] f3991IA;
    static final char[] digits;
    public static final char[] replaceChars;
    static final int[] sizeTable;
    public static final byte[] specicalFlags_doubleQuotes;
    public static final boolean[] specicalFlags_doubleQuotesFlags;
    public static final byte[] specicalFlags_singleQuotes;
    public static final boolean[] specicalFlags_singleQuotesFlags;
    public static final Properties DEFAULT_PROPERTIES = new Properties();
    public static final Charset UTF8 = Charset.forName(Request.DEFAULT_CHARSET);
    public static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final boolean[] firstIdentifierFlags = new boolean[256];
    public static final boolean[] identifierFlags = new boolean[256];

    static {
        char c10 = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c10 >= zArr.length) {
                break;
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                zArr[c10] = true;
            } else if (c10 >= 'a' && c10 <= 'z') {
                zArr[c10] = true;
            } else if (c10 == '_' || c10 == '$') {
                zArr[c10] = true;
            }
            c10 = (char) (c10 + 1);
        }
        char c11 = 0;
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c11 < zArr2.length) {
                if (c11 >= 'A' && c11 <= 'Z') {
                    zArr2[c11] = true;
                } else if (c11 >= 'a' && c11 <= 'z') {
                    zArr2[c11] = true;
                } else if (c11 == '_') {
                    zArr2[c11] = true;
                } else if (c11 >= '0' && c11 <= '9') {
                    zArr2[c11] = true;
                }
                c11 = (char) (c11 + 1);
            } else {
                try {
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        loadPropertiesFromFile();
        byte[] bArr = new byte[Opcodes.IF_ICMPLT];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[Opcodes.IF_ICMPLT];
        specicalFlags_singleQuotes = bArr2;
        specicalFlags_doubleQuotesFlags = new boolean[Opcodes.IF_ICMPLT];
        specicalFlags_singleQuotesFlags = new boolean[Opcodes.IF_ICMPLT];
        replaceChars = new char[93];
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i10 = 14; i10 <= 31; i10++) {
            specicalFlags_doubleQuotes[i10] = 4;
            specicalFlags_singleQuotes[i10] = 4;
        }
        for (int i11 = 127; i11 < 160; i11++) {
            specicalFlags_doubleQuotes[i11] = 4;
            specicalFlags_singleQuotes[i11] = 4;
        }
        for (int i12 = 0; i12 < 161; i12++) {
            specicalFlags_doubleQuotesFlags[i12] = specicalFlags_doubleQuotes[i12] != 0;
            specicalFlags_singleQuotesFlags[i12] = specicalFlags_singleQuotes[i12] != 0;
        }
        char[] cArr = replaceChars;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        ASCII_CHARS = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        DigitTens = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        DigitOnes = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        sizeTable = new int[]{9, 99, 999, 9999, DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f3990CA = charArray;
        int[] iArr = new int[256];
        f3991IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            f3991IA[f3990CA[i13]] = i13;
        }
        f3991IA[61] = 0;
    }

    public static void close(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void decode(CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer) throws CharacterCodingException {
        try {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!coderResultDecode.isUnderflow()) {
                coderResultDecode.throwException();
            }
            CoderResult coderResultFlush = charsetDecoder.flush(charBuffer);
            if (coderResultFlush.isUnderflow()) {
                return;
            }
            coderResultFlush.throwException();
        } catch (CharacterCodingException e10) {
            throw new JSONException("utf8 decode error, " + e10.getMessage(), e10);
        }
    }

    public static byte[] decodeBase64(char[] cArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (i11 == 0) {
            return new byte[0];
        }
        int i14 = (i10 + i11) - 1;
        int i15 = i10;
        while (i15 < i14 && f3991IA[cArr[i15]] < 0) {
            i15++;
        }
        while (i14 > 0 && f3991IA[cArr[i14]] < 0) {
            i14--;
        }
        int i16 = cArr[i14] == '=' ? cArr[i14 + (-1)] == '=' ? 2 : 1 : 0;
        int i17 = (i14 - i15) + 1;
        if (i11 > 76) {
            i12 = (cArr[76] == '\r' ? i17 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i18 = (((i17 - i12) * 6) >> 3) - i16;
        byte[] bArr = new byte[i18];
        int i19 = (i18 / 3) * 3;
        int i20 = 0;
        int i21 = 0;
        while (i20 < i19) {
            int[] iArr = f3991IA;
            int i22 = i15 + 4;
            int i23 = iArr[cArr[i15 + 3]] | (iArr[cArr[i15 + 1]] << 12) | (iArr[cArr[i15]] << 18) | (iArr[cArr[i15 + 2]] << 6);
            bArr[i20] = (byte) (i23 >> 16);
            int i24 = i20 + 2;
            bArr[i20 + 1] = (byte) (i23 >> 8);
            i20 += 3;
            bArr[i24] = (byte) i23;
            if (i12 <= 0 || (i21 = i21 + 1) != 19) {
                i15 = i22;
            } else {
                i15 += 6;
                i21 = 0;
            }
        }
        if (i20 < i18) {
            int i25 = 0;
            while (i15 <= i14 - i16) {
                i13 |= f3991IA[cArr[i15]] << (18 - (i25 * 6));
                i25++;
                i15++;
            }
            int i26 = 16;
            while (i20 < i18) {
                bArr[i20] = (byte) (i13 >> i26);
                i26 -= 8;
                i20++;
            }
        }
        return bArr;
    }

    public static int decodeUTF8(byte[] bArr, int i10, int i11, char[] cArr) {
        int i12 = i10 + i11;
        int iMin = Math.min(i11, cArr.length);
        int i13 = 0;
        while (i13 < iMin) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i13++;
                i10 = i14;
            } else {
                if ((b11 >> 5) != -2 || (b11 & 30) == 0) {
                    if ((b11 >> 4) == -2) {
                        int i15 = i10 + 2;
                        if (i15 < i12) {
                            byte b12 = bArr[i14];
                            i10 += 3;
                            byte b13 = bArr[i15];
                            if ((b11 != -32 || (b12 & 224) != 128) && (b12 & 192) == 128 && (b13 & 192) == 128) {
                                char c10 = (char) (((b12 << 6) ^ (b11 << MqttWireMessage.MESSAGE_TYPE_PINGREQ)) ^ ((-123008) ^ b13));
                                if (c10 >= 55296 && c10 < 57344) {
                                    return -1;
                                }
                                cArr[i13] = c10;
                                i13++;
                            }
                        }
                        return -1;
                    }
                    if ((b11 >> 3) == -2 && i10 + 3 < i12) {
                        byte b14 = bArr[i14];
                        int i16 = i10 + 3;
                        byte b15 = bArr[i10 + 2];
                        i10 += 4;
                        byte b16 = bArr[i16];
                        int i17 = (((b11 << 18) ^ (b14 << MqttWireMessage.MESSAGE_TYPE_PINGREQ)) ^ (b15 << 6)) ^ (3678080 ^ b16);
                        if ((b14 & 192) == 128 && (b15 & 192) == 128 && (b16 & 192) == 128 && i17 >= 65536 && i17 < 1114112) {
                            int i18 = i13 + 1;
                            cArr[i13] = (char) ((i17 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            i13 += 2;
                            cArr[i18] = (char) ((i17 & Message.EXT_HEADER_VALUE_MAX_LEN) + Utf8.LOG_SURROGATE_HEADER);
                        }
                    }
                    return -1;
                }
                if (i14 >= i12) {
                    return -1;
                }
                i10 += 2;
                byte b17 = bArr[i14];
                if ((b17 & 192) != 128) {
                    return -1;
                }
                cArr[i13] = (char) ((b17 ^ (b11 << 6)) ^ Utf8.MASK_2BYTES);
                i13++;
            }
        }
        return i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [char, int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int encodeUTF8(char[] r9, int r10, int r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.IOUtils.encodeUTF8(char[], int, int, byte[]):int");
    }

    public static boolean firstIdentifier(char c10) {
        boolean[] zArr = firstIdentifierFlags;
        return c10 < zArr.length && zArr[c10];
    }

    public static void getChars(long j10, int i10, char[] cArr) {
        char c10;
        if (j10 < 0) {
            j10 = -j10;
            c10 = '-';
        } else {
            c10 = 0;
        }
        while (j10 > SieveCacheKt.NodeLinkMask) {
            long j11 = j10 / 100;
            int i11 = (int) (j10 - (((j11 << 6) + (j11 << 5)) + (j11 << 2)));
            cArr[i10 - 1] = DigitOnes[i11];
            i10 -= 2;
            cArr[i10] = DigitTens[i11];
            j10 = j11;
        }
        int i12 = (int) j10;
        while (i12 >= 65536) {
            int i13 = i12 / 100;
            int i14 = i12 - (((i13 << 6) + (i13 << 5)) + (i13 << 2));
            cArr[i10 - 1] = DigitOnes[i14];
            i10 -= 2;
            cArr[i10] = DigitTens[i14];
            i12 = i13;
        }
        while (true) {
            int i15 = (52429 * i12) >>> 19;
            int i16 = i10 - 1;
            cArr[i16] = digits[i12 - ((i15 << 3) + (i15 << 1))];
            if (i15 == 0) {
                break;
            }
            i12 = i15;
            i10 = i16;
        }
        if (c10 != 0) {
            cArr[i10 - 2] = c10;
        }
    }

    public static String getStringProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? DEFAULT_PROPERTIES.getProperty(str) : property;
    }

    public static boolean isIdent(char c10) {
        boolean[] zArr = identifierFlags;
        return c10 < zArr.length && zArr[c10];
    }

    public static boolean isValidJsonpQueryParam(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '.' && !isIdent(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static void loadPropertiesFromFile() throws IOException {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: com.alibaba.fastjson.util.IOUtils.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public InputStream run() {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(IOUtils.FASTJSON_PROPERTIES) : ClassLoader.getSystemResourceAsStream(IOUtils.FASTJSON_PROPERTIES);
            }
        });
        if (inputStream != null) {
            try {
                DEFAULT_PROPERTIES.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String readAll(Reader reader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        try {
            char[] cArr = new char[2048];
            while (true) {
                int i10 = reader.read(cArr, 0, 2048);
                if (i10 < 0) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Exception e10) {
            throw new JSONException("read string from reader error", e10);
        }
    }

    public static int stringSize(long j10) {
        long j11 = 10;
        for (int i10 = 1; i10 < 19; i10++) {
            if (j10 < j11) {
                return i10;
            }
            j11 *= 10;
        }
        return 19;
    }

    public static int stringSize(int i10) {
        int i11 = 0;
        while (i10 > sizeTable[i11]) {
            i11++;
        }
        return i11 + 1;
    }

    public static void getChars(int i10, int i11, char[] cArr) {
        char c10;
        if (i10 < 0) {
            i10 = -i10;
            c10 = '-';
        } else {
            c10 = 0;
        }
        while (i10 >= 65536) {
            int i12 = i10 / 100;
            int i13 = i10 - (((i12 << 6) + (i12 << 5)) + (i12 << 2));
            cArr[i11 - 1] = DigitOnes[i13];
            i11 -= 2;
            cArr[i11] = DigitTens[i13];
            i10 = i12;
        }
        while (true) {
            int i14 = (52429 * i10) >>> 19;
            int i15 = i11 - 1;
            cArr[i15] = digits[i10 - ((i14 << 3) + (i14 << 1))];
            if (i14 == 0) {
                break;
            }
            i10 = i14;
            i11 = i15;
        }
        if (c10 != 0) {
            cArr[i11 - 2] = c10;
        }
    }

    public static byte[] decodeBase64(String str, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            return new byte[0];
        }
        int i13 = (i10 + i11) - 1;
        int i14 = i10;
        while (i14 < i13 && f3991IA[str.charAt(i14)] < 0) {
            i14++;
        }
        while (i13 > 0 && f3991IA[str.charAt(i13)] < 0) {
            i13--;
        }
        int i15 = str.charAt(i13) == '=' ? str.charAt(i13 + (-1)) == '=' ? 2 : 1 : 0;
        int i16 = (i13 - i14) + 1;
        if (i11 > 76) {
            i12 = (str.charAt(76) == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i17 = (((i16 - i12) * 6) >> 3) - i15;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = f3991IA;
            int i21 = i14 + 4;
            int i22 = iArr[str.charAt(i14 + 3)] | (iArr[str.charAt(i14 + 1)] << 12) | (iArr[str.charAt(i14)] << 18) | (iArr[str.charAt(i14 + 2)] << 6);
            bArr[i19] = (byte) (i22 >> 16);
            int i23 = i19 + 2;
            bArr[i19 + 1] = (byte) (i22 >> 8);
            i19 += 3;
            bArr[i23] = (byte) i22;
            if (i12 <= 0 || (i20 = i20 + 1) != 19) {
                i14 = i21;
            } else {
                i14 += 6;
                i20 = 0;
            }
        }
        if (i19 < i17) {
            int i24 = 0;
            int i25 = 0;
            while (i14 <= i13 - i15) {
                i24 |= f3991IA[str.charAt(i14)] << (18 - (i25 * 6));
                i25++;
                i14++;
            }
            int i26 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i24 >> i26);
                i26 -= 8;
                i19++;
            }
        }
        return bArr;
    }

    public static void getChars(byte b10, int i10, char[] cArr) {
        char c10;
        int i11;
        if (b10 < 0) {
            c10 = '-';
            i11 = -b10;
        } else {
            c10 = 0;
            i11 = b10;
        }
        while (true) {
            int i12 = (52429 * i11) >>> 19;
            int i13 = i10 - 1;
            cArr[i13] = digits[i11 - ((i12 << 3) + (i12 << 1))];
            if (i12 == 0) {
                break;
            }
            i11 = i12;
            i10 = i13;
        }
        if (c10 != 0) {
            cArr[i10 - 2] = c10;
        }
    }

    public static byte[] decodeBase64(String str) {
        int i10;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11 && f3991IA[str.charAt(i12) & 255] < 0) {
            i12++;
        }
        while (i11 > 0 && f3991IA[str.charAt(i11) & 255] < 0) {
            i11--;
        }
        int i13 = str.charAt(i11) == '=' ? str.charAt(i11 + (-1)) == '=' ? 2 : 1 : 0;
        int i14 = (i11 - i12) + 1;
        if (length > 76) {
            i10 = (str.charAt(76) == '\r' ? i14 / 78 : 0) << 1;
        } else {
            i10 = 0;
        }
        int i15 = (((i14 - i10) * 6) >> 3) - i13;
        byte[] bArr = new byte[i15];
        int i16 = (i15 / 3) * 3;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int[] iArr = f3991IA;
            int i19 = i12 + 4;
            int i20 = iArr[str.charAt(i12 + 3)] | (iArr[str.charAt(i12 + 1)] << 12) | (iArr[str.charAt(i12)] << 18) | (iArr[str.charAt(i12 + 2)] << 6);
            bArr[i17] = (byte) (i20 >> 16);
            int i21 = i17 + 2;
            bArr[i17 + 1] = (byte) (i20 >> 8);
            i17 += 3;
            bArr[i21] = (byte) i20;
            if (i10 <= 0 || (i18 = i18 + 1) != 19) {
                i12 = i19;
            } else {
                i12 += 6;
                i18 = 0;
            }
        }
        if (i17 < i15) {
            int i22 = 0;
            int i23 = 0;
            while (i12 <= i11 - i13) {
                i22 |= f3991IA[str.charAt(i12)] << (18 - (i23 * 6));
                i23++;
                i12++;
            }
            int i24 = 16;
            while (i17 < i15) {
                bArr[i17] = (byte) (i22 >> i24);
                i24 -= 8;
                i17++;
            }
        }
        return bArr;
    }
}
