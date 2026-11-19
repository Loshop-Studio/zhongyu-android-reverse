package p178ha;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.enums.PlayStatus;
import ma.InterfaceC10216d;
import ma.InterfaceC10220h;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: ha.m */
/* loaded from: classes5.dex */
public interface InterfaceC9516m extends InterfaceC9514k {
    /* renamed from: a */
    void mo14540a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    Bitmap mo14541c();

    /* renamed from: d */
    void mo18734d(InterfaceC10220h interfaceC10220h);

    /* renamed from: e */
    void mo14542e(long j10, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l);

    /* renamed from: f */
    String mo14543f();

    /* renamed from: g */
    void mo14544g(float f10);

    long getDuration();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void pause();

    void resume();

    void setAreaMoveListener(InterfaceC10216d interfaceC10216d);

    void setScaleEnable(boolean z10);

    void setTranslateEnable(boolean z10);

    void start();

    PlayStatus status();
}
