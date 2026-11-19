package okio.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Utf8;

@Metadata(m13412d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, m13413d2 = {"commonToUtf8String", "", "", "beginIndex", "", "endIndex", "commonAsUtf8ToByteArray", "okio"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes5.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i9;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i11 = i10;
                while (i10 < length2) {
                    char cCharAt3 = str.charAt(i10);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) cCharAt3;
                        i10++;
                        while (true) {
                            i11 = i12;
                            if (i10 >= length2 || Intrinsics.compare((int) str.charAt(i10), 128) >= 0) {
                                break;
                            }
                            i12 = i11 + 1;
                            bArr[i11] = (byte) str.charAt(i10);
                            i10++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i11] = (byte) ((cCharAt3 >> 6) | 192);
                            i11 += 2;
                            bArr[i11 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i11] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i11 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i11 += 3;
                            bArr[i11 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i9 = i10 + 1) || 56320 > (cCharAt = str.charAt(i9)) || cCharAt >= 57344) {
                            bArr[i11] = Utf8.REPLACEMENT_BYTE;
                            i10++;
                            i11++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i9)) - 56613888;
                            bArr[i11] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i11 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i11 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i11 + 3] = (byte) ((iCharAt & 63) | 128);
                            i10 += 2;
                        }
                        i10++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i10] = (byte) cCharAt2;
            i10++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i9;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i16 < 0 || i10 > bArr.length || i16 > i10) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i16 + " endIndex=" + i10);
        }
        char[] cArr = new char[i10 - i16];
        int i17 = 0;
        while (i16 < i10) {
            byte b10 = bArr[i16];
            if (b10 >= 0) {
                i11 = i17 + 1;
                cArr[i17] = (char) b10;
                i16++;
                while (i16 < i10) {
                    byte b11 = bArr[i16];
                    if (b11 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i11] = (char) b11;
                    i11++;
                }
                Unit unit = Unit.INSTANCE;
            } else {
                if ((b10 >> 5) == -2) {
                    int i18 = i16 + 1;
                    if (i10 <= i18) {
                        i11 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b12 = bArr[i18];
                        if ((b12 & 192) == 128) {
                            int i19 = (b10 << 6) ^ (b12 ^ ByteCompanionObject.MIN_VALUE);
                            if (i19 < 128) {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) i19;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                } else if ((b10 >> 4) == -2) {
                    int i20 = i16 + 2;
                    if (i10 <= i20) {
                        i11 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit4 = Unit.INSTANCE;
                        int i21 = i16 + 1;
                        i12 = (i10 <= i21 || (bArr[i21] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i16 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i20];
                            if ((b14 & 192) == 128) {
                                int i22 = (b10 << 12) ^ ((b14 ^ ByteCompanionObject.MIN_VALUE) ^ (b13 << 6));
                                if (i22 < 2048) {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i22 || i22 >= 57344) {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) i22;
                                } else {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                Unit unit5 = Unit.INSTANCE;
                                i12 = 3;
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit6 = Unit.INSTANCE;
                            }
                        } else {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit7 = Unit.INSTANCE;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i23 = i16 + 3;
                        if (i10 <= i23) {
                            i13 = i17 + 1;
                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit8 = Unit.INSTANCE;
                            int i24 = i16 + 1;
                            if (i10 > i24 && (bArr[i24] & 192) == 128) {
                                int i25 = i16 + 2;
                                i15 = (i10 <= i25 || (bArr[i25] & 192) != 128) ? 2 : 3;
                            }
                            i15 = 1;
                        } else {
                            byte b15 = bArr[i16 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i16 + 2];
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i23];
                                    if ((b17 & 192) == 128) {
                                        int i26 = (b10 << 18) ^ (((b17 ^ ByteCompanionObject.MIN_VALUE) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i26 > 1114111) {
                                            i13 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i26 || i26 >= 57344) && i26 >= 65536) {
                                            if (i26 != 65533) {
                                                cArr[i17] = (char) ((i26 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i14 = i17 + 2;
                                                cArr[i17 + 1] = (char) ((i26 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                                i14 = i17 + 1;
                                            }
                                            Unit unit9 = Unit.INSTANCE;
                                            i13 = i14;
                                            i15 = 4;
                                        } else {
                                            i13 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        Unit unit10 = Unit.INSTANCE;
                                        i15 = 4;
                                    } else {
                                        i13 = i17 + 1;
                                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit11 = Unit.INSTANCE;
                                    }
                                } else {
                                    i13 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit12 = Unit.INSTANCE;
                                }
                            } else {
                                i13 = i17 + 1;
                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit13 = Unit.INSTANCE;
                                i15 = 1;
                            }
                        }
                        i16 += i15;
                    } else {
                        i13 = i17 + 1;
                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                        i16++;
                    }
                    i17 = i13;
                }
                i16 += i12;
            }
            i17 = i11;
        }
        return StringsKt.concatToString(cArr, 0, i17);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        return commonToUtf8String(bArr, i9, i10);
    }
}
