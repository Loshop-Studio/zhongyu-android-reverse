package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.PlayStatusListener;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public interface IPlayPageControl extends IEditPlayPageControl {

    public static final class DefaultImpls {
        public static /* synthetic */ void areaMoveEnd$default(IPlayPageControl iPlayPageControl, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            iPlayPageControl.areaMoveEnd(f10, f11);
        }

        public static /* synthetic */ void areaMoving$default(IPlayPageControl iPlayPageControl, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            iPlayPageControl.areaMoving(f10, f11);
        }
    }

    void addPlayActionListener(PlayStatusListener playStatusListener);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    Bitmap getCurrentScreenShot();

    long getDuration();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    String getPageDirName();

    String getPageDirPath();

    void onTouchEvent(MotionEvent motionEvent);

    void pause();

    void removePlayActionListener(PlayStatusListener playStatusListener);

    void resume();

    void seekTo(long j10, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l);

    void setAreaMoveListener(IAreaMoveListener iAreaMoveListener);

    void setRate(float f10);

    void setScaleEnable(boolean z10);

    void setTranslateEnable(boolean z10);

    void start();

    PlayStatus status();
}
