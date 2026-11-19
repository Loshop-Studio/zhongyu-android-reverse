package p275w4;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.enums.PlayStatus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5125h;

/* renamed from: w4.m */
/* loaded from: classes4.dex */
public interface InterfaceC9748m extends InterfaceC9746k {
    /* renamed from: a */
    void mo6804a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    Bitmap mo6805c();

    /* renamed from: d */
    void mo6806d(long j10, Function0 function0, Function1 function1);

    /* renamed from: e */
    String mo6807e();

    /* renamed from: f */
    void mo16314f(InterfaceC5125h interfaceC5125h);

    /* renamed from: g */
    void mo6808g(float f10);

    long getDuration();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void pause();

    void resume();

    void setAreaMoveListener(InterfaceC5121d interfaceC5121d);

    void setScaleEnable(boolean z9);

    void setTranslateEnable(boolean z9);

    void start();

    PlayStatus status();
}
