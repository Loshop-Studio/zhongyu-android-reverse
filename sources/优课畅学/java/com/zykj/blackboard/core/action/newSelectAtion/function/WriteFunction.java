package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.IChangeField;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class WriteFunction extends BaseSelectFunction {
    private final ArrayList<RectF> colorRectFList;
    private final ArrayList<RectF> funcRelativeRectFList;
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private boolean isHighlighter;
    private final ArrayList<PointF> strokeWidthPointFList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteFunction(IActionListener listener) {
        super(listener);
        AbstractC9133u.m16133g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        this.strokeWidthPointFList = new ArrayList<>();
        this.colorRectFList = new ArrayList<>();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final void initFunctionRelativeRectF() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((NewSelectFunctionType) obj).getText().length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        float f12 = 23.0f;
        while (it.hasNext()) {
            float fMeasureText = paint.measureText(((NewSelectFunctionType) it.next()).getText());
            this.funcRelativeRectFList.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
        int size = getBoardConfig().getSelectWriteLevel().size();
        float f13 = 16.0f;
        for (int i10 = 0; i10 < size; i10++) {
            float f14 = (((i10 * 3.0f) + 8.0f) / f11) + 19.0f;
            float f15 = f13 + f14;
            this.strokeWidthPointFList.add(new PointF(f15, getBoardConfig().getSelectButtonHeight() / f11));
            f13 = f15 + f14;
        }
        float selectButtonHeight3 = (getBoardConfig().getSelectButtonHeight() - 38.0f) / f11;
        float selectButtonHeight4 = ((getBoardConfig().getSelectButtonHeight() - 38.0f) / f11) + 38.0f;
        int size2 = getBoardConfig().getSelectNormalColor().size();
        for (int i11 = 0; i11 < size2; i11++) {
            float f16 = (i11 * 61.0f) + 23.0f;
            this.colorRectFList.add(new RectF(f16, selectButtonHeight3, f16 + 38.0f, selectButtonHeight4));
        }
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.WriteEdit(false, getBoardConfig().getSelectWriteLevel().get(0).floatValue(), getBoardConfig().getSelectNormalColor().get(0).intValue()));
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public RectF getMaxFunctionRectF() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC8778f0.m14578x0(this.funcRelativeRectFList)).right + 15.0f + 8.0f, Math.max(((PointF) AbstractC8778f0.m14578x0(this.strokeWidthPointFList)).x + ((this.strokeWidthPointFList.size() - 1) * 3.0f) + 8.0f + 16.0f, ((RectF) AbstractC8778f0.m14578x0(this.colorRectFList)).right + 23.0f)), (getBoardConfig().getSelectButtonHeight() * 3) + 26.0f);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float f10, float f11) {
        Paint mPaint;
        Paint mPaint2;
        if (!super.handleClick(f10, f11)) {
            return false;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        Object obj = null;
        if (currentFunctionMode instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode2).getIndex();
            if (index == 0) {
                Iterator<T> it = this.functionTypeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.WriteEdit) {
                        obj = next;
                        break;
                    }
                }
                NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) obj;
                if (newSelectFunctionType != null) {
                    newSelectFunctionType.setSelected(!newSelectFunctionType.isSelected());
                    showSelectRectF(false);
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
            return true;
        }
        if (currentFunctionMode instanceof NewSelectFunctionMode.WriteSize) {
            NewSelectFunctionMode currentFunctionMode3 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize");
            int index2 = ((NewSelectFunctionMode.WriteSize) currentFunctionMode3).getIndex();
            float fFloatValue = this.isHighlighter ? getBoardConfig().getSelectHighlighterLevel().get(index2).floatValue() : getBoardConfig().getSelectWriteLevel().get(index2).floatValue();
            for (IGraph iGraph : getSelectGraphList()) {
                for (IGraph iGraph2 : iGraph.getChildGraph()) {
                    if ((iGraph2 instanceof WritingGraph) && (mPaint2 = ((WritingGraph) iGraph2).getMPaint()) != null) {
                        mPaint2.setStrokeWidth(fFloatValue);
                        IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph2, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(mPaint2), null, null, null, 236, null);
                    }
                    if (iGraph instanceof IChangeField) {
                        ((IChangeField) iGraph).changeUpdate(true);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WriteFunction:WriteSize -> size:");
            sb.append(fFloatValue);
            sb.append(" list: ");
            ArrayList<IGraph> selectGraphList = getSelectGraphList();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(selectGraphList, 10));
            Iterator<T> it2 = selectGraphList.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IGraph) it2.next()).getId());
            }
            sb.append(arrayList);
            AbstractC5380q.m2623s(sb.toString());
            getGraphControl().reDrawFixView();
            getListener().saveSnapshot();
            Iterator<T> it3 = this.functionTypeList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((NewSelectFunctionType) next2) instanceof NewSelectFunctionType.WriteEdit) {
                    obj = next2;
                    break;
                }
            }
            NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj;
            if (newSelectFunctionType2 != null) {
                ((NewSelectFunctionType.WriteEdit) newSelectFunctionType2).setWidth(fFloatValue);
            }
            showSelectRectF(false);
            return true;
        }
        if (!(currentFunctionMode instanceof NewSelectFunctionMode.Color)) {
            return false;
        }
        NewSelectFunctionMode currentFunctionMode4 = getCurrentFunctionMode();
        AbstractC9133u.m16131e(currentFunctionMode4, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
        int iIntValue = getBoardConfig().getSelectNormalColor().get(((NewSelectFunctionMode.Color) currentFunctionMode4).getIndex()).intValue();
        if (this.isHighlighter) {
            iIntValue = (iIntValue & ViewCompat.MEASURED_SIZE_MASK) | (((int) (getBoardConfig().getHighlighterColorAlpha() * 255)) << 24);
        }
        for (IGraph iGraph3 : getSelectGraphList()) {
            for (IGraph iGraph4 : iGraph3.getChildGraph()) {
                if ((iGraph4 instanceof WritingGraph) && (mPaint = ((WritingGraph) iGraph4).getMPaint()) != null) {
                    mPaint.setColor(iIntValue);
                    IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph4, EzyGraphEnum.GraphEnum.STROKE_GRAPH, null, null, new Paint(mPaint), null, null, null, 236, null);
                }
            }
            if (iGraph3 instanceof IChangeField) {
                ((IChangeField) iGraph3).changeUpdate(true);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WriteFunction:Color -> color:");
        sb2.append(iIntValue);
        sb2.append(" list: ");
        ArrayList<IGraph> selectGraphList2 = getSelectGraphList();
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(selectGraphList2, 10));
        Iterator<T> it4 = selectGraphList2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((IGraph) it4.next()).getId());
        }
        sb2.append(arrayList2);
        AbstractC5380q.m2623s(sb2.toString());
        getGraphControl().reDrawFixView();
        getListener().saveSnapshot();
        Iterator<T> it5 = this.functionTypeList.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next3 = it5.next();
            if (((NewSelectFunctionType) next3) instanceof NewSelectFunctionType.WriteEdit) {
                obj = next3;
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType3 = (NewSelectFunctionType) obj;
        if (newSelectFunctionType3 != null) {
            ((NewSelectFunctionType.WriteEdit) newSelectFunctionType3).setColor(iIntValue);
        }
        showSelectRectF(false);
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float f10, float f11) {
        Object next;
        if (getFunctionRectF().getWriteEdit().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionRectF().getDelete().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(1));
            return true;
        }
        Iterator<T> it = this.functionTypeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.WriteEdit) {
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null && newSelectFunctionType.isSelected()) {
            int size = getFunctionRectF().getWriteStrokeWidthList().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (getFunctionRectF().getWriteStrokeWidthList().get(i10).contains(f10, f11)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.WriteSize(i10));
                    return true;
                }
            }
            int size2 = getFunctionRectF().getColorList().size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (getFunctionRectF().getColorList().get(i11).contains(f10, f11)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.Color(i11));
                    return true;
                }
            }
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {f10, f11};
        matrixInvert.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(getSelectRectF().centerX() - f15, getSelectRectF().top - ((5 * fMapRadius) / f14), getSelectRectF().centerX() + f15, getSelectRectF().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f15, getSelectRectF().bottom - f15, getSelectRectF().right + f15, getSelectRectF().bottom + f15).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    public final boolean isHighlighter() {
        return this.isHighlighter;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        initFunctionTypeList();
    }

    public final void setHighlighter(boolean z10) {
        this.isHighlighter = z10;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void setSelectGraphList(List<? extends IGraph> graphList) {
        Object next;
        C8736p c8736p;
        AbstractC9133u.m16133g(graphList, "graphList");
        super.setSelectGraphList(graphList);
        Iterator<T> it = this.functionTypeList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.WriteEdit) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null) {
            Iterator<T> it2 = graphList.iterator();
            boolean z10 = true;
            Integer numValueOf = null;
            Float fValueOf = null;
            while (it2.hasNext()) {
                for (IGraph iGraph : ((IGraph) it2.next()).getChildGraph()) {
                    if (iGraph instanceof WritingGraph) {
                        Paint mPaint = ((WritingGraph) iGraph).getMPaint();
                        if (mPaint != null) {
                            if (fValueOf == null) {
                                fValueOf = Float.valueOf(mPaint.getStrokeWidth());
                                numValueOf = Integer.valueOf(mPaint.getColor());
                            } else {
                                if (!AbstractC9133u.m16127a(fValueOf, mPaint.getStrokeWidth())) {
                                    fValueOf = Float.valueOf(-1.0f);
                                }
                                int color = mPaint.getColor();
                                if (numValueOf == null || numValueOf.intValue() != color) {
                                    numValueOf = Integer.MAX_VALUE;
                                }
                            }
                            if (Color.alpha(mPaint.getColor()) == 255) {
                                z10 = false;
                            }
                            c8736p = C8736p.f16368a;
                        } else {
                            c8736p = null;
                        }
                        if (c8736p == null) {
                        }
                    }
                    z10 = false;
                }
            }
            NewSelectFunctionType.WriteEdit writeEdit = (NewSelectFunctionType.WriteEdit) newSelectFunctionType;
            writeEdit.setHighlighter(z10);
            if (numValueOf != null) {
                writeEdit.setColor(numValueOf.intValue());
            }
            if (fValueOf != null) {
                writeEdit.setWidth(fValueOf.floatValue());
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        int i10 = 0;
        functionRectF.getWriteEdit().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getWriteStrokeWidthList().clear();
        for (Object obj : this.strokeWidthPointFList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            PointF pointF = (PointF) obj;
            float f10 = 2;
            float f11 = ((i10 * 3.0f) + 8.0f) / f10;
            functionRectF.getWriteStrokeWidthList().add(new RectF(((getSelectFunctionRectF().left + pointF.x) - f11) - 19.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight() + 13.0f, getSelectFunctionRectF().left + pointF.x + f11 + 19.0f, getSelectFunctionRectF().top + (getBoardConfig().getSelectButtonHeight() * f10) + 13.0f));
            i10 = i11;
        }
        functionRectF.getColorList().clear();
        for (RectF rectF : this.colorRectFList) {
            float f12 = 2;
            functionRectF.getColorList().add(new RectF(getSelectFunctionRectF().left + rectF.left, getSelectFunctionRectF().top + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f12) + rectF.top, getSelectFunctionRectF().left + rectF.right, getSelectFunctionRectF().top + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f12) + rectF.bottom));
        }
        if (isDirectionLeft()) {
            return;
        }
        float f13 = (functionRectF.getDelete().right - functionRectF.getWriteEdit().left) + 16.0f;
        functionRectF.getWriteEdit().offset(getSelectFunctionRectF().width() - f13, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f13, 0.0f);
        float f14 = (((RectF) AbstractC8778f0.m14578x0(functionRectF.getWriteStrokeWidthList())).right - ((RectF) AbstractC8778f0.m14566l0(functionRectF.getWriteStrokeWidthList())).left) + 32.0f;
        Iterator<T> it = functionRectF.getWriteStrokeWidthList().iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(getSelectFunctionRectF().width() - f14, 0.0f);
        }
        float f15 = (((RectF) AbstractC8778f0.m14578x0(functionRectF.getColorList())).right - ((RectF) AbstractC8778f0.m14566l0(functionRectF.getColorList())).left) + 46.0f;
        Iterator<T> it2 = functionRectF.getColorList().iterator();
        while (it2.hasNext()) {
            ((RectF) it2.next()).offset(getSelectFunctionRectF().width() - f15, 0.0f);
        }
    }
}
