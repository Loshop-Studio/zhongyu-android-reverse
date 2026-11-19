package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m5174d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010 \u001a\u008f\u0001\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2*\u0010$\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2$\u0010.\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001ax\u00101\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a>\u00101\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a9\u0010;\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010<\u001a9\u0010=\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010>\u001aS\u0010?\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001ax\u0010A\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a)\u0010B\u001a\u00020\u001e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010C\u001a,\u0010D\u001a\u00020E*\u00020\u00042\u0006\u0010F\u001a\u00020G2\u0006\u0010\"\u001a\u00020#2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u001f\u001a\u00020\u0002H\u0000\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u00105\u001a\u00020\u0002H\u0000\u001a\u0014\u0010*\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a\u001c\u0010M\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0002H\u0000\u001a\u0014\u00105\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a2\u0010N\u001a\u00020\u0002*\u00020K2\u0006\u0010H\u001a\u00020I2\u0006\u0010\"\u001a\u00020#2\u0014\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010L\u0012\u0004\u0012\u00020\u00050\u0010H\u0002\",\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, m5175d2 = {"crossAxisColumnArrangement", "Lkotlin/Function4;", "", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "crossAxisRowArrangement", "FlowColumn", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "flowMeasurePolicy", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "mainAxisArrangement", "Lkotlin/Function5;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangement", "flowMeasurePolicy-942rkJo", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;", "intrinsicCrossAxisSize", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "mainAxisAvailable", "mainAxisSpacing", "mainAxisSizes", "crossAxisSizes", "mainAxisColumnArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "mainAxisRowArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowResult;", "measureHelper", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "crossAxisMin", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "mainAxisMin", "measureAndCache", "storePlaceable", "foundation-layout_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,724:1\n75#2:725\n76#2,11:727\n89#2:754\n75#2:755\n76#2,11:757\n89#2:784\n76#3:726\n76#3:756\n460#4,16:738\n460#4,16:768\n36#4:785\n36#4:792\n36#4:799\n67#4,3:806\n66#4:809\n36#4:816\n67#4,3:823\n66#4:826\n1057#5,6:786\n1057#5,6:793\n1057#5,6:800\n1057#5,6:810\n1057#5,6:817\n1057#5,6:827\n49#6,6:833\n49#6,6:840\n1#7:839\n1182#8:846\n1161#8,2:847\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n66#1:725\n66#1:727,11\n66#1:754\n116#1:755\n116#1:757,11\n116#1:784\n66#1:726\n116#1:756\n66#1:738,16\n116#1:768,16\n126#1:785\n137#1:792\n165#1:799\n168#1:806,3\n168#1:809\n188#1:816\n191#1:823,3\n191#1:826\n126#1:786,6\n137#1:793,6\n165#1:800,6\n168#1:810,6\n188#1:817,6\n191#1:827,6\n427#1:833,6\n542#1:840,6\n580#1:846\n580#1:847,2\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisRowArrangement = new Function4<Integer, int[], MeasureScope, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisRowArrangement$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            invoke(num.intValue(), iArr, measureScope, iArr2);
            return Unit.INSTANCE;
        }

        public final void invoke(int i4, int[] size, MeasureScope measureScope, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(measureScope, "measureScope");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getTop().arrange(measureScope, i4, size, outPosition);
        }
    };
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisColumnArrangement = new Function4<Integer, int[], MeasureScope, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisColumnArrangement$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            invoke(num.intValue(), iArr, measureScope, iArr2);
            return Unit.INSTANCE;
        }

        public final void invoke(int i4, int[] size, MeasureScope measureScope, int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(measureScope, "measureScope");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getStart().arrange(measureScope, i4, size, measureScope.getLayoutDirection(), outPosition);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.p006ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Vertical r17, androidx.compose.ui.Alignment.Horizontal r18, int r19, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.p006ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Horizontal r17, androidx.compose.ui.Alignment.Vertical r18, int r19, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.layout.FlowResult breakDownItems(androidx.compose.p006ui.layout.MeasureScope r22, androidx.compose.foundation.layout.RowColumnMeasurementHelper r23, androidx.compose.foundation.layout.LayoutOrientation r24, androidx.compose.foundation.layout.OrientationIndependentConstraints r25, int r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.breakDownItems(androidx.compose.ui.layout.MeasureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.OrientationIndependentConstraints, int):androidx.compose.foundation.layout.FlowResult");
    }

    @Composable
    private static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i4, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-2013098357);
        if ((i6 & 1) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i6 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i5, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)");
        }
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5MainAxisColumnArrangement = mainAxisColumnArrangement(vertical, composer, i5 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontal);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i4);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(horizontal) | composer.changed(vertical) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m7295flowMeasurePolicy942rkJo(LayoutOrientation.Vertical, function5MainAxisColumnArrangement, vertical.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisColumnArrangement, i4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(Measurable measurable, LayoutOrientation orientation, int i4) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicHeight(i4) : measurable.minIntrinsicWidth(i4);
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: flowMeasurePolicy-942rkJo, reason: not valid java name */
    private static final MeasurePolicy m7295flowMeasurePolicy942rkJo(final LayoutOrientation layoutOrientation, final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, final float f4, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final Function4<? super Integer, ? super int[], ? super MeasureScope, ? super int[], Unit> function4, final int i4) {
        return new MeasurePolicy(function5, f4, sizeMode, crossAxisAlignment, i4, function4) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1
            final /* synthetic */ float $arrangementSpacing;
            final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
            final /* synthetic */ Function4<Integer, int[], MeasureScope, int[], Unit> $crossAxisArrangement;
            final /* synthetic */ SizeMode $crossAxisSize;
            final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> $mainAxisArrangement;
            final /* synthetic */ int $maxItemsInMainAxis;
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$mainAxisArrangement = function5;
                this.$arrangementSpacing = f4;
                this.$crossAxisSize = sizeMode;
                this.$crossAxisAlignment = crossAxisAlignment;
                this.$maxItemsInMainAxis = i4;
                this.$crossAxisArrangement = function4;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                this.maxMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i6));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i6));
                    }
                };
                this.maxCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i6));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i6));
                    }
                };
                this.minCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i6));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i6));
                    }
                };
                this.minMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i6));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i6));
                    }
                };
            }

            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
                return this.maxCrossAxisIntrinsicItemSize;
            }

            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
                return this.maxMainAxisIntrinsicItemSize;
            }

            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
                return this.minCrossAxisIntrinsicItemSize;
            }

            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
                return this.minMainAxisIntrinsicItemSize;
            }

            public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing)) : maxIntrinsicMainAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? maxIntrinsicMainAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing));
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo6928measure3p2s80s(final MeasureScope measure, List<? extends Measurable> measurables, long j4) {
                int crossAxisTotalSize;
                int mainAxisTotalSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$mainAxisArrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                final FlowResult flowResultBreakDownItems = FlowLayoutKt.breakDownItems(measure, rowColumnMeasurementHelper, this.$orientation, new OrientationIndependentConstraints(j4, this.$orientation, null), this.$maxItemsInMainAxis);
                int crossAxisTotalSize2 = flowResultBreakDownItems.getCrossAxisTotalSize();
                MutableVector<RowColumnMeasureHelperResult> items = flowResultBreakDownItems.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr[i5] = items.getContent()[i5].getCrossAxisSize();
                }
                final int[] iArr2 = new int[size];
                this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize2), iArr, measure, iArr2);
                if (this.$orientation == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                } else {
                    crossAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                }
                return MeasureScope.CC.m634p(measure, ConstraintsKt.m11507constrainWidthK40F9xA(j4, crossAxisTotalSize), ConstraintsKt.m11506constrainHeightK40F9xA(j4, mainAxisTotalSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$measure$1
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
                    public final void invoke2(Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        MutableVector<RowColumnMeasureHelperResult> items2 = flowResultBreakDownItems.getItems();
                        RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                        int[] iArr3 = iArr2;
                        MeasureScope measureScope = measure;
                        int size2 = items2.getSize();
                        if (size2 > 0) {
                            RowColumnMeasureHelperResult[] content = items2.getContent();
                            int i6 = 0;
                            do {
                                rowColumnMeasurementHelper2.placeHelper(layout, content[i6], iArr3[i6], measureScope.getLayoutDirection());
                                i6++;
                            } while (i6 < size2);
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing)) : minIntrinsicMainAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i5) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? minIntrinsicMainAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(measurables, i5, intrinsicMeasureScope.mo7200roundToPx0680j_4(this.$arrangementSpacing));
            }
        };
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i4, int i5, int i6) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicCrossAxisSize, int i7, int i8) {
                Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr[i7]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicCrossAxisSize, int i7, int i8) {
                Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr2[i7]);
            }
        }, i4, i5, i6);
    }

    @Composable
    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisColumnArrangement(final Arrangement.Vertical vertical, Composer composer, int i4) {
        composer.startReplaceableGroup(-1642644113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1642644113, i4, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function5<Integer, int[], LayoutDirection, Density, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisColumnArrangement$1$1
                {
                    super(5);
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    invoke(num.intValue(), iArr, layoutDirection, density, iArr2);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i5, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
                    Intrinsics.checkNotNullParameter(density, "density");
                    Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                    vertical.arrange(density, i5, size, outPosition);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation orientation, int i4) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicWidth(i4) : measurable.minIntrinsicHeight(i4);
    }

    @Composable
    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisRowArrangement(final Arrangement.Horizontal horizontal, Composer composer, int i4) {
        composer.startReplaceableGroup(746410833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(746410833, i4, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function5<Integer, int[], LayoutDirection, Density, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisRowArrangement$1$1
                {
                    super(5);
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    invoke(num.intValue(), iArr, layoutDirection, density, iArr2);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i5, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                    Intrinsics.checkNotNullParameter(density, "density");
                    Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                    horizontal.arrange(density, i5, size, layoutDirection, outPosition);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i4, int i5, int i6) {
        int size = list.size();
        int i7 = 0;
        int iMax = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < size) {
            int iIntValue = function3.invoke(list.get(i7), Integer.valueOf(i7), Integer.valueOf(i4)).intValue() + i5;
            int i10 = i7 + 1;
            if (i10 - i8 == i6 || i10 == list.size()) {
                iMax = Math.max(iMax, i9 + iIntValue);
                i9 = 0;
                i8 = i7;
            } else {
                i9 += iIntValue;
            }
            i7 = i10;
        }
        return iMax;
    }

    private static final int measureAndCache(Measurable measurable, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation, Function1<? super Placeable, Unit> function1) {
        if (!(RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f)) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, 0, 0, 0, 14, null).m7308toBoxConstraintsOenEA2s(layoutOrientation));
        function1.invoke(placeableMo10585measureBRTryo0);
        return mainAxisSize(placeableMo10585measureBRTryo0, layoutOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i4, int i5, int i6) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            iArr2[i8] = 0;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i9);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(i4)).intValue();
            iArr[i9] = iIntValue;
            iArr2[i9] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(iIntValue)).intValue();
        }
        int iSum = ArraysKt___ArraysKt.sum(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iIntrinsicCrossAxisSize = iArr2[0];
        ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i10 = iArr2[it.nextInt()];
            if (iIntrinsicCrossAxisSize < i10) {
                iIntrinsicCrossAxisSize = i10;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr[0];
        ?? it2 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i12 = iArr[it2.nextInt()];
            if (i11 < i12) {
                i11 = i12;
            }
        }
        int i13 = iSum;
        while (i11 < iSum) {
            if (iIntrinsicCrossAxisSize == i4) {
                return i13;
            }
            i13 = (i11 + iSum) / 2;
            iIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, i13, i5, i6);
            if (iIntrinsicCrossAxisSize == i4) {
                return i13;
            }
            if (iIntrinsicCrossAxisSize > i4) {
                i11 = i13 + 1;
            } else {
                iSum = i13 - 1;
            }
        }
        return i13;
    }

    @Composable
    private static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i4, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1479255111);
        if ((i6 & 1) != 0) {
            horizontal = Arrangement.INSTANCE.getEnd();
        }
        if ((i6 & 2) != 0) {
            vertical = Alignment.INSTANCE.getTop();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i5, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)");
        }
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5MainAxisRowArrangement = mainAxisRowArrangement(horizontal, composer, i5 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i4);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(vertical) | composer.changed(horizontal) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m7295flowMeasurePolicy942rkJo(LayoutOrientation.Horizontal, function5MainAxisRowArrangement, horizontal.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisRowArrangement, i4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i4, int i5, int i6) {
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        int iIntValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i4)).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int size = list.size();
        int i7 = i4;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < size) {
            list.get(i8);
            Intrinsics.checkNotNull(orNull);
            i7 -= iIntValue2;
            int iMax = Math.max(i10, iIntValue);
            i8++;
            Object orNull2 = CollectionsKt___CollectionsKt.getOrNull(list, i8);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) orNull2;
            int iIntValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i8), Integer.valueOf(i4)).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i8), Integer.valueOf(iIntValue3)).intValue() + i5 : 0;
            if (i7 >= 0 && i8 != list.size()) {
                if (i8 - i11 == i6 || i7 - iIntValue4 < 0) {
                }
                int i12 = iIntValue3;
                i10 = iMax;
                orNull = orNull2;
                iIntValue2 = iIntValue4;
                iIntValue = i12;
            }
            i9 += iMax;
            iIntValue4 -= i5;
            i7 = i4;
            iMax = 0;
            i11 = i8;
            int i122 = iIntValue3;
            i10 = iMax;
            orNull = orNull2;
            iIntValue2 = iIntValue4;
            iIntValue = i122;
        }
        return i9;
    }
}
