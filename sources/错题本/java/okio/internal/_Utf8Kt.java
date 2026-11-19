package okio.internal;

import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, m5110d2 = {"commonToUtf8String", "", "", "beginIndex", "", "endIndex", "commonAsUtf8ToByteArray", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i;
        char cCharAt;
        AbstractC5830k.m5330g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            char cCharAt2 = str.charAt(i8);
            if (AbstractC5830k.m5332i(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i9 = i8;
                while (i8 < length2) {
                    char cCharAt3 = str.charAt(i8);
                    if (AbstractC5830k.m5332i(cCharAt3, 128) < 0) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) cCharAt3;
                        i8++;
                        while (true) {
                            i9 = i10;
                            if (i8 >= length2 || AbstractC5830k.m5332i(str.charAt(i8), 128) >= 0) {
                                break;
                            }
                            i10 = i9 + 1;
                            bArr[i9] = (byte) str.charAt(i8);
                            i8++;
                        }
                    } else {
                        if (AbstractC5830k.m5332i(cCharAt3, 2048) < 0) {
                            bArr[i9] = (byte) ((cCharAt3 >> 6) | 192);
                            i9 += 2;
                            bArr[i9 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i9] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i9 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i9 += 3;
                            bArr[i9 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (AbstractC5830k.m5332i(cCharAt3, 56319) > 0 || length2 <= (i = i8 + 1) || 56320 > (cCharAt = str.charAt(i)) || cCharAt >= 57344) {
                            bArr[i9] = Utf8.REPLACEMENT_BYTE;
                            i8++;
                            i9++;
                        } else {
                            int iCharAt = (str.charAt(i) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i9] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i9 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i9 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i9 += 4;
                            bArr[i9 + 3] = (byte) ((iCharAt & 63) | 128);
                            i8 += 2;
                        }
                        i8++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i9);
                AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i8] = (byte) cCharAt2;
            i8++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        AbstractC5830k.m5329f(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] bArr, int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        AbstractC5830k.m5330g(bArr, "<this>");
        if (i14 < 0 || i8 > bArr.length || i14 > i8) {
            StringBuilder sb = new StringBuilder("size=");
            AbstractC1923c.m1059w(sb, bArr.length, " beginIndex=", i14, " endIndex=");
            sb.append(i8);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i8 - i14];
        int i15 = 0;
        while (i14 < i8) {
            byte b6 = bArr[i14];
            if (b6 >= 0) {
                i9 = i15 + 1;
                cArr[i15] = (char) b6;
                i14++;
                while (i14 < i8) {
                    byte b9 = bArr[i14];
                    if (b9 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i9] = (char) b9;
                    i9++;
                }
            } else {
                if ((b6 >> 5) == -2) {
                    int i16 = i14 + 1;
                    if (i8 <= i16) {
                        i9 = i15 + 1;
                        cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b10 = bArr[i16];
                        if ((b10 & 192) == 128) {
                            int i17 = (b6 << 6) ^ (b10 ^ 3968);
                            if (i17 < 128) {
                                i9 = i15 + 1;
                                cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i9 = i15 + 1;
                                cArr[i15] = (char) i17;
                            }
                        } else {
                            i9 = i15 + 1;
                            cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else if ((b6 >> 4) == -2) {
                    int i18 = i14 + 2;
                    if (i8 <= i18) {
                        i9 = i15 + 1;
                        cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        int i19 = i14 + 1;
                        i10 = (i8 <= i19 || (bArr[i19] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b11 = bArr[i14 + 1];
                        if ((b11 & 192) == 128) {
                            byte b12 = bArr[i18];
                            if ((b12 & 192) == 128) {
                                int i20 = (b6 << 12) ^ ((b12 ^ (-123008)) ^ (b11 << 6));
                                if (i20 < 2048) {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i20 || i20 >= 57344) {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) i20;
                                } else {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                i10 = 3;
                            } else {
                                i9 = i15 + 1;
                                cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                        } else {
                            i9 = i15 + 1;
                            cArr[i15] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else {
                    if ((b6 >> 3) == -2) {
                        int i21 = i14 + 3;
                        if (i8 <= i21) {
                            i11 = i15 + 1;
                            cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                            int i22 = i14 + 1;
                            if (i8 > i22 && (bArr[i22] & 192) == 128) {
                                int i23 = i14 + 2;
                                i13 = (i8 <= i23 || (bArr[i23] & 192) != 128) ? 2 : 3;
                            }
                            i13 = 1;
                        } else {
                            byte b13 = bArr[i14 + 1];
                            if ((b13 & 192) == 128) {
                                byte b14 = bArr[i14 + 2];
                                if ((b14 & 192) == 128) {
                                    byte b15 = bArr[i21];
                                    if ((b15 & 192) == 128) {
                                        int i24 = (b6 << 18) ^ (((b15 ^ 3678080) ^ (b14 << 6)) ^ (b13 << 12));
                                        if (i24 > 1114111) {
                                            i11 = i15 + 1;
                                            cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i24 || i24 >= 57344) && i24 >= 65536) {
                                            if (i24 != 65533) {
                                                cArr[i15] = (char) ((i24 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i12 = i15 + 2;
                                                cArr[i15 + 1] = (char) ((i24 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                                i12 = i15 + 1;
                                            }
                                            i11 = i12;
                                        } else {
                                            i11 = i15 + 1;
                                            cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        i13 = 4;
                                    } else {
                                        i11 = i15 + 1;
                                        cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                    }
                                } else {
                                    i11 = i15 + 1;
                                    cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                }
                            } else {
                                i11 = i15 + 1;
                                cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                                i13 = 1;
                            }
                        }
                        i14 += i13;
                    } else {
                        i11 = i15 + 1;
                        cArr[i15] = Utf8.REPLACEMENT_CHARACTER;
                        i14++;
                    }
                    i15 = i11;
                }
                i14 += i10;
            }
            i15 = i9;
        }
        return AbstractC5862w.m5412s(cArr, 0, i15);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i8);
    }
}
