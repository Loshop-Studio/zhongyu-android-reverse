package androidx.compose.foundation;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10, AbstractC9126n abstractC9126n) {
        this(i10, i11, i12, i13, marqueeSpacing, f10);
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m20434component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m20435component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m20436copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marqueeModifierElement.iterations;
        }
        if ((i14 & 2) != 0) {
            i11 = marqueeModifierElement.animationMode;
        }
        if ((i14 & 4) != 0) {
            i12 = marqueeModifierElement.delayMillis;
        }
        if ((i14 & 8) != 0) {
            i13 = marqueeModifierElement.initialDelayMillis;
        }
        if ((i14 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        if ((i14 & 32) != 0) {
            f10 = marqueeModifierElement.velocity;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        float f11 = f10;
        return marqueeModifierElement.m20437copylWfNwf4(i10, i11, i12, i13, marqueeSpacing2, f11);
    }

    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m20437copylWfNwf4(int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10) {
        return new MarqueeModifierElement(i10, i11, i12, i13, marqueeSpacing, f10, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m20427equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && AbstractC9133u.m16128b(this.spacing, marqueeModifierElement.spacing) && C3156Dp.m26904equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m20428hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.velocity);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m20424boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", C3156Dp.m26897boximpl(this.velocity));
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m20429toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) C3156Dp.m26910toStringimpl(this.velocity)) + ')';
    }

    private MarqueeModifierElement(int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f10) {
        this.iterations = i10;
        this.animationMode = i11;
        this.delayMillis = i12;
        this.initialDelayMillis = i13;
        this.spacing = marqueeSpacing;
        this.velocity = f10;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m20440updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }
}
