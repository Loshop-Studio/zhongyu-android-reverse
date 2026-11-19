package com.alibaba.fastjson.serializer;

import anet.channel.request.Request;
import anetwork.channel.util.RequestConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.RyuDouble;
import com.alibaba.fastjson.util.RyuFloat;
import com.tendcloud.tenddata.C7863av;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes3.dex */
public final class SerializeWriter extends Writer {
    private static int BUFFER_THRESHOLD;
    static final int nonDirectFeatures;
    protected boolean beanToArray;
    protected boolean browserSecure;
    protected char[] buf;
    protected int count;
    protected boolean disableCircularReferenceDetect;
    protected int features;
    protected char keySeperator;
    protected int maxBufSize;
    protected boolean notWriteDefaultValue;
    protected boolean quoteFieldNames;
    protected long sepcialBits;
    protected boolean sortField;
    protected boolean useSingleQuotes;
    protected boolean writeDirect;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected boolean writeNonStringValueAsString;
    private final Writer writer;
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    private static final ThreadLocal<byte[]> bytesBufLocal = new ThreadLocal<>();
    private static final char[] VALUE_TRUE = ":true".toCharArray();
    private static final char[] VALUE_FALSE = ":false".toCharArray();

    static {
        int i10;
        BUFFER_THRESHOLD = 131072;
        try {
            String stringProperty = IOUtils.getStringProperty("fastjson.serializer_buffer_threshold");
            if (stringProperty != null && stringProperty.length() > 0 && (i10 = Integer.parseInt(stringProperty)) >= 64 && i10 <= 65536) {
                BUFFER_THRESHOLD = i10 * 1024;
            }
        } catch (Throwable unused) {
        }
        nonDirectFeatures = SerializerFeature.UseSingleQuotes.mask | SerializerFeature.BrowserCompatible.mask | SerializerFeature.PrettyFormat.mask | SerializerFeature.WriteEnumUsingToString.mask | SerializerFeature.WriteNonStringValueAsString.mask | SerializerFeature.WriteSlashAsSpecial.mask | SerializerFeature.IgnoreErrorGetter.mask | SerializerFeature.WriteClassName.mask | SerializerFeature.NotWriteDefaultValue.mask;
    }

    public SerializeWriter() {
        this((Writer) null);
    }

    private int encodeToUTF8(OutputStream outputStream) throws IOException {
        int i10 = (int) (this.count * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        byte[] bArr2 = bArr.length < i10 ? new byte[i10] : bArr;
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr2);
        outputStream.write(bArr2, 0, iEncodeUTF8);
        if (bArr2 != bArr && bArr2.length <= BUFFER_THRESHOLD) {
            threadLocal.set(bArr2);
        }
        return iEncodeUTF8;
    }

    private byte[] encodeToUTF8Bytes() {
        int i10 = (int) (this.count * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        byte[] bArr2 = bArr.length < i10 ? new byte[i10] : bArr;
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr2);
        byte[] bArr3 = new byte[iEncodeUTF8];
        System.arraycopy(bArr2, 0, bArr3, 0, iEncodeUTF8);
        if (bArr2 != bArr && bArr2.length <= BUFFER_THRESHOLD) {
            threadLocal.set(bArr2);
        }
        return bArr3;
    }

    private void writeEnumFieldValue(char c10, String str, String str2) {
        if (this.useSingleQuotes) {
            writeFieldValue(c10, str, str2);
        } else {
            writeFieldValueStringWithDoubleQuote(c10, str, str2);
        }
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
        int i10;
        byte[] bArr = IOUtils.specicalFlags_singleQuotes;
        int length = str.length();
        int i11 = 1;
        int i12 = this.count + length + 1;
        if (i12 > this.buf.length) {
            if (this.writer != null) {
                if (length == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i11 = 0;
                        break;
                    }
                    char cCharAt = str.charAt(i13);
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i11 != 0) {
                    write(39);
                }
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 >= bArr.length || bArr[cCharAt2] == 0) {
                        write(cCharAt2);
                    } else {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt2]);
                    }
                }
                if (i11 != 0) {
                    write(39);
                }
                write(58);
                return;
            }
            expandCapacity(i12);
        }
        if (length == 0) {
            int i15 = this.count;
            if (i15 + 3 > this.buf.length) {
                expandCapacity(i15 + 3);
            }
            char[] cArr = this.buf;
            int i16 = this.count;
            int i17 = i16 + 1;
            this.count = i17;
            cArr[i16] = '\'';
            int i18 = i16 + 2;
            this.count = i18;
            cArr[i17] = '\'';
            this.count = i16 + 3;
            cArr[i18] = ':';
            return;
        }
        int i19 = this.count;
        int i20 = i19 + length;
        str.getChars(0, length, this.buf, i19);
        this.count = i12;
        int i21 = i19;
        int i22 = 0;
        while (i21 < i20) {
            char[] cArr2 = this.buf;
            char c10 = cArr2[i21];
            if (c10 >= bArr.length || bArr[c10] == 0) {
                i10 = i11;
            } else if (i22 == 0) {
                i12 += 3;
                if (i12 > cArr2.length) {
                    expandCapacity(i12);
                }
                this.count = i12;
                char[] cArr3 = this.buf;
                int i23 = i21 + 1;
                System.arraycopy(cArr3, i23, cArr3, i21 + 3, (i20 - i21) - i11);
                char[] cArr4 = this.buf;
                System.arraycopy(cArr4, 0, cArr4, i11, i21);
                char[] cArr5 = this.buf;
                cArr5[i19] = '\'';
                cArr5[i23] = '\\';
                i21 += 2;
                cArr5[i21] = IOUtils.replaceChars[c10];
                i20 += 2;
                cArr5[this.count - 2] = '\'';
                i22 = i11;
                i10 = i22;
            } else {
                i12++;
                if (i12 > cArr2.length) {
                    expandCapacity(i12);
                }
                this.count = i12;
                char[] cArr6 = this.buf;
                int i24 = i21 + 1;
                i10 = i11;
                System.arraycopy(cArr6, i24, cArr6, i21 + 2, i20 - i21);
                char[] cArr7 = this.buf;
                cArr7[i21] = '\\';
                cArr7[i24] = IOUtils.replaceChars[c10];
                i20++;
                i21 = i24;
            }
            i21++;
            i11 = i10;
        }
        this.buf[i12 - 1] = ':';
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.writer != null && this.count > 0) {
            flush();
        }
        char[] cArr = this.buf;
        if (cArr.length <= BUFFER_THRESHOLD) {
            bufLocal.set(cArr);
        }
        this.buf = null;
    }

    public void computeFeatures() {
        int i10 = this.features;
        boolean z10 = (SerializerFeature.QuoteFieldNames.mask & i10) != 0;
        this.quoteFieldNames = z10;
        boolean z11 = (SerializerFeature.UseSingleQuotes.mask & i10) != 0;
        this.useSingleQuotes = z11;
        this.sortField = (SerializerFeature.SortField.mask & i10) != 0;
        this.disableCircularReferenceDetect = (SerializerFeature.DisableCircularReferenceDetect.mask & i10) != 0;
        boolean z12 = (SerializerFeature.BeanToArray.mask & i10) != 0;
        this.beanToArray = z12;
        this.writeNonStringValueAsString = (SerializerFeature.WriteNonStringValueAsString.mask & i10) != 0;
        this.notWriteDefaultValue = (SerializerFeature.NotWriteDefaultValue.mask & i10) != 0;
        boolean z13 = (SerializerFeature.WriteEnumUsingName.mask & i10) != 0;
        this.writeEnumUsingName = z13;
        this.writeEnumUsingToString = (SerializerFeature.WriteEnumUsingToString.mask & i10) != 0;
        this.writeDirect = z10 && (nonDirectFeatures & i10) == 0 && (z12 || z13);
        this.keySeperator = z11 ? '\'' : '\"';
        boolean z14 = (SerializerFeature.BrowserSecure.mask & i10) != 0;
        this.browserSecure = z14;
        this.sepcialBits = z14 ? 5764610843043954687L : (i10 & SerializerFeature.WriteSlashAsSpecial.mask) != 0 ? 140758963191807L : 21474836479L;
    }

    public void config(SerializerFeature serializerFeature, boolean z10) {
        if (z10) {
            int mask = this.features | serializerFeature.getMask();
            this.features = mask;
            SerializerFeature serializerFeature2 = SerializerFeature.WriteEnumUsingToString;
            if (serializerFeature == serializerFeature2) {
                this.features = (~SerializerFeature.WriteEnumUsingName.getMask()) & mask;
            } else if (serializerFeature == SerializerFeature.WriteEnumUsingName) {
                this.features = (~serializerFeature2.getMask()) & mask;
            }
        } else {
            this.features = (~serializerFeature.getMask()) & this.features;
        }
        computeFeatures();
    }

    public void expandCapacity(int i10) {
        ThreadLocal<char[]> threadLocal;
        char[] cArr;
        int i11 = this.maxBufSize;
        if (i11 != -1 && i10 >= i11) {
            throw new JSONException("serialize exceeded MAX_OUTPUT_LENGTH=" + this.maxBufSize + ", minimumCapacity=" + i10);
        }
        char[] cArr2 = this.buf;
        int length = cArr2.length + (cArr2.length >> 1) + 1;
        if (length >= i10) {
            i10 = length;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr2, 0, cArr3, 0, this.count);
        if (this.buf.length < BUFFER_THRESHOLD && ((cArr = (threadLocal = bufLocal).get()) == null || cArr.length < this.buf.length)) {
            threadLocal.set(this.buf);
        }
        this.buf = cArr3;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.writer;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.buf, 0, this.count);
            this.writer.flush();
            this.count = 0;
        } catch (IOException e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    public int getBufferLength() {
        return this.buf.length;
    }

    public int getMaxBufSize() {
        return this.maxBufSize;
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        return (serializerFeature.mask & this.features) != 0;
    }

    public boolean isNotWriteDefaultValue() {
        return this.notWriteDefaultValue;
    }

    public boolean isSortField() {
        return this.sortField;
    }

    public void reset() {
        this.count = 0;
    }

    public void setMaxBufSize(int i10) {
        if (i10 >= this.buf.length) {
            this.maxBufSize = i10;
            return;
        }
        throw new JSONException("must > " + this.buf.length);
    }

    public int size() {
        return this.count;
    }

    public byte[] toBytes(String str) {
        return toBytes((str == null || Request.DEFAULT_CHARSET.equals(str)) ? IOUtils.UTF8 : Charset.forName(str));
    }

    public char[] toCharArray() {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        int i10 = this.count;
        char[] cArr = new char[i10];
        System.arraycopy(this.buf, 0, cArr, 0, i10);
        return cArr;
    }

    public char[] toCharArrayForSpringWebSocket() {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        int i10 = this.count;
        char[] cArr = new char[i10 - 2];
        System.arraycopy(this.buf, 1, cArr, 0, i10 - 2);
        return cArr;
    }

    public String toString() {
        return new String(this.buf, 0, this.count);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        int i11 = 1;
        int i12 = this.count + 1;
        if (i12 <= this.buf.length) {
            i11 = i12;
        } else if (this.writer == null) {
            expandCapacity(i12);
            i11 = i12;
        } else {
            flush();
        }
        this.buf[this.count] = (char) i10;
        this.count = i11;
    }

    public void writeByteArray(byte[] bArr) {
        if (isEnabled(SerializerFeature.WriteClassName.mask)) {
            writeHex(bArr);
            return;
        }
        int length = bArr.length;
        boolean z10 = this.useSingleQuotes;
        char c10 = z10 ? '\'' : '\"';
        if (length == 0) {
            write(z10 ? "''" : "\"\"");
            return;
        }
        char[] cArr = IOUtils.f3990CA;
        int i10 = (length / 3) * 3;
        int i11 = length - 1;
        int i12 = this.count;
        int i13 = (((i11 / 3) + 1) << 2) + i12;
        int i14 = i13 + 2;
        if (i14 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                int i15 = 0;
                while (i15 < i10) {
                    int i16 = i15 + 2;
                    int i17 = ((bArr[i15 + 1] & C7863av.f14384i) << 8) | ((bArr[i15] & C7863av.f14384i) << 16);
                    i15 += 3;
                    int i18 = i17 | (bArr[i16] & C7863av.f14384i);
                    write(cArr[(i18 >>> 18) & 63]);
                    write(cArr[(i18 >>> 12) & 63]);
                    write(cArr[(i18 >>> 6) & 63]);
                    write(cArr[i18 & 63]);
                }
                int i19 = length - i10;
                if (i19 > 0) {
                    int i20 = ((bArr[i10] & C7863av.f14384i) << 10) | (i19 == 2 ? (bArr[i11] & C7863av.f14384i) << 2 : 0);
                    write(cArr[i20 >> 12]);
                    write(cArr[(i20 >>> 6) & 63]);
                    write(i19 == 2 ? cArr[i20 & 63] : '=');
                    write(61);
                }
                write(c10);
                return;
            }
            expandCapacity(i14);
        }
        this.count = i14;
        int i21 = i12 + 1;
        this.buf[i12] = c10;
        int i22 = 0;
        while (i22 < i10) {
            int i23 = i22 + 2;
            int i24 = ((bArr[i22 + 1] & C7863av.f14384i) << 8) | ((bArr[i22] & C7863av.f14384i) << 16);
            i22 += 3;
            int i25 = i24 | (bArr[i23] & C7863av.f14384i);
            char[] cArr2 = this.buf;
            cArr2[i21] = cArr[(i25 >>> 18) & 63];
            cArr2[i21 + 1] = cArr[(i25 >>> 12) & 63];
            int i26 = i21 + 3;
            cArr2[i21 + 2] = cArr[(i25 >>> 6) & 63];
            i21 += 4;
            cArr2[i26] = cArr[i25 & 63];
        }
        int i27 = length - i10;
        if (i27 > 0) {
            int i28 = ((bArr[i10] & C7863av.f14384i) << 10) | (i27 == 2 ? (bArr[i11] & C7863av.f14384i) << 2 : 0);
            char[] cArr3 = this.buf;
            cArr3[i13 - 3] = cArr[i28 >> 12];
            cArr3[i13 - 2] = cArr[(i28 >>> 6) & 63];
            cArr3[i13 - 1] = i27 == 2 ? cArr[i28 & 63] : '=';
            cArr3[i13] = '=';
        }
        this.buf[i13 + 1] = c10;
    }

    public void writeDouble(double d10, boolean z10) throws IOException {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            writeNull();
            return;
        }
        int i10 = this.count + 24;
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                String string = RyuDouble.toString(d10);
                write(string, 0, string.length());
                if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
                    write(68);
                    return;
                }
                return;
            }
            expandCapacity(i10);
        }
        this.count += RyuDouble.toString(d10, this.buf, this.count);
        if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
            write(68);
        }
    }

    public void writeEnum(Enum<?> r22) {
        if (r22 == null) {
            writeNull();
            return;
        }
        String string = (!this.writeEnumUsingName || this.writeEnumUsingToString) ? this.writeEnumUsingToString ? r22.toString() : null : r22.name();
        if (string == null) {
            writeInt(r22.ordinal());
            return;
        }
        int i10 = isEnabled(SerializerFeature.UseSingleQuotes) ? 39 : 34;
        write(i10);
        write(string);
        write(i10);
    }

    public void writeFieldName(String str) {
        writeFieldName(str, false);
    }

    public void writeFieldNameDirect(String str) {
        int length = str.length();
        int i10 = this.count + length;
        int i11 = i10 + 3;
        if (i11 > this.buf.length) {
            expandCapacity(i11);
        }
        int i12 = this.count;
        char[] cArr = this.buf;
        cArr[i12] = '\"';
        str.getChars(0, length, cArr, i12 + 1);
        this.count = i11;
        char[] cArr2 = this.buf;
        cArr2[i10 + 1] = '\"';
        cArr2[i10 + 2] = ':';
    }

    public void writeFieldValue(char c10, String str, char c11) {
        write(c10);
        writeFieldName(str);
        if (c11 == 0) {
            writeString("\u0000");
        } else {
            writeString(Character.toString(c11));
        }
    }

    public void writeFieldValueStringWithDoubleQuote(char c10, String str, String str2) {
        int length = str.length();
        int i10 = this.count;
        int length2 = str2.length();
        int i11 = i10 + length + length2 + 6;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            expandCapacity(i11);
        }
        char[] cArr = this.buf;
        int i12 = this.count;
        cArr[i12] = c10;
        int i13 = i12 + 2;
        int i14 = i13 + length;
        cArr[i12 + 1] = '\"';
        str.getChars(0, length, cArr, i13);
        this.count = i11;
        char[] cArr2 = this.buf;
        cArr2[i14] = '\"';
        cArr2[i14 + 1] = ':';
        cArr2[i14 + 2] = '\"';
        str2.getChars(0, length2, cArr2, i14 + 3);
        this.buf[this.count - 1] = '\"';
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4 A[PHI: r4 r9 r10 r13
      0x00a4: PHI (r4v26 int) = (r4v23 int), (r4v27 int) binds: [B:55:0x00dd, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r9v8 int) = (r9v5 int), (r9v9 int) binds: [B:55:0x00dd, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r10v14 int) = (r10v3 int), (r10v15 int) binds: [B:55:0x00dd, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r13v14 int) = (r13v10 int), (r13v16 int) binds: [B:55:0x00dd, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeFieldValueStringWithDoubleQuoteCheck(char r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeFieldValueStringWithDoubleQuoteCheck(char, java.lang.String, java.lang.String):void");
    }

    public void writeFloat(float f10, boolean z10) throws IOException {
        if (f10 != f10 || f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
            writeNull();
            return;
        }
        int i10 = this.count + 15;
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                String string = RyuFloat.toString(f10);
                write(string, 0, string.length());
                if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
                    write(70);
                    return;
                }
                return;
            }
            expandCapacity(i10);
        }
        this.count += RyuFloat.toString(f10, this.buf, this.count);
        if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
            write(70);
        }
    }

    public void writeHex(byte[] bArr) {
        int length = this.count + (bArr.length * 2) + 3;
        if (length > this.buf.length) {
            expandCapacity(length);
        }
        char[] cArr = this.buf;
        int i10 = this.count;
        int i11 = i10 + 1;
        this.count = i11;
        cArr[i10] = 'x';
        this.count = i10 + 2;
        cArr[i11] = '\'';
        for (byte b10 : bArr) {
            int i12 = (b10 & C7863av.f14384i) >> 4;
            int i13 = b10 & 15;
            char[] cArr2 = this.buf;
            int i14 = this.count;
            int i15 = i14 + 1;
            this.count = i15;
            int i16 = 55;
            cArr2[i14] = (char) (i12 + (i12 < 10 ? 48 : 55));
            this.count = i14 + 2;
            if (i13 < 10) {
                i16 = 48;
            }
            cArr2[i15] = (char) (i13 + i16);
        }
        char[] cArr3 = this.buf;
        int i17 = this.count;
        this.count = i17 + 1;
        cArr3[i17] = '\'';
    }

    public void writeInt(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int iStringSize = i10 < 0 ? IOUtils.stringSize(-i10) + 1 : IOUtils.stringSize(i10);
        int i11 = this.count + iStringSize;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(i10, iStringSize, cArr);
                write(cArr, 0, iStringSize);
                return;
            }
            expandCapacity(i11);
        }
        IOUtils.getChars(i10, i11, this.buf);
        this.count = i11;
    }

    public void writeLong(long j10) {
        boolean z10 = isEnabled(SerializerFeature.BrowserCompatible) && !isEnabled(SerializerFeature.WriteClassName) && (j10 > 9007199254740991L || j10 < -9007199254740991L);
        if (j10 == Long.MIN_VALUE) {
            if (z10) {
                write("\"-9223372036854775808\"");
                return;
            } else {
                write("-9223372036854775808");
                return;
            }
        }
        int iStringSize = j10 < 0 ? IOUtils.stringSize(-j10) + 1 : IOUtils.stringSize(j10);
        int i10 = this.count + iStringSize;
        if (z10) {
            i10 += 2;
        }
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(j10, iStringSize, cArr);
                if (!z10) {
                    write(cArr, 0, iStringSize);
                    return;
                }
                write(34);
                write(cArr, 0, iStringSize);
                write(34);
                return;
            }
            expandCapacity(i10);
        }
        if (z10) {
            char[] cArr2 = this.buf;
            cArr2[this.count] = '\"';
            int i11 = i10 - 1;
            IOUtils.getChars(j10, i11, cArr2);
            this.buf[i11] = '\"';
        } else {
            IOUtils.getChars(j10, i10, this.buf);
        }
        this.count = i10;
    }

    public void writeLongAndChar(long j10, char c10) {
        writeLong(j10);
        write(c10);
    }

    public void writeNull() {
        write("null");
    }

    public void writeString(String str, char c10) {
        if (!this.useSingleQuotes) {
            writeStringWithDoubleQuote(str, c10);
        } else {
            writeStringWithSingleQuote(str);
            write(c10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7 A[PHI: r5 r7 r11 r15
      0x02c7: PHI (r5v19 int) = (r5v17 int), (r5v21 int) binds: [B:169:0x02fd, B:147:0x02c3] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r7v29 int) = (r7v22 int), (r7v3 int) binds: [B:169:0x02fd, B:147:0x02c3] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r11v12 int) = (r11v10 int), (r11v14 int) binds: [B:169:0x02fd, B:147:0x02c3] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r15v12 int) = (r15v2 int), (r15v14 int) binds: [B:169:0x02fd, B:147:0x02c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeStringWithDoubleQuote(java.lang.String r25, char r26) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeStringWithDoubleQuote(java.lang.String, char):void");
    }

    public void writeStringWithSingleQuote(String str) {
        int i10 = 0;
        if (str == null) {
            int i11 = this.count + 4;
            if (i11 > this.buf.length) {
                expandCapacity(i11);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i11;
            return;
        }
        int length = str.length();
        int i12 = this.count + length + 2;
        if (i12 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt]);
                    } else {
                        write(cCharAt);
                    }
                    i10++;
                }
                write(39);
                return;
            }
            expandCapacity(i12);
        }
        int i13 = this.count;
        int i14 = i13 + 1;
        int i15 = i14 + length;
        char[] cArr = this.buf;
        cArr[i13] = '\'';
        str.getChars(0, length, cArr, i14);
        this.count = i12;
        int i16 = -1;
        char c10 = 0;
        for (int i17 = i14; i17 < i15; i17++) {
            char c11 = this.buf[i17];
            if (c11 <= '\r' || c11 == '\\' || c11 == '\'' || (c11 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i10++;
                i16 = i17;
                c10 = c11;
            }
        }
        int i18 = i12 + i10;
        if (i18 > this.buf.length) {
            expandCapacity(i18);
        }
        this.count = i18;
        if (i10 == 1) {
            char[] cArr2 = this.buf;
            int i19 = i16 + 1;
            System.arraycopy(cArr2, i19, cArr2, i16 + 2, (i15 - i16) - 1);
            char[] cArr3 = this.buf;
            cArr3[i16] = '\\';
            cArr3[i19] = IOUtils.replaceChars[c10];
        } else if (i10 > 1) {
            char[] cArr4 = this.buf;
            int i20 = i16 + 1;
            System.arraycopy(cArr4, i20, cArr4, i16 + 2, (i15 - i16) - 1);
            char[] cArr5 = this.buf;
            cArr5[i16] = '\\';
            cArr5[i20] = IOUtils.replaceChars[c10];
            int i21 = i15 + 1;
            for (int i22 = i16 - 1; i22 >= i14; i22--) {
                char c12 = this.buf[i22];
                if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr6 = this.buf;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr6, i23, cArr6, i22 + 2, (i21 - i22) - 1);
                    char[] cArr7 = this.buf;
                    cArr7[i22] = '\\';
                    cArr7[i23] = IOUtils.replaceChars[c12];
                    i21++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        writer.write(this.buf, 0, this.count);
    }

    public int writeToEx(OutputStream outputStream, Charset charset) throws IOException {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        if (charset == IOUtils.UTF8) {
            return encodeToUTF8(outputStream);
        }
        byte[] bytes = new String(this.buf, 0, this.count).getBytes(charset);
        outputStream.write(bytes);
        return bytes.length;
    }

    public SerializeWriter(Writer writer) {
        this(writer, JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);
    }

    public boolean isEnabled(int i10) {
        return (i10 & this.features) != 0;
    }

    public void writeFieldName(String str, boolean z10) {
        if (str == null) {
            write("null:");
            return;
        }
        if (this.useSingleQuotes) {
            if (!this.quoteFieldNames) {
                writeKeyWithSingleQuoteIfHasSpecial(str);
                return;
            } else {
                writeStringWithSingleQuote(str);
                write(58);
                return;
            }
        }
        if (this.quoteFieldNames) {
            writeStringWithDoubleQuote(str, ':');
            return;
        }
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = str.length() == 0;
        while (true) {
            if (i10 >= str.length()) {
                z11 = z12;
                break;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt < '@' && (this.sepcialBits & (1 << cCharAt)) != 0) || cCharAt == '\\') {
                break;
            } else {
                i10++;
            }
        }
        if (z11) {
            writeStringWithDoubleQuote(str, ':');
        } else {
            write(str);
            write(58);
        }
    }

    public void writeNull(SerializerFeature serializerFeature) {
        writeNull(0, serializerFeature.mask);
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
        this((Writer) null, serializerFeatureArr);
    }

    public void writeNull(int i10, int i11) {
        if ((i10 & i11) == 0 && (this.features & i11) == 0) {
            writeNull();
            return;
        }
        int i12 = SerializerFeature.WriteMapNullValue.mask;
        if ((i10 & i12) != 0 && (i10 & (~i12) & SerializerFeature.WRITE_MAP_NULL_FEATURES) == 0) {
            writeNull();
            return;
        }
        if (i11 == SerializerFeature.WriteNullListAsEmpty.mask) {
            write("[]");
            return;
        }
        if (i11 == SerializerFeature.WriteNullStringAsEmpty.mask) {
            writeString("");
            return;
        }
        if (i11 == SerializerFeature.WriteNullBooleanAsFalse.mask) {
            write(RequestConstant.FALSE);
        } else if (i11 == SerializerFeature.WriteNullNumberAsZero.mask) {
            write(48);
        } else {
            writeNull();
        }
    }

    public SerializeWriter(Writer writer, SerializerFeature... serializerFeatureArr) {
        this(writer, 0, serializerFeatureArr);
    }

    public byte[] toBytes(Charset charset) {
        if (this.writer == null) {
            if (charset == IOUtils.UTF8) {
                return encodeToUTF8Bytes();
            }
            return new String(this.buf, 0, this.count).getBytes(charset);
        }
        throw new UnsupportedOperationException("writer not null");
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
        writeTo(outputStream, Charset.forName(str));
    }

    public SerializeWriter(Writer writer, int i10, SerializerFeature... serializerFeatureArr) {
        this.maxBufSize = -1;
        this.writer = writer;
        ThreadLocal<char[]> threadLocal = bufLocal;
        char[] cArr = threadLocal.get();
        this.buf = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.buf = new char[2048];
        }
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            i10 |= serializerFeature.getMask();
        }
        this.features = i10;
        computeFeatures();
    }

    public void writeFieldValue(char c10, String str, boolean z10) {
        if (!this.quoteFieldNames) {
            write(c10);
            writeFieldName(str);
            write(z10);
            return;
        }
        int i10 = z10 ? 4 : 5;
        int length = str.length();
        int i11 = this.count + length + 4 + i10;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeString(str);
                write(58);
                write(z10);
                return;
            }
            expandCapacity(i11);
        }
        int i12 = this.count;
        this.count = i11;
        char[] cArr = this.buf;
        cArr[i12] = c10;
        int i13 = i12 + length;
        cArr[i12 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i12 + 2);
        char[] cArr2 = this.buf;
        cArr2[i13 + 2] = this.keySeperator;
        if (z10) {
            System.arraycopy(VALUE_TRUE, 0, cArr2, i13 + 3, 5);
        } else {
            System.arraycopy(VALUE_FALSE, 0, cArr2, i13 + 3, 6);
        }
    }

    public void writeString(String str) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(str);
        } else {
            writeStringWithDoubleQuote(str, (char) 0);
        }
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
        writeToEx(outputStream, charset);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) throws IOException {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) > cArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.count + i11;
        if (i13 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i13);
            } else {
                do {
                    char[] cArr2 = this.buf;
                    int length = cArr2.length;
                    int i14 = this.count;
                    int i15 = length - i14;
                    System.arraycopy(cArr, i10, cArr2, i14, i15);
                    this.count = this.buf.length;
                    flush();
                    i11 -= i15;
                    i10 += i15;
                } while (i11 > this.buf.length);
                i13 = i11;
            }
        }
        System.arraycopy(cArr, i10, this.buf, this.count, i11);
        this.count = i13;
    }

    public void writeString(char[] cArr) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(cArr);
        } else {
            writeStringWithDoubleQuote(new String(cArr), (char) 0);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i10, int i11) throws IOException {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i10, i11).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c10) {
        write(c10);
        return this;
    }

    public SerializeWriter(int i10) {
        this((Writer) null, i10);
    }

    public SerializeWriter(Writer writer, int i10) {
        this.maxBufSize = -1;
        this.writer = writer;
        if (i10 > 0) {
            this.buf = new char[i10];
            computeFeatures();
        } else {
            throw new IllegalArgumentException("Negative initial size: " + i10);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.count + i11;
        if (i13 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i13);
            } else {
                while (true) {
                    char[] cArr = this.buf;
                    int length = cArr.length;
                    int i14 = this.count;
                    int i15 = length - i14;
                    i12 = i10 + i15;
                    str.getChars(i10, i12, cArr, i14);
                    this.count = this.buf.length;
                    flush();
                    i11 -= i15;
                    if (i11 <= this.buf.length) {
                        break;
                    } else {
                        i10 = i12;
                    }
                }
                i13 = i11;
                i10 = i12;
            }
        }
        str.getChars(i10, i11 + i10, this.buf, this.count);
        this.count = i13;
    }

    public void writeFieldValue(char c10, String str, int i10) {
        if (i10 != Integer.MIN_VALUE && this.quoteFieldNames) {
            int iStringSize = i10 < 0 ? IOUtils.stringSize(-i10) + 1 : IOUtils.stringSize(i10);
            int length = str.length();
            int i11 = this.count + length + 4 + iStringSize;
            if (i11 > this.buf.length) {
                if (this.writer != null) {
                    write(c10);
                    writeFieldName(str);
                    writeInt(i10);
                    return;
                }
                expandCapacity(i11);
            }
            int i12 = this.count;
            this.count = i11;
            char[] cArr = this.buf;
            cArr[i12] = c10;
            int i13 = i12 + length;
            cArr[i12 + 1] = this.keySeperator;
            str.getChars(0, length, cArr, i12 + 2);
            char[] cArr2 = this.buf;
            cArr2[i13 + 2] = this.keySeperator;
            cArr2[i13 + 3] = ':';
            IOUtils.getChars(i10, this.count, cArr2);
            return;
        }
        write(c10);
        writeFieldName(str);
        writeInt(i10);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            writeNull();
        } else {
            write(str, 0, str.length());
        }
    }

    public void write(List<String> list) {
        boolean z10;
        int i10;
        if (list.isEmpty()) {
            write("[]");
            return;
        }
        int i11 = this.count;
        int size = list.size();
        int i12 = i11;
        int i13 = 0;
        while (i13 < size) {
            String str = list.get(i13);
            if (str == null) {
                z10 = true;
            } else {
                int length = str.length();
                z10 = false;
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt = str.charAt(i14);
                    z10 = cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\\';
                    if (z10) {
                        break;
                    }
                }
            }
            if (z10) {
                this.count = i11;
                write(91);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    String str2 = list.get(i15);
                    if (i15 != 0) {
                        write(44);
                    }
                    if (str2 == null) {
                        write("null");
                    } else {
                        writeStringWithDoubleQuote(str2, (char) 0);
                    }
                }
                write(93);
                return;
            }
            int length2 = str.length() + i12;
            int i16 = length2 + 3;
            if (i13 == list.size() - 1) {
                i16 = length2 + 4;
            }
            if (i16 > this.buf.length) {
                this.count = i12;
                expandCapacity(i16);
            }
            if (i13 == 0) {
                i10 = i12 + 1;
                this.buf[i12] = '[';
            } else {
                i10 = i12 + 1;
                this.buf[i12] = ',';
            }
            int i17 = i10 + 1;
            this.buf[i10] = '\"';
            str.getChars(0, str.length(), this.buf, i17);
            int length3 = i17 + str.length();
            this.buf[length3] = '\"';
            i13++;
            i12 = length3 + 1;
        }
        this.buf[i12] = ']';
        this.count = i12 + 1;
    }

    public void writeStringWithSingleQuote(char[] cArr) {
        int i10 = 0;
        if (cArr == null) {
            int i11 = this.count + 4;
            if (i11 > this.buf.length) {
                expandCapacity(i11);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i11;
            return;
        }
        int length = cArr.length;
        int i12 = this.count + length + 2;
        if (i12 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i10 < cArr.length) {
                    char c10 = cArr[i10];
                    if (c10 > '\r' && c10 != '\\' && c10 != '\'' && (c10 != '/' || !isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(c10);
                    } else {
                        write(92);
                        write(IOUtils.replaceChars[c10]);
                    }
                    i10++;
                }
                write(39);
                return;
            }
            expandCapacity(i12);
        }
        int i13 = this.count;
        int i14 = i13 + 1;
        int i15 = length + i14;
        char[] cArr2 = this.buf;
        cArr2[i13] = '\'';
        System.arraycopy(cArr, 0, cArr2, i14, cArr.length);
        this.count = i12;
        int i16 = -1;
        char c11 = 0;
        for (int i17 = i14; i17 < i15; i17++) {
            char c12 = this.buf[i17];
            if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i10++;
                i16 = i17;
                c11 = c12;
            }
        }
        int i18 = i12 + i10;
        if (i18 > this.buf.length) {
            expandCapacity(i18);
        }
        this.count = i18;
        if (i10 == 1) {
            char[] cArr3 = this.buf;
            int i19 = i16 + 1;
            System.arraycopy(cArr3, i19, cArr3, i16 + 2, (i15 - i16) - 1);
            char[] cArr4 = this.buf;
            cArr4[i16] = '\\';
            cArr4[i19] = IOUtils.replaceChars[c11];
        } else if (i10 > 1) {
            char[] cArr5 = this.buf;
            int i20 = i16 + 1;
            System.arraycopy(cArr5, i20, cArr5, i16 + 2, (i15 - i16) - 1);
            char[] cArr6 = this.buf;
            cArr6[i16] = '\\';
            cArr6[i20] = IOUtils.replaceChars[c11];
            int i21 = i15 + 1;
            for (int i22 = i16 - 1; i22 >= i14; i22--) {
                char c13 = this.buf[i22];
                if (c13 <= '\r' || c13 == '\\' || c13 == '\'' || (c13 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr7 = this.buf;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr7, i23, cArr7, i22 + 2, (i21 - i22) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i22] = '\\';
                    cArr8[i23] = IOUtils.replaceChars[c13];
                    i21++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    public void writeFieldValue(char c10, String str, long j10) {
        if (j10 != Long.MIN_VALUE && this.quoteFieldNames && !isEnabled(SerializerFeature.BrowserCompatible.mask)) {
            int iStringSize = j10 < 0 ? IOUtils.stringSize(-j10) + 1 : IOUtils.stringSize(j10);
            int length = str.length();
            int i10 = this.count + length + 4 + iStringSize;
            if (i10 > this.buf.length) {
                if (this.writer != null) {
                    write(c10);
                    writeFieldName(str);
                    writeLong(j10);
                    return;
                }
                expandCapacity(i10);
            }
            int i11 = this.count;
            this.count = i10;
            char[] cArr = this.buf;
            cArr[i11] = c10;
            int i12 = i11 + length;
            cArr[i11 + 1] = this.keySeperator;
            str.getChars(0, length, cArr, i11 + 2);
            char[] cArr2 = this.buf;
            cArr2[i12 + 2] = this.keySeperator;
            cArr2[i12 + 3] = ':';
            IOUtils.getChars(j10, this.count, cArr2);
            return;
        }
        write(c10);
        writeFieldName(str);
        writeLong(j10);
    }

    public void write(boolean z10) {
        if (z10) {
            write(RequestConstant.TRUE);
        } else {
            write(RequestConstant.FALSE);
        }
    }

    public void writeFieldValue(char c10, String str, float f10) throws IOException {
        write(c10);
        writeFieldName(str);
        writeFloat(f10, false);
    }

    public void writeFieldValue(char c10, String str, double d10) throws IOException {
        write(c10);
        writeFieldName(str);
        writeDouble(d10, false);
    }

    public void writeFieldValue(char c10, String str, String str2) {
        if (this.quoteFieldNames) {
            if (this.useSingleQuotes) {
                write(c10);
                writeFieldName(str);
                if (str2 == null) {
                    writeNull();
                    return;
                } else {
                    writeString(str2);
                    return;
                }
            }
            if (isEnabled(SerializerFeature.BrowserCompatible)) {
                write(c10);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            writeFieldValueStringWithDoubleQuoteCheck(c10, str, str2);
            return;
        }
        write(c10);
        writeFieldName(str);
        if (str2 == null) {
            writeNull();
        } else {
            writeString(str2);
        }
    }

    public void writeFieldValue(char c10, String str, Enum<?> r42) {
        if (r42 == null) {
            write(c10);
            writeFieldName(str);
            writeNull();
        } else if (this.writeEnumUsingName && !this.writeEnumUsingToString) {
            writeEnumFieldValue(c10, str, r42.name());
        } else if (this.writeEnumUsingToString) {
            writeEnumFieldValue(c10, str, r42.toString());
        } else {
            writeFieldValue(c10, str, r42.ordinal());
        }
    }

    public void writeFieldValue(char c10, String str, BigDecimal bigDecimal) {
        String string;
        write(c10);
        writeFieldName(str);
        if (bigDecimal == null) {
            writeNull();
            return;
        }
        int iScale = bigDecimal.scale();
        if (isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && iScale >= -100 && iScale < 100) {
            string = bigDecimal.toPlainString();
        } else {
            string = bigDecimal.toString();
        }
        write(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeStringWithDoubleQuote(char[] r26, char r27) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeStringWithDoubleQuote(char[], char):void");
    }
}
