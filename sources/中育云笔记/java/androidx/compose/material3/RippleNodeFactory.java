package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes2.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;
    private final ColorProducer colorProducer;
    private final float radius;

    public /* synthetic */ RippleNodeFactory(boolean z10, float f10, long j10, AbstractC9972n abstractC9972n) {
        this(z10, f10, j10);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.p014ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo28650invoke0d7_KjU() {
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
        if (this.bounded == rippleNodeFactory.bounded && C3186Dp.m33506equalsimpl0(this.radius, rippleNodeFactory.radius) && AbstractC9979u.m20289b(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m30879equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + C3186Dp.m33507hashCodeimpl(this.radius)) * 31;
        ColorProducer colorProducer = this.colorProducer;
        return ((iHashCode + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.m30885hashCodeimpl(this.color);
    }

    public /* synthetic */ RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer, AbstractC9972n abstractC9972n) {
        this(z10, f10, colorProducer);
    }

    private RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer, long j10) {
        this.bounded = z10;
        this.radius = f10;
        this.colorProducer = colorProducer;
        this.color = j10;
    }

    private RippleNodeFactory(boolean z10, float f10, ColorProducer colorProducer) {
        this(z10, f10, colorProducer, Color.Companion.m30914getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean z10, float f10, long j10) {
        this(z10, f10, (ColorProducer) null, j10);
    }
}
