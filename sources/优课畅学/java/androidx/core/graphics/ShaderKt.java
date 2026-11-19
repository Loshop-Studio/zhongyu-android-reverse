package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, InterfaceC10570l interfaceC10570l) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC10570l.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
