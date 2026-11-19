package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f360mT;
    private double mTotalLength;

    /* renamed from: mY */
    private double[][] f361mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.f360mT = dArr;
        this.f361mY = dArr2;
        if (length <= 2) {
            return;
        }
        int i6 = 0;
        double d6 = 0.0d;
        while (true) {
            double d7 = d6;
            if (i6 >= dArr.length) {
                this.mTotalLength = 0.0d;
                return;
            }
            double d8 = dArr2[i6][0];
            if (i6 > 0) {
                Math.hypot(d8 - d6, d8 - d7);
            }
            i6++;
            d6 = d8;
        }
    }

    private double getLength2D(double d6) {
        if (Double.isNaN(this.mTotalLength)) {
            return 0.0d;
        }
        double[] dArr = this.f360mT;
        int length = dArr.length;
        if (d6 <= dArr[0]) {
            return 0.0d;
        }
        int i6 = length - 1;
        if (d6 >= dArr[i6]) {
            return this.mTotalLength;
        }
        double dHypot = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        int i7 = 0;
        while (i7 < i6) {
            double[] dArr2 = this.f361mY[i7];
            double d9 = dArr2[0];
            double d10 = dArr2[1];
            if (i7 > 0) {
                dHypot += Math.hypot(d9 - d7, d10 - d8);
            }
            double[] dArr3 = this.f360mT;
            double d11 = dArr3[i7];
            if (d6 == d11) {
                return dHypot;
            }
            int i8 = i7 + 1;
            double d12 = dArr3[i8];
            if (d6 < d12) {
                double d13 = (d6 - d11) / (d12 - d11);
                double[][] dArr4 = this.f361mY;
                double[] dArr5 = dArr4[i7];
                double d14 = dArr5[0];
                double[] dArr6 = dArr4[i8];
                double d15 = 1.0d - d13;
                return dHypot + Math.hypot(d10 - ((dArr5[1] * d15) + (dArr6[1] * d13)), d9 - ((d14 * d15) + (dArr6[0] * d13)));
            }
            i7 = i8;
            d7 = d9;
            d8 = d10;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d6, double[] dArr) {
        double[] dArr2 = this.f360mT;
        int length = dArr2.length;
        int i6 = 0;
        int length2 = this.f361mY[0].length;
        if (this.mExtrapolate) {
            double d7 = dArr2[0];
            if (d6 <= d7) {
                getSlope(d7, this.mSlopeTemp);
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f361mY[0][i7] + ((d6 - this.f360mT[0]) * this.mSlopeTemp[i7]);
                }
                return;
            }
            int i8 = length - 1;
            double d8 = dArr2[i8];
            if (d6 >= d8) {
                getSlope(d8, this.mSlopeTemp);
                while (i6 < length2) {
                    dArr[i6] = this.f361mY[i8][i6] + ((d6 - this.f360mT[i8]) * this.mSlopeTemp[i6]);
                    i6++;
                }
                return;
            }
        } else {
            if (d6 <= dArr2[0]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = this.f361mY[0][i9];
                }
                return;
            }
            int i10 = length - 1;
            if (d6 >= dArr2[i10]) {
                while (i6 < length2) {
                    dArr[i6] = this.f361mY[i10][i6];
                    i6++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d6 == this.f360mT[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f361mY[i11][i12];
                }
            }
            double[] dArr3 = this.f360mT;
            int i13 = i11 + 1;
            double d9 = dArr3[i13];
            if (d6 < d9) {
                double d10 = dArr3[i11];
                double d11 = (d6 - d10) / (d9 - d10);
                while (i6 < length2) {
                    double[][] dArr4 = this.f361mY;
                    dArr[i6] = (dArr4[i11][i6] * (1.0d - d11)) + (dArr4[i13][i6] * d11);
                    i6++;
                }
                return;
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getSlope(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f360mT
            int r1 = r0.length
            double[][] r2 = r12.f361mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f360mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f361mY
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f360mT;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double getSlope(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f360mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f360mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f361mY
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, int):double");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d6, float[] fArr) {
        double[] dArr = this.f360mT;
        int length = dArr.length;
        int i6 = 0;
        int length2 = this.f361mY[0].length;
        if (this.mExtrapolate) {
            double d7 = dArr[0];
            if (d6 <= d7) {
                getSlope(d7, this.mSlopeTemp);
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) (this.f361mY[0][i7] + ((d6 - this.f360mT[0]) * this.mSlopeTemp[i7]));
                }
                return;
            }
            int i8 = length - 1;
            double d8 = dArr[i8];
            if (d6 >= d8) {
                getSlope(d8, this.mSlopeTemp);
                while (i6 < length2) {
                    fArr[i6] = (float) (this.f361mY[i8][i6] + ((d6 - this.f360mT[i8]) * this.mSlopeTemp[i6]));
                    i6++;
                }
                return;
            }
        } else {
            if (d6 <= dArr[0]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr[i9] = (float) this.f361mY[0][i9];
                }
                return;
            }
            int i10 = length - 1;
            if (d6 >= dArr[i10]) {
                while (i6 < length2) {
                    fArr[i6] = (float) this.f361mY[i10][i6];
                    i6++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d6 == this.f360mT[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f361mY[i11][i12];
                }
            }
            double[] dArr2 = this.f360mT;
            int i13 = i11 + 1;
            double d9 = dArr2[i13];
            if (d6 < d9) {
                double d10 = dArr2[i11];
                double d11 = (d6 - d10) / (d9 - d10);
                while (i6 < length2) {
                    double[][] dArr3 = this.f361mY;
                    fArr[i6] = (float) ((dArr3[i11][i6] * (1.0d - d11)) + (dArr3[i13][i6] * d11));
                    i6++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d6, int i6) {
        double d7;
        double d8;
        double slope;
        double[] dArr = this.f360mT;
        int length = dArr.length;
        int i7 = 0;
        if (this.mExtrapolate) {
            double d9 = dArr[0];
            if (d6 <= d9) {
                d7 = this.f361mY[0][i6];
                d8 = d6 - d9;
                slope = getSlope(d9, i6);
            } else {
                int i8 = length - 1;
                double d10 = dArr[i8];
                if (d6 >= d10) {
                    d7 = this.f361mY[i8][i6];
                    d8 = d6 - d10;
                    slope = getSlope(d10, i6);
                }
            }
            return d7 + (d8 * slope);
        }
        if (d6 <= dArr[0]) {
            return this.f361mY[0][i6];
        }
        int i9 = length - 1;
        if (d6 >= dArr[i9]) {
            return this.f361mY[i9][i6];
        }
        while (i7 < length - 1) {
            double[] dArr2 = this.f360mT;
            double d11 = dArr2[i7];
            if (d6 == d11) {
                return this.f361mY[i7][i6];
            }
            int i10 = i7 + 1;
            double d12 = dArr2[i10];
            if (d6 < d12) {
                double d13 = (d6 - d11) / (d12 - d11);
                double[][] dArr3 = this.f361mY;
                return (dArr3[i7][i6] * (1.0d - d13)) + (dArr3[i10][i6] * d13);
            }
            i7 = i10;
        }
        return 0.0d;
    }
}
