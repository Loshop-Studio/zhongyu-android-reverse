package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.utils.MatrixExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class DefaultFunction extends BaseSelectFunction {
    private final RectF deleteRelativeRectF;
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private boolean hasTextGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFunction(IActionListener listener) {
        super(listener);
        AbstractC9133u.m16133g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.deleteRelativeRectF = new RectF();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final void initFunctionRelativeRectF() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float fMeasureText = paint.measureText(NewSelectFunctionType.Delete.INSTANCE.getText());
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        this.deleteRelativeRectF.set(23.0f, (getBoardConfig().getSelectButtonHeight() - f10) / f11, fMeasureText + 23.0f, ((getBoardConfig().getSelectButtonHeight() - f10) / f11) + f10);
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        if (!this.hasTextGraph) {
            this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
            this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        }
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    public final boolean getHasTextGraph() {
        return this.hasTextGraph;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public RectF getMaxFunctionRectF() {
        return new RectF(0.0f, 0.0f, this.deleteRelativeRectF.width() + 46.0f, getBoardConfig().getSelectButtonHeight());
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float f10, float f11) {
        if (!super.handleClick(f10, f11)) {
            return false;
        }
        if (!(getCurrentFunctionMode() instanceof NewSelectFunctionMode.Function)) {
            return true;
        }
        getGraphControl().delete(getSelectGraphList());
        getGraphControl().selectCancel();
        getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
        getListener().saveSnapshot();
        reset();
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float f10, float f11) {
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {f10, f11};
        matrixInvert.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        if (this.functionTypeList.contains(NewSelectFunctionType.Rotate.INSTANCE)) {
            float f14 = 2;
            float f15 = fMapRadius / f14;
            if (new RectF(getSelectRectF().centerX() - f15, getSelectRectF().top - ((5 * fMapRadius) / f14), getSelectRectF().centerX() + f15, getSelectRectF().top - ((3 * fMapRadius) / f14)).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
                return true;
            }
        }
        if (this.functionTypeList.contains(NewSelectFunctionType.Scale.INSTANCE)) {
            float f16 = fMapRadius / 2;
            if (new RectF(getSelectRectF().right - f16, getSelectRectF().bottom - f16, getSelectRectF().right + f16, getSelectRectF().bottom + f16).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
                return true;
            }
        }
        if (getSelectRectF().contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        if (getFunctionRectF().getDelete().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        setHasTextGraph(false);
        initFunctionTypeList();
    }

    public final void setHasTextGraph(boolean z10) {
        this.hasTextGraph = z10;
        Iterator<NewSelectFunctionType> it = this.functionTypeList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (it.next() instanceof NewSelectFunctionType.Rotate) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            this.functionTypeList.remove(i10);
        }
        if (!z10) {
            this.functionTypeList.add(0, NewSelectFunctionType.Rotate.INSTANCE);
        }
        Iterator<NewSelectFunctionType> it2 = this.functionTypeList.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next() instanceof NewSelectFunctionType.Scale) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            this.functionTypeList.remove(i11);
        }
        if (z10) {
            return;
        }
        this.functionTypeList.add(0, NewSelectFunctionType.Scale.INSTANCE);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        getFunctionRectF().getDelete().set((getSelectFunctionRectF().left + this.deleteRelativeRectF.left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.deleteRelativeRectF.right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
    }
}
