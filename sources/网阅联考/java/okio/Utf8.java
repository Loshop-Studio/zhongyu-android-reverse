package okio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m5175d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
@JvmName(name = "Utf8")
/* loaded from: classes2.dex */
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

    public static final int process2Utf8Bytes(byte[] process2Utf8Bytes, int i4, int i5, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process2Utf8Bytes, "$this$process2Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
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
        int i7 = (b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6);
        if (i7 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i7));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] process3Utf8Bytes, int i4, int i5, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process3Utf8Bytes, "$this$process3Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
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
        int i8 = ((b6 ^ ByteCompanionObject.MIN_VALUE) ^ (b5 << 6)) ^ (b4 << 12);
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

    public static final int process4Utf8Bytes(byte[] process4Utf8Bytes, int i4, int i5, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(process4Utf8Bytes, "$this$process4Utf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
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
        int i9 = (((b7 ^ ByteCompanionObject.MIN_VALUE) ^ (b6 << 6)) ^ (b5 << 12)) ^ (b4 << 18);
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

    public static final void processUtf16Chars(byte[] processUtf16Chars, int i4, int i5, Function1<? super Character, Unit> yield) {
        int i6;
        Intrinsics.checkNotNullParameter(processUtf16Chars, "$this$processUtf16Chars");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i7 = i4;
        while (i7 < i5) {
            byte b4 = processUtf16Chars[i7];
            if (b4 >= 0) {
                yield.invoke(Character.valueOf((char) b4));
                i7++;
                while (i7 < i5) {
                    byte b5 = processUtf16Chars[i7];
                    if (b5 >= 0) {
                        i7++;
                        yield.invoke(Character.valueOf((char) b5));
                    }
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i8 = i7 + 1;
                    if (i5 > i8) {
                        byte b6 = processUtf16Chars[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = (b4 << 6) ^ (b6 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(Character.valueOf(i9 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i9));
                            Unit unit = Unit.INSTANCE;
                            i6 = 2;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.INSTANCE;
                    i6 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i10 = i7 + 2;
                    if (i5 <= i10) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.INSTANCE;
                        int i11 = i7 + 1;
                        if (i5 > i11) {
                            if ((processUtf16Chars[i11] & 192) == 128) {
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b7 = processUtf16Chars[i7 + 1];
                        if ((b7 & 192) == 128) {
                            byte b8 = processUtf16Chars[i10];
                            if ((b8 & 192) == 128) {
                                int i12 = (b4 << 12) ^ ((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6));
                                yield.invoke(Character.valueOf((i12 >= 2048 && (55296 > i12 || 57343 < i12)) ? (char) i12 : (char) REPLACEMENT_CODE_POINT));
                                Unit unit4 = Unit.INSTANCE;
                                i6 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.INSTANCE;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.INSTANCE;
                            i6 = 1;
                        }
                    }
                } else if ((b4 >> 3) == -2) {
                    int i13 = i7 + 3;
                    if (i5 <= i13) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        Unit unit7 = Unit.INSTANCE;
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
                        byte b9 = processUtf16Chars[i7 + 1];
                        if ((b9 & 192) == 128) {
                            byte b10 = processUtf16Chars[i7 + 2];
                            if ((b10 & 192) == 128) {
                                byte b11 = processUtf16Chars[i13];
                                if ((b11 & 192) == 128) {
                                    int i16 = (b4 << 18) ^ (((b11 ^ ByteCompanionObject.MIN_VALUE) ^ (b10 << 6)) ^ (b9 << 12));
                                    if (i16 <= 1114111 && ((55296 > i16 || 57343 < i16) && i16 >= 65536 && i16 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i16 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i16 & 1023) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                    i6 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    Unit unit9 = Unit.INSTANCE;
                                    i6 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                Unit unit10 = Unit.INSTANCE;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            Unit unit11 = Unit.INSTANCE;
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

    public static final void processUtf8Bytes(String processUtf8Bytes, int i4, int i5, Function1<? super Byte, Unit> yield) {
        int i6;
        char cCharAt;
        Intrinsics.checkNotNullParameter(processUtf8Bytes, "$this$processUtf8Bytes");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i4 < i5) {
            char cCharAt2 = processUtf8Bytes.charAt(i4);
            if (Intrinsics.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i4++;
                while (i4 < i5 && Intrinsics.compare((int) processUtf8Bytes.charAt(i4), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i4)));
                    i4++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || 57343 < cCharAt2) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) cCharAt2, 56319) > 0 || i5 <= (i6 = i4 + 1) || 56320 > (cCharAt = processUtf8Bytes.charAt(i6)) || 57343 < cCharAt) {
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

    public static final void processUtf8CodePoints(byte[] processUtf8CodePoints, int i4, int i5, Function1<? super Integer, Unit> yield) {
        int i6;
        Intrinsics.checkNotNullParameter(processUtf8CodePoints, "$this$processUtf8CodePoints");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i7 = i4;
        while (i7 < i5) {
            byte b4 = processUtf8CodePoints[i7];
            if (b4 >= 0) {
                yield.invoke(Integer.valueOf(b4));
                i7++;
                while (i7 < i5) {
                    byte b5 = processUtf8CodePoints[i7];
                    if (b5 >= 0) {
                        i7++;
                        yield.invoke(Integer.valueOf(b5));
                    }
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i8 = i7 + 1;
                    if (i5 > i8) {
                        byte b6 = processUtf8CodePoints[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = (b4 << 6) ^ (b6 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(i9 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i9));
                            Unit unit = Unit.INSTANCE;
                            i6 = 2;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.INSTANCE;
                    i6 = 1;
                } else if ((b4 >> 4) == -2) {
                    int i10 = i7 + 2;
                    if (i5 <= i10) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.INSTANCE;
                        int i11 = i7 + 1;
                        if (i5 > i11) {
                            if ((processUtf8CodePoints[i11] & 192) == 128) {
                                i6 = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        byte b7 = processUtf8CodePoints[i7 + 1];
                        if ((b7 & 192) == 128) {
                            byte b8 = processUtf8CodePoints[i10];
                            if ((b8 & 192) == 128) {
                                int i12 = (b4 << 12) ^ ((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6));
                                yield.invoke((i12 >= 2048 && (55296 > i12 || 57343 < i12)) ? Integer.valueOf(i12) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit4 = Unit.INSTANCE;
                                i6 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.INSTANCE;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.INSTANCE;
                            i6 = 1;
                        }
                    }
                } else if ((b4 >> 3) == -2) {
                    int i13 = i7 + 3;
                    if (i5 <= i13) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit7 = Unit.INSTANCE;
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
                        byte b9 = processUtf8CodePoints[i7 + 1];
                        if ((b9 & 192) == 128) {
                            byte b10 = processUtf8CodePoints[i7 + 2];
                            if ((b10 & 192) == 128) {
                                byte b11 = processUtf8CodePoints[i13];
                                if ((b11 & 192) == 128) {
                                    int i16 = (b4 << 18) ^ (((b11 ^ ByteCompanionObject.MIN_VALUE) ^ (b10 << 6)) ^ (b9 << 12));
                                    yield.invoke((i16 <= 1114111 && (55296 > i16 || 57343 < i16) && i16 >= 65536) ? Integer.valueOf(i16) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    Unit unit8 = Unit.INSTANCE;
                                    i6 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    Unit unit9 = Unit.INSTANCE;
                                    i6 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit10 = Unit.INSTANCE;
                                i6 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit11 = Unit.INSTANCE;
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

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String str) {
        return size$default(str, 0, 0, 3, null);
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

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String str, int i4) {
        return size$default(str, i4, 0, 2, null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String utf8Size, int i4, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(utf8Size, "$this$utf8Size");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 >= i4) {
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
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
    }
}
