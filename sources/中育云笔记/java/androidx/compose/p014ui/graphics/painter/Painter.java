package androidx.compose.p014ui.graphics.painter;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public abstract class Painter {
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final InterfaceC9540l drawLambda = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(DrawScope drawScope) {
            this.this$0.onDraw(drawScope);
        }
    };

    private final void configureAlpha(float f10) {
        if (this.alpha == f10) {
            return;
        }
        if (!applyAlpha(f10)) {
            if (f10 == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f10);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f10);
                this.useLayer = true;
            }
        }
        this.alpha = f10;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (AbstractC9979u.m20289b(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m31554drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j10, float f10, ColorFilter colorFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            colorFilter = null;
        }
        painter.m31555drawx_KDEd0(drawScope, j10, f11, colorFilter);
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    public boolean applyAlpha(float f10) {
        return false;
    }

    public boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m31555drawx_KDEd0(DrawScope drawScope, long j10, float f10, ColorFilter colorFilter) {
        configureAlpha(f10);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat(i11);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.useLayer) {
                        long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                        Rect rectM30677Recttz77jQw = RectKt.m30677Recttz77jQw(jM30653getZeroF1C5BW0, Size.m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(rectM30677Recttz77jQw, obtainPaint());
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo31549getIntrinsicSizeNHjbRc();

    public abstract void onDraw(DrawScope drawScope);
}
