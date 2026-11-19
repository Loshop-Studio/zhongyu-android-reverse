package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b!\u0010$J-\u0010'\u001a\u00020\u00072\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0%H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0086\n¢\u0006\u0004\b)\u0010*J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0086\n¢\u0006\u0004\b)\u0010-J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010,\u001a\u00020.H\u0086\n¢\u0006\u0004\b)\u0010/J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010,\u001a\u000200H\u0086\n¢\u0006\u0004\b)\u00101J\u0019\u00103\u001a\u0004\u0018\u00018\u00002\u0006\u00102\u001a\u00020\u0003H\u0001¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\fJ\r\u00106\u001a\u00020\u0003¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u0007H\u0000¢\u0006\u0004\b8\u0010\fJ\u000f\u0010;\u001a\u00020\u0007H\u0000¢\u0006\u0004\b:\u0010\fJ\u0017\u0010>\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0003H\u0000¢\u0006\u0004\b=\u0010\u0006R\u0016\u0010?\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, m5110d2 = {"Landroidx/collection/MutableFloatObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "<init>", "(I)V", "Ld6/s;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findAbsoluteInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLr6/a;)Ljava/lang/Object;", "value", "set", "(FLjava/lang/Object;)V", "put", "(FLjava/lang/Object;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "putAll", "(Landroidx/collection/FloatObjectMap;)V", "plusAssign", "remove", "(F)Ljava/lang/Object;", "", "(FLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lr6/e;)V", "minusAssign", "(F)V", "", "keys", "([F)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "Landroidx/collection/FloatList;", "(Landroidx/collection/FloatList;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 7 FloatSet.kt\nandroidx/collection/FloatSet\n+ 8 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,1017:1\n757#1,2:1173\n757#1,2:1186\n59#2,5:1018\n1#3:1023\n1254#4,6:1024\n1399#4:1040\n1270#4:1044\n1179#4:1060\n1175#4:1063\n1372#4,3:1068\n1386#4,3:1072\n1312#4:1076\n1303#4:1078\n1297#4:1079\n1309#4:1084\n1393#4:1086\n1179#4:1100\n1175#4:1103\n1372#4,3:1108\n1386#4,3:1112\n1312#4:1116\n1303#4:1118\n1297#4:1119\n1309#4:1124\n1393#4:1126\n1399#4:1141\n1270#4:1145\n1399#4:1166\n1270#4:1170\n1230#4:1189\n1254#4,6:1190\n1242#4:1196\n1241#4,4:1197\n1254#4,6:1201\n1175#4:1210\n1179#4:1211\n1372#4,3:1212\n1386#4,3:1215\n1312#4:1218\n1303#4:1219\n1297#4:1220\n1309#4:1221\n1393#4:1222\n1265#4:1223\n1220#4:1224\n1262#4:1225\n1220#4:1226\n1230#4:1227\n1254#4,6:1228\n1242#4:1234\n1241#4,4:1235\n1372#4,3:1239\n1399#4:1242\n1297#4:1243\n1144#4,14:1244\n1220#4:1258\n1175#4:1262\n1179#4:1263\n1254#4,6:1264\n1220#4:1270\n1179#4:1271\n1254#4,6:1272\n1254#4,6:1278\n1179#4:1284\n1254#4,6:1285\n1268#4:1291\n1220#4:1292\n1175#4:1296\n1179#4:1297\n1230#4:1298\n1254#4,6:1299\n1242#4:1305\n1241#4,4:1306\n382#5,4:1030\n354#5,6:1034\n364#5,3:1041\n367#5,9:1045\n386#5:1054\n577#5:1055\n578#5:1059\n580#5,2:1061\n582#5,4:1064\n586#5:1071\n587#5:1075\n588#5:1077\n589#5,4:1080\n595#5:1085\n596#5,8:1087\n577#5:1095\n578#5:1099\n580#5,2:1101\n582#5,4:1104\n586#5:1111\n587#5:1115\n588#5:1117\n589#5,4:1120\n595#5:1125\n596#5,8:1127\n354#5,6:1135\n364#5,3:1142\n367#5,9:1146\n882#6,3:1056\n882#6,3:1096\n882#6,3:1207\n882#6,3:1259\n882#6,3:1293\n257#7,4:1155\n227#7,7:1159\n238#7,3:1167\n241#7,2:1171\n244#7,6:1175\n261#7:1181\n237#8,4:1182\n242#8:1188\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n*L\n769#1:1173,2\n774#1:1186,2\n637#1:1018,5\n665#1:1024,6\n712#1:1040\n712#1:1044\n723#1:1060\n723#1:1063\n723#1:1068,3\n723#1:1072,3\n723#1:1076\n723#1:1078\n723#1:1079\n723#1:1084\n723#1:1086\n735#1:1100\n735#1:1103\n735#1:1108,3\n735#1:1112,3\n735#1:1116\n735#1:1118\n735#1:1119\n735#1:1124\n735#1:1126\n747#1:1141\n747#1:1145\n769#1:1166\n769#1:1170\n783#1:1189\n783#1:1190,6\n783#1:1196\n783#1:1197,4\n795#1:1201,6\n809#1:1210\n810#1:1211\n817#1:1212,3\n818#1:1215,3\n819#1:1218\n820#1:1219\n820#1:1220\n824#1:1221\n827#1:1222\n836#1:1223\n836#1:1224\n842#1:1225\n842#1:1226\n843#1:1227\n843#1:1228,6\n843#1:1234\n843#1:1235,4\n858#1:1239,3\n859#1:1242\n861#1:1243\n907#1:1244,14\n913#1:1258\n928#1:1262\n939#1:1263\n940#1:1264,6\n950#1:1270\n953#1:1271\n954#1:1272,6\n955#1:1278,6\n965#1:1284\n966#1:1285,6\n1005#1:1291\n1005#1:1292\n1008#1:1296\n1010#1:1297\n1010#1:1298\n1010#1:1299,6\n1010#1:1305\n1010#1:1306,4\n712#1:1030,4\n712#1:1034,6\n712#1:1041,3\n712#1:1045,9\n712#1:1054\n723#1:1055\n723#1:1059\n723#1:1061,2\n723#1:1064,4\n723#1:1071\n723#1:1075\n723#1:1077\n723#1:1080,4\n723#1:1085\n723#1:1087,8\n735#1:1095\n735#1:1099\n735#1:1101,2\n735#1:1104,4\n735#1:1111\n735#1:1115\n735#1:1117\n735#1:1120,4\n735#1:1125\n735#1:1127,8\n747#1:1135,6\n747#1:1142,3\n747#1:1146,9\n723#1:1056,3\n735#1:1096,3\n808#1:1207,3\n927#1:1259,3\n1007#1:1293,3\n769#1:1155,4\n769#1:1159,7\n769#1:1167,3\n769#1:1171,2\n769#1:1175,6\n769#1:1181\n774#1:1182,4\n774#1:1188\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    private int growthLimit;

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(float key) {
        int iHashCode = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
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
            int i15 = i12;
            long j9 = j7 ^ (j8 * ScatterMapKt.BitmaskLsb);
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (this.keys[iNumberOfTrailingZeros] == key) {
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
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
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
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new float[iMax];
        this.values = new Object[iMax];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j7;
        long[] jArr = this.metadata;
        int i = this._capacity;
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        int i8 = (i + 7) >> 3;
        boolean z8 = false;
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = jArr[i9] & (-9187201950435737472L);
            jArr[i9] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
        }
        int iM5193T = AbstractC5802q.m5193T(jArr);
        int i10 = iM5193T - 1;
        long j9 = 72057594037927935L;
        jArr[i10] = (jArr[i10] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM5193T] = jArr[0];
        int i11 = 0;
        while (i11 != i) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j10 = (jArr[i12] >> i13) & 255;
            if (j10 != 128 && j10 == 254) {
                int iHashCode = Float.hashCode(fArr[i11]) * ScatterMapKt.MurmurHashC1;
                int i14 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i14);
                int i15 = i14 & i;
                boolean z9 = z8;
                if (((iFindFirstAvailableSlot - i15) & i) / 8 == ((i11 - i15) & i) / 8) {
                    jArr[i12] = ((r8 & 127) << i13) | ((~(255 << i13)) & jArr[i12]);
                    jArr[jArr.length - 1] = (jArr[z9 ? 1 : 0] & j9) | Long.MIN_VALUE;
                    i11++;
                    z8 = z9 ? 1 : 0;
                } else {
                    int i16 = iFindFirstAvailableSlot >> 3;
                    long j11 = jArr[i16];
                    int i17 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j11 >> i17) & 255) == 128) {
                        j7 = j9;
                        jArr[i16] = ((r8 & 127) << i17) | (j11 & (~(255 << i17)));
                        jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                        fArr[iFindFirstAvailableSlot] = fArr[i11];
                        fArr[i11] = 0.0f;
                        objArr[iFindFirstAvailableSlot] = objArr[i11];
                        objArr[i11] = null;
                    } else {
                        j7 = j9;
                        jArr[i16] = ((r8 & 127) << i17) | (j11 & (~(255 << i17)));
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i11];
                        fArr[i11] = f;
                        Object obj = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i11];
                        objArr[i11] = obj;
                        i11--;
                    }
                    jArr[jArr.length - 1] = (jArr[z9 ? 1 : 0] & j7) | Long.MIN_VALUE;
                    i11++;
                    z8 = z9 ? 1 : 0;
                    j9 = j7;
                }
            } else {
                i11++;
            }
        }
        initializeGrowth();
    }

    public final V getOrPut(float key, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        V v2 = get(key);
        if (v2 != null) {
            return v2;
        }
        V v4 = (V) defaultValue.invoke();
        set(key, v4);
        return v4;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(@NotNull FloatObjectMap<V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    @Nullable
    public final V put(float key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = key;
        objArr[iFindAbsoluteInsertIndex] = value;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull FloatObjectMap<V> from) {
        AbstractC5830k.m5330g(from, "from");
        float[] fArr = from.keys;
        Object[] objArr = from.values;
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
                        set(fArr[i10], objArr[i10]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(float r14) {
        /*
            r13 = this;
            int r0 = java.lang.Float.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            float[] r11 = r13.keys
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L6d:
            r14 = 0
            return r14
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float):java.lang.Object");
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
                        if (((Boolean) predicate.invoke(Float.valueOf(this.keys[i10]), this.values[i10])).booleanValue()) {
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
        Object[] objArr = this.values;
        V v2 = (V) objArr[index];
        objArr[index] = null;
        return v2;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        long[] jArr2 = mutableFloatObjectMap.metadata;
        float[] fArr = mutableFloatObjectMap.keys;
        Object[] objArr = mutableFloatObjectMap.values;
        int i = mutableFloatObjectMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableFloatObjectMap.metadata;
        float[] fArr2 = mutableFloatObjectMap.keys;
        Object[] objArr2 = mutableFloatObjectMap.values;
        int i8 = mutableFloatObjectMap._capacity;
        int i9 = 0;
        while (i9 < i) {
            if (((jArr2[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                float f = fArr[i9];
                int iHashCode = Float.hashCode(f) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatObjectMap.findFirstAvailableSlot(i10 >>> 7);
                long j7 = i10 & 127;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j8 = (jArr3[i11] & (~(255 << i12))) | (j7 << i12);
                jArr3[i11] = j8;
                jArr3[(((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7)) >> 3] = j8;
                fArr2[iFindFirstAvailableSlot] = f;
                objArr2[iFindFirstAvailableSlot] = objArr[i9];
            } else {
                jArr = jArr2;
            }
            i9++;
            mutableFloatObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[iFindAbsoluteInsertIndex] = key;
        this.values[iFindAbsoluteInsertIndex] = value;
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

    public /* synthetic */ MutableFloatObjectMap(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@NotNull float[] keys) {
        AbstractC5830k.m5330g(keys, "keys");
        for (float f : keys) {
            remove(f);
        }
    }

    public MutableFloatObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void minusAssign(@NotNull FloatSet keys) {
        AbstractC5830k.m5330g(keys, "keys");
        float[] fArr = keys.elements;
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
                        remove(fArr[(i << 3) + i9]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(float r17, V r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
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
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.keys
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L7c
            r10 = -1
        L69:
            if (r10 < 0) goto L7b
            java.lang.Object[] r1 = r0.values
            r1 = r1[r10]
            r6 = r18
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r6)
            if (r1 == 0) goto L7b
            r0.removeValueAt(r10)
            return r11
        L7b:
            return r4
        L7c:
            r6 = r18
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float, java.lang.Object):boolean");
    }

    public final void minusAssign(@NotNull FloatList keys) {
        AbstractC5830k.m5330g(keys, "keys");
        float[] fArr = keys.content;
        int i = keys._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(fArr[i8]);
        }
    }
}
