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
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJI\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010D¨\u0006E"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "Landroid/view/View;", "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "needRebuildLinePath", "Landroid/graphics/Matrix;", "matrix", "", "w", "h", "space", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ld6/s;", "calculateLinePath", "(ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V", "startX", "endX", "startY", "endY", "Landroid/graphics/Path;", "calculateOriginLinePath", "(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;", "checkNeedLine", "()Z", "refresh", "()V", "adapterMatrix", "setMatrix", "(Landroid/graphics/Matrix;)V", TypedValues.Custom.S_COLOR, "setMyBackgroundColor", "(I)V", "getMyBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "mBackgroundColor", "I", "Landroid/graphics/Paint;", "mLinePaint", "Landroid/graphics/Paint;", "mLinePath", "Landroid/graphics/Path;", "lineType", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "lineSpacing", "F", "originLinePath", "lastScale", "Landroid/graphics/Matrix;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BackgroundView extends View implements BackgroundLayer {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final Matrix adapterMatrix;
    private float lastScale;
    private float lineSpacing;

    @NotNull
    private BackgroundLineConfig.BackgroundLineType lineType;
    private int mBackgroundColor;

    @NotNull
    private final Paint mLinePaint;

    @NotNull
    private final Path mLinePath;

    @NotNull
    private final Path originLinePath;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    @JvmOverloads
    public BackgroundView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final void calculateLinePath(boolean needRebuildLinePath, Matrix matrix, float w8, float h, float space, BackgroundLineConfig.BackgroundLineType type) {
        BackgroundView backgroundView;
        if (!checkNeedLine()) {
            this.mLinePath.reset();
            return;
        }
        float f = this.lastScale;
        float f7 = space * f;
        if (needRebuildLinePath) {
            float f8 = space * f;
            backgroundView = this;
            this.originLinePath.set(backgroundView.calculateOriginLinePath(0.0f, w8, 0.0f, h, f8, type));
            f7 = f8;
        } else {
            backgroundView = this;
        }
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr);
        float f9 = fArr[0];
        float f10 = f9 < 0.0f ? (((int) ((1.0f - f9) / f7)) * f7) + f9 : f9 - (((int) (f9 / f7)) * f7);
        float f11 = fArr[1];
        PointF pointF = new PointF(f10, f11 < 1.0f ? (((int) ((1.0f - f11) / f7)) * f7) + f11 : f11 - (((int) (f11 / f7)) * f7));
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate(pointF.x - f7, pointF.y - f7);
        Path path = backgroundView.mLinePath;
        path.set(backgroundView.originLinePath);
        path.transform(matrix2);
    }

    public static /* synthetic */ void calculateLinePath$default(BackgroundView backgroundView, boolean z8, Matrix matrix, float f, float f7, float f8, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i, Object obj) {
        if ((i & 2) != 0) {
            matrix = backgroundView.adapterMatrix;
        }
        Matrix matrix2 = matrix;
        if ((i & 4) != 0) {
            f = backgroundView.getWidth();
        }
        float f9 = f;
        if ((i & 8) != 0) {
            f7 = backgroundView.getHeight();
        }
        float f10 = f7;
        if ((i & 16) != 0) {
            f8 = backgroundView.lineSpacing;
        }
        float f11 = f8;
        if ((i & 32) != 0) {
            backgroundLineType = backgroundView.lineType;
        }
        backgroundView.calculateLinePath(z8, matrix2, f9, f10, f11, backgroundLineType);
    }

    private final Path calculateOriginLinePath(final float startX, float endX, final float startY, float endY, final float space, BackgroundLineConfig.BackgroundLineType type) {
        final Path path = new Path();
        final int i = ((int) ((endY - startY) / space)) + 3;
        final int i8 = ((int) ((endX - startX) / space)) + 3;
        final float f = i8 * space;
        final float f7 = i * space;
        InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$vFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13758invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13758invoke() {
                int i9 = i;
                Path path2 = path;
                float f8 = startX;
                float f9 = startY;
                float f10 = space;
                float f11 = f;
                for (int i10 = 0; i10 < i9; i10++) {
                    float f12 = (i10 * f10) + f9;
                    path2.moveTo(f8, f12);
                    path2.lineTo(f8 + f11, f12);
                }
            }
        };
        InterfaceC6469a interfaceC6469a2 = new InterfaceC6469a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$hFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13757invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13757invoke() {
                int i9 = i8;
                Path path2 = path;
                float f8 = startX;
                float f9 = space;
                float f10 = startY;
                float f11 = f7;
                for (int i10 = 0; i10 < i9; i10++) {
                    float f12 = (i10 * f9) + f8;
                    path2.moveTo(f12, f10);
                    path2.lineTo(f12, f10 + f11);
                }
            }
        };
        int i9 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i9 == 1) {
            interfaceC6469a.invoke();
            return path;
        }
        if (i9 != 2) {
            return path;
        }
        interfaceC6469a.invoke();
        interfaceC6469a2.invoke();
        return path;
    }

    private final boolean checkNeedLine() {
        return this.mLinePaint.getColor() != 0;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void drawBackground(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        canvas.drawColor(this.mBackgroundColor);
        if (checkNeedLine()) {
            Rect clipBounds = canvas.getClipBounds();
            AbstractC5830k.m5329f(clipBounds, "getClipBounds()");
            RectF rectF = RectExtKt.toRectF(clipBounds);
            MatrixExtKt.invert(matrix).mapRect(rectF);
            Path pathCalculateOriginLinePath = calculateOriginLinePath(rectF.left, rectF.right, rectF.top, rectF.bottom, this.lineSpacing, this.lineType);
            pathCalculateOriginLinePath.transform(matrix);
            canvas.drawPath(pathCalculateOriginLinePath, this.mLinePaint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    @NotNull
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.mLinePaint.getColor(), this.lineSpacing, this.lineType, this.mLinePaint.getStrokeWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    /* renamed from: getMyBackgroundColor, reason: from getter */
    public int getMBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
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
    public void setBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        boolean z8;
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        boolean z9 = true;
        if (this.lineSpacing == backgroundLineConfig.getLineSpace()) {
            z8 = false;
        } else {
            this.lineSpacing = backgroundLineConfig.getLineSpace();
            z8 = true;
        }
        if (this.lineType != backgroundLineConfig.getLineType()) {
            this.lineType = backgroundLineConfig.getLineType();
        } else {
            z9 = z8;
        }
        this.mLinePaint.setColor(backgroundLineConfig.getLineColor());
        this.mLinePaint.setStrokeWidth(backgroundLineConfig.getLineWidth());
        if (z9) {
            calculateLinePath$default(this, true, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMatrix(@NotNull Matrix adapterMatrix) {
        AbstractC5830k.m5330g(adapterMatrix, "adapterMatrix");
        this.adapterMatrix.set(adapterMatrix);
        Log.i("bbbb", "drawBackground fuck -> " + adapterMatrix);
        float scaleX = MatrixExtKt.getScaleX(adapterMatrix);
        boolean z8 = this.lastScale == scaleX;
        boolean z9 = !z8;
        if (!z8) {
            this.lastScale = scaleX;
        }
        calculateLinePath$default(this, z9, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMyBackgroundColor(int color) {
        this.mBackgroundColor = color;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.mBackgroundColor = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.mLinePaint = paint;
        this.mLinePath = new Path();
        this.lineType = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.lineSpacing = 96.0f;
        this.originLinePath = new Path();
        this.adapterMatrix = new Matrix();
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }
}
