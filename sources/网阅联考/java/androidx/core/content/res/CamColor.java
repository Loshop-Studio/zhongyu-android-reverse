package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DoubleCompanionObject;

/* loaded from: classes.dex */
class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;

    /* renamed from: mJ */
    private final float f292mJ;
    private final float mJstar;

    /* renamed from: mM */
    private final float f293mM;

    /* renamed from: mQ */
    private final float f294mQ;

    /* renamed from: mS */
    private final float f295mS;

    public CamColor(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.mHue = f4;
        this.mChroma = f5;
        this.f292mJ = f6;
        this.f294mQ = f7;
        this.f293mM = f8;
        this.f295mS = f9;
        this.mJstar = f10;
        this.mAstar = f11;
        this.mBstar = f12;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, m95to = 360.0d) float f4, @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f5, @FloatRange(from = 0.0d, m95to = 100.0d) float f6) {
        float f7 = 100.0f;
        float f8 = 1000.0f;
        float f9 = 0.0f;
        CamColor camColor = null;
        float f10 = 1000.0f;
        while (Math.abs(f9 - f7) > 0.01f) {
            float f11 = ((f7 - f9) / 2.0f) + f9;
            int iViewedInSrgb = fromJch(f11, f5, f4).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f6 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f4));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f8 = fAbs;
                    f10 = fDistance;
                }
            }
            if (f8 == 0.0f && f10 == 0.0f) {
                break;
            }
            if (fLStarFromInt < f6) {
                f9 = f11;
            } else {
                f7 = f11;
            }
        }
        return camColor;
    }

    @NonNull
    public static CamColor fromColor(@ColorInt int i4) {
        return fromColorInViewingConditions(i4, ViewingConditions.DEFAULT);
    }

    @NonNull
    public static CamColor fromColorInViewingConditions(@ColorInt int i4, @NonNull ViewingConditions viewingConditions) {
        float[] fArrXyzFromInt = CamUtils.xyzFromInt(i4);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f4 = fArrXyzFromInt[0];
        float[] fArr2 = fArr[0];
        float f5 = fArr2[0] * f4;
        float f6 = fArrXyzFromInt[1];
        float f7 = f5 + (fArr2[1] * f6);
        float f8 = fArrXyzFromInt[2];
        float f9 = f7 + (fArr2[2] * f8);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[0] * f4) + (fArr3[1] * f6) + (fArr3[2] * f8);
        float[] fArr4 = fArr[2];
        float f11 = (f4 * fArr4[0]) + (f6 * fArr4[1]) + (f8 * fArr4[2]);
        float f12 = viewingConditions.getRgbD()[0] * f9;
        float f13 = viewingConditions.getRgbD()[1] * f10;
        float f14 = viewingConditions.getRgbD()[2] * f11;
        float fPow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f12)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f14)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d4 = fSignum3;
        float f15 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d4)) / 11.0f;
        float f16 = ((float) ((fSignum + fSignum2) - (d4 * 2.0d))) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = (((fSignum * 20.0f) + f17) + (21.0f * fSignum3)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (3.1415927f * f20) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float flRoot = viewingConditions.getFlRoot() * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f15 * f15) + (f16 * f16)))) / (f18 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float flRoot2 = fPow5 * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt((r3 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f22 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot2) + 1.0f)) * 43.85965f;
        double d5 = f21;
        return new CamColor(f20, fPow5, fPow4, flRoot, flRoot2, fSqrt, f22, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, m95to = 100.0d) float f4, @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f5, @FloatRange(from = 0.0d, m95to = 360.0d) float f6) {
        return fromJchInFrame(f4, f5, f6, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, m95to = 100.0d) float f4, @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f5, @FloatRange(from = 0.0d, m95to = 360.0d) float f6, ViewingConditions viewingConditions) {
        float c4 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f4 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f5 * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt(((f5 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f7 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float fLog = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f6) / 180.0f;
        return new CamColor(f6, f5, f4, c4, flRoot, fSqrt, f7, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    public static int toColor(@FloatRange(from = 0.0d, m95to = 360.0d) float f4, @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f5, @FloatRange(from = 0.0d, m95to = 100.0d) float f6) {
        return toColor(f4, f5, f6, ViewingConditions.DEFAULT);
    }

    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, m95to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, m95to = 100.0d)
    public float getJ() {
        return this.f292mJ;
    }

    @FloatRange(from = 0.0d, m95to = 100.0d)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.f293mM;
    }

    @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.f294mQ;
    }

    @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.f295mS;
    }

    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float fPow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f4 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f5 = fCos2 * f4;
        float f6 = f4 * fSin;
        float f7 = nbb * 460.0f;
        float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
        float fSignum = Math.signum(f8) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float fSignum2 = Math.signum(f9) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f10 = fSignum / viewingConditions.getRgbD()[0];
        float f11 = fSignum2 / viewingConditions.getRgbD()[1];
        float f12 = fSignum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f13, f14, (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, m95to = 360.0d) float f4, @FloatRange(from = 0.0d, m95to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f5, @FloatRange(from = 0.0d, m95to = 100.0d) float f6, @NonNull ViewingConditions viewingConditions) {
        if (f5 < 1.0d || Math.round(f6) <= 0.0d || Math.round(f6) >= 100.0d) {
            return CamUtils.intFromLStar(f6);
        }
        float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
        CamColor camColor = null;
        boolean z3 = true;
        float f7 = 0.0f;
        float f8 = f5;
        while (Math.abs(f7 - f5) >= 0.4f) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f8, f6);
            if (!z3) {
                if (camColorFindCamByJ == null) {
                    f5 = f8;
                } else {
                    f7 = f8;
                    camColor = camColorFindCamByJ;
                }
                f8 = ((f5 - f7) / 2.0f) + f7;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f8 = ((f5 - f7) / 2.0f) + f7;
                z3 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f6) : camColor.viewed(viewingConditions);
    }
}
