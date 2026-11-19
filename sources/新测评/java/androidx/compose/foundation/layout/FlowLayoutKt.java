package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m13557d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aq\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010!\u001aq\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010'\u001a=\u0010(\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010,\u001a\u0096\u0001\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b¢\u0006\u0002\u00108\u001a[\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0002¢\u0006\u0002\u0010<\u001aT\u0010=\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0082\b\u001a\u0091\u0001\u0010?\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b\u001a%\u0010@\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010A\u001a=\u0010B\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010C\u001a\\\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020P2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010S\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00102\u001a\u00020\u0011H\u0000\u001a\u001c\u0010V\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u00020\u0011H\u0000\u001a<\u0010W\u001a\u00020.*\u00020K2\u0006\u0010G\u001a\u00020H2\u0006\u0010O\u001a\u00020X2\u0014\u0010Y\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\u00070\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aT\u0010]\u001a\u00020E*\u00020F2\u0006\u0010O\u001a\u00020P2\u0006\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020E0a2\u0006\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020:H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a\u001e\u0010f\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0J2\b\u0010g\u001a\u0004\u0018\u00010hH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006i"}, m13558d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1594:1\n1107#1,115:1734\n1247#2,6:1595\n1247#2,6:1601\n1247#2,6:1612\n1247#2,6:1649\n1247#2,6:1655\n1247#2,6:1666\n1247#2,6:1703\n1247#2,6:1709\n1247#2,6:1715\n1247#2,6:1721\n165#3,5:1607\n79#3,6:1618\n86#3,3:1633\n89#3,2:1642\n93#3:1647\n171#3:1648\n165#3,5:1661\n79#3,6:1672\n86#3,3:1687\n89#3,2:1696\n93#3:1701\n171#3:1702\n347#4,9:1624\n356#4,3:1644\n347#4,9:1678\n356#4,3:1698\n4206#5,6:1636\n4206#5,6:1690\n70#6,6:1727\n1#7:1733\n1101#8:1849\n1083#8,2:1850\n213#9:1852\n210#9:1853\n219#9:1854\n216#9:1867\n213#9:1868\n216#9,4:1871\n216#9,4:1885\n210#9,4:1899\n905#10:1855\n905#10:1856\n105#11:1857\n105#11:1858\n101#11,10:1875\n101#11,10:1889\n101#11,10:1903\n70#12:1859\n65#12:1860\n65#12:1861\n65#12:1862\n251#12,4:1863\n256#12:1869\n516#13:1870\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1079#1:1734,115\n100#1:1595,6\n111#1:1601,6\n118#1:1612,6\n214#1:1649,6\n225#1:1655,6\n231#1:1666,6\n451#1:1703,6\n486#1:1709,6\n516#1:1715,6\n548#1:1721,6\n118#1:1607,5\n118#1:1618,6\n118#1:1633,3\n118#1:1642,2\n118#1:1647\n118#1:1648\n231#1:1661,5\n231#1:1672,6\n231#1:1687,3\n231#1:1696,2\n231#1:1701\n231#1:1702\n118#1:1624,9\n118#1:1644,3\n231#1:1678,9\n231#1:1698,3\n118#1:1636,6\n231#1:1690,6\n957#1:1727,6\n1239#1:1849\n1239#1:1850,2\n1240#1:1852\n1241#1:1853\n1242#1:1854\n1444#1:1867\n1445#1:1868\n1564#1:1871,4\n1572#1:1885,4\n1578#1:1899,4\n1287#1:1855\n1288#1:1856\n1350#1:1857\n1360#1:1858\n1564#1:1875,10\n1572#1:1889,10\n1578#1:1903,10\n1421#1:1859\n1423#1:1860\n1434#1:1861\n1435#1:1862\n1439#1:1863,4\n1439#1:1869\n1471#1:1870\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
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
    public static final void FlowColumn(androidx.compose.p013ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, androidx.compose.foundation.layout.Arrangement.Horizontal r26, androidx.compose.ui.Alignment.Horizontal r27, int r28, int r29, androidx.compose.foundation.layout.FlowColumnOverflow r30, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
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
    public static final void FlowRow(androidx.compose.p013ui.Modifier r24, androidx.compose.foundation.layout.Arrangement.Horizontal r25, androidx.compose.foundation.layout.Arrangement.Vertical r26, androidx.compose.ui.Alignment.Vertical r27, int r28, int r29, androidx.compose.foundation.layout.FlowRowOverflow r30, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m17605breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f10, float f11, long j10, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i12;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        int i13;
        int i14;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j11;
        int i15;
        int i16;
        int i17;
        MutableIntObjectMap mutableIntObjectMap2;
        IntIntPair intIntPairM16969boximpl;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i18;
        int i19;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i20;
        int i21;
        int i22;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope3.mo17332toPx0680j_4(f10));
        int iCeil2 = (int) Math.ceil(measureScope3.mo17332toPx0680j_4(f11));
        long jM17648constructorimpl = OrientationIndependentConstraints.m17648constructorimpl(0, iM23514getMaxWidthimpl, 0, iM23513getMaxHeightimpl);
        long jM17663toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m17663toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m17652copyyUG9Ft0$default(jM17648constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo17329toDpu2uoSUM(iM23514getMaxWidthimpl), measureScope3.mo17329toDpu2uoSUM(iM23513getMaxHeightimpl), null) : null;
        Measurable measurableSafeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        IntIntPair intIntPairM16969boximpl2 = measurableSafeNext != null ? IntIntPair.m16969boximpl(m17606measureAndCacherqJ1uqs(measurableSafeNext, flowLineMeasurePolicy3, jM17663toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                invoke2(placeable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                objectRef.element = placeable;
            }
        })) : null;
        Integer numValueOf = intIntPairM16969boximpl2 != null ? Integer.valueOf(IntIntPair.m16976getFirstimpl(intIntPairM16969boximpl2.getPackedValue())) : null;
        Integer numValueOf2 = intIntPairM16969boximpl2 != null ? Integer.valueOf(IntIntPair.m16977getSecondimpl(intIntPairM16969boximpl2.getPackedValue())) : null;
        Integer num = numValueOf;
        Measurable measurable = measurableSafeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState, j10, i11, iCeil, iCeil2, null);
        int i23 = iCeil;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM17603getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(it2.hasNext(), 0, IntIntPair.m16972constructorimpl(iM23514getMaxWidthimpl, iM23513getMaxHeightimpl), intIntPairM16969boximpl2, 0, 0, 0, false, false);
        if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM17603getWrapInfoOpUlnko, intIntPairM16969boximpl2 != null, -1, 0, iM23514getMaxWidthimpl, 0);
            i12 = iM23514getMaxWidthimpl;
        } else {
            i12 = iM23514getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        Integer numValueOf3 = num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfoM17603getWrapInfoOpUlnko;
        int i28 = 0;
        int i29 = iM23516getMinWidthimpl;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i30 = iM23513getMaxHeightimpl;
        int i31 = 0;
        int i32 = i12;
        Measurable measurableSafeNext2 = measurable;
        while (!wrapInfo.getIsLastItemInContainer() && measurableSafeNext2 != null) {
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i33 = i12;
            int i34 = i25 + iIntValue;
            int iMax = Math.max(i24, numValueOf2.intValue());
            int i35 = i32 - iIntValue;
            int i36 = i31 + 1;
            int i37 = i29;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i36);
            arrayList.add(measurableSafeNext2);
            mutableIntObjectMapMutableIntObjectMapOf.set(i31, objectRef.element);
            int i38 = i36 - i26;
            boolean z9 = i38 < i10;
            if (flowLineInfo2 != null) {
                if (z9) {
                    i17 = i38;
                    i20 = i28;
                } else {
                    i17 = i38;
                    i20 = i28 + 1;
                }
                int i39 = z9 ? i17 : 0;
                if (z9) {
                    int i40 = i35 - i23;
                    i21 = i40 < 0 ? 0 : i40;
                } else {
                    i21 = i33;
                }
                float fMo17329toDpu2uoSUM = measureScope3.mo17329toDpu2uoSUM(i21);
                if (z9) {
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i22 = i30;
                } else {
                    int i41 = (i30 - iMax) - iCeil2;
                    mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
                    i22 = i41 < 0 ? 0 : i41;
                }
                flowLineInfo2.m17616update4j6BHR0$foundation_layout_release(i20, i39, fMo17329toDpu2uoSUM, measureScope3.mo17329toDpu2uoSUM(i22));
            } else {
                i17 = i38;
                mutableIntObjectMap2 = mutableIntObjectMapMutableIntObjectMapOf;
            }
            measurableSafeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            objectRef.element = null;
            IntIntPair intIntPairM16969boximpl3 = measurableSafeNext2 != null ? IntIntPair.m16969boximpl(m17606measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy3, jM17663toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf4 = intIntPairM16969boximpl3 != null ? Integer.valueOf(IntIntPair.m16976getFirstimpl(intIntPairM16969boximpl3.getPackedValue()) + i23) : null;
            numValueOf2 = intIntPairM16969boximpl3 != null ? Integer.valueOf(IntIntPair.m16977getSecondimpl(intIntPairM16969boximpl3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i42 = i28;
            long jM16972constructorimpl = IntIntPair.m16972constructorimpl(i35, i30);
            if (intIntPairM16969boximpl3 == null) {
                intIntPairM16969boximpl = null;
            } else {
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                intIntPairM16969boximpl = IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM17603getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(zHasNext, i17, jM16972constructorimpl, intIntPairM16969boximpl, i42, i27, iMax, false, false);
            if (wrapInfoM17603getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i37, i34), i33);
                int i43 = i27 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM17603getWrapInfoOpUlnko2, intIntPairM16969boximpl3 != null, i42, i43, i35, i17);
                mutableIntList = mutableIntList6;
                mutableIntList.add(iMax);
                int i44 = (iM23513getMaxHeightimpl - i43) - iCeil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.add(i36);
                i28 = i42 + 1;
                i27 = i43 + iCeil2;
                i32 = i33;
                i33 = i32;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i23) : null;
                i26 = i36;
                i18 = i44;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                i29 = iMin;
                mutableIntList2 = mutableIntList7;
                i19 = 0;
                i34 = 0;
            } else {
                mutableIntList = mutableIntList6;
                mutableIntList2 = mutableIntList5;
                numValueOf3 = numValueOf4;
                i32 = i35;
                i28 = i42;
                i29 = i37;
                i18 = i30;
                i19 = iMax;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            mutableIntList5 = mutableIntList2;
            i24 = i19;
            i30 = i18;
            i31 = i36;
            wrapInfo = wrapInfoM17603getWrapInfoOpUlnko2;
            it2 = it;
            mutableIntList4 = mutableIntList;
            mutableIntObjectMapMutableIntObjectMapOf = mutableIntObjectMap2;
            i25 = i34;
            i12 = i33;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapMutableIntObjectMapOf;
        int i45 = i29;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo3 != null) {
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i46 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int i47 = mutableIntList9._size - 1;
                mutableIntList8.set(i46, Math.max(mutableIntList8.get(i46), IntIntPair.m16977getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList9.set(i47, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m16977getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList9.add(mutableIntList9.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i48 = 0; i48 < size; i48++) {
            placeableArr[i48] = mutableIntObjectMap.get(i48);
        }
        int i49 = mutableIntList9._size;
        int[] iArr3 = new int[i49];
        int[] iArr4 = new int[i49];
        int[] iArr5 = mutableIntList9.content;
        int iMax2 = i45;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i51 < i49) {
            int i53 = iArr5[i51];
            MutableIntList mutableIntList10 = mutableIntList8;
            int i54 = mutableIntList10.get(i51);
            int[] iArr6 = iArr3;
            Placeable[] placeableArr3 = placeableArr2;
            FlowLineMeasurePolicy flowLineMeasurePolicy4 = flowLineMeasurePolicy3;
            ArrayList arrayList2 = arrayList;
            int i55 = i23;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy4, iMax2, Constraints.m23515getMinHeightimpl(jM17648constructorimpl), Constraints.m23514getMaxWidthimpl(jM17648constructorimpl), i54, i55, measureScope3, arrayList2, placeableArr3, i50, i53, iArr6, i51);
            if (flowLineMeasurePolicy.isHorizontal()) {
                i15 = measureResultMeasure.getWidth();
                i16 = measureResultMeasure.getHeight();
            } else {
                i15 = measureResultMeasure.getHeight();
                i16 = measureResultMeasure.getWidth();
            }
            iArr4[i51] = i16;
            i52 += i16;
            iMax2 = Math.max(iMax2, i15);
            mutableVector.add(measureResultMeasure);
            i51++;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            i50 = i53;
            iArr3 = iArr6;
            mutableIntList8 = mutableIntList10;
            i23 = i55;
            measureScope3 = measureScope;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        int[] iArr7 = iArr3;
        if (mutableVector.getSize() == 0) {
            i13 = 0;
            i14 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j11 = j10;
            iArr = iArr7;
            iArr2 = iArr4;
        } else {
            i13 = iMax2;
            i14 = i52;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr7;
            iArr2 = iArr4;
            j11 = j10;
        }
        return m17607placeHelperBmaY500(measureScope2, j11, i13, i14, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }

    @Composable
    @PublishedApi
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)");
        }
        boolean z9 = ((((i11 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i10, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.p013ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo17628measure3p2s80s(measureScope, CollectionsKt.listOf(list), j10);
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
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-308635847, i12, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)");
        }
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontal2), horizontal.getSpacing(), i10, i11, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            objRememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z9, int i10) {
        return z9 ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15;
        if (list.isEmpty()) {
            return IntIntPair.m16972constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m17648constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int iIntValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i10)).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int i16 = 0;
        int iMax = 0;
        if (flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m16972constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(iIntValue2, iIntValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m17608ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m16972constructorimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m16977getSecondimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int i22 = iMax;
            if (i18 >= size) {
                i15 = i19;
                break;
            }
            int i23 = i17 - iIntValue2;
            int i24 = i18 + 1;
            iMax = Math.max(i22, iIntValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i24);
            int iIntValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(i10)).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i24), Integer.valueOf(iIntValue3)).intValue() + i11 : 0;
            int i25 = i24 - i20;
            i15 = i24;
            int i26 = i21;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM17603getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(i18 + 2 < list.size(), i25, IntIntPair.m16972constructorimpl(i23, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(iIntValue4, iIntValue3)), i26, i16, iMax, false, false);
            if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int iM16977getSecondimpl = i16 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM17603getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i26, iM16977getSecondimpl, i23, i25);
                iIntValue4 -= i11;
                i21 = i26 + 1;
                if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM16977getSecondimpl += IntIntPair.m16977getSecondimpl(ellipsisSize) + i12;
                        }
                    }
                    i16 = iM16977getSecondimpl;
                } else {
                    i17 = i10;
                    i20 = i15;
                    i16 = iM16977getSecondimpl;
                    iMax = 0;
                }
            } else {
                i17 = i23;
                i21 = i26;
            }
            iIntValue2 = iIntValue4;
            iIntValue = iIntValue3;
            i18 = i15;
            i19 = i18;
        }
        return IntIntPair.m16972constructorimpl(i16 - i12, i15);
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z9, int i10) {
        return z9 ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = function3.invoke(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10)).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m17606measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j10, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeableMo22324measureBRTryo0 = measurable.mo22324measureBRTryo0(j10);
                function1.invoke(placeableMo22324measureBRTryo0);
                return IntIntPair.m16972constructorimpl(flowLineMeasurePolicy.mainAxisSize(placeableMo22324measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(placeableMo22324measureBRTryo0));
            }
        }
        int iMainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m16972constructorimpl(iMainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), iMainAxisMin));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15 = i13;
        int i16 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i17);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(i10)).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i17), Integer.valueOf(iIntValue)).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int iMin = Math.min(i18 - (((i18 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i18 < list2.size() || i16 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int iSum = ArraysKt.sum(iArr) + ((list2.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr2[0];
        ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i20 = iArr2[it.nextInt()];
            if (i19 < i20) {
                i19 = i20;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i22 = iArr[it2.nextInt()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        int i23 = i21;
        int i24 = iSum;
        while (i23 <= i24 && i19 != i10) {
            int i25 = (i23 + i24) / 2;
            long jIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i25, i11, i12, i15, i16, flowLayoutOverflowState);
            int iM16976getFirstimpl = IntIntPair.m16976getFirstimpl(jIntrinsicCrossAxisSize);
            int iM16977getSecondimpl = IntIntPair.m16977getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM16976getFirstimpl > i10 || iM16977getSecondimpl < iMin) {
                i23 = i25 + 1;
                if (i23 > i24) {
                    return i23;
                }
            } else {
                if (iM16976getFirstimpl >= i10) {
                    return i25;
                }
                i24 = i25 - 1;
            }
            list2 = list;
            i15 = i13;
            i16 = i14;
            iSum = i25;
            i19 = iM16976getFirstimpl;
        }
        return iSum;
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m17607placeHelperBmaY500(MeasureScope measureScope, long j10, int i10, int i11, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int iM23513getMaxHeightimpl;
        int i12;
        int i13;
        boolean zIsHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (zIsHorizontal) {
            int iMo17326roundToPx0680j_4 = i11 + (measureScope.mo17326roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1));
            int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
            iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
            if (iMo17326roundToPx0680j_4 < iM23515getMinHeightimpl) {
                iMo17326roundToPx0680j_4 = iM23515getMinHeightimpl;
            }
            if (iMo17326roundToPx0680j_4 <= iM23513getMaxHeightimpl) {
                iM23513getMaxHeightimpl = iMo17326roundToPx0680j_4;
            }
            verticalArrangement.arrange(measureScope, iM23513getMaxHeightimpl, iArr, iArr2);
        } else {
            int iMo17326roundToPx0680j_42 = i11 + (measureScope.mo17326roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1));
            int iM23515getMinHeightimpl2 = Constraints.m23515getMinHeightimpl(j10);
            int iM23513getMaxHeightimpl2 = Constraints.m23513getMaxHeightimpl(j10);
            if (iMo17326roundToPx0680j_42 < iM23515getMinHeightimpl2) {
                iMo17326roundToPx0680j_42 = iM23515getMinHeightimpl2;
            }
            int i14 = iMo17326roundToPx0680j_42 > iM23513getMaxHeightimpl2 ? iM23513getMaxHeightimpl2 : iMo17326roundToPx0680j_42;
            horizontalArrangement.arrange(measureScope, i14, iArr, measureScope.getLayoutDirection(), iArr2);
            iM23513getMaxHeightimpl = i14;
        }
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        if (i10 < iM23516getMinWidthimpl) {
            i10 = iM23516getMinWidthimpl;
        }
        if (i10 <= iM23514getMaxWidthimpl) {
            iM23514getMaxWidthimpl = i10;
        }
        if (zIsHorizontal) {
            i13 = iM23514getMaxWidthimpl;
            i12 = iM23513getMaxHeightimpl;
        } else {
            i12 = iM23514getMaxWidthimpl;
            i13 = iM23513getMaxHeightimpl;
        }
        return MeasureScope.layout$default(measureScope, i13, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                MeasureResult[] measureResultArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    measureResultArr[i15].placeChildren();
                }
            }
        }, 4, null);
    }

    @Composable
    @PublishedApi
    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i10, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i11, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)");
        }
        boolean z9 = ((((i11 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(i10)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i10, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.p013ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                    return flowMeasurePolicy.mo17628measure3p2s80s(measureScope, CollectionsKt.listOf(list), j10);
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
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i12, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)");
        }
        boolean zChanged = ((((i12 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && composer.changed(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(i11)) || (i12 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical2), vertical.getSpacing(), i10, i11, flowLayoutOverflowState, null);
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
            Intrinsics.checkNotNull(flowLineInfo);
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return IntIntPair.m16972constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i13, flowLayoutOverflowState, OrientationIndependentConstraints.m17648constructorimpl(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int i15 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i16 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i17 = 0;
        if (flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m16972constructorimpl(i10, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(i16, i15)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m17608ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m16972constructorimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m16977getSecondimpl(intIntPairM17608ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            int i24 = i18 - i16;
            int i25 = i19 + 1;
            int iMax = Math.max(i23, i15);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i25);
            int i26 = intrinsicMeasurable2 != null ? iArr2[i25] : 0;
            int i27 = intrinsicMeasurable2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM17603getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m17603getWrapInfoOpUlnko(i19 + 2 < list.size(), i28, IntIntPair.m16972constructorimpl(i24, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m16969boximpl(IntIntPair.m16972constructorimpl(i27, i26)), i29, i17, iMax, false, false);
            if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int iM16977getSecondimpl = i17 + iMax + i12;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM17603getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i29, iM16977getSecondimpl, i24, i28);
                int i32 = i31 - i11;
                i22 = i29 + 1;
                if (wrapInfoM17603getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            iM16977getSecondimpl += IntIntPair.m16977getSecondimpl(ellipsisSize) + i12;
                        }
                    }
                    i17 = iM16977getSecondimpl;
                    i20 = i25;
                } else {
                    i23 = 0;
                    i17 = iM16977getSecondimpl;
                    i16 = i32;
                    i21 = i25;
                    i18 = i10;
                }
            } else {
                i18 = i24;
                i22 = i29;
                i23 = iMax;
                i16 = i31;
            }
            i19 = i25;
            i20 = i19;
            i15 = i30;
        }
        return IntIntPair.m16972constructorimpl(i17 - i12, i20);
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
    public static final void FlowColumn(androidx.compose.p013ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.foundation.layout.Arrangement.Horizontal r23, androidx.compose.ui.Alignment.Horizontal r24, int r25, int r26, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void FlowRow(androidx.compose.p013ui.Modifier r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.foundation.layout.Arrangement.Vertical r23, androidx.compose.ui.Alignment.Vertical r24, int r25, int r26, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
