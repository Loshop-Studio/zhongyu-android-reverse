package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Stable
/* loaded from: classes2.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    public /* synthetic */ RippleNodeFactory(boolean z10, float f10, long j10, AbstractC9126n abstractC9126n) {
        this(z10, f10, j10);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.p013ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo22048invoke0d7_KjU() {
                    return this.this$0.color;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.bounded == rippleNodeFactory.bounded && C3156Dp.m26904equalsimpl0(this.radius, rippleNodeFactory.radius) && AbstractC9133u.m16128b(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m24277equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + C3156Dp.m26905hashCodeimpl(this.radius)) * 31;
        ColorProducer colorProducer = this.colorProducer;
        return ((iHashCode + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.m24283hashCodeimpl(this.color);
    }

    public /* synthetic */ RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer, AbstractC9126n abstractC9126n) {
        this(z10, f10, colorProducer);
    }

    private RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer, long j10) {
        this.bounded = z10;
        this.radius = f10;
        this.colorProducer = colorProducer;
        this.color = j10;
    }

    private RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer) {
        this(z10, f10, colorProducer, Color.Companion.m24312getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean z10, float f10, long j10) {
        this(z10, f10, (ColorProducer) null, j10);
    }
}
