package androidx.compose.p014ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this(renderEffect, f10, f11, i10);
    }

    @Override // androidx.compose.p014ui.graphics.RenderEffect
    @RequiresApi(31)
    public RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m31188createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && TileMode.m31247equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && AbstractC9979u.m20289b(this.renderEffect, blurEffect.renderEffect);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((((((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m31248hashCodeimpl(this.edgeTreatment);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m31249toStringimpl(this.edgeTreatment)) + ')';
    }

    private BlurEffect(RenderEffect renderEffect, float f10, float f11, int i10) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f10;
        this.radiusY = f11;
        this.edgeTreatment = i10;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f10, float f11, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(renderEffect, f10, (i11 & 4) != 0 ? f10 : f11, (i11 & 8) != 0 ? TileMode.Companion.m31251getClamp3opZhB0() : i10, null);
    }
}
