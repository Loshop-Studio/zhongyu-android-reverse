package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\u0002H\u0016J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0002H\u0016J\f\u0010)\u001a\u00020\r*\u00020\fH\u0016R\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m13558d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "setBottom-0680j_4", "(F)V", "F", "getEnd-D9Ej5fM", "setEnd-0680j_4", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "getStart-D9Ej5fM", "setStart-0680j_4", "getTop-D9Ej5fM", "setTop-0680j_4", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,472:1\n102#2:473\n102#2:474\n102#2:475\n102#2:476\n113#2:482\n113#2:483\n113#2:484\n113#2:485\n92#3,5:477\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n341#1:473\n342#1:474\n343#1:475\n344#1:476\n331#1:482\n332#1:483\n333#1:484\n334#1:485\n340#1:477,5\n*E\n"})
/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final Function1<InspectorInfo, Unit> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z9, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z9, function1);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && C3127Dp.m23566equalsimpl0(this.start, paddingElement.start) && C3127Dp.m23566equalsimpl0(this.top, paddingElement.top) && C3127Dp.m23566equalsimpl0(this.end, paddingElement.end) && C3127Dp.m23566equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    public final Function1<InspectorInfo, Unit> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3127Dp.m23567hashCodeimpl(this.start) * 31) + C3127Dp.m23567hashCodeimpl(this.top)) * 31) + C3127Dp.m23567hashCodeimpl(this.end)) * 31) + C3127Dp.m23567hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m17670setBottom0680j_4(float f10) {
        this.bottom = f10;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m17671setEnd0680j_4(float f10) {
        this.end = f10;
    }

    public final void setRtlAware(boolean z9) {
        this.rtlAware = z9;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m17672setStart0680j_4(float f10) {
        this.start = f10;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m17673setTop0680j_4(float f10) {
        this.top = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f10, float f11, float f12, float f13, boolean z9, Function1<? super InspectorInfo, Unit> function1) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z9;
        this.inspectorInfo = function1;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        float f14 = this.top;
        boolean z12 = z11 & (f14 >= 0.0f || Float.isNaN(f14));
        float f15 = this.end;
        boolean z13 = z12 & (f15 >= 0.0f || Float.isNaN(f15));
        float f16 = this.bottom;
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z10 = false;
        }
        if (!z13 || !z10) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* renamed from: create */
    public PaddingNode getNode() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(PaddingNode node) {
        node.m17692setStart0680j_4(this.start);
        node.m17693setTop0680j_4(this.top);
        node.m17691setEnd0680j_4(this.end);
        node.m17690setBottom0680j_4(this.bottom);
        node.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z9, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C3127Dp.m23561constructorimpl(0) : f10, (i10 & 2) != 0 ? C3127Dp.m23561constructorimpl(0) : f11, (i10 & 4) != 0 ? C3127Dp.m23561constructorimpl(0) : f12, (i10 & 8) != 0 ? C3127Dp.m23561constructorimpl(0) : f13, z9, function1, null);
    }
}
