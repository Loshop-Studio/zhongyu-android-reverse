package androidx.compose.p014ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.PaintingStyle;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.p014ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m31431getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    @VisibleForTesting
    /* renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m33227getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m33228setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        androidTextPaint.m33232setBrush12SF9DM(brush, j10, f10);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m33229getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    public final Brush getBrush$ui_text_release() {
        return this.brush;
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name */
    public final Size m33230getBrushSizeVsRJwc0$ui_text_release() {
        return this.brushSize;
    }

    public final State<Shader> getShaderState$ui_text_release() {
        return this.shaderState;
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m33231setBlendModes9anfk8(int i10) {
        if (BlendMode.m30789equalsimpl0(i10, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo30756setBlendModes9anfk8(i10);
        this.backingBlendMode = i10;
    }

    public final void setBrush$ui_text_release(Brush brush) {
        this.brush = brush;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33232setBrush12SF9DM(final androidx.compose.p014ui.graphics.Brush r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.clearShader()
            return
        L6:
            boolean r0 = r5 instanceof androidx.compose.p014ui.graphics.SolidColor
            if (r0 == 0) goto L18
            androidx.compose.ui.graphics.SolidColor r5 = (androidx.compose.p014ui.graphics.SolidColor) r5
            long r5 = r5.m31213getValue0d7_KjU()
            long r5 = androidx.compose.p014ui.text.style.TextDrawStyleKt.m33405modulateDxMtmZc(r5, r8)
            r4.m33234setColor8_81llA(r5)
            return
        L18:
            boolean r0 = r5 instanceof androidx.compose.p014ui.graphics.ShaderBrush
            if (r0 == 0) goto L6d
            androidx.compose.ui.graphics.Brush r0 = r4.brush
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            androidx.compose.ui.geometry.Size r0 = r4.brushSize
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m30711unboximpl()
            boolean r0 = androidx.compose.p014ui.geometry.Size.m30702equalsimpl0(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.brush = r5
            androidx.compose.ui.geometry.Size r0 = androidx.compose.p014ui.geometry.Size.m30694boximpl(r6)
            r4.brushSize = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>()
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r0)
            r4.shaderState = r5
        L54:
            androidx.compose.ui.graphics.Paint r5 = r4.getComposePaint()
            androidx.compose.runtime.State<? extends android.graphics.Shader> r6 = r4.shaderState
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.setShader(r6)
            r4.lastColor = r7
            androidx.compose.p014ui.text.platform.AndroidTextPaint_androidKt.setAlpha(r4, r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.platform.AndroidTextPaint.m33232setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m33233setBrushSizeiaC8Vc4$ui_text_release(Size size) {
        this.brushSize = size;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m33234setColor8_81llA(long j10) {
        Color color = this.lastColor;
        if (color == null ? false : Color.m30879equalsimpl0(color.m30888unboximpl(), j10)) {
            return;
        }
        if (j10 != 16) {
            this.lastColor = Color.m30868boximpl(j10);
            setColor(ColorKt.m30932toArgb8_81llA(j10));
            clearShader();
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || AbstractC9979u.m20289b(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (AbstractC9979u.m20289b(drawStyle, Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            getComposePaint().mo30761setStylek9PVt8s(PaintingStyle.Companion.m31146getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            getComposePaint().setStrokeWidth(stroke.getWidth());
            getComposePaint().setStrokeMiterLimit(stroke.getMiter());
            getComposePaint().mo30760setStrokeJoinWw9F2mQ(stroke.m31499getJoinLxFBmk8());
            getComposePaint().mo30759setStrokeCapBeK7IIE(stroke.m31498getCapKaPHkGw());
            getComposePaint().setPathEffect(stroke.getPathEffect());
        }
    }

    public final void setShaderState$ui_text_release(State<? extends Shader> state) {
        this.shaderState = state;
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || AbstractC9979u.m20289b(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (AbstractC9979u.m20289b(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.m31204getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (this.shadow.m31204getOffsetF1C5BW0() & 4294967295L)), ColorKt.m30932toArgb8_81llA(this.shadow.m31203getColor0d7_KjU()));
        }
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || AbstractC9979u.m20289b(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }
}
