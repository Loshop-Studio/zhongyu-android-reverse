package androidx.constraintlayout.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private final double[] mTime;

    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
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

        public Arc(int i4, double d4, double d5, double d6, double d7, double d8, double d9) {
            this.linear = false;
            this.mVertical = i4 == 1;
            this.mTime1 = d4;
            this.mTime2 = d5;
            this.mOneOverDeltaTime = 1.0d / (d5 - d4);
            if (3 == i4) {
                this.linear = true;
            }
            double d10 = d8 - d6;
            double d11 = d9 - d7;
            if (!this.linear && Math.abs(d10) >= EPSILON && Math.abs(d11) >= EPSILON) {
                this.mLut = new double[101];
                boolean z3 = this.mVertical;
                this.mEllipseA = d10 * (z3 ? -1 : 1);
                this.mEllipseB = d11 * (z3 ? 1 : -1);
                this.mEllipseCenterX = z3 ? d8 : d6;
                this.mEllipseCenterY = z3 ? d7 : d9;
                buildTable(d6, d7, d8, d9);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d6;
            this.mX2 = d8;
            this.mY1 = d7;
            this.mY2 = d9;
            double dHypot = Math.hypot(d11, d10);
            this.mArcDistance = dHypot;
            this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
            double d12 = this.mTime2;
            double d13 = this.mTime1;
            this.mEllipseCenterX = d10 / (d12 - d13);
            this.mEllipseCenterY = d11 / (d12 - d13);
        }

        private void buildTable(double d4, double d5, double d6, double d7) {
            double dHypot;
            double d8 = d6 - d4;
            double d9 = d5 - d7;
            int i4 = 0;
            double d10 = 0.0d;
            double d11 = 0.0d;
            double d12 = 0.0d;
            while (true) {
                if (i4 >= ourPercent.length) {
                    break;
                }
                double d13 = d10;
                double radians = Math.toRadians((i4 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d8;
                double dCos = Math.cos(radians) * d9;
                if (i4 > 0) {
                    dHypot = Math.hypot(dSin - d11, dCos - d12) + d13;
                    ourPercent[i4] = dHypot;
                } else {
                    dHypot = d13;
                }
                i4++;
                d12 = dCos;
                d10 = dHypot;
                d11 = dSin;
            }
            double d14 = d10;
            this.mArcDistance = d14;
            int i5 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] / d14;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.mLut.length) {
                    return;
                }
                double length = i6 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(ourPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i6] = iBinarySearch / (ourPercent.length - 1);
                } else if (iBinarySearch == -1) {
                    this.mLut[i6] = 0.0d;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    double[] dArr2 = ourPercent;
                    double d15 = dArr2[i8];
                    this.mLut[i6] = (i8 + ((length - d15) / (dArr2[i7 - 1] - d15))) / (dArr2.length - 1);
                }
                i6++;
            }
        }

        public double getDX() {
            double d4 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d4, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d4 = -d4;
            }
            return d4 * dHypot;
        }

        public double getDY() {
            double d4 = this.mEllipseA * this.mTmpCosAngle;
            double d5 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d4, d5);
            return this.mVertical ? (-d5) * dHypot : d5 * dHypot;
        }

        public double getLinearDX(double d4) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d4) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d4) {
            double d5 = (d4 - this.mTime1) * this.mOneOverDeltaTime;
            double d6 = this.mX1;
            return d6 + (d5 * (this.mX2 - d6));
        }

        public double getLinearY(double d4) {
            double d5 = (d4 - this.mTime1) * this.mOneOverDeltaTime;
            double d6 = this.mY1;
            return d6 + (d5 * (this.mY2 - d6));
        }

        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d4) {
            if (d4 <= 0.0d) {
                return 0.0d;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d4 * (dArr.length - 1);
            int i4 = (int) length;
            double d5 = length - i4;
            double d6 = dArr[i4];
            return d6 + (d5 * (dArr[i4 + 1] - d6));
        }

        public void setPoint(double d4) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d4 : d4 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(dLookup);
            this.mTmpCosAngle = Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.mTime = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = new androidx.constraintlayout.motion.utils.ArcCurveFit.Arc[r2]
            r0.mArcs = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L4d
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            r10 = 2
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d4, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d5 = arcArr[0].mTime1;
        if (d4 < d5) {
            d4 = d5;
        }
        if (d4 > arcArr[arcArr.length - 1].mTime2) {
            d4 = arcArr[arcArr.length - 1].mTime2;
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i4 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i4];
            if (d4 <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearX(d4);
                    dArr[1] = this.mArcs[i4].getLinearY(d4);
                    return;
                } else {
                    arc.setPoint(d4);
                    dArr[0] = this.mArcs[i4].getX();
                    dArr[1] = this.mArcs[i4].getY();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getSlope(double d4, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d5 = arcArr[0].mTime1;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > arcArr[arcArr.length - 1].mTime2) {
            d4 = arcArr[arcArr.length - 1].mTime2;
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i4 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i4];
            if (d4 <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearDX(d4);
                    dArr[1] = this.mArcs[i4].getLinearDY(d4);
                    return;
                } else {
                    arc.setPoint(d4);
                    dArr[0] = this.mArcs[i4].getDX();
                    dArr[1] = this.mArcs[i4].getDY();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d4, float[] fArr) {
        Arc[] arcArr = this.mArcs;
        double d5 = arcArr[0].mTime1;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > arcArr[arcArr.length - 1].mTime2) {
            d4 = arcArr[arcArr.length - 1].mTime2;
        }
        int i4 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i4 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i4];
            if (d4 <= arc.mTime2) {
                if (arc.linear) {
                    fArr[0] = (float) arc.getLinearX(d4);
                    fArr[1] = (float) this.mArcs[i4].getLinearY(d4);
                    return;
                } else {
                    arc.setPoint(d4);
                    fArr[0] = (float) this.mArcs[i4].getX();
                    fArr[1] = (float) this.mArcs[i4].getY();
                    return;
                }
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getSlope(double d4, int i4) {
        Arc[] arcArr = this.mArcs;
        int i5 = 0;
        double d5 = arcArr[0].mTime1;
        if (d4 < d5) {
            d4 = d5;
        }
        if (d4 > arcArr[arcArr.length - 1].mTime2) {
            d4 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i5 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i5];
            if (d4 <= arc.mTime2) {
                if (arc.linear) {
                    if (i4 == 0) {
                        return arc.getLinearDX(d4);
                    }
                    return arc.getLinearDY(d4);
                }
                arc.setPoint(d4);
                if (i4 == 0) {
                    return this.mArcs[i5].getDX();
                }
                return this.mArcs[i5].getDY();
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getPos(double d4, int i4) {
        Arc[] arcArr = this.mArcs;
        int i5 = 0;
        double d5 = arcArr[0].mTime1;
        if (d4 < d5) {
            d4 = d5;
        } else if (d4 > arcArr[arcArr.length - 1].mTime2) {
            d4 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i5 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i5];
            if (d4 <= arc.mTime2) {
                if (arc.linear) {
                    if (i4 == 0) {
                        return arc.getLinearX(d4);
                    }
                    return arc.getLinearY(d4);
                }
                arc.setPoint(d4);
                if (i4 == 0) {
                    return this.mArcs[i5].getX();
                }
                return this.mArcs[i5].getY();
            }
            i5++;
        }
    }
}
