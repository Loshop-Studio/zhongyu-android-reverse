package com.zykj.view.simpleBoard.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.zykj.view.simpleBoard.DrawControl;
import com.zykj.view.simpleBoard.SimpleBoardConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p067g5.C5604a;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 F2\u00020\u0001:\u0001FB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\u000eJ\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\u000eJ\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u000eJ#\u0010/\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0-¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u00104\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00105R\u0014\u0010C\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00105R\u0014\u0010D\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00105R\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00102¨\u0006G"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/action/BaseAction;", "", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "boardConfig", "Landroid/graphics/Matrix;", "cameraMatrix", "Lcom/zykj/view/simpleBoard/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "doubleTouchDown", "(Landroid/view/MotionEvent;)V", "doubleTouchMove", "doubleTouchUp", "handleTranslation", "(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;", "handleMatrixDown", "()V", "matrix", "handleMatrixMove", "(Landroid/graphics/Matrix;)V", "handleMatrixUp", "", "isQuickDoubleTouchDown", "()Z", "Landroid/graphics/PointF;", "pointF1", "pointF2", "calculateMiddlePointF", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "", "calculateDistance", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)F", "singleTouchDown", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "onTouchDown", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "Lkotlin/Function0;", "callback", "isSingleFingerInput", "(Landroid/view/MotionEvent;Lr6/a;)V", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/DrawControl;", "firstMiddlePointF", "Landroid/graphics/PointF;", "firstDistance", "F", "", "fingerMode", "I", "", "firstTouchDownTime", "J", "originMatrix", "Landroid/view/MotionEvent$PointerCoords;", "tempPointerCoords", "Landroid/view/MotionEvent$PointerCoords;", "tempFirstPointF", "tempSecondPointF", "tempMiddlePointF", "tempMatrix", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseAction {
    private static final int DOUBLE_CHECK_TIME = 48;
    private static final int FINGER_MODE_DEFAULT = 0;
    private static final int FINGER_MODE_DOUBLE = 2;
    private static final int FINGER_MODE_SINGLE = 1;

    @NotNull
    private final SimpleBoardConfig boardConfig;

    @NotNull
    private final Matrix cameraMatrix;

    @NotNull
    private final DrawControl drawControl;
    private int fingerMode;
    private float firstDistance;

    @NotNull
    private final PointF firstMiddlePointF;
    private long firstTouchDownTime;

    @NotNull
    private final Matrix originMatrix;

    @NotNull
    private final PointF tempFirstPointF;

    @NotNull
    private final Matrix tempMatrix;

    @NotNull
    private final PointF tempMiddlePointF;

    @NotNull
    private final MotionEvent.PointerCoords tempPointerCoords;

    @NotNull
    private final PointF tempSecondPointF;

    public BaseAction(@NotNull SimpleBoardConfig boardConfig, @NotNull Matrix cameraMatrix, @NotNull DrawControl drawControl) {
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(cameraMatrix, "cameraMatrix");
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.boardConfig = boardConfig;
        this.cameraMatrix = cameraMatrix;
        this.drawControl = drawControl;
        this.firstMiddlePointF = new PointF();
        this.firstDistance = 1.0f;
        this.originMatrix = new Matrix();
        this.tempPointerCoords = new MotionEvent.PointerCoords();
        this.tempFirstPointF = new PointF();
        this.tempSecondPointF = new PointF();
        this.tempMiddlePointF = new PointF();
        this.tempMatrix = new Matrix();
    }

    private final float calculateDistance(PointF pointF1, PointF pointF2) {
        double d9 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF1.x - pointF2.x, d9)) + ((float) Math.pow(pointF1.y - pointF2.y, d9)));
    }

    private final PointF calculateMiddlePointF(PointF pointF1, PointF pointF2) {
        PointF pointF = new PointF();
        float f = 2;
        pointF.set((pointF1.x + pointF2.x) / f, (pointF1.y + pointF2.y) / f);
        return pointF;
    }

    private final void doubleTouchDown(MotionEvent event) {
        if (event.getPointerCount() < 2) {
            return;
        }
        event.getPointerCoords(0, this.tempPointerCoords);
        PointF pointF = this.tempFirstPointF;
        MotionEvent.PointerCoords pointerCoords = this.tempPointerCoords;
        pointF.set(pointerCoords.x, pointerCoords.y);
        event.getPointerCoords(1, this.tempPointerCoords);
        PointF pointF2 = this.tempSecondPointF;
        MotionEvent.PointerCoords pointerCoords2 = this.tempPointerCoords;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.firstMiddlePointF.set(calculateMiddlePointF(this.tempFirstPointF, this.tempSecondPointF));
        this.firstDistance = calculateDistance(this.tempFirstPointF, this.tempSecondPointF);
        handleMatrixDown();
    }

    private final void doubleTouchMove(MotionEvent event) {
        if (event.getPointerCount() < 2) {
            return;
        }
        handleMatrixMove(handleTranslation(event));
    }

    private final void doubleTouchUp(MotionEvent event) {
        if (event.getPointerCount() < 2) {
            return;
        }
        handleMatrixUp(handleTranslation(event));
    }

    private final void handleMatrixDown() {
        this.originMatrix.set(this.cameraMatrix);
    }

    private final void handleMatrixMove(Matrix matrix) {
        matrix.preConcat(this.originMatrix);
        this.drawControl.handleCameraMatrix(matrix);
    }

    private final void handleMatrixUp(Matrix matrix) {
        handleMatrixMove(matrix);
    }

    private final Matrix handleTranslation(MotionEvent event) {
        event.getPointerCoords(0, this.tempPointerCoords);
        PointF pointF = this.tempFirstPointF;
        MotionEvent.PointerCoords pointerCoords = this.tempPointerCoords;
        pointF.set(pointerCoords.x, pointerCoords.y);
        event.getPointerCoords(1, this.tempPointerCoords);
        PointF pointF2 = this.tempSecondPointF;
        MotionEvent.PointerCoords pointerCoords2 = this.tempPointerCoords;
        pointF2.set(pointerCoords2.x, pointerCoords2.y);
        this.tempMatrix.reset();
        if (this.boardConfig.getEnableControl()) {
            float fCalculateDistance = calculateDistance(this.tempFirstPointF, this.tempSecondPointF) / this.firstDistance;
            Matrix matrix = this.tempMatrix;
            PointF pointF3 = this.firstMiddlePointF;
            matrix.postScale(fCalculateDistance, fCalculateDistance, pointF3.x, pointF3.y);
        }
        this.tempMiddlePointF.set(calculateMiddlePointF(this.tempFirstPointF, this.tempSecondPointF));
        Matrix matrix2 = this.tempMatrix;
        PointF pointF4 = this.tempMiddlePointF;
        float f = pointF4.x;
        PointF pointF5 = this.firstMiddlePointF;
        matrix2.postTranslate(f - pointF5.x, pointF4.y - pointF5.y);
        return this.tempMatrix;
    }

    private final boolean isQuickDoubleTouchDown() {
        return System.currentTimeMillis() - this.firstTouchDownTime <= 48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onTouchDown$lambda$0(BaseAction baseAction, MotionEvent motionEvent) {
        baseAction.singleTouchDown(motionEvent);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onTouchMove$lambda$2(BaseAction baseAction, MotionEvent motionEvent) {
        baseAction.singleTouchMove(motionEvent);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onTouchPointerDown$lambda$1(BaseAction baseAction, MotionEvent motionEvent) {
        baseAction.singleTouchUp(motionEvent);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onTouchUp$lambda$3(BaseAction baseAction, MotionEvent motionEvent) {
        baseAction.singleTouchUp(motionEvent);
        return C5443s.f8405a;
    }

    public final void isSingleFingerInput(@NotNull MotionEvent event, @NotNull InterfaceC6469a callback) {
        AbstractC5830k.m5330g(event, "event");
        AbstractC5830k.m5330g(callback, "callback");
        if (!this.boardConfig.getEnableFinger()) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int pointerCount = event.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                event.getPointerProperties(i, pointerProperties);
                if (pointerProperties.toolType == 1) {
                    return;
                }
            }
        }
        if (event.getPointerCount() == 1) {
            callback.invoke();
        }
    }

    public void onTouchDown(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.fingerMode = 1;
        this.firstTouchDownTime = System.currentTimeMillis();
        isSingleFingerInput(event, new C5604a(this, event, 0));
    }

    public void onTouchMove(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        int i = this.fingerMode;
        if (i == 1) {
            isSingleFingerInput(event, new C5604a(this, event, 1));
        } else {
            if (i != 2) {
                return;
            }
            doubleTouchMove(event);
        }
    }

    public void onTouchPointerDown(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (this.fingerMode == 1) {
            this.fingerMode = 2;
            if (isQuickDoubleTouchDown()) {
                singleTouchCancel(event);
            } else {
                isSingleFingerInput(event, new C5604a(this, event, 2));
            }
            doubleTouchDown(event);
        }
    }

    public void onTouchPointerUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (this.fingerMode == 2) {
            this.fingerMode = 0;
            doubleTouchUp(event);
        }
    }

    public void onTouchUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (this.fingerMode == 1) {
            isSingleFingerInput(event, new C5604a(this, event, 3));
        }
    }

    public abstract void singleTouchCancel(@NotNull MotionEvent event);

    public abstract void singleTouchDown(@NotNull MotionEvent event);

    public abstract void singleTouchMove(@NotNull MotionEvent event);

    public abstract void singleTouchUp(@NotNull MotionEvent event);
}
