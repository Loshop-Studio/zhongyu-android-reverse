package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
abstract class AI01weightDecoder extends AI01decoder {
    public AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public abstract void addWeightCode(StringBuilder sb, int i10);

    public abstract int checkWeight(int i10);

    public final void encodeCompressedWeight(StringBuilder sb, int i10, int i11) {
        int iExtractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(i10, i11);
        addWeightCode(sb, iExtractNumericValueFromBitArray);
        int iCheckWeight = checkWeight(iExtractNumericValueFromBitArray);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (iCheckWeight / i12 == 0) {
                sb.append('0');
            }
            i12 /= 10;
        }
        sb.append(iCheckWeight);
    }
}
