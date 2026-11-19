package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8665e0;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class TextFunction extends BaseSelectFunction {
    private final ArrayList<RectF> colorRectFList;
    private final ArrayList<RectF> funcRelativeRectFList;
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private float selectGraphOriginWidth;
    private final RectF sizeAdd;
    private final RectF sizeReduce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFunction(IActionListener listener) {
        super(listener);
        AbstractC9133u.m16133g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        this.sizeAdd = new RectF();
        this.sizeReduce = new RectF();
        this.colorRectFList = new ArrayList<>();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final void calculateFunctionRectF() {
        getSelectFunctionRectF().set(getMaxFunctionRectF());
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage()));
        updateFunctionRectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF calculateRectF(String str, Paint paint, RectF rectF) {
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(str, paint, rectF.width()).size();
        if (size > getBoardConfig().getAddTextRectF().height()) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        rectF.bottom = getBoardConfig().getAddTextRectF().height() + rectF.top;
        return rectF;
    }

    private final boolean getSingleGraph() {
        return getSelectGraphList().size() == 1;
    }

    private final void handleHScale(float f10) {
        float firstX = f10 - getFirstX();
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            TextGraph textGraph = (TextGraph) iGraph;
            Matrix matrix = new Matrix();
            matrix.postConcat(textGraph.getRenderMatrix());
            matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            float f11 = this.selectGraphOriginWidth + firstX;
            Paint paint = textGraph.getPaint();
            AbstractC9133u.m16130d(paint);
            String content = textGraph.getContent();
            AbstractC9133u.m16130d(content);
            float fMapRadius = matrix.mapRadius(paint.measureText(String.valueOf(AbstractC8665e0.m14031Y0(content))));
            if (f11 <= getBoardConfig().getSelectIconWidth() * 2 || f11 <= fMapRadius) {
                return;
            }
            float fMapRadius2 = MatrixExtKt.invert(matrix).mapRadius(f11);
            RectF rectF = new RectF(textGraph.getOriginalRectF());
            rectF.right = rectF.left + fMapRadius2;
            String content2 = textGraph.getContent();
            AbstractC9133u.m16130d(content2);
            Paint paint2 = textGraph.getPaint();
            AbstractC9133u.m16130d(paint2);
            textGraph.changeOriginalRectF(calculateRectF(content2, paint2, rectF));
        }
    }

    private final void handleTextSize(float f10) {
        TextGraph textGraph;
        Paint paint;
        StringBuilder sb = new StringBuilder();
        sb.append("TextFunction:TextSize -> offset:");
        sb.append(f10);
        sb.append(" list: ");
        ArrayList<IGraph> selectGraphList = getSelectGraphList();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(selectGraphList, 10));
        Iterator<T> it = selectGraphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        for (IGraph iGraph : getSelectGraphList()) {
            if ((iGraph instanceof TextGraph) && (paint = (textGraph = (TextGraph) iGraph).getPaint()) != null) {
                Matrix matrix = new Matrix();
                matrix.postConcat(iGraph.getRenderMatrix());
                matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
                float fMapRadius = matrix.mapRadius(paint.getTextSize()) + f10;
                if (f10 >= 0.0f || fMapRadius >= getBoardConfig().getAddTextOriginalTextMinSize()) {
                    if (f10 <= 0.0f || fMapRadius <= getBoardConfig().getAddTextOriginalTextMaxSize()) {
                        paint.setTextSize(MatrixExtKt.invert(matrix).mapRadius(fMapRadius));
                        textGraph.setPaint(paint);
                        RectF rectF = new RectF(iGraph.getOriginalRectF());
                        String content = textGraph.getContent();
                        if (content == null) {
                            content = "";
                        }
                        Paint paint2 = textGraph.getPaint();
                        AbstractC9133u.m16130d(paint2);
                        calculateRectF(content, paint2, rectF);
                        textGraph.changeOriginalRectF(rectF);
                        ITextSelectListener textSelectListener = getListener().getTextSelectListener();
                        if (textSelectListener != null) {
                            textSelectListener.textSizeChange(fMapRadius);
                        }
                        IGraphControl graphControl = getGraphControl();
                        String id = iGraph.getId();
                        String content2 = textGraph.getContent();
                        graphControl.changeTextGraph(id, content2 != null ? content2 : "", paint, iGraph.getOriginalRectF());
                        IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum.GraphEnum.TEXT_GRAPH, rectF, null, new Paint(paint), null, null, null, 232, null);
                    }
                }
            }
        }
        getListener().saveSnapshot();
        updateSelectedRectF();
        BaseSelectFunction.showSelectRectF$default(this, false, 1, null);
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
        this.sizeReduce.set(32.0f, (getBoardConfig().getSelectButtonHeight() - 24.0f) / f11, 56.0f, ((getBoardConfig().getSelectButtonHeight() - 24.0f) / f11) + 24.0f);
        this.sizeAdd.set(122.0f, (getBoardConfig().getSelectButtonHeight() - 24.0f) / f11, 146.0f, ((getBoardConfig().getSelectButtonHeight() - 24.0f) / f11) + 24.0f);
        float selectButtonHeight3 = (getBoardConfig().getSelectButtonHeight() - 38.0f) / f11;
        float selectButtonHeight4 = ((getBoardConfig().getSelectButtonHeight() - 38.0f) / f11) + 38.0f;
        int size = getBoardConfig().getSelectNormalColor().size();
        for (int i10 = 0; i10 < size; i10++) {
            float f13 = (i10 * 61.0f) + 23.0f;
            this.colorRectFList.add(new RectF(f13, selectButtonHeight3, f13 + 38.0f, selectButtonHeight4));
        }
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(new NewSelectFunctionType.TextEdit(getSingleGraph(), getBoardConfig().getSelectNormalColor().get(0).intValue()));
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedRectF() {
        getSelectRectF().setEmpty();
        Iterator<T> it = getSelectGraphList().iterator();
        while (it.hasNext()) {
            getSelectRectF().union(((IGraph) it.next()).getMinOutRectF(getMatrixAdapter().getAdapterMatrix()));
        }
        getTransformMatrix().reset();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public RectF getMaxFunctionRectF() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC8778f0.m14578x0(this.funcRelativeRectFList)).right + 15.0f + 8.0f, Math.max(178.0f, ((RectF) AbstractC8778f0.m14578x0(this.colorRectFList)).right + 23.0f)), (getBoardConfig().getSelectButtonHeight() * 3) + 26.0f);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float f10, float f11) {
        TextGraph textGraph;
        Paint paint;
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
                    if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.TextEdit) {
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
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.TextSize.Add) {
            handleTextSize(4.0f);
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.TextSize.Reduce) {
            handleTextSize(-4.0f);
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.Color) {
            NewSelectFunctionMode currentFunctionMode3 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iIntValue = getBoardConfig().getSelectNormalColor().get(((NewSelectFunctionMode.Color) currentFunctionMode3).getIndex()).intValue();
            for (IGraph iGraph : getSelectGraphList()) {
                if ((iGraph instanceof TextGraph) && (paint = (textGraph = (TextGraph) iGraph).getPaint()) != null) {
                    paint.setColor(iIntValue);
                    textGraph.setPaint(paint);
                    IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, null, new Paint(paint), null, null, null, 236, null);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("TextFunction:TextColor -> color:");
            sb.append(iIntValue);
            sb.append(" list: ");
            ArrayList<IGraph> selectGraphList = getSelectGraphList();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(selectGraphList, 10));
            Iterator<T> it2 = selectGraphList.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IGraph) it2.next()).getId());
            }
            sb.append(arrayList);
            AbstractC5380q.m2623s(sb.toString());
            ITextSelectListener textSelectListener = getListener().getTextSelectListener();
            if (textSelectListener != null) {
                textSelectListener.textColorChange(iIntValue);
            }
            getGraphControl().reDrawFixView();
            getListener().saveSnapshot();
            Iterator<T> it3 = this.functionTypeList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((NewSelectFunctionType) next2) instanceof NewSelectFunctionType.TextEdit) {
                    obj = next2;
                    break;
                }
            }
            NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj;
            if (newSelectFunctionType2 != null) {
                ((NewSelectFunctionType.TextEdit) newSelectFunctionType2).setColor(iIntValue);
            }
            showSelectRectF(false);
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleDoubleClick(float f10, float f11) {
        IGraph iGraph;
        if (!AbstractC9133u.m16128b(getCurrentFunctionMode(), NewSelectFunctionMode.Content.INSTANCE) || (iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList())) == null) {
            return false;
        }
        final TextGraph textGraph = (TextGraph) iGraph;
        final String content = textGraph.getContent();
        if (content == null) {
            content = "";
        }
        final RectF rectF = new RectF(textGraph.getOriginalRectF());
        TextEditView textEditView = getBoardConfig().getTextEditView();
        if (textEditView == null) {
            return true;
        }
        textEditView.showEditView(content, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }

            public final void invoke(String it) {
                AbstractC9133u.m16133g(it, "it");
                TextFunction textFunction = TextFunction.this;
                Paint paint = textGraph.getPaint();
                AbstractC9133u.m16130d(paint);
                RectF rectFCalculateRectF = textFunction.calculateRectF(it, paint, new RectF(textGraph.getOriginalRectF()));
                if (!AbstractC9133u.m16128b(rectFCalculateRectF, textGraph.getOriginalRectF())) {
                    textGraph.changeOriginalRectF(rectFCalculateRectF);
                }
                textGraph.setContent(it);
                IGraphControl graphControl = TextFunction.this.getGraphControl();
                String id = textGraph.getId();
                String content2 = textGraph.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                Paint paint2 = textGraph.getPaint();
                AbstractC9133u.m16130d(paint2);
                graphControl.changeTextGraph(id, content2, paint2, textGraph.getOriginalRectF());
                TextFunction.this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(TextFunction.this, false, 1, null);
            }
        }, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }

            public final void invoke(String it) {
                AbstractC9133u.m16133g(it, "it");
                IGraphControl graphControl = TextFunction.this.getGraphControl();
                String id = textGraph.getId();
                String content2 = textGraph.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                Paint paint = textGraph.getPaint();
                AbstractC9133u.m16130d(paint);
                graphControl.changeTextGraph(id, content2, paint, textGraph.getOriginalRectF());
                TextFunction.this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(TextFunction.this, false, 1, null);
                IActionListener listener = TextFunction.this.getListener();
                TextGraph textGraph2 = textGraph;
                IActionListener.DefaultImpls.changeGraph$default(listener, textGraph2, EzyGraphEnum.GraphEnum.TEXT_GRAPH, textGraph2.getOriginalRectF(), textGraph.getContent(), null, null, null, null, 240, null);
                TextFunction.this.getListener().saveSnapshot();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27419invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27419invoke() {
                textGraph.setContent(content);
                if (!AbstractC9133u.m16128b(rectF, textGraph.getOriginalRectF())) {
                    textGraph.changeOriginalRectF(rectF);
                }
                IGraphControl graphControl = this.getGraphControl();
                String id = textGraph.getId();
                String content2 = textGraph.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                Paint paint = textGraph.getPaint();
                AbstractC9133u.m16130d(paint);
                graphControl.changeTextGraph(id, content2, paint, textGraph.getOriginalRectF());
                this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(this, false, 1, null);
            }
        });
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveEnd(float f10, float f11) {
        if (super.handleMoveEnd(f10, f11)) {
            return true;
        }
        if (!AbstractC9133u.m16128b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return false;
        }
        handleHScale(f10);
        updateSelectedRectF();
        calculateFunctionRectF();
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            IGraphControl.DefaultImpls.newChangeHandleEnd$default(getGraphControl(), getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), null, 32, null);
            IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum.GraphEnum.TEXT_GRAPH, iGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
        }
        getListener().saveSnapshot();
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveStart(float f10, float f11) {
        if (!AbstractC9133u.m16128b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return true;
        }
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph == null) {
            return false;
        }
        TextGraph textGraph = (TextGraph) iGraph;
        Matrix matrix = new Matrix();
        matrix.postConcat(textGraph.getRenderMatrix());
        matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
        this.selectGraphOriginWidth = matrix.mapRadius(textGraph.getOriginalRectF().width());
        updateSelectedRectF();
        calculateFunctionRectF();
        IGraph iGraph2 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph2 == null) {
            return true;
        }
        IGraphControl.DefaultImpls.newChangeHandleStart$default(getGraphControl(), (TextGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), null, 64, null);
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoving(float f10, float f11) {
        if (super.handleMoving(f10, f11)) {
            return true;
        }
        if (!AbstractC9133u.m16128b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return false;
        }
        handleHScale(f10);
        updateSelectedRectF();
        calculateFunctionRectF();
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            IGraphControl.DefaultImpls.newChangeHandling$default(getGraphControl(), (TextGraph) iGraph, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), null, 64, null);
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float f10, float f11) {
        Object next;
        if (getFunctionRectF().getTextEdit().contains(f10, f11)) {
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
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.TextEdit) {
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null && newSelectFunctionType.isSelected()) {
            if (getFunctionRectF().getTextSizeAdd().contains(f10, f11)) {
                setCurrentFunctionMode(NewSelectFunctionMode.TextSize.Add.INSTANCE);
                return true;
            }
            if (getFunctionRectF().getTextSizeReduce().contains(f10, f11)) {
                setCurrentFunctionMode(NewSelectFunctionMode.TextSize.Reduce.INSTANCE);
                return true;
            }
            int size = getFunctionRectF().getColorList().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (getFunctionRectF().getColorList().get(i10).contains(f10, f11)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.Color(i10));
                    return true;
                }
            }
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {f10, f11};
        matrixInvert.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth()) / 2;
        RectF rectF = new RectF(getSelectRectF().right - fMapRadius, getSelectRectF().centerY() - fMapRadius, getSelectRectF().right + fMapRadius, getSelectRectF().centerY() + fMapRadius);
        if (getSingleGraph() && rectF.contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Frame.Right.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        initFunctionTypeList();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void setSelectGraphList(List<? extends IGraph> graphList) {
        Object next;
        AbstractC9133u.m16133g(graphList, "graphList");
        super.setSelectGraphList(graphList);
        Iterator<T> it = this.functionTypeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.TextEdit) {
                    break;
                }
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null) {
            NewSelectFunctionType.TextEdit textEdit = (NewSelectFunctionType.TextEdit) newSelectFunctionType;
            textEdit.setSingle(getSingleGraph());
            int color = Integer.MAX_VALUE;
            if (textEdit.isSingle()) {
                Object objM14566l0 = AbstractC8778f0.m14566l0(graphList);
                AbstractC9133u.m16131e(objM14566l0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                Paint paint = ((TextGraph) objM14566l0).getPaint();
                if (paint != null) {
                    color = paint.getColor();
                }
            }
            textEdit.setColor(color);
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        functionRectF.getTextEdit().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        float f10 = 2;
        functionRectF.getTextSizeReduce().set((getSelectFunctionRectF().left + this.sizeReduce.left) - 32.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight() + 13.0f, getSelectFunctionRectF().left + this.sizeReduce.right + 32.0f, getSelectFunctionRectF().top + (getBoardConfig().getSelectButtonHeight() * f10) + 13.0f);
        functionRectF.getTextSizeAdd().set((getSelectFunctionRectF().left + this.sizeAdd.left) - 32.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight() + 13.0f, getSelectFunctionRectF().left + this.sizeAdd.right + 32.0f, getSelectFunctionRectF().top + (getBoardConfig().getSelectButtonHeight() * f10) + 13.0f);
        functionRectF.getColorList().clear();
        for (RectF rectF : this.colorRectFList) {
            functionRectF.getColorList().add(new RectF(getSelectFunctionRectF().left + rectF.left, getSelectFunctionRectF().top + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f10) + rectF.top, getSelectFunctionRectF().left + rectF.right, getSelectFunctionRectF().top + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f10) + rectF.bottom));
        }
        if (isDirectionLeft()) {
            return;
        }
        float f11 = (functionRectF.getDelete().right - functionRectF.getTextEdit().left) + 16.0f;
        functionRectF.getTextEdit().offset(getSelectFunctionRectF().width() - f11, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f11, 0.0f);
        float f12 = functionRectF.getTextSizeAdd().right - functionRectF.getTextSizeReduce().left;
        functionRectF.getTextSizeReduce().offset(getSelectFunctionRectF().width() - f12, 0.0f);
        functionRectF.getTextSizeAdd().offset(getSelectFunctionRectF().width() - f12, 0.0f);
        float f13 = (((RectF) AbstractC8778f0.m14578x0(functionRectF.getColorList())).right - ((RectF) AbstractC8778f0.m14566l0(functionRectF.getColorList())).left) + 46.0f;
        Iterator<T> it = functionRectF.getColorList().iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(getSelectFunctionRectF().width() - f13, 0.0f);
        }
    }
}
