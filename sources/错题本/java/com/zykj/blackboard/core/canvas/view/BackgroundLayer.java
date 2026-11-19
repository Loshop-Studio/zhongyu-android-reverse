package com.zykj.blackboard.core.canvas.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "refresh", "()V", "adapterMatrix", "setMatrix", "(Landroid/graphics/Matrix;)V", "", TypedValues.Custom.S_COLOR, "setMyBackgroundColor", "(I)V", "getMyBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface BackgroundLayer {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void drawBackground$default(BackgroundLayer backgroundLayer, Canvas canvas, Matrix matrix, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawBackground");
            }
            if ((i & 2) != 0) {
                matrix = new Matrix();
            }
            backgroundLayer.drawBackground(canvas, matrix);
        }
    }

    void drawBackground(@NotNull Canvas canvas, @NotNull Matrix matrix);

    @NotNull
    BackgroundLineConfig getBackgroundLineConfig();

    int getMyBackgroundColor();

    void refresh();

    void setBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig);

    void setMatrix(@NotNull Matrix adapterMatrix);

    void setMyBackgroundColor(int color);
}
