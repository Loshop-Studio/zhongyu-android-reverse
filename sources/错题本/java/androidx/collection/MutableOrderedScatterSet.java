package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0010\u0010\u0013J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0010\u0010\u0016J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0010\u0010\u0018J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0010\u0010\u001aJ \u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b\f\u0010\u001bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b\f\u0010\u001cJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b\f\u0010\u001dJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\f\u0010\u001eJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002¢\u0006\u0004\b\f\u0010\u001fJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b\f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\nJ\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\rJ\u001d\u0010#\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0004\b#\u0010\u0011J\u001b\u0010#\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b#\u0010\u0015J\u001b\u0010#\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010#\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b#\u0010\u0016J\u001b\u0010#\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b#\u0010\u0018J\u001b\u0010#\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b#\u0010\u001aJ \u0010\"\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001dJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b\"\u0010 J'\u0010&\u001a\u00020\u000b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0$H\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b)\u0010*J\u001b\u0010)\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b)\u0010\u0016J\u001b\u0010)\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b)\u0010\u0018J'\u0010)\u001a\u00020\b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0$H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010+J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0003H\u0001¢\u0006\u0004\b-\u0010\u0006J\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u0010\u0006J\u000f\u00105\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u0010/J\u000f\u00107\u001a\u00020\u000bH\u0000¢\u0006\u0004\b6\u0010/J\u0017\u0010:\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u0003H\u0000¢\u0006\u0004\b9\u0010\u0006J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010\u0006J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u000bH\u0002¢\u0006\u0004\bA\u0010/J\u0018\u0010B\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\bB\u0010\u0006J\u0018\u0010C\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\bC\u0010\u0006J\u0017\u0010D\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020MH\u0002¢\u0006\u0004\bK\u0010NR\u0016\u0010O\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Q"}, m5110d2 = {"Landroidx/collection/MutableOrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "Ld6/s;", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "Lz6/h;", "(Lz6/h;)Z", "(Landroidx/collection/OrderedScatterSet;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)Z", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Lz6/h;)V", "(Landroidx/collection/OrderedScatterSet;)V", "(Landroidx/collection/ScatterSet;)V", "(Landroidx/collection/ObjectList;)V", "remove", "minusAssign", "removeAll", "Lkotlin/Function1;", "predicate", "removeIf", "(Lr6/c;)V", "", "retainAll", "(Ljava/util/Collection;)Z", "(Lr6/c;)Z", "index", "removeElementAt", "clear", "()V", "trim", "()I", "maxSize", "trimToSize", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableSet", "()Ljava/util/Set;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "moveNodeToHead", "removeNode", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "growthLimit", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1511:1\n1033#1:1524\n1035#1,2:1526\n1038#1,6:1529\n1033#1:1535\n1035#1,2:1537\n1038#1,6:1540\n1046#1,3:1839\n1049#1:1843\n1051#1,2:1845\n1054#1,5:1848\n1060#1,5:1854\n59#2,5:1512\n1#3:1517\n1254#4,6:1518\n1399#4:1574\n1270#4:1578\n1165#4,3:1596\n1179#4:1600\n1175#4:1603\n1372#4,3:1607\n1386#4,3:1611\n1312#4:1615\n1303#4:1617\n1297#4:1618\n1309#4:1623\n1393#4:1625\n1165#4,3:1635\n1179#4:1639\n1175#4:1642\n1372#4,3:1646\n1386#4,3:1650\n1312#4:1654\n1303#4:1656\n1297#4:1657\n1309#4:1662\n1393#4:1664\n1399#4:1701\n1270#4:1705\n1399#4:1729\n1270#4:1733\n1399#4:1750\n1270#4:1754\n1399#4:1771\n1270#4:1775\n1399#4:1792\n1270#4:1796\n1399#4:1813\n1270#4:1817\n1230#4:1827\n1254#4,6:1828\n1242#4:1834\n1241#4,4:1835\n1254#4,6:1865\n1165#4,3:1871\n1175#4:1874\n1179#4:1875\n1372#4,3:1876\n1386#4,3:1879\n1312#4:1882\n1303#4:1883\n1297#4:1884\n1309#4:1885\n1393#4:1886\n1265#4:1887\n1220#4:1888\n1262#4:1889\n1220#4:1890\n1230#4:1891\n1254#4,6:1892\n1242#4:1898\n1241#4,4:1899\n1372#4,3:1903\n1399#4:1906\n1297#4:1907\n1144#4,14:1909\n1220#4:1923\n1165#4,3:1924\n1175#4:1927\n1179#4:1928\n1254#4,6:1929\n1220#4:1936\n1179#4:1937\n1254#4,6:1938\n1254#4,6:1944\n1179#4:1955\n1254#4,6:1956\n1268#4:1967\n1220#4:1968\n1165#4,3:1969\n1175#4:1972\n1179#4:1973\n1230#4:1974\n1254#4,6:1975\n1242#4:1981\n1241#4,4:1982\n1111#5:1525\n1114#5:1528\n1111#5:1536\n1114#5:1539\n1123#5:1559\n1123#5:1686\n1123#5:1842\n1127#5:1844\n1117#5:1847\n1114#5:1853\n1111#5:1859\n1114#5:1860\n1123#5:1861\n1127#5:1862\n1117#5:1863\n1114#5:1864\n1127#5:1908\n1132#5:1935\n1144#5:1950\n1138#5:1951\n1141#5:1952\n1132#5:1953\n1132#5:1954\n1144#5:1962\n1138#5:1963\n1135#5:1964\n1132#5:1965\n1132#5:1966\n1123#5:1986\n1127#5:1987\n1096#5,2:1988\n1147#5:1990\n1098#5,2:1991\n1147#5:1993\n1147#5:1994\n1147#5:1995\n1123#5:1996\n1127#5:1997\n1103#5,4:1998\n13309#6,2:1546\n13309#6,2:1673\n1855#7,2:1548\n1855#7,2:1677\n1313#8,2:1550\n1313#8,2:1675\n301#9,7:1552\n308#9,4:1560\n510#9:1595\n511#9:1599\n513#9,2:1601\n515#9,3:1604\n518#9:1610\n519#9:1614\n520#9:1616\n521#9,4:1619\n527#9:1624\n528#9,8:1626\n510#9:1634\n511#9:1638\n513#9,2:1640\n515#9,3:1643\n518#9:1649\n519#9:1653\n520#9:1655\n521#9,4:1658\n527#9:1663\n528#9,8:1665\n301#9,7:1679\n308#9,4:1687\n269#9,7:1722\n280#9,3:1730\n283#9,9:1734\n269#9,7:1743\n280#9,3:1751\n283#9,9:1755\n269#9,7:1764\n280#9,3:1772\n283#9,9:1776\n269#9,7:1785\n280#9,3:1793\n283#9,9:1797\n269#9,7:1806\n280#9,3:1814\n283#9,9:1818\n231#10,3:1564\n200#10,7:1567\n211#10,3:1575\n214#10,9:1579\n234#10:1588\n231#10,3:1691\n200#10,7:1694\n211#10,3:1702\n214#10,9:1706\n234#10:1715\n287#11,6:1589\n287#11,6:1716\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n*L\n635#1:1524\n635#1:1526,2\n635#1:1529,6\n647#1:1535\n647#1:1537,2\n647#1:1540,6\n1029#1:1839,3\n1029#1:1843\n1029#1:1845,2\n1029#1:1848,5\n1029#1:1854,5\n587#1:1512,5\n616#1:1518,6\n770#1:1574\n770#1:1578\n790#1:1596,3\n790#1:1600\n790#1:1603\n790#1:1607,3\n790#1:1611,3\n790#1:1615\n790#1:1617\n790#1:1618\n790#1:1623\n790#1:1625\n804#1:1635,3\n804#1:1639\n804#1:1642\n804#1:1646,3\n804#1:1650,3\n804#1:1654\n804#1:1656\n804#1:1657\n804#1:1662\n804#1:1664\n924#1:1701\n924#1:1705\n939#1:1729\n939#1:1733\n956#1:1750\n956#1:1754\n973#1:1771\n973#1:1775\n991#1:1792\n991#1:1796\n1011#1:1813\n1011#1:1817\n1026#1:1827\n1026#1:1828,6\n1026#1:1834\n1026#1:1835,4\n1071#1:1865,6\n1087#1:1871,3\n1088#1:1874\n1089#1:1875\n1096#1:1876,3\n1097#1:1879,3\n1098#1:1882\n1099#1:1883\n1099#1:1884\n1103#1:1885\n1106#1:1886\n1115#1:1887\n1115#1:1888\n1121#1:1889\n1121#1:1890\n1122#1:1891\n1122#1:1892,6\n1122#1:1898\n1122#1:1899,4\n1136#1:1903,3\n1137#1:1906\n1139#1:1907\n1250#1:1909,14\n1256#1:1923\n1270#1:1924,3\n1271#1:1927\n1282#1:1928\n1283#1:1929,6\n1297#1:1936\n1300#1:1937\n1301#1:1938,6\n1302#1:1944,6\n1321#1:1955\n1322#1:1956,6\n1377#1:1967\n1377#1:1968\n1379#1:1969,3\n1380#1:1972\n1382#1:1973\n1382#1:1974\n1382#1:1975,6\n1382#1:1981\n1382#1:1982,4\n635#1:1525\n635#1:1528\n647#1:1536\n647#1:1539\n761#1:1559\n915#1:1686\n1029#1:1842\n1029#1:1844\n1029#1:1847\n1029#1:1853\n1033#1:1859\n1036#1:1860\n1048#1:1861\n1049#1:1862\n1052#1:1863\n1058#1:1864\n1173#1:1908\n1287#1:1935\n1311#1:1950\n1313#1:1951\n1314#1:1952\n1316#1:1953\n1318#1:1954\n1333#1:1962\n1335#1:1963\n1336#1:1964\n1338#1:1965\n1342#1:1966\n1397#1:1986\n1398#1:1987\n1399#1:1988,2\n1399#1:1990\n1399#1:1991,2\n1399#1:1993\n1401#1:1994\n1402#1:1995\n1409#1:1996\n1410#1:1997\n1411#1:1998,4\n734#1:1546,2\n888#1:1673,2\n743#1:1548,2\n906#1:1677,2\n752#1:1550,2\n897#1:1675,2\n761#1:1552,7\n761#1:1560,4\n790#1:1595\n790#1:1599\n790#1:1601,2\n790#1:1604,3\n790#1:1610\n790#1:1614\n790#1:1616\n790#1:1619,4\n790#1:1624\n790#1:1626,8\n804#1:1634\n804#1:1638\n804#1:1640,2\n804#1:1643,3\n804#1:1649\n804#1:1653\n804#1:1655\n804#1:1658,4\n804#1:1663\n804#1:1665,8\n915#1:1679,7\n915#1:1687,4\n939#1:1722,7\n939#1:1730,3\n939#1:1734,9\n956#1:1743,7\n956#1:1751,3\n956#1:1755,9\n973#1:1764,7\n973#1:1772,3\n973#1:1776,9\n991#1:1785,7\n991#1:1793,3\n991#1:1797,9\n1011#1:1806,7\n1011#1:1814,3\n1011#1:1818,9\n770#1:1564,3\n770#1:1567,7\n770#1:1575,3\n770#1:1579,9\n770#1:1588\n924#1:1691,3\n924#1:1694,7\n924#1:1702,3\n924#1:1706,9\n924#1:1715\n779#1:1589,6\n933#1:1716,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i8 = i >>> 7;
        int i9 = i & 127;
        int i10 = this._capacity;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = i9;
            int i15 = i9;
            long j9 = j7 ^ (j8 * ScatterMapKt.BitmaskLsb);
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
                if (AbstractC5830k.m5325b(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                }
                this._size++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iFindFirstAvailableSlot >> 3;
                long j11 = jArr2[i17];
                int i18 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i16 - (((j11 >> i18) & 255) == 128 ? 1 : 0);
                int i19 = this._capacity;
                long j12 = ((~(255 << i18)) & j11) | (j8 << i18);
                jArr2[i17] = j12;
                jArr2[(((iFindFirstAvailableSlot - 7) & i19) + (i19 & 7)) >> 3] = j12;
                return iFindFirstAvailableSlot;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i8 = hash1 & i;
        int i9 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j7 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j8 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i;
            }
            i9 += 8;
            i8 = (i8 + i9) & i;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j7 = jArr[i];
            int i9 = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
            int i10 = (int) (j7 & SieveCacheKt.NodeLinkMask);
            long j8 = ((j7 & SieveCacheKt.NodeMetaMask) | (i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i9] & 4294967295L))) << 31;
            if (i10 != Integer.MAX_VALUE) {
                i8 = (int) (4294967295L & mapping[i10]);
            }
            jArr[i] = i8 | j8;
            i++;
        }
        int i11 = this.head;
        if (i11 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i11] & 4294967295L);
        }
        int i12 = this.tail;
        if (i12 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i12] & 4294967295L);
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            AbstractC5802q.m5188O(jArr, -9187201950435737472L);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j7 = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j7)) | j7;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            AbstractC5802q.m5188O(emptyNodes, 4611686018427387903L);
        }
        this.nodes = emptyNodes;
    }

    private final void moveNodeToHead(int index) {
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[index] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((index & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = index;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = index;
        }
    }

    private final void removeNode(int index) {
        long[] jArr = this.nodes;
        long j7 = jArr[index];
        int i = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
        int i8 = (int) (j7 & SieveCacheKt.NodeLinkMask);
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndPreviousMask) | (i8 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i8;
        }
        if (i8 != Integer.MAX_VALUE) {
            jArr[i8] = ((i & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i8] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i;
        }
        jArr[index] = 4611686018427387903L;
    }

    public final boolean add(E element) {
        int size = get_size();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((iFindAbsoluteInsertIndex & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
        return get_size() != size;
    }

    public final boolean addAll(@NotNull E[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign((Object[]) elements);
        return size != get_size();
    }

    public final void adjustStorage$collection() {
        int i = this._capacity;
        if (i > 8) {
            if (Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    @NotNull
    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            AbstractC5802q.m5188O(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        AbstractC5802q.m5186M(null, this.elements, 0, this._capacity);
        AbstractC5802q.m5188O(this.nodes, 4611686018427387903L);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i];
        int i8 = 0;
        long j7 = 9223372034707292159L;
        Arrays.fill(jArr3, 0, i, 9223372034707292159L);
        int i9 = (i + 7) >> 3;
        for (int i10 = 0; i10 < i9; i10++) {
            long j8 = jArr[i10] & (-9187201950435737472L);
            jArr[i10] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
        }
        int length = jArr.length;
        int i11 = length - 1;
        int i12 = length - 2;
        jArr[i12] = (jArr[i12] & 72057594037927935L) | (-72057594037927936L);
        jArr[i11] = jArr[0];
        int i13 = 0;
        while (i13 != i) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j9 = (jArr[i14] >> i15) & 255;
            if (j9 != 128 && j9 == 254) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : i8) * ScatterMapKt.MurmurHashC1;
                int i16 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int i17 = i8;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i16);
                int i18 = i16 & i;
                long j10 = j7;
                if (((iFindFirstAvailableSlot - i18) & i) / 8 == ((i13 - i18) & i) / 8) {
                    jArr[i14] = ((r11 & 127) << i15) | (jArr[i14] & (~(255 << i15)));
                    if (jArr3[i13] == j10) {
                        long j11 = i13;
                        jArr3[i13] = j11 | (j11 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i17];
                } else {
                    int i19 = iFindFirstAvailableSlot >> 3;
                    long j12 = jArr[i19];
                    int i20 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j12 >> i20) & 255) == 128) {
                        jArr[i19] = (j12 & (~(255 << i20))) | ((r11 & 127) << i20);
                        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                        objArr[iFindFirstAvailableSlot] = objArr[i13];
                        objArr[i13] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i13];
                        jArr2[i13] = 4611686018427387903L;
                        int i21 = (int) ((jArr3[i13] >> 32) & 4294967295L);
                        if (i21 != Integer.MAX_VALUE) {
                            jArr3[i21] = (jArr3[i21] & (-4294967296L)) | iFindFirstAvailableSlot;
                            jArr3[i13] = (jArr3[i13] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i13] = (Integer.MAX_VALUE << 32) | iFindFirstAvailableSlot;
                        }
                        jArr3[iFindFirstAvailableSlot] = Integer.MAX_VALUE | (i13 << 32);
                    } else {
                        jArr[i19] = ((r11 & 127) << i20) | (j12 & (~(255 << i20)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i13];
                        objArr[i13] = obj2;
                        long j13 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i13];
                        jArr2[i13] = j13;
                        int i22 = (int) ((jArr3[i13] >> 32) & 4294967295L);
                        if (i22 != Integer.MAX_VALUE) {
                            long j14 = iFindFirstAvailableSlot;
                            jArr3[i22] = (jArr3[i22] & (-4294967296L)) | j14;
                            jArr3[i13] = (jArr3[i13] & 4294967295L) | (j14 << 32);
                        } else {
                            long j15 = iFindFirstAvailableSlot;
                            jArr3[i13] = j15 | (j15 << 32);
                            i22 = i13;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i22 << 32) | i13;
                        i13--;
                    }
                    jArr[jArr.length - 1] = jArr[i17];
                }
                i13++;
                i8 = i17;
                j7 = j10;
            } else {
                i13++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC5830k.m5325b(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E element) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((iFindAbsoluteInsertIndex & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC5830k.m5325b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@NotNull E[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign((Object[]) elements);
        return size != get_size();
    }

    @PublishedApi
    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i8 = index >> 3;
        int i9 = (index & 7) << 3;
        long j7 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j7;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j7;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j8 = jArr2[index];
        int i10 = (int) ((j8 >> 31) & SieveCacheKt.NodeLinkMask);
        int i11 = (int) (j8 & SieveCacheKt.NodeLinkMask);
        if (i10 != Integer.MAX_VALUE) {
            jArr2[i10] = (jArr2[i10] & SieveCacheKt.NodeMetaAndPreviousMask) | (i11 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = ((i10 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i11] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i10;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void removeIf(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        if (((Boolean) predicate.invoke(objArr[i10])).booleanValue()) {
                            removeElementAt(i10);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i8 = this._capacity;
        int i9 = 0;
        while (i9 < i) {
            if (((jArr2[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i9];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10 >>> 7);
                long j7 = i10 & 127;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j8 = (jArr4[i11] & (~(255 << i12))) | (j7 << i12);
                jArr4[i11] = j8;
                jArr4[(((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7)) >> 3] = j8;
                objArr3[iFindFirstAvailableSlot] = obj;
                jArr5[iFindFirstAvailableSlot] = jArr3[i9];
                iArr[i9] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i9++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.AbstractC5805t.m5224d0(r14, r15)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0._size
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(java.util.Collection):boolean");
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i - this._capacity;
    }

    public final void trimToSize(int maxSize) {
        int i;
        long[] jArr = this.nodes;
        int i8 = this.head;
        while (i8 != Integer.MAX_VALUE && (i = this._size) > maxSize && i != 0) {
            int i9 = (int) (jArr[i8] & SieveCacheKt.NodeLinkMask);
            removeElementAt(i8);
            i8 = i9;
        }
    }

    public /* synthetic */ MutableOrderedScatterSet(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 6 : i);
    }

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final boolean addAll(@NotNull Iterable<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign((Iterable) elements);
        return size != get_size();
    }

    public final boolean removeAll(@NotNull InterfaceC6830h elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign(elements);
        return size != get_size();
    }

    public final boolean addAll(@NotNull InterfaceC6830h elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign(elements);
        return size != get_size();
    }

    public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign((Iterable) elements);
        return size != get_size();
    }

    public final void minusAssign(@NotNull E[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (E e : elements) {
            minusAssign((MutableOrderedScatterSet<E>) e);
        }
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j7 = jArr[i];
            int i9 = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
            int i10 = (int) (j7 & SieveCacheKt.NodeLinkMask);
            long j8 = ((j7 & SieveCacheKt.NodeMetaMask) | (i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i9])) << 31;
            if (i10 != Integer.MAX_VALUE) {
                i8 = mapping[i10];
            }
            jArr[i] = j8 | i8;
            i++;
        }
        int i11 = this.head;
        if (i11 != Integer.MAX_VALUE) {
            this.head = mapping[i11];
        }
        int i12 = this.tail;
        if (i12 != Integer.MAX_VALUE) {
            this.tail = mapping[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.OrderedScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.OrderedScatterSet):boolean");
    }

    public final boolean addAll(@NotNull OrderedScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign((OrderedScatterSet) elements);
        return size != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull InterfaceC6830h elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(@NotNull E[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (E e : elements) {
            plusAssign((MutableOrderedScatterSet<E>) e);
        }
    }

    public final boolean removeAll(@NotNull OrderedScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign((OrderedScatterSet) elements);
        return size != get_size();
    }

    public final void minusAssign(@NotNull Iterable<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(@NotNull Iterable<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@NotNull ScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign((ScatterSet) elements);
        return size != get_size();
    }

    public final boolean removeAll(@NotNull ScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign((ScatterSet) elements);
        return size != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull OrderedScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i = elements.tail;
        while (i != Integer.MAX_VALUE) {
            int i8 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign((MutableOrderedScatterSet<E>) objArr[i]);
            i = i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull InterfaceC6830h elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@NotNull ObjectList<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        plusAssign((ObjectList) elements);
        return size != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull OrderedScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i = elements.tail;
        while (i != Integer.MAX_VALUE) {
            int i8 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign((MutableOrderedScatterSet<E>) objArr[i]);
            i = i8;
        }
    }

    public final boolean removeAll(@NotNull ObjectList<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = get_size();
        minusAssign((ObjectList) elements);
        return size != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.ScatterSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        minusAssign((MutableOrderedScatterSet<E>) objArr[(i << 3) + i9]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ScatterSet<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        plusAssign((MutableOrderedScatterSet<E>) objArr[(i << 3) + i9]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0.get_size()
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5c
            r7 = r6
        L18:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L32:
            if (r12 >= r10) goto L55
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L51
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L51
            r0.removeElementAt(r13)
        L51:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L55:
            if (r10 != r11) goto L5c
        L57:
            if (r7 == r5) goto L5c
            int r7 = r7 + 1
            goto L18
        L5c:
            int r1 = r0.get_size()
            if (r3 == r1) goto L64
            r1 = 1
            return r1
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(r6.c):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            minusAssign((MutableOrderedScatterSet<E>) objArr[i8]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ObjectList<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            plusAssign((MutableOrderedScatterSet<E>) objArr[i8]);
        }
    }
}
