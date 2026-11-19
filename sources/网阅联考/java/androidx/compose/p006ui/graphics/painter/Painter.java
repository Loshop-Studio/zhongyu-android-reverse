package androidx.compose.p006ui.graphics.painter;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.RectKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.Paint;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J5\u0010\u001e\u001a\u00020\n*\u00020\t2\u0006\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\u00020\n*\u00020\tH$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\rX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m5175d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "()V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "useLayer", "", "applyAlpha", "applyColorFilter", "applyLayoutDirection", "configureAlpha", "configureColorFilter", "configureLayoutDirection", "rtl", "obtainPaint", "draw", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "onDraw", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class Painter {
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final Function1<DrawScope, Unit> drawLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "$this$null");
            this.this$0.onDraw(drawScope);
        }
    };

    private final void configureAlpha(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!applyAlpha(alpha)) {
            if (alpha == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(alpha);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.colorFilter, colorFilter)) {
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

    private final void configureLayoutDirection(LayoutDirection rtl) {
        if (this.layoutDirection != rtl) {
            applyLayoutDirection(rtl);
            this.layoutDirection = rtl;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m9712drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j4, float f4, ColorFilter colorFilter, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i4 & 2) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i4 & 4) != 0) {
            colorFilter = null;
        }
        painter.m9713drawx_KDEd0(drawScope, j4, f5, colorFilter);
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

    public boolean applyAlpha(float alpha) {
        return false;
    }

    public boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m9713drawx_KDEd0(DrawScope draw, long j4, float f4, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        configureAlpha(f4);
        configureColorFilter(colorFilter);
        configureLayoutDirection(draw.getLayoutDirection());
        float fM9014getWidthimpl = Size.m9014getWidthimpl(draw.mo9614getSizeNHjbRc()) - Size.m9014getWidthimpl(j4);
        float fM9011getHeightimpl = Size.m9011getHeightimpl(draw.mo9614getSizeNHjbRc()) - Size.m9011getHeightimpl(j4);
        draw.getDrawContext().getTransform().inset(0.0f, 0.0f, fM9014getWidthimpl, fM9011getHeightimpl);
        if (f4 > 0.0f && Size.m9014getWidthimpl(j4) > 0.0f && Size.m9011getHeightimpl(j4) > 0.0f) {
            if (this.useLayer) {
                Rect rectM8985Recttz77jQw = RectKt.m8985Recttz77jQw(Offset.INSTANCE.m8961getZeroF1C5BW0(), SizeKt.Size(Size.m9014getWidthimpl(j4), Size.m9011getHeightimpl(j4)));
                Canvas canvas = draw.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(rectM8985Recttz77jQw, obtainPaint());
                    onDraw(draw);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(draw);
            }
        }
        draw.getDrawContext().getTransform().inset(-0.0f, -0.0f, -fM9014getWidthimpl, -fM9011getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo9707getIntrinsicSizeNHjbRc();

    public abstract void onDraw(DrawScope drawScope);
}
