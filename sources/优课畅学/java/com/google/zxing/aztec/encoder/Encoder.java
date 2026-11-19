package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes4.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i10, int i11) {
        int[] iArr = new int[i11];
        int size = bitArray.getSize() / i10;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= bitArray.get((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bitMatrix.set(i14, i13);
                    bitMatrix.set(i14, i15);
                    bitMatrix.set(i13, i14);
                    bitMatrix.set(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bitMatrix.set(i16, i16);
        int i17 = i16 + 1;
        bitMatrix.set(i17, i16);
        bitMatrix.set(i16, i17);
        int i18 = i10 + i11;
        bitMatrix.set(i18, i16);
        bitMatrix.set(i18, i17);
        bitMatrix.set(i18, i18 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z10, int i10, BitArray bitArray) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (bitArray.get(i12)) {
                    bitMatrix.set(i13, i11 - 5);
                }
                if (bitArray.get(i12 + 7)) {
                    bitMatrix.set(i11 + 5, i13);
                }
                if (bitArray.get(20 - i12)) {
                    bitMatrix.set(i13, i11 + 5);
                }
                if (bitArray.get(27 - i12)) {
                    bitMatrix.set(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (bitArray.get(i12)) {
                bitMatrix.set(i14, i11 - 7);
            }
            if (bitArray.get(i12 + 10)) {
                bitMatrix.set(i11 + 7, i14);
            }
            if (bitArray.get(29 - i12)) {
                bitMatrix.set(i14, i11 + 7);
            }
            if (bitArray.get(39 - i12)) {
                bitMatrix.set(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i10, int i11) {
        int size = bitArray.getSize() / i11;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i11));
        int i12 = i10 / i11;
        int[] iArrBitsToWords = bitsToWords(bitArray, i11, i12);
        reedSolomonEncoder.encode(iArrBitsToWords, i12 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i10 % i11);
        for (int i13 : iArrBitsToWords) {
            bitArray2.appendBits(i13, i11);
        }
        return bitArray2;
    }

    public static BitArray generateModeMessage(boolean z10, int i10, int i11) {
        BitArray bitArray = new BitArray();
        if (z10) {
            bitArray.appendBits(i10 - 1, 2);
            bitArray.appendBits(i11 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i10 - 1, 5);
        bitArray.appendBits(i11 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static GenericGF getGF(int i10) {
        if (i10 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i10 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i10 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i10 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i10 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    public static BitArray stuffBits(BitArray bitArray, int i10) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < size) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= size || bitArray.get(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                bitArray2.appendBits(i16, i10);
            } else if (i16 == 0) {
                bitArray2.appendBits(i13 | 1, i10);
            } else {
                bitArray2.appendBits(i13, i10);
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i10, boolean z10) {
        return ((z10 ? 88 : TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) + (i10 << 4)) * i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AztecCode encode(byte[] bArr, int i10, int i11) {
        BitArray bitArrayStuffBits;
        int i12;
        boolean z10;
        int iAbs;
        int i13;
        int i14;
        int i15;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i10) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int i16 = 1;
        if (i11 == 0) {
            BitArray bitArrayStuffBits2 = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 <= 32) {
                boolean z11 = i17 <= 3 ? i16 : 0;
                int i19 = z11 != 0 ? i17 + 1 : i17;
                int i20 = totalBitsInLayer(i19, z11);
                if (size2 <= i20) {
                    if (bitArrayStuffBits2 == null || i18 != WORD_SIZE[i19]) {
                        int i21 = WORD_SIZE[i19];
                        i18 = i21;
                        bitArrayStuffBits2 = stuffBits(bitArrayEncode, i21);
                    }
                    int i22 = i20 - (i20 % i18);
                    if ((z11 == 0 || bitArrayStuffBits2.getSize() <= (i18 << 6)) && bitArrayStuffBits2.getSize() + size <= i22) {
                        bitArrayStuffBits = bitArrayStuffBits2;
                        i12 = i18;
                        z10 = z11;
                        iAbs = i19;
                        i13 = i20;
                    }
                }
                i17++;
                i16 = i16;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        iAbs = Math.abs(i11);
        if (iAbs > (z10 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i13 = totalBitsInLayer(iAbs, z10);
        i12 = WORD_SIZE[iAbs];
        int i23 = i13 - (i13 % i12);
        bitArrayStuffBits = stuffBits(bitArrayEncode, i12);
        if (bitArrayStuffBits.getSize() + size > i23) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && bitArrayStuffBits.getSize() > (i12 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i13, i12);
        int size3 = bitArrayStuffBits.getSize() / i12;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z10, iAbs, size3);
        int i24 = (z10 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i24];
        int i25 = 2;
        if (z10) {
            for (int i26 = 0; i26 < i24; i26++) {
                iArr[i26] = i26;
            }
            i14 = i24;
        } else {
            int i27 = i24 / 2;
            i14 = i24 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i14 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                iArr[(i27 - i29) - i16] = (i28 - r14) - 1;
                iArr[i27 + i29] = (i29 / 15) + i29 + i28 + i16;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i14);
        int i30 = 0;
        for (int i31 = 0; i31 < iAbs; i31++) {
            int i32 = ((iAbs - i31) << i25) + (z10 ? 9 : 12);
            for (int i33 = 0; i33 < i32; i33++) {
                int i34 = i33 << 1;
                int i35 = 0;
                while (i35 < i25) {
                    int i36 = i16;
                    if (bitArrayGenerateCheckWords.get(i30 + i34 + i35)) {
                        int i37 = i31 << 1;
                        i15 = i25;
                        bitMatrix.set(iArr[i37 + i35], iArr[i37 + i33]);
                    } else {
                        i15 = i25;
                    }
                    if (bitArrayGenerateCheckWords.get((i32 << 1) + i30 + i34 + i35)) {
                        int i38 = i31 << 1;
                        bitMatrix.set(iArr[i38 + i33], iArr[((i24 - 1) - i38) - i35]);
                    }
                    if (bitArrayGenerateCheckWords.get((i32 << 2) + i30 + i34 + i35)) {
                        int i39 = (i24 - 1) - (i31 << 1);
                        bitMatrix.set(iArr[i39 - i35], iArr[i39 - i33]);
                    }
                    if (bitArrayGenerateCheckWords.get((i32 * 6) + i30 + i34 + i35)) {
                        int i40 = i31 << 1;
                        bitMatrix.set(iArr[((i24 - 1) - i40) - i33], iArr[i40 + i35]);
                    }
                    i35++;
                    i16 = i36;
                    i25 = i15;
                }
            }
            i30 += i32 << 3;
        }
        drawModeMessage(bitMatrix, z10, i14, bitArrayGenerateModeMessage);
        if (z10) {
            drawBullsEye(bitMatrix, i14 / 2, 5);
        } else {
            int i41 = i14 / 2;
            drawBullsEye(bitMatrix, i41, 7);
            int i42 = 0;
            int i43 = 0;
            while (i43 < (i24 / 2) - 1) {
                for (int i44 = i41 & 1; i44 < i14; i44 += 2) {
                    int i45 = i41 - i42;
                    bitMatrix.set(i45, i44);
                    int i46 = i41 + i42;
                    bitMatrix.set(i46, i44);
                    bitMatrix.set(i44, i45);
                    bitMatrix.set(i44, i46);
                }
                i43 += 15;
                i42 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z10);
        aztecCode.setSize(i14);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
