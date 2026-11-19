package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import com.zykj.blackboard.core.graph.IGraph;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class NewSelectGraphControl {
    private final DrawControl drawControl;

    public NewSelectGraphControl(DrawControl drawControl) {
        AbstractC9133u.m16133g(drawControl, "drawControl");
        this.drawControl = drawControl;
    }

    public final void drawNewSelectRectF(float f10, float f11, float f12, float f13) {
        this.drawControl.newSelecting(f10, f11, f12, f13);
    }

    public final void newChangeHandleEnd(IGraph rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        this.drawControl.newTextHandleEnd(rootGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    public final void newChangeHandleStart(IGraph rootGraph, IGraph textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(textGraph, "textGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        this.drawControl.newTextHandleStart(rootGraph, textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    public final void newChangeHandling(IGraph textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(textGraph, "textGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        this.drawControl.newTextHandling(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    public final void drawNewSelectRectF(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        this.drawControl.newSelect(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }
}
