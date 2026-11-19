package okio.internal;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Utf8;
import p113g8.AbstractC8687z;
import p123h7.C8736p;

/* loaded from: classes5.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i10;
        char cCharAt;
        AbstractC9133u.m16133g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (AbstractC9133u.m16135i(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (AbstractC9133u.m16135i(cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || AbstractC9133u.m16135i(str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (AbstractC9133u.m16135i(cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | 192);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (AbstractC9133u.m16135i(cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = Utf8.REPLACEMENT_BYTE;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i10)) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        AbstractC9133u.m16132f(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        AbstractC9133u.m16133g(bArr, "<this>");
        if (i17 < 0 || i11 > bArr.length || i17 > i11) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i17 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i17];
        int i18 = 0;
        while (i17 < i11) {
            byte b10 = bArr[i17];
            if (b10 >= 0) {
                i12 = i18 + 1;
                cArr[i18] = (char) b10;
                i17++;
                while (i17 < i11) {
                    byte b11 = bArr[i17];
                    if (b11 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                C8736p c8736p = C8736p.f16368a;
            } else {
                if ((b10 >> 5) == -2) {
                    int i19 = i17 + 1;
                    if (i11 <= i19) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b12 = bArr[i19];
                        if ((b12 & 192) == 128) {
                            int i20 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i20 < 128) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) i20;
                            }
                            C8736p c8736p2 = C8736p.f16368a;
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    C8736p c8736p3 = C8736p.f16368a;
                } else if ((b10 >> 4) == -2) {
                    int i21 = i17 + 2;
                    if (i11 <= i21) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        C8736p c8736p4 = C8736p.f16368a;
                        int i22 = i17 + 1;
                        i13 = (i11 <= i22 || (bArr[i22] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i17 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i21];
                            if ((b14 & 192) == 128) {
                                int i23 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i23 < 2048) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i23 || i23 >= 57344) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) i23;
                                } else {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                C8736p c8736p5 = C8736p.f16368a;
                                i13 = 3;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                C8736p c8736p6 = C8736p.f16368a;
                            }
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            C8736p c8736p7 = C8736p.f16368a;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i24 = i17 + 3;
                        if (i11 <= i24) {
                            i14 = i18 + 1;
                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                            C8736p c8736p8 = C8736p.f16368a;
                            int i25 = i17 + 1;
                            if (i11 > i25 && (bArr[i25] & 192) == 128) {
                                int i26 = i17 + 2;
                                i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 2 : 3;
                            }
                            i16 = 1;
                        } else {
                            byte b15 = bArr[i17 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i17 + 2];
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i24];
                                    if ((b17 & 192) == 128) {
                                        int i27 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i27 > 1114111) {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536) {
                                            if (i27 != 65533) {
                                                cArr[i18] = (char) ((i27 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i15 = i18 + 2;
                                                cArr[i18 + 1] = (char) ((i27 & TXLiteAVCode.EVT_CAMERA_REMOVED) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                                i15 = i18 + 1;
                                            }
                                            C8736p c8736p9 = C8736p.f16368a;
                                            i14 = i15;
                                            i16 = 4;
                                        } else {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        C8736p c8736p10 = C8736p.f16368a;
                                        i16 = 4;
                                    } else {
                                        i14 = i18 + 1;
                                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        C8736p c8736p11 = C8736p.f16368a;
                                    }
                                } else {
                                    i14 = i18 + 1;
                                    cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                    C8736p c8736p12 = C8736p.f16368a;
                                }
                            } else {
                                i14 = i18 + 1;
                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                C8736p c8736p13 = C8736p.f16368a;
                                i16 = 1;
                            }
                        }
                        i17 += i16;
                    } else {
                        i14 = i18 + 1;
                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                        i17++;
                    }
                    i18 = i14;
                }
                i17 += i13;
            }
            i18 = i12;
        }
        return AbstractC8687z.m14107v(cArr, 0, i18);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
