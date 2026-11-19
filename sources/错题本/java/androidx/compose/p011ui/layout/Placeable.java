package androidx.compose.p011ui.layout;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.node.MotionReferencePlacementDelegate;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R0\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020$8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010(\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0014\u0010+\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0014\u0010-\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m5110d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "Ld6/s;", "onMeasuredSizeChanged", "Landroidx/compose/ui/unit/IntOffset;", RequestParameters.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLr6/c;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "PlacementScope", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,567:1\n30#2:568\n80#3:569\n85#3:571\n90#3:573\n85#3:575\n90#3:577\n85#3:579\n90#3:581\n80#3:583\n54#4:570\n59#4:572\n54#4:574\n59#4:576\n54#4:578\n59#4:580\n32#5:582\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n67#1:568\n67#1:569\n60#1:571\n64#1:573\n77#1:575\n82#1:577\n87#1:579\n87#1:581\n87#1:583\n60#1:570\n64#1:572\n77#1:574\n82#1:576\n87#1:578\n87#1:580\n87#1:582\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize;
    private int width;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m13444getZeronOccac();

    public Placeable() {
        long j7 = 0;
        this.measuredSize = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
    }

    private final void onMeasuredSizeChanged() {
        this.width = AbstractC5806u.m5274m((int) (this.measuredSize >> 32), Constraints.m13260getMinWidthimpl(this.measurementConstraints), Constraints.m13258getMaxWidthimpl(this.measurementConstraints));
        this.height = AbstractC5806u.m5274m((int) (this.measuredSize & 4294967295L), Constraints.m13259getMinHeightimpl(this.measurementConstraints), Constraints.m13257getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j7 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m13427constructorimpl((((i - ((int) (j7 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j7 & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p011ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.p011ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo12094placeAtf8xVGno(long position, float zIndex, @NotNull GraphicsLayer layer) {
        mo12034placeAtf8xVGno(position, zIndex, (InterfaceC6471c) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo12034placeAtf8xVGno(long position, float zIndex, @Nullable InterfaceC6471c layerBlock);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m12095setMeasuredSizeozmzZPI(long j7) {
        if (IntSize.m13474equalsimpl0(this.measuredSize, j7)) {
            return;
        }
        this.measuredSize = j7;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m12096setMeasurementConstraintsBRTryo0(long j7) {
        if (Constraints.m13251equalsimpl0(this.measurementConstraints, j7)) {
            return;
        }
        this.measurementConstraints = j7;
        onMeasuredSizeChanged();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0014J+\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0014J&\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000fJA\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001f\u0010\u001eJA\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ3\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010#J.\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b \u0010$J3\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010#J.\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010$JD\u0010&\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u001b\b\b\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u001cJ/\u0010&\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010'JD\u0010)\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u001b\b\b\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u001cJ/\u0010)\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010'J&\u0010+\u001a\u00020\r2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00118$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m5110d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "", "defaultValue", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", RequestParameters.POSITION, "zIndex", "Ld6/s;", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLr6/c;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLr6/c;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "block", "withMotionFrameOfReferencePlacement", "(Lr6/c;)V", "handleMotionFrameOfReferencePlacement", "(Landroidx/compose/ui/layout/Placeable;)V", "", "motionFrameOfReferencePlacement", "Z", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @PlacementScopeMarker
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,567:1\n432#1,2:568\n466#1,3:570\n435#1,2:573\n466#1,3:577\n441#1:580\n432#1,2:583\n466#1,3:585\n435#1,2:588\n466#1,3:590\n441#1:593\n466#1,3:596\n466#1,3:599\n432#1,2:602\n466#1,3:604\n435#1,2:607\n466#1,3:611\n441#1:614\n432#1,2:617\n466#1,3:619\n435#1,2:622\n466#1,3:624\n441#1:627\n466#1,3:630\n466#1,3:633\n476#1,3:638\n476#1,3:641\n449#1,2:646\n476#1,3:648\n452#1,2:651\n476#1,3:653\n458#1:656\n449#1,2:657\n476#1,3:659\n452#1,2:662\n476#1,3:666\n458#1:669\n466#1,3:670\n466#1,3:675\n476#1,3:678\n476#1,3:683\n32#2:575\n32#2:581\n32#2:594\n32#2:609\n32#2:615\n32#2:628\n32#2:636\n32#2:644\n32#2:664\n32#2:673\n32#2:681\n80#3:576\n80#3:582\n80#3:595\n80#3:610\n80#3:616\n80#3:629\n80#3:637\n80#3:645\n80#3:665\n80#3:674\n80#3:682\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n208#1:568,2\n208#1:570,3\n208#1:573,2\n208#1:577,3\n208#1:580\n225#1:583,2\n225#1:585,3\n225#1:588,2\n225#1:590,3\n225#1:593\n239#1:596,3\n252#1:599,3\n274#1:602,2\n274#1:604,3\n274#1:607,2\n274#1:611,3\n274#1:614\n298#1:617,2\n298#1:619,3\n298#1:622,2\n298#1:624,3\n298#1:627\n319#1:630,3\n338#1:633,3\n359#1:638,3\n378#1:641,3\n402#1:646,2\n402#1:648,3\n402#1:651,2\n402#1:653,3\n402#1:656\n424#1:657,2\n424#1:659,3\n424#1:662,2\n424#1:666,3\n424#1:669\n433#1:670,3\n435#1:675,3\n450#1:678,3\n452#1:683,3\n208#1:575\n225#1:581\n239#1:594\n274#1:609\n298#1:615\n319#1:628\n359#1:636\n402#1:644\n424#1:664\n436#1:673\n453#1:681\n208#1:576\n225#1:582\n239#1:595\n274#1:610\n298#1:616\n319#1:629\n359#1:637\n402#1:645\n424#1:665\n436#1:674\n453#1:682\n*E\n"})
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i8, float f, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i9 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i8, f);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m12097place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j7, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m12103place70tqf50(placeable, j7, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i8, float f, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i9 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i8, f);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m12098placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j7, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m12108placeRelative70tqf50(placeable, j7, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i8, float f, InterfaceC6471c interfaceC6471c, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i9 & 4) != 0) {
                f = 0.0f;
            }
            float f7 = f;
            if ((i9 & 8) != 0) {
                interfaceC6471c = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i8, f7, interfaceC6471c);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m12099placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j7, float f, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f7 = f;
            if ((i & 4) != 0) {
                interfaceC6471c = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m12109placeRelativeWithLayeraW9wM(placeable, j7, f7, interfaceC6471c);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i8, float f, InterfaceC6471c interfaceC6471c, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i9 & 4) != 0) {
                f = 0.0f;
            }
            float f7 = f;
            if ((i9 & 8) != 0) {
                interfaceC6471c = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i8, f7, interfaceC6471c);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m12101placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j7, float f, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f7 = f;
            if ((i & 4) != 0) {
                interfaceC6471c = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m12111placeWithLayeraW9wM(placeable, j7, f7, interfaceC6471c);
        }

        public float current(@NotNull Ruler ruler, float f) {
            return f;
        }

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i8, float f) {
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((i8 & 4294967295L) | (i << 32))), f, (InterfaceC6471c) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m12103place70tqf50(@NotNull Placeable placeable, long j7, float f) {
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, (InterfaceC6471c) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m12104placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j7, float f, @NotNull GraphicsLayer graphicsLayer) {
            placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m12107placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j7, float f, @Nullable InterfaceC6471c interfaceC6471c) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, interfaceC6471c);
                return;
            }
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((IntOffset.m13434getYimpl(j7) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(j7)) << 32))), f, interfaceC6471c);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i8, float f) {
            long jM13427constructorimpl = IntOffset.m13427constructorimpl((i << 32) | (i8 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, jM13427constructorimpl), f, (InterfaceC6471c) null);
            } else {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(jM13427constructorimpl)) << 32) | (IntOffset.m13434getYimpl(jM13427constructorimpl) & 4294967295L))), f, (InterfaceC6471c) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m12108placeRelative70tqf50(@NotNull Placeable placeable, long j7, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, (InterfaceC6471c) null);
                return;
            }
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((IntOffset.m13434getYimpl(j7) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(j7)) << 32))), f, (InterfaceC6471c) null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i8, float f, @NotNull InterfaceC6471c interfaceC6471c) {
            long jM13427constructorimpl = IntOffset.m13427constructorimpl((i << 32) | (i8 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, jM13427constructorimpl), f, interfaceC6471c);
            } else {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(jM13427constructorimpl)) << 32) | (IntOffset.m13434getYimpl(jM13427constructorimpl) & 4294967295L))), f, interfaceC6471c);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m12109placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j7, float f, @NotNull InterfaceC6471c interfaceC6471c) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, interfaceC6471c);
                return;
            }
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((IntOffset.m13434getYimpl(j7) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(j7)) << 32))), f, interfaceC6471c);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i8, float f, @NotNull InterfaceC6471c interfaceC6471c) {
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((i8 & 4294967295L) | (i << 32))), f, interfaceC6471c);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m12111placeWithLayeraW9wM(@NotNull Placeable placeable, long j7, float f, @NotNull InterfaceC6471c interfaceC6471c) {
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, interfaceC6471c);
        }

        public final void withMotionFrameOfReferencePlacement(@NotNull InterfaceC6471c block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i8, GraphicsLayer graphicsLayer, float f, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i9 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i8, graphicsLayer, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m12100placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j7, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m12110placeRelativeWithLayeraW9wM(placeable, j7, graphicsLayer, f);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i8, GraphicsLayer graphicsLayer, float f, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i9 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i8, graphicsLayer, f);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m12102placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j7, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m12112placeWithLayeraW9wM(placeable, j7, graphicsLayer, f);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m12105placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j7, float f, @Nullable InterfaceC6471c interfaceC6471c) {
            placeable.mo12034placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, interfaceC6471c);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m12112placeWithLayeraW9wM(@NotNull Placeable placeable, long j7, @NotNull GraphicsLayer graphicsLayer, float f) {
            placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, graphicsLayer);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i8, @NotNull GraphicsLayer graphicsLayer, float f) {
            placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((i8 & 4294967295L) | (i << 32))), f, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m12106placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j7, float f, @NotNull GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, graphicsLayer);
                return;
            }
            placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((IntOffset.m13434getYimpl(j7) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(j7)) << 32))), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m12110placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j7, @NotNull GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, j7), f, graphicsLayer);
                return;
            }
            placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((IntOffset.m13434getYimpl(j7) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(j7)) << 32))), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i8, @NotNull GraphicsLayer graphicsLayer, float f) {
            long jM13427constructorimpl = IntOffset.m13427constructorimpl((i << 32) | (i8 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, jM13427constructorimpl), f, graphicsLayer);
            } else {
                placeable.mo12094placeAtf8xVGno(AbstractC1923c.m1040d(this, placeable, placeable, IntOffset.m13427constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m13433getXimpl(jM13427constructorimpl)) << 32) | (IntOffset.m13434getYimpl(jM13427constructorimpl) & 4294967295L))), f, graphicsLayer);
            }
        }
    }
}
