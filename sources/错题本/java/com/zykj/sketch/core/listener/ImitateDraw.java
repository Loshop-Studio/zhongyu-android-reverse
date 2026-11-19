package com.zykj.sketch.core.listener;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/ImitateDraw;", "", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "Ld6/s;", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "Landroid/graphics/Matrix;", "matrix", "graphMatrix", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "clearGraph", "()V", "Landroid/graphics/Bitmap;", "bitmap", "drawThumbnail", "(Landroid/graphics/Bitmap;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ImitateDraw {
    void clearGraph();

    void drawPath(@NotNull Path path, @NotNull Paint paint);

    void drawThumbnail(@Nullable Bitmap bitmap);

    void graphMatrix(@Nullable Matrix matrix);

    void setLimitDrawArea(@Nullable RectF rectF);
}
