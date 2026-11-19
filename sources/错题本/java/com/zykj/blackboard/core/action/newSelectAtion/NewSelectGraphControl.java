package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionBackgroundRectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import com.zykj.blackboard.core.graph.IGraph;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJM\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\f\u0010\u001cJ]\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b \u0010!JU\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\"\u0010#JU\u0010$\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006&"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;", "", "Lcom/zykj/blackboard/core/canvas/control/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V", "", "l", "t", "r", "b", "Ld6/s;", "drawNewSelectRectF", "(FFFF)V", "Landroid/graphics/RectF;", "selectRectF", "Landroid/graphics/Matrix;", "matrix", "selectFunctionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "functionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "typeList", "Landroid/graphics/PointF;", "pointF", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "Lcom/zykj/blackboard/core/graph/IGraph;", "rootGraph", "textGraph", "newChangeHandleStart", "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newChangeHandling", "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newChangeHandleEnd", "Lcom/zykj/blackboard/core/canvas/control/DrawControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewSelectGraphControl {

    @NotNull
    private final DrawControl drawControl;

    public NewSelectGraphControl(@NotNull DrawControl drawControl) {
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.drawControl = drawControl;
    }

    public final void drawNewSelectRectF(float l, float t8, float r, float b6) {
        this.drawControl.newSelecting(l, t8, r, b6);
    }

    public final void newChangeHandleEnd(@NotNull IGraph rootGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        this.drawControl.newTextHandleEnd(rootGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    public final void newChangeHandleStart(@NotNull IGraph rootGraph, @NotNull IGraph textGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(textGraph, "textGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        this.drawControl.newTextHandleStart(rootGraph, textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    public final void newChangeHandling(@NotNull IGraph textGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(textGraph, "textGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        this.drawControl.newTextHandling(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    public final void drawNewSelectRectF(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        this.drawControl.newSelect(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }
}
