package com.zykj.blackboard.core.edit;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "", "Landroid/graphics/RectF;", "renderRectF", "visibleRectF", "Ld6/s;", "onRenderChange", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "Landroid/graphics/Matrix;", "matrix", "onCameraChange", "(Landroid/graphics/Matrix;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface RenderChangeListener {
    void onCameraChange(@NotNull Matrix matrix);

    void onRenderChange(@NotNull RectF renderRectF, @NotNull RectF visibleRectF);
}
