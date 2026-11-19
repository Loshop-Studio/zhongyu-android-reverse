package androidx.compose.foundation;

import android.content.Context;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollFactory;", "Landroidx/compose/foundation/OverscrollFactory;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/foundation/OverscrollEffect;", "createOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "Landroidx/compose/ui/unit/Density;", "J", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {

    @NotNull
    private final Context context;

    @NotNull
    private final Density density;
    private final long glowColor;

    @NotNull
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j7, PaddingValues paddingValues, AbstractC5824e abstractC5824e) {
        this(context, density, j7, paddingValues);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    @NotNull
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!AndroidEdgeEffectOverscrollFactory.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC5830k.m5328e(other, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) other;
        return AbstractC5830k.m5325b(this.context, androidEdgeEffectOverscrollFactory.context) && AbstractC5830k.m5325b(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m10683equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && AbstractC5830k.m5325b(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        return this.glowDrawPadding.hashCode() + AbstractC0584a.m904e(this.glowColor, (this.density.hashCode() + (this.context.hashCode() * 31)) * 31, 31);
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j7, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j7;
        this.glowDrawPadding = paddingValues;
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j7, PaddingValues paddingValues, int i, AbstractC5824e abstractC5824e) {
        this(context, density, (i & 4) != 0 ? AndroidOverscroll_androidKt.DefaultGlowColor : j7, (i & 8) != 0 ? AndroidOverscroll_androidKt.DefaultGlowPaddingValues : paddingValues, null);
    }
}
