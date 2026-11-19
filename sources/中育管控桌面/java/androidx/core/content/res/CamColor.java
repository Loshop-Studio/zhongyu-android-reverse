package androidx.core.content.res;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DoubleCompanionObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;

    /* renamed from: mJ */
    private final float f404mJ;
    private final float mJstar;

    /* renamed from: mM */
    private final float f405mM;

    /* renamed from: mQ */
    private final float f406mQ;

    /* renamed from: mS */
    private final float f407mS;

    public CamColor(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.mHue = f6;
        this.mChroma = f7;
        this.f404mJ = f8;
        this.f406mQ = f9;
        this.f405mM = f10;
        this.f407mS = f11;
        this.mJstar = f12;
        this.mAstar = f13;
        this.mBstar = f14;
    }

    private static CamColor findCamByJ(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2) float f8) {
        float f9 = 100.0f;
        float f10 = 1000.0f;
        float f11 = 0.0f;
        CamColor camColor = null;
        float f12 = 1000.0f;
        while (Math.abs(f11 - f9) > 0.01f) {
            float f13 = ((f9 - f11) / 2.0f) + f11;
            int iViewedInSrgb = fromJch(f13, f7, f6).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f8 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f6));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f10 = fAbs;
                    f12 = fDistance;
                }
            }
            if (f10 == 0.0f && f12 == 0.0f) {
                return camColor;
            }
            if (fLStarFromInt < f8) {
                f11 = f13;
            } else {
                f9 = f13;
            }
        }
        return camColor;
    }

    public static CamColor fromColor(@ColorInt int i6) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i6, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(@ColorInt int i6, ViewingConditions viewingConditions, @Size(7) float[] fArr, @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) float[] fArr2) {
        CamUtils.xyzFromInt(i6, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f7 = fArr4[0] * f6;
        float f8 = fArr2[1];
        float f9 = f7 + (fArr4[1] * f8);
        float f10 = fArr2[2];
        float f11 = f9 + (fArr4[2] * f10);
        float[] fArr5 = fArr3[1];
        float f12 = (fArr5[0] * f6) + (fArr5[1] * f8) + (fArr5[2] * f10);
        float[] fArr6 = fArr3[2];
        float f13 = (f6 * fArr6[0]) + (f8 * fArr6[1]) + (f10 * fArr6[2]);
        float f14 = viewingConditions.getRgbD()[0] * f11;
        float f15 = viewingConditions.getRgbD()[1] * f12;
        float f16 = viewingConditions.getRgbD()[2] * f13;
        float fPow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f14)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f15)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f16)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f14) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f15) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f16) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f17 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d6)) / 11.0f;
        float f18 = ((float) ((fSignum + fSignum2) - (d6 * 2.0d))) / 9.0f;
        float f19 = fSignum2 * 20.0f;
        float f20 = (((fSignum * 20.0f) + f19) + (21.0f * fSignum3)) / 20.0f;
        float f21 = (((fSignum * 40.0f) + f19) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f22 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f21 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c7 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f17 * f17) + (f18 * f18)))) / (f20 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d7 = f22;
        float fCos = ((float) Math.cos(d7)) * fLog;
        float fSin = fLog * ((float) Math.sin(d7));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = c7;
            fArr[2] = flRoot;
            fArr[3] = fSqrt2;
            fArr[4] = f23;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static CamColor fromJch(@FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = 360.0d) float f8) {
        return fromJchInFrame(f6, f7, f8, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = 360.0d) float f8, ViewingConditions viewingConditions) {
        float c7 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f6 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f7;
        float fSqrt = ((float) Math.sqrt(((f7 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f9 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float fLog = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f8) / 180.0f;
        return new CamColor(f8, f7, f6, c7, flRoot, fSqrt, f9, ((float) Math.cos(d6)) * fLog, fLog * ((float) Math.sin(d6)));
    }

    public static void getM3HCTfromColor(@ColorInt int i6, @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) float[] fArr) {
        fromColorInViewingConditions(i6, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i6);
    }

    public static int toColor(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2) float f8) {
        return toColor(f6, f7, f8, ViewingConditions.DEFAULT);
    }

    public float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, m58to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2)
    public float getJ() {
        return this.f404mJ;
    }

    @FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.f405mM;
    }

    @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.f406mQ;
    }

    @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.f407mS;
    }

    @ColorInt
    public int viewed(ViewingConditions viewingConditions) {
        float fPow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f6 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f7 = fCos2 * f6;
        float f8 = f6 * fSin;
        float f9 = nbb * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float fSignum = Math.signum(f10) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
        float fSignum2 = Math.signum(f11) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f12 = fSignum / viewingConditions.getRgbD()[0];
        float f13 = fSignum2 / viewingConditions.getRgbD()[1];
        float f14 = fSignum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f15 = (fArr2[0] * f12) + (fArr2[1] * f13) + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f15, f16, (f12 * fArr4[0]) + (f13 * fArr4[1]) + (f14 * fArr4[2]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, m58to = 360.0d) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = MotionTokens.DurationShort2) float f8, ViewingConditions viewingConditions) {
        if (f7 < 1.0d || Math.round(f8) <= 0.0d || Math.round(f8) >= 100.0d) {
            return CamUtils.intFromLStar(f8);
        }
        float fMin = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
        CamColor camColor = null;
        boolean z6 = true;
        float f9 = 0.0f;
        float f10 = f7;
        while (Math.abs(f9 - f7) >= 0.4f) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f10, f8);
            if (!z6) {
                if (camColorFindCamByJ == null) {
                    f7 = f10;
                } else {
                    f9 = f10;
                    camColor = camColorFindCamByJ;
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
                z6 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f8) : camColor.viewed(viewingConditions);
    }
}
