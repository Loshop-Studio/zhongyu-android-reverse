package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(m13412d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0016J&\u0010\u001a\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0011\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\nJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0004J&\u0010 \u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0013\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0001JD\u0010$\u001a\u00020%26\u0010&\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0\u0018H\u0086\bø\u0001\u0000J/\u0010)\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020%0*H\u0081\bø\u0001\u0000J/\u0010,\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J/\u0010-\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J\u0011\u0010.\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\u0002J\u0016\u0010/\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0019J\"\u00101\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001902H\u0086\bø\u0001\u0000J\b\u00103\u001a\u00020\u0004H\u0016J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J:\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u000209H\u0007Jx\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020928\b\u0004\u0010>\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002090\u0018H\u0087\bø\u0001\u0000J\u0006\u0010?\u001a\u00020\u0016J\b\u0010@\u001a\u000207H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, m13413d2 = {"Landroidx/collection/FloatFloatMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", RequestParameters.PREFIX, "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableFloatFloatMap;", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n361#1,6:1039\n371#1,3:1046\n374#1,9:1050\n361#1,6:1059\n371#1,3:1066\n374#1,9:1070\n361#1,6:1079\n371#1,3:1086\n374#1,9:1090\n389#1,4:1099\n361#1,6:1103\n371#1,3:1110\n374#1,9:1114\n393#1:1123\n389#1,4:1124\n361#1,6:1128\n371#1,3:1135\n374#1,9:1139\n393#1:1148\n389#1,4:1149\n361#1,6:1153\n371#1,3:1160\n374#1,9:1164\n393#1:1173\n404#1,3:1174\n361#1,6:1177\n371#1,3:1184\n374#1,9:1188\n407#1:1197\n389#1,4:1198\n361#1,6:1202\n371#1,3:1209\n374#1,9:1213\n393#1:1222\n389#1,4:1223\n361#1,6:1227\n371#1,3:1234\n374#1,9:1238\n393#1:1247\n389#1,4:1248\n361#1,6:1252\n371#1,3:1259\n374#1,9:1263\n393#1:1272\n389#1,4:1273\n361#1,6:1277\n371#1,3:1284\n374#1,9:1288\n393#1:1297\n389#1,4:1298\n361#1,6:1302\n371#1,3:1309\n374#1,9:1313\n393#1:1322\n389#1,4:1323\n361#1,6:1327\n371#1,3:1334\n374#1,9:1338\n393#1:1347\n486#1,11:1364\n389#1,4:1375\n361#1,6:1379\n371#1,3:1386\n374#1,2:1390\n497#1,10:1392\n377#1,6:1402\n393#1:1408\n507#1,2:1409\n486#1,11:1411\n389#1,4:1422\n361#1,6:1426\n371#1,3:1433\n374#1,2:1437\n497#1,10:1439\n377#1,6:1449\n393#1:1455\n507#1,2:1456\n486#1,11:1458\n389#1,4:1469\n361#1,6:1473\n371#1,3:1480\n374#1,2:1484\n497#1,10:1486\n377#1,6:1496\n393#1:1502\n507#1,2:1503\n486#1,11:1505\n389#1,4:1516\n361#1,6:1520\n371#1,3:1527\n374#1,2:1531\n497#1,10:1533\n377#1,6:1543\n393#1:1549\n507#1,2:1550\n486#1,11:1552\n389#1,4:1563\n361#1,6:1567\n371#1,3:1574\n374#1,2:1578\n497#1,10:1580\n377#1,6:1590\n393#1:1596\n507#1,2:1597\n1399#2:1037\n1270#2:1038\n1399#2:1045\n1270#2:1049\n1399#2:1065\n1270#2:1069\n1399#2:1085\n1270#2:1089\n1399#2:1109\n1270#2:1113\n1399#2:1134\n1270#2:1138\n1399#2:1159\n1270#2:1163\n1399#2:1183\n1270#2:1187\n1399#2:1208\n1270#2:1212\n1399#2:1233\n1270#2:1237\n1399#2:1258\n1270#2:1262\n1399#2:1283\n1270#2:1287\n1399#2:1308\n1270#2:1312\n1399#2:1333\n1270#2:1337\n1179#2:1351\n1175#2:1352\n1372#2,3:1353\n1386#2,3:1356\n1312#2:1359\n1303#2:1360\n1297#2:1361\n1309#2:1362\n1393#2:1363\n1399#2:1385\n1270#2:1389\n1399#2:1432\n1270#2:1436\n1399#2:1479\n1270#2:1483\n1399#2:1526\n1270#2:1530\n1399#2:1573\n1270#2:1577\n882#3,3:1348\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n*L\n392#1:1039,6\n392#1:1046,3\n392#1:1050,9\n399#1:1059,6\n399#1:1066,3\n399#1:1070,9\n406#1:1079,6\n406#1:1086,3\n406#1:1090,9\n411#1:1099,4\n411#1:1103,6\n411#1:1110,3\n411#1:1114,9\n411#1:1123\n417#1:1124,4\n417#1:1128,6\n417#1:1135,3\n417#1:1139,9\n417#1:1148\n427#1:1149,4\n427#1:1153,6\n427#1:1160,3\n427#1:1164,9\n427#1:1173\n439#1:1174,3\n439#1:1177,6\n439#1:1184,3\n439#1:1188,9\n439#1:1197\n461#1:1198,4\n461#1:1202,6\n461#1:1209,3\n461#1:1213,9\n461#1:1222\n496#1:1223,4\n496#1:1227,6\n496#1:1234,3\n496#1:1238,9\n496#1:1247\n496#1:1248,4\n496#1:1252,6\n496#1:1259,3\n496#1:1263,9\n496#1:1272\n517#1:1273,4\n517#1:1277,6\n517#1:1284,3\n517#1:1288,9\n517#1:1297\n541#1:1298,4\n541#1:1302,6\n541#1:1309,3\n541#1:1313,9\n541#1:1322\n563#1:1323,4\n563#1:1327,6\n563#1:1334,3\n563#1:1338,9\n563#1:1347\n-1#1:1364,11\n-1#1:1375,4\n-1#1:1379,6\n-1#1:1386,3\n-1#1:1390,2\n-1#1:1392,10\n-1#1:1402,6\n-1#1:1408\n-1#1:1409,2\n-1#1:1411,11\n-1#1:1422,4\n-1#1:1426,6\n-1#1:1433,3\n-1#1:1437,2\n-1#1:1439,10\n-1#1:1449,6\n-1#1:1455\n-1#1:1456,2\n-1#1:1458,11\n-1#1:1469,4\n-1#1:1473,6\n-1#1:1480,3\n-1#1:1484,2\n-1#1:1486,10\n-1#1:1496,6\n-1#1:1502\n-1#1:1503,2\n-1#1:1505,11\n-1#1:1516,4\n-1#1:1520,6\n-1#1:1527,3\n-1#1:1531,2\n-1#1:1533,10\n-1#1:1543,6\n-1#1:1549\n-1#1:1550,2\n-1#1:1552,11\n-1#1:1563,4\n-1#1:1567,6\n-1#1:1574,3\n-1#1:1578,2\n-1#1:1580,10\n-1#1:1590,6\n-1#1:1596\n-1#1:1597,2\n366#1:1037\n373#1:1038\n392#1:1045\n392#1:1049\n399#1:1065\n399#1:1069\n406#1:1085\n406#1:1089\n411#1:1109\n411#1:1113\n417#1:1134\n417#1:1138\n427#1:1159\n427#1:1163\n439#1:1183\n439#1:1187\n461#1:1208\n461#1:1212\n496#1:1233\n496#1:1237\n496#1:1258\n496#1:1262\n517#1:1283\n517#1:1287\n541#1:1308\n541#1:1312\n563#1:1333\n563#1:1337\n583#1:1351\n586#1:1352\n590#1:1353,3\n591#1:1356,3\n592#1:1359\n593#1:1360\n593#1:1361\n597#1:1362\n600#1:1363\n-1#1:1385\n-1#1:1389\n-1#1:1432\n-1#1:1436\n-1#1:1479\n-1#1:1483\n-1#1:1526\n-1#1:1530\n-1#1:1573\n-1#1:1577\n582#1:1348,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatFloatMap {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    public float[] keys;

    @JvmField
    public long[] metadata;

    @JvmField
    public float[] values;

    public /* synthetic */ FloatFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, int i10, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return floatFloatMap.joinToString(charSequence, charSequence2, charSequence6, i9, charSequence5);
    }

    public final boolean all(Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                    if ((255 & j9) < 128) {
                        int i12 = (i9 << 3) + i11;
                        if (!predicate.invoke(Float.valueOf(fArr[i12]), Float.valueOf(fArr2[i12])).booleanValue()) {
                            return false;
                        }
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

    public final boolean contains(float key) {
        return containsKey(key);
    }

    public final boolean containsKey(float key) {
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(float r15) {
        /*
            r14 = this;
            float[] r0 = r14.values
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
            r15 = 1
            return r15
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.containsValue(float):boolean");
    }

    public final int count() {
        return get_size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.FloatFloatMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.FloatFloatMap r1 = (androidx.collection.FloatFloatMap) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            float[] r3 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
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
            if (r11 == 0) goto L72
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L65
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.findKeyIndex(r15)
            if (r15 < 0) goto L64
            r16 = r2
            float[] r2 = r1.values
            r2 = r2[r15]
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L64
            goto L67
        L64:
            return r4
        L65:
            r16 = r2
        L67:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L41
        L6d:
            r16 = r2
            if (r11 != r12) goto L7d
            goto L74
        L72:
            r16 = r2
        L74:
            if (r8 == r7) goto L7d
            int r8 = r8 + 1
            r2 = r16
            goto L27
        L7b:
            r16 = r2
        L7d:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.equals(java.lang.Object):boolean");
    }

    @PublishedApi
    public final int findKeyIndex(float key) {
        int iHashCode = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & WorkQueueKt.MASK;
        int i11 = this._capacity;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (i10 * ScatterMapKt.BitmaskLsb) ^ j9;
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void forEach(Function2<? super Float, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        int i12 = (i9 << 3) + i11;
                        block.invoke(Float.valueOf(fArr[i12]), Float.valueOf(fArr2[i12]));
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
    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
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

    public final void forEachKey(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
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
                        block.invoke(Float.valueOf(fArr[(i9 << 3) + i11]));
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

    public final void forEachValue(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.values;
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
                        block.invoke(Float.valueOf(fArr[(i9 << 3) + i11]));
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

    public final float get(float key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + key);
        }
        return this.values[iFindKeyIndex];
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final float getOrDefault(float key, float defaultValue) {
        int iFindKeyIndex = findKeyIndex(key);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : defaultValue;
    }

    public final float getOrElse(float key, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        return iFindKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[iFindKeyIndex];
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i9 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128) {
                        int i12 = (i9 << 3) + i11;
                        float f10 = fArr[i12];
                        iHashCode += Float.hashCode(fArr2[i12]) ^ Float.hashCode(f10);
                    }
                    j9 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i9 == length) {
                return iHashCode;
            }
            i9++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[PHI: r8
      0x0071: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0032, B:19:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            java.lang.String r1 = "{}"
            return r1
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            float[] r2 = r0.keys
            float[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
            r8 = r7
        L24:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L71
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3e:
            if (r13 >= r11) goto L6f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6b
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0._size
            if (r8 >= r14) goto L6b
            r14 = 44
            r1.append(r14)
            r14 = 32
            r1.append(r14)
        L6b:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3e
        L6f:
            if (r11 != r12) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L24
        L76:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.toString():java.lang.String");
    }

    private FloatFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            float[] r2 = r0.keys
            float[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L64
            r7 = r6
        L17:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L31:
            if (r12 >= r10) goto L5d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L59
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L59
            r1 = 1
            return r1
        L59:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L5d:
            if (r10 != r11) goto L64
        L5f:
            if (r7 == r5) goto L64
            int r7 = r7 + 1
            goto L17
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                    if ((255 & j9) < 128) {
                        int i13 = (i9 << 3) + i12;
                        if (predicate.invoke(Float.valueOf(fArr[i13]), Float.valueOf(fArr2[i13])).booleanValue()) {
                            i10++;
                        }
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
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, Function2 transform, int i10, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i11;
        if (obj == null) {
            CharSequence separator = (i10 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i10 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i10 & 4) == 0 ? charSequence3 : "";
            int i12 = (i10 & 8) != 0 ? -1 : i9;
            CharSequence truncated = (i10 & 16) != 0 ? "..." : charSequence4;
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            float[] fArr = floatFloatMap.keys;
            float[] fArr2 = floatFloatMap.values;
            long[] jArr3 = floatFloatMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                int i14 = 0;
                loop0: while (true) {
                    long j9 = jArr3[i13];
                    int i15 = i13;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j9 & 255) < 128) {
                                int i19 = (i15 << 3) + i18;
                                float f10 = fArr[i19];
                                float f11 = fArr2[i19];
                                if (i14 == i12) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i14 != 0) {
                                    sb.append(separator);
                                }
                                i11 = i16;
                                Float fValueOf = Float.valueOf(f10);
                                jArr2 = jArr3;
                                sb.append((CharSequence) transform.invoke(fValueOf, Float.valueOf(f11)));
                                i14++;
                            } else {
                                jArr2 = jArr3;
                                i11 = i16;
                            }
                            j9 >>= i11;
                            i18++;
                            i16 = i11;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i17 != i16) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i13 = i15 + 1;
                    jArr3 = jArr;
                }
                sb.append(postfix);
            } else {
                sb.append(postfix);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i9) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i9, null, 16, null);
    }

    @JvmOverloads
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        float[] fArr;
        float[] fArr2;
        int i9;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr3 = this.keys;
        float[] fArr4 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i10 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j9 & 255) < 128) {
                            int i15 = (i10 << 3) + i14;
                            i9 = i12;
                            float f10 = fArr3[i15];
                            float f11 = fArr4[i15];
                            fArr2 = fArr3;
                            if (i11 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb.append(separator);
                            }
                            sb.append(f10);
                            sb.append('=');
                            sb.append(f11);
                            i11++;
                        } else {
                            fArr2 = fArr3;
                            i9 = i12;
                        }
                        j9 >>= i9;
                        i14++;
                        fArr3 = fArr2;
                        i12 = i9;
                    }
                    fArr = fArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                fArr3 = fArr;
            }
            sb.append(postfix);
        } else {
            sb.append(postfix);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[PHI: r12
      0x00a0: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0051, B:19:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r26
            r5 = r27
            java.lang.String r6 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            float[] r2 = r0.keys
            float[] r7 = r0.values
            long[] r8 = r0.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto La9
            r11 = 0
            r12 = 0
        L3f:
            r13 = r8[r11]
            r15 = r11
            long r10 = ~r13
            r16 = 7
            long r10 = r10 << r16
            long r10 = r10 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto La0
            int r11 = r15 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r16 = r11
            r11 = 0
        L5f:
            if (r11 >= r10) goto L9c
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L93
            int r17 = r15 << 3
            int r17 = r17 + r11
            r18 = r2[r17]
            r17 = r7[r17]
            r0 = r25
            if (r12 != r0) goto L7b
            r6.append(r4)
            goto Lac
        L7b:
            if (r12 == 0) goto L80
            r6.append(r1)
        L80:
            java.lang.Float r0 = java.lang.Float.valueOf(r18)
            java.lang.Float r1 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
            int r12 = r12 + 1
        L93:
            long r13 = r13 >> r16
            int r11 = r11 + 1
            r0 = r21
            r1 = r22
            goto L5f
        L9c:
            r0 = r16
            if (r10 != r0) goto La9
        La0:
            if (r15 == r9) goto La9
            int r11 = r15 + 1
            r0 = r21
            r1 = r22
            goto L3f
        La9:
            r6.append(r3)
        Lac:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    @JvmOverloads
    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i9, Function2<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i10;
        CharSequence separator = charSequence;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            int i16 = (i11 << 3) + i15;
                            float f10 = fArr[i16];
                            float f11 = fArr2[i16];
                            i10 = i13;
                            if (i12 == i9) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f10), Float.valueOf(f11)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j9 >>= i10;
                        i15++;
                        separator = charSequence;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                separator = charSequence;
            }
            sb.append(postfix);
        } else {
            sb.append(postfix);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[PHI: r11
      0x009a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0048, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            float[] r2 = r0.keys
            float[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La1
            r10 = 0
            r11 = 0
        L37:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L9a
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L54:
            if (r9 >= r14) goto L97
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L8c
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r2[r16]
            r16 = r6[r16]
            r18 = r15
            r15 = -1
            if (r11 != r15) goto L73
            java.lang.String r1 = "..."
            r5.append(r1)
            goto La4
        L73:
            if (r11 == 0) goto L78
            r5.append(r1)
        L78:
            java.lang.Float r15 = java.lang.Float.valueOf(r17)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            int r11 = r11 + 1
            goto L8e
        L8c:
            r18 = r15
        L8e:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r20
            r15 = r18
            goto L54
        L97:
            r0 = r15
            if (r14 != r0) goto La1
        L9a:
            if (r10 == r8) goto La1
            int r10 = r10 + 1
            r0 = r20
            goto L37
        La1:
            r5.append(r3)
        La4:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d A[PHI: r10
      0x008d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003d, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            float[] r2 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L92
            r9 = 0
            r10 = 0
        L2f:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8d
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L49:
            if (r15 >= r13) goto L8a
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L81
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r2[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L66
            java.lang.String r1 = "..."
            r4.append(r1)
            goto L97
        L66:
            if (r10 == 0) goto L6b
            r4.append(r1)
        L6b:
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r17 = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r3.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r4.append(r8)
            int r10 = r10 + 1
            goto L83
        L81:
            r17 = r14
        L83:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L49
        L8a:
            r8 = r14
            if (r13 != r8) goto L92
        L8d:
            if (r9 == r7) goto L92
            int r9 = r9 + 1
            goto L2f
        L92:
            java.lang.String r1 = ""
            r4.append(r1)
        L97:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[PHI: r11
      0x008c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            float[] r5 = r0.keys
            float[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L93
            r10 = 0
            r11 = 0
        L29:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L8c
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L89
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L7e
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r5[r17]
            r17 = r6[r17]
            r19 = r15
            r15 = -1
            if (r11 != r15) goto L65
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L96
        L65:
            if (r11 == 0) goto L6a
            r3.append(r1)
        L6a:
            java.lang.Float r15 = java.lang.Float.valueOf(r18)
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L80
        L7e:
            r19 = r15
        L80:
            long r12 = r12 >> r19
            int r9 = r9 + 1
            r0 = r21
            r15 = r19
            goto L46
        L89:
            r0 = r15
            if (r14 != r0) goto L93
        L8c:
            if (r10 == r8) goto L93
            int r10 = r10 + 1
            r0 = r21
            goto L29
        L93:
            r3.append(r4)
        L96:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[PHI: r10
      0x0081: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002f, B:20:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            float[] r4 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L86
            r9 = 0
            r10 = 0
        L21:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L81
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3b:
            if (r15 >= r13) goto L7e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L75
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L58
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L89
        L58:
            if (r10 == 0) goto L5f
            java.lang.String r8 = ", "
            r2.append(r8)
        L5f:
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r17 = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L77
        L75:
            r17 = r14
        L77:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L3b
        L7e:
            r8 = r14
            if (r13 != r8) goto L86
        L81:
            if (r9 == r7) goto L86
            int r9 = r9 + 1
            goto L21
        L86:
            r2.append(r3)
        L89:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
