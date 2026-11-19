package androidx.compose.p012ui.spatial;

import androidx.autofill.HintConstants;
import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
@Metadata(m13412d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0006H\u0082\bJ\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\rJÇ\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u008b\u0001\u0010\u001b\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u001cH\u0086\bJ1\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\bJ=\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00062*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ-\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ=\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0(H\u0086\bJ5\u0010)\u001a\u00020\r2*\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0$H\u0086\bJ)\u0010*\u001a\u00020\r2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r0+H\u0086\bJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006JL\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u000fJ\u000e\u00102\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u00103\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u0006J.\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J5\u00105\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J \u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0004H\u0002J.\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010>\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J \u0010>\u001a\u00020\r2\u0006\u0010A\u001a\u00020,2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002J4\u0010B\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0CR\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m13413d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "()V", "items", "", "itemsSize", "", "size", "getSize", "()I", "stack", "allocateItemsIndex", "clearUpdated", "", "contains", "", "value", "debugString", "", "defragment", "findKNearestNeighbors", "searchAxis", "k", "l", "t", "r", "b", "block", "Lkotlin/Function6;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "score", "id", "findNearestNeighbor", "forEachIntersectingRectWithValueAt", "index", "Lkotlin/Function5;", "forEachIntersection", "x", "y", "Lkotlin/Function1;", "forEachRect", "forEachUpdatedRect", "Lkotlin/Function3;", "", "indexOf", "insert", "parentId", "focusable", "gesturable", "markUpdated", "metaFor", "move", "neighborsScoredByDistance", "", "neighborsScoredByDistance$ui_release", "remove", "resizeStorage", "actualSize", "currentSize", "currentItems", "update", "updateSubhierarchy", "deltaX", "deltaY", "stackMeta", "withRect", "Lkotlin/Function4;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
        int i9 = this.itemsSize;
        int i10 = i9 + 3;
        this.itemsSize = i10;
        int length = jArr.length;
        if (length <= i10) {
            resizeStorage(length, i9, jArr);
        }
        return i9;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i9, int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10, int i15, Object obj) {
        boolean z11;
        RectList rectList2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = (i15 & 32) != 0 ? -1 : i14;
        boolean z12 = (i15 & 64) != 0 ? false : z9;
        if ((i15 & 128) != 0) {
            z11 = false;
            i16 = i9;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
            rectList2 = rectList;
        } else {
            z11 = z10;
            rectList2 = rectList;
            i16 = i9;
            i17 = i10;
            i18 = i11;
            i19 = i12;
            i20 = i13;
        }
        rectList2.insert(i16, i17, i18, i19, i20, i21, z12, z11);
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
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            int i11 = i10 + 2;
            jArr[i11] = jArr[i11] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int value) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & RectListKt.Lower26Bits) == i9) {
                return true;
            }
        }
        return false;
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            long j9 = jArr[i10];
            long j10 = jArr[i10 + 1];
            long j11 = jArr[i10 + 2];
            sb.append("id=" + (((int) j11) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j9 >> 32)) + ',' + ((int) j9) + ',' + ((int) (j10 >> 32)) + ',' + ((int) j10) + "], parent=" + (((int) (j11 >> 26)) & RectListKt.Lower26Bits));
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
        int i9 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i10 = 0;
        for (int i11 = 0; i11 < jArr.length - 2 && i10 < jArr2.length - 2 && i11 < i9; i11 += 3) {
            int i12 = i11 + 2;
            if (jArr[i12] != RectListKt.TombStone) {
                jArr2[i10] = jArr[i11];
                jArr2[i10 + 1] = jArr[i11 + 1];
                jArr2[i10 + 2] = jArr[i12];
                i10 += 3;
            }
        }
        this.itemsSize = i10;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int searchAxis, int k9, int l9, int t9, int r9, int b10, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i9;
        int[] iArrNeighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(searchAxis, l9, t9, r9, b10);
        long[] jArr = this.items;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= k9) {
            int iMin = Integer.MAX_VALUE;
            int i13 = 0;
            while (i13 < iArrNeighborsScoredByDistance$ui_release.length) {
                int i14 = iArrNeighborsScoredByDistance$ui_release[i13];
                if (i14 > i10) {
                    iMin = Math.min(iMin, i14);
                }
                if (i14 == i10) {
                    int i15 = i13 * 3;
                    long j9 = jArr[i15];
                    long j10 = jArr[i15 + 1];
                    i9 = i10;
                    block.invoke(Integer.valueOf(i14), Integer.valueOf(((int) jArr[i15 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) j9), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                    i12++;
                    if (i12 == k9) {
                        return;
                    }
                } else {
                    i9 = i10;
                }
                i13++;
                i10 = i9;
            }
            i11++;
            i10 = iMin;
        }
    }

    public final int findNearestNeighbor(int searchAxis, int l9, int t9, int r9, int b10) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i9; i12 += 3) {
            long j9 = jArr[i12];
            int i13 = i12 + 1;
            long j10 = jArr[i13];
            int iDistanceScore = RectListKt.distanceScore(searchAxis, l9, t9, r9, b10, (int) (j9 >> 32), (int) j9, (int) (j10 >> 32), (int) j10);
            boolean z9 = (iDistanceScore < i10) & (iDistanceScore > 0);
            if (z9) {
                i10 = iDistanceScore;
            }
            if (z9) {
                i11 = i13;
            }
        }
        if (i11 < 0 || i11 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i11]) & RectListKt.Lower26Bits;
    }

    public final void forEachIntersectingRectWithValueAt(int index, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        long j9 = jArr[index];
        long j10 = jArr[index + 1];
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if (i10 != index) {
                long j11 = jArr[i10];
                long j12 = jArr[i10 + 1];
                if (((((j10 - j11) - InlineClassHelperKt.Uint64Low32) | ((j12 - j9) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12), Integer.valueOf(((int) jArr[i10 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int l9, int t9, int r9, int b10, Function1<? super Integer, Unit> block) {
        long j9 = (l9 << 32) | (t9 & 4294967295L);
        long j10 = (r9 << 32) | (b10 & 4294967295L);
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if (((((j10 - jArr[i10]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i10 + 1] - j9) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i10 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            long j9 = jArr[i10];
            long j10 = jArr[i10 + 1];
            block.invoke(Integer.valueOf(((int) jArr[i10 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) j9), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
        }
    }

    public final void forEachUpdatedRect(Function3<? super Integer, ? super Long, ? super Long, Unit> block) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            long j9 = jArr[i10 + 2];
            if ((((int) (j9 >> 61)) & 1) != 0) {
                block.invoke(Integer.valueOf(((int) j9) & RectListKt.Lower26Bits), Long.valueOf(jArr[i10]), Long.valueOf(jArr[i10 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int value) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & RectListKt.Lower26Bits) == i9) {
                return i11;
            }
        }
        return -1;
    }

    public final void insert(int value, int l9, int t9, int r9, int b10, int parentId, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        int i10 = i9 + 3;
        this.itemsSize = i10;
        int length = jArr.length;
        if (length <= i10) {
            resizeStorage(length, i9, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i9] = (l9 << 32) | (t9 & 4294967295L);
        jArr2[i9 + 1] = (r9 << 32) | (b10 & 4294967295L);
        long j9 = ((gesturable ? 1L : 0L) << 63) | ((focusable ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i11 = parentId & RectListKt.Lower26Bits;
        jArr2[i9 + 2] = j9 | (i11 << 26) | (value & RectListKt.Lower26Bits);
        if (parentId < 0) {
            return;
        }
        for (int i12 = i9 - 3; i12 >= 0; i12 -= 3) {
            int i13 = i12 + 2;
            long j10 = jArr2[i13];
            if ((((int) j10) & RectListKt.Lower26Bits) == i11) {
                jArr2[i13] = (j10 & RectListKt.EverythingButLastChildOffset) | (((i9 - i12) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int value) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            long j9 = jArr[i12];
            if ((((int) j9) & RectListKt.Lower26Bits) == i9) {
                jArr[i12] = LockFreeTaskQueueCore.CLOSED_MASK | j9;
                return;
            }
        }
    }

    public final long metaFor(int value) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j9 = jArr[i11 + 2];
            if ((((int) j9) & RectListKt.Lower26Bits) == i9) {
                return j9;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int value, int l9, int t9, int r9, int b10) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            long j9 = jArr[i12];
            if ((((int) j9) & RectListKt.Lower26Bits) == i9) {
                long j10 = jArr[i11];
                jArr[i11] = (t9 & 4294967295L) | (l9 << 32);
                int i13 = i11;
                jArr[i11 + 1] = (b10 & 4294967295L) | (r9 << 32);
                jArr[i12] = LockFreeTaskQueueCore.CLOSED_MASK | j9;
                int i14 = l9 - ((int) (j10 >> 32));
                int i15 = t9 - ((int) j10);
                if ((i14 != 0) | (i15 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j9) | (((i13 + 3) & RectListKt.Lower26Bits) << 26), i14, i15);
                }
                return true;
            }
        }
        return false;
    }

    public final int[] neighborsScoredByDistance$ui_release(int searchAxis, int l9, int t9, int r9, int b10) {
        long[] jArr = this.items;
        int i9 = this.itemsSize / 3;
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = i10 * 3;
            if (i11 < 0 || i11 >= jArr.length - 1) {
                break;
            }
            long j9 = jArr[i11];
            long j10 = jArr[i11 + 1];
            iArr[i10] = RectListKt.distanceScore(searchAxis, l9, t9, r9, b10, (int) (j9 >> 32), (int) j9, (int) (j10 >> 32), (int) j10);
        }
        return iArr;
    }

    public final boolean remove(int value) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            if ((((int) jArr[i12]) & RectListKt.Lower26Bits) == i9) {
                jArr[i11] = -1;
                jArr[i11 + 1] = -1;
                jArr[i12] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l9, int t9, int r9, int b10) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            long j9 = jArr[i12];
            if ((((int) j9) & RectListKt.Lower26Bits) == i9) {
                jArr[i11] = (l9 << 32) | (t9 & 4294967295L);
                jArr[i11 + 1] = (r9 << 32) | (b10 & 4294967295L);
                jArr[i12] = LockFreeTaskQueueCore.CLOSED_MASK | j9;
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (id & RectListKt.Lower26Bits), deltaX, deltaY);
    }

    public final boolean withRect(int value, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i9 = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i10 = this.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & RectListKt.Lower26Bits) == i9) {
                long j9 = jArr[i11];
                long j10 = jArr[i11 + 1];
                block.invoke(Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) j9), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                return true;
            }
        }
        return false;
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        int i9;
        char c10;
        char c11;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = stackMeta;
        int i10 = 1;
        while (i10 > 0) {
            i10--;
            long j9 = jArr2[i10];
            int i11 = RectListKt.Lower26Bits;
            int i12 = ((int) j9) & RectListKt.Lower26Bits;
            char c12 = 26;
            int i13 = ((int) (j9 >> 26)) & RectListKt.Lower26Bits;
            char c13 = '4';
            char c14 = 511;
            int i14 = ((int) (j9 >> 52)) & 511;
            int i15 = i14 == 511 ? size : i14 + i13;
            if (i13 < 0) {
                return;
            }
            while (i13 < jArr.length - 2 && i13 < i15) {
                int i16 = i13 + 2;
                long j10 = jArr[i16];
                int i17 = i11;
                char c15 = c12;
                if ((((int) (j10 >> c15)) & i17) == i12) {
                    long j11 = jArr[i13];
                    int i18 = i13 + 1;
                    c10 = c13;
                    long j12 = jArr[i18];
                    i9 = i12;
                    jArr[i13] = ((((int) j11) + deltaY) & 4294967295L) | ((((int) (j11 >> 32)) + deltaX) << 32);
                    jArr[i18] = ((((int) j12) + deltaY) & 4294967295L) | ((((int) (j12 >> 32)) + deltaX) << 32);
                    jArr[i16] = LockFreeTaskQueueCore.CLOSED_MASK | j10;
                    c11 = 511;
                    if ((((int) (j10 >> c10)) & 511) > 0) {
                        jArr2[i10] = (((i13 + 3) & i17) << c15) | (RectListKt.EverythingButParentId & j10);
                        i10++;
                    }
                } else {
                    i9 = i12;
                    c10 = c13;
                    c11 = c14;
                }
                i13 += 3;
                i11 = i17;
                c12 = c15;
                c14 = c11;
                c13 = c10;
                i12 = i9;
            }
        }
    }

    public final void forEachIntersection(int x9, int y9, Function1<? super Integer, Unit> block) {
        long j9 = (y9 & 4294967295L) | (x9 << 32);
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if (((((j9 - jArr[i10]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i10 + 1] - j9) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i10 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }
}
