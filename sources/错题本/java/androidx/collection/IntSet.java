package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import io.reactivex.annotations.SchedulerSupport;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000b\u001a\u00020\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\u0012JA\u0010\u0016\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00140\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0017JA\u0010\u0019\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u0005\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\fJA\u0010\u001b\u001a\u00020\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&J[\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0014\b\u0004\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u00100R\u001c\u00103\u001a\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0003R\u001c\u00107\u001a\u0002068\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b7\u00108\u0012\u0004\b9\u0010\u0003R\u0016\u0010:\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0011\u0010>\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0011\u0010@\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b?\u0010\f\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, m5110d2 = {"Landroidx/collection/IntSet;", "", "<init>", "()V", "", "any", "()Z", SchedulerSupport.NONE, "isEmpty", "isNotEmpty", "", "first", "()I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)I", "index", "Ld6/s;", "block", "forEachIndex", "(Lr6/c;)V", "forEach", "all", "(Lr6/c;)Z", "count", "contains", "(I)Z", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(I)I", "findElementIndex", "", "metadata", "[J", "getMetadata$annotations", "", "elements", "[I", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableIntSet;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,884:1\n255#1,4:885\n225#1,7:889\n236#1,3:897\n239#1,9:901\n259#1:910\n255#1,4:911\n225#1,7:915\n236#1,3:923\n239#1,9:927\n259#1:936\n225#1,7:939\n236#1,3:947\n239#1,9:951\n255#1,4:960\n225#1,7:964\n236#1,3:972\n239#1,9:976\n259#1:985\n255#1,4:986\n225#1,7:990\n236#1,3:998\n239#1,9:1002\n259#1:1011\n255#1,4:1012\n225#1,7:1016\n236#1,3:1024\n239#1,9:1028\n259#1:1037\n425#1:1038\n426#1:1042\n428#1,2:1044\n430#1,3:1047\n433#1:1053\n434#1:1057\n435#1:1059\n436#1,4:1062\n442#1:1067\n443#1,8:1069\n255#1,4:1077\n225#1,7:1081\n236#1,3:1089\n239#1,9:1093\n259#1:1102\n255#1,4:1103\n225#1,7:1107\n236#1,3:1115\n239#1,9:1119\n259#1:1128\n255#1,4:1129\n225#1,7:1133\n236#1,3:1141\n239#1,9:1145\n259#1:1154\n255#1,4:1155\n225#1,7:1159\n236#1,3:1167\n239#1,9:1171\n259#1:1180\n255#1,4:1181\n225#1,7:1185\n236#1,3:1193\n239#1,9:1197\n259#1:1206\n350#1,11:1223\n255#1,4:1234\n225#1,7:1238\n236#1,3:1246\n239#1,2:1250\n361#1,10:1252\n242#1,6:1262\n259#1:1268\n371#1,2:1269\n350#1,11:1271\n255#1,4:1282\n225#1,7:1286\n236#1,3:1294\n239#1,2:1298\n361#1,10:1300\n242#1,6:1310\n259#1:1316\n371#1,2:1317\n350#1,11:1319\n255#1,4:1330\n225#1,7:1334\n236#1,3:1342\n239#1,2:1346\n361#1,10:1348\n242#1,6:1358\n259#1:1364\n371#1,2:1365\n350#1,11:1367\n255#1,4:1378\n225#1,7:1382\n236#1,3:1390\n239#1,2:1394\n361#1,10:1396\n242#1,6:1406\n259#1:1412\n371#1,2:1413\n350#1,11:1415\n255#1,4:1426\n225#1,7:1430\n236#1,3:1438\n239#1,2:1442\n361#1,10:1444\n242#1,6:1454\n259#1:1460\n371#1,2:1461\n1399#2:896\n1270#2:900\n1399#2:922\n1270#2:926\n1399#2:937\n1270#2:938\n1399#2:946\n1270#2:950\n1399#2:971\n1270#2:975\n1399#2:997\n1270#2:1001\n1399#2:1023\n1270#2:1027\n1179#2:1043\n1175#2:1046\n1372#2,3:1050\n1386#2,3:1054\n1312#2:1058\n1303#2:1060\n1297#2:1061\n1309#2:1066\n1393#2:1068\n1399#2:1088\n1270#2:1092\n1399#2:1114\n1270#2:1118\n1399#2:1140\n1270#2:1144\n1399#2:1166\n1270#2:1170\n1399#2:1192\n1270#2:1196\n1179#2:1210\n1175#2:1211\n1372#2,3:1212\n1386#2,3:1215\n1312#2:1218\n1303#2:1219\n1297#2:1220\n1309#2:1221\n1393#2:1222\n1399#2:1245\n1270#2:1249\n1399#2:1293\n1270#2:1297\n1399#2:1341\n1270#2:1345\n1399#2:1389\n1270#2:1393\n1399#2:1437\n1270#2:1441\n880#3,3:1039\n880#3,3:1207\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSet\n*L\n197#1:885,4\n197#1:889,7\n197#1:897,3\n197#1:901,9\n197#1:910\n218#1:911,4\n218#1:915,7\n218#1:923,3\n218#1:927,9\n218#1:936\n258#1:939,7\n258#1:947,3\n258#1:951,9\n269#1:960,4\n269#1:964,7\n269#1:972,3\n269#1:976,9\n269#1:985\n281#1:986,4\n281#1:990,7\n281#1:998,3\n281#1:1002,9\n281#1:1011\n298#1:1012,4\n298#1:1016,7\n298#1:1024,3\n298#1:1028,9\n298#1:1037\n307#1:1038\n307#1:1042\n307#1:1044,2\n307#1:1047,3\n307#1:1053\n307#1:1057\n307#1:1059\n307#1:1062,4\n307#1:1067\n307#1:1069,8\n327#1:1077,4\n327#1:1081,7\n327#1:1089,3\n327#1:1093,9\n327#1:1102\n360#1:1103,4\n360#1:1107,7\n360#1:1115,3\n360#1:1119,9\n360#1:1128\n360#1:1129,4\n360#1:1133,7\n360#1:1141,3\n360#1:1145,9\n360#1:1154\n381#1:1155,4\n381#1:1159,7\n381#1:1167,3\n381#1:1171,9\n381#1:1180\n405#1:1181,4\n405#1:1185,7\n405#1:1193,3\n405#1:1197,9\n405#1:1206\n-1#1:1223,11\n-1#1:1234,4\n-1#1:1238,7\n-1#1:1246,3\n-1#1:1250,2\n-1#1:1252,10\n-1#1:1262,6\n-1#1:1268\n-1#1:1269,2\n-1#1:1271,11\n-1#1:1282,4\n-1#1:1286,7\n-1#1:1294,3\n-1#1:1298,2\n-1#1:1300,10\n-1#1:1310,6\n-1#1:1316\n-1#1:1317,2\n-1#1:1319,11\n-1#1:1330,4\n-1#1:1334,7\n-1#1:1342,3\n-1#1:1346,2\n-1#1:1348,10\n-1#1:1358,6\n-1#1:1364\n-1#1:1365,2\n-1#1:1367,11\n-1#1:1378,4\n-1#1:1382,7\n-1#1:1390,3\n-1#1:1394,2\n-1#1:1396,10\n-1#1:1406,6\n-1#1:1412\n-1#1:1413,2\n-1#1:1415,11\n-1#1:1426,4\n-1#1:1430,7\n-1#1:1438,3\n-1#1:1442,2\n-1#1:1444,10\n-1#1:1454,6\n-1#1:1460\n-1#1:1461,2\n197#1:896\n197#1:900\n218#1:922\n218#1:926\n231#1:937\n238#1:938\n258#1:946\n258#1:950\n269#1:971\n269#1:975\n281#1:997\n281#1:1001\n298#1:1023\n298#1:1027\n307#1:1043\n307#1:1046\n307#1:1050,3\n307#1:1054,3\n307#1:1058\n307#1:1060\n307#1:1061\n307#1:1066\n307#1:1068\n327#1:1088\n327#1:1092\n360#1:1114\n360#1:1118\n360#1:1140\n360#1:1144\n381#1:1166\n381#1:1170\n405#1:1192\n405#1:1196\n426#1:1210\n429#1:1211\n432#1:1212,3\n433#1:1215,3\n434#1:1218\n435#1:1219\n435#1:1220\n439#1:1221\n442#1:1222\n-1#1:1245\n-1#1:1249\n-1#1:1293\n-1#1:1297\n-1#1:1341\n-1#1:1345\n-1#1:1389\n-1#1:1393\n-1#1:1437\n-1#1:1441\n307#1:1039,3\n425#1:1207,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntSet {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public int[] elements;

    @JvmField
    @NotNull
    public long[] metadata;

    public /* synthetic */ IntSet(AbstractC5824e abstractC5824e) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getElements$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntSet intSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return intSet.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean all(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128 && !((Boolean) predicate.invoke(Integer.valueOf(iArr[(i << 3) + i9]))).booleanValue()) {
                        return false;
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.elements
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            return r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.contains(int):boolean");
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.IntSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.IntSet r1 = (androidx.collection.IntSet) r1
            int r3 = r1._size
            int r5 = r0._size
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(int element) {
        int iHashCode = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i8 = i & 127;
        int i9 = this._capacity;
        int i10 = (i >>> 7) & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j7 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j8 = (i8 * ScatterMapKt.BitmaskLsb) ^ j7;
            for (long j9 = (~j8) & (j8 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i10) & i9;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int first() {
        /*
            r14 = this;
            int[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L41
            r3 = 0
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L36
            int r1 = r4 << 3
            int r1 = r1 + r9
            r0 = r0[r1]
            return r0
        L36:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3a:
            if (r7 != r8) goto L41
        L3c:
            if (r4 == r2) goto L41
            int r4 = r4 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The IntSet is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.first():int");
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        int[] iArr = this.elements;
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
                        block.invoke(Integer.valueOf(iArr[(i << 3) + i9]));
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
    public final void forEachIndex(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
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
                        AbstractC0037f.m72A(i << 3, i9, block);
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

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i9]) + iHashCode;
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = IntSetKt.getEmptyIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r15, r0)
            int[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L57
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L52
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L50
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4c
            r15 = 1
            return r15
        L4c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L50:
            if (r7 != r8) goto L57
        L52:
            if (r4 == r2) goto L57
            int r4 = r4 + 1
            goto L10
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.any(r6.c):boolean");
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int count(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128 && ((Boolean) predicate.invoke(Integer.valueOf(iArr[(i << 3) + i10]))).booleanValue()) {
                        i8++;
                    }
                    j7 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i == length) {
                return i8;
            }
            i++;
        }
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        AbstractC5830k.m5330g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[PHI: r11
      0x00ae: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x0067, B:42:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntSet r20, java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25, p152r6.InterfaceC6471c r26, int r27, java.lang.Object r28) {
        /*
            r0 = r20
            r1 = r26
            if (r28 != 0) goto Lc1
            r2 = r27 & 1
            if (r2 == 0) goto Ld
            java.lang.String r2 = ", "
            goto Lf
        Ld:
            r2 = r21
        Lf:
            r3 = r27 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L17
            r3 = r4
            goto L19
        L17:
            r3 = r22
        L19:
            r5 = r27 & 4
            if (r5 == 0) goto L1e
            goto L20
        L1e:
            r4 = r23
        L20:
            r5 = r27 & 8
            if (r5 == 0) goto L26
            r5 = -1
            goto L28
        L26:
            r5 = r24
        L28:
            r6 = r27 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = "..."
            goto L31
        L2f:
            r6 = r25
        L31:
            java.lang.String r7 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r2, r7)
            java.lang.String r7 = "prefix"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r3, r7)
            java.lang.String r7 = "postfix"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r4, r7)
            java.lang.String r7 = "truncated"
            java.lang.String r8 = "transform"
            java.lang.StringBuilder r3 = android.support.v4.media.AbstractC0037f.m96u(r6, r7, r1, r8, r3)
            int[] r7 = r0.elements
            long[] r0 = r0.metadata
            int r8 = r0.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lb3
            r10 = 0
            r11 = 0
        L56:
            r12 = r0[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Lae
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L73:
            if (r9 >= r14) goto Lab
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto La2
            int r16 = r10 << 3
            int r16 = r16 + r9
            r16 = r7[r16]
            if (r11 != r5) goto L8b
            r3.append(r6)
            goto Lb6
        L8b:
            if (r11 == 0) goto L90
            r3.append(r2)
        L90:
            r21 = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Object r15 = r1.invoke(r15)
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r3.append(r15)
            int r11 = r11 + 1
            goto La4
        La2:
            r21 = r15
        La4:
            long r12 = r12 >> r21
            int r9 = r9 + 1
            r15 = r21
            goto L73
        Lab:
            r9 = r15
            if (r14 != r9) goto Lb3
        Lae:
            if (r10 == r8) goto Lb3
            int r10 = r10 + 1
            goto L56
        Lb3:
            r3.append(r4)
        Lb6:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r1)
            return r0
        Lc1:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: joinToString"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString$default(androidx.collection.IntSet, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, r6.c, int, java.lang.Object):java.lang.String");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        int i;
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i8 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j7 & 255) < 128) {
                            int i13 = iArr[(i8 << 3) + i12];
                            i = i10;
                            if (i9 == limit) {
                                sbM95t.append(truncated);
                                break loop0;
                            }
                            if (i9 != 0) {
                                sbM95t.append(separator);
                            }
                            sbM95t.append(i13);
                            i9++;
                        } else {
                            i = i10;
                        }
                        j7 >>= i;
                        i12++;
                        i10 = i;
                    }
                    if (i11 != i10) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
            sbM95t.append(postfix);
        } else {
            sbM95t.append(postfix);
        }
        String string = sbM95t.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int first(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r15, r0)
            int[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r15.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L4b
            return r10
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L10
        L56:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.first(r6.c):int");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull InterfaceC6471c transform) {
        int i;
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        StringBuilder sbM96u = AbstractC0037f.m96u(truncated, "truncated", transform, "transform", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i8 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j7 & 255) < 128) {
                            int i13 = iArr[(i8 << 3) + i12];
                            i = i10;
                            if (i9 == limit) {
                                sbM96u.append(truncated);
                                break loop0;
                            }
                            if (i9 != 0) {
                                sbM96u.append(separator);
                            }
                            sbM96u.append((CharSequence) transform.invoke(Integer.valueOf(i13)));
                            i9++;
                        } else {
                            i = i10;
                        }
                        j7 >>= i;
                        i12++;
                        i10 = i;
                    }
                    if (i11 != i10) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
            sbM96u.append(postfix);
        } else {
            sbM96u.append(postfix);
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        int i8;
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM96u = AbstractC0037f.m96u(charSequence, "postfix", interfaceC6471c, "transform", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j7 = jArr[i9];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i9 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j7 & 255) < 128) {
                            int i14 = iArr[(i9 << 3) + i13];
                            if (i10 == i) {
                                sbM96u.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sbM96u.append(separator);
                            }
                            i8 = i11;
                            sbM96u.append((CharSequence) interfaceC6471c.invoke(Integer.valueOf(i14)));
                            i10++;
                        } else {
                            i8 = i11;
                        }
                        j7 >>= i8;
                        i13++;
                        i11 = i8;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
            sbM96u.append(charSequence);
        } else {
            sbM96u.append(charSequence);
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[PHI: r10
      0x0078: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0037, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = android.support.v4.media.AbstractC0037f.m96u(r3, r5, r4, r6, r2)
            int[] r5 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
            r10 = 0
        L29:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L78
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L43:
            if (r15 >= r13) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L72
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L5e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L80
        L5e:
            if (r10 == 0) goto L63
            r2.append(r1)
        L63:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r4.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
        L72:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L43
        L76:
            if (r13 != r14) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L29
        L7d:
            r2.append(r3)
        L80:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, r6.c):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[PHI: r9
      0x006f: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0030, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r20, @org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r3)
            java.lang.String r3 = "prefix"
            java.lang.String r4 = "transform"
            r5 = r21
            java.lang.StringBuilder r3 = android.support.v4.media.AbstractC0037f.m96u(r5, r3, r2, r4, r5)
            int[] r4 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L74
            r8 = 0
            r9 = 0
        L22:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6f
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L6d
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L69
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            r7 = -1
            if (r9 != r7) goto L55
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L79
        L55:
            if (r9 == 0) goto L5a
            r3.append(r1)
        L5a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.lang.Object r7 = r2.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3.append(r7)
            int r9 = r9 + 1
        L69:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L3c
        L6d:
            if (r12 != r13) goto L74
        L6f:
            if (r8 == r6) goto L74
            int r8 = r8 + 1
            goto L22
        L74:
            java.lang.String r1 = ""
            r3.append(r1)
        L79:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, r6.c):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[PHI: r10
      0x0073: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0032, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            int[] r5 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L78
            r9 = 0
            r10 = 0
        L24:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L73
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L71
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6d
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L59
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L7b
        L59:
            if (r10 == 0) goto L5e
            r3.append(r1)
        L5e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
        L6d:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L3e
        L71:
            if (r13 != r14) goto L78
        L73:
            if (r9 == r7) goto L78
            int r9 = r9 + 1
            goto L24
        L78:
            r3.append(r4)
        L7b:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, r6.c):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[PHI: r9
      0x006b: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002a, B:18:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            int[] r4 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L70
            r8 = 0
            r9 = 0
        L1c:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6b
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L36:
            if (r14 >= r12) goto L69
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L65
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            r7 = -1
            if (r9 != r7) goto L4f
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L73
        L4f:
            if (r9 == 0) goto L56
            java.lang.String r7 = ", "
            r2.append(r7)
        L56:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.append(r7)
            int r9 = r9 + 1
        L65:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L36
        L69:
            if (r12 != r13) goto L70
        L6b:
            if (r8 == r6) goto L70
            int r8 = r8 + 1
            goto L1c
        L70:
            r2.append(r3)
        L73:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(r6.c):java.lang.String");
    }
}
