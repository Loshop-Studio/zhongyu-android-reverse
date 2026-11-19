package androidx.compose.foundation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final InterfaceC9540l magnifierCenter;
    private final InterfaceC9540l onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final InterfaceC9540l sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory, AbstractC9972n abstractC9972n) {
        this(interfaceC9540l, interfaceC9540l2, interfaceC9540l3, f10, z10, j10, f11, f12, z11, platformMagnifierFactory);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m33596equalsimpl0(this.size, magnifierElement.size) && C3186Dp.m33506equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && C3186Dp.m33506equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && AbstractC9979u.m20289b(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        InterfaceC9540l interfaceC9540l = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (interfaceC9540l != null ? interfaceC9540l.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + DpSize.m33601hashCodeimpl(this.size)) * 31) + C3186Dp.m33507hashCodeimpl(this.cornerRadius)) * 31) + C3186Dp.m33507hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onSizeChanged;
        return ((iHashCode2 + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set("size", DpSize.m33587boximpl(this.size));
        inspectorInfo.getProperties().set("cornerRadius", C3186Dp.m33499boximpl(this.cornerRadius));
        inspectorInfo.getProperties().set("elevation", C3186Dp.m33499boximpl(this.elevation));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    public /* synthetic */ MagnifierElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9540l, (i10 & 2) != 0 ? null : interfaceC9540l2, (i10 & 4) != 0 ? null : interfaceC9540l3, (i10 & 8) != 0 ? Float.NaN : f10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? DpSize.Companion.m33608getUnspecifiedMYxV2XQ() : j10, (i10 & 64) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f11, (i10 & 128) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f12, (i10 & 256) != 0 ? true : z11, platformMagnifierFactory, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(MagnifierNode magnifierNode) {
        magnifierNode.m27018update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    private MagnifierElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = interfaceC9540l;
        this.magnifierCenter = interfaceC9540l2;
        this.onSizeChanged = interfaceC9540l3;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }
}
