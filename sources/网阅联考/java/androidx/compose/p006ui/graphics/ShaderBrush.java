package androidx.compose.p006ui.graphics;

import android.graphics.Shader;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m5174d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\u0004H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m5175d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "()V", "createdSize", "Landroidx/compose/ui/geometry/Size;", "J", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "applyTo", "", "size", C3335ai.f1707av, "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "createShader", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.m9022getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p006ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo9131applyToPq9zytI(long size, Paint p3, float alpha) {
        Intrinsics.checkNotNullParameter(p3, "p");
        Shader shaderMo9153createShaderuvyYCjk = this.internalShader;
        if (shaderMo9153createShaderuvyYCjk == null || !Size.m9010equalsimpl0(this.createdSize, size)) {
            shaderMo9153createShaderuvyYCjk = mo9153createShaderuvyYCjk(size);
            this.internalShader = shaderMo9153createShaderuvyYCjk;
            this.createdSize = size;
        }
        long jMo9060getColor0d7_KjU = p3.mo9060getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m9179equalsimpl0(jMo9060getColor0d7_KjU, companion.m9204getBlack0d7_KjU())) {
            p3.mo9066setColor8_81llA(companion.m9204getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(p3.getShader(), shaderMo9153createShaderuvyYCjk)) {
            p3.setShader(shaderMo9153createShaderuvyYCjk);
        }
        if (p3.getAlpha() == alpha) {
            return;
        }
        p3.setAlpha(alpha);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo9153createShaderuvyYCjk(long size);
}
