package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class FunctionManager {
    private BaseSelectFunction currentFunction;
    private final DefaultFunction defaultFunction;
    private final GeometryFunction geometryFunction;
    private final ImageFunction imageFunction;
    private final TextFunction textFunction;
    private final WriteFunction writeFunction;

    public FunctionManager(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.defaultFunction = new DefaultFunction(listener);
        this.writeFunction = new WriteFunction(listener);
        this.textFunction = new TextFunction(listener);
        this.geometryFunction = new GeometryFunction(listener);
        this.imageFunction = new ImageFunction(listener);
    }

    public final boolean handleClick(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.handleClick(f10, f11);
        }
        return false;
    }

    public final boolean handleDoubleClick(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.handleDoubleClick(f10, f11);
        }
        return false;
    }

    public final void handleMoveEnd(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoveEnd(f10, f11);
        }
    }

    public final void handleMoveStart(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoveStart(f10, f11);
        }
    }

    public final void handleMoving(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoving(f10, f11);
        }
    }

    public final void initCurrentFunction(List<? extends IGraph> graphList) {
        BaseSelectFunction baseSelectFunction;
        AbstractC9133u.m16133g(graphList, "graphList");
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (IGraph iGraph : graphList) {
            if (iGraph instanceof TextGraph) {
                i12++;
            } else if (iGraph instanceof GeometryGraph) {
                i13++;
            } else if (iGraph instanceof ImageGraph) {
                i14++;
            }
            for (IGraph iGraph2 : iGraph.getChildGraph()) {
                if (iGraph2 instanceof WritingGraph) {
                    if (((WritingGraph) iGraph2).isHighlighter()) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
            }
        }
        int i15 = i10 + i11 + i12 + i13 + i14;
        if (i15 == 0) {
            DefaultFunction defaultFunction = this.defaultFunction;
            defaultFunction.setHasTextGraph(false);
            baseSelectFunction = defaultFunction;
        } else if (i15 == i10) {
            WriteFunction writeFunction = this.writeFunction;
            writeFunction.setHighlighter(false);
            baseSelectFunction = writeFunction;
        } else if (i15 == i11) {
            WriteFunction writeFunction2 = this.writeFunction;
            writeFunction2.setHighlighter(true);
            baseSelectFunction = writeFunction2;
        } else if (i15 == i12) {
            baseSelectFunction = this.textFunction;
        } else if (i15 == i13) {
            baseSelectFunction = this.geometryFunction;
        } else if (i15 == i14) {
            baseSelectFunction = i15 == 1 ? this.imageFunction : this.defaultFunction;
        } else {
            DefaultFunction defaultFunction2 = this.defaultFunction;
            defaultFunction2.setHasTextGraph(i12 > 0);
            baseSelectFunction = defaultFunction2;
        }
        this.currentFunction = baseSelectFunction;
    }

    public final void initForFunctionTouch() {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.initForFunctionTouch();
        }
    }

    public final boolean isClickInSelectFunction(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.isClickInSelectFunction(f10, f11);
        }
        return false;
    }

    public final void reset() {
        this.defaultFunction.reset();
        this.writeFunction.reset();
        this.textFunction.reset();
        this.geometryFunction.reset();
        this.currentFunction = null;
    }

    public final void setFirstPoint(float f10, float f11) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setFirstPoint(f10, f11);
        }
    }

    public final void setSelectGraphList(List<? extends IGraph> graphList) {
        AbstractC9133u.m16133g(graphList, "graphList");
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setSelectGraphList(graphList);
        }
    }

    public final void setSelectRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setSelectRectF(rectF);
        }
    }

    public final void setSingleGraphData(RectF rectF, Matrix matrix, PointF pointF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setSingleGraphData(rectF, matrix, pointF);
        }
    }

    public final void showSelectRectF() {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            BaseSelectFunction.showSelectRectF$default(baseSelectFunction, false, 1, null);
        }
    }

    public final void updateFunctionRectF() {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.updateFunctionRectF();
        }
    }
}
