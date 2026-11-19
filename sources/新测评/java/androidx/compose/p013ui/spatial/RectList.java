package androidx.compose.p013ui.spatial;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0006H\u0082\bJ\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\rJÇ\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u008b\u0001\u0010\u001b\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u001cH\u0086\bJ1\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\bJ=\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00062*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ-\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ=\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ5\u0010)\u001a\u00020\r2*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ)\u0010*\u001a\u00020\r2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r0+H\u0086\bJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006JL\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u000fJ\u000e\u00102\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u00103\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u0006J.\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J5\u00105\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J \u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0004H\u0002J.\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010>\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J \u0010>\u001a\u00020\r2\u0006\u0010A\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002J4\u0010B\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0CR\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m13558d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "()V", "items", "", "itemsSize", "", "size", "getSize", "()I", "stack", "allocateItemsIndex", "clearUpdated", "", "contains", "", "value", "debugString", "", "defragment", "findKNearestNeighbors", "searchAxis", "k", "l", "t", "r", "b", "block", "Lkotlin/Function6;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "score", "id", "findNearestNeighbor", "forEachIntersectingRectWithValueAt", "index", "Lkotlin/Function5;", "forEachIntersection", "x", "y", "Lkotlin/Function1;", "forEachRect", "forEachUpdatedRect", "Lkotlin/Function3;", "", "indexOf", "insert", "parentId", "focusable", "gesturable", "markUpdated", "metaFor", "move", "neighborsScoredByDistance", "", "neighborsScoredByDistance$ui_release", "remove", "resizeStorage", "actualSize", "currentSize", "currentItems", "update", "updateSubhierarchy", "deltaX", "deltaY", "stackMeta", "withRect", "Lkotlin/Function4;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n102#1,8:969\n787#2:977\n787#2:978\n803#2:979\n870#2:980\n804#2:981\n870#2:982\n805#2:983\n870#2:984\n806#2,3:985\n810#2:988\n828#2,2:989\n810#2:991\n810#2:992\n787#2:993\n787#2:994\n823#2:995\n810#2:996\n787#2:997\n787#2:998\n823#2:999\n837#2:1000\n839#2:1001\n818#2:1002\n803#2:1003\n870#2:1004\n804#2:1005\n870#2:1006\n805#2:1007\n870#2:1008\n806#2,3:1009\n810#2:1012\n812#2:1013\n815#2:1014\n812#2:1015\n837#2,3:1016\n787#2:1019\n837#2,3:1020\n787#2:1023\n823#2:1024\n815#2:1025\n818#2:1026\n810#2:1027\n823#2:1028\n810#2:1029\n837#2:1030\n839#2:1031\n837#2:1032\n839#2:1033\n810#2:1034\n810#2:1035\n810#2:1036\n787#2:1037\n787#2:1038\n860#2,2:1039\n810#2:1041\n810#2:1042\n837#2:1043\n839#2:1044\n837#2:1045\n839#2:1046\n787#2:1047\n860#2,2:1048\n810#2:1050\n860#2,2:1051\n837#2:1053\n839#2:1054\n837#2:1055\n839#2:1056\n810#2:1057\n837#2:1058\n839#2:1059\n837#2:1060\n839#2:1061\n810#2:1062\n837#2:1063\n839#2:1064\n837#2:1065\n839#2:1066\n837#2:1067\n839#2:1068\n837#2:1069\n839#2:1070\n810#2:1071\n825#2:1072\n835#2:1073\n810#2:1074\n810#2:1075\n812#2:1076\n837#2:1077\n839#2:1078\n837#2:1079\n839#2:1080\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:969,8\n151#1:977\n152#1:978\n154#1:979\n154#1:980\n154#1:981\n154#1:982\n154#1:983\n154#1:984\n154#1:985,3\n176#1:988\n183#1:989,2\n205#1:991\n234#1:992\n235#1:993\n236#1:994\n237#1:995\n260#1:996\n262#1:997\n263#1:998\n264#1:999\n265#1:1000\n266#1:1001\n268#1:1002\n281#1:1003\n281#1:1004\n281#1:1005\n281#1:1006\n281#1:1007\n281#1:1008\n281#1:1009,3\n320#1:1012\n321#1:1013\n322#1:1014\n328#1:1015\n331#1:1016,3\n331#1:1019\n333#1:1020,3\n333#1:1023\n334#1:1024\n335#1:1025\n339#1:1026\n355#1:1027\n356#1:1028\n372#1:1029\n376#1:1030\n377#1:1031\n378#1:1032\n379#1:1033\n396#1:1034\n418#1:1035\n435#1:1036\n454#1:1037\n455#1:1038\n463#1:1039,2\n467#1:1041\n485#1:1042\n486#1:1043\n487#1:1044\n488#1:1045\n489#1:1046\n505#1:1047\n513#1:1048,2\n515#1:1050\n544#1:1051,2\n546#1:1053\n547#1:1054\n548#1:1055\n549#1:1056\n550#1:1057\n582#1:1058\n583#1:1059\n584#1:1060\n585#1:1061\n634#1:1062\n635#1:1063\n636#1:1064\n637#1:1065\n638#1:1066\n669#1:1067\n670#1:1068\n671#1:1069\n672#1:1070\n682#1:1071\n719#1:1072\n731#1:1073\n735#1:1074\n753#1:1075\n754#1:1076\n755#1:1077\n756#1:1078\n757#1:1079\n758#1:1080\n*E\n"})
/* loaded from: classes2.dex */
public final class RectList {
    public static final int $stable = 8;

    @JvmField
    public int itemsSize;

    @JvmField
    public long[] items = new long[192];

    @JvmField
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        int i11 = i10 + 3;
        this.itemsSize = i11;
        int length = jArr.length;
        if (length <= i11) {
            resizeStorage(length, i10, jArr);
        }
        return i10;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i10, int i11, int i12, int i13, int i14, int i15, boolean z9, boolean z10, int i16, Object obj) {
        boolean z11;
        RectList rectList2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = (i16 & 32) != 0 ? -1 : i15;
        boolean z12 = (i16 & 64) != 0 ? false : z9;
        if ((i16 & 128) != 0) {
            z11 = false;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
            i21 = i14;
            rectList2 = rectList;
        } else {
            z11 = z10;
            rectList2 = rectList;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
            i21 = i14;
        }
        rectList2.insert(i17, i18, i19, i20, i21, i22, z12, z11);
    }

    private final void resizeStorage(int actualSize, int currentSize, long[] currentItems) {
        int iMax = Math.max(actualSize * 2, currentSize + 3);
        long[] jArrCopyOf = Arrays.copyOf(currentItems, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            jArr[i12] = jArr[i12] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int value) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & RectListKt.Lower26Bits) == i10) {
                return true;
            }
        }
        return false;
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            long j12 = jArr[i11 + 2];
            sb.append("id=" + (((int) j12) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j10 >> 32)) + ',' + ((int) j10) + ',' + ((int) (j11 >> 32)) + ',' + ((int) j11) + "], parent=" + (((int) (j12 >> 26)) & RectListKt.Lower26Bits));
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length - 2 && i11 < jArr2.length - 2 && i12 < i10; i12 += 3) {
            int i13 = i12 + 2;
            if (jArr[i13] != RectListKt.TombStone) {
                jArr2[i11] = jArr[i12];
                jArr2[i11 + 1] = jArr[i12 + 1];
                jArr2[i11 + 2] = jArr[i13];
                i11 += 3;
            }
        }
        this.itemsSize = i11;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int searchAxis, int k10, int l10, int t10, int r10, int b10, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i10;
        int[] iArrNeighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(searchAxis, l10, t10, r10, b10);
        long[] jArr = this.items;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 <= k10) {
            int iMin = Integer.MAX_VALUE;
            int i14 = 0;
            while (i14 < iArrNeighborsScoredByDistance$ui_release.length) {
                int i15 = iArrNeighborsScoredByDistance$ui_release[i14];
                if (i15 > i11) {
                    iMin = Math.min(iMin, i15);
                }
                if (i15 == i11) {
                    int i16 = i14 * 3;
                    long j10 = jArr[i16];
                    long j11 = jArr[i16 + 1];
                    i10 = i11;
                    block.invoke(Integer.valueOf(i15), Integer.valueOf(((int) jArr[i16 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                    i13++;
                    if (i13 == k10) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
                i14++;
                i11 = i10;
            }
            i12++;
            i11 = iMin;
        }
    }

    public final int findNearestNeighbor(int searchAxis, int l10, int t10, int r10, int b10) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i10; i13 += 3) {
            long j10 = jArr[i13];
            int i14 = i13 + 1;
            long j11 = jArr[i14];
            int iDistanceScore = RectListKt.distanceScore(searchAxis, l10, t10, r10, b10, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
            boolean z9 = (iDistanceScore < i11) & (iDistanceScore > 0);
            if (z9) {
                i11 = iDistanceScore;
            }
            if (z9) {
                i12 = i14;
            }
        }
        if (i12 < 0 || i12 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i12]) & RectListKt.Lower26Bits;
    }

    public final void forEachIntersectingRectWithValueAt(int index, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        long j10 = jArr[index];
        long j11 = jArr[index + 1];
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if (i11 != index) {
                long j12 = jArr[i11];
                long j13 = jArr[i11 + 1];
                if (((((j11 - j12) - InlineClassHelperKt.Uint64Low32) | ((j13 - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13), Integer.valueOf(((int) jArr[i11 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int l10, int t10, int r10, int b10, Function1<? super Integer, Unit> block) {
        long j10 = (l10 << 32) | (t10 & 4294967295L);
        long j11 = (r10 << 32) | (b10 & 4294967295L);
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if (((((j11 - jArr[i11]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i11 + 1] - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i11 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            block.invoke(Integer.valueOf(((int) jArr[i11 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
        }
    }

    public final void forEachUpdatedRect(Function3<? super Integer, ? super Long, ? super Long, Unit> block) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11 + 2];
            if ((((int) (j10 >> 61)) & 1) != 0) {
                block.invoke(Integer.valueOf(((int) j10) & RectListKt.Lower26Bits), Long.valueOf(jArr[i11]), Long.valueOf(jArr[i11 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int value) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & RectListKt.Lower26Bits) == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final void insert(int value, int l10, int t10, int r10, int b10, int parentId, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        int i11 = i10 + 3;
        this.itemsSize = i11;
        int length = jArr.length;
        if (length <= i11) {
            resizeStorage(length, i10, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i10] = (l10 << 32) | (t10 & 4294967295L);
        jArr2[i10 + 1] = (r10 << 32) | (b10 & 4294967295L);
        long j10 = ((gesturable ? 1L : 0L) << 63) | ((focusable ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i12 = parentId & RectListKt.Lower26Bits;
        jArr2[i10 + 2] = j10 | (i12 << 26) | (value & RectListKt.Lower26Bits);
        if (parentId < 0) {
            return;
        }
        for (int i13 = i10 - 3; i13 >= 0; i13 -= 3) {
            int i14 = i13 + 2;
            long j11 = jArr2[i14];
            if ((((int) j11) & RectListKt.Lower26Bits) == i12) {
                jArr2[i14] = (j11 & RectListKt.EverythingButLastChildOffset) | (((i10 - i13) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int value) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j10 = jArr[i13];
            if ((((int) j10) & RectListKt.Lower26Bits) == i10) {
                jArr[i13] = LockFreeTaskQueueCore.CLOSED_MASK | j10;
                return;
            }
        }
    }

    public final long metaFor(int value) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            long j10 = jArr[i12 + 2];
            if ((((int) j10) & RectListKt.Lower26Bits) == i10) {
                return j10;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int value, int l10, int t10, int r10, int b10) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j10 = jArr[i13];
            if ((((int) j10) & RectListKt.Lower26Bits) == i10) {
                long j11 = jArr[i12];
                jArr[i12] = (t10 & 4294967295L) | (l10 << 32);
                int i14 = i12;
                jArr[i12 + 1] = (b10 & 4294967295L) | (r10 << 32);
                jArr[i13] = LockFreeTaskQueueCore.CLOSED_MASK | j10;
                int i15 = l10 - ((int) (j11 >> 32));
                int i16 = t10 - ((int) j11);
                if ((i15 != 0) | (i16 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j10) | (((i14 + 3) & RectListKt.Lower26Bits) << 26), i15, i16);
                }
                return true;
            }
        }
        return false;
    }

    public final int[] neighborsScoredByDistance$ui_release(int searchAxis, int l10, int t10, int r10, int b10) {
        long[] jArr = this.items;
        int i10 = this.itemsSize / 3;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 3;
            if (i12 < 0 || i12 >= jArr.length - 1) {
                break;
            }
            long j10 = jArr[i12];
            long j11 = jArr[i12 + 1];
            iArr[i11] = RectListKt.distanceScore(searchAxis, l10, t10, r10, b10, (int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
        }
        return iArr;
    }

    public final boolean remove(int value) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & RectListKt.Lower26Bits) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l10, int t10, int r10, int b10) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j10 = jArr[i13];
            if ((((int) j10) & RectListKt.Lower26Bits) == i10) {
                jArr[i12] = (l10 << 32) | (t10 & 4294967295L);
                jArr[i12 + 1] = (r10 << 32) | (b10 & 4294967295L);
                jArr[i13] = LockFreeTaskQueueCore.CLOSED_MASK | j10;
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (id & RectListKt.Lower26Bits), deltaX, deltaY);
    }

    public final boolean withRect(int value, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i10 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & RectListKt.Lower26Bits) == i10) {
                long j10 = jArr[i12];
                long j11 = jArr[i12 + 1];
                block.invoke(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return true;
            }
        }
        return false;
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        int i10;
        char c10;
        char c11;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = stackMeta;
        int i11 = 1;
        while (i11 > 0) {
            i11--;
            long j10 = jArr2[i11];
            int i12 = RectListKt.Lower26Bits;
            int i13 = ((int) j10) & RectListKt.Lower26Bits;
            char c12 = 26;
            int i14 = ((int) (j10 >> 26)) & RectListKt.Lower26Bits;
            char c13 = '4';
            char c14 = 511;
            int i15 = ((int) (j10 >> 52)) & 511;
            int i16 = i15 == 511 ? size : i15 + i14;
            if (i14 < 0) {
                return;
            }
            while (i14 < jArr.length - 2 && i14 < i16) {
                int i17 = i14 + 2;
                long j11 = jArr[i17];
                int i18 = i12;
                char c15 = c12;
                if ((((int) (j11 >> c15)) & i18) == i13) {
                    long j12 = jArr[i14];
                    int i19 = i14 + 1;
                    c10 = c13;
                    long j13 = jArr[i19];
                    i10 = i13;
                    jArr[i14] = ((((int) j12) + deltaY) & 4294967295L) | ((((int) (j12 >> 32)) + deltaX) << 32);
                    jArr[i19] = ((((int) j13) + deltaY) & 4294967295L) | ((((int) (j13 >> 32)) + deltaX) << 32);
                    jArr[i17] = LockFreeTaskQueueCore.CLOSED_MASK | j11;
                    c11 = 511;
                    if ((((int) (j11 >> c10)) & 511) > 0) {
                        jArr2[i11] = (((i14 + 3) & i18) << c15) | (RectListKt.EverythingButParentId & j11);
                        i11++;
                    }
                } else {
                    i10 = i13;
                    c10 = c13;
                    c11 = c14;
                }
                i14 += 3;
                i12 = i18;
                c12 = c15;
                c14 = c11;
                c13 = c10;
                i13 = i10;
            }
        }
    }

    public final void forEachIntersection(int x9, int y9, Function1<? super Integer, Unit> block) {
        long j10 = (y9 & 4294967295L) | (x9 << 32);
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if (((((j10 - jArr[i11]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i11 + 1] - j10) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i11 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }
}
