package androidx.compose.foundation;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.DpSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\n*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R%\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R'\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u001a\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m5110d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "Ld6/s;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lr6/c;Lr6/c;Lr6/c;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/e;)V", "create", "()Landroidx/compose/foundation/MagnifierNode;", "node", "update", "(Landroidx/compose/foundation/MagnifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Lr6/c;", "F", "Z", "J", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;

    @Nullable
    private final InterfaceC6471c magnifierCenter;

    @Nullable
    private final InterfaceC6471c onSizeChanged;

    @NotNull
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;

    @NotNull
    private final InterfaceC6471c sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, float f, boolean z8, long j7, float f7, float f8, boolean z9, PlatformMagnifierFactory platformMagnifierFactory, AbstractC5824e abstractC5824e) {
        this(interfaceC6471c, interfaceC6471c2, interfaceC6471c3, f, z8, j7, f7, f8, z9, platformMagnifierFactory);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) other;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m13400equalsimpl0(this.size, magnifierElement.size) && C2331Dp.m13310equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && C2331Dp.m13310equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && AbstractC5830k.m5325b(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        InterfaceC6471c interfaceC6471c = this.magnifierCenter;
        int iM908i = AbstractC0584a.m908i(this.clippingEnabled, AbstractC0584a.m896A(this.elevation, AbstractC0584a.m896A(this.cornerRadius, (DpSize.m13405hashCodeimpl(this.size) + AbstractC0584a.m908i(this.useTextDefault, AbstractC0584a.m901b(this.zoom, (iHashCode + (interfaceC6471c != null ? interfaceC6471c.hashCode() : 0)) * 31, 31), 31)) * 31, 31), 31), 31);
        InterfaceC6471c interfaceC6471c2 = this.onSizeChanged;
        return this.platformMagnifierFactory.hashCode() + ((iM908i + (interfaceC6471c2 != null ? interfaceC6471c2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set("size", DpSize.m13391boximpl(this.size));
        AbstractC0584a.m909j(this.elevation, AbstractC0584a.m909j(this.cornerRadius, inspectorInfo.getProperties(), "cornerRadius", inspectorInfo), "elevation", inspectorInfo).set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    public /* synthetic */ MagnifierElement(InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, float f, boolean z8, long j7, float f7, float f8, boolean z9, PlatformMagnifierFactory platformMagnifierFactory, int i, AbstractC5824e abstractC5824e) {
        this(interfaceC6471c, (i & 2) != 0 ? null : interfaceC6471c2, (i & 4) != 0 ? null : interfaceC6471c3, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z8, (i & 32) != 0 ? DpSize.INSTANCE.m13412getUnspecifiedMYxV2XQ() : j7, (i & 64) != 0 ? C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM() : f7, (i & 128) != 0 ? C2331Dp.INSTANCE.m13325getUnspecifiedD9Ej5fM() : f8, (i & 256) != 0 ? true : z9, platformMagnifierFactory, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public MagnifierNode getNode() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull MagnifierNode node) {
        node.m6822update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    private MagnifierElement(InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, float f, boolean z8, long j7, float f7, float f8, boolean z9, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = interfaceC6471c;
        this.magnifierCenter = interfaceC6471c2;
        this.onSizeChanged = interfaceC6471c3;
        this.zoom = f;
        this.useTextDefault = z8;
        this.size = j7;
        this.cornerRadius = f7;
        this.elevation = f8;
        this.clippingEnabled = z9;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }
}
