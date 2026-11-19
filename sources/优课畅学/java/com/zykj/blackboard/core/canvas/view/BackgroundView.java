package com.zykj.blackboard.core.canvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class BackgroundView extends View implements BackgroundLayer {
    public Map<Integer, View> _$_findViewCache;
    private final Matrix adapterMatrix;
    private float lastScale;
    private float lineSpacing;
    private BackgroundLineConfig.BackgroundLineType lineType;
    private int mBackgroundColor;
    private final Paint mLinePaint;
    private final Path mLinePath;
    private final Path originLinePath;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackgroundLineConfig.BackgroundLineType.values().length];
            iArr[BackgroundLineConfig.BackgroundLineType.Horizontal.ordinal()] = 1;
            iArr[BackgroundLineConfig.BackgroundLineType.Interweave.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9133u.m16133g(context, "context");
    }

    private final void calculateLinePath(boolean z10, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        BackgroundView backgroundView;
        if (!checkNeedLine()) {
            this.mLinePath.reset();
            return;
        }
        float f13 = this.lastScale;
        float f14 = f12 * f13;
        if (z10) {
            float f15 = f12 * f13;
            backgroundView = this;
            this.originLinePath.set(backgroundView.calculateOriginLinePath(0.0f, f10, 0.0f, f11, f15, backgroundLineType));
            f14 = f15;
        } else {
            backgroundView = this;
        }
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr);
        float f16 = fArr[0];
        float f17 = f16 < 0.0f ? f16 + (((int) ((1.0f - f16) / f14)) * f14) : f16 - (((int) (f16 / f14)) * f14);
        float f18 = fArr[1];
        PointF pointF = new PointF(f17, f18 < 1.0f ? f18 + (((int) ((1.0f - f18) / f14)) * f14) : f18 - (((int) (f18 / f14)) * f14));
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate(pointF.x - f14, pointF.y - f14);
        Path path = backgroundView.mLinePath;
        path.set(backgroundView.originLinePath);
        path.transform(matrix2);
    }

    public static /* synthetic */ void calculateLinePath$default(BackgroundView backgroundView, boolean z10, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            matrix = backgroundView.adapterMatrix;
        }
        Matrix matrix2 = matrix;
        if ((i10 & 4) != 0) {
            f10 = backgroundView.getWidth();
        }
        float f13 = f10;
        if ((i10 & 8) != 0) {
            f11 = backgroundView.getHeight();
        }
        float f14 = f11;
        if ((i10 & 16) != 0) {
            f12 = backgroundView.lineSpacing;
        }
        float f15 = f12;
        if ((i10 & 32) != 0) {
            backgroundLineType = backgroundView.lineType;
        }
        backgroundView.calculateLinePath(z10, matrix2, f13, f14, f15, backgroundLineType);
    }

    private final Path calculateOriginLinePath(final float f10, float f11, final float f12, float f13, final float f14, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        final Path path = new Path();
        final int i10 = ((int) ((f13 - f12) / f14)) + 3;
        final int i11 = ((int) ((f11 - f10) / f14)) + 3;
        final float f15 = i11 * f14;
        final float f16 = i10 * f14;
        InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$vFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27429invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27429invoke() {
                int i12 = i10;
                Path path2 = path;
                float f17 = f10;
                float f18 = f12;
                float f19 = f14;
                float f20 = f15;
                for (int i13 = 0; i13 < i12; i13++) {
                    float f21 = (i13 * f19) + f18;
                    path2.moveTo(f17, f21);
                    path2.lineTo(f17 + f20, f21);
                }
            }
        };
        InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$hFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27428invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27428invoke() {
                int i12 = i11;
                Path path2 = path;
                float f17 = f10;
                float f18 = f14;
                float f19 = f12;
                float f20 = f16;
                for (int i13 = 0; i13 < i12; i13++) {
                    float f21 = (i13 * f18) + f17;
                    path2.moveTo(f21, f19);
                    path2.lineTo(f21, f19 + f20);
                }
            }
        };
        int i12 = WhenMappings.$EnumSwitchMapping$0[backgroundLineType.ordinal()];
        if (i12 == 1) {
            interfaceC10559a.invoke();
            return path;
        }
        if (i12 != 2) {
            return path;
        }
        interfaceC10559a.invoke();
        interfaceC10559a2.invoke();
        return path;
    }

    private final boolean checkNeedLine() {
        return this.mLinePaint.getColor() != 0;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void drawBackground(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        canvas.drawColor(this.mBackgroundColor);
        if (checkNeedLine()) {
            Rect clipBounds = canvas.getClipBounds();
            AbstractC9133u.m16132f(clipBounds, "getClipBounds()");
            RectF rectF = RectExtKt.toRectF(clipBounds);
            MatrixExtKt.invert(matrix).mapRect(rectF);
            Path pathCalculateOriginLinePath = calculateOriginLinePath(rectF.left, rectF.right, rectF.top, rectF.bottom, this.lineSpacing, this.lineType);
            pathCalculateOriginLinePath.transform(matrix);
            canvas.drawPath(pathCalculateOriginLinePath, this.mLinePaint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.mLinePaint.getColor(), this.lineSpacing, this.lineType, this.mLinePaint.getStrokeWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public int getMyBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(this.mBackgroundColor);
            if (checkNeedLine()) {
                canvas.drawPath(this.mLinePath, this.mLinePaint);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void refresh() {
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        boolean z10;
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        boolean z11 = true;
        if (this.lineSpacing == backgroundLineConfig.getLineSpace()) {
            z10 = false;
        } else {
            this.lineSpacing = backgroundLineConfig.getLineSpace();
            z10 = true;
        }
        if (this.lineType != backgroundLineConfig.getLineType()) {
            this.lineType = backgroundLineConfig.getLineType();
        } else {
            z11 = z10;
        }
        this.mLinePaint.setColor(backgroundLineConfig.getLineColor());
        this.mLinePaint.setStrokeWidth(backgroundLineConfig.getLineWidth());
        if (z11) {
            calculateLinePath$default(this, true, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMatrix(Matrix adapterMatrix) {
        AbstractC9133u.m16133g(adapterMatrix, "adapterMatrix");
        this.adapterMatrix.set(adapterMatrix);
        Log.i("bbbb", "drawBackground fuck -> " + adapterMatrix);
        float scaleX = MatrixExtKt.getScaleX(adapterMatrix);
        boolean z10 = this.lastScale == scaleX;
        boolean z11 = !z10;
        if (!z10) {
            this.lastScale = scaleX;
        }
        calculateLinePath$default(this, z11, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMyBackgroundColor(int i10) {
        this.mBackgroundColor = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.mBackgroundColor = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        paint.setStrokeWidth(3.0f);
        this.mLinePaint = paint;
        this.mLinePath = new Path();
        this.lineType = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.lineSpacing = 96.0f;
        this.originLinePath = new Path();
        this.adapterMatrix = new Matrix();
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
