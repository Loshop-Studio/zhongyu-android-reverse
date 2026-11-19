package androidx.compose.p013ui.graphics;

import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class BrushKt {
    public static final ShaderBrush ShaderBrush(final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt.ShaderBrush.1
            @Override // androidx.compose.p013ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo24245createShaderuvyYCjk(long j10) {
                return shader;
            }
        };
    }
}
