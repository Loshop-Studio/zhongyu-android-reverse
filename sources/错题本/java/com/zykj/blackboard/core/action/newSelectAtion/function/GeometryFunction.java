package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import android.view.MotionEvent;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt;
import com.zykj.blackboard.core.action.newSelectAtion.SelectColor;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
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

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\tJO\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\tJ\u001f\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0#H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010\tJ\u001f\u00103\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010+J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\tJ\u001f\u00109\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010+J\u001f\u0010:\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010+J\u001f\u0010;\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010+R$\u0010=\u001a\u0004\u0018\u00010<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020/0Cj\b\u0012\u0004\u0012\u00020/`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020,0Cj\b\u0012\u0004\u0012\u00020,`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020,0Cj\b\u0012\u0004\u0012\u00020,`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010I\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010R\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010U\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u00101¨\u0006V"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Ld6/s;", "initFunctionTypeList", "()V", "initFunctionRelativeRectF", "recalculateColorRectFList", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", TypedValues.AttributesType.S_FRAME, "", "x", "y", "handleStretch", "(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;FF)V", "handleMovedPoint", "(FF)V", "updateSingleSelectedRectF", "calculateFunctionRectF", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "calculateScaleOffset", "(FFFFFFFF)F", "calculateRadians", "(FF)F", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "setSelectGraphList", "(Ljava/util/List;)V", "updateFunctionRectF", "", "isClickInSelectFunction", "(FF)Z", "Landroid/graphics/RectF;", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "reset", "handleClick", "Landroid/view/MotionEvent;", "motionEvent", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "handleCustomColorUsed", "handleMoveStart", "handleMoving", "handleMoveEnd", "", "lastChangeColor", "Ljava/lang/Integer;", "getLastChangeColor", "()Ljava/lang/Integer;", "setLastChangeColor", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "functionTypeList", "Ljava/util/ArrayList;", "funcRelativeRectFList", "colorRectFList", "selectGraphOriginWidth", "F", "selectGraphOriginHeight", "Landroid/graphics/PointF;", "triangleStartPointF", "Landroid/graphics/PointF;", "triangleEndPointF", "getSingleGraph", "()Z", "singleGraph", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "getFunctionColorList", "functionColorList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GeometryFunction extends BaseSelectFunction implements ICustomColorFunction {

    @NotNull
    private final ArrayList<RectF> colorRectFList;

    @NotNull
    private final ArrayList<RectF> funcRelativeRectFList;

    @NotNull
    private final ArrayList<NewSelectFunctionType> functionTypeList;

    @Nullable
    private Integer lastChangeColor;
    private float selectGraphOriginHeight;
    private float selectGraphOriginWidth;

    @NotNull
    private final PointF triangleEndPointF;

    @NotNull
    private final PointF triangleStartPointF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryFunction(@NotNull IActionListener listener) {
        super(listener);
        AbstractC5830k.m5330g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        this.colorRectFList = new ArrayList<>();
        this.triangleStartPointF = new PointF();
        this.triangleEndPointF = new PointF();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final void calculateFunctionRectF() {
        getSelectFunctionRectF().set(getMaxFunctionRectF());
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage(), getSelectSizePair()));
        updateFunctionRectF();
        updateFunctionBackgroundRectF();
    }

    private final float calculateRadians(float x3, float y2) {
        if (x3 == 0.0f) {
            return (float) Math.toRadians(y2 > 0.0f ? 90.0d : -90.0d);
        }
        return ((x3 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (y2 > 0.0f ? -1 : 1)) + ((float) Math.atan(y2 / x3));
    }

    private final float calculateScaleOffset(float x12, float y12, float x22, float y2, float x3, float y3, float x42, float y42) {
        return ((float) Math.cos(calculateRadians(x22 - x12, y2 - y12) - calculateRadians(x42 - x3, y42 - y3))) * ((float) Math.sqrt((r8 * r8) + (r7 * r7)));
    }

    private final List<SelectColor> getFunctionColorList() {
        NewSelectFunctionType.GeometryStroke geometryStrokeType = NewSelectFunctionTypeKt.getGeometryStrokeType(this.functionTypeList);
        if (geometryStrokeType != null) {
            return geometryStrokeType.getColorList();
        }
        return null;
    }

    private final boolean getSingleGraph() {
        return getSelectGraphList().size() == 1;
    }

    private final void handleMovedPoint(float x3, float y2) {
        PointF pointF = new PointF();
        PointF pointF2 = this.triangleStartPointF;
        float f = pointF2.x;
        float f7 = pointF2.y;
        PointF pointF3 = this.triangleEndPointF;
        float fCalculateScaleOffset = calculateScaleOffset(f, f7, pointF3.x, pointF3.y, f, f7, x3, y2);
        if (fCalculateScaleOffset < 0.0f) {
            pointF.set(this.triangleStartPointF);
        } else {
            PointF pointF4 = this.triangleStartPointF;
            float f8 = pointF4.x;
            PointF pointF5 = this.triangleEndPointF;
            float f9 = pointF5.x;
            float f10 = pointF4.y;
            float f11 = pointF5.y;
            float fSqrt = (float) Math.sqrt(AbstractC0037f.m77b(f10, f11, f10 - f11, (f8 - f9) * (f8 - f9)));
            if (fCalculateScaleOffset > fSqrt) {
                pointF.set(this.triangleEndPointF);
            } else {
                float f12 = fCalculateScaleOffset / fSqrt;
                PointF pointF6 = this.triangleStartPointF;
                float f13 = pointF6.x;
                PointF pointF7 = this.triangleEndPointF;
                float fM77b = AbstractC0037f.m77b(pointF7.x, f13, f12, f13);
                float f14 = pointF6.y;
                pointF.set(fM77b, AbstractC0037f.m77b(pointF7.y, f14, f12, f14));
            }
        }
        pointF.set(PointUtils.INSTANCE.mapPoint(pointF, MatrixExtKt.invert(getCurrentMatrix())));
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            GeometryGraph geometryGraph = (GeometryGraph) iGraph;
            geometryGraph.setPointList(AbstractC5806u.m5287z(pointF, new PointF(geometryGraph.getOriginalRectF().left, geometryGraph.getOriginalRectF().bottom), new PointF(geometryGraph.getOriginalRectF().right, geometryGraph.getOriginalRectF().bottom)));
            PointF trianglePointF = getTrianglePointF();
            if (trianglePointF != null) {
                trianglePointF.set(pointF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleStretch(com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.handleStretch(com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode$Frame, float, float):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:1040
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
        recalculateColorRectFList();
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.GeometryStroke(getSingleGraph(), NewSelectFunctionTypeKt.createSelectColorList(getBoardConfig().getSelectEditColorList())));
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

    private final void updateSingleSelectedRectF() {
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            getSelectRectF().set(iGraph.getOriginalRectF());
            Matrix transformMatrix = getTransformMatrix();
            transformMatrix.reset();
            transformMatrix.postConcat(iGraph.getRenderMatrix());
            transformMatrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            setTrianglePointF((PointF) AbstractC5805t.m5229i0(((GeometryGraph) iGraph).getMovePointFList()));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
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
            java.util.List r2 = r8.getFunctionColorList()
            r3 = 0
            if (r2 == 0) goto L29
            com.zykj.blackboard.core.action.newSelectAtion.SelectColor$Custom r2 = com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionTypeKt.getCustomColor(r2)
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r2 == 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            com.zykj.blackboard.bean.BoardConfig r4 = r8.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r4 = r4.getSelectCustomColorView()
            r5 = 0
            if (r4 == 0) goto L45
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L45
            float r4 = r4.getWidth()
            goto L46
        L45:
            r4 = r5
        L46:
            com.zykj.blackboard.bean.BoardConfig r6 = r8.getBoardConfig()
            com.zykj.blackboard.proxy.CustomColorView r6 = r6.getSelectCustomColorView()
            r7 = 1095761920(0x41500000, float:13.0)
            if (r6 == 0) goto L5d
            if (r2 == 0) goto L55
            r3 = r6
        L55:
            if (r3 == 0) goto L5d
            float r2 = r3.getHeight()
            float r2 = r2 + r7
            goto L5e
        L5d:
            r2 = r5
        L5e:
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.getMaxFunctionRectF():android.graphics.RectF"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:2375
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
                NewSelectFunctionType.GeometryStroke geometryStrokeType = NewSelectFunctionTypeKt.getGeometryStrokeType(this.functionTypeList);
                if (geometryStrokeType != null) {
                    geometryStrokeType.setSelected(!geometryStrokeType.getIsSelected());
                    showSelectRectF(false);
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.Color) {
            NewSelectFunctionMode currentFunctionMode3 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int index2 = ((NewSelectFunctionMode.Color) currentFunctionMode3).getIndex();
            final List<SelectColor> functionColorList = getFunctionColorList();
            if (functionColorList == null) {
                return true;
            }
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction$handleClick$changeColor$1
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
                    GeometryGraph geometryGraph;
                    Paint paint;
                    ArrayList<IGraph> selectGraphList = this.this$0.getSelectGraphList();
                    GeometryFunction geometryFunction = this.this$0;
                    int size = selectGraphList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        IGraph iGraph = selectGraphList.get(i8);
                        i8++;
                        IGraph iGraph2 = iGraph;
                        if ((iGraph2 instanceof GeometryGraph) && (paint = (geometryGraph = (GeometryGraph) iGraph2).getPaint()) != null) {
                            paint.setColor(i);
                            geometryGraph.setPaint(paint);
                            IActionListener.DefaultImpls.changeGraph$default(geometryFunction.getListener(), iGraph2, EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH, null, null, new Paint(paint), null, null, null, 236, null);
                        }
                    }
                    StringBuilder sbM94s = AbstractC0037f.m94s(i, "GeometryFunction:GeometryColor -> color:", " list: ");
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
                    IGeometrySelectListener geometrySelectListener = this.this$0.getListener().getGeometrySelectListener();
                    if (geometrySelectListener != null) {
                        geometrySelectListener.geometryColorChange(i);
                    }
                    this.this$0.getGraphControl().reDrawFixView();
                    this.this$0.getListener().saveSnapshot();
                    List<SelectColor> list = functionColorList;
                    final GeometryFunction geometryFunction2 = this.this$0;
                    NewSelectFunctionTypeKt.handleWithColor(list, i, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction$handleClick$changeColor$1.3
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        @NotNull
                        public final Boolean invoke(int i10) {
                            CustomColorView selectCustomColorView = geometryFunction2.getBoardConfig().getSelectCustomColorView();
                            return Boolean.valueOf(selectCustomColorView != null ? selectCustomColorView.isColorExist(i10) : false);
                        }
                    });
                    GeometryFunction geometryFunction3 = this.this$0;
                    SelectColor.Custom customColor = NewSelectFunctionTypeKt.getCustomColor(functionColorList);
                    geometryFunction3.setLastChangeColor(customColor != null ? Integer.valueOf(customColor.getValue()) : null);
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
    public boolean handleMoveEnd(float x3, float y2) {
        if (super.handleMoveEnd(x3, y2)) {
            return true;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Frame) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            handleStretch((NewSelectFunctionMode.Frame) currentFunctionMode2, x3, y2);
            updateSingleSelectedRectF();
            calculateFunctionRectF();
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? PointUtils.INSTANCE.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph != null) {
                getGraphControl().newChangeHandleEnd(getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
                IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH, iGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
            }
            getListener().saveSnapshot();
        } else {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return false;
            }
            handleMovedPoint(x3, y2);
            PointF trianglePointF2 = getTrianglePointF();
            PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph2 != null) {
                getGraphControl().newChangeHandleEnd(getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
                IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph2, EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH, null, null, null, ((GeometryGraph) iGraph2).getPointList(), null, null, 220, null);
            }
            getListener().saveSnapshot();
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveStart(float x3, float y2) {
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (!(currentFunctionMode instanceof NewSelectFunctionMode.Frame)) {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return true;
            }
            IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph == null) {
                return false;
            }
            GeometryGraph geometryGraph = (GeometryGraph) iGraph;
            Matrix matrix = new Matrix();
            matrix.postConcat(geometryGraph.getRenderMatrix());
            matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            PointF pointF = this.triangleStartPointF;
            PointUtils pointUtils = PointUtils.INSTANCE;
            pointF.set(pointUtils.mapPoint(geometryGraph.getOriginalRectF().left, geometryGraph.getOriginalRectF().top, matrix));
            this.triangleEndPointF.set(pointUtils.mapPoint(geometryGraph.getOriginalRectF().right, geometryGraph.getOriginalRectF().top, matrix));
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? pointUtils.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph2 == null) {
                return true;
            }
            getGraphControl().newChangeHandleStart((GeometryGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
            return true;
        }
        IGraph iGraph3 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph3 == null) {
            return false;
        }
        GeometryGraph geometryGraph2 = (GeometryGraph) iGraph3;
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(geometryGraph2.getRenderMatrix());
        matrix2.postConcat(getMatrixAdapter().getAdapterMatrix());
        this.selectGraphOriginWidth = matrix2.mapRadius(geometryGraph2.getOriginalRectF().width());
        this.selectGraphOriginHeight = matrix2.mapRadius(geometryGraph2.getOriginalRectF().height());
        AbstractC3387g.m2342e("GeometryFunction:changeFrame -> start graph:" + geometryGraph2.getId());
        updateSingleSelectedRectF();
        calculateFunctionRectF();
        PointF trianglePointF2 = getTrianglePointF();
        PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
        IGraph iGraph4 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph4 == null) {
            return true;
        }
        getGraphControl().newChangeHandleStart((GeometryGraph) iGraph4, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoving(float x3, float y2) {
        if (super.handleMoving(x3, y2)) {
            return true;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Frame) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            handleStretch((NewSelectFunctionMode.Frame) currentFunctionMode2, x3, y2);
            updateSingleSelectedRectF();
            calculateFunctionRectF();
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? PointUtils.INSTANCE.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph != null) {
                getGraphControl().newChangeHandling((GeometryGraph) iGraph, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
            }
        } else {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return false;
            }
            handleMovedPoint(x3, y2);
            PointF trianglePointF2 = getTrianglePointF();
            PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
            if (iGraph2 != null) {
                getGraphControl().newChangeHandling((GeometryGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getFunctionBackgroundRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
            }
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
        if (getFunctionRectF().getGeometryStroke().contains(x3, y2)) {
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
        NewSelectFunctionType.GeometryStroke geometryStrokeType = NewSelectFunctionTypeKt.getGeometryStrokeType(this.functionTypeList);
        if (geometryStrokeType != null && geometryStrokeType.getIsSelected()) {
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
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        if (getSingleGraph()) {
            PointF trianglePointF = getTrianglePointF();
            if (trianglePointF != null) {
                float f8 = trianglePointF.x;
                float f9 = fMapRadius / 2;
                float f10 = trianglePointF.y;
                if (new RectF(f8 - f9, f10 - f9, f8 + f9, f10 + f9).contains(f, f7)) {
                    setCurrentFunctionMode(NewSelectFunctionMode.GeometryPoint.INSTANCE);
                    return true;
                }
            }
            float f11 = fMapRadius / 2;
            if (new RectF(getSelectRectF().left - f11, getSelectRectF().centerY() - f11, getSelectRectF().left + f11, getSelectRectF().centerY() + f11).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Left.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().centerX() - f11, getSelectRectF().top - f11, getSelectRectF().centerX() + f11, getSelectRectF().top + f11).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Top.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().right - f11, getSelectRectF().centerY() - f11, getSelectRectF().right + f11, getSelectRectF().centerY() + f11).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Right.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().centerX() - f11, getSelectRectF().bottom - f11, getSelectRectF().centerX() + f11, getSelectRectF().bottom + f11).contains(f, f7)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Bottom.INSTANCE);
                return true;
            }
        }
        float f12 = 2;
        float f13 = fMapRadius / f12;
        if (new RectF(getSelectRectF().centerX() - f13, AbstractC1923c.m1036D(fMapRadius, 5, f12, getSelectRectF().top), getSelectRectF().centerX() + f13, AbstractC1923c.m1036D(fMapRadius, 3, f12, getSelectRectF().top)).contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f13, getSelectRectF().bottom - f13, getSelectRectF().right + f13, getSelectRectF().bottom + f13).contains(f, f7)) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.setSelectGraphList(java.util.List):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:6301
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        int i = 0;
        functionRectF.getGeometryStroke().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getColorList().clear();
        ArrayList<RectF> arrayList = this.colorRectFList;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            RectF rectF = arrayList.get(i8);
            i8++;
            RectF rectF2 = rectF;
            functionRectF.getColorList().add(new RectF(getSelectFunctionRectF().left + rectF2.left, getBoardConfig().getSelectButtonHeight() + 13.0f + getSelectFunctionRectF().top + rectF2.top, getSelectFunctionRectF().left + rectF2.right, getBoardConfig().getSelectButtonHeight() + 13.0f + getSelectFunctionRectF().top + rectF2.bottom));
        }
        getFunctionRectF().getCustomColor().setEmpty();
        CustomColorView selectCustomColorView = getBoardConfig().getSelectCustomColorView();
        if (selectCustomColorView != null) {
            List<SelectColor> functionColorList = getFunctionColorList();
            if ((functionColorList != null ? NewSelectFunctionTypeKt.getCustomColor(functionColorList) : null) == null) {
                selectCustomColorView = null;
            }
            if (selectCustomColorView != null) {
                float f = 2;
                functionRectF.getCustomColor().set(getSelectFunctionRectF().left, ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f) + getSelectFunctionRectF().top, selectCustomColorView.getWidth() + getSelectFunctionRectF().left, selectCustomColorView.getHeight() + ((getBoardConfig().getSelectButtonHeight() + 13.0f) * f) + getSelectFunctionRectF().top);
            }
        }
        if (getIsDirectionLeft()) {
            return;
        }
        float f7 = (functionRectF.getDelete().right - functionRectF.getGeometryStroke().left) + 16.0f;
        functionRectF.getGeometryStroke().offset(getSelectFunctionRectF().width() - f7, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f7, 0.0f);
        float f8 = (((RectF) AbstractC5805t.m5235o0(functionRectF.getColorList())).right - ((RectF) AbstractC5805t.m5228h0(functionRectF.getColorList())).left) + 46.0f;
        ArrayList<RectF> colorList = functionRectF.getColorList();
        int size2 = colorList.size();
        while (i < size2) {
            RectF rectF3 = colorList.get(i);
            i++;
            rectF3.offset(getSelectFunctionRectF().width() - f8, 0.0f);
        }
        functionRectF.getCustomColor().offset(getSelectFunctionRectF().width() - functionRectF.getCustomColor().width(), 0.0f);
    }
}
