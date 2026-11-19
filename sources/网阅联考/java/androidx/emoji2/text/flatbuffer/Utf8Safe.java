package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i4 < length) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i4);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i4, int i5) throws IllegalArgumentException {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b4 = bArr[i4];
            if (!Utf8.DecodeUtil.isOneByte(b4)) {
                break;
            }
            i4++;
            Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i4 < i6) {
            int i9 = i4 + 1;
            byte b5 = bArr[i4];
            if (Utf8.DecodeUtil.isOneByte(b5)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                while (i9 < i6) {
                    byte b6 = bArr[i9];
                    if (!Utf8.DecodeUtil.isOneByte(b6)) {
                        break;
                    }
                    i9++;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
                    i10++;
                }
                i4 = i9;
                i8 = i10;
            } else if (Utf8.DecodeUtil.isTwoBytes(b5)) {
                if (i9 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                Utf8.DecodeUtil.handleTwoBytes(b5, bArr[i9], cArr, i8);
                i4 = i9 + 1;
                i8++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b5)) {
                if (i9 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i11 = i9 + 1;
                Utf8.DecodeUtil.handleThreeBytes(b5, bArr[i9], bArr[i11], cArr, i8);
                i4 = i11 + 1;
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i9 + 1;
                byte b7 = bArr[i9];
                int i13 = i12 + 1;
                Utf8.DecodeUtil.handleFourBytes(b5, b7, bArr[i12], bArr[i13], cArr, i8);
                i4 = i13 + 1;
                i8 = i8 + 1 + 1;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i4, int i5) throws IllegalArgumentException {
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        int i6 = i4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i4 < i6) {
            byte b4 = byteBuffer.get(i4);
            if (!Utf8.DecodeUtil.isOneByte(b4)) {
                break;
            }
            i4++;
            Utf8.DecodeUtil.handleOneByte(b4, cArr, i7);
            i7++;
        }
        int i8 = i7;
        while (i4 < i6) {
            int i9 = i4 + 1;
            byte b5 = byteBuffer.get(i4);
            if (Utf8.DecodeUtil.isOneByte(b5)) {
                int i10 = i8 + 1;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                while (i9 < i6) {
                    byte b6 = byteBuffer.get(i9);
                    if (!Utf8.DecodeUtil.isOneByte(b6)) {
                        break;
                    }
                    i9++;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
                    i10++;
                }
                i4 = i9;
                i8 = i10;
            } else if (Utf8.DecodeUtil.isTwoBytes(b5)) {
                if (i9 >= i6) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                Utf8.DecodeUtil.handleTwoBytes(b5, byteBuffer.get(i9), cArr, i8);
                i4 = i9 + 1;
                i8++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b5)) {
                if (i9 >= i6 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i11 = i9 + 1;
                Utf8.DecodeUtil.handleThreeBytes(b5, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                i4 = i11 + 1;
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i12 = i9 + 1;
                byte b7 = byteBuffer.get(i9);
                int i13 = i12 + 1;
                Utf8.DecodeUtil.handleFourBytes(b5, b7, byteBuffer.get(i12), byteBuffer.get(i13), cArr, i8);
                i4 = i13 + 1;
                i8 = i8 + 1 + 1;
            }
        }
        return new String(cArr, 0, i8);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int length = charSequence.length();
        int i9 = i5 + i4;
        int i10 = 0;
        while (i10 < length && (i8 = i10 + i4) < i9 && (cCharAt = charSequence.charAt(i10)) < 128) {
            bArr[i8] = (byte) cCharAt;
            i10++;
        }
        if (i10 == length) {
            return i4 + length;
        }
        int i11 = i4 + i10;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 >= 128 || i11 >= i9) {
                if (cCharAt2 < 2048 && i11 <= i9 - 2) {
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) ((cCharAt2 >>> 6) | 960);
                    i11 = i12 + 1;
                    bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i11 > i9 - 3) {
                        if (i11 > i9 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i7 = i10 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i7)))) {
                                throw new UnpairedSurrogateException(i10, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i11);
                        }
                        int i13 = i10 + 1;
                        if (i13 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i14 = i11 + 1;
                                bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                                int i15 = i14 + 1;
                                bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i15 + 1;
                                bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i11 = i16 + 1;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i10 = i13;
                            } else {
                                i10 = i13;
                            }
                        }
                        throw new UnpairedSurrogateException(i10 - 1, length);
                    }
                    int i17 = i11 + 1;
                    bArr[i11] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i6 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
                i10++;
            } else {
                i6 = i11 + 1;
                bArr[i11] = (byte) cCharAt2;
            }
            i11 = i6;
            i10++;
        }
        return i11;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i4 = 0;
        while (i4 < length) {
            try {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i4, (byte) cCharAt);
                i4++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (iPosition - byteBuffer.position()) + 1)));
            }
        }
        if (i4 == length) {
            byteBuffer.position(iPosition + i4);
            return;
        }
        iPosition += i4;
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i5 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i5, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i5;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i5;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (iPosition - byteBuffer.position()) + 1)));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i6 = i4 + 1;
                    if (i6 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i7 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i8 = i7 + 1;
                                    byteBuffer.put(i7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i9 = i8 + 1;
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i9, (byte) ((codePoint & 63) | 128));
                                    iPosition = i9;
                                    i4 = i6;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i7;
                                    i4 = i6;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (iPosition - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i4 = i6;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new UnpairedSurrogateException(i4, length);
                }
                int i10 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition = i10 + 1;
                byteBuffer.put(i10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i4++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) < 65536) {
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5) : decodeUtf8Buffer(byteBuffer, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
