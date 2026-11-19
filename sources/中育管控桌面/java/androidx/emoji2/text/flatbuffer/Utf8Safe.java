package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i6, int i7) {
            super("Unpaired surrogate at index " + i6 + " of " + i7);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i6 < length) {
                char cCharAt = charSequence.charAt(i6);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i6);
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

    public static String decodeUtf8Array(byte[] bArr, int i6, int i7) {
        if ((i6 | i7 | ((bArr.length - i6) - i7)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        int i8 = i6 + i7;
        char[] cArr = new char[i7];
        int i9 = 0;
        while (i6 < i8) {
            byte b7 = bArr[i6];
            if (!Utf8.DecodeUtil.isOneByte(b7)) {
                break;
            }
            i6++;
            Utf8.DecodeUtil.handleOneByte(b7, cArr, i9);
            i9++;
        }
        int i10 = i9;
        while (i6 < i8) {
            int i11 = i6 + 1;
            byte b8 = bArr[i6];
            if (Utf8.DecodeUtil.isOneByte(b8)) {
                int i12 = i10 + 1;
                Utf8.DecodeUtil.handleOneByte(b8, cArr, i10);
                int i13 = i11;
                while (i13 < i8) {
                    byte b9 = bArr[i13];
                    if (!Utf8.DecodeUtil.isOneByte(b9)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b9, cArr, i12);
                    i12++;
                }
                i10 = i12;
                i6 = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b8)) {
                if (i11 >= i8) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i6 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b8, bArr[i11], cArr, i10);
                i10++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b8)) {
                if (i11 >= i8 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i14 = i6 + 2;
                i6 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b8, bArr[i11], bArr[i14], cArr, i10);
                i10++;
            } else {
                if (i11 >= i8 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b10 = bArr[i11];
                int i15 = i6 + 3;
                byte b11 = bArr[i6 + 2];
                i6 += 4;
                Utf8.DecodeUtil.handleFourBytes(b8, b10, b11, bArr[i15], cArr, i10);
                i10 += 2;
            }
        }
        return new String(cArr, 0, i10);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i6, int i7) {
        if ((i6 | i7 | ((byteBuffer.limit() - i6) - i7)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        int i8 = i6 + i7;
        char[] cArr = new char[i7];
        int i9 = 0;
        while (i6 < i8) {
            byte b7 = byteBuffer.get(i6);
            if (!Utf8.DecodeUtil.isOneByte(b7)) {
                break;
            }
            i6++;
            Utf8.DecodeUtil.handleOneByte(b7, cArr, i9);
            i9++;
        }
        int i10 = i9;
        while (i6 < i8) {
            int i11 = i6 + 1;
            byte b8 = byteBuffer.get(i6);
            if (Utf8.DecodeUtil.isOneByte(b8)) {
                int i12 = i10 + 1;
                Utf8.DecodeUtil.handleOneByte(b8, cArr, i10);
                int i13 = i11;
                while (i13 < i8) {
                    byte b9 = byteBuffer.get(i13);
                    if (!Utf8.DecodeUtil.isOneByte(b9)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b9, cArr, i12);
                    i12++;
                }
                i10 = i12;
                i6 = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b8)) {
                if (i11 >= i8) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i6 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b8, byteBuffer.get(i11), cArr, i10);
                i10++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b8)) {
                if (i11 >= i8 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i14 = i6 + 2;
                i6 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b8, byteBuffer.get(i11), byteBuffer.get(i14), cArr, i10);
                i10++;
            } else {
                if (i11 >= i8 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b10 = byteBuffer.get(i11);
                int i15 = i6 + 3;
                byte b11 = byteBuffer.get(i6 + 2);
                i6 += 4;
                Utf8.DecodeUtil.handleFourBytes(b8, b10, b11, byteBuffer.get(i15), cArr, i10);
                i10 += 2;
            }
        }
        return new String(cArr, 0, i10);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        char cCharAt;
        int length = charSequence.length();
        int i10 = i7 + i6;
        int i11 = 0;
        while (i11 < length && (i9 = i11 + i6) < i10 && (cCharAt = charSequence.charAt(i11)) < 128) {
            bArr[i9] = (byte) cCharAt;
            i11++;
        }
        if (i11 == length) {
            return i6 + length;
        }
        int i12 = i6 + i11;
        while (i11 < length) {
            char cCharAt2 = charSequence.charAt(i11);
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i11 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i8)))) {
                            throw new UnpairedSurrogateException(i11, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i12);
                    }
                    int i14 = i11 + 1;
                    if (i14 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i14);
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

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i6;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i7 = 0;
        while (i7 < length) {
            try {
                char cCharAt = charSequence.charAt(i7);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i7, (byte) cCharAt);
                i7++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
            }
        }
        if (i7 == length) {
            byteBuffer.position(iPosition + i7);
            return;
        }
        iPosition += i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
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
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i9 = i7 + 1;
                    if (i9 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i10 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i6 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i10;
                                    i7 = i9;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
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
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (iPosition - byteBuffer.position()) + 1)));
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
        byteBuffer.position(iPosition);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        int i7 = 0;
        while (i6 < length) {
            char cCharAt = charSequence.charAt(i6);
            if (cCharAt < 2048) {
                i7 += (127 - cCharAt) >>> 31;
            } else {
                i7 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i6) < 65536) {
                        throw new UnpairedSurrogateException(i6, length);
                    }
                    i6++;
                }
            }
            i6++;
        }
        return i7;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i6, int i7) {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i6, i7) : decodeUtf8Buffer(byteBuffer, i6, i7);
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
