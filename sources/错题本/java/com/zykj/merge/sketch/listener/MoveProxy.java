package com.zykj.merge.sketch.listener;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.listener.IAreaMoveListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/merge/sketch/listener/MoveProxy;", "", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "listener", "Ld6/s;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "()V", "", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "", "getMoveMaxHeightTimes", "()I", "getMoveMaxWidthTimes", "", "isEnable", "setTranslateEnable", "(Z)V", "setScaleEnable", "Landroid/graphics/Bitmap;", "getCurrentScreenBitmap", "()Landroid/graphics/Bitmap;", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface MoveProxy {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void areaMoveEnd$default(MoveProxy moveProxy, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            moveProxy.areaMoveEnd(f, f7);
        }

        public static /* synthetic */ void areaMoving$default(MoveProxy moveProxy, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            moveProxy.areaMoving(f, f7);
        }
    }

    void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    void areaMoveStart();

    void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    @Nullable
    Bitmap getCurrentScreenBitmap();

    float getMoveHorizontalProgress();

    int getMoveMaxHeightTimes();

    int getMoveMaxWidthTimes();

    float getMoveVerticalProgress();

    void setAreaMoveListener(@Nullable IAreaMoveListener listener);

    void setScaleEnable(boolean isEnable);

    void setTranslateEnable(boolean isEnable);
}
