package androidx.compose.foundation.layout;

import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.DpSize;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a-\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010 \u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010!\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010\"\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a!\u0010#\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a-\u0010&\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001f\u001a!\u0010*\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010%\u001a-\u0010,\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010%\u001a)\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aA\u00106\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010%\u001a-\u0010=\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010%\u001a)\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u00105\u001aA\u0010B\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010:\u001a!\u00101\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010%\u001a-\u0010E\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010\u001f\u001a \u0010G\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010H\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010I\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, m5175d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "createFillHeightModifier", "fraction", "", "createFillSizeModifier", "createFillWidthModifier", "createWrapContentHeightModifier", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "createWrapContentSizeModifier", "Landroidx/compose/ui/Alignment;", "createWrapContentWidthModifier", "Landroidx/compose/ui/Alignment$Horizontal;", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "wrapContentSize", "wrapContentWidth", "foundation-layout_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1024:1\n135#2:1025\n135#2:1026\n135#2:1027\n135#2:1028\n135#2:1029\n135#2:1030\n135#2:1031\n135#2:1032\n135#2:1033\n135#2:1034\n135#2:1035\n135#2:1036\n135#2:1037\n135#2:1038\n135#2:1039\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1025\n85#1:1026\n111#1:1027\n138#1:1028\n176#1:1029\n199#1:1030\n226#1:1031\n257#1:1032\n285#1:1033\n315#1:1034\n342#1:1035\n381#1:1036\n405#1:1037\n434#1:1038\n619#1:1039\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {
    private static final WrapContentModifier WrapContentHeightCenter;
    private static final WrapContentModifier WrapContentHeightTop;
    private static final WrapContentModifier WrapContentSizeCenter;
    private static final WrapContentModifier WrapContentSizeTopStart;
    private static final WrapContentModifier WrapContentWidthCenter;
    private static final WrapContentModifier WrapContentWidthStart;
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);

    static {
        Alignment.Companion companion = Alignment.INSTANCE;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    private static final FillModifier createFillHeightModifier(final float f4) {
        return new FillModifier(Direction.Vertical, f4, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillHeightModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxHeight");
                $receiver.getProperties().set("fraction", Float.valueOf(f4));
            }
        });
    }

    private static final FillModifier createFillSizeModifier(final float f4) {
        return new FillModifier(Direction.Both, f4, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillSizeModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxSize");
                $receiver.getProperties().set("fraction", Float.valueOf(f4));
            }
        });
    }

    private static final FillModifier createFillWidthModifier(final float f4) {
        return new FillModifier(Direction.Horizontal, f4, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillWidthModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxWidth");
                $receiver.getProperties().set("fraction", Float.valueOf(f4));
            }
        });
    }

    private static final WrapContentModifier createWrapContentHeightModifier(final Alignment.Vertical vertical, final boolean z3) {
        return new WrapContentModifier(Direction.Vertical, z3, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m11634boximpl(m7367invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m7367invoke5SAbXVA(long j4, LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                return IntOffsetKt.IntOffset(0, vertical.align(0, IntSize.m11684getHeightimpl(j4)));
            }
        }, vertical, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentHeight");
                $receiver.getProperties().set("align", vertical);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z3));
            }
        });
    }

    private static final WrapContentModifier createWrapContentSizeModifier(final Alignment alignment, final boolean z3) {
        return new WrapContentModifier(Direction.Both, z3, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m11634boximpl(m7368invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m7368invoke5SAbXVA(long j4, LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return alignment.mo8841alignKFBX0sM(IntSize.INSTANCE.m11690getZeroYbymL2g(), j4, layoutDirection);
            }
        }, alignment, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentSize");
                $receiver.getProperties().set("align", alignment);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z3));
            }
        });
    }

    private static final WrapContentModifier createWrapContentWidthModifier(final Alignment.Horizontal horizontal, final boolean z3) {
        return new WrapContentModifier(Direction.Horizontal, z3, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m11634boximpl(m7369invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m7369invoke5SAbXVA(long j4, LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return IntOffsetKt.IntOffset(horizontal.align(0, IntSize.m11685getWidthimpl(j4), layoutDirection), 0);
            }
        }, horizontal, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentWidth");
                $receiver.getProperties().set("align", horizontal);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z3));
            }
        });
    }

    @Stable
    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m7343defaultMinSizeVpY3zN4(Modifier defaultMinSize, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsModifier(f4, f5, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("defaultMinSize");
                inspectorInfo.getProperties().set("minWidth", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("minHeight", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7344defaultMinSizeVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7343defaultMinSizeVpY3zN4(modifier, f4, f5);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxHeight : createFillHeightModifier(f4));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return fillMaxHeight(modifier, f4);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxSize : createFillSizeModifier(f4));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return fillMaxSize(modifier, f4);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then((f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxWidth : createFillWidthModifier(f4));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return fillMaxWidth(modifier, f4);
    }

    @Stable
    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m7345height3ABfNKs(Modifier height, final float f4) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeModifier(0.0f, f4, 0.0f, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("height");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m7346heightInVpY3zN4(Modifier heightIn, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeModifier(0.0f, f4, 0.0f, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("max", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7347heightInVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7346heightInVpY3zN4(modifier, f4, f5);
    }

    @Stable
    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m7348requiredHeight3ABfNKs(Modifier requiredHeight, final float f4) {
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new SizeModifier(0.0f, f4, 0.0f, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m7349requiredHeightInVpY3zN4(Modifier requiredHeightIn, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeModifier(0.0f, f4, 0.0f, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("max", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7350requiredHeightInVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7349requiredHeightInVpY3zN4(modifier, f4, f5);
    }

    @Stable
    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m7351requiredSize3ABfNKs(Modifier requiredSize, final float f4) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f4, f4, f4, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m7352requiredSize6HolHcs(Modifier requiredSize, long j4) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m7353requiredSizeVpY3zN4(requiredSize, DpSize.m11623getWidthD9Ej5fM(j4), DpSize.m11621getHeightD9Ej5fM(j4));
    }

    @Stable
    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m7353requiredSizeVpY3zN4(Modifier requiredSize, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f4, f5, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("height", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m7354requiredSizeInqDBjuR0(Modifier requiredSizeIn, final float f4, final float f5, final float f6, final float f7) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeModifier(f4, f5, f6, f7, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("minHeight", C1700Dp.m11523boximpl(f5));
                inspectorInfo.getProperties().set("maxWidth", C1700Dp.m11523boximpl(f6));
                inspectorInfo.getProperties().set("maxHeight", C1700Dp.m11523boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7355requiredSizeInqDBjuR0$default(Modifier modifier, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7354requiredSizeInqDBjuR0(modifier, f4, f5, f6, f7);
    }

    @Stable
    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m7356requiredWidth3ABfNKs(Modifier requiredWidth, final float f4) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeModifier(f4, 0.0f, f4, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m7357requiredWidthInVpY3zN4(Modifier requiredWidthIn, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new SizeModifier(f4, 0.0f, f5, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("max", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7358requiredWidthInVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7357requiredWidthInVpY3zN4(modifier, f4, f5);
    }

    @Stable
    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m7359size3ABfNKs(Modifier size, final float f4) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f4, f4, f4, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("size");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m7360size6HolHcs(Modifier size, long j4) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m7361sizeVpY3zN4(size, DpSize.m11623getWidthD9Ej5fM(j4), DpSize.m11621getHeightD9Ej5fM(j4));
    }

    @Stable
    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m7361sizeVpY3zN4(Modifier size, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f4, f5, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("height", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m7362sizeInqDBjuR0(Modifier sizeIn, final float f4, final float f5, final float f6, final float f7) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeModifier(f4, f5, f6, f7, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("minHeight", C1700Dp.m11523boximpl(f5));
                inspectorInfo.getProperties().set("maxWidth", C1700Dp.m11523boximpl(f6));
                inspectorInfo.getProperties().set("maxHeight", C1700Dp.m11523boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7363sizeInqDBjuR0$default(Modifier modifier, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7362sizeInqDBjuR0(modifier, f4, f5, f6, f7);
    }

    @Stable
    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m7364width3ABfNKs(Modifier width, final float f4) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeModifier(f4, 0.0f, f4, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("width");
                inspectorInfo.setValue(C1700Dp.m11523boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m7365widthInVpY3zN4(Modifier widthIn, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeModifier(f4, 0.0f, f5, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("max", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7366widthInVpY3zN4$default(Modifier modifier, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM();
        }
        return m7365widthInVpY3zN4(modifier, f4, f5);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical align, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterVertically()) || z3) ? (!Intrinsics.areEqual(align, companion.getTop()) || z3) ? createWrapContentHeightModifier(align, z3) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return wrapContentHeight(modifier, vertical, z3);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment align, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenter()) || z3) ? (!Intrinsics.areEqual(align, companion.getTopStart()) || z3) ? createWrapContentSizeModifier(align, z3) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return wrapContentSize(modifier, alignment, z3);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal align, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterHorizontally()) || z3) ? (!Intrinsics.areEqual(align, companion.getStart()) || z3) ? createWrapContentWidthModifier(align, z3) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return wrapContentWidth(modifier, horizontal, z3);
    }
}
