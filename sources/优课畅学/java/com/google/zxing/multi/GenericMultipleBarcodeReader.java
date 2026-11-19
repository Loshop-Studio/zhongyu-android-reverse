package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i10, int i11, int i12) {
        int i13;
        if (i12 > 4) {
            return;
        }
        try {
            Result resultDecode = this.delegate.decode(binaryBitmap, map);
            Iterator<Result> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getText().equals(resultDecode.getText())) {
                        break;
                    }
                } else {
                    list.add(translateResultPoints(resultDecode, i10, i11));
                    break;
                }
            }
            ResultPoint[] resultPoints = resultDecode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f10 = width;
            float f11 = height;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x10 = resultPoint.getX();
                    float y10 = resultPoint.getY();
                    if (x10 < f10) {
                        f10 = x10;
                    }
                    if (y10 < f11) {
                        f11 = y10;
                    }
                    if (x10 > f12) {
                        f12 = x10;
                    }
                    if (y10 > f13) {
                        f13 = y10;
                    }
                }
            }
            if (f10 > 100.0f) {
                i13 = 0;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f10, height), map, list, i10, i11, i12 + 1);
            } else {
                i13 = 0;
            }
            if (f11 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(i13, i13, width, (int) f11), map, list, i10, i11, i12 + 1);
            }
            if (f12 < width - 100) {
                int i14 = (int) f12;
                doDecodeMultiple(binaryBitmap.crop(i14, 0, width - i14, height), map, list, i10 + i14, i11, i12 + 1);
            }
            if (f13 < height - 100) {
                int i15 = (int) f13;
                doDecodeMultiple(binaryBitmap.crop(0, i15, width, height - i15), map, list, i10, i11 + i15, i12 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    private static Result translateResultPoints(Result result, int i10, int i11) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i12 = 0; i12 < resultPoints.length; i12++) {
            ResultPoint resultPoint = resultPoints[i12];
            if (resultPoint != null) {
                resultPointArr[i12] = new ResultPoint(resultPoint.getX() + i10, resultPoint.getY() + i11);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }
}
