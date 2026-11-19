package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.utils.MatrixExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001aj\b\u0012\u0004\u0012\u00020\u0015`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Ld6/s;", "initFunctionTypeList", "()V", "initFunctionRelativeRectF", "updateFunctionRectF", "", "x", "y", "", "isClickInSelectFunction", "(FF)Z", "Landroid/graphics/RectF;", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "reset", "handleClick", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "functionTypeList", "Ljava/util/ArrayList;", "deleteRelativeRectF", "Landroid/graphics/RectF;", "value", "hasTextGraph", "Z", "getHasTextGraph", "()Z", "setHasTextGraph", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DefaultFunction extends BaseSelectFunction {

    @NotNull
    private final RectF deleteRelativeRectF;

    @NotNull
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private boolean hasTextGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFunction(@NotNull IActionListener listener) {
        super(listener);
        AbstractC5830k.m5330g(listener, "listener");
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
        float f = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f7 = 2;
        this.deleteRelativeRectF.set(23.0f, (getBoardConfig().getSelectButtonHeight() - f) / f7, fMeasureText + 23.0f, ((getBoardConfig().getSelectButtonHeight() - f) / f7) + f);
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
    @NotNull
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    public final boolean getHasTextGraph() {
        return this.hasTextGraph;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @NotNull
    public RectF getMaxFunctionRectF() {
        setSelectSizePair(new Pair<>(Float.valueOf(this.deleteRelativeRectF.width() + 46.0f), Float.valueOf(getBoardConfig().getSelectButtonHeight())));
        return new RectF(0.0f, 0.0f, getSelectSizePair().getFirst().floatValue(), getSelectSizePair().getSecond().floatValue());
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float x3, float y2) {
        if (!super.handleClick(x3, y2)) {
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
    public boolean isClickInSelectFunction(float x3, float y2) {
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {x3, y2};
        matrixInvert.mapPoints(fArr);
        float f = fArr[0];
        float f7 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        if (this.functionTypeList.contains(NewSelectFunctionType.Rotate.INSTANCE)) {
            float f8 = 2;
            float f9 = fMapRadius / f8;
            if (new RectF(getSelectRectF().centerX() - f9, AbstractC1923c.m1036D(fMapRadius, 5, f8, getSelectRectF().top), getSelectRectF().centerX() + f9, AbstractC1923c.m1036D(fMapRadius, 3, f8, getSelectRectF().top)).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
                return true;
            }
        }
        if (this.functionTypeList.contains(NewSelectFunctionType.Scale.INSTANCE)) {
            float f10 = fMapRadius / 2;
            if (new RectF(getSelectRectF().right - f10, getSelectRectF().bottom - f10, getSelectRectF().right + f10, getSelectRectF().bottom + f10).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
                return true;
            }
        }
        if (getSelectRectF().contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        if (getFunctionRectF().getDelete().contains(x3, y2)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionBackgroundRectF().getEditRectF().contains(x3, y2)) {
            setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
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

    public final void setHasTextGraph(boolean z8) {
        this.hasTextGraph = z8;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i = -1;
                break;
            }
            NewSelectFunctionType newSelectFunctionType = arrayList.get(i8);
            i8++;
            if (newSelectFunctionType instanceof NewSelectFunctionType.Rotate) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.functionTypeList.remove(i);
        }
        if (!z8) {
            this.functionTypeList.add(0, NewSelectFunctionType.Rotate.INSTANCE);
        }
        ArrayList<NewSelectFunctionType> arrayList2 = this.functionTypeList;
        int size2 = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                i9 = -1;
                break;
            }
            NewSelectFunctionType newSelectFunctionType2 = arrayList2.get(i10);
            i10++;
            if (newSelectFunctionType2 instanceof NewSelectFunctionType.Scale) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 != -1) {
            this.functionTypeList.remove(i9);
        }
        if (z8) {
            return;
        }
        this.functionTypeList.add(0, NewSelectFunctionType.Scale.INSTANCE);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        getFunctionRectF().getDelete().set((getSelectFunctionRectF().left + this.deleteRelativeRectF.left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.deleteRelativeRectF.right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
    }
}
