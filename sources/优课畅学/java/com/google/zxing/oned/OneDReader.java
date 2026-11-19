package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class OneDReader implements Reader {
    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i10;
        int i11;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i12 = 1;
        boolean z10 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, height >> (z10 ? 8 : 5));
        int i13 = z10 ? height : 15;
        int i14 = height / 2;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 + 1;
            int i17 = i16 / 2;
            if ((i15 & 1) != 0) {
                i17 = -i17;
            }
            int i18 = (i17 * iMax) + i14;
            if (i18 < 0 || i18 >= height) {
                break;
            }
            try {
                bitArray = binaryBitmap.getBlackRow(i18, bitArray);
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == i12) {
                        bitArray.reverse();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultDecodeRow = decodeRow(i18, bitArray, map3);
                        if (i19 == i12) {
                            try {
                                resultDecodeRow.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(TXLiveConstants.RENDER_ROTATION_180));
                                ResultPoint[] resultPoints = resultDecodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    i11 = i12;
                                    float f10 = width;
                                    try {
                                        map2 = map3;
                                    } catch (ReaderException unused) {
                                        map2 = map3;
                                    }
                                    try {
                                        i10 = width;
                                        try {
                                            resultPoints[0] = new ResultPoint((f10 - resultPoints[0].getX()) - 1.0f, resultPoints[0].getY());
                                            resultPoints[i11] = new ResultPoint((f10 - resultPoints[i11].getX()) - 1.0f, resultPoints[i11].getY());
                                        } catch (ReaderException unused2) {
                                            continue;
                                            i19++;
                                            map3 = map2;
                                            i12 = i11;
                                            width = i10;
                                        }
                                    } catch (ReaderException unused3) {
                                        i10 = width;
                                        i19++;
                                        map3 = map2;
                                        i12 = i11;
                                        width = i10;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i10 = width;
                                i11 = i12;
                            }
                        }
                        return resultDecodeRow;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i10 = width;
                        i11 = i12;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i15 = i16;
            i12 = i12;
            width = width;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void recordPattern(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i10 >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z10 = !bitArray.get(i10);
        while (i10 < size) {
            if (bitArray.get(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z10 = bitArray.get(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (bitArray.get(i10) != z10) {
                length--;
                z10 = !z10;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i10 + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map);

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e10) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e10;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultDoDecode = doDecode(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultDoDecode.getResultMetadata();
            int iIntValue = 270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            resultDoDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultDoDecode.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i10 = 0; i10 < resultPoints.length; i10++) {
                    resultPoints[i10] = new ResultPoint((height - resultPoints[i10].getY()) - 1.0f, resultPoints[i10].getX());
                }
            }
            return resultDoDecode;
        }
    }
}
