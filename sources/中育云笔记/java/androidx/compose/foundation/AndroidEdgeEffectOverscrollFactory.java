package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.unit.Density;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {
    private final Context context;
    private final Density density;
    private final long glowColor;
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j10, PaddingValues paddingValues, AbstractC9972n abstractC9972n) {
        this(context, density, j10, paddingValues);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(AndroidEdgeEffectOverscrollFactory.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return AbstractC9979u.m20289b(this.context, androidEdgeEffectOverscrollFactory.context) && AbstractC9979u.m20289b(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m30879equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && AbstractC9979u.m20289b(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + Color.m30885hashCodeimpl(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j10, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j10;
        this.glowDrawPadding = paddingValues;
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j10, PaddingValues paddingValues, int i10, AbstractC9972n abstractC9972n) {
        this(context, density, (i10 & 4) != 0 ? AndroidOverscroll_androidKt.DefaultGlowColor : j10, (i10 & 8) != 0 ? AndroidOverscroll_androidKt.DefaultGlowPaddingValues : paddingValues, null);
    }
}
