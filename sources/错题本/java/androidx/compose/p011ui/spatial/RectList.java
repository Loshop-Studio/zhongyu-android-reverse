package androidx.compose.p011ui.spatial;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;
import p152r6.InterfaceC6477i;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J5\u0010#\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\"J%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010%J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J;\u0010*\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00042$\u0010)\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0(¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b,\u0010 J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b/\u00100JD\u00102\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b01H\u0086\b¢\u0006\u0004\b2\u00103J<\u00105\u001a\u00020\u000b2*\u0010)\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b04H\u0086\b¢\u0006\u0004\b5\u00106J4\u00102\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b01H\u0086\b¢\u0006\u0004\b2\u00109JD\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00042*\u0010)\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b04H\u0086\b¢\u0006\u0004\b;\u0010<J7\u0010A\u001a\u00020>2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b?\u0010@JÎ\u0001\u0010G\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u008b\u0001\u0010)\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000b0CH\u0086\b¢\u0006\u0004\bG\u0010HJ8\u0010I\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u000b¢\u0006\u0004\bK\u0010\u0003J\r\u0010L\u001a\u00020\u000b¢\u0006\u0004\bL\u0010\u0003J0\u0010N\u001a\u00020\u000b2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0MH\u0086\b¢\u0006\u0004\bN\u0010OJ\r\u0010Q\u001a\u00020P¢\u0006\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010V\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0011\u0010Y\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bX\u0010\u0006¨\u0006Z"}, m5110d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "", "allocateItemsIndex", "()I", "actualSize", "currentSize", "", "currentItems", "Ld6/s;", "resizeStorage", "(II[J)V", "", "stackMeta", "deltaX", "deltaY", "updateSubhierarchy", "(JII)V", "value", "l", "t", "r", "b", "parentId", "", "focusable", "gesturable", "insert", "(IIIIIIZZ)V", "remove", "(I)Z", "update", "(IIIII)Z", "move", "id", "(III)V", "markUpdated", "(I)V", "Lkotlin/Function4;", "block", "withRect", "(ILr6/g;)Z", "contains", "indexOf", "(I)I", "metaFor", "(I)J", "Lkotlin/Function1;", "forEachIntersection", "(IIIILr6/c;)V", "Lkotlin/Function5;", "forEachRect", "(Lr6/h;)V", "x", "y", "(IILr6/c;)V", "index", "forEachIntersectingRectWithValueAt", "(ILr6/h;)V", "searchAxis", "", "neighborsScoredByDistance$ui_release", "(IIIII)[I", "neighborsScoredByDistance", "k", "Lkotlin/Function6;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "score", "findKNearestNeighbors", "(IIIIIILr6/i;)V", "findNearestNeighbor", "(IIIII)I", "defragment", "clearUpdated", "Lkotlin/Function3;", "forEachUpdatedRect", "(Lr6/f;)V", "", "debugString", "()Ljava/lang/String;", "items", "[J", "stack", "itemsSize", "I", "getSize", "size", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n102#1,8:969\n787#2:977\n787#2:978\n803#2:979\n870#2:980\n804#2:981\n870#2:982\n805#2:983\n870#2:984\n806#2,3:985\n810#2:988\n828#2,2:989\n810#2:991\n810#2:992\n787#2:993\n787#2:994\n823#2:995\n810#2:996\n787#2:997\n787#2:998\n823#2:999\n837#2:1000\n839#2:1001\n818#2:1002\n803#2:1003\n870#2:1004\n804#2:1005\n870#2:1006\n805#2:1007\n870#2:1008\n806#2,3:1009\n810#2:1012\n812#2:1013\n815#2:1014\n812#2:1015\n837#2,3:1016\n787#2:1019\n837#2,3:1020\n787#2:1023\n823#2:1024\n815#2:1025\n818#2:1026\n810#2:1027\n823#2:1028\n810#2:1029\n837#2:1030\n839#2:1031\n837#2:1032\n839#2:1033\n810#2:1034\n810#2:1035\n810#2:1036\n787#2:1037\n787#2:1038\n860#2,2:1039\n810#2:1041\n810#2:1042\n837#2:1043\n839#2:1044\n837#2:1045\n839#2:1046\n787#2:1047\n860#2,2:1048\n810#2:1050\n860#2,2:1051\n837#2:1053\n839#2:1054\n837#2:1055\n839#2:1056\n810#2:1057\n837#2:1058\n839#2:1059\n837#2:1060\n839#2:1061\n810#2:1062\n837#2:1063\n839#2:1064\n837#2:1065\n839#2:1066\n837#2:1067\n839#2:1068\n837#2:1069\n839#2:1070\n810#2:1071\n825#2:1072\n835#2:1073\n810#2:1074\n810#2:1075\n812#2:1076\n837#2:1077\n839#2:1078\n837#2:1079\n839#2:1080\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:969,8\n151#1:977\n152#1:978\n154#1:979\n154#1:980\n154#1:981\n154#1:982\n154#1:983\n154#1:984\n154#1:985,3\n176#1:988\n183#1:989,2\n205#1:991\n234#1:992\n235#1:993\n236#1:994\n237#1:995\n260#1:996\n262#1:997\n263#1:998\n264#1:999\n265#1:1000\n266#1:1001\n268#1:1002\n281#1:1003\n281#1:1004\n281#1:1005\n281#1:1006\n281#1:1007\n281#1:1008\n281#1:1009,3\n320#1:1012\n321#1:1013\n322#1:1014\n328#1:1015\n331#1:1016,3\n331#1:1019\n333#1:1020,3\n333#1:1023\n334#1:1024\n335#1:1025\n339#1:1026\n355#1:1027\n356#1:1028\n372#1:1029\n376#1:1030\n377#1:1031\n378#1:1032\n379#1:1033\n396#1:1034\n418#1:1035\n435#1:1036\n454#1:1037\n455#1:1038\n463#1:1039,2\n467#1:1041\n485#1:1042\n486#1:1043\n487#1:1044\n488#1:1045\n489#1:1046\n505#1:1047\n513#1:1048,2\n515#1:1050\n544#1:1051,2\n546#1:1053\n547#1:1054\n548#1:1055\n549#1:1056\n550#1:1057\n582#1:1058\n583#1:1059\n584#1:1060\n585#1:1061\n634#1:1062\n635#1:1063\n636#1:1064\n637#1:1065\n638#1:1066\n669#1:1067\n670#1:1068\n671#1:1069\n672#1:1070\n682#1:1071\n719#1:1072\n731#1:1073\n735#1:1074\n753#1:1075\n754#1:1076\n755#1:1077\n756#1:1078\n757#1:1079\n758#1:1080\n*E\n"})
/* loaded from: classes2.dex */
public final class RectList {
    public static final int $stable = 8;

    @JvmField
    public int itemsSize;

    @JvmField
    @NotNull
    public long[] items = new long[192];

    @JvmField
    @NotNull
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i8 = i + 3;
        this.itemsSize = i8;
        int length = jArr.length;
        if (length <= i8) {
            resizeStorage(length, i, jArr);
        }
        return i;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, Object obj) {
        boolean z10;
        RectList rectList2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = (i13 & 32) != 0 ? -1 : i12;
        boolean z11 = (i13 & 64) != 0 ? false : z8;
        if ((i13 & 128) != 0) {
            z10 = false;
            i14 = i;
            i15 = i8;
            i16 = i9;
            i17 = i10;
            i18 = i11;
            rectList2 = rectList;
        } else {
            z10 = z9;
            rectList2 = rectList;
            i14 = i;
            i15 = i8;
            i16 = i9;
            i17 = i10;
            i18 = i11;
        }
        rectList2.insert(i14, i15, i16, i17, i18, i19, z11, z10);
    }

    private final void resizeStorage(int actualSize, int currentSize, long[] currentItems) {
        int iMax = Math.max(actualSize * 2, currentSize + 3);
        long[] jArrCopyOf = Arrays.copyOf(currentItems, iMax);
        AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        AbstractC5830k.m5329f(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            int i9 = i8 + 2;
            jArr[i9] = jArr[i9] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            if ((((int) jArr[i9 + 2]) & RectListKt.Lower26Bits) == i) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            long j7 = jArr[i8];
            long j8 = jArr[i8 + 1];
            long j9 = jArr[i8 + 2];
            sb.append("id=" + (((int) j9) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j7 >> 32)) + ',' + ((int) j7) + ',' + ((int) (j8 >> 32)) + ',' + ((int) j8) + "], parent=" + (((int) (j9 >> 26)) & RectListKt.Lower26Bits));
            sb.append('\n');
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i8 = 0;
        for (int i9 = 0; i9 < jArr.length - 2 && i8 < jArr2.length - 2 && i9 < i; i9 += 3) {
            int i10 = i9 + 2;
            if (jArr[i10] != RectListKt.TombStone) {
                jArr2[i8] = jArr[i9];
                jArr2[i8 + 1] = jArr[i9 + 1];
                jArr2[i8 + 2] = jArr[i10];
                i8 += 3;
            }
        }
        this.itemsSize = i8;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int searchAxis, int k8, int l, int t8, int r, int b6, @NotNull InterfaceC6477i block) {
        int i;
        int[] iArrNeighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(searchAxis, l, t8, r, b6);
        long[] jArr = this.items;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 <= k8) {
            int iMin = Integer.MAX_VALUE;
            int i11 = 0;
            while (i11 < iArrNeighborsScoredByDistance$ui_release.length) {
                int i12 = iArrNeighborsScoredByDistance$ui_release[i11];
                if (i12 > i8) {
                    iMin = Math.min(iMin, i12);
                }
                if (i12 == i8) {
                    int i13 = i11 * 3;
                    long j7 = jArr[i13];
                    long j8 = jArr[i13 + 1];
                    i = i8;
                    block.invoke(Integer.valueOf(i12), Integer.valueOf(((int) jArr[i13 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7), Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8));
                    i10++;
                    if (i10 == k8) {
                        return;
                    }
                } else {
                    i = i8;
                }
                i11++;
                i8 = i;
            }
            i9++;
            i8 = iMin;
        }
    }

    public final int findNearestNeighbor(int searchAxis, int l, int t8, int r, int b6) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i8 = Integer.MAX_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i; i10 += 3) {
            long j7 = jArr[i10];
            int i11 = i10 + 1;
            long j8 = jArr[i11];
            int iDistanceScore = RectListKt.distanceScore(searchAxis, l, t8, r, b6, (int) (j7 >> 32), (int) j7, (int) (j8 >> 32), (int) j8);
            boolean z8 = (iDistanceScore < i8) & (iDistanceScore > 0);
            if (z8) {
                i8 = iDistanceScore;
            }
            if (z8) {
                i9 = i11;
            }
        }
        if (i9 < 0 || i9 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i9]) & RectListKt.Lower26Bits;
    }

    public final void forEachIntersectingRectWithValueAt(int index, @NotNull InterfaceC6476h block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long j7 = jArr[index];
        long j8 = jArr[index + 1];
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            if (i8 != index) {
                long j9 = jArr[i8];
                long j10 = jArr[i8 + 1];
                if (((((j8 - j9) - InlineClassHelperKt.Uint64Low32) | ((j10 - j7) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) j9), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf(((int) jArr[i8 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int l, int t8, int r, int b6, @NotNull InterfaceC6471c block) {
        long j7 = (l << 32) | (t8 & 4294967295L);
        long j8 = (r << 32) | (b6 & 4294967295L);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            if (((((j8 - jArr[i8]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i8 + 1] - j7) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i8 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(@NotNull InterfaceC6476h block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            long j7 = jArr[i8];
            long j8 = jArr[i8 + 1];
            block.invoke(Integer.valueOf(((int) jArr[i8 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7), Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8));
        }
    }

    public final void forEachUpdatedRect(@NotNull InterfaceC6474f block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            long j7 = jArr[i8 + 2];
            if ((((int) (j7 >> 61)) & 1) != 0) {
                block.invoke(Integer.valueOf(((int) j7) & RectListKt.Lower26Bits), Long.valueOf(jArr[i8]), Long.valueOf(jArr[i8 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            if ((((int) jArr[i9 + 2]) & RectListKt.Lower26Bits) == i) {
                return i9;
            }
        }
        return -1;
    }

    public final void insert(int value, int l, int t8, int r, int b6, int parentId, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i8 = i + 3;
        this.itemsSize = i8;
        int length = jArr.length;
        if (length <= i8) {
            resizeStorage(length, i, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i] = (l << 32) | (t8 & 4294967295L);
        jArr2[i + 1] = (r << 32) | (b6 & 4294967295L);
        long j7 = ((gesturable ? 1L : 0L) << 63) | ((focusable ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i9 = parentId & RectListKt.Lower26Bits;
        jArr2[i + 2] = j7 | (i9 << 26) | (value & RectListKt.Lower26Bits);
        if (parentId < 0) {
            return;
        }
        for (int i10 = i - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j8 = jArr2[i11];
            if ((((int) j8) & RectListKt.Lower26Bits) == i9) {
                jArr2[i11] = (j8 & RectListKt.EverythingButLastChildOffset) | (((i - i10) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            int i10 = i9 + 2;
            long j7 = jArr[i10];
            if ((((int) j7) & RectListKt.Lower26Bits) == i) {
                jArr[i10] = 2305843009213693952L | j7;
                return;
            }
        }
    }

    public final long metaFor(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            long j7 = jArr[i9 + 2];
            if ((((int) j7) & RectListKt.Lower26Bits) == i) {
                return j7;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int value, int l, int t8, int r, int b6) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            int i10 = i9 + 2;
            long j7 = jArr[i10];
            if ((((int) j7) & RectListKt.Lower26Bits) == i) {
                long j8 = jArr[i9];
                jArr[i9] = (t8 & 4294967295L) | (l << 32);
                int i11 = i9;
                jArr[i9 + 1] = (b6 & 4294967295L) | (r << 32);
                jArr[i10] = 2305843009213693952L | j7;
                int i12 = l - ((int) (j8 >> 32));
                int i13 = t8 - ((int) j8);
                if ((i12 != 0) | (i13 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j7) | (((i11 + 3) & RectListKt.Lower26Bits) << 26), i12, i13);
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] neighborsScoredByDistance$ui_release(int searchAxis, int l, int t8, int r, int b6) {
        long[] jArr = this.items;
        int i = this.itemsSize / 3;
        int[] iArr = new int[i];
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 * 3;
            if (i9 < 0 || i9 >= jArr.length - 1) {
                break;
            }
            long j7 = jArr[i9];
            long j8 = jArr[i9 + 1];
            iArr[i8] = RectListKt.distanceScore(searchAxis, l, t8, r, b6, (int) (j7 >> 32), (int) j7, (int) (j8 >> 32), (int) j8);
        }
        return iArr;
    }

    public final boolean remove(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            int i10 = i9 + 2;
            if ((((int) jArr[i10]) & RectListKt.Lower26Bits) == i) {
                jArr[i9] = -1;
                jArr[i9 + 1] = -1;
                jArr[i10] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l, int t8, int r, int b6) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            int i10 = i9 + 2;
            long j7 = jArr[i10];
            if ((((int) j7) & RectListKt.Lower26Bits) == i) {
                jArr[i9] = (l << 32) | (t8 & 4294967295L);
                jArr[i9 + 1] = (r << 32) | (b6 & 4294967295L);
                jArr[i10] = 2305843009213693952L | j7;
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (id & RectListKt.Lower26Bits), deltaX, deltaY);
    }

    public final boolean withRect(int value, @NotNull InterfaceC6475g block) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            if ((((int) jArr[i9 + 2]) & RectListKt.Lower26Bits) == i) {
                long j7 = jArr[i9];
                long j8 = jArr[i9 + 1];
                block.invoke(Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7), Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8));
                return true;
            }
        }
        return false;
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        int i;
        char c;
        char c9;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = stackMeta;
        int i8 = 1;
        while (i8 > 0) {
            i8--;
            long j7 = jArr2[i8];
            int i9 = RectListKt.Lower26Bits;
            int i10 = ((int) j7) & RectListKt.Lower26Bits;
            char c10 = 26;
            int i11 = ((int) (j7 >> 26)) & RectListKt.Lower26Bits;
            char c11 = '4';
            char c12 = 511;
            int i12 = ((int) (j7 >> 52)) & 511;
            int i13 = i12 == 511 ? size : i12 + i11;
            if (i11 < 0) {
                return;
            }
            while (i11 < jArr.length - 2 && i11 < i13) {
                int i14 = i11 + 2;
                long j8 = jArr[i14];
                int i15 = i9;
                char c13 = c10;
                if ((((int) (j8 >> c13)) & i15) == i10) {
                    long j9 = jArr[i11];
                    int i16 = i11 + 1;
                    c = c11;
                    long j10 = jArr[i16];
                    i = i10;
                    jArr[i11] = ((((int) j9) + deltaY) & 4294967295L) | ((((int) (j9 >> 32)) + deltaX) << 32);
                    jArr[i16] = ((((int) j10) + deltaY) & 4294967295L) | ((((int) (j10 >> 32)) + deltaX) << 32);
                    jArr[i14] = 2305843009213693952L | j8;
                    c9 = 511;
                    if ((((int) (j8 >> c)) & 511) > 0) {
                        jArr2[i8] = (((i11 + 3) & i15) << c13) | (RectListKt.EverythingButParentId & j8);
                        i8++;
                    }
                } else {
                    i = i10;
                    c = c11;
                    c9 = c12;
                }
                i11 += 3;
                i9 = i15;
                c10 = c13;
                c12 = c9;
                c11 = c;
                i10 = i;
            }
        }
    }

    public final void forEachIntersection(int x3, int y2, @NotNull InterfaceC6471c block) {
        long j7 = (y2 & 4294967295L) | (x3 << 32);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i; i8 += 3) {
            if (((((j7 - jArr[i8]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i8 + 1] - j7) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i8 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }
}
