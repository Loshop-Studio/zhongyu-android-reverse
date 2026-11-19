package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int MAX_PAIRS = 11;
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final List<ExpandedRow> rows = new ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, TXLiveConstants.RENDER_ROTATION_180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, TbsListener.ErrorCode.DEXOPT_EXCEPTION, TbsListener.ErrorCode.UNZIP_DIR_ERROR}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR, 122, 155}, new int[]{43, 129, 176, TbsListener.ErrorCode.FILE_DELETED, TbsListener.ErrorCode.UNKNOWN_ERROR, 110, 119, 146}, new int[]{16, 48, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 164}, new int[]{70, TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{TbsListener.ErrorCode.READ_RESPONSE_ERROR, 98, 83, 38, 114, 131, 182, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void adjustOddEvenCounts(int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.RSSExpandedReader.adjustOddEvenCounts(int):void");
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i10 = 2;
        for (int i11 = 1; i11 < this.pairs.size(); i11++) {
            ExpandedPair expandedPair2 = this.pairs.get(i11);
            checksumPortion += expandedPair2.getLeftChar().getChecksumPortion();
            int i12 = i10 + 1;
            DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion += rightChar2.getChecksumPortion();
                i10 += 2;
            } else {
                i10 = i12;
            }
        }
        return ((i10 + (-4)) * TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM) + (checksumPortion % TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM) == leftChar.getValue();
    }

    private List<ExpandedPair> checkRows(boolean z10) {
        List<ExpandedPair> listCheckRows = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z10) {
            Collections.reverse(this.rows);
        }
        try {
            listCheckRows = checkRows(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z10) {
            Collections.reverse(this.rows);
        }
        return listCheckRows;
    }

    public static Result constructResult(List<ExpandedPair> list) {
        String information = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).getFinderPattern().getResultPoints();
        return new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i10) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).getFinderPattern().getStartEnd()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.startFromEven) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (true) {
            if (i10 >= size) {
                break;
            }
            boolean z12 = bitArray.get(i10);
            boolean z13 = !z12;
            if (z12) {
                z11 = z13;
                break;
            } else {
                i10++;
                z11 = z13;
            }
        }
        int i11 = 0;
        boolean z14 = z11;
        int i12 = i10;
        while (i10 < size) {
            if (bitArray.get(i10) != z14) {
                decodeFinderCounters[i11] = decodeFinderCounters[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i12 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                decodeFinderCounters[i11] = 1;
                z14 = !z14;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i10) {
        return bitArray.get(i10) ? bitArray.getNextSet(bitArray.getNextUnset(i10)) : bitArray.getNextUnset(bitArray.getNextSet(i10));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z10, boolean z11) {
        return (finderPattern.getValue() == 0 && z10 && z11) ? false : true;
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
        for (ExpandedRow expandedRow : iterable2) {
            for (ExpandedPair expandedPair : iterable) {
                Iterator<ExpandedPair> it = expandedRow.getPairs().iterator();
                while (it.hasNext()) {
                    if (expandedPair.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() <= iArr.length) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (list.get(i10).getFinderPattern().getValue() != iArr[i10]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i10, boolean z10) {
        int nextUnset;
        int i11;
        int i12;
        if (z10) {
            int i13 = this.startEnd[0] - 1;
            while (i13 >= 0 && !bitArray.get(i13)) {
                i13--;
            }
            int i14 = i13 + 1;
            int[] iArr = this.startEnd;
            i12 = iArr[0] - i14;
            nextUnset = iArr[1];
            i11 = i14;
        } else {
            int[] iArr2 = this.startEnd;
            int i15 = iArr2[0];
            nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i11 = i15;
            i12 = nextUnset - this.startEnd[1];
        }
        int i16 = nextUnset;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i12;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS), new int[]{i11, i16}, i11, i16, i10);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void removePartialRows(List<ExpandedPair> list, List<ExpandedRow> list2) {
        Iterator<ExpandedRow> it = list2.iterator();
        while (it.hasNext()) {
            ExpandedRow next = it.next();
            if (next.getPairs().size() != list.size()) {
                Iterator<ExpandedPair> it2 = next.getPairs().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    ExpandedPair next2 = it2.next();
                    Iterator<ExpandedPair> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (next2.equals(it3.next())) {
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void storeRow(int i10, boolean z10) {
        boolean zIsEquivalent = false;
        int i11 = 0;
        boolean zIsEquivalent2 = false;
        while (true) {
            if (i11 >= this.rows.size()) {
                break;
            }
            ExpandedRow expandedRow = this.rows.get(i11);
            if (expandedRow.getRowNumber() > i10) {
                zIsEquivalent = expandedRow.isEquivalent(this.pairs);
                break;
            } else {
                zIsEquivalent2 = expandedRow.isEquivalent(this.pairs);
                i11++;
            }
        }
        if (zIsEquivalent || zIsEquivalent2 || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i11, new ExpandedRow(this.pairs, i10, z10));
        removePartialRows(this.pairs, this.rows);
    }

    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z10, boolean z11) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i10 = 0; i10 < dataCharacterCounters.length; i10++) {
            dataCharacterCounters[i10] = 0;
        }
        if (z11) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i11 = 0;
            for (int length = dataCharacterCounters.length - 1; i11 < length; length--) {
                int i12 = dataCharacterCounters[i11];
                dataCharacterCounters[i11] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i12;
                i11++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f10 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f10) / f10 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i13 = 0; i13 < dataCharacterCounters.length; i13++) {
            float f11 = (dataCharacterCounters[i13] * 1.0f) / fSum;
            int i14 = (int) (0.5f + f11);
            if (i14 <= 0) {
                if (f11 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f11 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                oddCounts[i15] = i14;
                oddRoundingErrors[i15] = f11 - i14;
            } else {
                evenCounts[i15] = i14;
                evenRoundingErrors[i15] = f11 - i14;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i16 = 0;
        int i17 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z10, z11)) {
                i16 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i17 += oddCounts[length2];
        }
        int i18 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z10, z11)) {
                i18 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
        }
        int i19 = i16 + i18;
        if ((i17 & 1) != 0 || i17 > 13 || i17 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i20 = (13 - i17) / 2;
        int i21 = SYMBOL_WIDEST[i20];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i21, true) * EVEN_TOTAL_SUBSET[i20]) + RSSUtils.getRSSvalue(evenCounts, 9 - i21, false) + GSUM[i20], i19);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) {
        this.pairs.clear();
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i10, bitArray));
        } catch (NotFoundException unused) {
            this.pairs.clear();
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i10, bitArray));
        }
    }

    public List<ExpandedPair> decodeRow2pairs(int i10, BitArray bitArray) throws NotFoundException {
        boolean z10 = false;
        while (!z10) {
            try {
                List<ExpandedPair> list = this.pairs;
                list.add(retrieveNextPair(bitArray, list, i10));
            } catch (NotFoundException e10) {
                if (this.pairs.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (checkChecksum()) {
            return this.pairs;
        }
        boolean zIsEmpty = this.rows.isEmpty();
        storeRow(i10, false);
        if (!zIsEmpty) {
            List<ExpandedPair> listCheckRows = checkRows(false);
            if (listCheckRows != null) {
                return listCheckRows;
            }
            List<ExpandedPair> listCheckRows2 = checkRows(true);
            if (listCheckRows2 != null) {
                return listCheckRows2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public List<ExpandedRow> getRows() {
        return this.rows;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    public ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i10) throws NotFoundException {
        FinderPattern foundFinderPattern;
        DataCharacter dataCharacterDecodeDataCharacter;
        boolean z10 = list.size() % 2 == 0;
        if (this.startFromEven) {
            z10 = !z10;
        }
        int nextSecondBar = -1;
        boolean z11 = true;
        do {
            findNextPair(bitArray, list, nextSecondBar);
            foundFinderPattern = parseFoundFinderPattern(bitArray, i10, z10);
            if (foundFinderPattern == null) {
                nextSecondBar = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        DataCharacter dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, z10, false);
        } catch (NotFoundException unused) {
            dataCharacterDecodeDataCharacter = null;
        }
        return new ExpandedPair(dataCharacterDecodeDataCharacter2, dataCharacterDecodeDataCharacter, foundFinderPattern, true);
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i10) throws NotFoundException {
        while (i10 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i10);
            this.pairs.clear();
            Iterator<ExpandedRow> it = list.iterator();
            while (it.hasNext()) {
                this.pairs.addAll(it.next().getPairs());
            }
            this.pairs.addAll(expandedRow.getPairs());
            if (isValidSequence(this.pairs)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(expandedRow);
                try {
                    return checkRows(arrayList, i10 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
