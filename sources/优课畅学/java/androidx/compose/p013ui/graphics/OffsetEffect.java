package androidx.compose.p013ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j10, AbstractC9126n abstractC9126n) {
        this(renderEffect, j10);
    }

    @Override // androidx.compose.p013ui.graphics.RenderEffect
    @RequiresApi(31)
    public RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m24587createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        return AbstractC9133u.m16128b(this.renderEffect, offsetEffect.renderEffect) && Offset.m24032equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.m24037hashCodeimpl(this.offset);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m24043toStringimpl(this.offset)) + ')';
    }

    private OffsetEffect(RenderEffect renderEffect, long j10) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j10;
    }
}
