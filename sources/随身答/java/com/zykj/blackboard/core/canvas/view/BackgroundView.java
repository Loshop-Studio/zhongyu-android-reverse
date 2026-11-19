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
import p023b5.InterfaceC5113c;
import p263u5.AbstractC9695n;
import p263u5.AbstractC9699r;

/* loaded from: classes4.dex */
public final class BackgroundView extends View implements InterfaceC5113c {

    /* renamed from: a */
    public int f8429a;

    /* renamed from: b */
    public final Paint f8430b;

    /* renamed from: c */
    public final Path f8431c;

    /* renamed from: d */
    public BackgroundLineConfig.BackgroundLineType f8432d;

    /* renamed from: e */
    public float f8433e;

    /* renamed from: f */
    public final Path f8434f;

    /* renamed from: g */
    public float f8435g;

    /* renamed from: h */
    public final Matrix f8436h;

    /* renamed from: i */
    public Map f8437i;

    /* renamed from: com.zykj.blackboard.core.canvas.view.BackgroundView$a */
    public /* synthetic */ class C6952a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8438a;

        static {
            int[] iArr = new int[BackgroundLineConfig.BackgroundLineType.values().length];
            iArr[BackgroundLineConfig.BackgroundLineType.Horizontal.ordinal()] = 1;
            iArr[BackgroundLineConfig.BackgroundLineType.Interweave.ordinal()] = 2;
            f8438a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8437i = new LinkedHashMap();
        this.f8429a = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.f8430b = paint;
        this.f8431c = new Path();
        this.f8432d = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.f8433e = 96.0f;
        this.f8434f = new Path();
        this.f8436h = new Matrix();
    }

    /* renamed from: c */
    public static /* synthetic */ void m7343c(BackgroundView backgroundView, boolean z9, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            matrix = backgroundView.f8436h;
        }
        Matrix matrix2 = matrix;
        if ((i9 & 4) != 0) {
            f10 = backgroundView.getWidth();
        }
        float f13 = f10;
        if ((i9 & 8) != 0) {
            f11 = backgroundView.getHeight();
        }
        float f14 = f11;
        if ((i9 & 16) != 0) {
            f12 = backgroundView.f8433e;
        }
        float f15 = f12;
        if ((i9 & 32) != 0) {
            backgroundLineType = backgroundView.f8432d;
        }
        backgroundView.m7344b(z9, matrix2, f13, f14, f15, backgroundLineType);
    }

    @Override // p023b5.InterfaceC5113c
    /* renamed from: a */
    public void mo2173a(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        canvas.drawColor(this.f8429a);
        if (m7346e()) {
            Rect clipBounds = canvas.getClipBounds();
            Intrinsics.checkNotNullExpressionValue(clipBounds, "getClipBounds()");
            RectF rectFM16212a = AbstractC9699r.m16212a(clipBounds);
            AbstractC9695n.m16200b(matrix).mapRect(rectFM16212a);
            Path pathM7345d = m7345d(rectFM16212a.left, rectFM16212a.right, rectFM16212a.top, rectFM16212a.bottom, this.f8433e, this.f8432d);
            pathM7345d.transform(matrix);
            canvas.drawPath(pathM7345d, this.f8430b);
        }
    }

    /* renamed from: b */
    public final void m7344b(boolean z9, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        BackgroundView backgroundView;
        if (!m7346e()) {
            this.f8431c.reset();
            return;
        }
        float f13 = this.f8435g;
        float f14 = f12 * f13;
        if (z9) {
            float f15 = f12 * f13;
            backgroundView = this;
            this.f8434f.set(backgroundView.m7345d(0.0f, f10, 0.0f, f11, f15, backgroundLineType));
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
        Path path = backgroundView.f8431c;
        path.set(backgroundView.f8434f);
        path.transform(matrix2);
    }

    /* renamed from: d */
    public final Path m7345d(final float f10, float f11, final float f12, float f13, final float f14, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        final Path path = new Path();
        final int i9 = ((int) ((f13 - f12) / f14)) + 3;
        final int i10 = ((int) ((f11 - f10) / f14)) + 3;
        final float f15 = i10 * f14;
        final float f16 = i9 * f14;
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
                int i11 = i9;
                Path path2 = path;
                float f17 = f10;
                float f18 = f12;
                float f19 = f14;
                float f20 = f15;
                for (int i12 = 0; i12 < i11; i12++) {
                    float f21 = (i12 * f19) + f18;
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
                int i11 = i10;
                Path path2 = path;
                float f17 = f10;
                float f18 = f14;
                float f19 = f12;
                float f20 = f16;
                for (int i12 = 0; i12 < i11; i12++) {
                    float f21 = (i12 * f18) + f17;
                    path2.moveTo(f21, f19);
                    path2.lineTo(f21, f19 + f20);
                }
            }
        };
        int i11 = C6952a.f8438a[backgroundLineType.ordinal()];
        if (i11 == 1) {
            function0.invoke();
            return path;
        }
        if (i11 != 2) {
            return path;
        }
        function0.invoke();
        function02.invoke();
        return path;
    }

    /* renamed from: e */
    public final boolean m7346e() {
        return this.f8430b.getColor() != 0;
    }

    @Override // p023b5.InterfaceC5113c
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.f8430b.getColor(), this.f8433e, this.f8432d, this.f8430b.getStrokeWidth());
    }

    @Override // p023b5.InterfaceC5113c
    public int getMyBackgroundColor() {
        return this.f8429a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(this.f8429a);
            if (m7346e()) {
                canvas.drawPath(this.f8431c, this.f8430b);
            }
        }
    }

    @Override // p023b5.InterfaceC5113c
    public void refresh() {
        postInvalidateOnAnimation();
    }

    @Override // p023b5.InterfaceC5113c
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        boolean z9;
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        boolean z10 = true;
        if (this.f8433e == backgroundLineConfig.m7070b()) {
            z9 = false;
        } else {
            this.f8433e = backgroundLineConfig.m7070b();
            z9 = true;
        }
        if (this.f8432d != backgroundLineConfig.m7071c()) {
            this.f8432d = backgroundLineConfig.m7071c();
        } else {
            z10 = z9;
        }
        this.f8430b.setColor(backgroundLineConfig.m7069a());
        this.f8430b.setStrokeWidth(backgroundLineConfig.m7072d());
        if (z10) {
            m7343c(this, true, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        }
    }

    @Override // p023b5.InterfaceC5113c
    public void setMatrix(Matrix adapterMatrix) {
        Intrinsics.checkNotNullParameter(adapterMatrix, "adapterMatrix");
        this.f8436h.set(adapterMatrix);
        Log.i("bbbb", "drawBackground fuck -> " + adapterMatrix);
        float fM16199a = AbstractC9695n.m16199a(adapterMatrix);
        boolean z9 = this.f8435g == fM16199a;
        boolean z10 = !z9;
        if (!z9) {
            this.f8435g = fM16199a;
        }
        m7343c(this, z10, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        postInvalidateOnAnimation();
    }

    @Override // p023b5.InterfaceC5113c
    public void setMyBackgroundColor(int i9) {
        this.f8429a = i9;
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
