package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* loaded from: classes4.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    public DetectionResultColumn(BoundingBox boundingBox) {
        this.boundingBox = new BoundingBox(boundingBox);
        this.codewords = new Codeword[(boundingBox.getMaxY() - boundingBox.getMinY()) + 1];
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final Codeword getCodeword(int i10) {
        return this.codewords[imageRowToCodewordIndex(i10)];
    }

    public final Codeword getCodewordNearby(int i10) {
        Codeword codeword;
        Codeword codeword2;
        Codeword codeword3 = getCodeword(i10);
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int iImageRowToCodewordIndex = imageRowToCodewordIndex(i10) - i11;
            if (iImageRowToCodewordIndex >= 0 && (codeword2 = this.codewords[iImageRowToCodewordIndex]) != null) {
                return codeword2;
            }
            int iImageRowToCodewordIndex2 = imageRowToCodewordIndex(i10) + i11;
            Codeword[] codewordArr = this.codewords;
            if (iImageRowToCodewordIndex2 < codewordArr.length && (codeword = codewordArr[iImageRowToCodewordIndex2]) != null) {
                return codeword;
            }
        }
        return null;
    }

    public final Codeword[] getCodewords() {
        return this.codewords;
    }

    public final int imageRowToCodewordIndex(int i10) {
        return i10 - this.boundingBox.getMinY();
    }

    public final void setCodeword(int i10, Codeword codeword) {
        this.codewords[imageRowToCodewordIndex(i10)] = codeword;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (Codeword codeword : this.codewords) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                    i10++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
