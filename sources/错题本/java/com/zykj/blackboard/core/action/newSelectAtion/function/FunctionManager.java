package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001dJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u001dJ\u001d\u0010$\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0010J\u001d\u0010%\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b%\u0010\u0010J\u001d\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b&\u0010\u0010J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b'\u0010 J\u001d\u0010(\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b(\u0010 J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;", "", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "Ld6/s;", "initCurrentFunction", "(Ljava/util/List;)V", "", "x", "y", "setFirstPoint", "(FF)V", "Landroid/graphics/RectF;", "rectF", "setSelectRectF", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/PointF;", "pointF", "setSingleGraphData", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V", "setSelectGraphList", "updateFunctionRectF", "()V", "", "isClickInSelectFunction", "(FF)Z", "initForFunctionTouch", "reset", "showSelectRectF", "handleMoveStart", "handleMoving", "handleMoveEnd", "handleClick", "handleDoubleClick", "Landroid/view/MotionEvent;", "motionEvent", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;", "defaultFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;", "writeFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;", "textFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;", "geometryFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;", "imageFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "currentFunction", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FunctionManager {

    @Nullable
    private BaseSelectFunction currentFunction;

    @NotNull
    private final DefaultFunction defaultFunction;

    @NotNull
    private final GeometryFunction geometryFunction;

    @NotNull
    private final ImageFunction imageFunction;

    @NotNull
    private final TextFunction textFunction;

    @NotNull
    private final WriteFunction writeFunction;

    public FunctionManager(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.defaultFunction = new DefaultFunction(listener);
        this.writeFunction = new WriteFunction(listener);
        this.textFunction = new TextFunction(listener);
        this.geometryFunction = new GeometryFunction(listener);
        this.imageFunction = new ImageFunction(listener);
    }

    public final boolean handleClick(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.handleClick(x3, y2);
        }
        return false;
    }

    public final boolean handleDoubleClick(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.handleDoubleClick(x3, y2);
        }
        return false;
    }

    public final void handleMoveEnd(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoveEnd(x3, y2);
        }
    }

    public final void handleMoveStart(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoveStart(x3, y2);
        }
    }

    public final void handleMoving(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.handleMoving(x3, y2);
        }
    }

    public final void handleTouchEvent(@NotNull MotionEvent motionEvent) {
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
        Object obj = this.currentFunction;
        ICustomColorFunction iCustomColorFunction = obj instanceof ICustomColorFunction ? (ICustomColorFunction) obj : null;
        if (iCustomColorFunction != null) {
            iCustomColorFunction.handleTouchEvent(motionEvent);
        }
    }

    public final void initCurrentFunction(@NotNull List<? extends IGraph> graphList) {
        BaseSelectFunction baseSelectFunction;
        AbstractC5830k.m5330g(graphList, "graphList");
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (IGraph iGraph : graphList) {
            if (iGraph instanceof TextGraph) {
                i9++;
            } else if (iGraph instanceof GeometryGraph) {
                i10++;
            } else if (iGraph instanceof ImageGraph) {
                i11++;
            }
            for (IGraph iGraph2 : iGraph.getChildGraph()) {
                if (iGraph2 instanceof WritingGraph) {
                    if (((WritingGraph) iGraph2).isHighlighter()) {
                        i8++;
                    } else {
                        i++;
                    }
                }
            }
        }
        int i12 = i + i8 + i9 + i10 + i11;
        if (i12 == 0) {
            DefaultFunction defaultFunction = this.defaultFunction;
            defaultFunction.setHasTextGraph(false);
            baseSelectFunction = defaultFunction;
        } else if (i12 == i) {
            WriteFunction writeFunction = this.writeFunction;
            writeFunction.setHighlighter(false);
            baseSelectFunction = writeFunction;
        } else if (i12 == i8) {
            WriteFunction writeFunction2 = this.writeFunction;
            writeFunction2.setHighlighter(true);
            baseSelectFunction = writeFunction2;
        } else if (i12 == i9) {
            baseSelectFunction = this.textFunction;
        } else if (i12 == i10) {
            baseSelectFunction = this.geometryFunction;
        } else if (i12 == i11) {
            baseSelectFunction = i12 == 1 ? this.imageFunction : this.defaultFunction;
        } else {
            DefaultFunction defaultFunction2 = this.defaultFunction;
            defaultFunction2.setHasTextGraph(i9 > 0);
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

    public final boolean isClickInSelectFunction(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            return baseSelectFunction.isClickInSelectFunction(x3, y2);
        }
        return false;
    }

    public final void reset() {
        Object obj = this.currentFunction;
        ICustomColorFunction iCustomColorFunction = obj instanceof ICustomColorFunction ? (ICustomColorFunction) obj : null;
        if (iCustomColorFunction != null) {
            iCustomColorFunction.handleCustomColorUsed();
        }
        this.defaultFunction.reset();
        this.writeFunction.reset();
        this.textFunction.reset();
        this.geometryFunction.reset();
        this.currentFunction = null;
    }

    public final void setFirstPoint(float x3, float y2) {
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setFirstPoint(x3, y2);
        }
    }

    public final void setSelectGraphList(@NotNull List<? extends IGraph> graphList) {
        AbstractC5830k.m5330g(graphList, "graphList");
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setSelectGraphList(graphList);
        }
    }

    public final void setSelectRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        BaseSelectFunction baseSelectFunction = this.currentFunction;
        if (baseSelectFunction != null) {
            baseSelectFunction.setSelectRectF(rectF);
        }
    }

    public final void setSingleGraphData(@NotNull RectF rectF, @NotNull Matrix matrix, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
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
