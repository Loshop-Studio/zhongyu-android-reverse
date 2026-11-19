package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.PlayStatusListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J9\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H&¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u0004J'\u0010,\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0013H&¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0013H&¢\u0006\u0004\b1\u00100J\u000f\u00103\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H&¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b:\u00109J\u0011\u0010<\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\b<\u0010=¨\u0006>"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/IPlayPageControl;", "Lcom/zykj/blackboard/core/play/IEditPlayPageControl;", "Ld6/s;", "start", "()V", "resume", "pause", "", "skip", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "seekTo", "(JLr6/a;Lr6/c;)V", "Lcom/zykj/blackboard/enums/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/blackboard/enums/PlayStatus;", "", "rate", "setRate", "(F)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/blackboard/listener/PlayStatusListener;)V", "removePlayActionListener", "", "getPageDirPath", "()Ljava/lang/String;", "getPageDirName", "getDuration", "()J", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "", "getMoveMaxHeightTimes", "()I", "getMoveMaxWidthTimes", "", "isEnable", "setTranslateEnable", "(Z)V", "setScaleEnable", "Landroid/graphics/Bitmap;", "getCurrentScreenShot", "()Landroid/graphics/Bitmap;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IPlayPageControl extends IEditPlayPageControl {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void areaMoveEnd$default(IPlayPageControl iPlayPageControl, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            iPlayPageControl.areaMoveEnd(f, f7);
        }

        public static /* synthetic */ void areaMoving$default(IPlayPageControl iPlayPageControl, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            iPlayPageControl.areaMoving(f, f7);
        }
    }

    void addPlayActionListener(@NotNull PlayStatusListener listener);

    void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    void areaMoveStart();

    void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    @Nullable
    Bitmap getCurrentScreenShot();

    long getDuration();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    @NotNull
    String getPageDirName();

    @NotNull
    String getPageDirPath();

    void onTouchEvent(@NotNull MotionEvent motionEvent);

    void pause();

    void removePlayActionListener(@NotNull PlayStatusListener listener);

    void resume();

    void seekTo(long skip, @NotNull InterfaceC6469a onSuccess, @NotNull InterfaceC6471c onError);

    void setAreaMoveListener(@Nullable IAreaMoveListener listener);

    void setRate(float rate);

    void setScaleEnable(boolean isEnable);

    void setTranslateEnable(boolean isEnable);

    void start();

    @NotNull
    PlayStatus status();
}
