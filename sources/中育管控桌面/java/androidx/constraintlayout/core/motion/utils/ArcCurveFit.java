package androidx.constraintlayout.core.motion.utils;

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

        public Arc(int i6, double d6, double d7, double d8, double d9, double d10, double d11) {
            this.mLinear = false;
            double d12 = d10 - d8;
            double d13 = d11 - d9;
            if (i6 == 1) {
                this.mVertical = true;
            } else if (i6 == 4) {
                this.mVertical = d13 > 0.0d;
            } else if (i6 != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d13 < 0.0d;
            }
            this.mTime1 = d6;
            this.mTime2 = d7;
            this.mOneOverDeltaTime = 1.0d / (d7 - d6);
            if (3 == i6) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d12) >= EPSILON && Math.abs(d13) >= EPSILON) {
                this.mLut = new double[101];
                boolean z6 = this.mVertical;
                this.mEllipseA = d12 * (z6 ? -1 : 1);
                this.mEllipseB = d13 * (z6 ? 1 : -1);
                this.mEllipseCenterX = z6 ? d10 : d8;
                this.mEllipseCenterY = z6 ? d9 : d11;
                buildTable(d8, d9, d10, d11);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d8;
            this.mX2 = d10;
            this.mY1 = d9;
            this.mY2 = d11;
            double dHypot = Math.hypot(d13, d12);
            this.mArcDistance = dHypot;
            this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
            double d14 = this.mTime2;
            double d15 = this.mTime1;
            this.mEllipseCenterX = d12 / (d14 - d15);
            this.mEllipseCenterY = d13 / (d14 - d15);
        }

        private void buildTable(double d6, double d7, double d8, double d9) {
            double d10 = d8 - d6;
            double d11 = d7 - d9;
            int i6 = 0;
            double dHypot = 0.0d;
            double d12 = 0.0d;
            double d13 = 0.0d;
            while (true) {
                if (i6 >= sOurPercent.length) {
                    break;
                }
                int i7 = i6;
                double radians = Math.toRadians((i6 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d10;
                double dCos = Math.cos(radians) * d11;
                if (i7 > 0) {
                    dHypot += Math.hypot(dSin - d12, dCos - d13);
                    sOurPercent[i7] = dHypot;
                }
                i6 = i7 + 1;
                d12 = dSin;
                d13 = dCos;
            }
            this.mArcDistance = dHypot;
            int i8 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i8 >= dArr.length) {
                    break;
                }
                dArr[i8] = dArr[i8] / dHypot;
                i8++;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.mLut.length) {
                    return;
                }
                double length = i9 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(sOurPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i9] = iBinarySearch / (sOurPercent.length - 1);
                } else if (iBinarySearch == -1) {
                    this.mLut[i9] = 0.0d;
                } else {
                    int i10 = -iBinarySearch;
                    int i11 = i10 - 2;
                    double[] dArr2 = sOurPercent;
                    double d14 = dArr2[i11];
                    this.mLut[i9] = (i11 + ((length - d14) / (dArr2[i10 - 1] - d14))) / (dArr2.length - 1);
                }
                i9++;
            }
        }

        public double getDX() {
            double d6 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d6, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d6) * dHypot : d6 * dHypot;
        }

        public double getDY() {
            double d6 = this.mEllipseA * this.mTmpCosAngle;
            double d7 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d6, d7);
            return this.mVertical ? (-d7) * dHypot : d7 * dHypot;
        }

        public double getLinearDX(double d6) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d6) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d6) {
            double d7 = (d6 - this.mTime1) * this.mOneOverDeltaTime;
            double d8 = this.mX1;
            return d8 + (d7 * (this.mX2 - d8));
        }

        public double getLinearY(double d6) {
            double d7 = (d6 - this.mTime1) * this.mOneOverDeltaTime;
            double d8 = this.mY1;
            return d8 + (d7 * (this.mY2 - d8));
        }

        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d6) {
            if (d6 <= 0.0d) {
                return 0.0d;
            }
            if (d6 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d6 * (dArr.length - 1);
            int i6 = (int) length;
            double d7 = length - i6;
            double d8 = dArr[i6];
            return d8 + (d7 * (dArr[i6 + 1] - d8));
        }

        public void setPoint(double d6) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d6 : d6 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
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
    public void getPos(double d6, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d7 = arc.mTime1;
            if (d6 < d7) {
                double d8 = d6 - d7;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d7) + (this.mArcs[0].getLinearDX(d7) * d8);
                    dArr[1] = this.mArcs[0].getLinearY(d7) + (d8 * this.mArcs[0].getLinearDY(d7));
                    return;
                } else {
                    arc.setPoint(d7);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d8);
                    dArr[1] = this.mArcs[0].getY() + (d8 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d6 > arcArr[arcArr.length - 1].mTime2) {
                double d9 = arcArr[arcArr.length - 1].mTime2;
                double d10 = d6 - d9;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d9) + (this.mArcs[length].getLinearDX(d9) * d10);
                    dArr[1] = this.mArcs[length].getLinearY(d9) + (d10 * this.mArcs[length].getLinearDY(d9));
                    return;
                } else {
                    arc2.setPoint(d6);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d10);
                    dArr[1] = this.mArcs[length].getY() + (d10 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d11 = arcArr2[0].mTime1;
            if (d6 < d11) {
                d6 = d11;
            }
            if (d6 > arcArr2[arcArr2.length - 1].mTime2) {
                d6 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i6 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i6 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i6];
            if (d6 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d6);
                    dArr[1] = this.mArcs[i6].getLinearY(d6);
                    return;
                } else {
                    arc3.setPoint(d6);
                    dArr[0] = this.mArcs[i6].getX();
                    dArr[1] = this.mArcs[i6].getY();
                    return;
                }
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d6, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d7 = arcArr[0].mTime1;
        if (d6 < d7) {
            d6 = d7;
        } else if (d6 > arcArr[arcArr.length - 1].mTime2) {
            d6 = arcArr[arcArr.length - 1].mTime2;
        }
        int i6 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i6 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i6];
            if (d6 <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d6);
                    dArr[1] = this.mArcs[i6].getLinearDY(d6);
                    return;
                } else {
                    arc.setPoint(d6);
                    dArr[0] = this.mArcs[i6].getDX();
                    dArr[1] = this.mArcs[i6].getDY();
                    return;
                }
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d6, int i6) {
        Arc[] arcArr = this.mArcs;
        int i7 = 0;
        double d7 = arcArr[0].mTime1;
        if (d6 < d7) {
            d6 = d7;
        }
        if (d6 > arcArr[arcArr.length - 1].mTime2) {
            d6 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i7 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i7];
            if (d6 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i6 == 0) {
                        return arc.getLinearDX(d6);
                    }
                    return arc.getLinearDY(d6);
                }
                arc.setPoint(d6);
                if (i6 == 0) {
                    return this.mArcs[i7].getDX();
                }
                return this.mArcs[i7].getDY();
            }
            i7++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d6, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d7 = arc.mTime1;
            if (d6 < d7) {
                double d8 = d6 - d7;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d7) + (this.mArcs[0].getLinearDX(d7) * d8));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d7) + (d8 * this.mArcs[0].getLinearDY(d7)));
                    return;
                } else {
                    arc.setPoint(d7);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d8));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d8 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d6 > arcArr[arcArr.length - 1].mTime2) {
                double d9 = arcArr[arcArr.length - 1].mTime2;
                double d10 = d6 - d9;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d9) + (this.mArcs[length].getLinearDX(d9) * d10));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d9) + (d10 * this.mArcs[length].getLinearDY(d9)));
                    return;
                } else {
                    arc2.setPoint(d6);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d11 = arcArr2[0].mTime1;
            if (d6 < d11) {
                d6 = d11;
            } else if (d6 > arcArr2[arcArr2.length - 1].mTime2) {
                d6 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i6 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i6 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i6];
            if (d6 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d6);
                    fArr[1] = (float) this.mArcs[i6].getLinearY(d6);
                    return;
                } else {
                    arc3.setPoint(d6);
                    fArr[0] = (float) this.mArcs[i6].getX();
                    fArr[1] = (float) this.mArcs[i6].getY();
                    return;
                }
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d6, int i6) {
        double linearY;
        double linearDY;
        double y6;
        double dy;
        double linearY2;
        double linearDY2;
        int i7 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d7 = arc.mTime1;
            if (d6 < d7) {
                double d8 = d6 - d7;
                if (arc.mLinear) {
                    if (i6 == 0) {
                        linearY2 = arc.getLinearX(d7);
                        linearDY2 = this.mArcs[0].getLinearDX(d7);
                    } else {
                        linearY2 = arc.getLinearY(d7);
                        linearDY2 = this.mArcs[0].getLinearDY(d7);
                    }
                    return linearY2 + (d8 * linearDY2);
                }
                arc.setPoint(d7);
                if (i6 == 0) {
                    y6 = this.mArcs[0].getX();
                    dy = this.mArcs[0].getDX();
                } else {
                    y6 = this.mArcs[0].getY();
                    dy = this.mArcs[0].getDY();
                }
                return y6 + (d8 * dy);
            }
            if (d6 > arcArr[arcArr.length - 1].mTime2) {
                double d9 = arcArr[arcArr.length - 1].mTime2;
                double d10 = d6 - d9;
                int length = arcArr.length - 1;
                if (i6 == 0) {
                    linearY = arcArr[length].getLinearX(d9);
                    linearDY = this.mArcs[length].getLinearDX(d9);
                } else {
                    linearY = arcArr[length].getLinearY(d9);
                    linearDY = this.mArcs[length].getLinearDY(d9);
                }
                return linearY + (d10 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d11 = arcArr2[0].mTime1;
            if (d6 < d11) {
                d6 = d11;
            } else if (d6 > arcArr2[arcArr2.length - 1].mTime2) {
                d6 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i7 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i7];
            if (d6 <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i6 == 0) {
                        return arc2.getLinearX(d6);
                    }
                    return arc2.getLinearY(d6);
                }
                arc2.setPoint(d6);
                if (i6 == 0) {
                    return this.mArcs[i7].getX();
                }
                return this.mArcs[i7].getY();
            }
            i7++;
        }
    }
}
