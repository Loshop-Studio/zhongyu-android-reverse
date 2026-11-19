package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import io.reactivex.annotations.SchedulerSupport;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001c\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010 \u001a\u00020\u001a26\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J6\u0010\"\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001dJ6\u0010#\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ-\u0010%\u001a\u00020\u00052\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J-\u0010\u0006\u001a\u00020\u00052\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010&J\r\u0010'\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J-\u0010'\u001a\u00020\u00162\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010)J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b-\u0010.JA\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020/H\u0007¢\u0006\u0004\b6\u00107J\u007f\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020/28\b\u0004\u00108\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020/0\u001eH\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u0010(J\u001a\u0010<\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b<\u0010+J\u000f\u0010=\u001a\u000205H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0004R$\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020E8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0004R\u001c\u0010I\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bI\u0010C\u0012\u0004\bJ\u0010\u0004R\u001c\u0010K\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010\u0004R\u001c\u0010N\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010L\u0012\u0004\bO\u0010\u0004R\u0011\u0010Q\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bP\u0010(R\u0011\u0010S\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010(\u0082\u0001\u0001T\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, m5110d2 = {"Landroidx/collection/ObjectLongMap;", "K", "", "<init>", "()V", "", "any", "()Z", SchedulerSupport.NONE, "isEmpty", "isNotEmpty", "key", "", "get", "(Ljava/lang/Object;)J", "defaultValue", "getOrDefault", "(Ljava/lang/Object;J)J", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lr6/a;)J", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Ld6/s;", "block", "forEachIndexed", "(Lr6/c;)V", "Lkotlin/Function2;", "value", "forEach", "(Lr6/e;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lr6/e;)Z", "count", "()I", "(Lr6/e;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "(J)Z", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/e;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findKeyIndex", "(Ljava/lang/Object;)I", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableObjectLongMap;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1051:1\n367#1,6:1054\n377#1,3:1061\n380#1,9:1065\n367#1,6:1074\n377#1,3:1081\n380#1,9:1085\n367#1,6:1094\n377#1,3:1101\n380#1,9:1105\n395#1,4:1114\n367#1,6:1118\n377#1,3:1125\n380#1,9:1129\n399#1:1138\n395#1,4:1139\n367#1,6:1143\n377#1,3:1150\n380#1,9:1154\n399#1:1163\n395#1,4:1164\n367#1,6:1168\n377#1,3:1175\n380#1,9:1179\n399#1:1188\n410#1,3:1189\n367#1,6:1192\n377#1,3:1199\n380#1,9:1203\n413#1:1212\n395#1,4:1213\n367#1,6:1217\n377#1,3:1224\n380#1,9:1228\n399#1:1237\n395#1,4:1238\n367#1,6:1242\n377#1,3:1249\n380#1,9:1253\n399#1:1262\n395#1,4:1263\n367#1,6:1267\n377#1,3:1274\n380#1,9:1278\n399#1:1287\n395#1,4:1288\n367#1,6:1292\n377#1,3:1299\n380#1,9:1303\n399#1:1312\n395#1,4:1313\n367#1,6:1317\n377#1,3:1324\n380#1,9:1328\n399#1:1337\n395#1,4:1338\n367#1,6:1342\n377#1,3:1349\n380#1,9:1353\n399#1:1362\n492#1,11:1379\n395#1,4:1390\n367#1,6:1394\n377#1,3:1401\n380#1,2:1405\n503#1,10:1407\n383#1,6:1417\n399#1:1423\n513#1,2:1424\n492#1,11:1426\n395#1,4:1437\n367#1,6:1441\n377#1,3:1448\n380#1,2:1452\n503#1,10:1454\n383#1,6:1464\n399#1:1470\n513#1,2:1471\n492#1,11:1473\n395#1,4:1484\n367#1,6:1488\n377#1,3:1495\n380#1,2:1499\n503#1,10:1501\n383#1,6:1511\n399#1:1517\n513#1,2:1518\n492#1,11:1520\n395#1,4:1531\n367#1,6:1535\n377#1,3:1542\n380#1,2:1546\n503#1,10:1548\n383#1,6:1558\n399#1:1564\n513#1,2:1565\n492#1,11:1567\n395#1,4:1578\n367#1,6:1582\n377#1,3:1589\n380#1,2:1593\n503#1,10:1595\n383#1,6:1605\n399#1:1611\n513#1,2:1612\n1399#2:1052\n1270#2:1053\n1399#2:1060\n1270#2:1064\n1399#2:1080\n1270#2:1084\n1399#2:1100\n1270#2:1104\n1399#2:1124\n1270#2:1128\n1399#2:1149\n1270#2:1153\n1399#2:1174\n1270#2:1178\n1399#2:1198\n1270#2:1202\n1399#2:1223\n1270#2:1227\n1399#2:1248\n1270#2:1252\n1399#2:1273\n1270#2:1277\n1399#2:1298\n1270#2:1302\n1399#2:1323\n1270#2:1327\n1399#2:1348\n1270#2:1352\n1165#2,3:1363\n1179#2:1366\n1175#2:1367\n1372#2,3:1368\n1386#2,3:1371\n1312#2:1374\n1303#2:1375\n1297#2:1376\n1309#2:1377\n1393#2:1378\n1399#2:1400\n1270#2:1404\n1399#2:1447\n1270#2:1451\n1399#2:1494\n1270#2:1498\n1399#2:1541\n1270#2:1545\n1399#2:1588\n1270#2:1592\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n*L\n398#1:1054,6\n398#1:1061,3\n398#1:1065,9\n405#1:1074,6\n405#1:1081,3\n405#1:1085,9\n412#1:1094,6\n412#1:1101,3\n412#1:1105,9\n417#1:1114,4\n417#1:1118,6\n417#1:1125,3\n417#1:1129,9\n417#1:1138\n423#1:1139,4\n423#1:1143,6\n423#1:1150,3\n423#1:1154,9\n423#1:1163\n433#1:1164,4\n433#1:1168,6\n433#1:1175,3\n433#1:1179,9\n433#1:1188\n445#1:1189,3\n445#1:1192,6\n445#1:1199,3\n445#1:1203,9\n445#1:1212\n467#1:1213,4\n467#1:1217,6\n467#1:1224,3\n467#1:1228,9\n467#1:1237\n502#1:1238,4\n502#1:1242,6\n502#1:1249,3\n502#1:1253,9\n502#1:1262\n502#1:1263,4\n502#1:1267,6\n502#1:1274,3\n502#1:1278,9\n502#1:1287\n523#1:1288,4\n523#1:1292,6\n523#1:1299,3\n523#1:1303,9\n523#1:1312\n549#1:1313,4\n549#1:1317,6\n549#1:1324,3\n549#1:1328,9\n549#1:1337\n571#1:1338,4\n571#1:1342,6\n571#1:1349,3\n571#1:1353,9\n571#1:1362\n-1#1:1379,11\n-1#1:1390,4\n-1#1:1394,6\n-1#1:1401,3\n-1#1:1405,2\n-1#1:1407,10\n-1#1:1417,6\n-1#1:1423\n-1#1:1424,2\n-1#1:1426,11\n-1#1:1437,4\n-1#1:1441,6\n-1#1:1448,3\n-1#1:1452,2\n-1#1:1454,10\n-1#1:1464,6\n-1#1:1470\n-1#1:1471,2\n-1#1:1473,11\n-1#1:1484,4\n-1#1:1488,6\n-1#1:1495,3\n-1#1:1499,2\n-1#1:1501,10\n-1#1:1511,6\n-1#1:1517\n-1#1:1518,2\n-1#1:1520,11\n-1#1:1531,4\n-1#1:1535,6\n-1#1:1542,3\n-1#1:1546,2\n-1#1:1548,10\n-1#1:1558,6\n-1#1:1564\n-1#1:1565,2\n-1#1:1567,11\n-1#1:1578,4\n-1#1:1582,6\n-1#1:1589,3\n-1#1:1593,2\n-1#1:1595,10\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n372#1:1052\n379#1:1053\n398#1:1060\n398#1:1064\n405#1:1080\n405#1:1084\n412#1:1100\n412#1:1104\n417#1:1124\n417#1:1128\n423#1:1149\n423#1:1153\n433#1:1174\n433#1:1178\n445#1:1198\n445#1:1202\n467#1:1223\n467#1:1227\n502#1:1248\n502#1:1252\n502#1:1273\n502#1:1277\n523#1:1298\n523#1:1302\n549#1:1323\n549#1:1327\n571#1:1348\n571#1:1352\n590#1:1363,3\n591#1:1366\n594#1:1367\n598#1:1368,3\n599#1:1371,3\n600#1:1374\n601#1:1375\n601#1:1376\n605#1:1377\n608#1:1378\n-1#1:1400\n-1#1:1404\n-1#1:1447\n-1#1:1451\n-1#1:1494\n-1#1:1498\n-1#1:1541\n-1#1:1545\n-1#1:1588\n-1#1:1592\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectLongMap<K> {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public Object[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @JvmField
    @NotNull
    public long[] values;

    public /* synthetic */ ObjectLongMap(AbstractC5824e abstractC5824e) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
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
        return objectLongMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean all(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        if (!((Boolean) predicate.invoke(objArr[i10], Long.valueOf(jArr[i10]))).booleanValue()) {
                            return false;
                        }
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

    public final boolean contains(K key) {
        return containsKey(key);
    }

    public final boolean containsKey(K key) {
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(long r15) {
        /*
            r14 = this;
            long[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L46
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
            if (r7 == 0) goto L41
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            int r10 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r10 != 0) goto L3b
            r0 = 1
            return r0
        L3b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3f:
            if (r7 != r8) goto L46
        L41:
            if (r4 == r2) goto L46
            int r4 = r4 + 1
            goto Lb
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.containsValue(long):boolean");
    }

    public final int count() {
        return get_size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ObjectLongMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ObjectLongMap r1 = (androidx.collection.ObjectLongMap) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.keys
            long[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6d
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            int r14 = r1.findKeyIndex(r15)
            if (r14 < 0) goto L61
            long[] r15 = r1.values
            r14 = r15[r14]
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L62
        L61:
            return r4
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r8 == r7) goto L6d
            int r8 = r8 + 1
            goto L27
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.equals(java.lang.Object):boolean");
    }

    @PublishedApi
    public final int findKeyIndex(K key) {
        int i = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this._capacity;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.metadata;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * ScatterMapKt.BitmaskLsb) ^ j7;
            for (long j9 = (~j8) & (j8 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i10;
                if (AbstractC5830k.m5325b(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i11 = i12 + i;
        }
    }

    public final void forEach(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        block.invoke(objArr[i10], Long.valueOf(jArr[i10]));
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
    public final void forEachIndexed(@NotNull InterfaceC6471c block) {
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

    public final void forEachKey(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.keys;
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
                        block.invoke(objArr[(i << 3) + i9]);
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

    public final void forEachValue(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        block.invoke(Long.valueOf(jArr[(i << 3) + i9]));
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

    public final long get(K key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("There is no key " + key + " in the map");
        }
        return this.values[iFindKeyIndex];
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final long getOrDefault(K key, long defaultValue) {
        int iFindKeyIndex = findKeyIndex(key);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : defaultValue;
    }

    public final long getOrElse(K key, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : ((Number) defaultValue.invoke()).longValue();
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i10]);
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
        int i;
        int i8;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j7 = jArr2[i9];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j7) < 128) {
                            int i13 = (i9 << 3) + i12;
                            Object obj = objArr[i13];
                            i8 = i9;
                            long j8 = jArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j8);
                            i10++;
                            if (i10 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j7 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i = i14;
                } else {
                    i = i9;
                }
                if (i == length) {
                    break;
                }
                i9 = i + 1;
            }
        }
        return AbstractC0037f.m80e('}', "toString(...)", sb);
    }

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.keys
            long[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5f
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
            if (r10 == 0) goto L5a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L54
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r15 = r3[r13]
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L54
            r1 = 1
            return r1
        L54:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L58:
            if (r10 != r11) goto L5f
        L5a:
            if (r7 == r5) goto L5f
            int r7 = r7 + 1
            goto L16
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.any(r6.e):boolean");
    }

    public final int count(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        int i11 = (i << 3) + i10;
                        if (((Boolean) predicate.invoke(objArr[i11], Long.valueOf(jArr[i11]))).booleanValue()) {
                            i8++;
                        }
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

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6473e interfaceC6473e, int i8, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i9;
        if (obj == null) {
            CharSequence separator = (i8 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i8 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i8 & 4) == 0 ? charSequence3 : "";
            int i10 = (i8 & 8) != 0 ? -1 : i;
            CharSequence charSequence5 = (i8 & 16) != 0 ? "..." : charSequence4;
            AbstractC5830k.m5330g(separator, "separator");
            AbstractC5830k.m5330g(prefix, "prefix");
            AbstractC5830k.m5330g(postfix, "postfix");
            StringBuilder sbM916q = AbstractC0584a.m916q(charSequence5, "truncated", interfaceC6473e, "transform", prefix);
            Object[] objArr = objectLongMap.keys;
            long[] jArr3 = objectLongMap.values;
            long[] jArr4 = objectLongMap.metadata;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 0;
                loop0: while (true) {
                    long j7 = jArr4[i11];
                    int i13 = i11;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j7 & 255) < 128) {
                                int i17 = (i13 << 3) + i16;
                                i9 = i14;
                                Object obj2 = objArr[i17];
                                long j8 = jArr3[i17];
                                if (i12 == i10) {
                                    sbM916q.append(charSequence5);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sbM916q.append(separator);
                                }
                                jArr2 = jArr4;
                                sbM916q.append((CharSequence) interfaceC6473e.invoke(obj2, Long.valueOf(j8)));
                                i12++;
                            } else {
                                jArr2 = jArr4;
                                i9 = i14;
                            }
                            j7 >>= i9;
                            i16++;
                            i14 = i9;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i11 = i13 + 1;
                    jArr4 = jArr;
                }
                sbM916q.append(postfix);
            } else {
                sbM916q.append(postfix);
            }
            String string = sbM916q.toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
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
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        int i;
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr3 = this.keys;
        long[] jArr3 = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j7 = jArr4[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i8 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j7 & 255) < 128) {
                            int i13 = (i8 << 3) + i12;
                            i = i10;
                            Object obj = objArr3[i13];
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            long j8 = jArr2[i13];
                            if (i9 == limit) {
                                sbM95t.append(truncated);
                                break loop0;
                            }
                            if (i9 != 0) {
                                sbM95t.append(separator);
                            }
                            sbM95t.append(obj);
                            sbM95t.append('=');
                            sbM95t.append(j8);
                            i9++;
                        } else {
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i10;
                        }
                        j7 >>= i;
                        i12++;
                        i10 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != i10) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                objArr3 = objArr;
                jArr3 = jArr;
            }
            sbM95t.append(postfix);
        } else {
            sbM95t.append(postfix);
        }
        String string = sbM95t.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull InterfaceC6473e transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator2 = separator;
        AbstractC5830k.m5330g(separator2, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        StringBuilder sbM916q = AbstractC0584a.m916q(truncated, "truncated", transform, "transform", prefix);
        Object[] objArr3 = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i8 = 0;
            loop0: while (true) {
                long j7 = jArr2[i];
                int i9 = i;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j7 & 255) < 128) {
                            int i12 = (i9 << 3) + i11;
                            Object obj = objArr3[i12];
                            long j8 = jArr[i12];
                            objArr2 = objArr3;
                            if (i8 == limit) {
                                sbM916q.append(truncated);
                                break loop0;
                            }
                            if (i8 != 0) {
                                sbM916q.append(separator2);
                            }
                            sbM916q.append((CharSequence) transform.invoke(obj, Long.valueOf(j8)));
                            i8++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j7 >>= 8;
                        i11++;
                        separator2 = separator;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i9 == length) {
                    break;
                }
                i = i9 + 1;
                separator2 = separator;
                objArr3 = objArr;
            }
            sbM916q.append(postfix);
        } else {
            sbM916q.append(postfix);
        }
        String string = sbM916q.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[PHI: r11
      0x008b: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003c, B:20:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, int r24, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = androidx.collection.AbstractC0584a.m916q(r3, r5, r4, r6, r2)
            java.lang.Object[] r5 = r0.keys
            long[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L92
            r10 = 0
            r11 = 0
        L2b:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L8b
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L48:
            if (r9 >= r14) goto L88
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7d
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r18 = r6[r16]
            r0 = r24
            if (r11 != r0) goto L68
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L95
        L68:
            if (r11 == 0) goto L6d
            r2.append(r1)
        L6d:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7f
        L7d:
            r17 = r15
        L7f:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L48
        L88:
            r0 = r15
            if (r14 != r0) goto L92
        L8b:
            if (r10 == r8) goto L92
            int r10 = r10 + 1
            r0 = r20
            goto L2b
        L92:
            r2.append(r3)
        L95:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, r6.e):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[PHI: r11
      0x008a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003c, B:20:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r24) {
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
            java.lang.StringBuilder r2 = androidx.collection.AbstractC0584a.m916q(r3, r5, r4, r6, r2)
            java.lang.Object[] r5 = r0.keys
            long[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L91
            r10 = 0
            r11 = 0
        L2b:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L48:
            if (r9 >= r14) goto L87
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7c
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r18 = r6[r16]
            r0 = -1
            if (r11 != r0) goto L67
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L94
        L67:
            if (r11 == 0) goto L6c
            r2.append(r1)
        L6c:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7e
        L7c:
            r17 = r15
        L7e:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L48
        L87:
            r0 = r15
            if (r14 != r0) goto L91
        L8a:
            if (r10 == r8) goto L91
            int r10 = r10 + 1
            r0 = r20
            goto L2b
        L91:
            r2.append(r3)
        L94:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, r6.e):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[PHI: r10
      0x007e: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0032, B:20:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r3)
            java.lang.String r3 = "prefix"
            java.lang.String r4 = "transform"
            r5 = r22
            java.lang.StringBuilder r3 = androidx.collection.AbstractC0584a.m916q(r5, r3, r2, r4, r5)
            java.lang.Object[] r4 = r0.keys
            long[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L83
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
            if (r13 == 0) goto L7e
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L7b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L72
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r16 = r5[r16]
            r18 = r14
            r14 = -1
            if (r10 != r14) goto L5d
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L88
        L5d:
            if (r10 == 0) goto L62
            r3.append(r1)
        L62:
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
            goto L74
        L72:
            r18 = r14
        L74:
            long r11 = r11 >> r18
            int r15 = r15 + 1
            r14 = r18
            goto L3e
        L7b:
            r8 = r14
            if (r13 != r8) goto L83
        L7e:
            if (r9 == r7) goto L83
            int r9 = r9 + 1
            goto L24
        L83:
            java.lang.String r1 = ""
            r3.append(r1)
        L88:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, r6.e):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[PHI: r11
      0x0085: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0037, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            java.lang.Object[] r5 = r0.keys
            long[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8c
            r10 = 0
            r11 = 0
        L26:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L85
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L43:
            if (r9 >= r14) goto L82
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L77
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r15
            r15 = r5[r17]
            r19 = r6[r17]
            r0 = -1
            if (r11 != r0) goto L62
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L8f
        L62:
            if (r11 == 0) goto L67
            r3.append(r1)
        L67:
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L79
        L77:
            r18 = r15
        L79:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r21
            r15 = r18
            goto L43
        L82:
            r0 = r15
            if (r14 != r0) goto L8c
        L85:
            if (r10 == r8) goto L8c
            int r10 = r10 + 1
            r0 = r21
            goto L26
        L8c:
            r3.append(r4)
        L8f:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, r6.e):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[PHI: r10
      0x007a: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002c, B:20:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.Object[] r4 = r0.keys
            long[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7f
            r9 = 0
            r10 = 0
        L1e:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7a
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L38:
            if (r15 >= r13) goto L77
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6e
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r18 = r5[r16]
            r16 = r14
            r14 = -1
            if (r10 != r14) goto L57
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L82
        L57:
            if (r10 == 0) goto L5e
            java.lang.String r14 = ", "
            r2.append(r14)
        L5e:
            java.lang.Long r14 = java.lang.Long.valueOf(r18)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L70
        L6e:
            r16 = r14
        L70:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L38
        L77:
            r8 = r14
            if (r13 != r8) goto L7f
        L7a:
            if (r9 == r7) goto L7f
            int r9 = r9 + 1
            goto L1e
        L7f:
            r2.append(r3)
        L82:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(r6.e):java.lang.String");
    }
}
