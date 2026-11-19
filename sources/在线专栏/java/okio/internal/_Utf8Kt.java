package okio.internal;

import com.taobao.accs.data.Message;
import java.util.Arrays;
import kotlin.jvm.internal.C2769l;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;

/* loaded from: classes.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String commonAsUtf8ToByteArray) {
        int i4;
        int i5;
        char cCharAt;
        C2769l.m9241e(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i6 = 0;
        while (i6 < length) {
            char cCharAt2 = commonAsUtf8ToByteArray.charAt(i6);
            if (C2769l.m9243g(cCharAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i7 = i6;
                while (i6 < length2) {
                    char cCharAt3 = commonAsUtf8ToByteArray.charAt(i6);
                    if (C2769l.m9243g(cCharAt3, 128) < 0) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) cCharAt3;
                        i6++;
                        while (i6 < length2 && C2769l.m9243g(commonAsUtf8ToByteArray.charAt(i6), 128) < 0) {
                            bArr[i8] = (byte) commonAsUtf8ToByteArray.charAt(i6);
                            i6++;
                            i8++;
                        }
                        i7 = i8;
                    } else {
                        if (C2769l.m9243g(cCharAt3, 2048) < 0) {
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
                        } else if (C2769l.m9243g(cCharAt3, 56319) > 0 || length2 <= (i5 = i6 + 1) || 56320 > (cCharAt = commonAsUtf8ToByteArray.charAt(i5)) || 57343 < cCharAt) {
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
                C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i6] = (byte) cCharAt2;
            i6++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        C2769l.m9240d(bArrCopyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] commonToUtf8String, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i4;
        C2769l.m9241e(commonToUtf8String, "$this$commonToUtf8String");
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
                while (i10 < i5 && commonToUtf8String[i10] >= 0) {
                    cArr[i6] = (char) commonToUtf8String[i10];
                    i10++;
                    i6++;
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i12 = i10 + 1;
                    if (i5 <= i12) {
                        i6 = i11 + 1;
                        cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b5 = commonToUtf8String[i10];
                        byte b6 = commonToUtf8String[i12];
                        if ((b6 & 192) == 128) {
                            int i13 = (b6 ^ 3968) ^ (b5 << 6);
                            if (i13 < 128) {
                                i6 = i11 + 1;
                                cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i6 = i11 + 1;
                                cArr[i11] = (char) i13;
                            }
                            C2925r c2925r = C2925r.f11415a;
                            i7 = 2;
                        } else {
                            i6 = i11 + 1;
                            cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    C2925r c2925r2 = C2925r.f11415a;
                    i7 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i14 = i10 + 2;
                    if (i5 <= i14) {
                        i6 = i11 + 1;
                        cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        C2925r c2925r3 = C2925r.f11415a;
                        int i15 = i10 + 1;
                        if (i5 > i15) {
                            if ((commonToUtf8String[i15] & 192) == 128) {
                                i7 = 2;
                            }
                        }
                        i7 = 1;
                    } else {
                        byte b7 = commonToUtf8String[i10];
                        byte b8 = commonToUtf8String[i10 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = commonToUtf8String[i14];
                            if ((b9 & 192) == 128) {
                                int i16 = ((b9 ^ (-123008)) ^ (b8 << 6)) ^ (b7 << 12);
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
                                C2925r c2925r4 = C2925r.f11415a;
                                i7 = 3;
                            } else {
                                i6 = i11 + 1;
                                cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                C2925r c2925r5 = C2925r.f11415a;
                                i7 = 2;
                            }
                        } else {
                            i6 = i11 + 1;
                            cArr[i11] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            C2925r c2925r6 = C2925r.f11415a;
                            i7 = 1;
                        }
                    }
                } else {
                    if ((b4 >> 3) == -2) {
                        int i17 = i10 + 3;
                        if (i5 <= i17) {
                            i8 = i11 + 1;
                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                            C2925r c2925r7 = C2925r.f11415a;
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
                            byte b10 = commonToUtf8String[i10];
                            byte b11 = commonToUtf8String[i10 + 1];
                            if ((b11 & 192) == 128) {
                                byte b12 = commonToUtf8String[i10 + 2];
                                if ((b12 & 192) == 128) {
                                    byte b13 = commonToUtf8String[i17];
                                    if ((b13 & 192) == 128) {
                                        int i20 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                                        if (i20 > 1114111) {
                                            i8 = i11 + 1;
                                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 <= i20 && 57343 >= i20) || i20 < 65536 || i20 == 65533) {
                                            i8 = i11 + 1;
                                            cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        } else {
                                            int i21 = i11 + 1;
                                            cArr[i11] = (char) ((i20 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            char c4 = (char) ((i20 & Message.EXT_HEADER_VALUE_MAX_LEN) + Utf8.LOG_SURROGATE_HEADER);
                                            i8 = i21 + 1;
                                            cArr[i21] = c4;
                                        }
                                        C2925r c2925r8 = C2925r.f11415a;
                                        i9 = 4;
                                    } else {
                                        i8 = i11 + 1;
                                        cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                        C2925r c2925r9 = C2925r.f11415a;
                                        i9 = 3;
                                    }
                                } else {
                                    i8 = i11 + 1;
                                    cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                    C2925r c2925r10 = C2925r.f11415a;
                                    i9 = 2;
                                }
                            } else {
                                i8 = i11 + 1;
                                cArr[i11] = Utf8.REPLACEMENT_CHARACTER;
                                C2925r c2925r11 = C2925r.f11415a;
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
