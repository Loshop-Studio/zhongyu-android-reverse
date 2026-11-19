package androidx.compose.p014ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p014ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.p014ui.graphics.PathEffect;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (AbstractC9979u.m20289b(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(DrawStyleSpan_androidKt.m33254toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m31499getJoinLxFBmk8()));
                textPaint.setStrokeCap(DrawStyleSpan_androidKt.m33253toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m31498getCapKaPHkGw()));
                PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }
}
