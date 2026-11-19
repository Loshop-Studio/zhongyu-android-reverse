package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p012ui.graphics.GraphicsContext;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0082\b\u001aK\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010$\u001a\u001d\u0010%\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00142\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0003H\u0002\u001a7\u0010*\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010+\u001a\u00020\u00012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010-\u001a\u00020\u0003*\u00020\u00142\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0002\u001a+\u00100\u001a\u00020\u0005*\u0002012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\f\u00104\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00105\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00106\u001a\u0016\u00107\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00108\u001a\u00020\u0003H\u0000\u001aG\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u00020\u00142\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050=H\u0082\b\u001a\u001e\u0010>\u001a\u00020\u0003*\u00020 2\u0006\u0010?\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a,\u0010B\u001a\u00020C*\u00020\u00142\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020\u0001H\u0002\u001a¦\u0001\u0010H\u001a\u00020C*\u00020\f2\u0006\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\b\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020`H\u0000ø\u0001\u0000¢\u0006\u0004\ba\u0010b\u001a\u0014\u0010c\u001a\u00020\u0005*\u00020 2\u0006\u0010d\u001a\u00020\u0003H\u0002\u001a!\u0010e\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, m13413d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", RequestParameters.POSITION, "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "minOffset", "maxOffset", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "itemsRetainedForLookahead", "lastVisibleItemIndex", "itemsCount", "isLookingAhead", "Lkotlin/Function2;", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isInLookaheadScope", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-C6celF4", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 7 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1475:1\n63#1,9:1477\n84#1,4:1492\n1139#1:1509\n1140#1,3:1514\n84#1,4:1517\n84#1,4:1521\n84#1,4:1525\n1139#1:1536\n1140#1,3:1541\n84#1,4:1552\n84#1,4:1556\n1139#1:1577\n1140#1,3:1582\n84#1,4:1587\n84#1,4:1593\n84#1,4:1597\n1139#1:1618\n1140#1,3:1623\n84#1,4:1626\n84#1,4:1630\n1197#1,4:1636\n84#1,4:1640\n84#1,4:1644\n84#1,4:1648\n1103#1,3:1652\n1121#1:1655\n1106#1:1660\n1107#1,9:1663\n1122#1:1679\n1117#1:1680\n84#1,4:1681\n1050#1,25:1685\n1075#1,4:1719\n1079#1:1732\n1076#1,9:1733\n1089#1,7:1743\n1103#1,3:1750\n1121#1:1753\n1106#1:1758\n1107#1,9:1770\n1122#1:1794\n1117#1:1795\n84#1,4:1796\n84#1,4:1800\n62#1:1820\n73#1:1821\n1170#1,11:1825\n1139#1:1836\n1140#1,3:1841\n1121#1:1862\n1122#1:1875\n1139#1:1904\n1140#1,3:1909\n26#2:1476\n26#2:1634\n26#2:1635\n54#3:1486\n59#3:1488\n54#3:1804\n59#3:1806\n85#4:1487\n90#4:1489\n80#4:1491\n90#4:1500\n85#4:1502\n90#4:1506\n85#4:1508\n85#4:1511\n90#4:1513\n90#4:1533\n85#4:1535\n85#4:1538\n90#4:1540\n85#4:1545\n90#4:1549\n85#4:1551\n90#4:1568\n85#4:1570\n90#4:1574\n85#4:1576\n85#4:1579\n90#4:1581\n85#4:1586\n90#4:1609\n85#4:1611\n90#4:1615\n85#4:1617\n85#4:1620\n90#4:1622\n85#4:1805\n90#4:1807\n80#4:1819\n85#4:1838\n90#4:1840\n85#4:1901\n90#4:1903\n85#4:1906\n90#4:1908\n30#5:1490\n30#5:1818\n264#6:1496\n261#6:1497\n261#6:1503\n264#6:1529\n261#6:1530\n261#6:1546\n264#6:1564\n261#6:1565\n261#6:1571\n264#6:1605\n261#6:1606\n261#6:1612\n1135#7:1498\n1132#7:1499\n1129#7:1501\n1135#7:1504\n1132#7:1505\n1129#7:1507\n1129#7:1510\n1132#7:1512\n1135#7:1531\n1132#7:1532\n1129#7:1534\n1129#7:1537\n1132#7:1539\n1129#7:1544\n1135#7:1547\n1132#7:1548\n1129#7:1550\n1135#7:1566\n1132#7:1567\n1129#7:1569\n1135#7:1572\n1132#7:1573\n1129#7:1575\n1129#7:1578\n1132#7:1580\n1129#7:1585\n1135#7:1607\n1132#7:1608\n1129#7:1610\n1135#7:1613\n1132#7:1614\n1129#7:1616\n1129#7:1619\n1132#7:1621\n1129#7:1837\n1132#7:1839\n1129#7:1900\n1132#7:1902\n1129#7:1905\n1132#7:1907\n12504#8,2:1560\n12271#8,2:1562\n12504#8,2:1591\n12313#8,2:1601\n12504#8,2:1603\n12271#8,2:1661\n12313#8,2:1768\n12504#8,2:1814\n12313#8,2:1816\n12474#8,2:1823\n52#9,4:1656\n57#9:1672\n34#9,6:1673\n102#9,2:1710\n34#9,6:1712\n104#9:1718\n117#9,2:1723\n34#9,6:1725\n119#9:1731\n52#9,4:1754\n102#9,2:1759\n34#9,6:1761\n104#9:1767\n57#9:1779\n34#9,4:1780\n102#9,2:1784\n34#9,6:1786\n104#9:1792\n39#9:1793\n34#9,6:1808\n102#9,2:1844\n34#9,6:1846\n104#9:1852\n117#9,2:1853\n34#9,6:1855\n119#9:1861\n52#9,6:1863\n34#9,6:1869\n52#9,6:1876\n34#9,6:1882\n52#9,6:1888\n34#9,6:1894\n1#10:1742\n1#10:1822\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n274#1:1477,9\n366#1:1492,4\n409#1:1509\n409#1:1514,3\n421#1:1517,4\n462#1:1521,4\n496#1:1525,4\n521#1:1536\n521#1:1541,3\n545#1:1552,4\n546#1:1556,4\n579#1:1577\n579#1:1582,3\n600#1:1587,4\n621#1:1593,4\n622#1:1597,4\n689#1:1618\n689#1:1623,3\n727#1:1626,4\n728#1:1630,4\n755#1:1636,4\n759#1:1640,4\n782#1:1644,4\n813#1:1648,4\n817#1:1652,3\n817#1:1655\n817#1:1660\n817#1:1663,9\n817#1:1679\n817#1:1680\n845#1:1681,4\n861#1:1685,25\n861#1:1719,4\n861#1:1732\n861#1:1733,9\n861#1:1743,7\n875#1:1750,3\n875#1:1753\n875#1:1758\n875#1:1770,9\n875#1:1794\n875#1:1795\n906#1:1796,4\n918#1:1800,4\n274#1:1820\n274#1:1821\n1010#1:1825,11\n1032#1:1836\n1032#1:1841,3\n1105#1:1862\n1105#1:1875\n1152#1:1904\n1152#1:1909,3\n185#1:1476\n739#1:1634\n740#1:1635\n300#1:1486\n301#1:1488\n942#1:1804\n944#1:1806\n300#1:1487\n301#1:1489\n314#1:1491\n403#1:1500\n403#1:1502\n408#1:1506\n408#1:1508\n409#1:1511\n409#1:1513\n519#1:1533\n519#1:1535\n521#1:1538\n521#1:1540\n529#1:1545\n538#1:1549\n538#1:1551\n569#1:1568\n569#1:1570\n574#1:1574\n574#1:1576\n579#1:1579\n579#1:1581\n591#1:1586\n683#1:1609\n683#1:1611\n688#1:1615\n688#1:1617\n689#1:1620\n689#1:1622\n942#1:1805\n944#1:1807\n986#1:1819\n1032#1:1838\n1032#1:1840\n1139#1:1901\n1139#1:1903\n1152#1:1906\n1152#1:1908\n314#1:1490\n986#1:1818\n403#1:1496\n403#1:1497\n408#1:1503\n519#1:1529\n519#1:1530\n538#1:1546\n569#1:1564\n569#1:1565\n574#1:1571\n683#1:1605\n683#1:1606\n688#1:1612\n403#1:1498\n403#1:1499\n403#1:1501\n408#1:1504\n408#1:1505\n408#1:1507\n409#1:1510\n409#1:1512\n519#1:1531\n519#1:1532\n519#1:1534\n521#1:1537\n521#1:1539\n529#1:1544\n538#1:1547\n538#1:1548\n538#1:1550\n569#1:1566\n569#1:1567\n569#1:1569\n574#1:1572\n574#1:1573\n574#1:1575\n579#1:1578\n579#1:1580\n591#1:1585\n683#1:1607\n683#1:1608\n683#1:1610\n688#1:1613\n688#1:1614\n688#1:1616\n689#1:1619\n689#1:1621\n1032#1:1837\n1032#1:1839\n1139#1:1900\n1139#1:1902\n1152#1:1905\n1152#1:1907\n555#1:1560,2\n557#1:1562,2\n617#1:1591,2\n630#1:1601,2\n637#1:1603,2\n831#1:1661,2\n896#1:1768,2\n956#1:1814,2\n957#1:1816,2\n1008#1:1823,2\n817#1:1656,4\n817#1:1672\n817#1:1673,6\n861#1:1710,2\n861#1:1712,6\n861#1:1718\n861#1:1723,2\n861#1:1725,6\n861#1:1731\n875#1:1754,4\n889#1:1759,2\n889#1:1761,6\n889#1:1767\n875#1:1779\n875#1:1780,4\n889#1:1784,2\n889#1:1786,6\n889#1:1792\n875#1:1793\n947#1:1808,6\n1074#1:1844,2\n1074#1:1846,6\n1074#1:1852\n1078#1:1853,2\n1078#1:1855,6\n1078#1:1861\n1105#1:1863,6\n1105#1:1869,6\n1121#1:1876,6\n1121#1:1882,6\n1121#1:1888,6\n1121#1:1894,6\n861#1:1742\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z9) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z9) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i9 = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM18327getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m18327getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m18336getAndMeasurejy6DScQ(iIntValue, jM18327getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ);
                    }
                    if (i9 < 0) {
                        break;
                    }
                    size = i9;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int iIntValue2 = pinnedItems.get(i10).intValue();
                if (function12.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM18327getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m18327getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m18336getAndMeasurejy6DScQ(iIntValue2, jM18327getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM18336getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i9, int i10, int i11) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i12 = -1;
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < length; i14++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i14].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i13 > index) {
                            i12 = i14;
                            i13 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i12].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i12) {
                        long jM18342constructorimpl = SpanRange.m18342constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM18331maxInRangejy6DScQ = m18331maxInRangejy6DScQ(iArr, jM18342constructorimpl);
                        int i15 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i12];
                        if (lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSize() + iM18331maxInRangejy6DScQ >= i10 && iM18331maxInRangejy6DScQ <= i11) {
                            lazyStaggeredGridMeasuredItemRemoveFirst.position(iM18331maxInRangejy6DScQ, i15, i9);
                            arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        }
                        int i16 = (int) (jM18342constructorimpl & 4294967295L);
                        for (int i17 = (int) (jM18342constructorimpl >> 32); i17 < i16; i17++) {
                            iArr[i17] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM18331maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i9) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            while (true) {
                if (iArr[length] < i9 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z9, Function1<? super T, Unit> function1) {
        if (!z9) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                function1.invoke(list.get(i9));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i10 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i10 < 0) {
                return;
            } else {
                size2 = i10;
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z9, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        if (!z9) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                function1.invoke(list.get(i10));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i9, int i10) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i9, i10);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m18330forEachnIS5qE8(long j9, Function1<? super Integer, Unit> function1) {
        int i9 = (int) (j9 & 4294967295L);
        for (int i10 = (int) (j9 >> 32); i10 < i9; i10++) {
            function1.invoke(Integer.valueOf(i10));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i9 = -1;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i10 < i12) {
                i9 = i11;
                i10 = i12;
            }
        }
        return i9;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i9 = -1;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < length; i11++) {
            int iIntValue = function1.invoke(tArr[i11]).intValue();
            if (i10 > iIntValue) {
                i9 = i11;
                i10 = iIntValue;
            }
        }
        return i9;
    }

    public static final int indexOfMinValue(int[] iArr, int i9) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i9 + 1;
            int i14 = iArr[i12];
            if (i13 <= i14 && i14 < i11) {
                i10 = i12;
                i11 = i14;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r7, int r8, int r9, boolean r10, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem, ? super java.lang.Integer, kotlin.Unit> r11) {
        /*
            r0 = 0
            if (r10 == 0) goto Le9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            if (r10 == 0) goto Le9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Le9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            int r1 = r10.size()
            int r1 = r1 + (-1)
        L25:
            r2 = -1
            if (r2 >= r1) goto L4e
            java.lang.Object r2 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r8) goto L4b
            if (r1 == 0) goto L44
            int r2 = r1 + (-1)
            java.lang.Object r2 = r10.get(r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r8) goto L4b
        L44:
            java.lang.Object r8 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r8
            goto L4f
        L4b:
            int r1 = r1 + (-1)
            goto L25
        L4e:
            r8 = r0
        L4f:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            java.lang.Object r10 = kotlin.collections.CollectionsKt.last(r10)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r10
            if (r8 == 0) goto Le9
            int r8 = r8.getIndex()
            int r10 = r10.getIndex()
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.min(r10, r9)
            if (r8 > r9) goto Le9
            r10 = r0
        L70:
            r1 = 0
            if (r10 == 0) goto L8a
            int r2 = r10.size()
            r3 = r1
        L78:
            if (r3 >= r2) goto L8a
            java.lang.Object r4 = r10.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r4
            int r4 = r4.getIndex()
            if (r4 != r8) goto L87
            goto Le3
        L87:
            int r3 = r3 + 1
            goto L78
        L8a:
            if (r10 != 0) goto L91
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L91:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r2 = r7.getApproachLayoutInfo()
            java.util.List r2 = r2.getVisibleItemsInfo()
            int r3 = r2.size()
            r4 = r1
        L9e:
            if (r4 >= r3) goto Lb1
            java.lang.Object r5 = r2.get(r4)
            r6 = r5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r6
            int r6 = r6.getIndex()
            if (r6 != r8) goto Lae
            goto Lb2
        Lae:
            int r4 = r4 + 1
            goto L9e
        Lb1:
            r5 = r0
        Lb2:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r5
            if (r5 == 0) goto Lbb
            int r2 = r5.getLane()
            goto Lbc
        Lbb:
            r2 = r1
        Lbc:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r7.getItemProvider()
            long r3 = r7.m18327getSpanRangelOCCd4c(r3, r8, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r7.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r5.m18336getAndMeasurejy6DScQ(r8, r3)
            r10.add(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r4 = r7.getResolvedSlots()
            int[] r4 = r4.getPositions()
            int r5 = r4.length
            if (r5 <= r2) goto Ldc
            r1 = r4[r2]
        Ldc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r3, r1)
        Le3:
            if (r8 == r9) goto Le8
            int r8 = r8 + 1
            goto L70
        Le8:
            return r10
        Le9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int, boolean, kotlin.jvm.functions.Function2):java.util.List");
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m18331maxInRangejy6DScQ(int[] iArr, long j9) {
        int i9 = (int) (j9 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i10 = (int) (j9 >> 32); i10 < i9; i10++) {
            iMax = Math.max(iMax, iArr[i10]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f5, code lost:
    
        r4 = indexOfMinValue$default(r7, 0, 1, null);
        r6 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0300, code lost:
    
        if (r4 == r6) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0306, code lost:
    
        if (r7[r4] != r7[r6]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0308, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030b, code lost:
    
        r6 = r28[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030e, code lost:
    
        if (r6 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0310, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0311, code lost:
    
        r6 = findPreviousItemIndex(r0, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0315, code lost:
    
        if (r6 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0317, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0319, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
    
        if (measure$lambda$43$misalignedStart(r8, r0, r7, r4) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0321, code lost:
    
        if (r49 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0323, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032e, code lost:
    
        if (r3 >= r1) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0330, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0337, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033b, code lost:
    
        if (r5 >= r1) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033d, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034b, code lost:
    
        return measure(r0, r29, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0354, code lost:
    
        r8 = r28;
        r11 = r29;
        r25 = r14;
        r13 = r0.m18327getSpanRangelOCCd4c(r0.getItemProvider(), r6, r4);
        r4 = r0.getLaneInfo();
        r15 = r1;
        r46 = r2;
        r1 = (int) (r13 & 4294967295L);
        r27 = r3;
        r2 = (int) (r13 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0376, code lost:
    
        if (r3 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0378, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037a, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037c, code lost:
    
        r4.setLane(r6, r2);
        r2 = r0.getMeasuredItemProvider().m18336getAndMeasurejy6DScQ(r6, r13);
        r4 = m18331maxInRangejy6DScQ(r7, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x038c, code lost:
    
        if (r3 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038e, code lost:
    
        r3 = r0.getLaneInfo().getGaps(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0397, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0398, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039a, code lost:
    
        if (r14 >= r1) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039e, code lost:
    
        if (r7[r14] == r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a0, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a1, code lost:
    
        r48[r14].addFirst(r2);
        r8[r14] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a8, code lost:
    
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03aa, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03ac, code lost:
    
        r13 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ae, code lost:
    
        r7[r14] = (r4 + r2.getMainAxisSizeWithSpacings()) + r13;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x072a A[LOOP:21: B:312:0x0673->B:353:0x072a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0745 A[EDGE_INSN: B:543:0x0745->B:357:0x0745 BREAK  A[LOOP:21: B:312:0x0673->B:353:0x072a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x08d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r45, int r46, int[] r47, int[] r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 2781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$43$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iArr[i9];
            if (iArr2[i9] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i10 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$43$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i9) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i10], i10) == -1 && iArr2[i10] != iArr2[i9]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i11], i11) != -1 && iArr2[i11] >= iArr2[i9]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m18332measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j9, boolean z9, boolean z10, long j10, int i9, int i10, int i11, int i12, CoroutineScope coroutineScope, boolean z11, boolean z12, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int iM18331maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j9, z9, lazyLayoutMeasureScope, i9, j10, i11, i12, z10, i10, coroutineScope, z11, z12, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i13 = 0;
            while (i13 < laneCount) {
                if (i13 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM18331maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i13]) == -1) {
                    iM18331maxInRangejy6DScQ = i13 == 0 ? 0 : m18331maxInRangejy6DScQ(iArr, SpanRange.m18342constructorimpl(0, i13)) + 1;
                }
                iArr[i13] = iM18331maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i13], i13);
                i13++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i14 = 0;
            while (i14 < laneCount2) {
                iArr2[i14] = i14 < scrollOffsets.length ? scrollOffsets[i14] : i14 == 0 ? 0 : iArr2[i14 - 1];
                i14++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation_release(z12)), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i9) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = iArr[i10] + i9;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = function1.invoke(Integer.valueOf(iArr[i9])).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }
}
