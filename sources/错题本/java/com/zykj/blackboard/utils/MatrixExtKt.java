package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyMatrix$Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p020b4.C3115b0;

@Metadata(m5109d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\b¨\u0006\f"}, m5110d2 = {"getScaleX", "", "Landroid/graphics/Matrix;", "invert", "mapRect", "Landroid/graphics/RectF;", "matrix", "toEzyMatrix", "Lcom/zykj/board/EzyMatrix$Matrix;", "eventTime", "", "toMatrix", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MatrixExtKt {
    public static final float getScaleX(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }

    @NotNull
    public static final Matrix invert(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    @NotNull
    public static final RectF mapRect(@NotNull RectF rectF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(rectF, "<this>");
        AbstractC5830k.m5330g(matrix, "matrix");
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    @NotNull
    public static final EzyMatrix$Matrix toEzyMatrix(@NotNull Matrix matrix, long j7) {
        AbstractC5830k.m5330g(matrix, "<this>");
        C3115b0 c3115b0NewBuilder = EzyMatrix$Matrix.newBuilder();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        c3115b0NewBuilder.m2083q(fArr[2]);
        c3115b0NewBuilder.m2084r(fArr[5]);
        c3115b0NewBuilder.m2079m(fArr[0]);
        c3115b0NewBuilder.m2080n(fArr[4]);
        c3115b0NewBuilder.m2081o(fArr[1]);
        c3115b0NewBuilder.m2082p(fArr[3]);
        c3115b0NewBuilder.m2076j(fArr[6]);
        c3115b0NewBuilder.m2077k(fArr[7]);
        c3115b0NewBuilder.m2078l(fArr[8]);
        c3115b0NewBuilder.m2075i(j7);
        return c3115b0NewBuilder.build();
    }

    @NotNull
    public static final Matrix toMatrix(@NotNull EzyMatrix$Matrix ezyMatrix$Matrix) {
        AbstractC5830k.m5330g(ezyMatrix$Matrix, "<this>");
        Matrix matrix = new Matrix();
        float transX = ezyMatrix$Matrix.getTransX();
        float transY = ezyMatrix$Matrix.getTransY();
        matrix.setValues(new float[]{ezyMatrix$Matrix.getScaleX(), ezyMatrix$Matrix.getSkewX(), transX, ezyMatrix$Matrix.getSkewY(), ezyMatrix$Matrix.getScaleY(), transY, ezyMatrix$Matrix.getPerSp0(), ezyMatrix$Matrix.getPerSp1(), ezyMatrix$Matrix.getPerSp2()});
        return matrix;
    }
}
