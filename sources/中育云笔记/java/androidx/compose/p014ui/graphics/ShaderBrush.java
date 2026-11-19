package androidx.compose.p014ui.graphics;

import android.graphics.Shader;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m30714getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p014ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo30825applyToPq9zytI(long j10, Paint paint, float f10) {
        Shader shaderMo30847createShaderuvyYCjk = this.internalShader;
        if (shaderMo30847createShaderuvyYCjk == null || !Size.m30702equalsimpl0(this.createdSize, j10)) {
            if (Size.m30708isEmptyimpl(j10)) {
                shaderMo30847createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m30714getUnspecifiedNHjbRc();
            } else {
                shaderMo30847createShaderuvyYCjk = mo30847createShaderuvyYCjk(j10);
                this.internalShader = shaderMo30847createShaderuvyYCjk;
                this.createdSize = j10;
            }
        }
        long jMo30751getColor0d7_KjU = paint.mo30751getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m30879equalsimpl0(jMo30751getColor0d7_KjU, companion.m30904getBlack0d7_KjU())) {
            paint.mo30757setColor8_81llA(companion.m30904getBlack0d7_KjU());
        }
        if (!AbstractC9979u.m20289b(paint.getShader(), shaderMo30847createShaderuvyYCjk)) {
            paint.setShader(shaderMo30847createShaderuvyYCjk);
        }
        if (paint.getAlpha() == f10) {
            return;
        }
        paint.setAlpha(f10);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo30847createShaderuvyYCjk(long j10);
}
