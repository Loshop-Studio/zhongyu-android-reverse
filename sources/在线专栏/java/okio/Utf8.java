package okio;

import com.taobao.accs.data.Message;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i4) {
        return (i4 >= 0 && 31 >= i4) || (127 <= i4 && 159 >= i4);
    }

    public static final boolean isUtf8Continuation(byte b4) {
        return (b4 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] process2Utf8Bytes, int i4, int i5, @NotNull InterfaceC3470l<? super Integer, C2925r> yield) {
        C2769l.m9241e(process2Utf8Bytes, "$this$process2Utf8Bytes");
        C2769l.m9241e(yield, "yield");
        int i6 = i4 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i5 <= i6) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b4 = process2Utf8Bytes[i4];
        byte b5 = process2Utf8Bytes[i6];
        if (!((b5 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i7 = (b5 ^ 3968) ^ (b4 << 6);
        if (i7 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i7));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] process3Utf8Bytes, int i4, int i5, @NotNull InterfaceC3470l<? super Integer, C2925r> yield) {
        C2769l.m9241e(process3Utf8Bytes, "$this$process3Utf8Bytes");
        C2769l.m9241e(yield, "yield");
        int i6 = i4 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i5 <= i6) {
            yield.invoke(numValueOf);
            int i7 = i4 + 1;
            if (i5 > i7) {
                if ((process3Utf8Bytes[i7] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b4 = process3Utf8Bytes[i4];
        byte b5 = process3Utf8Bytes[i4 + 1];
        if (!((b5 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b6 = process3Utf8Bytes[i6];
        if (!((b6 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i8 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b4 << 12);
        if (i8 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 <= i8 && 57343 >= i8) {
            yield.invoke(numValueOf);
            return 3;
        }
        yield.invoke(Integer.valueOf(i8));
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] process4Utf8Bytes, int i4, int i5, @NotNull InterfaceC3470l<? super Integer, C2925r> yield) {
        C2769l.m9241e(process4Utf8Bytes, "$this$process4Utf8Bytes");
        C2769l.m9241e(yield, "yield");
        int i6 = i4 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i5 <= i6) {
            yield.invoke(numValueOf);
            int i7 = i4 + 1;
            if (i5 > i7) {
                if ((process4Utf8Bytes[i7] & 192) == 128) {
                    int i8 = i4 + 2;
                    if (i5 > i8) {
                        if ((process4Utf8Bytes[i8] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b4 = process4Utf8Bytes[i4];
        byte b5 = process4Utf8Bytes[i4 + 1];
        if (!((b5 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b6 = process4Utf8Bytes[i4 + 2];
        if (!((b6 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b7 = process4Utf8Bytes[i6];
        if (!((b7 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i9 = (((b7 ^ 3678080) ^ (b6 << 6)) ^ (b5 << 12)) ^ (b4 << 18);
        if (i9 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i9 && 57343 >= i9) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i9 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i9));
        return 4;
    }

    public static final void processUtf16Chars(@NotNull byte[] processUtf16Chars, int i4, int i5, @NotNull InterfaceC3470l<? super Character, C2925r> yield) {
        int i6;
        C2769l.m9241e(processUtf16Chars, "$this$processUtf16Chars");
        C2769l.m9241e(yield, "yield");
        int i7 = i4;
        while (i7 < i5) {
            byte b4 = processUtf16Chars[i7];
            if (b4 >= 0) {
                yield.invoke(Character.valueOf((char) b4));
                i7++;
                while (i7 < i5 && processUtf16Chars[i7] >= 0) {
                    yield.invoke(Character.valueOf((char) processUtf16Chars[i7]));
                    i7++;
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i8 = i7 + 1;
                    if (i5 > i8) {
                        byte b5 = processUtf16Chars[i7];
                        byte b6 = processUtf16Chars[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = (b6 ^ 3968) ^ (b5 << 6);
                            yield.invoke(Character.valueOf(i9 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i9));
                            C2925r c2925r = C2925r.f11415a;
                            i6 = 2;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    C2925r c2925r2 = C2925r.f11415a;
                    i6 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i10 = i7 + 2;
                    if (i5 <= i10) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        C2925r c2925r3 = C2925r.f11415a;
                        int i11 = i7 + 1;
                        if (i5 > i11) {
                            if ((processUtf16Chars[i11] & 192) == 128) {
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b7 = processUtf16Chars[i7];
                        byte b8 = processUtf16Chars[i7 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = processUtf16Chars[i10];
                            if ((b9 & 192) == 128) {
                                int i12 = ((b9 ^ (-123008)) ^ (b8 << 6)) ^ (b7 << 12);
                                yield.invoke(Character.valueOf((i12 >= 2048 && (55296 > i12 || 57343 < i12)) ? (char) i12 : (char) REPLACEMENT_CODE_POINT));
                                C2925r c2925r4 = C2925r.f11415a;
                                i6 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                C2925r c2925r5 = C2925r.f11415a;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            C2925r c2925r6 = C2925r.f11415a;
                            i6 = 1;
                        }
                    }
                } else if ((b4 >> 3) == -2) {
                    int i13 = i7 + 3;
                    if (i5 <= i13) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        C2925r c2925r7 = C2925r.f11415a;
                        int i14 = i7 + 1;
                        if (i5 > i14) {
                            if ((processUtf16Chars[i14] & 192) == 128) {
                                int i15 = i7 + 2;
                                if (i5 > i15) {
                                    if ((processUtf16Chars[i15] & 192) == 128) {
                                        i6 = 3;
                                    }
                                }
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b10 = processUtf16Chars[i7];
                        byte b11 = processUtf16Chars[i7 + 1];
                        if ((b11 & 192) == 128) {
                            byte b12 = processUtf16Chars[i7 + 2];
                            if ((b12 & 192) == 128) {
                                byte b13 = processUtf16Chars[i13];
                                if ((b13 & 192) == 128) {
                                    int i16 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                                    if (i16 <= 1114111 && ((55296 > i16 || 57343 < i16) && i16 >= 65536 && i16 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i16 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i16 & Message.EXT_HEADER_VALUE_MAX_LEN) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    C2925r c2925r8 = C2925r.f11415a;
                                    i6 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    C2925r c2925r9 = C2925r.f11415a;
                                    i6 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                C2925r c2925r10 = C2925r.f11415a;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            C2925r c2925r11 = C2925r.f11415a;
                            i6 = 1;
                        }
                    }
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i7++;
                }
                i7 += i6;
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String processUtf8Bytes, int i4, int i5, @NotNull InterfaceC3470l<? super Byte, C2925r> yield) {
        int i6;
        char cCharAt;
        C2769l.m9241e(processUtf8Bytes, "$this$processUtf8Bytes");
        C2769l.m9241e(yield, "yield");
        while (i4 < i5) {
            char cCharAt2 = processUtf8Bytes.charAt(i4);
            if (C2769l.m9243g(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i4++;
                while (i4 < i5 && C2769l.m9243g(processUtf8Bytes.charAt(i4), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i4)));
                    i4++;
                }
            } else {
                if (C2769l.m9243g(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || 57343 < cCharAt2) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (C2769l.m9243g(cCharAt2, 56319) > 0 || i5 <= (i6 = i4 + 1) || 56320 > (cCharAt = processUtf8Bytes.charAt(i6)) || 57343 < cCharAt) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + processUtf8Bytes.charAt(i6)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i4 += 2;
                }
                i4++;
            }
        }
    }

    public static final void processUtf8CodePoints(@NotNull byte[] processUtf8CodePoints, int i4, int i5, @NotNull InterfaceC3470l<? super Integer, C2925r> yield) {
        int i6;
        C2769l.m9241e(processUtf8CodePoints, "$this$processUtf8CodePoints");
        C2769l.m9241e(yield, "yield");
        int i7 = i4;
        while (i7 < i5) {
            byte b4 = processUtf8CodePoints[i7];
            if (b4 >= 0) {
                yield.invoke(Integer.valueOf(b4));
                i7++;
                while (i7 < i5 && processUtf8CodePoints[i7] >= 0) {
                    yield.invoke(Integer.valueOf(processUtf8CodePoints[i7]));
                    i7++;
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i8 = i7 + 1;
                    if (i5 > i8) {
                        byte b5 = processUtf8CodePoints[i7];
                        byte b6 = processUtf8CodePoints[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = (b6 ^ 3968) ^ (b5 << 6);
                            yield.invoke(i9 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i9));
                            C2925r c2925r = C2925r.f11415a;
                            i6 = 2;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    C2925r c2925r2 = C2925r.f11415a;
                    i6 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i10 = i7 + 2;
                    if (i5 <= i10) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        C2925r c2925r3 = C2925r.f11415a;
                        int i11 = i7 + 1;
                        if (i5 > i11) {
                            if ((processUtf8CodePoints[i11] & 192) == 128) {
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b7 = processUtf8CodePoints[i7];
                        byte b8 = processUtf8CodePoints[i7 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = processUtf8CodePoints[i10];
                            if ((b9 & 192) == 128) {
                                int i12 = ((b9 ^ (-123008)) ^ (b8 << 6)) ^ (b7 << 12);
                                yield.invoke((i12 >= 2048 && (55296 > i12 || 57343 < i12)) ? Integer.valueOf(i12) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                C2925r c2925r4 = C2925r.f11415a;
                                i6 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                C2925r c2925r5 = C2925r.f11415a;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            C2925r c2925r6 = C2925r.f11415a;
                            i6 = 1;
                        }
                    }
                } else if ((b4 >> 3) == -2) {
                    int i13 = i7 + 3;
                    if (i5 <= i13) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        C2925r c2925r7 = C2925r.f11415a;
                        int i14 = i7 + 1;
                        if (i5 > i14) {
                            if ((processUtf8CodePoints[i14] & 192) == 128) {
                                int i15 = i7 + 2;
                                if (i5 > i15) {
                                    if ((processUtf8CodePoints[i15] & 192) == 128) {
                                        i6 = 3;
                                    }
                                }
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b10 = processUtf8CodePoints[i7];
                        byte b11 = processUtf8CodePoints[i7 + 1];
                        if ((b11 & 192) == 128) {
                            byte b12 = processUtf8CodePoints[i7 + 2];
                            if ((b12 & 192) == 128) {
                                byte b13 = processUtf8CodePoints[i13];
                                if ((b13 & 192) == 128) {
                                    int i16 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                                    yield.invoke((i16 <= 1114111 && (55296 > i16 || 57343 < i16) && i16 >= 65536) ? Integer.valueOf(i16) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    C2925r c2925r8 = C2925r.f11415a;
                                    i6 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    C2925r c2925r9 = C2925r.f11415a;
                                    i6 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                C2925r c2925r10 = C2925r.f11415a;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            C2925r c2925r11 = C2925r.f11415a;
                            i6 = 1;
                        }
                    }
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i7++;
                }
                i7 += i6;
            }
        }
    }

    public static final long size(@NotNull String str) {
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(@NotNull String str, int i4) {
        return size$default(str, i4, 0, 2, null);
    }

    public static final long size(@NotNull String utf8Size, int i4, int i5) {
        int i6;
        C2769l.m9241e(utf8Size, "$this$utf8Size");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (!(i5 <= utf8Size.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + utf8Size.length()).toString());
        }
        long j4 = 0;
        while (i4 < i5) {
            char cCharAt = utf8Size.charAt(i4);
            if (cCharAt < 128) {
                j4++;
            } else {
                if (cCharAt < 2048) {
                    i6 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i6 = 3;
                } else {
                    int i7 = i4 + 1;
                    char cCharAt2 = i7 < i5 ? utf8Size.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j4++;
                        i4 = i7;
                    } else {
                        j4 += 4;
                        i4 += 2;
                    }
                }
                j4 += i6;
            }
            i4++;
        }
        return j4;
    }

    public static /* synthetic */ long size$default(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return size(str, i4, i5);
    }
}
