package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m24112getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo24223applyToPq9zytI(long j10, Paint paint, float f10) {
        Shader shaderMo24245createShaderuvyYCjk = this.internalShader;
        if (shaderMo24245createShaderuvyYCjk == null || !Size.m24100equalsimpl0(this.createdSize, j10)) {
            if (Size.m24106isEmptyimpl(j10)) {
                shaderMo24245createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m24112getUnspecifiedNHjbRc();
            } else {
                shaderMo24245createShaderuvyYCjk = mo24245createShaderuvyYCjk(j10);
                this.internalShader = shaderMo24245createShaderuvyYCjk;
                this.createdSize = j10;
            }
        }
        long jMo24149getColor0d7_KjU = paint.mo24149getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m24277equalsimpl0(jMo24149getColor0d7_KjU, companion.m24302getBlack0d7_KjU())) {
            paint.mo24155setColor8_81llA(companion.m24302getBlack0d7_KjU());
        }
        if (!AbstractC9133u.m16128b(paint.getShader(), shaderMo24245createShaderuvyYCjk)) {
            paint.setShader(shaderMo24245createShaderuvyYCjk);
        }
        if (paint.getAlpha() == f10) {
            return;
        }
        paint.setAlpha(f10);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo24245createShaderuvyYCjk(long j10);
}
