package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;

/* loaded from: classes2.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f954mT;
    private double mTotalLength;

    /* renamed from: mY */
    private double[][] f955mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.f954mT = dArr;
        this.f955mY = dArr2;
        if (length <= 2) {
            return;
        }
        int i = 0;
        double d9 = 0.0d;
        while (true) {
            double d10 = d9;
            if (i >= dArr.length) {
                this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
                return;
            }
            double d11 = dArr2[i][0];
            if (i > 0) {
                Math.hypot(d11 - d9, d11 - d10);
            }
            i++;
            d9 = d11;
        }
    }

    private double getLength2D(double d9) {
        if (Double.isNaN(this.mTotalLength)) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double[] dArr = this.f954mT;
        int length = dArr.length;
        if (d9 <= dArr[0]) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i = length - 1;
        if (d9 >= dArr[i]) {
            return this.mTotalLength;
        }
        double dHypot = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i8 = 0;
        while (i8 < i) {
            double[] dArr2 = this.f955mY[i8];
            double d12 = dArr2[0];
            double d13 = dArr2[1];
            if (i8 > 0) {
                dHypot += Math.hypot(d12 - d10, d13 - d11);
            }
            double[] dArr3 = this.f954mT;
            double d14 = dArr3[i8];
            if (d9 == d14) {
                return dHypot;
            }
            int i9 = i8 + 1;
            double d15 = dArr3[i9];
            if (d9 < d15) {
                double d16 = (d9 - d14) / (d15 - d14);
                double[][] dArr4 = this.f955mY;
                double[] dArr5 = dArr4[i8];
                double d17 = dArr5[0];
                double[] dArr6 = dArr4[i9];
                double d18 = dArr6[0];
                double d19 = 1.0d - d16;
                return Math.hypot(d13 - ((dArr6[1] * d16) + (dArr5[1] * d19)), d12 - ((d18 * d16) + (d17 * d19))) + dHypot;
            }
            i8 = i9;
            d10 = d12;
            d11 = d13;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d9, double[] dArr) {
        double[] dArr2 = this.f954mT;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f955mY[0].length;
        if (this.mExtrapolate) {
            double d10 = dArr2[0];
            if (d9 <= d10) {
                getSlope(d10, this.mSlopeTemp);
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = ((d9 - this.f954mT[0]) * this.mSlopeTemp[i8]) + this.f955mY[0][i8];
                }
                return;
            }
            int i9 = length - 1;
            double d11 = dArr2[i9];
            if (d9 >= d11) {
                getSlope(d11, this.mSlopeTemp);
                while (i < length2) {
                    dArr[i] = ((d9 - this.f954mT[i9]) * this.mSlopeTemp[i]) + this.f955mY[i9][i];
                    i++;
                }
                return;
            }
        } else {
            if (d9 <= dArr2[0]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.f955mY[0][i10];
                }
                return;
            }
            int i11 = length - 1;
            if (d9 >= dArr2[i11]) {
                while (i < length2) {
                    dArr[i] = this.f955mY[i11][i];
                    i++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d9 == this.f954mT[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f955mY[i12][i13];
                }
            }
            double[] dArr3 = this.f954mT;
            int i14 = i12 + 1;
            double d12 = dArr3[i14];
            if (d9 < d12) {
                double d13 = dArr3[i12];
                double d14 = (d9 - d13) / (d12 - d13);
                while (i < length2) {
                    double[][] dArr4 = this.f955mY;
                    dArr[i] = (dArr4[i14][i] * d14) + ((1.0d - d14) * dArr4[i12][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
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
            double[] r0 = r12.f954mT
            int r1 = r0.length
            double[][] r2 = r12.f955mY
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
            double[] r4 = r12.f954mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f955mY
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
        return this.f954mT;
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
            double[] r0 = r7.f954mT
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
            double[] r0 = r7.f954mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f955mY
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
    public void getPos(double d9, float[] fArr) {
        double[] dArr = this.f954mT;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f955mY[0].length;
        if (this.mExtrapolate) {
            double d10 = dArr[0];
            if (d9 <= d10) {
                getSlope(d10, this.mSlopeTemp);
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) (((d9 - this.f954mT[0]) * this.mSlopeTemp[i8]) + this.f955mY[0][i8]);
                }
                return;
            }
            int i9 = length - 1;
            double d11 = dArr[i9];
            if (d9 >= d11) {
                getSlope(d11, this.mSlopeTemp);
                while (i < length2) {
                    fArr[i] = (float) (((d9 - this.f954mT[i9]) * this.mSlopeTemp[i]) + this.f955mY[i9][i]);
                    i++;
                }
                return;
            }
        } else {
            if (d9 <= dArr[0]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.f955mY[0][i10];
                }
                return;
            }
            int i11 = length - 1;
            if (d9 >= dArr[i11]) {
                while (i < length2) {
                    fArr[i] = (float) this.f955mY[i11][i];
                    i++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d9 == this.f954mT[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f955mY[i12][i13];
                }
            }
            double[] dArr2 = this.f954mT;
            int i14 = i12 + 1;
            double d12 = dArr2[i14];
            if (d9 < d12) {
                double d13 = dArr2[i12];
                double d14 = (d9 - d13) / (d12 - d13);
                while (i < length2) {
                    double[][] dArr3 = this.f955mY;
                    fArr[i] = (float) ((dArr3[i14][i] * d14) + ((1.0d - d14) * dArr3[i12][i]));
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d9, int i) {
        double d10;
        double d11;
        double slope;
        double[] dArr = this.f954mT;
        int length = dArr.length;
        int i8 = 0;
        if (this.mExtrapolate) {
            double d12 = dArr[0];
            if (d9 <= d12) {
                d10 = this.f955mY[0][i];
                d11 = d9 - d12;
                slope = getSlope(d12, i);
            } else {
                int i9 = length - 1;
                double d13 = dArr[i9];
                if (d9 >= d13) {
                    d10 = this.f955mY[i9][i];
                    d11 = d9 - d13;
                    slope = getSlope(d13, i);
                }
            }
            return (slope * d11) + d10;
        }
        if (d9 <= dArr[0]) {
            return this.f955mY[0][i];
        }
        int i10 = length - 1;
        if (d9 >= dArr[i10]) {
            return this.f955mY[i10][i];
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f954mT;
            double d14 = dArr2[i8];
            if (d9 == d14) {
                return this.f955mY[i8][i];
            }
            int i11 = i8 + 1;
            double d15 = dArr2[i11];
            if (d9 < d15) {
                double d16 = (d9 - d14) / (d15 - d14);
                double[][] dArr3 = this.f955mY;
                return (dArr3[i11][i] * d16) + ((1.0d - d16) * dArr3[i8][i]);
            }
            i8 = i11;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
