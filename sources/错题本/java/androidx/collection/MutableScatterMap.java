package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJU\u0010\u0012\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u000028\u0010\u0011\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00010\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\u00142\u001a\u0010\u001b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u001e¢\u0006\u0004\b\u001c\u0010\u001fJ'\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0 ¢\u0006\u0004\b\u001c\u0010!J!\u0010\u001c\u001a\u00020\u00142\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b\u001c\u0010$J!\u0010\u001c\u001a\u00020\u00142\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u001c\u0010%J$\u0010'\u001a\u00020\u00142\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0086\n¢\u0006\u0004\b'\u0010(J,\u0010'\u001a\u00020\u00142\u001a\u0010\u001b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u0019H\u0086\n¢\u0006\u0004\b'\u0010\u001dJ*\u0010'\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u001eH\u0086\n¢\u0006\u0004\b'\u0010\u001fJ*\u0010'\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0 H\u0086\n¢\u0006\u0004\b'\u0010!J$\u0010'\u001a\u00020\u00142\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0086\n¢\u0006\u0004\b'\u0010$J$\u0010'\u001a\u00020\u00142\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020+2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b)\u0010,J-\u0010.\u001a\u00020\u00142\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020+0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b0\u00101J \u00100\u001a\u00020\u00142\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0086\n¢\u0006\u0004\b0\u00103J\u001e\u00100\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\n¢\u0006\u0004\b0\u0010\u001fJ\u001e\u00100\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\n¢\u0006\u0004\b0\u0010!J\u001e\u00100\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0086\n¢\u0006\u0004\b0\u00105J\u001e\u00100\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0086\n¢\u0006\u0004\b0\u00107J\u0019\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u00108\u001a\u00020\u0004H\u0001¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0014H\u0000¢\u0006\u0004\bA\u0010<J\u000f\u0010D\u001a\u00020\u0014H\u0000¢\u0006\u0004\bC\u0010<J\u0017\u0010G\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0004H\u0000¢\u0006\u0004\bF\u0010\u0007J\u0019\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bK\u0010\u0007J\u0017\u0010M\u001a\u00020\u00142\u0006\u0010L\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010\u0007J\u000f\u0010N\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010<J\u0017\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006T"}, m5110d2 = {"Landroidx/collection/MutableScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "computeBlock", "compute", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Ld6/s;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Lz6/h;", "(Lz6/h;)V", "", TypedValues.TransitionType.S_FROM, "(Ljava/util/Map;)V", "(Landroidx/collection/ScatterMap;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lr6/e;)V", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "()V", "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableMap", "()Ljava/util/Map;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "hash1", "findFirstAvailableSlot", "(I)I", "growthLimit", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1787:1\n59#2,5:1788\n1254#3,6:1793\n1399#3:1812\n1270#3:1816\n1165#3,3:1828\n1179#3:1832\n1175#3:1835\n1372#3,3:1840\n1386#3,3:1844\n1312#3:1848\n1303#3:1850\n1297#3:1851\n1309#3:1856\n1393#3:1858\n1165#3,3:1868\n1179#3:1872\n1175#3:1875\n1372#3,3:1880\n1386#3,3:1884\n1312#3:1888\n1303#3:1890\n1297#3:1891\n1309#3:1896\n1393#3:1898\n1399#3:1913\n1270#3:1917\n1399#3:1937\n1270#3:1941\n1230#3:1958\n1254#3,6:1959\n1242#3:1965\n1241#3,4:1966\n1254#3,6:1970\n1165#3,3:1976\n1175#3:1979\n1179#3:1980\n1372#3,3:1981\n1386#3,3:1984\n1312#3:1987\n1303#3:1988\n1297#3:1989\n1309#3:1990\n1393#3:1991\n1265#3:1992\n1220#3:1993\n1262#3:1994\n1220#3:1995\n1230#3:1996\n1254#3,6:1997\n1242#3:2003\n1241#3,4:2004\n1372#3,3:2008\n1399#3:2011\n1297#3:2012\n1144#3,14:2013\n1220#3:2027\n1165#3,3:2028\n1175#3:2031\n1179#3:2032\n1254#3,6:2033\n1220#3:2039\n1179#3:2040\n1254#3,6:2041\n1254#3,6:2047\n1179#3:2053\n1254#3,6:2054\n1268#3:2060\n1220#3:2061\n1165#3,3:2062\n1175#3:2065\n1179#3:2066\n1230#3:2067\n1254#3,6:2068\n1242#3:2074\n1241#3,4:2075\n1#4:1799\n215#5,2:1800\n357#6,4:1802\n329#6,6:1806\n339#6,3:1813\n342#6,9:1817\n361#6:1826\n555#6:1827\n556#6:1831\n558#6,2:1833\n560#6,4:1836\n564#6:1843\n565#6:1847\n566#6:1849\n567#6,4:1852\n573#6:1857\n574#6,8:1859\n555#6:1867\n556#6:1871\n558#6,2:1873\n560#6,4:1876\n564#6:1883\n565#6:1887\n566#6:1889\n567#6,4:1892\n573#6:1897\n574#6,8:1899\n329#6,6:1907\n339#6,3:1914\n342#6,9:1918\n231#7,3:1927\n200#7,7:1930\n211#7,3:1938\n214#7,9:1942\n234#7:1951\n287#8,6:1952\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n639#1:1788,5\n667#1:1793,6\n776#1:1812\n776#1:1816\n818#1:1828,3\n818#1:1832\n818#1:1835\n818#1:1840,3\n818#1:1844,3\n818#1:1848\n818#1:1850\n818#1:1851\n818#1:1856\n818#1:1858\n830#1:1868,3\n830#1:1872\n830#1:1875\n830#1:1880,3\n830#1:1884,3\n830#1:1888\n830#1:1890\n830#1:1891\n830#1:1896\n830#1:1898\n842#1:1913\n842#1:1917\n878#1:1937\n878#1:1941\n892#1:1958\n892#1:1959,6\n892#1:1965\n892#1:1966,4\n905#1:1970,6\n920#1:1976,3\n921#1:1979\n922#1:1980\n929#1:1981,3\n930#1:1984,3\n931#1:1987\n932#1:1988\n932#1:1989\n936#1:1990\n939#1:1991\n948#1:1992\n948#1:1993\n954#1:1994\n954#1:1995\n955#1:1996\n955#1:1997,6\n955#1:2003\n955#1:2004,4\n970#1:2008,3\n971#1:2011\n973#1:2012\n1019#1:2013,14\n1025#1:2027\n1039#1:2028,3\n1040#1:2031\n1051#1:2032\n1052#1:2033,6\n1061#1:2039\n1064#1:2040\n1065#1:2041,6\n1066#1:2047,6\n1076#1:2053\n1077#1:2054,6\n1116#1:2060\n1116#1:2061\n1118#1:2062,3\n1119#1:2065\n1121#1:2066\n1121#1:2067\n1121#1:2068,6\n1121#1:2074\n1121#1:2075,4\n771#1:1800,2\n776#1:1802,4\n776#1:1806,6\n776#1:1813,3\n776#1:1817,9\n776#1:1826\n818#1:1827\n818#1:1831\n818#1:1833,2\n818#1:1836,4\n818#1:1843\n818#1:1847\n818#1:1849\n818#1:1852,4\n818#1:1857\n818#1:1859,8\n830#1:1867\n830#1:1871\n830#1:1873,2\n830#1:1876,4\n830#1:1883\n830#1:1887\n830#1:1889\n830#1:1892,4\n830#1:1897\n830#1:1899,8\n842#1:1907,6\n842#1:1914,3\n842#1:1918,9\n878#1:1927,3\n878#1:1930,7\n878#1:1938,3\n878#1:1942,9\n878#1:1951\n883#1:1952,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        this(0, 1, null);
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

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            AbstractC5802q.m5188O(jArr2, -9187201950435737472L);
            int i = capacity >> 3;
            long j7 = 255 << ((capacity & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j7)) | j7;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
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
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper(this);
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
        AbstractC5802q.m5186M(null, this.values, 0, this._capacity);
        AbstractC5802q.m5186M(null, this.keys, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K key, @NotNull InterfaceC6473e computeBlock) {
        AbstractC5830k.m5330g(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(key);
        boolean z8 = iFindInsertIndex < 0;
        V v2 = (V) computeBlock.invoke(key, z8 ? null : this.values[iFindInsertIndex]);
        if (!z8) {
            this.values[iFindInsertIndex] = v2;
            return v2;
        }
        int i = ~iFindInsertIndex;
        this.keys[i] = key;
        this.values[i] = v2;
        return v2;
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i8 = (i + 7) >> 3;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            long j7 = jArr[i10] & (-9187201950435737472L);
            jArr[i10] = (-72340172838076674L) & ((~j7) + (j7 >>> 7));
        }
        int iM5193T = AbstractC5802q.m5193T(jArr);
        int i11 = iM5193T - 1;
        jArr[i11] = (jArr[i11] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM5193T] = jArr[0];
        int i12 = 0;
        while (i12 != i) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j8 = (jArr[i13] >> i14) & 255;
            if (j8 != 128 && j8 == 254) {
                Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : i9) * ScatterMapKt.MurmurHashC1;
                int i15 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i15);
                int i16 = i15 & i;
                int i17 = i9;
                if (((iFindFirstAvailableSlot - i16) & i) / 8 == ((i12 - i16) & i) / 8) {
                    jArr[i13] = ((r8 & 127) << i14) | ((~(255 << i14)) & jArr[i13]);
                    jArr[jArr.length - 1] = jArr[i17];
                } else {
                    int i18 = iFindFirstAvailableSlot >> 3;
                    long j9 = jArr[i18];
                    int i19 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j9 >> i19) & 255) == 128) {
                        jArr[i18] = ((r8 & 127) << i19) | (j9 & (~(255 << i19)));
                        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                        objArr[iFindFirstAvailableSlot] = objArr[i12];
                        objArr[i12] = null;
                        objArr2[iFindFirstAvailableSlot] = objArr2[i12];
                        objArr2[i12] = null;
                    } else {
                        jArr[i18] = ((r8 & 127) << i19) | (j9 & (~(255 << i19)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i12];
                        objArr[i12] = obj2;
                        Object obj3 = objArr2[iFindFirstAvailableSlot];
                        objArr2[iFindFirstAvailableSlot] = objArr2[i12];
                        objArr2[i12] = obj3;
                        i12--;
                    }
                    jArr[jArr.length - 1] = jArr[i17];
                }
                i12++;
                i9 = i17;
            } else {
                i12++;
            }
        }
        initializeGrowth();
    }

    @PublishedApi
    public final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
                if (AbstractC5830k.m5325b(this.keys[iNumberOfTrailingZeros], key)) {
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
                return ~iFindFirstAvailableSlot;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
        }
    }

    public final V getOrPut(K key, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        V v2 = get(key);
        if (v2 != null) {
            return v2;
        }
        V v4 = (V) defaultValue.invoke();
        set(key, v4);
        return v4;
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        AbstractC5830k.m5330g(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @Nullable
    public final V put(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = key;
        objArr[iFindInsertIndex] = value;
        return v2;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(K r14) {
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
            java.lang.Object[] r11 = r13.keys
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
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
                        if (((Boolean) predicate.invoke(this.keys[i10], this.values[i10])).booleanValue()) {
                            removeValueAt(i10);
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

    @PublishedApi
    @Nullable
    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i8 = index >> 3;
        int i9 = (index & 7) << 3;
        long j7 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j7;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j7;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v2 = (V) objArr[index];
        objArr[index] = null;
        return v2;
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i8 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i9 = this._capacity;
        int i10 = 0;
        while (i10 < i8) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i10];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i11 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                i = i10;
                long j7 = i11 & 127;
                int i12 = iFindFirstAvailableSlot >> 3;
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                long j8 = (j7 << i13) | (jArr2[i12] & (~(255 << i13)));
                jArr2[i12] = j8;
                jArr2[(((iFindFirstAvailableSlot - 7) & i9) + (i9 & 7)) >> 3] = j8;
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i];
            } else {
                i = i10;
            }
            i10 = i + 1;
        }
    }

    public final void set(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@NotNull K[] keys) {
        AbstractC5830k.m5330g(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull InterfaceC6830h pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull InterfaceC6830h pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull InterfaceC6830h keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        AbstractC5830k.m5330g(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(objArr[(i << 3) + i9]);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(K r18, V r19) {
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
            java.lang.Object[] r15 = r0.keys
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
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r7)
            if (r1 == 0) goto L83
            r0.removeValueAt(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        set(objArr[i10], objArr2[i10]);
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
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Object[] objArr = keys.content;
        int i = keys._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(objArr[i8]);
        }
    }
}
