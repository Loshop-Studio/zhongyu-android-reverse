package com.zykj.merge.sketch.listener;

import android.graphics.Bitmap;
import ma.InterfaceC10216d;

/* loaded from: classes6.dex */
public interface MoveProxy {

    public static final class DefaultImpls {
        public static /* synthetic */ void areaMoveEnd$default(MoveProxy moveProxy, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            moveProxy.areaMoveEnd(f10, f11);
        }

        public static /* synthetic */ void areaMoving$default(MoveProxy moveProxy, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            moveProxy.areaMoving(f10, f11);
        }
    }

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    Bitmap getCurrentScreenBitmap();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void setAreaMoveListener(InterfaceC10216d interfaceC10216d);

    void setScaleEnable(boolean z10);

    void setTranslateEnable(boolean z10);
}
