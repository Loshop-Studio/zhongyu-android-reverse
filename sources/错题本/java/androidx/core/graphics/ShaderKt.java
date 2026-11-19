package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "transform", "(Landroid/graphics/Shader;Lr6/c;)V", "core-ktx_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ShaderKt {
    public static final void transform(@NotNull Shader shader, @NotNull InterfaceC6471c interfaceC6471c) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC6471c.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
