package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
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
    private final float f1355mJ;
    private final float mJstar;

    /* renamed from: mM */
    private final float f1356mM;

    /* renamed from: mQ */
    private final float f1357mQ;

    /* renamed from: mS */
    private final float f1358mS;

    public CamColor(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.mHue = f10;
        this.mChroma = f11;
        this.f1355mJ = f12;
        this.f1357mQ = f13;
        this.f1356mM = f14;
        this.f1358mS = f15;
        this.mJstar = f16;
        this.mAstar = f17;
        this.mBstar = f18;
    }

    private static CamColor findCamByJ(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        CamColor camColor = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int iViewedInSrgb = fromJch(f17, f11, f10).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f12 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f10));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f14 = fAbs;
                    f16 = fDistance;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                return camColor;
            }
            if (fLStarFromInt < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return camColor;
    }

    public static CamColor fromColor(@ColorInt int i9) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i9, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(@ColorInt int i9, ViewingConditions viewingConditions, @Size(7) float[] fArr, @Size(3) float[] fArr2) {
        CamUtils.xyzFromInt(i9, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = f11 + (fArr4[1] * f12);
        float f14 = fArr2[2];
        float f15 = f13 + (fArr4[2] * f14);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[0] * f10) + (fArr5[1] * f12) + (fArr5[2] * f14);
        float[] fArr6 = fArr3[2];
        float f17 = (f10 * fArr6[0]) + (f12 * fArr6[1]) + (f14 * fArr6[2]);
        float f18 = viewingConditions.getRgbD()[0] * f15;
        float f19 = viewingConditions.getRgbD()[1] * f16;
        float f20 = viewingConditions.getRgbD()[2] * f17;
        float fPow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f18)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f20)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c10 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = c10;
            fArr[2] = flRoot;
            fArr[3] = fSqrt2;
            fArr[4] = f27;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static CamColor fromJch(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d) float f12) {
        return fromJchInFrame(f10, f11, f12, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d) float f12, ViewingConditions viewingConditions) {
        float c10 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f10 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f11;
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new CamColor(f12, f11, f10, c10, flRoot, fSqrt, f13, ((float) Math.cos(d10)) * fLog, fLog * ((float) Math.sin(d10)));
    }

    public static void getM3HCTfromColor(@ColorInt int i9, @Size(3) float[] fArr) {
        fromColorInViewingConditions(i9, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i9);
    }

    public static int toColor(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f12) {
        return toColor(f10, f11, f12, ViewingConditions.DEFAULT);
    }

    public float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2)
    public float getJ() {
        return this.f1355mJ;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.f1356mM;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.f1357mQ;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.f1358mS;
    }

    @ColorInt
    public int viewed(ViewingConditions viewingConditions) {
        float fPow = (float) Math.pow(((((double) getChroma()) == AudioStats.AUDIO_AMPLITUDE_NONE || ((double) getJ()) == AudioStats.AUDIO_AMPLITUDE_NONE) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f10 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = nbb * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float fSignum = Math.signum(f14) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float fSignum2 = Math.signum(f15) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f16 = fSignum / viewingConditions.getRgbD()[0];
        float f17 = fSignum2 / viewingConditions.getRgbD()[1];
        float f18 = fSignum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f19 = (fArr2[0] * f16) + (fArr2[1] * f17) + (fArr2[2] * f18);
        float[] fArr3 = fArr[1];
        float f20 = (fArr3[0] * f16) + (fArr3[1] * f17) + (fArr3[2] * f18);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f19, f20, (f16 * fArr4[0]) + (f17 * fArr4[1]) + (f18 * fArr4[2]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = 360.0d) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = MotionTokens.DurationShort2) float f12, ViewingConditions viewingConditions) {
        if (f11 < 1.0d || Math.round(f12) <= AudioStats.AUDIO_AMPLITUDE_NONE || Math.round(f12) >= 100.0d) {
            return CamUtils.intFromLStar(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        CamColor camColor = null;
        boolean z9 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f14, f12);
            if (!z9) {
                if (camColorFindCamByJ == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    camColor = camColorFindCamByJ;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z9 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f12) : camColor.viewed(viewingConditions);
    }
}
