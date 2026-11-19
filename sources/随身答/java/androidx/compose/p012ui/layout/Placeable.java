package androidx.compose.p012ui.layout;

import androidx.compose.p012ui.graphics.GraphicsLayerScope;
import androidx.compose.p012ui.graphics.layer.GraphicsLayer;
import androidx.compose.p012ui.node.MotionReferencePlacementDelegate;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e\u0018\u00010$¢\u0006\u0002\b&H$ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0014ø\u0001\u0000¢\u0006\u0004\b'\u0010+R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m13413d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "()J", "J", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "onMeasuredSizeChanged", "", "placeAt", RequestParameters.POSITION, "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "PlacementScope", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,567:1\n30#2:568\n80#3:569\n85#3:571\n90#3:573\n85#3:575\n90#3:577\n85#3:579\n90#3:581\n80#3:583\n54#4:570\n59#4:572\n54#4:574\n59#4:576\n54#4:578\n59#4:580\n32#5:582\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n67#1:568\n67#1:569\n60#1:571\n64#1:573\n77#1:575\n82#1:577\n87#1:579\n87#1:581\n87#1:583\n60#1:570\n64#1:572\n77#1:574\n82#1:576\n87#1:578\n87#1:580\n87#1:582\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize;
    private int width;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m24133getZeronOccac();

    public Placeable() {
        long j9 = 0;
        this.measuredSize = IntSize.m24160constructorimpl((j9 & 4294967295L) | (j9 << 32));
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.coerceIn((int) (this.measuredSize >> 32), Constraints.m23949getMinWidthimpl(this.measurementConstraints), Constraints.m23947getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt.coerceIn((int) (this.measuredSize & 4294967295L), Constraints.m23948getMinHeightimpl(this.measurementConstraints), Constraints.m23946getMaxHeightimpl(this.measurementConstraints));
        int i9 = this.width;
        long j9 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m24116constructorimpl((((i9 - ((int) (j9 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j9 & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p012ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.p012ui.layout.Measured
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
    public void mo22818placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        mo22758placeAtf8xVGno(position, zIndex, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo22758placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m22819setMeasuredSizeozmzZPI(long j9) {
        if (IntSize.m24163equalsimpl0(this.measuredSize, j9)) {
            return;
        }
        this.measuredSize = j9;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m22820setMeasurementConstraintsBRTryo0(long j9) {
        if (Constraints.m23940equalsimpl0(this.measurementConstraints, j9)) {
            return;
        }
        this.measurementConstraints = j9;
        onMeasuredSizeChanged();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\f\u0010\u001a\u001a\u00020\u0012*\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017JD\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J/\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010+JD\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010(J/\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010+J&\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b/\u0010!J$\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J.\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b1\u00102JA\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b1\u0010(J,\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J.\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b4\u00102JA\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b4\u0010(J,\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m13413d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "motionFrameOfReferencePlacement", "", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "withMotionFrameOfReferencePlacement", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "current", "", "Landroidx/compose/ui/layout/Ruler;", "defaultValue", "handleMotionFrameOfReferencePlacement", "Landroidx/compose/ui/layout/Placeable;", "place", RequestParameters.POSITION, "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, float f10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i11 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.place(placeable, i9, i10, f10);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m22821place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j9, float f10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i9 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m22827place70tqf50(placeable, j9, f10);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, float f10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i11 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelative(placeable, i9, i10, f10);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m22822placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j9, float f10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i9 & 2) != 0) {
                f10 = 0.0f;
            }
            placementScope.m22832placeRelative70tqf50(placeable, j9, f10);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, float f10, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i11 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i9, i10, f11, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m22823placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j9, float f10, Function1 function1, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i9 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i9 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m22833placeRelativeWithLayeraW9wM(placeable, j9, f11, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, float f10, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i11 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i9, i10, f11, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m22825placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j9, float f10, Function1 function1, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i9 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i9 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m22835placeWithLayeraW9wM(placeable, j9, f11, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public float current(Ruler ruler, float f10) {
            return f10;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i9, int i10, float f10) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i10 & 4294967295L) | (i9 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m22827place70tqf50(Placeable placeable, long j9, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m22829placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j9, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m22831placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j9, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, function1);
                return;
            }
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((IntOffset.m24123getYimpl(j9) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(j9)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, function1);
        }

        public final void placeRelative(Placeable placeable, int i9, int i10, float f10) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i9 << 32) | (i10 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jM24116constructorimpl2 = IntOffset.m24116constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(jM24116constructorimpl)) << 32) | (IntOffset.m24123getYimpl(jM24116constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl2, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m22832placeRelative70tqf50(Placeable placeable, long j9, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
                return;
            }
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((IntOffset.m24123getYimpl(j9) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(j9)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i9, int i10, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i9 << 32) | (i10 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, function1);
            } else {
                long jM24116constructorimpl2 = IntOffset.m24116constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(jM24116constructorimpl)) << 32) | (IntOffset.m24123getYimpl(jM24116constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl2, placeable.apparentToRealOffset), f10, function1);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m22833placeRelativeWithLayeraW9wM(Placeable placeable, long j9, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, function1);
                return;
            }
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((IntOffset.m24123getYimpl(j9) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(j9)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, function1);
        }

        public final void placeWithLayer(Placeable placeable, int i9, int i10, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i10 & 4294967295L) | (i9 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m22835placeWithLayeraW9wM(Placeable placeable, long j9, float f10, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22758placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, function1);
        }

        public final void withMotionFrameOfReferencePlacement(Function1<? super PlacementScope, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, GraphicsLayer graphicsLayer, float f10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i11 & 8) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i9, i10, graphicsLayer, f10);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m22824placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j9, GraphicsLayer graphicsLayer, float f10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i9 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m22834placeRelativeWithLayeraW9wM(placeable, j9, graphicsLayer, f10);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i9, int i10, GraphicsLayer graphicsLayer, float f10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i11 & 8) != 0) {
                f10 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i9, i10, graphicsLayer, f10);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m22826placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j9, GraphicsLayer graphicsLayer, float f10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i9 & 4) != 0) {
                f10 = 0.0f;
            }
            placementScope.m22836placeWithLayeraW9wM(placeable, j9, graphicsLayer, f10);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m22828placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j9, float f10, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m22836placeWithLayeraW9wM(Placeable placeable, long j9, GraphicsLayer graphicsLayer, float f10) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i9, int i10, GraphicsLayer graphicsLayer, float f10) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i10 & 4294967295L) | (i9 << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m22830placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j9, float f10, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((IntOffset.m24123getYimpl(j9) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(j9)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m22834placeRelativeWithLayeraW9wM(Placeable placeable, long j9, GraphicsLayer graphicsLayer, float f10) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(j9, placeable.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((IntOffset.m24123getYimpl(j9) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(j9)) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i9, int i10, GraphicsLayer graphicsLayer, float f10) {
            long jM24116constructorimpl = IntOffset.m24116constructorimpl((i9 << 32) | (i10 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl, placeable.apparentToRealOffset), f10, graphicsLayer);
            } else {
                long jM24116constructorimpl2 = IntOffset.m24116constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m24122getXimpl(jM24116constructorimpl)) << 32) | (IntOffset.m24123getYimpl(jM24116constructorimpl) & 4294967295L));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo22818placeAtf8xVGno(IntOffset.m24126plusqkQi6aY(jM24116constructorimpl2, placeable.apparentToRealOffset), f10, graphicsLayer);
            }
        }
    }
}
