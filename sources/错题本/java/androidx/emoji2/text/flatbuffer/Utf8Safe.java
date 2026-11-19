package androidx.emoji2.text.flatbuffer;

import androidx.collection.AbstractC0584a;
import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i8) {
            super(AbstractC0584a.m912m(i, i8, "Unpaired surrogate at index ", " of "));
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i, int i8) throws IllegalArgumentException {
        if ((i | i8 | ((bArr.length - i) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i8)));
        }
        int i9 = i + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i < i9) {
            byte b6 = bArr[i];
            if (!Utf8.DecodeUtil.isOneByte(b6)) {
                break;
            }
            i++;
            Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
            i10++;
        }
        int i11 = i10;
        while (i < i9) {
            int i12 = i + 1;
            byte b9 = bArr[i];
            if (Utf8.DecodeUtil.isOneByte(b9)) {
                int i13 = i11 + 1;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i11);
                int i14 = i12;
                while (i14 < i9) {
                    byte b10 = bArr[i14];
                    if (!Utf8.DecodeUtil.isOneByte(b10)) {
                        break;
                    }
                    i14++;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i13);
                    i13++;
                }
                i11 = i13;
                i = i14;
            } else if (Utf8.DecodeUtil.isTwoBytes(b9)) {
                if (i12 >= i9) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                Utf8.DecodeUtil.handleTwoBytes(b9, bArr[i12], cArr, i11);
                i11++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b9)) {
                if (i12 >= i9 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i15 = i + 2;
                i += 3;
                Utf8.DecodeUtil.handleThreeBytes(b9, bArr[i12], bArr[i15], cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b11 = bArr[i12];
                int i16 = i + 3;
                byte b12 = bArr[i + 2];
                i += 4;
                Utf8.DecodeUtil.handleFourBytes(b9, b11, b12, bArr[i16], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i, int i8) throws IllegalArgumentException {
        if ((i | i8 | ((byteBuffer.limit() - i) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i8)));
        }
        int i9 = i + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i < i9) {
            byte b6 = byteBuffer.get(i);
            if (!Utf8.DecodeUtil.isOneByte(b6)) {
                break;
            }
            i++;
            Utf8.DecodeUtil.handleOneByte(b6, cArr, i10);
            i10++;
        }
        int i11 = i10;
        while (i < i9) {
            int i12 = i + 1;
            byte b9 = byteBuffer.get(i);
            if (Utf8.DecodeUtil.isOneByte(b9)) {
                int i13 = i11 + 1;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i11);
                int i14 = i12;
                while (i14 < i9) {
                    byte b10 = byteBuffer.get(i14);
                    if (!Utf8.DecodeUtil.isOneByte(b10)) {
                        break;
                    }
                    i14++;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i13);
                    i13++;
                }
                i11 = i13;
                i = i14;
            } else if (Utf8.DecodeUtil.isTwoBytes(b9)) {
                if (i12 >= i9) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                Utf8.DecodeUtil.handleTwoBytes(b9, byteBuffer.get(i12), cArr, i11);
                i11++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b9)) {
                if (i12 >= i9 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i15 = i + 2;
                i += 3;
                Utf8.DecodeUtil.handleThreeBytes(b9, byteBuffer.get(i12), byteBuffer.get(i15), cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b11 = byteBuffer.get(i12);
                int i16 = i + 3;
                byte b12 = byteBuffer.get(i + 2);
                i += 4;
                Utf8.DecodeUtil.handleFourBytes(b9, b11, b12, byteBuffer.get(i16), cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i, int i8) {
        int i9;
        int i10;
        char cCharAt;
        int length = charSequence.length();
        int i11 = i8 + i;
        int i12 = 0;
        while (i12 < length && (i10 = i12 + i) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
            bArr[i10] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length) {
            return i + length;
        }
        int i13 = i + i12;
        while (i12 < length) {
            char cCharAt2 = charSequence.charAt(i12);
            if (cCharAt2 < 128 && i13 < i11) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                i13 += 2;
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                    if (i13 > i11 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                            throw new UnpairedSurrogateException(i12, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                    }
                    int i15 = i12 + 1;
                    if (i15 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i16 = i13 + 3;
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i12 = i15;
                        } else {
                            i12 = i15;
                        }
                    }
                    throw new UnpairedSurrogateException(i12 - 1, length);
                }
                bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i17 = i13 + 2;
                bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i13 += 3;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            }
            i12++;
        }
        return i13;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i8 = 0;
        while (i8 < length) {
            try {
                char cCharAt = charSequence.charAt(i8);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i8, (byte) cCharAt);
                i8++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (Math.max(i8, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i8 == length) {
            byteBuffer.position(iPosition + i8);
            return;
        }
        iPosition += i8;
        while (i8 < length) {
            char cCharAt2 = charSequence.charAt(i8);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i9 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i9, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i9;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i9;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (Math.max(i8, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i10 = i8 + 1;
                    if (i10 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i11 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i11;
                                    i8 = i10;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (Math.max(i8, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                                try {
                                    byteBuffer.put(i11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i8 = i10;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i8 = i10;
                                    iPosition = i;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (Math.max(i8, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i8 = i10;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i8, length);
                }
                int i12 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i8++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i8 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i8;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i8) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i, i8) : decodeUtf8Buffer(byteBuffer, i, i8);
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
