package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt;
import com.zykj.blackboard.core.action.newSelectAtion.SelectColor;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u001d\u0010\u001f\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001cH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000fJ\u001f\u0010,\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010%J\u001f\u0010-\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010%J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\u000fJ\u001f\u00103\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010%J\u001f\u00104\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u0010%J\u001f\u00105\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u0010%R$\u00107\u001a\u0004\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020(0=j\b\u0012\u0004\u0012\u00020(`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00160=j\b\u0012\u0004\u0012\u00020\u0016`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u00160=j\b\u0012\u0004\u0012\u00020\u0016`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010M\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010*¨\u0006N"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/TextFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "handleTextSize", "(F)V", "x", "handleHScale", "initFunctionTypeList", "()V", "initFunctionRelativeRectF", "recalculateColorRectFList", "", "content", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/RectF;", "rectF", "calculateRectF", "(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;", "updateSelectedRectF", "calculateFunctionRectF", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "setSelectGraphList", "(Ljava/util/List;)V", "updateFunctionRectF", "y", "", "isClickInSelectFunction", "(FF)Z", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "reset", "handleClick", "handleDoubleClick", "Landroid/view/MotionEvent;", "motionEvent", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "handleCustomColorUsed", "handleMoveStart", "handleMoving", "handleMoveEnd", "", "lastChangeColor", "Ljava/lang/Integer;", "getLastChangeColor", "()Ljava/lang/Integer;", "setLastChangeColor", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "functionTypeList", "Ljava/util/ArrayList;", "funcRelativeRectFList", "sizeAdd", "Landroid/graphics/RectF;", "sizeReduce", "colorRectFList", "selectGraphOriginWidth", "F", "getSingleGraph", "()Z", "singleGraph", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "getFunctionColorList", "functionColorList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextFunction extends BaseSelectFunction implements ICustomColorFunction {

    @NotNull
    private final ArrayList<RectF> colorRectFList;

    @NotNull
    private final ArrayList<RectF> funcRelativeRectFList;

    @NotNull
    private final ArrayList<NewSelectFunctionType> functionTypeList;

    @Nullable
    private Integer lastChangeColor;
    private float selectGraphOriginWidth;

    @NotNull
    private final RectF sizeAdd;

    @NotNull
    private final RectF sizeReduce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFunction(@NotNull IActionListener listener) {
        super(listener);
        AbstractC5830k.m5330g(listener, "listener");
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
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage(), getSelectSizePair()));
        updateFunctionRectF();
        updateFunctionBackgroundRectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF calculateRectF(String content, Paint paint, RectF rectF) {
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(content, paint, rectF.width()).size();
        if (size > getBoardConfig().getAddTextRectF().height()) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        rectF.bottom = getBoardConfig().getAddTextRectF().height() + rectF.top;
        return rectF;
    }

    private final List<SelectColor> getFunctionColorList() {
        NewSelectFunctionType.TextEdit textEditType = NewSelectFunctionTypeKt.getTextEditType(this.functionTypeList);
        if (textEditType != null) {
            return textEditType.getColorList();
        }
        return null;
    }

    private final boolean getSingleGraph() {
        return getSelectGraphList().size() == 1;
    }

    private final void handleHScale(float x3) {
        float firstX = x3 - getFirstX();
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            TextGraph textGraph = (TextGraph) iGraph;
            Matrix matrix = new Matrix();
            matrix.postConcat(textGraph.getRenderMatrix());
            matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            float f = this.selectGraphOriginWidth + firstX;
            Paint paint = textGraph.getPaint();
            AbstractC5830k.m5327d(paint);
            String content = textGraph.getContent();
            AbstractC5830k.m5327d(content);
            if (content.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            float fMapRadius = matrix.mapRadius(paint.measureText(String.valueOf(content.charAt(0))));
            if (f <= getBoardConfig().getSelectIconWidth() * 2 || f <= fMapRadius) {
                return;
            }
            float fMapRadius2 = MatrixExtKt.invert(matrix).mapRadius(f);
            RectF rectF = new RectF(textGraph.getOriginalRectF());
            rectF.right = rectF.left + fMapRadius2;
            String content2 = textGraph.getContent();
            AbstractC5830k.m5327d(content2);
            Paint paint2 = textGraph.getPaint();
            AbstractC5830k.m5327d(paint2);
            textGraph.changeOriginalRectF(calculateRectF(content2, paint2, rectF));
        }
    }

    private final void handleTextSize(float offset) {
        TextGraph textGraph;
        Paint paint;
        StringBuilder sb = new StringBuilder("TextFunction:TextSize -> offset:");
        sb.append(offset);
        sb.append(" list: ");
        ArrayList<IGraph> selectGraphList = getSelectGraphList();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(selectGraphList, 10));
        int size = selectGraphList.size();
        int i = 0;
        while (i < size) {
            IGraph iGraph = selectGraphList.get(i);
            i++;
            arrayList.add(iGraph.getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
        ArrayList<IGraph> selectGraphList2 = getSelectGraphList();
        int size2 = selectGraphList2.size();
        int i8 = 0;
        while (i8 < size2) {
            IGraph iGraph2 = selectGraphList2.get(i8);
            i8++;
            IGraph iGraph3 = iGraph2;
            if ((iGraph3 instanceof TextGraph) && (paint = (textGraph = (TextGraph) iGraph3).getPaint()) != null) {
                Matrix matrix = new Matrix();
                matrix.postConcat(iGraph3.getRenderMatrix());
                matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
                float fMapRadius = matrix.mapRadius(paint.getTextSize()) + offset;
                if (offset >= 0.0f || fMapRadius >= getBoardConfig().getAddTextOriginalTextMinSize()) {
                    if (offset <= 0.0f || fMapRadius <= getBoardConfig().getAddTextOriginalTextMaxSize()) {
                        paint.setTextSize(MatrixExtKt.invert(matrix).mapRadius(fMapRadius));
                        textGraph.setPaint(paint);
                        RectF rectF = new RectF(iGraph3.getOriginalRectF());
                        String content = textGraph.getContent();
                        if (content == null) {
                            content = "";
                        }
                        Paint paint2 = textGraph.getPaint();
                        AbstractC5830k.m5327d(paint2);
                        calculateRectF(content, paint2, rectF);
                        textGraph.changeOriginalRectF(rectF);
                        ITextSelectListener textSelectListener = getListener().getTextSelectListener();
                        if (textSelectListener != null) {
                            textSelectListener.textSizeChange(fMapRadius);
                        }
                        IGraphControl graphControl = getGraphControl();
                        String id = iGraph3.getId();
                        String content2 = textGraph.getContent();
                        graphControl.changeTextGraph(id, content2 != null ? content2 : "", paint, iGraph3.getOriginalRectF());
                        IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph3, EzyGraphEnum$GraphEnum.TEXT_GRAPH, rectF, null, new Paint(paint), null, null, null, 232, null);
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
        float f = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f7 = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - f) / f7;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - f) / f7) + f;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            NewSelectFunctionType newSelectFunctionType = arrayList.get(i8);
            i8++;
            if (newSelectFunctionType.getText().length() > 0) {
                arrayList2.add(newSelectFunctionType);
            }
        }
        int size2 = arrayList2.size();
        float f8 = 23.0f;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            float fMeasureText = paint.measureText(((NewSelectFunctionType) obj).getText());
            this.funcRelativeRectFList.add(new RectF(f8, selectButtonHeight, f8 + fMeasureText, selectButtonHeight2));
            f8 += fMeasureText + 30.0f;
        }
        this.sizeReduce.set(32.0f, (getBoardConfig().getSelectButtonHeight() - 24.0f) / f7, 56.0f, ((getBoardConfig().getSelectButtonHeight() - 24.0f) / f7) + 24.0f);
        this.sizeAdd.set(122.0f, (getBoardConfig().getSelectButtonHeight() - 24.0f) / f7, 146.0f, ((getBoardConfig().getSelectButtonHeight() - 24.0f) / f7) + 24.0f);
        recalculateColorRectFList();
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(new NewSelectFunctionType.TextEdit(getSingleGraph(), NewSelectFunctionTypeKt.createSelectColorList(getBoardConfig().getSelectEditColorList())));
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    private final void recalculateColorRectFList() {
        this.colorRectFList.clear();
        float f = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - 38.0f) / f;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - 38.0f) / f) + 38.0f;
        int size = NewSelectFunctionTypeKt.createSelectColorList(getBoardConfig().getSelectEditColorList()).size();
        for (int i = 0; i < size; i++) {
            float f7 = (i * 61.0f) + 23.0f;
            this.colorRectFList.add(new RectF(f7, selectButtonHeight, f7 + 38.0f, selectButtonHeight2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedRectF() {
        getSelectRectF().setEmpty();
        ArrayList<IGraph> selectGraphList = getSelectGraphList();
        int size = selectGraphList.size();
        int i = 0;
        while (i < size) {
            IGraph iGraph = selectGraphList.get(i);
            i++;
            getSelectRectF().union(iGraph.getMinOutRectF(getMatrixAdapter().getAdapterMatrix()));
        }
        getTransformMatrix().reset();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @NotNull
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.ICustomColorFunction
    @Nullable
    public Integer getLastChangeColor() {
        return this.lastChangeColor;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF getMaxFunctionRectF() {
        /*
            r8 = this;
            java.util.ArrayList<android.graphics.RectF> r0 = r8.funcRelativeRectFList
            java.lang.Object r0 = kotlin.collections.AbstractC5805t.m5235o0(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList<android.graphics.RectF> r1 = r8.colorRectFList
            java.lang.Object r1 = kotlin.collections.AbstractC5805t.m5235o0(r1)
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            float r1 = r1.right
            r2 = 1102577664(0x41b80000, float:23.0)
            float r1 = r1 + r2
            r2 = 1128202240(0x433f0000, float:191.0)
            float r1 = r1 + r2
            java.util.List r2 = r8.getFunctionColorList()
            r3 = 0
            if (r2 == 0) goto L2c
            com.zykj.blackboard.core.action.newSelectAtion.SelectColor$Custom r2 = com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt.getCustomColor(r2)
            goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            com.zykj.blackboard.bean.BoardConfig r4 = r8.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r4 = r4.getSelectCustomColorView()
            r5 = 0
            if (r4 == 0) goto L48
            if (r2 == 0) goto L40
            goto L41
        L40:
            r4 = r3
        L41:
            if (r4 == 0) goto L48
            float r4 = r4.getWidth()
            goto L49
        L48:
            r4 = r5
        L49:
            com.zykj.blackboard.bean.BoardConfig r6 = r8.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r6 = r6.getSelectCustomColorView()
            r7 = 1095761920(0x41500000, float:13.0)
            if (r6 == 0) goto L60
            if (r2 == 0) goto L58
            r3 = r6
        L58:
            if (r3 == 0) goto L60
            float r2 = r3.getHeight()
            float r2 = r2 + r7
            goto L61
        L60:
            r2 = r5
        L61:
            kotlin.Pair r3 = new kotlin.Pair
            float r0 = java.lang.Math.max(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.zykj.blackboard.bean.BoardConfig r1 = r8.getBoardConfig()
            float r1 = r1.getSelectButtonHeight()
            r6 = 2
            float r6 = (float) r6
            float r1 = r1 * r6
            float r1 = r1 + r7
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.<init>(r0, r1)
            r8.setSelectSizePair(r3)
            kotlin.Pair r0 = r8.getSelectSizePair()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r4)
            kotlin.Pair r1 = r8.getSelectSizePair()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.getMaxFunctionRectF():android.graphics.RectF"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:2334
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float x3, float y2) {
        if (!super.handleClick(x3, y2)) {
            return false;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode2).getIndex();
            if (index == 0) {
                NewSelectFunctionType.TextEdit textEditType = NewSelectFunctionTypeKt.getTextEditType(this.functionTypeList);
                if (textEditType != null) {
                    textEditType.setSelected(!textEditType.getIsSelected());
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
            AbstractC5830k.m5328e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int index2 = ((NewSelectFunctionMode.Color) currentFunctionMode3).getIndex();
            final List<SelectColor> functionColorList = getFunctionColorList();
            if (functionColorList == null) {
                return true;
            }
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleClick$changeColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(int i) {
                    TextGraph textGraph;
                    Paint paint;
                    ArrayList<IGraph> selectGraphList = this.this$0.getSelectGraphList();
                    TextFunction textFunction = this.this$0;
                    int size = selectGraphList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        IGraph iGraph = selectGraphList.get(i8);
                        i8++;
                        IGraph iGraph2 = iGraph;
                        if ((iGraph2 instanceof TextGraph) && (paint = (textGraph = (TextGraph) iGraph2).getPaint()) != null) {
                            paint.setColor(i);
                            textGraph.setPaint(paint);
                            IActionListener.DefaultImpls.changeGraph$default(textFunction.getListener(), iGraph2, EzyGraphEnum$GraphEnum.TEXT_GRAPH, null, null, new Paint(paint), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sbM94s = AbstractC0037f.m94s(i, "TextFunction:TextColor -> color:", " list: ");
                    ArrayList<IGraph> selectGraphList2 = this.this$0.getSelectGraphList();
                    ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(selectGraphList2, 10));
                    int size2 = selectGraphList2.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        IGraph iGraph3 = selectGraphList2.get(i9);
                        i9++;
                        arrayList.add(iGraph3.getId());
                    }
                    sbM94s.append(arrayList);
                    AbstractC3387g.m2342e(sbM94s.toString());
                    ITextSelectListener textSelectListener = this.this$0.getListener().getTextSelectListener();
                    if (textSelectListener != null) {
                        textSelectListener.textColorChange(i);
                    }
                    this.this$0.getGraphControl().reDrawFixView();
                    this.this$0.getListener().saveSnapshot();
                    List<SelectColor> list = functionColorList;
                    final TextFunction textFunction2 = this.this$0;
                    NewSelectFunctionTypeKt.handleWithColor(list, i, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        @NotNull
                        public final Boolean invoke(int i10) {
                            CustomColorView selectCustomColorView = textFunction2.getBoardConfig().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.isColorExist(i10) : false);
                        }
                    });
                    TextFunction textFunction3 = this.this$0;
                    SelectColor.Custom customColor = NewSelectFunctionTypeKt.getCustomColor(functionColorList);
                    textFunction3.setLastChangeColor(customColor != null ? Integer.valueOf(customColor.getValue()) : null);
                    this.this$0.showSelectRectF(false);
                }
            };
            if (functionColorList.get(index2) instanceof SelectColor.Custom) {
                SelectColor.Custom customColor = NewSelectFunctionTypeKt.getCustomColor(functionColorList);
                if (customColor == null || !customColor.getIsOpen()) {
                    if (customColor != null) {
                        customColor.setOpen(true);
                    }
                    CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
                    if (selectCustomColorView != null) {
                        selectCustomColorView.setChangeColor(interfaceC6471c);
                    }
                    SelectColor.Custom customColor2 = NewSelectFunctionTypeKt.getCustomColor(functionColorList);
                    int value = customColor2 != null ? customColor2.getValue() : 0;
                    CustomColorView selectCustomColorView2 = getBoardConfig().getSelectCustomColorView();
                    if (selectCustomColorView2 == null || !selectCustomColorView2.isColorExist(value)) {
                        NewSelectFunctionTypeKt.selectCustom(functionColorList);
                        showSelectRectF(false);
                    } else {
                        interfaceC6471c.invoke(Integer.valueOf(value));
                    }
                } else {
                    customColor.setOpen(false);
                    CustomColorView selectCustomColorView3 = getBoardConfig().getSelectCustomColorView();
                    if (selectCustomColorView3 != null) {
                        selectCustomColorView3.setChangeColor(null);
                    }
                    showSelectRectF(false);
                }
            } else {
                interfaceC6471c.invoke(Integer.valueOf(functionColorList.get(index2).getValue()));
            }
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.ICustomColorFunction
    public void handleCustomColorUsed() {
        CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.onColorUsed(getLastChangeColor());
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleDoubleClick(float x3, float y2) {
        IGraph iGraph;
        if (!AbstractC5830k.m5325b(getCurrentFunctionMode(), NewSelectFunctionMode.Content.INSTANCE) || (iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList())) == null) {
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
        textEditView.showEditView(content, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull String it) {
                AbstractC5830k.m5330g(it, "it");
                TextFunction textFunction = TextFunction.this;
                Paint paint = textGraph.getPaint();
                AbstractC5830k.m5327d(paint);
                RectF rectFCalculateRectF = textFunction.calculateRectF(it, paint, new RectF(textGraph.getOriginalRectF()));
                if (!AbstractC5830k.m5325b(rectFCalculateRectF, textGraph.getOriginalRectF())) {
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
                AbstractC5830k.m5327d(paint2);
                graphControl.changeTextGraph(id, content2, paint2, textGraph.getOriginalRectF());
                TextFunction.this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(TextFunction.this, false, 1, null);
            }
        }, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull String it) {
                AbstractC5830k.m5330g(it, "it");
                IGraphControl graphControl = TextFunction.this.getGraphControl();
                String id = textGraph.getId();
                String content2 = textGraph.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                Paint paint = textGraph.getPaint();
                AbstractC5830k.m5327d(paint);
                graphControl.changeTextGraph(id, content2, paint, textGraph.getOriginalRectF());
                TextFunction.this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(TextFunction.this, false, 1, null);
                IActionListener listener = TextFunction.this.getListener();
                TextGraph textGraph2 = textGraph;
                IActionListener.DefaultImpls.changeGraph$default(listener, textGraph2, EzyGraphEnum$GraphEnum.TEXT_GRAPH, textGraph2.getOriginalRectF(), textGraph.getContent(), null, null, null, null, 240, null);
                TextFunction.this.getListener().saveSnapshot();
            }
        }, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.handleDoubleClick.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13748invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13748invoke() {
                textGraph.setContent(content);
                if (!AbstractC5830k.m5325b(rectF, textGraph.getOriginalRectF())) {
                    textGraph.changeOriginalRectF(rectF);
                }
                IGraphControl graphControl = this.getGraphControl();
                String id = textGraph.getId();
                String content2 = textGraph.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                Paint paint = textGraph.getPaint();
                AbstractC5830k.m5327d(paint);
                graphControl.changeTextGraph(id, content2, paint, textGraph.getOriginalRectF());
                this.updateSelectedRectF();
                BaseSelectFunction.showSelectRectF$default(this, false, 1, null);
            }
        });
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveEnd(float x3, float y2) {
        if (super.handleMoveEnd(x3, y2)) {
            return true;
        }
        if (!AbstractC5830k.m5325b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return false;
        }
        handleHScale(x3);
        updateSelectedRectF();
        calculateFunctionRectF();
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            IGraphControl.DefaultImpls.newChangeHandleEnd$default(getGraphControl(), getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), null, 64, null);
            IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum$GraphEnum.TEXT_GRAPH, iGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
        }
        getListener().saveSnapshot();
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveStart(float x3, float y2) {
        if (!AbstractC5830k.m5325b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return true;
        }
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
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
        IGraph iGraph2 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph2 == null) {
            return true;
        }
        IGraphControl.DefaultImpls.newChangeHandleStart$default(getGraphControl(), (TextGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), null, 128, null);
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoving(float x3, float y2) {
        if (super.handleMoving(x3, y2)) {
            return true;
        }
        if (!AbstractC5830k.m5325b(getCurrentFunctionMode(), NewSelectFunctionMode.Frame.Right.INSTANCE)) {
            return false;
        }
        handleHScale(x3);
        updateSelectedRectF();
        calculateFunctionRectF();
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            IGraphControl.DefaultImpls.newChangeHandling$default(getGraphControl(), (TextGraph) iGraph, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), null, 128, null);
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.ICustomColorFunction
    public void handleTouchEvent(@NotNull MotionEvent motionEvent) {
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
        CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            motionEvent.setLocation(motionEvent.getX() - getFunctionRectF().getCustomColor().left, motionEvent.getY() - getFunctionRectF().getCustomColor().top);
            selectCustomColorView.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float x3, float y2) {
        SelectColor.Custom customColor;
        if (getFunctionRectF().getTextEdit().contains(x3, y2)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionRectF().getDelete().contains(x3, y2)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(1));
            return true;
        }
        if (getFunctionBackgroundRectF().getEditRectF().contains(x3, y2)) {
            setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
            return true;
        }
        NewSelectFunctionType.TextEdit textEditType = NewSelectFunctionTypeKt.getTextEditType(this.functionTypeList);
        if (textEditType != null && textEditType.getIsSelected()) {
            if (getFunctionRectF().getTextSizeAdd().contains(x3, y2)) {
                setCurrentFunctionMode(NewSelectFunctionMode.TextSize.Add.INSTANCE);
                return true;
            }
            if (getFunctionRectF().getTextSizeReduce().contains(x3, y2)) {
                setCurrentFunctionMode(NewSelectFunctionMode.TextSize.Reduce.INSTANCE);
                return true;
            }
            if (getFunctionBackgroundRectF().getTextSizeRectF().contains(x3, y2)) {
                setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
                return true;
            }
            int size = getFunctionRectF().getColorList().size();
            for (int i = 0; i < size; i++) {
                if (getFunctionRectF().getColorList().get(i).contains(x3, y2)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.Color(i));
                    return true;
                }
            }
            if (getFunctionBackgroundRectF().getColorRectF().contains(x3, y2)) {
                setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
                return true;
            }
            List<SelectColor> functionColorList = getFunctionColorList();
            if (functionColorList != null && (customColor = NewSelectFunctionTypeKt.getCustomColor(functionColorList)) != null && customColor.getIsOpen()) {
                if (getFunctionRectF().getCustomColor().contains(x3, y2)) {
                    setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
                    return true;
                }
                if (getFunctionBackgroundRectF().getCustomColorRectF().contains(x3, y2)) {
                    setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
                    return true;
                }
            }
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {x3, y2};
        matrixInvert.mapPoints(fArr);
        float f = fArr[0];
        float f7 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth()) / 2;
        RectF rectF = new RectF(getSelectRectF().right - fMapRadius, getSelectRectF().centerY() - fMapRadius, getSelectRectF().right + fMapRadius, getSelectRectF().centerY() + fMapRadius);
        if (getSingleGraph() && rectF.contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Frame.Right.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f, f7)) {
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
        CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.setChangeColor(null);
        }
        setLastChangeColor(null);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.ICustomColorFunction
    public void setLastChangeColor(@Nullable Integer num) {
        this.lastChangeColor = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelectGraphList(@org.jetbrains.annotations.NotNull java.util.List<? extends com.zykj.blackboard.core.graph.IGraph> r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.TextFunction.setSelectGraphList(java.util.List):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali:5114
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        int i = 0;
        functionRectF.getTextEdit().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        float f = 2;
        functionRectF.getTextSizeReduce().set((getSelectFunctionRectF().left + this.sizeReduce.left) - 32.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f, getSelectFunctionRectF().left + this.sizeReduce.right + 32.0f, (getBoardConfig().getSelectButtonHeight() * f) + getSelectFunctionRectF().top + 13.0f);
        functionRectF.getTextSizeAdd().set((getSelectFunctionRectF().left + this.sizeAdd.left) - 32.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f, getSelectFunctionRectF().left + this.sizeAdd.right + 32.0f, (getBoardConfig().getSelectButtonHeight() * f) + getSelectFunctionRectF().top + 13.0f);
        float f7 = functionRectF.getTextSizeAdd().right + 13.0f;
        functionRectF.getColorList().clear();
        ArrayList<RectF> arrayList = this.colorRectFList;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            RectF rectF = arrayList.get(i8);
            i8++;
            RectF rectF2 = rectF;
            functionRectF.getColorList().add(new RectF(rectF2.left + f7, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f + rectF2.top, rectF2.right + f7, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f + rectF2.bottom));
        }
        getFunctionRectF().getCustomColor().setEmpty();
        CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            List<SelectColor> functionColorList = getFunctionColorList();
            if ((functionColorList != null ? NewSelectFunctionTypeKt.getCustomColor(functionColorList) : null) == null) {
                selectCustomColorView = null;
            }
            if (selectCustomColorView != null) {
                functionRectF.getCustomColor().set(getSelectFunctionRectF().left, ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f) + getSelectFunctionRectF().top, selectCustomColorView.getWidth() + getSelectFunctionRectF().left, selectCustomColorView.getHeight() + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f) + getSelectFunctionRectF().top);
            }
        }
        if (getIsDirectionLeft()) {
            return;
        }
        float f8 = (functionRectF.getDelete().right - functionRectF.getTextEdit().left) + 16.0f;
        functionRectF.getTextEdit().offset(getSelectFunctionRectF().width() - f8, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f8, 0.0f);
        float fWidth = getSelectFunctionRectF().width() - (((functionRectF.getTextSizeAdd().right - functionRectF.getTextSizeReduce().left) + 13.0f) + ((((RectF) AbstractC5805t.m5235o0(functionRectF.getColorList())).right - ((RectF) AbstractC5805t.m5228h0(functionRectF.getColorList())).left) + 46.0f));
        functionRectF.getTextSizeReduce().offset(fWidth, 0.0f);
        functionRectF.getTextSizeAdd().offset(fWidth, 0.0f);
        ArrayList<RectF> colorList = functionRectF.getColorList();
        int size2 = colorList.size();
        while (i < size2) {
            RectF rectF3 = colorList.get(i);
            i++;
            rectF3.offset(fWidth, 0.0f);
        }
        functionRectF.getCustomColor().offset(getSelectFunctionRectF().width() - functionRectF.getCustomColor().width(), 0.0f);
    }
}
