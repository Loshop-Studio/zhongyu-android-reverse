package androidx.compose.p013ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.PaintingStyle;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo24748getSizeNHjbRc() {
            return this.this$0.getDrawParams().m24746getSizeNHjbRc();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo24749setSizeuvyYCjk(long j10) {
            this.this$0.getDrawParams().m24747setSizeuvyYCjk(j10);
        }
    };

    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, AbstractC9126n abstractC9126n) {
            this(density, layoutDirection, canvas, j10);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m24743copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i10 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i10 & 8) != 0) {
                j10 = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m24745copyUg5Nnss(density, layoutDirection, canvas2, j10);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m24744component4NHjbRc() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m24745copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10) {
            return new DrawParams(density, layoutDirection, canvas, j10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return AbstractC9133u.m16128b(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && AbstractC9133u.m16128b(this.canvas, drawParams.canvas) && Size.m24100equalsimpl0(this.size, drawParams.size);
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m24746getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m24105hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m24747setSizeuvyYCjk(long j10) {
            this.size = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m24108toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j10;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, AbstractC9126n abstractC9126n) {
            this((i10 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i10 & 4) != 0 ? EmptyCanvas.INSTANCE : canvas, (i10 & 8) != 0 ? Size.Companion.m24113getZeroNHjbRc() : j10, null);
        }
    }

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m24714configurePaint2qPWKa0(long j10, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10, int i11) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        long jM24722modulate5vOe2sY = m24722modulate5vOe2sY(j10, f10);
        if (!Color.m24277equalsimpl0(paintSelectPaint.mo24149getColor0d7_KjU(), jM24722modulate5vOe2sY)) {
            paintSelectPaint.mo24155setColor8_81llA(jM24722modulate5vOe2sY);
        }
        if (paintSelectPaint.getShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!AbstractC9133u.m16128b(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m24187equalsimpl0(paintSelectPaint.mo24148getBlendMode0nO6VwU(), i10)) {
            paintSelectPaint.mo24154setBlendModes9anfk8(i10);
        }
        if (!FilterQuality.m24370equalsimpl0(paintSelectPaint.mo24150getFilterQualityfv9h1I(), i11)) {
            paintSelectPaint.mo24156setFilterQualityvDHp3xo(i11);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static /* synthetic */ Paint m24715configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j10, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        return canvasDrawScope.m24714configurePaint2qPWKa0(j10, drawStyle, f10, colorFilter, i10, (i12 & 32) != 0 ? DrawScope.Companion.m24830getDefaultFilterQualityfv9h1I() : i11);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m24716configurePaintswdJneE(Brush brush, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10, int i11) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo24223applyToPq9zytI(mo24827getSizeNHjbRc(), paintSelectPaint, f10);
        } else {
            if (paintSelectPaint.getShader() != null) {
                paintSelectPaint.setShader(null);
            }
            long jMo24149getColor0d7_KjU = paintSelectPaint.mo24149getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m24277equalsimpl0(jMo24149getColor0d7_KjU, companion.m24302getBlack0d7_KjU())) {
                paintSelectPaint.mo24155setColor8_81llA(companion.m24302getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != f10) {
                paintSelectPaint.setAlpha(f10);
            }
        }
        if (!AbstractC9133u.m16128b(paintSelectPaint.getColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m24187equalsimpl0(paintSelectPaint.mo24148getBlendMode0nO6VwU(), i10)) {
            paintSelectPaint.mo24154setBlendModes9anfk8(i10);
        }
        if (!FilterQuality.m24370equalsimpl0(paintSelectPaint.mo24150getFilterQualityfv9h1I(), i11)) {
            paintSelectPaint.mo24156setFilterQualityvDHp3xo(i11);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    public static /* synthetic */ Paint m24717configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = DrawScope.Companion.m24830getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m24716configurePaintswdJneE(brush, drawStyle, f10, colorFilter, i10, i11);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m24718configureStrokePaintQ_0CZUI(long j10, float f10, float f11, int i10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, ColorFilter colorFilter, int i12, int i13) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM24722modulate5vOe2sY = m24722modulate5vOe2sY(j10, f12);
        if (!Color.m24277equalsimpl0(paintObtainStrokePaint.mo24149getColor0d7_KjU(), jM24722modulate5vOe2sY)) {
            paintObtainStrokePaint.mo24155setColor8_81llA(jM24722modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!AbstractC9133u.m16128b(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m24187equalsimpl0(paintObtainStrokePaint.mo24148getBlendMode0nO6VwU(), i12)) {
            paintObtainStrokePaint.mo24154setBlendModes9anfk8(i12);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f10) {
            paintObtainStrokePaint.setStrokeWidth(f10);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f11) {
            paintObtainStrokePaint.setStrokeMiterLimit(f11);
        }
        if (!StrokeCap.m24625equalsimpl0(paintObtainStrokePaint.mo24151getStrokeCapKaPHkGw(), i10)) {
            paintObtainStrokePaint.mo24157setStrokeCapBeK7IIE(i10);
        }
        if (!StrokeJoin.m24635equalsimpl0(paintObtainStrokePaint.mo24152getStrokeJoinLxFBmk8(), i11)) {
            paintObtainStrokePaint.mo24158setStrokeJoinWw9F2mQ(i11);
        }
        if (!AbstractC9133u.m16128b(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m24370equalsimpl0(paintObtainStrokePaint.mo24150getFilterQualityfv9h1I(), i13)) {
            paintObtainStrokePaint.mo24156setFilterQualityvDHp3xo(i13);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static /* synthetic */ Paint m24719configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j10, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m24718configureStrokePaintQ_0CZUI(j10, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.Companion.m24830getDefaultFilterQualityfv9h1I() : i13);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m24720configureStrokePaintho4zsrM(Brush brush, float f10, float f11, int i10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, ColorFilter colorFilter, int i12, int i13) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo24223applyToPq9zytI(mo24827getSizeNHjbRc(), paintObtainStrokePaint, f12);
        } else if (paintObtainStrokePaint.getAlpha() != f12) {
            paintObtainStrokePaint.setAlpha(f12);
        }
        if (!AbstractC9133u.m16128b(paintObtainStrokePaint.getColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m24187equalsimpl0(paintObtainStrokePaint.mo24148getBlendMode0nO6VwU(), i12)) {
            paintObtainStrokePaint.mo24154setBlendModes9anfk8(i12);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f10) {
            paintObtainStrokePaint.setStrokeWidth(f10);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f11) {
            paintObtainStrokePaint.setStrokeMiterLimit(f11);
        }
        if (!StrokeCap.m24625equalsimpl0(paintObtainStrokePaint.mo24151getStrokeCapKaPHkGw(), i10)) {
            paintObtainStrokePaint.mo24157setStrokeCapBeK7IIE(i10);
        }
        if (!StrokeJoin.m24635equalsimpl0(paintObtainStrokePaint.mo24152getStrokeJoinLxFBmk8(), i11)) {
            paintObtainStrokePaint.mo24158setStrokeJoinWw9F2mQ(i11);
        }
        if (!AbstractC9133u.m16128b(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m24370equalsimpl0(paintObtainStrokePaint.mo24150getFilterQualityfv9h1I(), i13)) {
            paintObtainStrokePaint.mo24156setFilterQualityvDHp3xo(i13);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    public static /* synthetic */ Paint m24721configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m24720configureStrokePaintho4zsrM(brush, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.Companion.m24830getDefaultFilterQualityfv9h1I() : i13);
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m24722modulate5vOe2sY(long j10, float f10) {
        return f10 == 1.0f ? j10 : Color.m24275copywmQWz5c$default(j10, Color.m24278getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo24159setStylek9PVt8s(PaintingStyle.Companion.m24543getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo24159setStylek9PVt8s(PaintingStyle.Companion.m24544getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (AbstractC9133u.m16128b(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m24625equalsimpl0(paintObtainStrokePaint.mo24151getStrokeCapKaPHkGw(), stroke.m24896getCapKaPHkGw())) {
            paintObtainStrokePaint.mo24157setStrokeCapBeK7IIE(stroke.m24896getCapKaPHkGw());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m24635equalsimpl0(paintObtainStrokePaint.mo24152getStrokeJoinLxFBmk8(), stroke.m24897getJoinLxFBmk8())) {
            paintObtainStrokePaint.mo24158setStrokeJoinWw9F2mQ(stroke.m24897getJoinLxFBmk8());
        }
        if (!AbstractC9133u.m16128b(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m24723drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, InterfaceC10570l interfaceC10570l) {
        DrawParams drawParams = getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM24744component4NHjbRc = drawParams.m24744component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m24747setSizeuvyYCjk(j10);
        canvas.save();
        interfaceC10570l.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m24747setSizeuvyYCjk(jM24744component4NHjbRc);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo24724drawArcillE91I(Brush brush, float f10, float f11, boolean z10, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), f10, f11, z10, m24717configurePaintswdJneE$default(this, brush, drawStyle, f12, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo24725drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), f10, f11, z10, m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f12, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo24726drawCircleV9BoPsw(Brush brush, float f10, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo24132drawCircle9KIMszo(j10, f10, m24717configurePaintswdJneE$default(this, brush, drawStyle, f11, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo24727drawCircleVaOC9Bg(long j10, float f10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo24132drawCircle9KIMszo(j11, f10, m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f11, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    @InterfaceC8721a
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo24728drawImage9jGpkUE(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo24134drawImageRectHPBpro0(imageBitmap, j10, j11, j12, j13, m24717configurePaintswdJneE$default(this, null, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo24729drawImageAZ2fEMs(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
        this.drawParams.getCanvas().mo24134drawImageRectHPBpro0(imageBitmap, j10, j11, j12, j13, m24716configurePaintswdJneE(null, drawStyle, f10, colorFilter, i10, i11));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo24730drawImagegbVJVH8(ImageBitmap imageBitmap, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().mo24133drawImaged4ec7I(imageBitmap, j10, m24717configurePaintswdJneE$default(this, null, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo24731drawLine1RTmtNc(Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo24135drawLineWko1d7g(j10, j11, m24721configureStrokePaintho4zsrM$default(this, brush, f10, 4.0f, i10, StrokeJoin.Companion.m24640getMiterLxFBmk8(), pathEffect, f11, colorFilter, i11, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo24732drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo24135drawLineWko1d7g(j11, j12, m24719configureStrokePaintQ_0CZUI$default(this, j10, f10, 4.0f, i10, StrokeJoin.Companion.m24640getMiterLxFBmk8(), pathEffect, f11, colorFilter, i11, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo24733drawOvalAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), m24717configurePaintswdJneE$default(this, brush, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo24734drawOvalnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo24735drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().drawPath(path, m24717configurePaintswdJneE$default(this, brush, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo24736drawPathLG529CI(Path path, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.drawParams.getCanvas().drawPath(path, m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo24737drawPointsF8ZwMP8(List<Offset> list, int i10, long j10, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.drawParams.getCanvas().mo24136drawPointsO7TthRY(i10, list, m24719configureStrokePaintQ_0CZUI$default(this, j10, f10, 4.0f, i11, StrokeJoin.Companion.m24640getMiterLxFBmk8(), pathEffect, f11, colorFilter, i12, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo24738drawPointsGsft0Ws(List<Offset> list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.drawParams.getCanvas().mo24136drawPointsO7TthRY(i10, list, m24721configureStrokePaintho4zsrM$default(this, brush, f10, 4.0f, i11, StrokeJoin.Companion.m24640getMiterLxFBmk8(), pathEffect, f11, colorFilter, i12, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo24739drawRectAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), m24717configurePaintswdJneE$default(this, brush, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo24740drawRectnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo24741drawRoundRectZuiqVtQ(Brush brush, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), m24717configurePaintswdJneE$default(this, brush, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo24742drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), m24715configurePaint2qPWKa0$default(this, j10, drawStyle, f10, colorFilter, i10, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }
}
