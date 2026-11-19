package com.google.flatbuffers;

import com.google.flatbuffers.Utf8;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i9, int i10) {
            super("Unpaired surrogate at index " + i9 + " of " + i10);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
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

    public static String decodeUtf8Array(byte[] bArr, int i9, int i10) throws IllegalArgumentException {
        if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b10 = bArr[i9];
            if (!Utf8.DecodeUtil.isOneByte(b10)) {
                break;
            }
            i9++;
            Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i9 < i11) {
            int i14 = i9 + 1;
            byte b11 = bArr[i9];
            if (Utf8.DecodeUtil.isOneByte(b11)) {
                int i15 = i13 + 1;
                Utf8.DecodeUtil.handleOneByte(b11, cArr, i13);
                int i16 = i14;
                while (i16 < i11) {
                    byte b12 = bArr[i16];
                    if (!Utf8.DecodeUtil.isOneByte(b12)) {
                        break;
                    }
                    i16++;
                    Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                    i15++;
                }
                i13 = i15;
                i9 = i16;
            } else if (Utf8.DecodeUtil.isTwoBytes(b11)) {
                if (i14 >= i11) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i9 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b11, bArr[i14], cArr, i13);
                i13++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b11)) {
                if (i14 >= i11 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i9 + 2;
                i9 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b11, bArr[i14], bArr[i17], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b13 = bArr[i14];
                int i18 = i9 + 3;
                byte b14 = bArr[i9 + 2];
                i9 += 4;
                Utf8.DecodeUtil.handleFourBytes(b11, b13, b14, bArr[i18], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i9, int i10) throws IllegalArgumentException {
        if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b10 = byteBuffer.get(i9);
            if (!Utf8.DecodeUtil.isOneByte(b10)) {
                break;
            }
            i9++;
            Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i9 < i11) {
            int i14 = i9 + 1;
            byte b11 = byteBuffer.get(i9);
            if (Utf8.DecodeUtil.isOneByte(b11)) {
                int i15 = i13 + 1;
                Utf8.DecodeUtil.handleOneByte(b11, cArr, i13);
                int i16 = i14;
                while (i16 < i11) {
                    byte b12 = byteBuffer.get(i16);
                    if (!Utf8.DecodeUtil.isOneByte(b12)) {
                        break;
                    }
                    i16++;
                    Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                    i15++;
                }
                i13 = i15;
                i9 = i16;
            } else if (Utf8.DecodeUtil.isTwoBytes(b11)) {
                if (i14 >= i11) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i9 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b11, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b11)) {
                if (i14 >= i11 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i9 + 2;
                i9 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b11, byteBuffer.get(i14), byteBuffer.get(i17), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b13 = byteBuffer.get(i14);
                int i18 = i9 + 3;
                byte b14 = byteBuffer.get(i9 + 2);
                i9 += 4;
                Utf8.DecodeUtil.handleFourBytes(b11, b13, b14, byteBuffer.get(i18), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i9, int i10) {
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

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
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
            byteBuffer.position(iPosition + i10);
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
        byteBuffer.position(iPosition);
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

    @Override // com.google.flatbuffers.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i9, int i10) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i10) : decodeUtf8Buffer(byteBuffer, i9, i10);
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
