package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;

/* loaded from: classes2.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f1311mT;
    private double mTotalLength;

    /* renamed from: mY */
    private double[][] f1312mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.f1311mT = dArr;
        this.f1312mY = dArr2;
        if (length <= 2) {
            return;
        }
        int i9 = 0;
        double d10 = 0.0d;
        while (true) {
            double d11 = d10;
            if (i9 >= dArr.length) {
                this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
                return;
            }
            double d12 = dArr2[i9][0];
            if (i9 > 0) {
                Math.hypot(d12 - d10, d12 - d11);
            }
            i9++;
            d10 = d12;
        }
    }

    private double getLength2D(double d10) {
        if (Double.isNaN(this.mTotalLength)) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double[] dArr = this.f1311mT;
        int length = dArr.length;
        if (d10 <= dArr[0]) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i9 = length - 1;
        if (d10 >= dArr[i9]) {
            return this.mTotalLength;
        }
        double dHypot = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i10 = 0;
        while (i10 < i9) {
            double[] dArr2 = this.f1312mY[i10];
            double d13 = dArr2[0];
            double d14 = dArr2[1];
            if (i10 > 0) {
                dHypot += Math.hypot(d13 - d11, d14 - d12);
            }
            double[] dArr3 = this.f1311mT;
            double d15 = dArr3[i10];
            if (d10 == d15) {
                return dHypot;
            }
            int i11 = i10 + 1;
            double d16 = dArr3[i11];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                double[][] dArr4 = this.f1312mY;
                double[] dArr5 = dArr4[i10];
                double d18 = dArr5[0];
                double[] dArr6 = dArr4[i11];
                double d19 = 1.0d - d17;
                return dHypot + Math.hypot(d14 - ((dArr5[1] * d19) + (dArr6[1] * d17)), d13 - ((d18 * d19) + (dArr6[0] * d17)));
            }
            i10 = i11;
            d11 = d13;
            d12 = d14;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d10, double[] dArr) {
        double[] dArr2 = this.f1311mT;
        int length = dArr2.length;
        int i9 = 0;
        int length2 = this.f1312mY[0].length;
        if (this.mExtrapolate) {
            double d11 = dArr2[0];
            if (d10 <= d11) {
                getSlope(d11, this.mSlopeTemp);
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.f1312mY[0][i10] + ((d10 - this.f1311mT[0]) * this.mSlopeTemp[i10]);
                }
                return;
            }
            int i11 = length - 1;
            double d12 = dArr2[i11];
            if (d10 >= d12) {
                getSlope(d12, this.mSlopeTemp);
                while (i9 < length2) {
                    dArr[i9] = this.f1312mY[i11][i9] + ((d10 - this.f1311mT[i11]) * this.mSlopeTemp[i9]);
                    i9++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f1312mY[0][i12];
                }
                return;
            }
            int i13 = length - 1;
            if (d10 >= dArr2[i13]) {
                while (i9 < length2) {
                    dArr[i9] = this.f1312mY[i13][i9];
                    i9++;
                }
                return;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d10 == this.f1311mT[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = this.f1312mY[i14][i15];
                }
            }
            double[] dArr3 = this.f1311mT;
            int i16 = i14 + 1;
            double d13 = dArr3[i16];
            if (d10 < d13) {
                double d14 = dArr3[i14];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i9 < length2) {
                    double[][] dArr4 = this.f1312mY;
                    dArr[i9] = (dArr4[i14][i9] * (1.0d - d15)) + (dArr4[i16][i9] * d15);
                    i9++;
                }
                return;
            }
            i14 = i16;
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
            double[] r0 = r12.f1311mT
            int r1 = r0.length
            double[][] r2 = r12.f1312mY
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
            double[] r4 = r12.f1311mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f1312mY
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
        return this.f1311mT;
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
            double[] r0 = r7.f1311mT
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
            double[] r0 = r7.f1311mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f1312mY
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
    public void getPos(double d10, float[] fArr) {
        double[] dArr = this.f1311mT;
        int length = dArr.length;
        int i9 = 0;
        int length2 = this.f1312mY[0].length;
        if (this.mExtrapolate) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                getSlope(d11, this.mSlopeTemp);
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) (this.f1312mY[0][i10] + ((d10 - this.f1311mT[0]) * this.mSlopeTemp[i10]));
                }
                return;
            }
            int i11 = length - 1;
            double d12 = dArr[i11];
            if (d10 >= d12) {
                getSlope(d12, this.mSlopeTemp);
                while (i9 < length2) {
                    fArr[i9] = (float) (this.f1312mY[i11][i9] + ((d10 - this.f1311mT[i11]) * this.mSlopeTemp[i9]));
                    i9++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f1312mY[0][i12];
                }
                return;
            }
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                while (i9 < length2) {
                    fArr[i9] = (float) this.f1312mY[i13][i9];
                    i9++;
                }
                return;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d10 == this.f1311mT[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) this.f1312mY[i14][i15];
                }
            }
            double[] dArr2 = this.f1311mT;
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d10 < d13) {
                double d14 = dArr2[i14];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i9 < length2) {
                    double[][] dArr3 = this.f1312mY;
                    fArr[i9] = (float) ((dArr3[i14][i9] * (1.0d - d15)) + (dArr3[i16][i9] * d15));
                    i9++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d10, int i9) {
        double d11;
        double d12;
        double slope;
        double[] dArr = this.f1311mT;
        int length = dArr.length;
        int i10 = 0;
        if (this.mExtrapolate) {
            double d13 = dArr[0];
            if (d10 <= d13) {
                d11 = this.f1312mY[0][i9];
                d12 = d10 - d13;
                slope = getSlope(d13, i9);
            } else {
                int i11 = length - 1;
                double d14 = dArr[i11];
                if (d10 >= d14) {
                    d11 = this.f1312mY[i11][i9];
                    d12 = d10 - d14;
                    slope = getSlope(d14, i9);
                }
            }
            return d11 + (d12 * slope);
        }
        if (d10 <= dArr[0]) {
            return this.f1312mY[0][i9];
        }
        int i12 = length - 1;
        if (d10 >= dArr[i12]) {
            return this.f1312mY[i12][i9];
        }
        while (i10 < length - 1) {
            double[] dArr2 = this.f1311mT;
            double d15 = dArr2[i10];
            if (d10 == d15) {
                return this.f1312mY[i10][i9];
            }
            int i13 = i10 + 1;
            double d16 = dArr2[i13];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                double[][] dArr3 = this.f1312mY;
                return (dArr3[i10][i9] * (1.0d - d17)) + (dArr3[i13][i9] * d17);
            }
            i10 = i13;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
