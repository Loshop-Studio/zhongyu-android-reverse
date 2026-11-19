package p179m5;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.zykj.blackboard.enums.PlayStatus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9480h;

/* renamed from: m5.m */
/* loaded from: classes4.dex */
public interface InterfaceC8977m extends InterfaceC8975k {
    /* renamed from: a */
    void mo7916a(MotionEvent motionEvent);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    /* renamed from: c */
    Bitmap mo7917c();

    /* renamed from: d */
    void mo7918d(long j9, Function0 function0, Function1 function1);

    /* renamed from: e */
    String mo7919e();

    /* renamed from: f */
    void mo14308f(InterfaceC9480h interfaceC9480h);

    /* renamed from: g */
    void mo7920g(float f10);

    long getDuration();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void pause();

    void resume();

    void setAreaMoveListener(InterfaceC9476d interfaceC9476d);

    void setScaleEnable(boolean z9);

    void setTranslateEnable(boolean z9);

    void start();

    PlayStatus status();
}
