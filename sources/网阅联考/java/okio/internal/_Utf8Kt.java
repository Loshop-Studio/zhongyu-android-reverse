package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m5175d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String commonAsUtf8ToByteArray) {
        int i4;
        int i5;
        char cCharAt;
        Intrinsics.checkNotNullParameter(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i6 = 0;
        while (i6 < length) {
            char cCharAt2 = commonAsUtf8ToByteArray.charAt(i6);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i7 = i6;
                while (i6 < length2) {
                    char cCharAt3 = commonAsUtf8ToByteArray.charAt(i6);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) cCharAt3;
                        i6++;
                        while (i6 < length2 && Intrinsics.compare((int) commonAsUtf8ToByteArray.charAt(i6), 128) < 0) {
                            bArr[i8] = (byte) commonAsUtf8ToByteArray.charAt(i6);
                            i6++;
                            i8++;
                        }
                        i7 = i8;
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            int i9 = i7 + 1;
                            bArr[i7] = (byte) ((cCharAt3 >> 6) | 192);
                            byte b4 = (byte) ((cCharAt3 & '?') | 128);
                            i4 = i9 + 1;
                            bArr[i9] = b4;
                        } else if (55296 > cCharAt3 || 57343 < cCharAt3) {
                            int i10 = i7 + 1;
                            bArr[i7] = (byte) ((cCharAt3 >> '\f') | 224);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            byte b5 = (byte) ((cCharAt3 & '?') | 128);
                            i4 = i11 + 1;
                            bArr[i11] = b5;
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i5 = i6 + 1) || 56320 > (cCharAt = commonAsUtf8ToByteArray.charAt(i5)) || 57343 < cCharAt) {
                            i4 = i7 + 1;
                            bArr[i7] = Utf8.REPLACEMENT_BYTE;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + commonAsUtf8ToByteArray.charAt(i5)) - 56613888;
                            int i12 = i7 + 1;
                            bArr[i7] = (byte) ((iCharAt >> 18) | 240);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((iCharAt >> 12) & 63) | 128);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((iCharAt >> 6) & 63) | 128);
                            byte b6 = (byte) ((iCharAt & 63) | 128);
                            i4 = i14 + 1;
                            bArr[i14] = b6;
                            i6 += 2;
                            i7 = i4;
                        }
                        i6++;
                        i7 = i4;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i6] = (byte) cCharAt2;
            i6++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] commonToUtf8String, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i4;
        Intrinsics.checkNotNullParameter(commonToUtf8String, "$this$commonToUtf8String");
        if (i10 < 0 || i5 > commonToUtf8String.length || i10 > i5) {
            throw new ArrayIndexOutOfBoundsException("size=" + commonToUtf8String.length + " beginIndex=" + i10 + " endIndex=" + i5);
        }
        char[] cArr = new char[i5 - i10];
        int i11 = 0;
        while (i10 < i5) {
            byte b4 = commonToUtf8String[i10];
            if (b4 >= 0) {
                i6 = i11 + 1;
                cArr[i11] = (char) b4;
                i10++;
                while (i10 < i5) {
                    byte b5 = commonToUtf8String[i10];
                    if (b5 < 0) {
                        break;
                    }
                    i10++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i12 = i10 + 1;
                    if (i5 <= i12) {
                        i6 = i11 + 1;
                        cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b6 = commonToUtf8String[i12];
                        if ((b6 & 192) == 128) {
                            int i13 = (b4 << 6) ^ (b6 ^ ByteCompanionObject.MIN_VALUE);
                            if (i13 < 128) {
                                i6 = i11 + 1;
                                cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i6 = i11 + 1;
                                cArr[i11] = (char) i13;
                            }
                            Unit unit = Unit.INSTANCE;
                            i7 = 2;
                        } else {
                            i6 = i11 + 1;
                            cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    i7 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i14 = i10 + 2;
                    if (i5 <= i14) {
                        i6 = i11 + 1;
                        cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit3 = Unit.INSTANCE;
                        int i15 = i10 + 1;
                        if (i5 > i15) {
                            if ((commonToUtf8String[i15] & 192) == 128) {
                                i7 = 2;
                            }
                        }
                        i7 = 1;
                    } else {
                        byte b7 = commonToUtf8String[i10 + 1];
                        if ((b7 & 192) == 128) {
                            byte b8 = commonToUtf8String[i14];
                            if ((b8 & 192) == 128) {
                                int i16 = (b4 << 12) ^ ((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6));
                                if (i16 < 2048) {
                                    i6 = i11 + 1;
                                    cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 <= i16 && 57343 >= i16) {
                                    i6 = i11 + 1;
                                    cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else {
                                    i6 = i11 + 1;
                                    cArr[i11] = (char) i16;
                                }
                                Unit unit4 = Unit.INSTANCE;
                                i7 = 3;
                            } else {
                                i6 = i11 + 1;
                                cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit5 = Unit.INSTANCE;
                                i7 = 2;
                            }
                        } else {
                            i6 = i11 + 1;
                            cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit6 = Unit.INSTANCE;
                            i7 = 1;
                        }
                    }
                } else {
                    if ((b4 >> 3) == -2) {
                        int i17 = i10 + 3;
                        if (i5 <= i17) {
                            i8 = i11 + 1;
                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit7 = Unit.INSTANCE;
                            int i18 = i10 + 1;
                            if (i5 > i18) {
                                if ((commonToUtf8String[i18] & 192) == 128) {
                                    int i19 = i10 + 2;
                                    if (i5 > i19) {
                                        if ((commonToUtf8String[i19] & 192) == 128) {
                                            i9 = 3;
                                        }
                                    }
                                    i9 = 2;
                                }
                            }
                            i9 = 1;
                        } else {
                            byte b9 = commonToUtf8String[i10 + 1];
                            if ((b9 & 192) == 128) {
                                byte b10 = commonToUtf8String[i10 + 2];
                                if ((b10 & 192) == 128) {
                                    byte b11 = commonToUtf8String[i17];
                                    if ((b11 & 192) == 128) {
                                        int i20 = (b4 << 18) ^ (((b11 ^ ByteCompanionObject.MIN_VALUE) ^ (b10 << 6)) ^ (b9 << 12));
                                        if (i20 > 1114111) {
                                            i8 = i11 + 1;
                                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 <= i20 && 57343 >= i20) || i20 < 65536 || i20 == 65533) {
                                            i8 = i11 + 1;
                                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        } else {
                                            int i21 = i11 + 1;
                                            cArr[i11] = (char) ((i20 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            char c4 = (char) ((i20 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            i8 = i21 + 1;
                                            cArr[i21] = c4;
                                        }
                                        Unit unit8 = Unit.INSTANCE;
                                        i9 = 4;
                                    } else {
                                        i8 = i11 + 1;
                                        cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit9 = Unit.INSTANCE;
                                        i9 = 3;
                                    }
                                } else {
                                    i8 = i11 + 1;
                                    cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit10 = Unit.INSTANCE;
                                    i9 = 2;
                                }
                            } else {
                                i8 = i11 + 1;
                                cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit11 = Unit.INSTANCE;
                                i9 = 1;
                            }
                        }
                        i10 += i9;
                    } else {
                        i8 = i11 + 1;
                        cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                        i10++;
                    }
                    i11 = i8;
                }
                i10 += i7;
            }
            i11 = i6;
        }
        return new String(cArr, 0, i11);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        return commonToUtf8String(bArr, i4, i5);
    }
}
