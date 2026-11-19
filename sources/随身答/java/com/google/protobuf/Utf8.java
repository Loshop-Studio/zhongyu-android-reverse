package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i9) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || isNotTrailingByte(b12) || isNotTrailingByte(b13)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b10 & 7) << 18) | (trailingByteValue(b11) << 12) | (trailingByteValue(b12) << 6) | trailingByteValue(b13);
            cArr[i9] = highSurrogate(iTrailingByteValue);
            cArr[i9 + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b10, char[] cArr, int i9) {
            cArr[i9] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b10, byte b11, byte b12, char[] cArr, int i9) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || isNotTrailingByte(b12)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i9] = (char) (((b10 & 15) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b10, byte b11, char[] cArr, int i9) throws InvalidProtocolBufferException {
            if (b10 < -62 || isNotTrailingByte(b11)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i9] = (char) (((b10 & 31) << 6) | trailingByteValue(b11));
        }

        private static char highSurrogate(int i9) {
            return (char) ((i9 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b10) {
            return b10 < -32;
        }

        private static char lowSurrogate(int i9) {
            return (char) ((i9 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b10) {
            return b10 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i10);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i9, i10) : decodeUtf8Default(byteBuffer, i9, i10);
        }

        public abstract String decodeUtf8(byte[] bArr, int i9, int i10) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException {
            if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b10 = byteBuffer.get(i9);
                if (!DecodeUtil.isOneByte(b10)) {
                    break;
                }
                i9++;
                DecodeUtil.handleOneByte(b10, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte b11 = byteBuffer.get(i9);
                if (DecodeUtil.isOneByte(b11)) {
                    int i15 = i13 + 1;
                    DecodeUtil.handleOneByte(b11, cArr, i13);
                    int i16 = i14;
                    while (i16 < i11) {
                        byte b12 = byteBuffer.get(i16);
                        if (!DecodeUtil.isOneByte(b12)) {
                            break;
                        }
                        i16++;
                        DecodeUtil.handleOneByte(b12, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i9 = i16;
                } else if (DecodeUtil.isTwoBytes(b11)) {
                    if (i14 >= i11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i9 += 2;
                    DecodeUtil.handleTwoBytes(b11, byteBuffer.get(i14), cArr, i13);
                    i13++;
                } else if (DecodeUtil.isThreeBytes(b11)) {
                    if (i14 >= i11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = i9 + 2;
                    i9 += 3;
                    DecodeUtil.handleThreeBytes(b11, byteBuffer.get(i14), byteBuffer.get(i17), cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = byteBuffer.get(i14);
                    int i18 = i9 + 3;
                    byte b14 = byteBuffer.get(i9 + 2);
                    i9 += 4;
                    DecodeUtil.handleFourBytes(b11, b13, b14, byteBuffer.get(i18), cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i9, int i10);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i9;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char cCharAt = charSequence.charAt(i10);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i10, (byte) cCharAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i10 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i10);
                return;
            }
            iPosition += i10;
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i11 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i11;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i13 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i9 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i13;
                                        i10 = i12;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i10 = i12;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i10 = i12;
                                        iPosition = i9;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i10, length);
                    }
                    int i14 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i10++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i9, int i10) {
            return partialIsValidUtf8(0, bArr, i9, i10) == 0;
        }

        public final int partialIsValidUtf8(int i9, ByteBuffer byteBuffer, int i10, int i11) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i9, byteBuffer, i10, i11) : partialIsValidUtf8Default(i9, byteBuffer, i10, i11);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i9, byteBuffer.array(), i10 + iArrayOffset, iArrayOffset + i11);
        }

        public abstract int partialIsValidUtf8(int i9, byte[] bArr, int i10, int i11);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i9, ByteBuffer byteBuffer, int i10, int i11);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i9, int i10) {
            return partialIsValidUtf8(0, byteBuffer, i9, i10) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i9, int i10) {
            int iEstimateConsecutiveAscii = i9 + Utf8.estimateConsecutiveAscii(byteBuffer, i9, i10);
            while (iEstimateConsecutiveAscii < i10) {
                int i11 = iEstimateConsecutiveAscii + 1;
                byte b10 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b10 >= 0) {
                    iEstimateConsecutiveAscii = i11;
                } else if (b10 < -32) {
                    if (i11 >= i10) {
                        return b10;
                    }
                    if (b10 < -62 || byteBuffer.get(i11) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b10 >= -16) {
                        if (i11 >= i10 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b10, i11, i10 - i11);
                        }
                        int i12 = iEstimateConsecutiveAscii + 2;
                        byte b11 = byteBuffer.get(i11);
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i13 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i12) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i13) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b10, i11, i10 - i11);
                    }
                    int i14 = iEstimateConsecutiveAscii + 2;
                    byte b12 = byteBuffer.get(i11);
                    if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || byteBuffer.get(i14) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i9, int i10) {
            super("Unpaired surrogate at index " + i9 + " of " + i10);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i9, i10);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        return processor.encodeUtf8(charSequence, bArr, i9, i10);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i9 < length) {
                char cCharAt = charSequence.charAt(i9);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i9);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i9++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        int i10 = 0;
        while (i9 < length) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i9) < 65536) {
                        throw new UnpairedSurrogateException(i9, length);
                    }
                    i9++;
                }
            }
            i9++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i9, int i10) {
        int i11 = i10 - 7;
        int i12 = i9;
        while (i12 < i11 && (byteBuffer.getLong(i12) & (-9187201950435737472L)) == 0) {
            i12 += 8;
        }
        return i12 - i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9) {
        if (i9 > -12) {
            return -1;
        }
        return i9;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i9, byte[] bArr, int i10, int i11) {
        return processor.partialIsValidUtf8(i9, bArr, i10, i11);
    }

    public static String decodeUtf8(byte[] bArr, int i9, int i10) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i9, int i10) {
        return processor.isValidUtf8(bArr, i9, i10);
    }

    public static int partialIsValidUtf8(int i9, ByteBuffer byteBuffer, int i10, int i11) {
        return processor.partialIsValidUtf8(i9, byteBuffer, i10, i11);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j9, int i9) {
            int i10 = 0;
            if (i9 < 16) {
                return 0;
            }
            int i11 = 8 - (((int) j9) & 7);
            while (i10 < i11) {
                long j10 = 1 + j9;
                if (UnsafeUtil.getByte(bArr, j9) < 0) {
                    return i10;
                }
                i10++;
                j9 = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > i9 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j9) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j9 += 8;
                i10 = i12;
            }
            while (i10 < i9) {
                long j11 = j9 + 1;
                if (UnsafeUtil.getByte(bArr, j9) < 0) {
                    return i10;
                }
                i10++;
                j9 = j11;
            }
            return i9;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i9, long j9, int i10) {
            if (i10 == 0) {
                return Utf8.incompleteStateFor(i9);
            }
            if (i10 == 1) {
                return Utf8.incompleteStateFor(i9, UnsafeUtil.getByte(bArr, j9));
            }
            if (i10 == 2) {
                return Utf8.incompleteStateFor(i9, UnsafeUtil.getByte(bArr, j9), UnsafeUtil.getByte(bArr, j9 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i9, int i10) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i9, i10, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i9, i10 + i9))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException {
            if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + i9;
            long j9 = i10 + jAddressOffset;
            char[] cArr = new char[i10];
            int i11 = 0;
            while (jAddressOffset < j9) {
                byte b10 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b10)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (jAddressOffset < j9) {
                long j10 = jAddressOffset + 1;
                byte b11 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b11)) {
                    int i13 = i12 + 1;
                    DecodeUtil.handleOneByte(b11, cArr, i12);
                    long j11 = j10;
                    while (j11 < j9) {
                        byte b12 = UnsafeUtil.getByte(j11);
                        if (!DecodeUtil.isOneByte(b12)) {
                            break;
                        }
                        j11++;
                        DecodeUtil.handleOneByte(b12, cArr, i13);
                        i13++;
                    }
                    i12 = i13;
                    jAddressOffset = j11;
                } else if (DecodeUtil.isTwoBytes(b11)) {
                    if (j10 >= j9) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b11, UnsafeUtil.getByte(j10), cArr, i12);
                    i12++;
                } else if (DecodeUtil.isThreeBytes(b11)) {
                    if (j10 >= j9 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j12 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b11, UnsafeUtil.getByte(j10), UnsafeUtil.getByte(j12), cArr, i12);
                    i12++;
                } else {
                    if (j10 >= j9 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = UnsafeUtil.getByte(j10);
                    long j13 = jAddressOffset + 3;
                    byte b14 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b11, b13, b14, UnsafeUtil.getByte(j13), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i9, int i10) {
            long j9;
            long j10;
            long j11;
            int i11;
            char cCharAt;
            long j12 = i9;
            long j13 = i10 + j12;
            int length = charSequence.length();
            if (length > i10 || bArr.length - i10 < i9) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i9 + i10));
            }
            int i12 = 0;
            while (true) {
                j9 = 1;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j12, (byte) cCharAt);
                i12++;
                j12 = 1 + j12;
            }
            if (i12 == length) {
                return (int) j12;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 < 128 && j12 < j13) {
                    UnsafeUtil.putByte(bArr, j12, (byte) cCharAt2);
                    j11 = j13;
                    j10 = j9;
                    j12 += j9;
                } else if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                    j10 = j9;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                        j11 = j13;
                        if (j12 > j11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new UnpairedSurrogateException(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j12);
                        }
                        int i13 = i12 + 1;
                        if (i13 != length) {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j12 + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j12 + 3;
                                UnsafeUtil.putByte(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 += 4;
                                UnsafeUtil.putByte(bArr, j14, (byte) ((codePoint & 63) | 128));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        throw new UnpairedSurrogateException(i12 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j15 = j12 + 2;
                    j11 = j13;
                    UnsafeUtil.putByte(bArr, j12 + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j12 += 3;
                    UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j10 = j9;
                    long j16 = j12 + j10;
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                    j12 += 2;
                    UnsafeUtil.putByte(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j13;
                }
                i12++;
                j9 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j9;
            char c10;
            long j10;
            long j11;
            long j12;
            int i9;
            char c11;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = byteBuffer.position() + jAddressOffset;
            long jLimit = byteBuffer.limit() + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i10 = 0;
            while (true) {
                j9 = 1;
                c10 = 128;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i10++;
                jPosition = 1 + jPosition;
            }
            if (i10 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j10 = j9;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j13 = jPosition + j10;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt2 & '?') | 128));
                        j11 = jAddressOffset;
                        j12 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j11 = jAddressOffset;
                            j12 = jLimit;
                            if (jPosition > j12 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                                    throw new UnpairedSurrogateException(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    UnsafeUtil.putByte(jPosition + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j14, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new UnpairedSurrogateException(i10 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j11 = jAddressOffset;
                        long j15 = jPosition + 2;
                        j12 = jLimit;
                        UnsafeUtil.putByte(jPosition + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j11 = jAddressOffset;
                    j12 = jLimit;
                    c11 = c10;
                    jPosition += j9;
                    j10 = j9;
                }
                i10++;
                c10 = c11;
                j9 = j10;
                jAddressOffset = j11;
                jLimit = j12;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j9, int i9) {
            if (i9 < 16) {
                return 0;
            }
            int i10 = (int) ((-j9) & 7);
            int i11 = i10;
            while (i11 > 0) {
                long j10 = 1 + j9;
                if (UnsafeUtil.getByte(j9) < 0) {
                    return i10 - i11;
                }
                i11--;
                j9 = j10;
            }
            int i12 = i9 - i10;
            while (i12 >= 8 && (UnsafeUtil.getLong(j9) & (-9187201950435737472L)) == 0) {
                j9 += 8;
                i12 -= 8;
            }
            return i9 - i12;
        }

        private static int unsafeIncompleteStateFor(long j9, int i9, int i10) {
            if (i10 == 0) {
                return Utf8.incompleteStateFor(i9);
            }
            if (i10 == 1) {
                return Utf8.incompleteStateFor(i9, UnsafeUtil.getByte(j9));
            }
            if (i10 == 2) {
                return Utf8.incompleteStateFor(i9, UnsafeUtil.getByte(j9), UnsafeUtil.getByte(j9 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i9, int i10) {
        byte b10 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            return incompleteStateFor(b10);
        }
        if (i11 == 1) {
            return incompleteStateFor(b10, bArr[i9]);
        }
        if (i11 == 2) {
            return incompleteStateFor(b10, bArr[i9], bArr[i9 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i9, int i10, int i11) {
        if (i11 == 0) {
            return incompleteStateFor(i9);
        }
        if (i11 == 1) {
            return incompleteStateFor(i9, byteBuffer.get(i10));
        }
        if (i11 == 2) {
            return incompleteStateFor(i9, byteBuffer.get(i10), byteBuffer.get(i10 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i9, int i10) {
            while (i9 < i10) {
                int i11 = i9 + 1;
                byte b10 = bArr[i9];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i11 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i9 += 2;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i11 >= i10 - 2) {
                            return Utf8.incompleteStateFor(bArr, i11, i10);
                        }
                        int i12 = i9 + 2;
                        byte b11 = bArr[i11];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i13 = i9 + 3;
                            if (bArr[i12] <= -65) {
                                i9 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 1) {
                        return Utf8.incompleteStateFor(bArr, i11, i10);
                    }
                    int i14 = i9 + 2;
                    byte b12 = bArr[i11];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i9 += 3;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                i9 = i11;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i9, int i10) throws InvalidProtocolBufferException {
            if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b10 = bArr[i9];
                if (!DecodeUtil.isOneByte(b10)) {
                    break;
                }
                i9++;
                DecodeUtil.handleOneByte(b10, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte b11 = bArr[i9];
                if (DecodeUtil.isOneByte(b11)) {
                    int i15 = i13 + 1;
                    DecodeUtil.handleOneByte(b11, cArr, i13);
                    int i16 = i14;
                    while (i16 < i11) {
                        byte b12 = bArr[i16];
                        if (!DecodeUtil.isOneByte(b12)) {
                            break;
                        }
                        i16++;
                        DecodeUtil.handleOneByte(b12, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i9 = i16;
                } else if (DecodeUtil.isTwoBytes(b11)) {
                    if (i14 >= i11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i9 += 2;
                    DecodeUtil.handleTwoBytes(b11, bArr[i14], cArr, i13);
                    i13++;
                } else if (DecodeUtil.isThreeBytes(b11)) {
                    if (i14 >= i11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = i9 + 2;
                    i9 += 3;
                    DecodeUtil.handleThreeBytes(b11, bArr[i14], bArr[i17], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = bArr[i14];
                    int i18 = i9 + 3;
                    byte b14 = bArr[i9 + 2];
                    i9 += 4;
                    DecodeUtil.handleFourBytes(b11, b13, b14, bArr[i18], cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i9, i10);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i9, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int length = charSequence.length();
            int i13 = i10 + i9;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i9) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
                bArr[i12] = (byte) cCharAt;
                i14++;
            }
            if (i14 == length) {
                return i9 + length;
            }
            int i15 = i9 + i14;
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && i15 < i13) {
                    bArr[i15] = (byte) cCharAt2;
                    i15++;
                } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                    i15 += 2;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                        if (i15 > i13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new UnpairedSurrogateException(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i18 = i15 + 3;
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        throw new UnpairedSurrogateException(i14 - 1, length);
                    }
                    bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i19 = i15 + 2;
                    bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i15 += 3;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                }
                i14++;
            }
            return i15;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i9, ByteBuffer byteBuffer, int i10, int i11) {
            return partialIsValidUtf8Default(i9, byteBuffer, i10, i11);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i9, int i10) {
            while (i9 < i10 && bArr[i9] >= 0) {
                i9++;
            }
            if (i9 >= i10) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i9, i10);
        }
    }
}
