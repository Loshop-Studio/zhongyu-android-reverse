package androidx.compose.p013ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.text.platform.AndroidTextPaint_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m24092boximpl(Size.Companion.m24112getUnspecifiedNHjbRc()), null, 2, null);
    private final State<Shader> shaderState = SnapshotStateKt.derivedStateOf(new InterfaceC10559a() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        public final Shader invoke() {
            if (this.this$0.m26653getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m24106isEmptyimpl(this.this$0.m26653getSizeNHjbRc())) {
                return null;
            }
            return this.this$0.getShaderBrush().mo24245createShaderuvyYCjk(this.this$0.m26653getSizeNHjbRc());
        }
    });

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f10) {
        this.shaderBrush = shaderBrush;
        this.alpha = f10;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m26653getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m24109unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m26654setSizeuvyYCjk(long j10) {
        this.size$delegate.setValue(Size.m24092boximpl(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
