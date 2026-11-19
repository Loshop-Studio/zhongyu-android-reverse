package com.tencent.liteav.beauty;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public interface TXBeautyManager {
    void enableSharpnessEnhancement(boolean z10);

    void setBeautyLevel(int i10);

    void setBeautyStyle(int i10);

    void setChinLevel(int i10);

    void setEyeAngleLevel(int i10);

    void setEyeDistanceLevel(int i10);

    void setEyeLightenLevel(int i10);

    void setEyeScaleLevel(int i10);

    void setFaceBeautyLevel(int i10);

    void setFaceShortLevel(int i10);

    void setFaceSlimLevel(int i10);

    void setFaceVLevel(int i10);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f10);

    void setForeheadLevel(int i10);

    void setGreenScreenFile(String str);

    void setLipsThicknessLevel(int i10);

    void setMotionMute(boolean z10);

    void setMotionTmpl(String str);

    void setMouthShapeLevel(int i10);

    void setNosePositionLevel(int i10);

    void setNoseSlimLevel(int i10);

    void setNoseWingLevel(int i10);

    void setPounchRemoveLevel(int i10);

    void setPreprocessor(C6598a c6598a);

    void setRuddyLevel(int i10);

    void setSmileLinesRemoveLevel(int i10);

    void setToothWhitenLevel(int i10);

    void setWhitenessLevel(int i10);

    void setWrinkleRemoveLevel(int i10);
}
