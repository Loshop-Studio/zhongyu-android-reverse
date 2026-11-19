package androidx.collection;

import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(m13412d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J:\u0010\u0019\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010 \u001a\u00020\u001aJ:\u0010 \u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0005H\u0007J:\u0010%\u001a\u00020\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010*J\u000b\u0010+\u001a\u00028\u0000¢\u0006\u0002\u0010,J?\u0010+\u001a\u00028\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-JA\u0010.\u001a\u0004\u0018\u00018\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-J:\u0010/\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J?\u00102\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002000\u001cH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\b4J:\u00105\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u00106\u001a\u00020\u0005H\u0016J\u0006\u00107\u001a\u00020\u001aJ\u0006\u00108\u001a\u00020\u001aJR\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020<2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<\u0018\u00010\u001cH\u0007J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010,J?\u0010B\u001a\u00028\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-JA\u0010C\u001a\u0004\u0018\u00018\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-J\u0006\u0010D\u001a\u00020\u001aJ\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0086\bJ\b\u0010G\u001a\u00020:H\u0016J:\u0010H\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002000\u001cH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0013\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0011\u0010\u0015\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0018\u0010\u0017\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u0082\u0001\u0001J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, m13413d2 = {"Landroidx/collection/OrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "head", "getHead$annotations", "metadata", "", "getMetadata$annotations", "nodes", "getNodes$annotations", "size", "getSize", "tail", "getTail$annotations", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "any", "asSet", "", "contains", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", "index", "forEachIndex$collection", "forEachReverse", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", RequestParameters.PREFIX, "postfix", "limit", "truncated", "transform", "last", "lastOrNull", "none", "toList", "", "toString", "unorderedForEach", "unorderedForEachIndex", "Landroidx/collection/MutableOrderedScatterSet;", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 2 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1511:1\n301#1,7:1512\n308#1,4:1520\n301#1,7:1524\n308#1,4:1532\n301#1,7:1536\n308#1,4:1544\n321#1,7:1548\n328#1,4:1556\n321#1,7:1560\n328#1,4:1568\n321#1,7:1572\n328#1,4:1580\n269#1,7:1589\n280#1,3:1597\n283#1,9:1601\n301#1,7:1610\n308#1,4:1618\n341#1,3:1622\n269#1,7:1625\n280#1,3:1633\n283#1,9:1637\n344#1:1646\n341#1,3:1647\n269#1,7:1650\n280#1,3:1658\n283#1,9:1662\n344#1:1671\n341#1,3:1672\n269#1,7:1675\n280#1,3:1683\n283#1,9:1687\n344#1:1696\n510#1:1697\n511#1:1701\n513#1,2:1703\n515#1,3:1706\n518#1:1712\n519#1:1716\n520#1:1718\n521#1,4:1721\n527#1:1726\n528#1,8:1728\n301#1,7:1736\n308#1,4:1744\n341#1,3:1748\n269#1,7:1751\n280#1,3:1759\n283#1,9:1763\n344#1:1772\n341#1,3:1773\n269#1,7:1776\n280#1,3:1784\n283#1,9:1788\n344#1:1797\n1123#2:1519\n1123#2:1531\n1123#2:1543\n1127#2:1555\n1127#2:1567\n1127#2:1579\n1123#2:1584\n1123#2:1587\n1127#2:1588\n1123#2:1617\n1123#2:1743\n1399#3:1585\n1270#3:1586\n1399#3:1596\n1270#3:1600\n1399#3:1632\n1270#3:1636\n1399#3:1657\n1270#3:1661\n1399#3:1682\n1270#3:1686\n1165#3,3:1698\n1179#3:1702\n1175#3:1705\n1372#3,3:1709\n1386#3,3:1713\n1312#3:1717\n1303#3:1719\n1297#3:1720\n1309#3:1725\n1393#3:1727\n1399#3:1758\n1270#3:1762\n1399#3:1783\n1270#3:1787\n1165#3,3:1798\n1179#3:1801\n1175#3:1802\n1372#3,3:1803\n1386#3,3:1806\n1312#3:1809\n1303#3:1810\n1297#3:1811\n1309#3:1812\n1393#3:1813\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n*L\n178#1:1512,7\n178#1:1520,4\n195#1:1524,7\n195#1:1532,4\n209#1:1536,7\n209#1:1544,4\n219#1:1548,7\n219#1:1556,4\n236#1:1560,7\n236#1:1568,4\n250#1:1572,7\n250#1:1580,4\n343#1:1589,7\n343#1:1597,3\n343#1:1601,9\n349#1:1610,7\n349#1:1618,4\n363#1:1622,3\n363#1:1625,7\n363#1:1633,3\n363#1:1637,9\n363#1:1646\n376#1:1647,3\n376#1:1650,7\n376#1:1658,3\n376#1:1662,9\n376#1:1671\n394#1:1672,3\n394#1:1675,7\n394#1:1683,3\n394#1:1687,9\n394#1:1696\n403#1:1697\n403#1:1701\n403#1:1703,2\n403#1:1706,3\n403#1:1712\n403#1:1716\n403#1:1718\n403#1:1721,4\n403#1:1726\n403#1:1728,8\n426#1:1736,7\n426#1:1744,4\n453#1:1748,3\n453#1:1751,7\n453#1:1759,3\n453#1:1763,9\n453#1:1772\n483#1:1773,3\n483#1:1776,7\n483#1:1784,3\n483#1:1788,9\n483#1:1797\n178#1:1519\n195#1:1531\n209#1:1543\n219#1:1555\n236#1:1567\n250#1:1579\n260#1:1584\n307#1:1587\n327#1:1588\n349#1:1617\n426#1:1743\n275#1:1585\n282#1:1586\n343#1:1596\n343#1:1600\n363#1:1632\n363#1:1636\n376#1:1657\n376#1:1661\n394#1:1682\n394#1:1686\n403#1:1698,3\n403#1:1702\n403#1:1705\n403#1:1709,3\n403#1:1713,3\n403#1:1717\n403#1:1719\n403#1:1720\n403#1:1725\n403#1:1727\n453#1:1758\n453#1:1762\n483#1:1783\n483#1:1787\n510#1:1798,3\n511#1:1801\n514#1:1802\n517#1:1803,3\n518#1:1806,3\n519#1:1809\n520#1:1810\n520#1:1811\n524#1:1812\n527#1:1813\n*E\n"})
/* loaded from: classes.dex */
public abstract class OrderedScatterSet<E> {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    public Object[] elements;

    @JvmField
    public int head;

    @JvmField
    public long[] metadata;

    @JvmField
    public long[] nodes;

    @JvmField
    public int tail;

    public /* synthetic */ OrderedScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getElements$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getHead$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNodes$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getTail$annotations() {
    }

    public static /* synthetic */ String joinToString$default(OrderedScatterSet orderedScatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i10 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i10 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i10 & 8) != 0) {
            i9 = -1;
        }
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return orderedScatterSet.joinToString(charSequence, charSequence2, charSequence3, i9, charSequence5, function12);
    }

    public final boolean all(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128 && !predicate.invoke(objArr[(i9 << 3) + i11]).booleanValue()) {
                        return false;
                    }
                    j9 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i9 == length) {
                return true;
            }
            i9++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final Set<E> asSet() {
        return new OrderedSetWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(E r18) {
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
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.contains(java.lang.Object):boolean");
    }

    @IntRange(from = 0)
    public final int count() {
        return get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.OrderedScatterSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.OrderedScatterSet r1 = (androidx.collection.OrderedScatterSet) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L25
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(E element) {
        int i9 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & WorkQueueKt.MASK;
        int i12 = this._capacity;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.metadata;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * ScatterMapKt.BitmaskLsb) ^ j9;
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i9 += 8;
            i13 = i14 + i9;
        }
    }

    public final E first() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        if (i9 != Integer.MAX_VALUE) {
            long j9 = jArr[i9];
            return (E) objArr[i9];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i9];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i9 = i10;
        }
        return null;
    }

    public final void forEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i9]);
            i9 = i10;
        }
    }

    public final void forEachIndex$collection(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.nodes;
        int i9 = this.tail;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(Integer.valueOf(i9));
            i9 = i10;
        }
    }

    public final void forEachReverse(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.head;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) (jArr[i9] & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i9]);
            i9 = i10;
        }
    }

    @IntRange(from = 0)
    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int iHashCode = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j9 = jArr[i9];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j9) < 128) {
                            Object obj = objArr[(i9 << 3) + i11];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i10 != 8) {
                        return iHashCode;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.head;
        if (i9 != Integer.MAX_VALUE) {
            long j9 = jArr[i9];
            return (E) objArr[i9];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.head;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) (jArr[i9] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i9];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i9 = i10;
        }
        return null;
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<E> toList() {
        ArrayList arrayList = new ArrayList(get_size());
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
            arrayList.add(objArr[i9]);
            i9 = i10;
        }
        return arrayList;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.OrderedScatterSet.toString.1
            final /* synthetic */ OrderedScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((C09351) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e10) {
                return e10 == this.this$0 ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    @PublishedApi
    public final void unorderedForEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128) {
                        block.invoke(objArr[(i9 << 3) + i11]);
                    }
                    j9 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    @PublishedApi
    public final void unorderedForEachIndex(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128) {
                        block.invoke(Integer.valueOf((i9 << 3) + i11));
                    }
                    j9 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    private OrderedScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L54
            r4 = r3
        L11:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2b:
            if (r9 >= r7) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L49
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L49
            r15 = 1
            return r15
        L49:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2b
        L4d:
            if (r7 != r8) goto L54
        L4f:
            if (r4 == r2) goto L54
            int r4 = r4 + 1
            goto L11
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    @IntRange(from = 0)
    public final int count(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128 && predicate.invoke(objArr[(i9 << 3) + i12]).booleanValue()) {
                        i10++;
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i9 == length) {
                return i10;
            }
            i9++;
        }
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i9) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i9, null, null, 48, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i9, truncated, null, 32, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i9];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i9 = i10;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.tail;
        int i10 = 0;
        while (true) {
            if (i9 != Integer.MAX_VALUE) {
                int i11 = (int) ((jArr[i9] >> 31) & SieveCacheKt.NodeLinkMask);
                Object obj = objArr[i9];
                if (i10 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                if (transform == null) {
                    sb.append(obj);
                } else {
                    sb.append(transform.invoke(obj));
                }
                i10++;
                i9 = i11;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i9 = this.head;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) (jArr[i9] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i9];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i9 = i10;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }
}
