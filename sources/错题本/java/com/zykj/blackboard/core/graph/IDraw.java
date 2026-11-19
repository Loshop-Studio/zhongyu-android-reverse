package com.zykj.blackboard.core.graph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/IDraw;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "render", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "Lkotlin/Function1;", "Lcom/zykj/blackboard/core/graph/IGraph;", "", "interceptRendVoid", "isScreenCanvas", "isComplete", "onDraw", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IDraw {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void onDraw$default(IDraw iDraw, Canvas canvas, Matrix matrix, InterfaceC6471c interfaceC6471c, boolean z8, boolean z9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw");
            }
            if ((i & 4) != 0) {
                interfaceC6471c = null;
            }
            InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
            if ((i & 8) != 0) {
                z8 = true;
            }
            boolean z10 = z8;
            if ((i & 16) != 0) {
                z9 = false;
            }
            iDraw.onDraw(canvas, matrix, interfaceC6471c2, z10, z9);
        }
    }

    void onDraw(@NotNull Canvas canvas, @NotNull Matrix matrix, @Nullable InterfaceC6471c interceptRendVoid, boolean isScreenCanvas, boolean isComplete);

    void render(@NotNull Canvas canvas, @NotNull Matrix matrix);
}
