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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.AbstractC10355r;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p390w9.InterfaceC11713b;

/* loaded from: classes5.dex */
public final class BackgroundView extends View implements InterfaceC11713b {

    /* renamed from: c */
    public int f17981c;

    /* renamed from: d */
    public final Paint f17982d;

    /* renamed from: e */
    public final Path f17983e;

    /* renamed from: f */
    public BackgroundLineConfig.BackgroundLineType f17984f;

    /* renamed from: g */
    public float f17985g;

    /* renamed from: h */
    public final Path f17986h;

    /* renamed from: i */
    public float f17987i;

    /* renamed from: j */
    public final Matrix f17988j;

    /* renamed from: k */
    public Map f17989k;

    /* renamed from: com.zykj.blackboard.core.canvas.view.BackgroundView$a */
    public /* synthetic */ class C8332a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17990a;

        static {
            int[] iArr = new int[BackgroundLineConfig.BackgroundLineType.values().length];
            iArr[BackgroundLineConfig.BackgroundLineType.Horizontal.ordinal()] = 1;
            iArr[BackgroundLineConfig.BackgroundLineType.Interweave.ordinal()] = 2;
            f17990a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: c */
    public static /* synthetic */ void m13960c(BackgroundView backgroundView, boolean z10, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            matrix = backgroundView.f17988j;
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
            f12 = backgroundView.f17985g;
        }
        float f15 = f12;
        if ((i10 & 32) != 0) {
            backgroundLineType = backgroundView.f17984f;
        }
        backgroundView.m13962b(z10, matrix2, f13, f14, f15, backgroundLineType);
    }

    @Override // p390w9.InterfaceC11713b
    /* renamed from: a */
    public void mo13961a(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        canvas.drawColor(this.f17981c);
        if (m13964e()) {
            Rect clipBounds = canvas.getClipBounds();
            AbstractC9979u.m20293f(clipBounds, "getClipBounds()");
            RectF rectFM21677a = AbstractC10355r.m21677a(clipBounds);
            AbstractC10351n.m21660b(matrix).mapRect(rectFM21677a);
            Path pathM13963d = m13963d(rectFM21677a.left, rectFM21677a.right, rectFM21677a.top, rectFM21677a.bottom, this.f17985g, this.f17984f);
            pathM13963d.transform(matrix);
            canvas.drawPath(pathM13963d, this.f17982d);
        }
    }

    /* renamed from: b */
    public final void m13962b(boolean z10, Matrix matrix, float f10, float f11, float f12, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        BackgroundView backgroundView;
        if (!m13964e()) {
            this.f17983e.reset();
            return;
        }
        float f13 = this.f17987i;
        float f14 = f12 * f13;
        if (z10) {
            float f15 = f12 * f13;
            backgroundView = this;
            this.f17986h.set(backgroundView.m13963d(0.0f, f10, 0.0f, f11, f15, backgroundLineType));
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
        Path path = backgroundView.f17983e;
        path.set(backgroundView.f17986h);
        path.transform(matrix2);
    }

    /* renamed from: d */
    public final Path m13963d(final float f10, float f11, final float f12, float f13, final float f14, BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        final Path path = new Path();
        final int i10 = ((int) ((f13 - f12) / f14)) + 3;
        final int i11 = ((int) ((f11 - f10) / f14)) + 3;
        final float f15 = i11 * f14;
        final float f16 = i10 * f14;
        InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$vFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34006invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34006invoke() {
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
        InterfaceC9529a interfaceC9529a2 = new InterfaceC9529a() { // from class: com.zykj.blackboard.core.canvas.view.BackgroundView$calculateOriginLinePath$hFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34005invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34005invoke() {
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
        int i12 = C8332a.f17990a[backgroundLineType.ordinal()];
        if (i12 == 1) {
            interfaceC9529a.invoke();
            return path;
        }
        if (i12 != 2) {
            return path;
        }
        interfaceC9529a.invoke();
        interfaceC9529a2.invoke();
        return path;
    }

    /* renamed from: e */
    public final boolean m13964e() {
        return this.f17982d.getColor() != 0;
    }

    @Override // p390w9.InterfaceC11713b
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.f17982d.getColor(), this.f17985g, this.f17984f, this.f17982d.getStrokeWidth());
    }

    @Override // p390w9.InterfaceC11713b
    public int getMyBackgroundColor() {
        return this.f17981c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(this.f17981c);
            if (m13964e()) {
                canvas.drawPath(this.f17983e, this.f17982d);
            }
        }
    }

    @Override // p390w9.InterfaceC11713b
    public void refresh() {
        postInvalidateOnAnimation();
    }

    @Override // p390w9.InterfaceC11713b
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        boolean z10;
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        boolean z11 = true;
        if (this.f17985g == backgroundLineConfig.m13712b()) {
            z10 = false;
        } else {
            this.f17985g = backgroundLineConfig.m13712b();
            z10 = true;
        }
        if (this.f17984f != backgroundLineConfig.m13713c()) {
            this.f17984f = backgroundLineConfig.m13713c();
        } else {
            z11 = z10;
        }
        this.f17982d.setColor(backgroundLineConfig.m13711a());
        this.f17982d.setStrokeWidth(backgroundLineConfig.m13714d());
        if (z11) {
            m13960c(this, true, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        }
    }

    @Override // p390w9.InterfaceC11713b
    public void setMatrix(Matrix adapterMatrix) {
        AbstractC9979u.m20294g(adapterMatrix, "adapterMatrix");
        this.f17988j.set(adapterMatrix);
        Log.i("bbbb", "drawBackground fuck -> " + adapterMatrix);
        float fM21659a = AbstractC10351n.m21659a(adapterMatrix);
        boolean z10 = this.f17987i == fM21659a;
        boolean z11 = !z10;
        if (!z10) {
            this.f17987i = fM21659a;
        }
        m13960c(this, z11, null, 0.0f, 0.0f, 0.0f, null, 62, null);
        postInvalidateOnAnimation();
    }

    @Override // p390w9.InterfaceC11713b
    public void setMyBackgroundColor(int i10) {
        this.f17981c = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f17989k = new LinkedHashMap();
        this.f17981c = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.f17982d = paint;
        this.f17983e = new Path();
        this.f17984f = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.f17985g = 96.0f;
        this.f17986h = new Path();
        this.f17988j = new Matrix();
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
