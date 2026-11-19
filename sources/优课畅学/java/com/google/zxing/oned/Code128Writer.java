package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int chooseCode(CharSequence charSequence, int i10, int i11) {
        CType cTypeFindCType;
        CType cTypeFindCType2;
        char cCharAt;
        CType cTypeFindCType3 = findCType(charSequence, i10);
        CType cType = CType.ONE_DIGIT;
        if (cTypeFindCType3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (cTypeFindCType3 == cType2) {
            return (i10 >= charSequence.length() || ((cCharAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || cCharAt >= CODE_FNC_3))) ? 100 : 101;
        }
        if (i11 == CODE_CODE_C) {
            return CODE_CODE_C;
        }
        if (i11 != 100) {
            if (cTypeFindCType3 == CType.FNC_1) {
                cTypeFindCType3 = findCType(charSequence, i10 + 1);
            }
            if (cTypeFindCType3 == CType.TWO_DIGITS) {
                return CODE_CODE_C;
            }
            return 100;
        }
        CType cType3 = CType.FNC_1;
        if (cTypeFindCType3 == cType3 || (cTypeFindCType = findCType(charSequence, i10 + 2)) == cType2 || cTypeFindCType == cType) {
            return 100;
        }
        if (cTypeFindCType == cType3) {
            if (findCType(charSequence, i10 + 3) == CType.TWO_DIGITS) {
                return CODE_CODE_C;
            }
            return 100;
        }
        int i12 = i10 + 4;
        while (true) {
            cTypeFindCType2 = findCType(charSequence, i12);
            if (cTypeFindCType2 != CType.TWO_DIGITS) {
                break;
            }
            i12 += 2;
        }
        if (cTypeFindCType2 == CType.ONE_DIGIT) {
            return 100;
        }
        return CODE_CODE_C;
    }

    private static CType findCType(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return CType.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return CType.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i11);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) throws NumberFormatException {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iAppendPattern = 0;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case 243:
                    case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                        break;
                    default:
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        }
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1;
            while (true) {
                int i15 = 103;
                if (i11 < length) {
                    int iChooseCode = chooseCode(str, i11, i13);
                    int iCharAt = 100;
                    if (iChooseCode == i13) {
                        switch (str.charAt(i11)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = CODE_FNC_2;
                                break;
                            case 243:
                                iCharAt = CODE_FNC_3;
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                if (i13 == 101) {
                                    iCharAt = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i13 != 100) {
                                    if (i13 != 101) {
                                        iCharAt = Integer.parseInt(str.substring(i11, i11 + 2));
                                        i11++;
                                        break;
                                    } else {
                                        char cCharAt2 = str.charAt(i11);
                                        iCharAt = cCharAt2 - ' ';
                                        if (iCharAt < 0) {
                                            iCharAt = cCharAt2 + '@';
                                            break;
                                        }
                                    }
                                } else {
                                    iCharAt = str.charAt(i11) - ' ';
                                    break;
                                }
                                break;
                        }
                        i11++;
                    } else {
                        if (i13 != 0) {
                            i15 = iChooseCode;
                        } else if (iChooseCode == 100) {
                            i15 = 104;
                        } else if (iChooseCode != 101) {
                            i15 = 105;
                        }
                        iCharAt = i15;
                        i13 = iChooseCode;
                    }
                    arrayList.add(Code128Reader.CODE_PATTERNS[iCharAt]);
                    i12 += iCharAt * i14;
                    if (i11 != 0) {
                        i14++;
                    }
                } else {
                    int[][] iArr = Code128Reader.CODE_PATTERNS;
                    arrayList.add(iArr[i12 % 103]);
                    arrayList.add(iArr[106]);
                    int i16 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i17 : iArr2) {
                            i16 += i17;
                        }
                    }
                    boolean[] zArr = new boolean[i16];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
