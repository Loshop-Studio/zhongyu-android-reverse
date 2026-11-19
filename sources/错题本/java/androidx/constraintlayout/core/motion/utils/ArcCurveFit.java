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

        public Arc(int i, double d9, double d10, double d11, double d12, double d13, double d14) {
            this.mLinear = false;
            double d15 = d13 - d11;
            double d16 = d14 - d12;
            if (i == 1) {
                this.mVertical = true;
            } else if (i == 4) {
                this.mVertical = d16 > AudioStats.AUDIO_AMPLITUDE_NONE;
            } else if (i != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d16 < AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            this.mTime1 = d9;
            this.mTime2 = d10;
            this.mOneOverDeltaTime = 1.0d / (d10 - d9);
            if (3 == i) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d15) >= EPSILON && Math.abs(d16) >= EPSILON) {
                this.mLut = new double[TypedValues.TYPE_TARGET];
                boolean z8 = this.mVertical;
                this.mEllipseA = d15 * (z8 ? -1 : 1);
                this.mEllipseB = d16 * (z8 ? 1 : -1);
                this.mEllipseCenterX = z8 ? d13 : d11;
                this.mEllipseCenterY = z8 ? d12 : d14;
                buildTable(d11, d12, d13, d14);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d11;
            this.mX2 = d13;
            this.mY1 = d12;
            this.mY2 = d14;
            double dHypot = Math.hypot(d16, d15);
            this.mArcDistance = dHypot;
            this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
            double d17 = this.mTime2;
            double d18 = this.mTime1;
            this.mEllipseCenterX = d15 / (d17 - d18);
            this.mEllipseCenterY = d16 / (d17 - d18);
        }

        private void buildTable(double d9, double d10, double d11, double d12) {
            double d13 = d11 - d9;
            double d14 = d10 - d12;
            int i = 0;
            double dHypot = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d15 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d16 = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (true) {
                if (i >= sOurPercent.length) {
                    break;
                }
                int i8 = i;
                double radians = Math.toRadians((i * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d13;
                double dCos = Math.cos(radians) * d14;
                if (i8 > 0) {
                    dHypot += Math.hypot(dSin - d15, dCos - d16);
                    sOurPercent[i8] = dHypot;
                }
                i = i8 + 1;
                d15 = dSin;
                d16 = dCos;
            }
            this.mArcDistance = dHypot;
            int i9 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i9 >= dArr.length) {
                    break;
                }
                dArr[i9] = dArr[i9] / dHypot;
                i9++;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.mLut.length) {
                    return;
                }
                double length = i10 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(sOurPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i10] = iBinarySearch / (sOurPercent.length - 1);
                } else if (iBinarySearch == -1) {
                    this.mLut[i10] = 0.0d;
                } else {
                    int i11 = -iBinarySearch;
                    int i12 = i11 - 2;
                    double[] dArr2 = sOurPercent;
                    double d17 = dArr2[i12];
                    this.mLut[i10] = (((length - d17) / (dArr2[i11 - 1] - d17)) + i12) / (dArr2.length - 1);
                }
                i10++;
            }
        }

        public double getDX() {
            double d9 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d9, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d9) * dHypot : d9 * dHypot;
        }

        public double getDY() {
            double d9 = this.mEllipseA * this.mTmpCosAngle;
            double d10 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d9, d10);
            return this.mVertical ? (-d10) * dHypot : d10 * dHypot;
        }

        public double getLinearDX(double d9) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d9) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d9) {
            double d10 = (d9 - this.mTime1) * this.mOneOverDeltaTime;
            double d11 = this.mX1;
            return ((this.mX2 - d11) * d10) + d11;
        }

        public double getLinearY(double d9) {
            double d10 = (d9 - this.mTime1) * this.mOneOverDeltaTime;
            double d11 = this.mY1;
            return ((this.mY2 - d11) * d10) + d11;
        }

        public double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        public double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        public double lookup(double d9) {
            if (d9 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            if (d9 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d9 * (dArr.length - 1);
            int i = (int) length;
            double d10 = length - i;
            double d11 = dArr[i];
            return ((dArr[i + 1] - d11) * d10) + d11;
        }

        public void setPoint(double d9) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d9 : d9 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
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
    public void getPos(double d9, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d10 = arc.mTime1;
            if (d9 < d10) {
                double d11 = d9 - d10;
                if (arc.mLinear) {
                    dArr[0] = (this.mArcs[0].getLinearDX(d10) * d11) + arc.getLinearX(d10);
                    dArr[1] = (d11 * this.mArcs[0].getLinearDY(d10)) + this.mArcs[0].getLinearY(d10);
                    return;
                }
                arc.setPoint(d10);
                dArr[0] = (this.mArcs[0].getDX() * d11) + this.mArcs[0].getX();
                dArr[1] = (d11 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
                return;
            }
            if (d9 > arcArr[arcArr.length - 1].mTime2) {
                double d12 = arcArr[arcArr.length - 1].mTime2;
                double d13 = d9 - d12;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = (this.mArcs[length].getLinearDX(d12) * d13) + arc2.getLinearX(d12);
                    dArr[1] = (d13 * this.mArcs[length].getLinearDY(d12)) + this.mArcs[length].getLinearY(d12);
                    return;
                }
                arc2.setPoint(d9);
                dArr[0] = (this.mArcs[length].getDX() * d13) + this.mArcs[length].getX();
                dArr[1] = (d13 * this.mArcs[length].getDY()) + this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d14 = arcArr2[0].mTime1;
            if (d9 < d14) {
                d9 = d14;
            }
            if (d9 > arcArr2[arcArr2.length - 1].mTime2) {
                d9 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i];
            if (d9 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d9);
                    dArr[1] = this.mArcs[i].getLinearY(d9);
                    return;
                } else {
                    arc3.setPoint(d9);
                    dArr[0] = this.mArcs[i].getX();
                    dArr[1] = this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d9, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d10 = arcArr[0].mTime1;
        if (d9 < d10) {
            d9 = d10;
        } else if (d9 > arcArr[arcArr.length - 1].mTime2) {
            d9 = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i];
            if (d9 <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d9);
                    dArr[1] = this.mArcs[i].getLinearDY(d9);
                    return;
                } else {
                    arc.setPoint(d9);
                    dArr[0] = this.mArcs[i].getDX();
                    dArr[1] = this.mArcs[i].getDY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d9, int i) {
        Arc[] arcArr = this.mArcs;
        int i8 = 0;
        double d10 = arcArr[0].mTime1;
        if (d9 < d10) {
            d9 = d10;
        }
        if (d9 > arcArr[arcArr.length - 1].mTime2) {
            d9 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i8 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i8];
            if (d9 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i == 0) {
                        return arc.getLinearDX(d9);
                    }
                    return arc.getLinearDY(d9);
                }
                arc.setPoint(d9);
                if (i == 0) {
                    return this.mArcs[i8].getDX();
                }
                return this.mArcs[i8].getDY();
            }
            i8++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d9, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d10 = arc.mTime1;
            if (d9 < d10) {
                double d11 = d9 - d10;
                if (arc.mLinear) {
                    fArr[0] = (float) ((this.mArcs[0].getLinearDX(d10) * d11) + arc.getLinearX(d10));
                    fArr[1] = (float) ((d11 * this.mArcs[0].getLinearDY(d10)) + this.mArcs[0].getLinearY(d10));
                    return;
                }
                arc.setPoint(d10);
                fArr[0] = (float) ((this.mArcs[0].getDX() * d11) + this.mArcs[0].getX());
                fArr[1] = (float) ((d11 * this.mArcs[0].getDY()) + this.mArcs[0].getY());
                return;
            }
            if (d9 > arcArr[arcArr.length - 1].mTime2) {
                double d12 = arcArr[arcArr.length - 1].mTime2;
                double d13 = d9 - d12;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) ((this.mArcs[length].getLinearDX(d12) * d13) + arc2.getLinearX(d12));
                    fArr[1] = (float) ((d13 * this.mArcs[length].getLinearDY(d12)) + this.mArcs[length].getLinearY(d12));
                    return;
                }
                arc2.setPoint(d9);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d14 = arcArr2[0].mTime1;
            if (d9 < d14) {
                d9 = d14;
            } else if (d9 > arcArr2[arcArr2.length - 1].mTime2) {
                d9 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i];
            if (d9 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d9);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d9);
                    return;
                } else {
                    arc3.setPoint(d9);
                    fArr[0] = (float) this.mArcs[i].getX();
                    fArr[1] = (float) this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d9, int i) {
        int i8 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d10 = arc.mTime1;
            if (d9 < d10) {
                double d11 = d9 - d10;
                if (arc.mLinear) {
                    if (i == 0) {
                        return (d11 * this.mArcs[0].getLinearDX(d10)) + arc.getLinearX(d10);
                    }
                    return (d11 * this.mArcs[0].getLinearDY(d10)) + arc.getLinearY(d10);
                }
                arc.setPoint(d10);
                if (i == 0) {
                    return (d11 * this.mArcs[0].getDX()) + this.mArcs[0].getX();
                }
                return (d11 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
            }
            if (d9 > arcArr[arcArr.length - 1].mTime2) {
                double d12 = arcArr[arcArr.length - 1].mTime2;
                double d13 = d9 - d12;
                int length = arcArr.length - 1;
                if (i == 0) {
                    return (d13 * this.mArcs[length].getLinearDX(d12)) + arcArr[length].getLinearX(d12);
                }
                return (d13 * this.mArcs[length].getLinearDY(d12)) + arcArr[length].getLinearY(d12);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d14 = arcArr2[0].mTime1;
            if (d9 < d14) {
                d9 = d14;
            } else if (d9 > arcArr2[arcArr2.length - 1].mTime2) {
                d9 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i8 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i8];
            if (d9 <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i == 0) {
                        return arc2.getLinearX(d9);
                    }
                    return arc2.getLinearY(d9);
                }
                arc2.setPoint(d9);
                if (i == 0) {
                    return this.mArcs[i8].getX();
                }
                return this.mArcs[i8].getY();
            }
            i8++;
        }
    }
}
