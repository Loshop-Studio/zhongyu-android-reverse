package androidx.compose.p011ui.graphics;

import android.graphics.Shader;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "Ld6/s;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "internalShader", "Landroid/graphics/Shader;", "createdSize", "J", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,658:1\n1#2:659\n*E\n"})
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;

    @Nullable
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p011ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo10629applyToPq9zytI(long size, @NotNull Paint p6, float alpha) {
        Shader shaderMo10651createShaderuvyYCjk = this.internalShader;
        if (shaderMo10651createShaderuvyYCjk == null || !Size.m10506equalsimpl0(this.createdSize, size)) {
            if (Size.m10512isEmptyimpl(size)) {
                shaderMo10651createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
            } else {
                shaderMo10651createShaderuvyYCjk = mo10651createShaderuvyYCjk(size);
                this.internalShader = shaderMo10651createShaderuvyYCjk;
                this.createdSize = size;
            }
        }
        long jMo10555getColor0d7_KjU = p6.mo10555getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m10683equalsimpl0(jMo10555getColor0d7_KjU, companion.m10708getBlack0d7_KjU())) {
            p6.mo10561setColor8_81llA(companion.m10708getBlack0d7_KjU());
        }
        if (!AbstractC5830k.m5325b(p6.getShader(), shaderMo10651createShaderuvyYCjk)) {
            p6.setShader(shaderMo10651createShaderuvyYCjk);
        }
        if (p6.getAlpha() == alpha) {
            return;
        }
        p6.setAlpha(alpha);
    }

    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo10651createShaderuvyYCjk(long size);
}
