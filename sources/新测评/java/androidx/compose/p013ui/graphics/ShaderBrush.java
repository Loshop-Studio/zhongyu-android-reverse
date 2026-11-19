package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "()V", "createdSize", "Landroidx/compose/ui/geometry/Size;", "J", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "createShader", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,658:1\n1#2:659\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.m20812getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo20923applyToPq9zytI(long size, Paint p10, float alpha) {
        Shader shaderMo20945createShaderuvyYCjk = this.internalShader;
        if (shaderMo20945createShaderuvyYCjk == null || !Size.m20800equalsimpl0(this.createdSize, size)) {
            if (Size.m20806isEmptyimpl(size)) {
                shaderMo20945createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = Size.INSTANCE.m20812getUnspecifiedNHjbRc();
            } else {
                shaderMo20945createShaderuvyYCjk = mo20945createShaderuvyYCjk(size);
                this.internalShader = shaderMo20945createShaderuvyYCjk;
                this.createdSize = size;
            }
        }
        long jMo20849getColor0d7_KjU = p10.mo20849getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m20977equalsimpl0(jMo20849getColor0d7_KjU, companion.m21002getBlack0d7_KjU())) {
            p10.mo20855setColor8_81llA(companion.m21002getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(p10.getShader(), shaderMo20945createShaderuvyYCjk)) {
            p10.setShader(shaderMo20945createShaderuvyYCjk);
        }
        if (p10.getAlpha() == alpha) {
            return;
        }
        p10.setAlpha(alpha);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo20945createShaderuvyYCjk(long size);
}
