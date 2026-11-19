package androidx.compose.p006ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.graphics.Paint;
import androidx.compose.p006ui.graphics.PaintingStyle;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.graphics.drawscope.Fill;
import androidx.compose.p006ui.graphics.drawscope.Stroke;
import androidx.compose.p006ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010-\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010.\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR4\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f*\u0004\b\n\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m5175d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "<set-?>", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;)Ljava/lang/Object;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "composePaint", "Landroidx/compose/ui/graphics/Paint;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release$annotations", "()V", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setBrush", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "size", "Landroidx/compose/ui/geometry/Size;", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setColor", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setDrawStyle", "setShadow", "setTextDecoration", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    private final Paint composePaint;
    private DrawStyle drawStyle;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i4, float f4) {
        super(i4);
        ((TextPaint) this).density = f4;
        this.composePaint = AndroidPaint_androidKt.toComposePaint(this);
        this.textDecoration = TextDecoration.INSTANCE.getNone();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m11297setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j4, float f4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            f4 = Float.NaN;
        }
        androidTextPaint.m11300setBrush12SF9DM(brush, j4, f4);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m11298getBlendMode0nO6VwU() {
        return this.composePaint.mo9059getBlendMode0nO6VwU();
    }

    /* renamed from: getShadow$ui_text_release, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m11299setBlendModes9anfk8(int i4) {
        this.composePaint.mo9065setBlendModes9anfk8(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if ((r9 != androidx.compose.p006ui.geometry.Size.INSTANCE.m9022getUnspecifiedNHjbRc()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11300setBrush12SF9DM(androidx.compose.p006ui.graphics.Brush r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.p006ui.graphics.SolidColor
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r8
            androidx.compose.ui.graphics.SolidColor r0 = (androidx.compose.p006ui.graphics.SolidColor) r0
            long r3 = r0.getValue()
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.p006ui.graphics.Color.INSTANCE
            long r5 = r0.m9214getUnspecified0d7_KjU()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != 0) goto L2e
        L1c:
            boolean r0 = r8 instanceof androidx.compose.p006ui.graphics.ShaderBrush
            if (r0 == 0) goto L48
            androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.p006ui.geometry.Size.INSTANCE
            long r3 = r0.m9022getUnspecifiedNHjbRc()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L48
        L2e:
            androidx.compose.ui.graphics.Paint r0 = r7.composePaint
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L3d
            androidx.compose.ui.graphics.Paint r11 = r7.composePaint
            float r11 = r11.getAlpha()
            goto L44
        L3d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = kotlin.ranges.RangesKt.coerceIn(r11, r1, r2)
        L44:
            r8.mo9131applyToPq9zytI(r9, r0, r11)
            goto L50
        L48:
            if (r8 != 0) goto L50
            androidx.compose.ui.graphics.Paint r8 = r7.composePaint
            r9 = 0
            r8.setShader(r9)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.platform.AndroidTextPaint.m11300setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m11301setColor8_81llA(long color) {
        if (color != Color.INSTANCE.m9214getUnspecified0d7_KjU()) {
            this.composePaint.mo9066setColor8_81llA(color);
            this.composePaint.setShader(null);
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            this.composePaint.mo9070setStylek9PVt8s(PaintingStyle.INSTANCE.m9419getFillTiuSbCo());
            return;
        }
        if (drawStyle instanceof Stroke) {
            this.composePaint.mo9070setStylek9PVt8s(PaintingStyle.INSTANCE.m9420getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            this.composePaint.setStrokeWidth(stroke.getWidth());
            this.composePaint.setStrokeMiterLimit(stroke.getMiter());
            this.composePaint.mo9069setStrokeJoinWw9F2mQ(stroke.getJoin());
            this.composePaint.mo9068setStrokeCapBeK7IIE(stroke.getCap());
            this.composePaint.setPathEffect(stroke.getPathEffect());
        }
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m8945getXimpl(this.shadow.getOffset()), Offset.m8946getYimpl(this.shadow.getOffset()), ColorKt.m9232toArgb8_81llA(this.shadow.getColor()));
        }
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "<set-?>");
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }
}
