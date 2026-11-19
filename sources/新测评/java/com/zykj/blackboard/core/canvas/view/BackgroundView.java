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
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p077e5.AbstractC7356q;
import p155l4.InterfaceC8498c;

/* loaded from: classes4.dex */
public final class BackgroundView extends View implements InterfaceC8498c {

    /* renamed from: a */
    public int f7147a;

    /* renamed from: b */
    public final Paint f7148b;

    /* renamed from: c */
    public final Path f7149c;

    /* renamed from: d */
    public BackgroundLineConfig.BackgroundLineType f7150d;

    /* renamed from: e */
    public float f7151e;

    /* renamed from: f */
    public final Path f7152f;

    /* renamed from: g */
    public float f7153g;

    /* renamed from: h */
    public final Matrix f7154h;

    /* renamed from: i */
    public Map f7155i;

    /* renamed from: com.zykj.blackboard.core.canvas.view.BackgroundView$a */
    public /* synthetic */ class C6635a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7156a;

        static {
            int[] iArr = new int[BackgroundLineConfig.BackgroundLineType.values().length];
            iArr[BackgroundLineConfig.BackgroundLineType.Horizontal.ordinal()] = 1;
            iArr[BackgroundLineConfig.BackgroundLineType.Interweave.ordinal()] = 2;
            f7156a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7155i = new LinkedHashMap();
        this.f7147a = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.f7148b = paint;
        this.f7149c = new Path();
        this.f7150d = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.f7151e = 96.0f;
        this.f7152f = new Path();
        this.f7154h = new Matrix();
    }

    /* renamed from: c */
    public static /* synthetic */ void m6248c(BackgroundView backgroundView, boolean z9, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            matrix = backgroundView.f7154h;
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
            f12 = backgroundView.f7151e;
        }
        float f15 = f12;
        if ((i10 & 32) != 0) {
            backgroundLineType = backgroundView.f7150d;
        }
        backgroundView.m6250b(z9, matrix2, f13, f14, f15, backgroundLineType);
    }

    @Override // p155l4.InterfaceC8498c
    /* renamed from: a */
    public void mo6249a(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        canvas.drawColor(this.f7147a);
        if (m6252e()) {
            Rect clipBounds = canvas.getClipBounds();
            Intrinsics.checkNotNullExpressionValue(clipBounds, "getClipBounds()");
            RectF rectFM11788a = AbstractC7356q.m11788a(clipBounds);
            AbstractC7352m.m11777b(matrix).mapRect(rectFM11788a);
            Path pathM6251d = m6251d(rectFM11788a.left, rectFM11788a.right, rectFM11788a.top, rectFM11788a.bottom, this.f7151e, this.f7150d);
            pathM6251d.transform(matrix);
            canvas.drawPath(pathM6251d, this.f7148b);
        }
    }

    /* renamed from: b */
    public final void m6250b(boolean z9, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        BackgroundView backgroundView;
        if (!m6252e()) {
            this.f7149c.reset();
            return;
        }
        float f13 = this.f7153g;
        float f14 = f12 * f13;
        if (z9) {
            float f15 = f12 * f13;
            backgroundView = this;
            this.f7152f.set(backgroundView.m6251d(0.0f, f10, 0.0f, f11, f15, backgroundLineType));
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
        Path path = backgroundView.f7149c;
        path.set(backgroundView.f7152f);
        path.transform(matrix2);
    }

    /* renamed from: d */
    public final Path m6251d(final float f10, float f11, final float f12, float f13, final float f14, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        final Path path = new Path();
        final int i10 = ((int) ((f13 - f12) / f14)) + 3;
        final int i11 = ((int) ((f11 - f10) / f14)) + 3;
        final float f15 = i11 * f14;
        final float f16 = i10 * f14;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$vFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
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
        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$hFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
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
        int i12 = C6635a.f7156a[backgroundLineType.ordinal()];
        if (i12 == 1) {
            function0.invoke();
            return path;
        }
        if (i12 != 2) {
            return path;
        }
        function0.invoke();
        function02.invoke();
        return path;
    }

    /* renamed from: e */
    public final boolean m6252e() {
        return this.f7148b.getColor() != 0;
    }

    @Override // p155l4.InterfaceC8498c
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.f7148b.getColor(), this.f7151e, this.f7150d, this.f7148b.getStrokeWidth());
    }

    @Override // p155l4.InterfaceC8498c
    public int getMyBackgroundColor() {
        return this.f7147a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(this.f7147a);
            if (m6252e()) {
                canvas.drawPath(this.f7149c, this.f7148b);
            }
        }
    }

    @Override // p155l4.InterfaceC8498c
    public void refresh() {
        postInvalidateOnAnimation();
    }

    @Override // p155l4.InterfaceC8498c
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        boolean z9;
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        boolean z10 = true;
        if (this.f7151e == backgroundLineConfig.m5975b()) {
            z9 = false;
        } else {
            this.f7151e = backgroundLineConfig.m5975b();
            z9 = true;
        }
        if (this.f7150d != backgroundLineConfig.m5976c()) {
            this.f7150d = backgroundLineConfig.m5976c();
        } else {
            z10 = z9;
        }
        this.f7148b.setColor(backgroundLineConfig.m5974a());
        this.f7148b.setStrokeWidth(backgroundLineConfig.m5977d());
        if (z10) {
            m6248c(this, true, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        }
    }

    @Override // p155l4.InterfaceC8498c
    public void setMatrix(Matrix adapterMatrix) {
        Intrinsics.checkNotNullParameter(adapterMatrix, "adapterMatrix");
        this.f7154h.set(adapterMatrix);
        Log.i("bbbb", "drawBackground fuck -> " + adapterMatrix);
        float fM11776a = AbstractC7352m.m11776a(adapterMatrix);
        boolean z9 = this.f7153g == fM11776a;
        boolean z10 = !z9;
        if (!z9) {
            this.f7153g = fM11776a;
        }
        m6248c(this, z10, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        postInvalidateOnAnimation();
    }

    @Override // p155l4.InterfaceC8498c
    public void setMyBackgroundColor(int i10) {
        this.f7147a = i10;
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
