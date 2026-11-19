package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p200x6.C6755e;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001as\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ai\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0015\u001as\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00192\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001ai\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001d\u001a'\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\bH\u0001¢\u0006\u0004\b \u0010!\u001a?\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&\u001a'\u0010'\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010(\u001a?\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b)\u0010*\u001a[\u00102\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b\u00112\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0082\b¢\u0006\u0004\b2\u00103\u001a\u0098\u0001\u00106\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b\u00112#\u00104\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b\u00112\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\"H\u0082\b¢\u0006\u0004\b6\u00107\u001a]\u0010=\u001a\u00020<2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>\u001a\u0098\u0001\u0010=\u001a\u00020<2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b\u00112#\u00104\u001a\u001f\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b\u00112\u0006\u0010;\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\"H\u0082\b¢\u0006\u0004\b=\u0010?\u001a\\\u0010N\u001a\u00020K*\u00020@2\u0006\u0010B\u001a\u00020A2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010J\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\"H\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a%\u0010Q\u001a\u0004\u0018\u00010D*\b\u0012\u0004\u0012\u00020D0C2\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bQ\u0010R\u001a#\u0010U\u001a\u00020\b*\u00020,2\u0006\u0010T\u001a\u00020S2\u0006\u00104\u001a\u00020\bH\u0000¢\u0006\u0004\bU\u0010V\u001a#\u0010W\u001a\u00020\b*\u00020,2\u0006\u0010T\u001a\u00020S2\u0006\u0010/\u001a\u00020\bH\u0000¢\u0006\u0004\bW\u0010V\u001a<\u0010]\u001a\u00020<*\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010J\u001a\u00020X2\u0014\u0010Z\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Y\u0012\u0004\u0012\u00020\u000f0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aT\u0010f\u001a\u00020K*\u00020@2\u0006\u0010J\u001a\u00020I2\u0006\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020\b2\u0006\u0010:\u001a\u0002082\f\u0010a\u001a\b\u0012\u0004\u0012\u00020K0`2\u0006\u0010b\u001a\u00020A2\u0006\u0010c\u001a\u000208H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010e\"\u001a\u0010h\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010i\u001a\u0004\bm\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "itemVerticalAlignment", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILr6/f;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment$Horizontal;", "itemHorizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILr6/f;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "maxIntrinsicMainAxisSize", "(Ljava/util/List;Lr6/f;III)I", "crossAxisSize", "crossAxisSpacing", "minIntrinsicMainAxisSize", "(Ljava/util/List;Lr6/f;Lr6/f;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "Landroidx/collection/IntIntPair;", "intrinsicCrossAxisSize", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "(Ljava/util/List;Lr6/f;Lr6/f;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesIterator", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "safeNext", "(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "", "isHorizontal", "mainAxisMin", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I", "crossAxisMin", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLr6/c;)J", "measureAndCache", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "items", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "getCROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1594:1\n1107#1,115:1734\n1247#2,6:1595\n1247#2,6:1601\n1247#2,6:1612\n1247#2,6:1649\n1247#2,6:1655\n1247#2,6:1666\n1247#2,6:1703\n1247#2,6:1709\n1247#2,6:1715\n1247#2,6:1721\n165#3,5:1607\n79#3,6:1618\n86#3,3:1633\n89#3,2:1642\n93#3:1647\n171#3:1648\n165#3,5:1661\n79#3,6:1672\n86#3,3:1687\n89#3,2:1696\n93#3:1701\n171#3:1702\n347#4,9:1624\n356#4,3:1644\n347#4,9:1678\n356#4,3:1698\n4206#5,6:1636\n4206#5,6:1690\n70#6,6:1727\n1#7:1733\n1101#8:1849\n1083#8,2:1850\n213#9:1852\n210#9:1853\n219#9:1854\n216#9:1867\n213#9:1868\n216#9,4:1871\n216#9,4:1885\n210#9,4:1899\n905#10:1855\n905#10:1856\n105#11:1857\n105#11:1858\n101#11,10:1875\n101#11,10:1889\n101#11,10:1903\n70#12:1859\n65#12:1860\n65#12:1861\n65#12:1862\n251#12,4:1863\n256#12:1869\n516#13:1870\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1079#1:1734,115\n100#1:1595,6\n111#1:1601,6\n118#1:1612,6\n214#1:1649,6\n225#1:1655,6\n231#1:1666,6\n451#1:1703,6\n486#1:1709,6\n516#1:1715,6\n548#1:1721,6\n118#1:1607,5\n118#1:1618,6\n118#1:1633,3\n118#1:1642,2\n118#1:1647\n118#1:1648\n231#1:1661,5\n231#1:1672,6\n231#1:1687,3\n231#1:1696,2\n231#1:1701\n231#1:1702\n118#1:1624,9\n118#1:1644,3\n231#1:1678,9\n231#1:1698,3\n118#1:1636,6\n231#1:1690,6\n957#1:1727,6\n1239#1:1849\n1239#1:1850,2\n1240#1:1852\n1241#1:1853\n1242#1:1854\n1444#1:1867\n1445#1:1868\n1564#1:1871,4\n1572#1:1885,4\n1578#1:1899,4\n1287#1:1855\n1288#1:1856\n1350#1:1857\n1360#1:1858\n1564#1:1875,10\n1572#1:1889,10\n1578#1:1903,10\n1421#1:1859\n1423#1:1860\n1434#1:1861\n1435#1:1862\n1439#1:1863,4\n1439#1:1869\n1471#1:1870\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {

    @NotNull
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;

    @NotNull
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r27, int r28, int r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.FlowColumnOverflow r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r27, int r28, int r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.FlowRowOverflow r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m7186breakDownItemsdi9J0FM(@NotNull MeasureScope measureScope, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy, @NotNull Iterator<? extends Measurable> it, float f, float f7, long j7, int i, int i8, @NotNull FlowLayoutOverflowState flowLayoutOverflowState) {
        int i9;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        int i10;
        int i11;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j8;
        int f908$h;
        int f909$w;
        int i12;
        MutableIntObjectMap mutableIntObjectMap2;
        IntIntPair intIntPairM6526boximpl;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i13;
        int i14;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i15;
        int i16;
        int i17;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo6903toPx0680j_4(f));
        int iCeil2 = (int) Math.ceil(measureScope3.mo6903toPx0680j_4(f7));
        long jM7229constructorimpl = OrientationIndependentConstraints.m7229constructorimpl(0, iM13258getMaxWidthimpl, 0, iM13257getMaxHeightimpl);
        long jM7244toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m7244toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m7233copyyUG9Ft0$default(jM7229constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo6900toDpu2uoSUM(iM13258getMaxWidthimpl), measureScope3.mo6900toDpu2uoSUM(iM13257getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        IntIntPair intIntPairM6526boximpl2 = measurableSafeNext != null ? IntIntPair.m6526boximpl(m7187measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM7244toBoxConstraintsOenEA2s, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable) obj);
                return C5443s.f8405a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(Placeable placeable) {
                ref$ObjectRef.element = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairM6526boximpl2 != null ? Integer.valueOf(IntIntPair.m6533getFirstimpl(intIntPairM6526boximpl2.getPackedValue())) : null;
        Integer numValueOf2 = intIntPairM6526boximpl2 != null ? Integer.valueOf(IntIntPair.m6534getSecondimpl(intIntPairM6526boximpl2.getPackedValue())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableSafeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j7, i8, iCeil, iCeil2, null);
        int i18 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM7184getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m6529constructorimpl(iM13258getMaxWidthimpl, iM13257getMaxHeightimpl), intIntPairM6526boximpl2, 0, 0, 0, false, false);
        if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM7184getWrapInfoOpUlnko, intIntPairM6526boximpl2 != null, -1, 0, iM13258getMaxWidthimpl, 0);
            i9 = iM13258getMaxWidthimpl;
        } else {
            i9 = iM13258getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM7184getWrapInfoOpUlnko;
        int i23 = 0;
        int i24 = iM13260getMinWidthimpl;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i25 = iM13257getMaxHeightimpl;
        int i26 = 0;
        int i27 = i9;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.getIsLastItemInContainer() && measurableSafeNext2 != null) {
            AbstractC5830k.m5327d(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            AbstractC5830k.m5327d(numValueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i28 = i9;
            int i29 = i20 + iIntValue;
            int iMax = Math.max(i19, numValueOf2.intValue());
            int i30 = i27 - iIntValue;
            int i31 = i26 + 1;
            int i32 = i24;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i31);
            arrayList.add(measurableSafeNext2);
            mutableIntObjectMapMutableIntObjectMapOf.set(i26, ref$ObjectRef.element);
            int i33 = i31 - i21;
            boolean z8 = i33 < i;
            if (flowLineInfo2 != null) {
                if (z8) {
                    i12 = i33;
                    i15 = i23;
                } else {
                    i12 = i33;
                    i15 = i23 + 1;
                }
                int i34 = z8 ? i12 : 0;
                if (z8) {
                    int i35 = i30 - i18;
                    i16 = i35 < 0 ? 0 : i35;
                } else {
                    i16 = i28;
                }
                float fMo6900toDpu2uoSUM = measureScope3.mo6900toDpu2uoSUM(i16);
                if (z8) {
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i17 = i25;
                } else {
                    int i36 = (i25 - iMax) - iCeil2;
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i17 = i36 < 0 ? 0 : i36;
                }
                flowLineInfo2.m7197update4j6BHR0$foundation_layout_release(i15, i34, fMo6900toDpu2uoSUM, measureScope3.mo6900toDpu2uoSUM(i17));
            } else {
                i12 = i33;
                mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            ref$ObjectRef.element = null;
            IntIntPair intIntPairM6526boximpl3 = measurableSafeNext2 != null ? IntIntPair.m6526boximpl(m7187measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM7244toBoxConstraintsOenEA2s, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable) obj);
                    return C5443s.f8405a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(Placeable placeable) {
                    ref$ObjectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairM6526boximpl3 != null ? Integer.valueOf(IntIntPair.m6533getFirstimpl(intIntPairM6526boximpl3.getPackedValue()) + i18) : null;
            numValueOf2 = intIntPairM6526boximpl3 != null ? Integer.valueOf(IntIntPair.m6534getSecondimpl(intIntPairM6526boximpl3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i37 = i23;
            long jM6529constructorimpl = IntIntPair.m6529constructorimpl(i30, i25);
            if (intIntPairM6526boximpl3 == null) {
                intIntPairM6526boximpl = null;
            } else {
                AbstractC5830k.m5327d(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                AbstractC5830k.m5327d(numValueOf2);
                intIntPairM6526boximpl = IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM7184getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(zHasNext, i12, jM6529constructorimpl, intIntPairM6526boximpl, i37, i22, iMax, false, false);
            if (wrapInfoM7184getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i32, i29), i28);
                int i38 = i22 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM7184getWrapInfoOpUlnko2, intIntPairM6526boximpl3 != null, i37, i38, i30, i12);
                mutableIntList = mutableIntList6;
                mutableIntList.add(iMax);
                int i39 = (iM13257getMaxHeightimpl - i38) - iCeil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.add(i31);
                i23 = i37 + 1;
                i22 = i38 + iCeil2;
                i27 = i28;
                i28 = i27;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i18) : null;
                i21 = i31;
                i13 = i39;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                i24 = iMin;
                mutableIntList2 = mutableIntList7;
                i14 = 0;
                i29 = 0;
            } else {
                mutableIntList = mutableIntList6;
                mutableIntList2 = mutableIntList5;
                numValueOf3 = numValueOf4;
                i27 = i30;
                i23 = i37;
                i24 = i32;
                i13 = i25;
                i14 = iMax;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            mutableIntList5 = mutableIntList2;
            i19 = i14;
            i25 = i13;
            i26 = i31;
            wrapInfo = wrapInfoM7184getWrapInfoOpUlnko2;
            it2 = it;
            mutableIntList4 = mutableIntList;
            mutableIntObjectMapMutableIntObjectMapOf = mutableIntObjectMap2;
            i20 = i29;
            i9 = i28;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapMutableIntObjectMapOf;
        int i40 = i24;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo3 != null) {
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i41 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i42 = mutableIntList9._size - 1;
                mutableIntList8.set(i41, Math.max(mutableIntList8.get(i41), IntIntPair.m6534getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList9.set(i42, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m6534getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList9.add(mutableIntList9.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i43 = 0; i43 < size; i43++) {
            placeableArr[i43] = mutableIntObjectMap.get(i43);
        }
        int i44 = mutableIntList9._size;
        int[] iArr3 = new int[i44];
        int[] iArr4 = new int[i44];
        int[] iArr5 = mutableIntList9.content;
        int iMax2 = i40;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i46 < i44) {
            int i48 = iArr5[i46];
            MutableIntList mutableIntList10 = mutableIntList8;
            int i49 = mutableIntList10.get(i46);
            int[] iArr6 = iArr3;
            Placeable[] placeableArr3 = placeableArr2;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i50 = i18;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy4, iMax2, Constraints.m13259getMinHeightimpl(jM7229constructorimpl), Constraints.m13258getMaxWidthimpl(jM7229constructorimpl), i49, i50, measureScope3, arrayList2, placeableArr3, i45, i48, iArr6, i46);
            if (flowLineMeasurePolicy.isHorizontal()) {
                f908$h = measureResultMeasure.getWidth();
                f909$w = measureResultMeasure.getHeight();
            } else {
                f908$h = measureResultMeasure.getHeight();
                f909$w = measureResultMeasure.getWidth();
            }
            iArr4[i46] = f909$w;
            i47 += f909$w;
            iMax2 = Math.max(iMax2, f908$h);
            mutableVector.add(measureResultMeasure);
            i46++;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            i45 = i48;
            iArr3 = iArr6;
            mutableIntList8 = mutableIntList10;
            i18 = i50;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i10 = 0;
            i11 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j8 = j7;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i10 = iMax2;
            i11 = i47;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j8 = j7;
        }
        return m7188placeHelperBmaY500(measureScope2, j8, i10, i11, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurementHelper(@NotNull Arrangement.Vertical vertical, @NotNull Arrangement.Horizontal horizontal, int i, @Nullable Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i8, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
        }
        boolean z8 = ((((i8 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && composer.changed(i)) || (i8 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo6545measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
                    return flowMeasurePolicy.mo7209measure3p2s80s(measureScope, AbstractC5806u.m5286y(list), j7);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    @NotNull
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(@NotNull Arrangement.Vertical vertical, @NotNull Arrangement.Horizontal horizontal, @NotNull Alignment.Horizontal horizontal2, int i, int i8, @NotNull FlowLayoutOverflowState flowLayoutOverflowState, @Nullable Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-308635847, i9, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
        }
        boolean zChanged = ((((i9 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i9 & 48) == 32) | ((((i9 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i9 & 384) == 256) | ((((i9 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i9 & 3072) == 2048) | ((((57344 & i9) ^ 24576) > 16384 && composer.changed(i8)) || (i9 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontal2), horizontal.getSpacing(), i, i8, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(@NotNull IntrinsicMeasurable intrinsicMeasurable, boolean z8, int i) {
        return z8 ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @NotNull
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    @NotNull
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC6474f interfaceC6474f, InterfaceC6474f interfaceC6474f2, int i, int i8, int i9, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i12;
        if (list.isEmpty()) {
            return IntIntPair.m6529constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState, OrientationIndependentConstraints.m7229constructorimpl(0, i, 0, Integer.MAX_VALUE), i11, i8, i9, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC5805t.m5230j0(0, list);
        int iIntValue = intrinsicMeasurable != null ? ((Number) interfaceC6474f2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i))).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? ((Number) interfaceC6474f.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int i13 = 0;
        int iMax = 0;
        if (flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m6529constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(iIntValue2, iIntValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m7189ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m6529constructorimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m6534getSecondimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i14 = i;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = iMax;
            if (i15 >= size) {
                i12 = i16;
                break;
            }
            int i20 = i14 - iIntValue2;
            int i21 = i15 + 1;
            iMax = Math.max(i19, iIntValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC5805t.m5230j0(i21, list);
            int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) interfaceC6474f2.invoke(intrinsicMeasurable2, Integer.valueOf(i21), Integer.valueOf(i))).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? ((Number) interfaceC6474f.invoke(intrinsicMeasurable2, Integer.valueOf(i21), Integer.valueOf(iIntValue3))).intValue() + i8 : 0;
            int i22 = i21 - i17;
            i12 = i21;
            int i23 = i18;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM7184getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(i15 + 2 < list.size(), i22, IntIntPair.m6529constructorimpl(i20, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(iIntValue4, iIntValue3)), i23, i13, iMax, false, false);
            if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int iM6534getSecondimpl = iMax + i9 + i13;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM7184getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i23, iM6534getSecondimpl, i20, i22);
                iIntValue4 -= i8;
                i18 = i23 + 1;
                if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM6534getSecondimpl = IntIntPair.m6534getSecondimpl(ellipsisSize) + i9 + iM6534getSecondimpl;
                        }
                    }
                    i13 = iM6534getSecondimpl;
                } else {
                    i14 = i;
                    i17 = i12;
                    i13 = iM6534getSecondimpl;
                    iMax = 0;
                }
            } else {
                i14 = i20;
                i18 = i23;
            }
            iIntValue2 = iIntValue4;
            iIntValue = iIntValue3;
            i15 = i12;
            i16 = i15;
        }
        return IntIntPair.m6529constructorimpl(i13 - i9, i12);
    }

    public static final int mainAxisMin(@NotNull IntrinsicMeasurable intrinsicMeasurable, boolean z8, int i) {
        return z8 ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC6474f interfaceC6474f, int i, int i8, int i9) {
        int size = list.size();
        int i10 = 0;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            int iIntValue = ((Number) interfaceC6474f.invoke(list.get(i10), Integer.valueOf(i10), Integer.valueOf(i))).intValue() + i8;
            int i13 = i10 + 1;
            if (i13 - i11 == i9 || i13 == list.size()) {
                iMax = Math.max(iMax, (i12 + iIntValue) - i8);
                i12 = 0;
                i11 = i10;
            } else {
                i12 += iIntValue;
            }
            i10 = i13;
        }
        return iMax;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m7187measureAndCacherqJ1uqs(@NotNull Measurable measurable, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
                interfaceC6471c.invoke(placeableMo12033measureBRTryo0);
                return IntIntPair.m6529constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo12033measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo12033measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m6529constructorimpl(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC6474f interfaceC6474f, InterfaceC6474f interfaceC6474f2, int i, int i8, int i9, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i12 = i10;
        int i13 = i11;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i14);
            int iIntValue = ((Number) interfaceC6474f.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(i))).intValue();
            iArr[i14] = iIntValue;
            iArr2[i14] = ((Number) interfaceC6474f2.invoke(intrinsicMeasurable, Integer.valueOf(i14), Integer.valueOf(iIntValue))).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i15 = Integer.MAX_VALUE;
        if (i13 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
            i15 = i12 * i13;
        }
        int iMin = Math.min(i15 - (((i15 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i15 < list2.size() || i13 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += iArr[i17];
        }
        int size4 = ((list2.size() - 1) * i8) + i16;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iM6533getFirstimpl = iArr2[0];
        C6755e it = new C6756f(1, size2 - 1, 1).iterator();
        while (it.f11425c) {
            int i18 = iArr2[it.nextInt()];
            if (iM6533getFirstimpl < i18) {
                iM6533getFirstimpl = i18;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr[0];
        C6755e it2 = new C6756f(1, size - 1, 1).iterator();
        while (it2.f11425c) {
            int i20 = iArr[it2.nextInt()];
            if (i19 < i20) {
                i19 = i20;
            }
        }
        int i21 = i19;
        int i22 = size4;
        while (i21 <= i22 && iM6533getFirstimpl != i) {
            int i23 = (i21 + i22) / 2;
            long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i23, i8, i9, i12, i13, flowLayoutOverflowState);
            iM6533getFirstimpl = IntIntPair.m6533getFirstimpl(jIntrinsicCrossAxisSize);
            int iM6534getSecondimpl = IntIntPair.m6534getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM6533getFirstimpl > i || iM6534getSecondimpl < iMin) {
                i21 = i23 + 1;
                if (i21 > i22) {
                    return i21;
                }
            } else {
                if (iM6533getFirstimpl >= i) {
                    return i23;
                }
                i22 = i23 - 1;
            }
            list2 = list;
            i12 = i10;
            i13 = i11;
            size4 = i23;
        }
        return size4;
    }

    @NotNull
    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m7188placeHelperBmaY500(@NotNull MeasureScope measureScope, long j7, int i, int i8, @NotNull int[] iArr, @NotNull final MutableVector<MeasureResult> mutableVector, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy, @NotNull int[] iArr2) {
        int iM13257getMaxHeightimpl;
        int i9;
        int i10;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            int size = ((mutableVector.getSize() - 1) * measureScope.mo6897roundToPx0680j_4(verticalArrangement.getSpacing())) + i8;
            int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
            iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
            if (size < iM13259getMinHeightimpl) {
                size = iM13259getMinHeightimpl;
            }
            if (size <= iM13257getMaxHeightimpl) {
                iM13257getMaxHeightimpl = size;
            }
            verticalArrangement.arrange(measureScope, iM13257getMaxHeightimpl, iArr, iArr2);
        } else {
            int size2 = ((mutableVector.getSize() - 1) * measureScope.mo6897roundToPx0680j_4(horizontalArrangement.getSpacing())) + i8;
            int iM13259getMinHeightimpl2 = Constraints.m13259getMinHeightimpl(j7);
            int iM13257getMaxHeightimpl2 = Constraints.m13257getMaxHeightimpl(j7);
            if (size2 < iM13259getMinHeightimpl2) {
                size2 = iM13259getMinHeightimpl2;
            }
            int i11 = size2 > iM13257getMaxHeightimpl2 ? iM13257getMaxHeightimpl2 : size2;
            horizontalArrangement.arrange(measureScope, i11, iArr, measureScope.getLayoutDirection(), iArr2);
            iM13257getMaxHeightimpl = i11;
        }
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        if (i < iM13260getMinWidthimpl) {
            i = iM13260getMinWidthimpl;
        }
        if (i <= iM13258getMaxWidthimpl) {
            iM13258getMaxWidthimpl = i;
        }
        if (zIsHorizontal) {
            i10 = iM13258getMaxWidthimpl;
            i9 = iM13257getMaxHeightimpl;
        } else {
            i9 = iM13258getMaxWidthimpl;
            i10 = iM13257getMaxHeightimpl;
        }
        return MeasureScope.layout$default(measureScope, i10, i9, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                MeasureResult[] measureResultArr = mutableVector2.content;
                int size3 = mutableVector2.getSize();
                for (int i12 = 0; i12 < size3; i12++) {
                    measureResultArr[i12].placeChildren();
                }
            }
        }, 4, null);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurementHelper(@NotNull Arrangement.Horizontal horizontal, @NotNull Arrangement.Vertical vertical, int i, @Nullable Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i8, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)");
        }
        boolean z8 = ((((i8 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && composer.changed(i)) || (i8 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo6545measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
                    return flowMeasurePolicy.mo7209measure3p2s80s(measureScope, AbstractC5806u.m5286y(list), j7);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @Composable
    @NotNull
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(@NotNull Arrangement.Horizontal horizontal, @NotNull Arrangement.Vertical vertical, @NotNull Alignment.Vertical vertical2, int i, int i8, @NotNull FlowLayoutOverflowState flowLayoutOverflowState, @Nullable Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i9, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zChanged = ((((i9 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i9 & 48) == 32) | ((((i9 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i9 & 384) == 256) | ((((i9 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i9 & 3072) == 2048) | ((((57344 & i9) ^ 24576) > 16384 && composer.changed(i8)) || (i9 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical2), vertical.getSpacing(), i, i8, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return it.next();
            }
            AbstractC5830k.m5327d(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i8, int i9, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m6529constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState, OrientationIndependentConstraints.m7229constructorimpl(0, i, 0, Integer.MAX_VALUE), i11, i8, i9, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) AbstractC5805t.m5230j0(0, list);
        int i12 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i13 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i14 = 0;
        if (flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m6529constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(i13, i12)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m7189ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m6529constructorimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m6534getSecondimpl(intIntPairM7189ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i15 = i;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            if (i16 >= size) {
                break;
            }
            int i21 = i15 - i13;
            int i22 = i16 + 1;
            int iMax = Math.max(i20, i12);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) AbstractC5805t.m5230j0(i22, list);
            int i23 = intrinsicMeasurable2 != null ? iArr2[i22] : 0;
            int i24 = intrinsicMeasurable2 != null ? iArr[i22] + i8 : 0;
            int i25 = i22 - i18;
            int i26 = i19;
            int i27 = i23;
            int i28 = i24;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM7184getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m7184getWrapInfoOpUlnko(i16 + 2 < list.size(), i25, IntIntPair.m6529constructorimpl(i21, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m6526boximpl(IntIntPair.m6529constructorimpl(i24, i23)), i26, i14, iMax, false, false);
            if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int iM6534getSecondimpl = iMax + i9 + i14;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM7184getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i26, iM6534getSecondimpl, i21, i25);
                int i29 = i28 - i8;
                i19 = i26 + 1;
                if (wrapInfoM7184getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM6534getSecondimpl += IntIntPair.m6534getSecondimpl(ellipsisSize) + i9;
                        }
                    }
                    i14 = iM6534getSecondimpl;
                    i17 = i22;
                } else {
                    i20 = 0;
                    i14 = iM6534getSecondimpl;
                    i13 = i29;
                    i18 = i22;
                    i15 = i;
                }
            } else {
                i15 = i21;
                i19 = i26;
                i20 = iMax;
                i13 = i28;
            }
            i16 = i22;
            i17 = i16;
            i12 = i27;
        }
        return IntIntPair.m6529constructorimpl(i14 - i9, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r21, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r24, int r25, int r26, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r21, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r24, int r25, int r26, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }
}
