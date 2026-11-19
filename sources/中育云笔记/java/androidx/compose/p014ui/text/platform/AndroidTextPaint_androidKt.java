package androidx.compose.p014ui.text.platform;

import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
