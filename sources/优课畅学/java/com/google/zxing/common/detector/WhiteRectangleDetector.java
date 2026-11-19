package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes4.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x10 = resultPoint.getX();
        float y10 = resultPoint.getY();
        float x11 = resultPoint2.getX();
        float y11 = resultPoint2.getY();
        float x12 = resultPoint3.getX();
        float y12 = resultPoint3.getY();
        float x13 = resultPoint4.getX();
        float y13 = resultPoint4.getY();
        return x10 < ((float) this.width) / 2.0f ? new ResultPoint[]{new ResultPoint(x13 - 1.0f, y13 + 1.0f), new ResultPoint(x11 + 1.0f, y11 + 1.0f), new ResultPoint(x12 - 1.0f, y12 - 1.0f), new ResultPoint(x10 + 1.0f, y10 - 1.0f)} : new ResultPoint[]{new ResultPoint(x13 + 1.0f, y13 + 1.0f), new ResultPoint(x11 + 1.0f, y11 - 1.0f), new ResultPoint(x12 - 1.0f, y12 + 1.0f), new ResultPoint(x10 - 1.0f, y10 - 1.0f)};
    }

    private boolean containsBlackPoint(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.image.get(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.image.get(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float f10, float f11, float f12, float f13) {
        int iRound = MathUtils.round(MathUtils.distance(f10, f11, f12, f13));
        float f14 = iRound;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < iRound; i10++) {
            float f17 = i10;
            int iRound2 = MathUtils.round((f17 * f15) + f10);
            int iRound3 = MathUtils.round((f17 * f16) + f11);
            if (this.image.get(iRound2, iRound3)) {
                return new ResultPoint(iRound2, iRound3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i10 = this.leftInit;
        int i11 = this.rightInit;
        int i12 = this.upInit;
        int i13 = this.downInit;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        while (z16) {
            boolean z17 = false;
            boolean zContainsBlackPoint = true;
            while (true) {
                if ((!zContainsBlackPoint && z11) || i11 >= this.width) {
                    break;
                }
                zContainsBlackPoint = containsBlackPoint(i12, i13, i11, false);
                if (zContainsBlackPoint) {
                    i11++;
                    z11 = true;
                    z17 = true;
                } else if (!z11) {
                    i11++;
                }
            }
            if (i11 < this.width) {
                boolean zContainsBlackPoint2 = true;
                while (true) {
                    if ((!zContainsBlackPoint2 && z12) || i13 >= this.height) {
                        break;
                    }
                    zContainsBlackPoint2 = containsBlackPoint(i10, i11, i13, true);
                    if (zContainsBlackPoint2) {
                        i13++;
                        z12 = true;
                        z17 = true;
                    } else if (!z12) {
                        i13++;
                    }
                }
                if (i13 < this.height) {
                    boolean zContainsBlackPoint3 = true;
                    while (true) {
                        if ((!zContainsBlackPoint3 && z13) || i10 < 0) {
                            break;
                        }
                        zContainsBlackPoint3 = containsBlackPoint(i12, i13, i10, false);
                        if (zContainsBlackPoint3) {
                            i10--;
                            z13 = true;
                            z17 = true;
                        } else if (!z13) {
                            i10--;
                        }
                    }
                    if (i10 >= 0) {
                        z16 = z17;
                        boolean zContainsBlackPoint4 = true;
                        while (true) {
                            if ((!zContainsBlackPoint4 && z15) || i12 < 0) {
                                break;
                            }
                            zContainsBlackPoint4 = containsBlackPoint(i10, i11, i12, true);
                            if (zContainsBlackPoint4) {
                                i12--;
                                z16 = true;
                                z15 = true;
                            } else if (!z15) {
                                i12--;
                            }
                        }
                        if (i12 >= 0) {
                            if (z16) {
                                z14 = true;
                            }
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10 || !z14) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i14 = i11 - i10;
        ResultPoint blackPointOnSegment = null;
        ResultPoint blackPointOnSegment2 = null;
        for (int i15 = 1; blackPointOnSegment2 == null && i15 < i14; i15++) {
            blackPointOnSegment2 = getBlackPointOnSegment(i10, i13 - i15, i10 + i15, i13);
        }
        if (blackPointOnSegment2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment3 = null;
        for (int i16 = 1; blackPointOnSegment3 == null && i16 < i14; i16++) {
            blackPointOnSegment3 = getBlackPointOnSegment(i10, i12 + i16, i10 + i16, i12);
        }
        if (blackPointOnSegment3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment4 = null;
        for (int i17 = 1; blackPointOnSegment4 == null && i17 < i14; i17++) {
            blackPointOnSegment4 = getBlackPointOnSegment(i11, i12 + i17, i11 - i17, i12);
        }
        if (blackPointOnSegment4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i18 = 1; blackPointOnSegment == null && i18 < i14; i18++) {
            blackPointOnSegment = getBlackPointOnSegment(i11, i13 - i18, i11 - i18, i13);
        }
        if (blackPointOnSegment != null) {
            return centerEdges(blackPointOnSegment, blackPointOnSegment2, blackPointOnSegment4, blackPointOnSegment3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i10, int i11, int i12) throws NotFoundException {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.leftInit = i14;
        int i15 = i11 + i13;
        this.rightInit = i15;
        int i16 = i12 - i13;
        this.upInit = i16;
        int i17 = i12 + i13;
        this.downInit = i17;
        if (i16 < 0 || i14 < 0 || i17 >= height || i15 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
