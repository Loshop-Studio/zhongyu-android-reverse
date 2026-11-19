package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion Companion = new Companion(null);
    private final Object align;
    private final InterfaceC10574p alignmentCallback;
    private final Direction direction;
    private final String inspectorName;
    private final boolean unbounded;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        public final WrapContentElement height(final Alignment.Vertical vertical, boolean z10) {
            return new WrapContentElement(Direction.Vertical, z10, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$height$1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return IntOffset.m27018boximpl(m20957invoke5SAbXVA(((IntSize) obj).m27074unboximpl(), (LayoutDirection) obj2));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m20957invoke5SAbXVA(long j10, LayoutDirection layoutDirection) {
                    return IntOffset.m27021constructorimpl((0 << 32) | (4294967295L & vertical.align(0, (int) (j10 & 4294967295L))));
                }
            }, vertical, "wrapContentHeight");
        }

        @Stable
        public final WrapContentElement size(final Alignment alignment, boolean z10) {
            return new WrapContentElement(Direction.Both, z10, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$size$1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return IntOffset.m27018boximpl(m20958invoke5SAbXVA(((IntSize) obj).m27074unboximpl(), (LayoutDirection) obj2));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m20958invoke5SAbXVA(long j10, LayoutDirection layoutDirection) {
                    return alignment.mo23844alignKFBX0sM(IntSize.Companion.m27075getZeroYbymL2g(), j10, layoutDirection);
                }
            }, alignment, "wrapContentSize");
        }

        @Stable
        public final WrapContentElement width(final Alignment.Horizontal horizontal, boolean z10) {
            return new WrapContentElement(Direction.Horizontal, z10, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$width$1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return IntOffset.m27018boximpl(m20959invoke5SAbXVA(((IntSize) obj).m27074unboximpl(), (LayoutDirection) obj2));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m20959invoke5SAbXVA(long j10, LayoutDirection layoutDirection) {
                    return IntOffset.m27021constructorimpl((0 & 4294967295L) | (horizontal.align(0, (int) (j10 >> 32), layoutDirection) << 32));
                }
            }, horizontal, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    public WrapContentElement(Direction direction, boolean z10, InterfaceC10574p interfaceC10574p, Object obj, String str) {
        this.direction = direction;
        this.unbounded = z10;
        this.alignmentCallback = interfaceC10574p;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && AbstractC9133u.m16128b(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }
}
