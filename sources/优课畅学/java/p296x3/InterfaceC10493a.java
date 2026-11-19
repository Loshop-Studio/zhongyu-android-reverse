package p296x3;

import android.graphics.Bitmap;
import com.zykj.blackboard.listener.IAreaMoveListener;

/* renamed from: x3.a */
/* loaded from: classes4.dex */
public interface InterfaceC10493a {
    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    Bitmap getCurrentScreenBitmap();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void setAreaMoveListener(IAreaMoveListener iAreaMoveListener);

    void setScaleEnable(boolean z10);

    void setTranslateEnable(boolean z10);
}
