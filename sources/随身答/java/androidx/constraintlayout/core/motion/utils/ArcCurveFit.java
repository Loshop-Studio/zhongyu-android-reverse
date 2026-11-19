package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        boolean mLinear;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public Arc(int i9, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.mLinear = false;
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (i9 == 1) {
                this.mVertical = true;
            } else if (i9 == 4) {
                this.mVertical = d17 > AudioStats.AUDIO_AMPLITUDE_NONE;
            } else if (i9 != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d17 < AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            this.mTime1 = d10;
            this.mTime2 = d11;
            this.mOneOverDeltaTime = 1.0d / (d11 - d10);
            if (3 == i9) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d16) >= EPSILON && Math.abs(d17) >= EPSILON) {
                this.mLut = new double[101];
                boolean z9 = this.mVertical;
                this.mEllipseA = d16 * (z9 ? -1 : 1);
                this.mEllipseB = d17 * (z9 ? 1 : -1);
                this.mEllipseCenterX = z9 ? d14 : d12;
                this.mEllipseCenterY = z9 ? d13 : d15;
                buildTable(d12, d13, d14, d15);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d12;
            this.mX2 = d14;
            this.mY1 = d13;
            this.mY2 = d15;
            double dHypot = Math.hypot(d17, d16);
            this.mArcDistance = dHypot;
            this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
            double d18 = this.mTime2;
            double d19 = this.mTime1;
            this.mEllipseCenterX = d16 / (d18 - d19);
            this.mEllipseCenterY = d17 / (d18 - d19);
        }

        private void buildTable(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i9 = 0;
            double dHypot = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d16 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d17 = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (true) {
                if (i9 >= sOurPercent.length) {
                    break;
                }
                int i10 = i9;
                double radians = Math.toRadians((i9 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i10 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    sOurPercent[i10] = dHypot;
                }
                i9 = i10 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.mArcDistance = dHypot;
            int i11 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] / dHypot;
                i11++;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.mLut.length) {
                    return;
                }
                double length = i12 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(sOurPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i12] = iBinarySearch / (sOurPercent.length - 1);
                } else if (iBinarySearch == -1) {
                    this.mLut[i12] = 0.0d;
                } else {
                    int i13 = -iBinarySearch;
                    int i14 = i13 - 2;
                    double[] dArr2 = sOurPercent;
                    double d18 = dArr2[i14];
                    this.mLut[i12] = (i14 + ((length - d18) / (dArr2[i13 - 1] - d18))) / (dArr2.length - 1);
                }
                i12++;
            }
        }

        public double getDX() {
            double d10 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d10, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d10) * dHypot : d10 * dHypot;
        }

        public double getDY() {
            double d10 = this.mEllipseA * this.mTmpCosAngle;
            double d11 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d10, d11);
            return this.mVertical ? (-d11) * dHypot : d11 * dHypot;
        }

        public double getLinearDX(double d10) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d10) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d10) {
            double d11 = (d10 - this.mTime1) * this.mOneOverDeltaTime;
            double d12 = this.mX1;
            return d12 + (d11 * (this.mX2 - d12));
        }

        public double getLinearY(double d10) {
            double d11 = (d10 - this.mTime1) * this.mOneOverDeltaTime;
            double d12 = this.mY1;
            return d12 + (d11 * (this.mY2 - d12));
        }

        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d10) {
            if (d10 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d10 * (dArr.length - 1);
            int i9 = (int) length;
            double d11 = length - i9;
            double d12 = dArr[i9];
            return d12 + (d11 * (dArr[i9 + 1] - d12));
        }

        public void setPoint(double d10) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d10 : d10 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(dLookup);
            this.mTmpCosAngle = Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r24, double[] r25, double[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L5b
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L38
            if (r8 == r2) goto L36
            r10 = 2
            if (r8 == r10) goto L34
            if (r8 == r9) goto L2f
            r9 = 4
            if (r8 == r9) goto L38
            r9 = 5
            if (r8 == r9) goto L38
            r9 = r6
            goto L38
        L2f:
            if (r5 != r2) goto L36
            goto L34
        L32:
            r9 = r5
            goto L38
        L34:
            r5 = r10
            goto L32
        L36:
            r5 = r2
            goto L32
        L38:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r8 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r3]
            r17 = r14[r2]
            r14 = r26[r6]
            r19 = r14[r3]
            r21 = r14[r2]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d10, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d11 = arc.mTime1;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d11) + (this.mArcs[0].getLinearDX(d11) * d12);
                    dArr[1] = this.mArcs[0].getLinearY(d11) + (d12 * this.mArcs[0].getLinearDY(d11));
                    return;
                } else {
                    arc.setPoint(d11);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d12);
                    dArr[1] = this.mArcs[0].getY() + (d12 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d10 > arcArr[arcArr.length - 1].mTime2) {
                double d13 = arcArr[arcArr.length - 1].mTime2;
                double d14 = d10 - d13;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d13) + (this.mArcs[length].getLinearDX(d13) * d14);
                    dArr[1] = this.mArcs[length].getLinearY(d13) + (d14 * this.mArcs[length].getLinearDY(d13));
                    return;
                } else {
                    arc2.setPoint(d10);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d14);
                    dArr[1] = this.mArcs[length].getY() + (d14 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d15 = arcArr2[0].mTime1;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > arcArr2[arcArr2.length - 1].mTime2) {
                d10 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i9 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i9 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i9];
            if (d10 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d10);
                    dArr[1] = this.mArcs[i9].getLinearY(d10);
                    return;
                } else {
                    arc3.setPoint(d10);
                    dArr[0] = this.mArcs[i9].getX();
                    dArr[1] = this.mArcs[i9].getY();
                    return;
                }
            }
            i9++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d10, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d11 = arcArr[0].mTime1;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > arcArr[arcArr.length - 1].mTime2) {
            d10 = arcArr[arcArr.length - 1].mTime2;
        }
        int i9 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i9 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i9];
            if (d10 <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d10);
                    dArr[1] = this.mArcs[i9].getLinearDY(d10);
                    return;
                } else {
                    arc.setPoint(d10);
                    dArr[0] = this.mArcs[i9].getDX();
                    dArr[1] = this.mArcs[i9].getDY();
                    return;
                }
            }
            i9++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d10, int i9) {
        Arc[] arcArr = this.mArcs;
        int i10 = 0;
        double d11 = arcArr[0].mTime1;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > arcArr[arcArr.length - 1].mTime2) {
            d10 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i10 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i10];
            if (d10 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i9 == 0) {
                        return arc.getLinearDX(d10);
                    }
                    return arc.getLinearDY(d10);
                }
                arc.setPoint(d10);
                if (i9 == 0) {
                    return this.mArcs[i10].getDX();
                }
                return this.mArcs[i10].getDY();
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d10, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d11 = arc.mTime1;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d11) + (this.mArcs[0].getLinearDX(d11) * d12));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d11) + (d12 * this.mArcs[0].getLinearDY(d11)));
                    return;
                } else {
                    arc.setPoint(d11);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d12));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d12 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d10 > arcArr[arcArr.length - 1].mTime2) {
                double d13 = arcArr[arcArr.length - 1].mTime2;
                double d14 = d10 - d13;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d13) + (this.mArcs[length].getLinearDX(d13) * d14));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d13) + (d14 * this.mArcs[length].getLinearDY(d13)));
                    return;
                } else {
                    arc2.setPoint(d10);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d15 = arcArr2[0].mTime1;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > arcArr2[arcArr2.length - 1].mTime2) {
                d10 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i9 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i9 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i9];
            if (d10 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d10);
                    fArr[1] = (float) this.mArcs[i9].getLinearY(d10);
                    return;
                } else {
                    arc3.setPoint(d10);
                    fArr[0] = (float) this.mArcs[i9].getX();
                    fArr[1] = (float) this.mArcs[i9].getY();
                    return;
                }
            }
            i9++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d10, int i9) {
        double linearY;
        double linearDY;
        double y9;
        double dy;
        double linearY2;
        double linearDY2;
        int i10 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d11 = arc.mTime1;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (arc.mLinear) {
                    if (i9 == 0) {
                        linearY2 = arc.getLinearX(d11);
                        linearDY2 = this.mArcs[0].getLinearDX(d11);
                    } else {
                        linearY2 = arc.getLinearY(d11);
                        linearDY2 = this.mArcs[0].getLinearDY(d11);
                    }
                    return linearY2 + (d12 * linearDY2);
                }
                arc.setPoint(d11);
                if (i9 == 0) {
                    y9 = this.mArcs[0].getX();
                    dy = this.mArcs[0].getDX();
                } else {
                    y9 = this.mArcs[0].getY();
                    dy = this.mArcs[0].getDY();
                }
                return y9 + (d12 * dy);
            }
            if (d10 > arcArr[arcArr.length - 1].mTime2) {
                double d13 = arcArr[arcArr.length - 1].mTime2;
                double d14 = d10 - d13;
                int length = arcArr.length - 1;
                if (i9 == 0) {
                    linearY = arcArr[length].getLinearX(d13);
                    linearDY = this.mArcs[length].getLinearDX(d13);
                } else {
                    linearY = arcArr[length].getLinearY(d13);
                    linearDY = this.mArcs[length].getLinearDY(d13);
                }
                return linearY + (d14 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d15 = arcArr2[0].mTime1;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > arcArr2[arcArr2.length - 1].mTime2) {
                d10 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i10 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i10];
            if (d10 <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i9 == 0) {
                        return arc2.getLinearX(d10);
                    }
                    return arc2.getLinearY(d10);
                }
                arc2.setPoint(d10);
                if (i9 == 0) {
                    return this.mArcs[i10].getX();
                }
                return this.mArcs[i10].getY();
            }
            i10++;
        }
    }
}
