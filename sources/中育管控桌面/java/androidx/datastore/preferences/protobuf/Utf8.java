package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
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
        public static void handleFourBytes(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i6) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || isNotTrailingByte(b9) || isNotTrailingByte(b10)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b7 & 7) << 18) | (trailingByteValue(b8) << 12) | (trailingByteValue(b9) << 6) | trailingByteValue(b10);
            cArr[i6] = highSurrogate(iTrailingByteValue);
            cArr[i6 + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b7, char[] cArr, int i6) {
            cArr[i6] = (char) b7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b7, byte b8, byte b9, char[] cArr, int i6) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || isNotTrailingByte(b9)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i6] = (char) (((b7 & 15) << 12) | (trailingByteValue(b8) << 6) | trailingByteValue(b9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b7, byte b8, char[] cArr, int i6) throws InvalidProtocolBufferException {
            if (b7 < -62 || isNotTrailingByte(b8)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i6] = (char) (((b7 & 31) << 6) | trailingByteValue(b8));
        }

        private static char highSurrogate(int i6) {
            return (char) ((i6 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b7) {
            return b7 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b7) {
            return b7 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b7) {
            return b7 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b7) {
            return b7 < -32;
        }

        private static char lowSurrogate(int i6) {
            return (char) ((i6 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b7) {
            return b7 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i6, int i7) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i6, i7);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i6, i7) : decodeUtf8Default(byteBuffer, i6, i7);
        }

        public abstract String decodeUtf8(byte[] bArr, int i6, int i7);

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i6, int i7) throws InvalidProtocolBufferException {
            if ((i6 | i7 | ((byteBuffer.limit() - i6) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            int i8 = i6 + i7;
            char[] cArr = new char[i7];
            int i9 = 0;
            while (i6 < i8) {
                byte b7 = byteBuffer.get(i6);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                i6++;
                DecodeUtil.handleOneByte(b7, cArr, i9);
                i9++;
            }
            int i10 = i9;
            while (i6 < i8) {
                int i11 = i6 + 1;
                byte b8 = byteBuffer.get(i6);
                if (DecodeUtil.isOneByte(b8)) {
                    int i12 = i10 + 1;
                    DecodeUtil.handleOneByte(b8, cArr, i10);
                    int i13 = i11;
                    while (i13 < i8) {
                        byte b9 = byteBuffer.get(i13);
                        if (!DecodeUtil.isOneByte(b9)) {
                            break;
                        }
                        i13++;
                        DecodeUtil.handleOneByte(b9, cArr, i12);
                        i12++;
                    }
                    i10 = i12;
                    i6 = i13;
                } else if (DecodeUtil.isTwoBytes(b8)) {
                    if (i11 >= i8) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i6 += 2;
                    DecodeUtil.handleTwoBytes(b8, byteBuffer.get(i11), cArr, i10);
                    i10++;
                } else if (DecodeUtil.isThreeBytes(b8)) {
                    if (i11 >= i8 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i6 + 2;
                    i6 += 3;
                    DecodeUtil.handleThreeBytes(b8, byteBuffer.get(i11), byteBuffer.get(i14), cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i8 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b10 = byteBuffer.get(i11);
                    int i15 = i6 + 3;
                    byte b11 = byteBuffer.get(i6 + 2);
                    i6 += 4;
                    DecodeUtil.handleFourBytes(b8, b10, b11, byteBuffer.get(i15), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i6, int i7);

        public abstract int encodeUtf8(String str, byte[] bArr, int i6, int i7);

        public final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        public final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int i6;
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i7 = 0;
            while (i7 < length) {
                try {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i7, (byte) cCharAt);
                    i7++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i7 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i7);
                return;
            }
            iPosition += i7;
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i8 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i8, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i8;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i8;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i9 = i7 + 1;
                        if (i9 != length) {
                            try {
                                char cCharAt3 = str.charAt(i9);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i10 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i6 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i10;
                                        i7 = i9;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i7 = i9;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i7 = i9;
                                        iPosition = i6;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i7 = i9;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i7, length);
                    }
                    int i11 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i7++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i6, int i7) {
            return partialIsValidUtf8(0, bArr, i6, i7) == 0;
        }

        public final int partialIsValidUtf8(int i6, ByteBuffer byteBuffer, int i7, int i8) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i6, byteBuffer, i7, i8) : partialIsValidUtf8Default(i6, byteBuffer, i7, i8);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i6, byteBuffer.array(), i7 + iArrayOffset, iArrayOffset + i8);
        }

        public abstract int partialIsValidUtf8(int i6, byte[] bArr, int i7, int i8);

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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i6, ByteBuffer byteBuffer, int i7, int i8);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i6, int i7) {
            return partialIsValidUtf8(0, byteBuffer, i6, i7) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i6, int i7) {
            int iEstimateConsecutiveAscii = i6 + Utf8.estimateConsecutiveAscii(byteBuffer, i6, i7);
            while (iEstimateConsecutiveAscii < i7) {
                int i8 = iEstimateConsecutiveAscii + 1;
                byte b7 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b7 >= 0) {
                    iEstimateConsecutiveAscii = i8;
                } else if (b7 < -32) {
                    if (i8 >= i7) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i8) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b7 >= -16) {
                        if (i8 >= i7 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b7, i8, i7 - i8);
                        }
                        int i9 = iEstimateConsecutiveAscii + 2;
                        byte b8 = byteBuffer.get(i8);
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i10 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i9) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i10) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i7 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b7, i8, i7 - i8);
                    }
                    int i11 = iEstimateConsecutiveAscii + 2;
                    byte b9 = byteBuffer.get(i8);
                    if (b9 > -65 || ((b7 == -32 && b9 < -96) || ((b7 == -19 && b9 >= -96) || byteBuffer.get(i11) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i6, int i7) {
            super("Unpaired surrogate at index " + i6 + " of " + i7);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i6, int i7) {
        return processor.decodeUtf8(byteBuffer, i6, i7);
    }

    public static int encode(String str, byte[] bArr, int i6, int i7) {
        return processor.encodeUtf8(str, bArr, i6, i7);
    }

    public static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    public static int encodedLength(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i6 < length) {
                char cCharAt = str.charAt(i6);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(str, i6);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i6++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i6) {
        int length = str.length();
        int i7 = 0;
        while (i6 < length) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < 2048) {
                i7 += (127 - cCharAt) >>> 31;
            } else {
                i7 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i6) < 65536) {
                        throw new UnpairedSurrogateException(i6, length);
                    }
                    i6++;
                }
            }
            i6++;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i6, int i7) {
        int i8 = i7 - 7;
        int i9 = i6;
        while (i9 < i8 && (byteBuffer.getLong(i9) & (-9187201950435737472L)) == 0) {
            i9 += 8;
        }
        return i9 - i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i6) {
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i6, byte[] bArr, int i7, int i8) {
        return processor.partialIsValidUtf8(i6, bArr, i7, i8);
    }

    public static String decodeUtf8(byte[] bArr, int i6, int i7) {
        return processor.decodeUtf8(bArr, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i6, int i7) {
        if (i6 > -12 || i7 > -65) {
            return -1;
        }
        return i6 ^ (i7 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i6, int i7) {
        return processor.isValidUtf8(bArr, i6, i7);
    }

    public static int partialIsValidUtf8(int i6, ByteBuffer byteBuffer, int i7, int i8) {
        return processor.partialIsValidUtf8(i6, byteBuffer, i7, i8);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j6, int i6) {
            int i7 = 0;
            if (i6 < 16) {
                return 0;
            }
            int i8 = 8 - (((int) j6) & 7);
            while (i7 < i8) {
                long j7 = 1 + j6;
                if (UnsafeUtil.getByte(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j7;
            }
            while (true) {
                int i9 = i7 + 8;
                if (i9 > i6 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j6) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j6 += 8;
                i7 = i9;
            }
            while (i7 < i6) {
                long j8 = j6 + 1;
                if (UnsafeUtil.getByte(bArr, j6) < 0) {
                    return i7;
                }
                i7++;
                j6 = j8;
            }
            return i6;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i6, long j6, int i7) {
            if (i7 == 0) {
                return Utf8.incompleteStateFor(i6);
            }
            if (i7 == 1) {
                return Utf8.incompleteStateFor(i6, UnsafeUtil.getByte(bArr, j6));
            }
            if (i7 == 2) {
                return Utf8.incompleteStateFor(i6, UnsafeUtil.getByte(bArr, j6), UnsafeUtil.getByte(bArr, j6 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i6, int i7) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i6, i7, charset);
            if (str.indexOf(okio.Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i6, i7 + i6))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i6, int i7) throws InvalidProtocolBufferException {
            if ((i6 | i7 | ((byteBuffer.limit() - i6) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + i6;
            long j6 = i7 + jAddressOffset;
            char[] cArr = new char[i7];
            int i8 = 0;
            while (jAddressOffset < j6) {
                byte b7 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b7, cArr, i8);
                i8++;
            }
            int i9 = i8;
            while (jAddressOffset < j6) {
                long j7 = jAddressOffset + 1;
                byte b8 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b8)) {
                    int i10 = i9 + 1;
                    DecodeUtil.handleOneByte(b8, cArr, i9);
                    long j8 = j7;
                    while (j8 < j6) {
                        byte b9 = UnsafeUtil.getByte(j8);
                        if (!DecodeUtil.isOneByte(b9)) {
                            break;
                        }
                        j8++;
                        DecodeUtil.handleOneByte(b9, cArr, i10);
                        i10++;
                    }
                    i9 = i10;
                    jAddressOffset = j8;
                } else if (DecodeUtil.isTwoBytes(b8)) {
                    if (j7 >= j6) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b8, UnsafeUtil.getByte(j7), cArr, i9);
                    i9++;
                } else if (DecodeUtil.isThreeBytes(b8)) {
                    if (j7 >= j6 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j9 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b8, UnsafeUtil.getByte(j7), UnsafeUtil.getByte(j9), cArr, i9);
                    i9++;
                } else {
                    if (j7 >= j6 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b10 = UnsafeUtil.getByte(j7);
                    long j10 = jAddressOffset + 3;
                    byte b11 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b8, b10, b11, UnsafeUtil.getByte(j10), cArr, i9);
                    i9 += 2;
                }
            }
            return new String(cArr, 0, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i6, int i7) {
            long j6;
            long j7;
            long j8;
            int i8;
            char cCharAt;
            long j9 = i6;
            long j10 = i7 + j9;
            int length = str.length();
            if (length > i7 || bArr.length - i7 < i6) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i6 + i7));
            }
            int i9 = 0;
            while (true) {
                j6 = 1;
                if (i9 >= length || (cCharAt = str.charAt(i9)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j9, (byte) cCharAt);
                i9++;
                j9 = 1 + j9;
            }
            if (i9 == length) {
                return (int) j9;
            }
            while (i9 < length) {
                char cCharAt2 = str.charAt(i9);
                if (cCharAt2 < 128 && j9 < j10) {
                    UnsafeUtil.putByte(bArr, j9, (byte) cCharAt2);
                    j8 = j10;
                    j7 = j6;
                    j9 += j6;
                } else if (cCharAt2 >= 2048 || j9 > j10 - 2) {
                    j7 = j6;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j9 > j10 - 3) {
                        j8 = j10;
                        if (j9 > j8 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i9 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i8)))) {
                                throw new UnpairedSurrogateException(i9, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j9);
                        }
                        int i10 = i9 + 1;
                        if (i10 != length) {
                            char cCharAt3 = str.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j9, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j9 + j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = j9 + 3;
                                UnsafeUtil.putByte(bArr, j9 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j9 += 4;
                                UnsafeUtil.putByte(bArr, j11, (byte) ((codePoint & 63) | 128));
                                i9 = i10;
                            } else {
                                i9 = i10;
                            }
                        }
                        throw new UnpairedSurrogateException(i9 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j9, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j12 = j9 + 2;
                    j8 = j10;
                    UnsafeUtil.putByte(bArr, j9 + j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j9 += 3;
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j7 = j6;
                    long j13 = j9 + j7;
                    UnsafeUtil.putByte(bArr, j9, (byte) ((cCharAt2 >>> 6) | 960));
                    j9 += 2;
                    UnsafeUtil.putByte(bArr, j13, (byte) ((cCharAt2 & '?') | 128));
                    j8 = j10;
                }
                i9++;
                j6 = j7;
                j10 = j8;
            }
            return (int) j9;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j6;
            char c7;
            long j7;
            long j8;
            long j9;
            int i6;
            char c8;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = byteBuffer.position() + jAddressOffset;
            long jLimit = byteBuffer.limit() + jAddressOffset;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i7 = 0;
            while (true) {
                j6 = 1;
                c7 = 128;
                if (i7 >= length || (cCharAt = str.charAt(i7)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i7++;
                jPosition = 1 + jPosition;
            }
            if (i7 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 >= c7 || jPosition >= jLimit) {
                    j7 = j6;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j10 = jPosition + j7;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j10, (byte) ((cCharAt2 & '?') | 128));
                        j8 = jAddressOffset;
                        j9 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j8 = jAddressOffset;
                            j9 = jLimit;
                            if (jPosition > j9 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i7 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                                    throw new UnpairedSurrogateException(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i8 = i7 + 1;
                            if (i8 != length) {
                                char cCharAt3 = str.charAt(i8);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c8 = 128;
                                    UnsafeUtil.putByte(jPosition + j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j11 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j11, (byte) ((codePoint & 63) | 128));
                                    i7 = i8;
                                } else {
                                    i7 = i8;
                                }
                            }
                            throw new UnpairedSurrogateException(i7 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j8 = jAddressOffset;
                        long j12 = jPosition + 2;
                        j9 = jLimit;
                        UnsafeUtil.putByte(jPosition + j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j12, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c8 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j8 = jAddressOffset;
                    j9 = jLimit;
                    c8 = c7;
                    jPosition += j6;
                    j7 = j6;
                }
                i7++;
                c7 = c8;
                j6 = j7;
                jAddressOffset = j8;
                jLimit = j9;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j6, int i6) {
            if (i6 < 16) {
                return 0;
            }
            int i7 = (int) ((-j6) & 7);
            int i8 = i7;
            while (i8 > 0) {
                long j7 = 1 + j6;
                if (UnsafeUtil.getByte(j6) < 0) {
                    return i7 - i8;
                }
                i8--;
                j6 = j7;
            }
            int i9 = i6 - i7;
            while (i9 >= 8 && (UnsafeUtil.getLong(j6) & (-9187201950435737472L)) == 0) {
                j6 += 8;
                i9 -= 8;
            }
            return i6 - i9;
        }

        private static int unsafeIncompleteStateFor(long j6, int i6, int i7) {
            if (i7 == 0) {
                return Utf8.incompleteStateFor(i6);
            }
            if (i7 == 1) {
                return Utf8.incompleteStateFor(i6, UnsafeUtil.getByte(j6));
            }
            if (i7 == 2) {
                return Utf8.incompleteStateFor(i6, UnsafeUtil.getByte(j6), UnsafeUtil.getByte(j6 + 1));
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
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
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
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
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
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
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
                byte r10 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i6, int i7, int i8) {
        if (i6 > -12 || i7 > -65 || i8 > -65) {
            return -1;
        }
        return (i6 ^ (i7 << 8)) ^ (i8 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i6, int i7) {
        byte b7 = bArr[i6 - 1];
        int i8 = i7 - i6;
        if (i8 == 0) {
            return incompleteStateFor(b7);
        }
        if (i8 == 1) {
            return incompleteStateFor(b7, bArr[i6]);
        }
        if (i8 == 2) {
            return incompleteStateFor(b7, bArr[i6], bArr[i6 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i6, int i7, int i8) {
        if (i8 == 0) {
            return incompleteStateFor(i6);
        }
        if (i8 == 1) {
            return incompleteStateFor(i6, byteBuffer.get(i7));
        }
        if (i8 == 2) {
            return incompleteStateFor(i6, byteBuffer.get(i7), byteBuffer.get(i7 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i6, int i7) {
            while (i6 < i7) {
                int i8 = i6 + 1;
                byte b7 = bArr[i6];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i8 >= i7) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i6 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i8 >= i7 - 2) {
                            return Utf8.incompleteStateFor(bArr, i8, i7);
                        }
                        int i9 = i6 + 2;
                        byte b8 = bArr[i8];
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i10 = i6 + 3;
                            if (bArr[i9] <= -65) {
                                i6 += 4;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i7 - 1) {
                        return Utf8.incompleteStateFor(bArr, i8, i7);
                    }
                    int i11 = i6 + 2;
                    byte b9 = bArr[i8];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i6 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                i6 = i8;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i6, int i7) throws InvalidProtocolBufferException {
            if ((i6 | i7 | ((bArr.length - i6) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            int i8 = i6 + i7;
            char[] cArr = new char[i7];
            int i9 = 0;
            while (i6 < i8) {
                byte b7 = bArr[i6];
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                i6++;
                DecodeUtil.handleOneByte(b7, cArr, i9);
                i9++;
            }
            int i10 = i9;
            while (i6 < i8) {
                int i11 = i6 + 1;
                byte b8 = bArr[i6];
                if (DecodeUtil.isOneByte(b8)) {
                    int i12 = i10 + 1;
                    DecodeUtil.handleOneByte(b8, cArr, i10);
                    int i13 = i11;
                    while (i13 < i8) {
                        byte b9 = bArr[i13];
                        if (!DecodeUtil.isOneByte(b9)) {
                            break;
                        }
                        i13++;
                        DecodeUtil.handleOneByte(b9, cArr, i12);
                        i12++;
                    }
                    i10 = i12;
                    i6 = i13;
                } else if (DecodeUtil.isTwoBytes(b8)) {
                    if (i11 >= i8) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i6 += 2;
                    DecodeUtil.handleTwoBytes(b8, bArr[i11], cArr, i10);
                    i10++;
                } else if (DecodeUtil.isThreeBytes(b8)) {
                    if (i11 >= i8 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i6 + 2;
                    i6 += 3;
                    DecodeUtil.handleThreeBytes(b8, bArr[i11], bArr[i14], cArr, i10);
                    i10++;
                } else {
                    if (i11 >= i8 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b10 = bArr[i11];
                    int i15 = i6 + 3;
                    byte b11 = bArr[i6 + 2];
                    i6 += 4;
                    DecodeUtil.handleFourBytes(b8, b10, b11, bArr[i15], cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i6, int i7) {
            return decodeUtf8Default(byteBuffer, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i6, int i7) {
            int i8;
            int i9;
            char cCharAt;
            int length = str.length();
            int i10 = i7 + i6;
            int i11 = 0;
            while (i11 < length && (i9 = i11 + i6) < i10 && (cCharAt = str.charAt(i11)) < 128) {
                bArr[i9] = (byte) cCharAt;
                i11++;
            }
            if (i11 == length) {
                return i6 + length;
            }
            int i12 = i6 + i11;
            while (i11 < length) {
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 < 128 && i12 < i10) {
                    bArr[i12] = (byte) cCharAt2;
                    i12++;
                } else if (cCharAt2 < 2048 && i12 <= i10 - 2) {
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) ((cCharAt2 >>> 6) | 960);
                    i12 += 2;
                    bArr[i13] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i12 > i10 - 3) {
                        if (i12 > i10 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i11 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i8)))) {
                                throw new UnpairedSurrogateException(i11, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i12);
                        }
                        int i14 = i11 + 1;
                        if (i14 != str.length()) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i15 = i12 + 3;
                                bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i12 += 4;
                                bArr[i15] = (byte) ((codePoint & 63) | 128);
                                i11 = i14;
                            } else {
                                i11 = i14;
                            }
                        }
                        throw new UnpairedSurrogateException(i11 - 1, length);
                    }
                    bArr[i12] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i16 = i12 + 2;
                    bArr[i12 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i12 += 3;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                }
                i11++;
            }
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
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
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
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
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i6, ByteBuffer byteBuffer, int i7, int i8) {
            return partialIsValidUtf8Default(i6, byteBuffer, i7, i8);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i6, int i7) {
            while (i6 < i7 && bArr[i6] >= 0) {
                i6++;
            }
            if (i6 >= i7) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i6, i7);
        }
    }
}
