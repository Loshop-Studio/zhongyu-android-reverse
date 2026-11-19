package com.zykj.blackboard.core.canvas.view;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;", "", "Ld6/s;", "refresh", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Matrix;", "matrix", "draw", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V", "clear", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ActiveLayer {
    void clear();

    void draw(@NotNull Bitmap bitmap, @Nullable Matrix matrix);

    void draw(@NotNull Path path, @NotNull Paint paint, @Nullable Matrix matrix);

    void refresh();
}
