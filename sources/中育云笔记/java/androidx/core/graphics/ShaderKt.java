package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, InterfaceC9540l interfaceC9540l) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC9540l.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
