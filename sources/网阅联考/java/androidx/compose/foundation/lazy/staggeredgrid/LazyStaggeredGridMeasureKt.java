package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0083\b¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\fH\u0083\b\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d0\u001cH\u0002¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\u00020\u0003*\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0016H\u0002\u001a\u001c\u0010'\u001a\u00020\u0016*\u00020\u00122\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0002\u001a.\u0010*\u001a\u00020\u0003*\u00020+2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\fH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\f\u0010.\u001a\u00020\u0016*\u00020\u001fH\u0002\u001a2\u0010/\u001a\u00020\u0016\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00160\fH\u0082\b¢\u0006\u0002\u00100\u001a\u0016\u00101\u001a\u00020\u0016*\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u0016H\u0000\u001a!\u00103\u001a\u00020\u0016*\u00020\u001f2\u0006\u00104\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a,\u00107\u001a\u000208*\u00020\u00122\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0001H\u0003\u001ay\u0010=\u001a\u000208*\u00020\n2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0016H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010Q\u001a\u00020\u0016H\u0002\u001a!\u0010R\u001a\u00020\u001f*\u00020\u001f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\fH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006S"}, m5175d2 = {"DebugLoggingEnabled", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "filter", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "calculatePositionedItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlotSums", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "crossAxisSpacing", "beforeContentPadding", "afterContentPadding", "measureStaggeredGrid-BTfHGGE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1097:1\n50#1,9:1108\n72#1,4:1117\n884#1:1134\n885#1,3:1139\n72#1,4:1142\n72#1,4:1146\n72#1,4:1150\n884#1:1161\n885#1,3:1166\n72#1,4:1177\n72#1,4:1181\n884#1:1202\n885#1,3:1207\n72#1,4:1212\n72#1,4:1218\n72#1,4:1222\n884#1:1243\n885#1,3:1248\n72#1,4:1251\n72#1,4:1255\n944#1,4:1259\n72#1,4:1263\n72#1,4:1267\n855#1,4:1271\n859#1,3:1279\n862#1,8:1284\n871#1:1293\n855#1,4:1294\n859#1,3:1302\n862#1,8:1307\n871#1:1316\n72#1,4:1317\n60#1:1325\n917#1,11:1329\n884#1:1340\n885#1,3:1345\n884#1:1358\n885#1,3:1363\n480#2,4:1098\n485#2:1107\n122#3,5:1102\n220#4:1121\n217#4:1122\n217#4:1128\n220#4:1154\n217#4:1155\n217#4:1171\n220#4:1189\n217#4:1190\n217#4:1196\n220#4:1230\n217#4:1231\n217#4:1237\n880#5:1123\n879#5:1124\n878#5:1126\n880#5:1129\n879#5:1130\n878#5:1132\n878#5:1135\n879#5:1137\n880#5:1156\n879#5:1157\n878#5:1159\n878#5:1162\n879#5:1164\n878#5:1169\n880#5:1172\n879#5:1173\n878#5:1175\n880#5:1191\n879#5:1192\n878#5:1194\n880#5:1197\n879#5:1198\n878#5:1200\n878#5:1203\n879#5:1205\n878#5:1210\n880#5:1232\n879#5:1233\n878#5:1235\n880#5:1238\n879#5:1239\n878#5:1241\n878#5:1244\n879#5:1246\n878#5:1341\n879#5:1343\n878#5:1354\n879#5:1356\n878#5:1359\n879#5:1361\n62#6:1125\n55#6:1127\n62#6:1131\n55#6:1133\n55#6:1136\n62#6:1138\n62#6:1158\n55#6:1160\n55#6:1163\n62#6:1165\n55#6:1170\n62#6:1174\n55#6:1176\n62#6:1193\n55#6:1195\n62#6:1199\n55#6:1201\n55#6:1204\n62#6:1206\n55#6:1211\n62#6:1234\n55#6:1236\n62#6:1240\n55#6:1242\n55#6:1245\n62#6:1247\n55#6:1342\n62#6:1344\n55#6:1355\n62#6:1357\n55#6:1360\n62#6:1362\n12774#7,2:1185\n12541#7,2:1187\n12774#7,2:1216\n12583#7,2:1226\n12774#7,2:1228\n12583#7,2:1282\n12583#7,2:1305\n12774#7,2:1321\n12583#7,2:1323\n12744#7,2:1327\n33#8,4:1275\n38#8:1292\n33#8,4:1298\n38#8:1315\n33#8,6:1348\n1#9:1326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n230#1:1108,9\n288#1:1117,4\n333#1:1134\n333#1:1139,3\n339#1:1142,4\n381#1:1146,4\n419#1:1150,4\n447#1:1161\n447#1:1166,3\n464#1:1177,4\n467#1:1181,4\n500#1:1202\n500#1:1207,3\n518#1:1212,4\n540#1:1218,4\n543#1:1222,4\n607#1:1243\n607#1:1248,3\n645#1:1251,4\n648#1:1255,4\n665#1:1259,4\n669#1:1263,4\n692#1:1267,4\n716#1:1271,4\n716#1:1279,3\n716#1:1284,8\n716#1:1293\n741#1:1294,4\n741#1:1302,3\n741#1:1307,8\n741#1:1316\n763#1:1317,4\n230#1:1325\n818#1:1329,11\n843#1:1340\n843#1:1345,3\n897#1:1358\n897#1:1363,3\n111#1:1098,4\n111#1:1107\n111#1:1102,5\n325#1:1121\n325#1:1122\n332#1:1128\n445#1:1154\n445#1:1155\n457#1:1171\n491#1:1189\n491#1:1190\n495#1:1196\n599#1:1230\n599#1:1231\n606#1:1237\n325#1:1123\n325#1:1124\n325#1:1126\n332#1:1129\n332#1:1130\n332#1:1132\n333#1:1135\n333#1:1137\n445#1:1156\n445#1:1157\n445#1:1159\n447#1:1162\n447#1:1164\n453#1:1169\n457#1:1172\n457#1:1173\n457#1:1175\n491#1:1191\n491#1:1192\n491#1:1194\n495#1:1197\n495#1:1198\n495#1:1200\n500#1:1203\n500#1:1205\n510#1:1210\n599#1:1232\n599#1:1233\n599#1:1235\n606#1:1238\n606#1:1239\n606#1:1241\n607#1:1244\n607#1:1246\n843#1:1341\n843#1:1343\n884#1:1354\n884#1:1356\n897#1:1359\n897#1:1361\n325#1:1125\n325#1:1127\n332#1:1131\n332#1:1133\n333#1:1136\n333#1:1138\n445#1:1158\n445#1:1160\n447#1:1163\n447#1:1165\n453#1:1170\n457#1:1174\n457#1:1176\n491#1:1193\n491#1:1195\n495#1:1199\n495#1:1201\n500#1:1204\n500#1:1206\n510#1:1211\n599#1:1234\n599#1:1236\n606#1:1240\n606#1:1242\n607#1:1245\n607#1:1247\n843#1:1342\n843#1:1344\n884#1:1355\n884#1:1357\n897#1:1360\n897#1:1362\n476#1:1185,2\n479#1:1187,2\n536#1:1216,2\n550#1:1226,2\n558#1:1228,2\n725#1:1282,2\n754#1:1305,2\n772#1:1321,2\n773#1:1323,2\n816#1:1327,2\n716#1:1275,4\n716#1:1292\n741#1:1298,4\n741#1:1315\n858#1:1348,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridPositionedItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, LazyStaggeredGridPositionedItem> function1, Function1<? super Integer, Boolean> function12) {
        LazyLayoutPinnedItemList pinnedItems = lazyStaggeredGridMeasureContext.getState().getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItems.get(i4);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyStaggeredGridMeasureContext.getItemProvider(), pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(iFindIndexByKey)).booleanValue()) {
                long jM7532getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m7532getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindIndexByKey, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m7540getAndMeasurejy6DScQ(iFindIndexByKey, jM7532getSpanRangelOCCd4c)));
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyStaggeredGridPositionedItem> calculatePositionedItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i4) {
        boolean z3;
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            int length = arrayDequeArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z3 = false;
                    break;
                }
                z3 = true;
                if (!arrayDequeArr[i5].isEmpty()) {
                    break;
                }
                i5++;
            }
            if (!z3) {
                return arrayList;
            }
            int length2 = arrayDequeArr.length;
            int i6 = -1;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < length2; i8++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i8].firstOrNull();
                int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                if (i7 > index) {
                    i6 = i8;
                    i7 = index;
                }
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i6].removeFirst();
            if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i6) {
                long jM7543constructorimpl = SpanRange.m7543constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                int iM7535maxInRangejy6DScQ = m7535maxInRangejy6DScQ(iArr, jM7543constructorimpl);
                int crossAxisSpacing = i6 == 0 ? 0 : lazyStaggeredGridMeasureContext.getResolvedSlotSums()[i6 - 1] + (lazyStaggeredGridMeasureContext.getCrossAxisSpacing() * i6);
                if (!lazyStaggeredGridMeasuredItemRemoveFirst.getPlaceables().isEmpty()) {
                    arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst.position(i6, iM7535maxInRangejy6DScQ, crossAxisSpacing, i4));
                    int i9 = (int) (jM7543constructorimpl & 4294967295L);
                    for (int i10 = (int) (jM7543constructorimpl >> 32); i10 < i9; i10++) {
                        iArr[i10] = lazyStaggeredGridMeasuredItemRemoveFirst.getSizeWithSpacings() + iM7535maxInRangejy6DScQ;
                    }
                }
            }
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i4) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            while (true) {
                if (iArr[length] < i4 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i4, int i5) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i4, i5);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m7534forEachnIS5qE8(long j4, Function1<? super Integer, Unit> function1) {
        int i4 = (int) (j4 & 4294967295L);
        for (int i5 = (int) (j4 >> 32); i5 < i4; i5++) {
            function1.invoke(Integer.valueOf(i5));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i4 = -1;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i5 < i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        return i4;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < length; i6++) {
            int iIntValue = function1.invoke(tArr[i6]).intValue();
            if (i5 > iIntValue) {
                i4 = i6;
                i5 = iIntValue;
            }
        }
        return i4;
    }

    public static final int indexOfMinValue(int[] iArr, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i4 + 1;
            int i9 = iArr[i7];
            if (i8 <= i9 && i9 < i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        return i5;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i4);
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m7535maxInRangejy6DScQ(int[] iArr, long j4) {
        int i4 = (int) (j4 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i5 = (int) (j4 >> 32); i5 < i4; i5++) {
            iMax = Math.max(iMax, iArr[i5]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x060f, code lost:
    
        if (r3[r11] < r10) goto L316;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06aa  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r30, int r31, int[] r32, int[] r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$37$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (iArr2[i4] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i5 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$37$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i4) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i5], i5) == -1 && iArr2[i5] != iArr2[i4]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i6], i6) != -1 && iArr2[i6] >= iArr2[i4]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalFoundationApi
    /* renamed from: measureStaggeredGrid-BTfHGGE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m7536measureStaggeredGridBTfHGGE(LazyLayoutMeasureScope measureStaggeredGrid, LazyStaggeredGridState state, LazyStaggeredGridItemProvider itemProvider, int[] resolvedSlotSums, long j4, boolean z3, boolean z4, long j5, int i4, int i5, int i6, int i7, int i8) {
        T t3;
        int iM7535maxInRangejy6DScQ;
        T t4;
        Intrinsics.checkNotNullParameter(measureStaggeredGrid, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlotSums, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, itemProvider, resolvedSlotSums, j4, z3, measureStaggeredGrid, i4, j5, i7, i8, z4, i5, i6, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] indices = state.getScrollPosition().getIndices();
                int[] offsets = state.getScrollPosition().getOffsets();
                if (indices.length == resolvedSlotSums.length) {
                    t3 = indices;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int length = resolvedSlotSums.length;
                    int[] iArr = new int[length];
                    int i9 = 0;
                    while (i9 < length) {
                        if (i9 >= indices.length || (iM7535maxInRangejy6DScQ = indices[i9]) == -1) {
                            iM7535maxInRangejy6DScQ = i9 == 0 ? 0 : m7535maxInRangejy6DScQ(iArr, SpanRange.m7543constructorimpl(0, i9)) + 1;
                        }
                        iArr[i9] = iM7535maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i9], i9);
                        i9++;
                    }
                    t3 = iArr;
                }
                objectRef.element = t3;
                if (offsets.length == resolvedSlotSums.length) {
                    t4 = offsets;
                } else {
                    int length2 = resolvedSlotSums.length;
                    int[] iArr2 = new int[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        iArr2[i10] = i10 < offsets.length ? offsets[i10] : i10 == 0 ? 0 : iArr2[i10 - 1];
                        i10++;
                    }
                    t4 = iArr2;
                }
                objectRef2.element = t4;
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, MathKt__MathJVMKt.roundToInt(state.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } catch (Throwable th) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th;
        }
    }

    private static final void offsetBy(int[] iArr, int i4) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = iArr[i5] + i4;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = function1.invoke(Integer.valueOf(iArr[i4])).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }
}
