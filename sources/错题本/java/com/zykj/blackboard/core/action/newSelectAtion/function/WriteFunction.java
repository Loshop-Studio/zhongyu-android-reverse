package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import android.view.MotionEvent;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt;
import com.zykj.blackboard.core.action.newSelectAtion.SelectColor;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.IChangeField;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.utils.ColorUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tR$\u0010&\u001a\u0004\u0018\u00010%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\b\u0012\u0004\u0012\u00020\u0017`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001301j\b\u0012\u0004\u0012\u00020\u0013`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R$\u00107\u001a\u0012\u0012\u0004\u0012\u00020601j\b\u0012\u0004\u0012\u000206`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001301j\b\u0012\u0004\u0012\u00020\u0013`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u001c\u0010;\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0019¨\u0006<"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Ld6/s;", "initFunctionTypeList", "()V", "initFunctionRelativeRectF", "recalculateColorRectFList", "updateFunctionRectF", "", "x", "y", "", "isClickInSelectFunction", "(FF)Z", "Landroid/graphics/RectF;", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "setSelectGraphList", "(Ljava/util/List;)V", "reset", "handleClick", "Landroid/view/MotionEvent;", "motionEvent", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "handleCustomColorUsed", "", "lastChangeColor", "Ljava/lang/Integer;", "getLastChangeColor", "()Ljava/lang/Integer;", "setLastChangeColor", "(Ljava/lang/Integer;)V", "isHighlighter", "Z", "()Z", "setHighlighter", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "functionTypeList", "Ljava/util/ArrayList;", "funcRelativeRectFList", "Landroid/graphics/PointF;", "strokeWidthPointFList", "colorRectFList", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "getFunctionColorList", "functionColorList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WriteFunction extends BaseSelectFunction implements ICustomColorFunction {

    @NotNull
    private final ArrayList<RectF> colorRectFList;

    @NotNull
    private final ArrayList<RectF> funcRelativeRectFList;

    @NotNull
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private boolean isHighlighter;

    @Nullable
    private Integer lastChangeColor;

    @NotNull
    private final ArrayList<PointF> strokeWidthPointFList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteFunction(@NotNull IActionListener listener) {
        super(listener);
        AbstractC5830k.m5330g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        this.strokeWidthPointFList = new ArrayList<>();
        this.colorRectFList = new ArrayList<>();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final List<SelectColor> getFunctionColorList() {
        NewSelectFunctionType.WriteEdit writeEditType = NewSelectFunctionTypeKt.getWriteEditType(this.functionTypeList);
        if (writeEditType != null) {
            return writeEditType.getColorList();
        }
        return null;
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
        while (i < size) {
            NewSelectFunctionType newSelectFunctionType = arrayList.get(i);
            i++;
            if (newSelectFunctionType.getText().length() > 0) {
                arrayList2.add(newSelectFunctionType);
            }
        }
        int size2 = arrayList2.size();
        float f8 = 23.0f;
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList2.get(i8);
            i8++;
            float fMeasureText = paint.measureText(((NewSelectFunctionType) obj).getText());
            this.funcRelativeRectFList.add(new RectF(f8, selectButtonHeight, f8 + fMeasureText, selectButtonHeight2));
            f8 += fMeasureText + 30.0f;
        }
        int size3 = getBoardConfig().getSelectWriteLevel().size();
        float f9 = 16.0f;
        for (int i9 = 0; i9 < size3; i9++) {
            float f10 = (((i9 * 3.0f) + 8.0f) / f7) + 19.0f;
            float f11 = f9 + f10;
            this.strokeWidthPointFList.add(new PointF(f11, getBoardConfig().getSelectButtonHeight() / f7));
            f9 = f11 + f10;
        }
        recalculateColorRectFList();
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.WriteEdit(false, getBoardConfig().getSelectWriteLevel().get(0).floatValue(), NewSelectFunctionTypeKt.createSelectColorList(getBoardConfig().getSelectEditColorList())));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF getMaxFunctionRectF() {
        /*
            r9 = this;
            java.util.ArrayList<android.graphics.RectF> r0 = r9.funcRelativeRectFList
            java.lang.Object r0 = kotlin.collections.AbstractC5805t.m5235o0(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            float r0 = r0.right
            r1 = 1097859072(0x41700000, float:15.0)
            float r0 = r0 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 + r1
            java.util.ArrayList<android.graphics.PointF> r2 = r9.strokeWidthPointFList
            java.lang.Object r2 = kotlin.collections.AbstractC5805t.m5235o0(r2)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.ArrayList<android.graphics.PointF> r3 = r9.strokeWidthPointFList
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
            float r3 = (float) r3
            r5 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r5
            float r3 = r3 + r1
            r1 = 2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r3 = r3 + r2
            r2 = 1100480512(0x41980000, float:19.0)
            float r3 = r3 + r2
            r2 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 + r2
            java.util.ArrayList<android.graphics.RectF> r2 = r9.colorRectFList
            java.lang.Object r2 = kotlin.collections.AbstractC5805t.m5235o0(r2)
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            float r2 = r2.right
            r5 = 1102577664(0x41b80000, float:23.0)
            float r2 = r2 + r5
            r5 = 1095761920(0x41500000, float:13.0)
            float r3 = r3 + r5
            float r3 = r3 + r2
            java.util.List r2 = r9.getFunctionColorList()
            r6 = 0
            if (r2 == 0) goto L4e
            com.zykj.blackboard.core.action.newSelectAtion.SelectColor$Custom r2 = com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt.getCustomColor(r2)
            goto L4f
        L4e:
            r2 = r6
        L4f:
            if (r2 == 0) goto L52
            goto L53
        L52:
            r4 = 0
        L53:
            com.zykj.blackboard.bean.BoardConfig r2 = r9.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r2 = r2.getSelectCustomColorView()
            r7 = 0
            if (r2 == 0) goto L69
            if (r4 == 0) goto L61
            goto L62
        L61:
            r2 = r6
        L62:
            if (r2 == 0) goto L69
            float r2 = r2.getWidth()
            goto L6a
        L69:
            r2 = r7
        L6a:
            com.zykj.blackboard.bean.BoardConfig r8 = r9.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r8 = r8.getSelectCustomColorView()
            if (r8 == 0) goto L7f
            if (r4 == 0) goto L77
            r6 = r8
        L77:
            if (r6 == 0) goto L7f
            float r4 = r6.getHeight()
            float r4 = r4 + r5
            goto L80
        L7f:
            r4 = r7
        L80:
            kotlin.Pair r6 = new kotlin.Pair
            float r0 = java.lang.Math.max(r0, r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.zykj.blackboard.bean.BoardConfig r3 = r9.getBoardConfig()
            float r3 = r3.getSelectButtonHeight()
            float r3 = r3 * r1
            float r3 = r3 + r5
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r6.<init>(r0, r1)
            r9.setSelectSizePair(r6)
            kotlin.Pair r0 = r9.getSelectSizePair()
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.max(r0, r2)
            kotlin.Pair r1 = r9.getSelectSizePair()
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r4
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r7, r7, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.getMaxFunctionRectF():android.graphics.RectF"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:1014
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float x3, float y2) {
        Paint mPaint;
        if (!super.handleClick(x3, y2)) {
            return false;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode2).getIndex();
            if (index == 0) {
                NewSelectFunctionType.WriteEdit writeEditType = NewSelectFunctionTypeKt.getWriteEditType(this.functionTypeList);
                if (writeEditType != null) {
                    writeEditType.setSelected(!writeEditType.getIsSelected());
                    showSelectRectF(false);
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.WriteSize) {
            NewSelectFunctionMode currentFunctionMode3 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize");
            float fFloatValue = getBoardConfig().getSelectStrokeWidthList(this.isHighlighter).get(((NewSelectFunctionMode.WriteSize) currentFunctionMode3).getIndex()).floatValue();
            ArrayList<IGraph> selectGraphList = getSelectGraphList();
            int size = selectGraphList.size();
            int i = 0;
            while (i < size) {
                IGraph iGraph = selectGraphList.get(i);
                i++;
                IGraph iGraph2 = iGraph;
                for (IGraph iGraph3 : iGraph2.getChildGraph()) {
                    if ((iGraph3 instanceof WritingGraph) && (mPaint = ((WritingGraph) iGraph3).getMPaint()) != null) {
                        mPaint.setStrokeWidth(fFloatValue);
                        IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph3, EzyGraphEnum$GraphEnum.STROKE_GRAPH, null, null, new Paint(mPaint), null, null, null, 236, null);
                    }
                    if (iGraph2 instanceof IChangeField) {
                        ((IChangeField) iGraph2).changeUpdate(true);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("WriteFunction:WriteSize -> size:");
            sb.append(fFloatValue);
            sb.append(" list: ");
            ArrayList<IGraph> selectGraphList2 = getSelectGraphList();
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(selectGraphList2, 10));
            int size2 = selectGraphList2.size();
            int i8 = 0;
            while (i8 < size2) {
                IGraph iGraph4 = selectGraphList2.get(i8);
                i8++;
                arrayList.add(iGraph4.getId());
            }
            sb.append(arrayList);
            AbstractC3387g.m2342e(sb.toString());
            getGraphControl().reDrawFixView();
            getListener().saveSnapshot();
            NewSelectFunctionType.WriteEdit writeEditType2 = NewSelectFunctionTypeKt.getWriteEditType(this.functionTypeList);
            if (writeEditType2 != null) {
                writeEditType2.setWidth(fFloatValue);
            }
            showSelectRectF(false);
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.Color) {
            NewSelectFunctionMode currentFunctionMode4 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode4, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int index2 = ((NewSelectFunctionMode.Color) currentFunctionMode4).getIndex();
            final List<SelectColor> functionColorList = getFunctionColorList();
            if (functionColorList == null) {
                return true;
            }
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction$handleClick$changeColor$1
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

                public final void invoke(int i9) {
                    Paint mPaint2;
                    int alphaColor = this.this$0.getIsHighlighter() ? ColorUtils.INSTANCE.toAlphaColor(i9, this.this$0.getBoardConfig().getHighlighterColorAlpha()) : i9;
                    ArrayList<IGraph> selectGraphList3 = this.this$0.getSelectGraphList();
                    WriteFunction writeFunction = this.this$0;
                    int size3 = selectGraphList3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        IGraph iGraph5 = selectGraphList3.get(i10);
                        i10++;
                        IGraph iGraph6 = iGraph5;
                        for (IGraph iGraph7 : iGraph6.getChildGraph()) {
                            if ((iGraph7 instanceof WritingGraph) && (mPaint2 = ((WritingGraph) iGraph7).getMPaint()) != null) {
                                mPaint2.setColor(alphaColor);
                                IActionListener.DefaultImpls.changeGraph$default(writeFunction.getListener(), iGraph7, EzyGraphEnum$GraphEnum.STROKE_GRAPH, null, null, new Paint(mPaint2), null, null, null, 236, null);
                            }
                        }
                        if (iGraph6 instanceof IChangeField) {
                            ((IChangeField) iGraph6).changeUpdate(true);
                        }
                    }
                    StringBuilder sbM94s = AbstractC0037f.m94s(alphaColor, "WriteFunction:Color -> color:", " list: ");
                    ArrayList<IGraph> selectGraphList4 = this.this$0.getSelectGraphList();
                    ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(selectGraphList4, 10));
                    int size4 = selectGraphList4.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        IGraph iGraph8 = selectGraphList4.get(i11);
                        i11++;
                        arrayList2.add(iGraph8.getId());
                    }
                    sbM94s.append(arrayList2);
                    AbstractC3387g.m2342e(sbM94s.toString());
                    InterfaceC6471c selectEditColorChangeListener = this.this$0.getBoardConfig().getSelectEditColorChangeListener();
                    if (selectEditColorChangeListener != null) {
                        selectEditColorChangeListener.invoke(Integer.valueOf(i9));
                    }
                    this.this$0.getGraphControl().reDrawFixView();
                    this.this$0.getListener().saveSnapshot();
                    List<SelectColor> list = functionColorList;
                    final WriteFunction writeFunction2 = this.this$0;
                    NewSelectFunctionTypeKt.handleWithColor(list, i9, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        @NotNull
                        public final Boolean invoke(int i12) {
                            CustomColorView selectCustomColorView = writeFunction2.getBoardConfig().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.isColorExist(i12) : false);
                        }
                    });
                    WriteFunction writeFunction3 = this.this$0;
                    SelectColor.Custom customColor = NewSelectFunctionTypeKt.getCustomColor(functionColorList);
                    writeFunction3.setLastChangeColor(customColor != null ? Integer.valueOf(customColor.getValue()) : null);
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
                    int value = customColor != null ? customColor.getValue() : 0;
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
        if (getFunctionRectF().getWriteEdit().contains(x3, y2)) {
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
        NewSelectFunctionType.WriteEdit writeEditType = NewSelectFunctionTypeKt.getWriteEditType(this.functionTypeList);
        if (writeEditType != null && writeEditType.getIsSelected()) {
            int size = getFunctionRectF().getWriteStrokeWidthList().size();
            for (int i = 0; i < size; i++) {
                if (getFunctionRectF().getWriteStrokeWidthList().get(i).contains(x3, y2)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.WriteSize(i));
                    return true;
                }
            }
            if (getFunctionBackgroundRectF().getWriteStrokeRectF().contains(x3, y2)) {
                setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
                return true;
            }
            int size2 = getFunctionRectF().getColorList().size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (getFunctionRectF().getColorList().get(i8).contains(x3, y2)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.Color(i8));
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
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        float f8 = 2;
        float f9 = fMapRadius / f8;
        if (new RectF(getSelectRectF().centerX() - f9, AbstractC1923c.m1036D(fMapRadius, 5, f8, getSelectRectF().top), getSelectRectF().centerX() + f9, AbstractC1923c.m1036D(fMapRadius, 3, f8, getSelectRectF().top)).contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f9, getSelectRectF().bottom - f9, getSelectRectF().right + f9, getSelectRectF().bottom + f9).contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    /* renamed from: isHighlighter, reason: from getter */
    public final boolean getIsHighlighter() {
        return this.isHighlighter;
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

    public final void setHighlighter(boolean z8) {
        this.isHighlighter = z8;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.ICustomColorFunction
    public void setLastChangeColor(@Nullable Integer num) {
        this.lastChangeColor = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelectGraphList(@org.jetbrains.annotations.NotNull java.util.List<? extends com.zykj.blackboard.core.graph.IGraph> r15) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.WriteFunction.setSelectGraphList(java.util.List):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali:3601
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        functionRectF.getWriteEdit().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getWriteStrokeWidthList().clear();
        ArrayList<PointF> arrayList = this.strokeWidthPointFList;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                float f = 16.0f;
                float f7 = ((RectF) AbstractC5805t.m5235o0(getFunctionRectF().getWriteStrokeWidthList())).right + 16.0f + 13.0f;
                functionRectF.getColorList().clear();
                ArrayList<RectF> arrayList2 = this.colorRectFList;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    RectF rectF = arrayList2.get(i9);
                    i9++;
                    RectF rectF2 = rectF;
                    functionRectF.getColorList().add(new RectF(rectF2.left + f7, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f + rectF2.top, rectF2.right + f7, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f + rectF2.bottom));
                    f = f;
                }
                float f8 = f;
                getFunctionRectF().getCustomColor().setEmpty();
                CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
                if (selectCustomColorView != null) {
                    List<SelectColor> functionColorList = getFunctionColorList();
                    CustomColorView customColorView = (functionColorList != null ? NewSelectFunctionTypeKt.getCustomColor(functionColorList) : null) != null ? selectCustomColorView : null;
                    if (customColorView != null) {
                        float f9 = 2;
                        functionRectF.getCustomColor().set(getSelectFunctionRectF().left, ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f9) + getSelectFunctionRectF().top, customColorView.getWidth() + getSelectFunctionRectF().left, customColorView.getHeight() + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f9) + getSelectFunctionRectF().top);
                    }
                }
                if (getIsDirectionLeft()) {
                    return;
                }
                float f10 = (functionRectF.getDelete().right - functionRectF.getWriteEdit().left) + f8;
                functionRectF.getWriteEdit().offset(getSelectFunctionRectF().width() - f10, 0.0f);
                functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f10, 0.0f);
                float fWidth = getSelectFunctionRectF().width() - ((((((RectF) AbstractC5805t.m5235o0(functionRectF.getWriteStrokeWidthList())).right - ((RectF) AbstractC5805t.m5228h0(functionRectF.getWriteStrokeWidthList())).left) + 32.0f) + 13.0f) + ((((RectF) AbstractC5805t.m5235o0(functionRectF.getColorList())).right - ((RectF) AbstractC5805t.m5228h0(functionRectF.getColorList())).left) + 46.0f));
                ArrayList<RectF> writeStrokeWidthList = functionRectF.getWriteStrokeWidthList();
                int size3 = writeStrokeWidthList.size();
                int i10 = 0;
                while (i10 < size3) {
                    RectF rectF3 = writeStrokeWidthList.get(i10);
                    i10++;
                    rectF3.offset(fWidth, 0.0f);
                }
                ArrayList<RectF> colorList = functionRectF.getColorList();
                int size4 = colorList.size();
                int i11 = 0;
                while (i11 < size4) {
                    RectF rectF4 = colorList.get(i11);
                    i11++;
                    rectF4.offset(fWidth, 0.0f);
                }
                functionRectF.getCustomColor().offset(getSelectFunctionRectF().width() - functionRectF.getCustomColor().width(), 0.0f);
                return;
            }
            PointF pointF = arrayList.get(i8);
            i8++;
            int i12 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            PointF pointF2 = pointF;
            float f11 = 2;
            float f12 = ((i * 3.0f) + 8.0f) / f11;
            functionRectF.getWriteStrokeWidthList().add(new RectF(((getSelectFunctionRectF().left + pointF2.x) - f12) - 19.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top + 13.0f, getSelectFunctionRectF().left + pointF2.x + f12 + 19.0f, (getBoardConfig().getSelectButtonHeight() * f11) + getSelectFunctionRectF().top + 13.0f));
            i = i12;
        }
    }
}
