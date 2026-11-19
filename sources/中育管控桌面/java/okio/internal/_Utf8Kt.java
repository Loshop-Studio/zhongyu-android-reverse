package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Utf8;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, m7880d2 = {"commonToUtf8String", "", "", "beginIndex", "", "endIndex", "commonAsUtf8ToByteArray", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i6;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt2 = str.charAt(i7);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i8 = i7;
                while (i7 < length2) {
                    char cCharAt3 = str.charAt(i7);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) cCharAt3;
                        i7++;
                        while (true) {
                            i8 = i9;
                            if (i7 >= length2 || Intrinsics.compare((int) str.charAt(i7), 128) >= 0) {
                                break;
                            }
                            i9 = i8 + 1;
                            bArr[i8] = (byte) str.charAt(i7);
                            i7++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i8] = (byte) ((cCharAt3 >> 6) | 192);
                            i8 += 2;
                            bArr[i8 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i8] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i8 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i8 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i6 = i7 + 1) || 56320 > (cCharAt = str.charAt(i6)) || cCharAt >= 57344) {
                            bArr[i8] = Utf8.REPLACEMENT_BYTE;
                            i7++;
                            i8++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i6)) - 56613888;
                            bArr[i8] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i8 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i8 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i8 + 3] = (byte) ((iCharAt & 63) | 128);
                            i7 += 2;
                        }
                        i7++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i7] = (byte) cCharAt2;
            i7++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i6;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i13 < 0 || i7 > bArr.length || i13 > i7) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i13 + " endIndex=" + i7);
        }
        char[] cArr = new char[i7 - i13];
        int i14 = 0;
        while (i13 < i7) {
            byte b7 = bArr[i13];
            if (b7 >= 0) {
                i8 = i14 + 1;
                cArr[i14] = (char) b7;
                i13++;
                while (i13 < i7) {
                    byte b8 = bArr[i13];
                    if (b8 < 0) {
                        break;
                    }
                    i13++;
                    cArr[i8] = (char) b8;
                    i8++;
                }
                Unit unit = Unit.INSTANCE;
            } else {
                if ((b7 >> 5) == -2) {
                    int i15 = i13 + 1;
                    if (i7 <= i15) {
                        i8 = i14 + 1;
                        cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b9 = bArr[i15];
                        if ((b9 & 192) == 128) {
                            int i16 = (b7 << 6) ^ (b9 ^ ByteCompanionObject.MIN_VALUE);
                            if (i16 < 128) {
                                i8 = i14 + 1;
                                cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i8 = i14 + 1;
                                cArr[i14] = (char) i16;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            i8 = i14 + 1;
                            cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                } else if ((b7 >> 4) == -2) {
                    int i17 = i13 + 2;
                    if (i7 <= i17) {
                        i8 = i14 + 1;
                        cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit4 = Unit.INSTANCE;
                        int i18 = i13 + 1;
                        i9 = (i7 <= i18 || (bArr[i18] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b10 = bArr[i13 + 1];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i17];
                            if ((b11 & 192) == 128) {
                                int i19 = (b7 << 12) ^ ((b11 ^ ByteCompanionObject.MIN_VALUE) ^ (b10 << 6));
                                if (i19 < 2048) {
                                    i8 = i14 + 1;
                                    cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i19 || i19 >= 57344) {
                                    i8 = i14 + 1;
                                    cArr[i14] = (char) i19;
                                } else {
                                    i8 = i14 + 1;
                                    cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                Unit unit5 = Unit.INSTANCE;
                                i9 = 3;
                            } else {
                                i8 = i14 + 1;
                                cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit6 = Unit.INSTANCE;
                            }
                        } else {
                            i8 = i14 + 1;
                            cArr[i14] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit7 = Unit.INSTANCE;
                        }
                    }
                } else {
                    if ((b7 >> 3) == -2) {
                        int i20 = i13 + 3;
                        if (i7 <= i20) {
                            i10 = i14 + 1;
                            cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit8 = Unit.INSTANCE;
                            int i21 = i13 + 1;
                            if (i7 > i21 && (bArr[i21] & 192) == 128) {
                                int i22 = i13 + 2;
                                i12 = (i7 <= i22 || (bArr[i22] & 192) != 128) ? 2 : 3;
                            }
                            i12 = 1;
                        } else {
                            byte b12 = bArr[i13 + 1];
                            if ((b12 & 192) == 128) {
                                byte b13 = bArr[i13 + 2];
                                if ((b13 & 192) == 128) {
                                    byte b14 = bArr[i20];
                                    if ((b14 & 192) == 128) {
                                        int i23 = (b7 << 18) ^ (((b14 ^ ByteCompanionObject.MIN_VALUE) ^ (b13 << 6)) ^ (b12 << 12));
                                        if (i23 > 1114111) {
                                            i10 = i14 + 1;
                                            cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i23 || i23 >= 57344) && i23 >= 65536) {
                                            if (i23 != 65533) {
                                                cArr[i14] = (char) ((i23 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i11 = i14 + 2;
                                                cArr[i14 + 1] = (char) ((i23 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                                i11 = i14 + 1;
                                            }
                                            Unit unit9 = Unit.INSTANCE;
                                            i10 = i11;
                                            i12 = 4;
                                        } else {
                                            i10 = i14 + 1;
                                            cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        Unit unit10 = Unit.INSTANCE;
                                        i12 = 4;
                                    } else {
                                        i10 = i14 + 1;
                                        cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit11 = Unit.INSTANCE;
                                    }
                                } else {
                                    i10 = i14 + 1;
                                    cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit12 = Unit.INSTANCE;
                                }
                            } else {
                                i10 = i14 + 1;
                                cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit13 = Unit.INSTANCE;
                                i12 = 1;
                            }
                        }
                        i13 += i12;
                    } else {
                        i10 = i14 + 1;
                        cArr[i14] = Utf8.REPLACEMENT_CHARACTER;
                        i13++;
                    }
                    i14 = i10;
                }
                i13 += i9;
            }
            i14 = i8;
        }
        return StringsKt.concatToString(cArr, 0, i14);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = bArr.length;
        }
        return commonToUtf8String(bArr, i6, i7);
    }
}
