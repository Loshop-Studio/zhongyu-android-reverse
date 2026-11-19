package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b!\u0010$J-\u0010'\u001a\u00020\u00062\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0%H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b)\u0010\"J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0086\n¢\u0006\u0004\b)\u0010,J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020-H\u0086\n¢\u0006\u0004\b)\u0010.J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020/H\u0086\n¢\u0006\u0004\b)\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0002H\u0001¢\u0006\u0004\b2\u0010\u0005J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u0010\u000bJ\u0017\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0002H\u0000¢\u0006\u0004\b;\u0010\u0005R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006?"}, m5110d2 = {"Landroidx/collection/MutableFloatIntMap;", "Landroidx/collection/FloatIntMap;", "", "initialCapacity", "<init>", "(I)V", "Ld6/s;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLr6/a;)I", "value", "set", "(FI)V", "put", "default", "(FII)I", TypedValues.TransitionType.S_FROM, "putAll", "(Landroidx/collection/FloatIntMap;)V", "plusAssign", "remove", "(F)V", "", "(FI)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lr6/e;)V", "minusAssign", "", "keys", "([F)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "Landroidx/collection/FloatList;", "(Landroidx/collection/FloatList;)V", "index", "removeValueAt", "clear", "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1034:1\n59#2,5:1035\n1#3:1040\n1254#4,6:1041\n1399#4:1057\n1270#4:1061\n1399#4:1078\n1270#4:1082\n1399#4:1103\n1270#4:1107\n1230#4:1124\n1254#4,6:1125\n1242#4:1131\n1241#4,4:1132\n1254#4,6:1136\n1175#4:1145\n1179#4:1146\n1372#4,3:1147\n1386#4,3:1150\n1312#4:1153\n1303#4:1154\n1297#4:1155\n1309#4:1156\n1393#4:1157\n1265#4:1158\n1220#4:1159\n1262#4:1160\n1220#4:1161\n1230#4:1162\n1254#4,6:1163\n1242#4:1169\n1241#4,4:1170\n1372#4,3:1174\n1399#4:1177\n1297#4:1178\n1144#4,14:1179\n1220#4:1193\n1175#4:1197\n1179#4:1198\n1254#4,6:1199\n1220#4:1205\n1179#4:1206\n1254#4,6:1207\n1254#4,6:1213\n1179#4:1219\n1254#4,6:1220\n1268#4:1226\n1220#4:1227\n1175#4:1231\n1179#4:1232\n1230#4:1233\n1254#4,6:1234\n1242#4:1240\n1241#4,4:1241\n387#5,4:1047\n359#5,6:1051\n369#5,3:1058\n372#5,9:1062\n391#5:1071\n359#5,6:1072\n369#5,3:1079\n372#5,9:1083\n257#6,4:1092\n227#6,7:1096\n238#6,3:1104\n241#6,9:1108\n261#6:1117\n237#7,6:1118\n882#8,3:1142\n882#8,3:1194\n882#8,3:1228\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n*L\n639#1:1035,5\n667#1:1041,6\n739#1:1057\n739#1:1061\n770#1:1078\n770#1:1082\n791#1:1103\n791#1:1107\n805#1:1124\n805#1:1125,6\n805#1:1131\n805#1:1132,4\n813#1:1136,6\n826#1:1145\n827#1:1146\n834#1:1147,3\n835#1:1150,3\n836#1:1153\n837#1:1154\n837#1:1155\n841#1:1156\n844#1:1157\n853#1:1158\n853#1:1159\n859#1:1160\n859#1:1161\n860#1:1162\n860#1:1163,6\n860#1:1169\n860#1:1170,4\n875#1:1174,3\n876#1:1177\n878#1:1178\n924#1:1179,14\n930#1:1193\n945#1:1197\n956#1:1198\n957#1:1199,6\n967#1:1205\n970#1:1206\n971#1:1207,6\n972#1:1213,6\n982#1:1219\n983#1:1220,6\n1022#1:1226\n1022#1:1227\n1025#1:1231\n1027#1:1232\n1027#1:1233\n1027#1:1234,6\n1027#1:1240\n1027#1:1241,4\n739#1:1047,4\n739#1:1051,6\n739#1:1058,3\n739#1:1062,9\n739#1:1071\n770#1:1072,6\n770#1:1079,3\n770#1:1083,9\n791#1:1092,4\n791#1:1096,7\n791#1:1104,3\n791#1:1108,9\n791#1:1117\n796#1:1118,6\n825#1:1142,3\n944#1:1194,3\n1024#1:1228,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatIntMap extends FloatIntMap {
    private int growthLimit;

    public MutableFloatIntMap() {
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

    private final int findInsertIndex(float key) {
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
                return ~iFindFirstAvailableSlot;
            }
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
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
        this.values = new int[iMax];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j7;
        long[] jArr = this.metadata;
        int i = this._capacity;
        float[] fArr = this.keys;
        int[] iArr = this.values;
        int i8 = (i + 7) >> 3;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = jArr[i10] & (-9187201950435737472L);
            jArr[i10] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
        }
        int iM5193T = AbstractC5802q.m5193T(jArr);
        int i11 = iM5193T - 1;
        long j9 = 72057594037927935L;
        jArr[i11] = (jArr[i11] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM5193T] = jArr[0];
        int i12 = 0;
        while (i12 != i) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j10 = (jArr[i13] >> i14) & 255;
            if (j10 != 128 && j10 == 254) {
                int iHashCode = Float.hashCode(fArr[i12]) * ScatterMapKt.MurmurHashC1;
                int i15 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i15);
                int i16 = i15 & i;
                int i17 = i9;
                if (((iFindFirstAvailableSlot - i16) & i) / 8 == ((i12 - i16) & i) / 8) {
                    jArr[i13] = ((r8 & 127) << i14) | ((~(255 << i14)) & jArr[i13]);
                    jArr[jArr.length - 1] = (jArr[i17] & j9) | Long.MIN_VALUE;
                    i12++;
                    i9 = i17;
                } else {
                    int i18 = iFindFirstAvailableSlot >> 3;
                    long j11 = jArr[i18];
                    int i19 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j11 >> i19) & 255) == 128) {
                        j7 = j9;
                        jArr[i18] = ((r8 & 127) << i19) | (j11 & (~(255 << i19)));
                        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                        fArr[iFindFirstAvailableSlot] = fArr[i12];
                        fArr[i12] = 0.0f;
                        iArr[iFindFirstAvailableSlot] = iArr[i12];
                        iArr[i12] = i17;
                    } else {
                        j7 = j9;
                        jArr[i18] = ((r8 & 127) << i19) | (j11 & (~(255 << i19)));
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i12];
                        fArr[i12] = f;
                        int i20 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i12];
                        iArr[i12] = i20;
                        i12--;
                    }
                    jArr[jArr.length - 1] = (jArr[i17] & j7) | Long.MIN_VALUE;
                    i12++;
                    i9 = i17;
                    j9 = j7;
                }
            } else {
                i12++;
            }
        }
        initializeGrowth();
    }

    public final int getOrPut(float key, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = ((Number) defaultValue.invoke()).intValue();
        put(key, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(@NotNull FloatIntMap from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    public final void put(float key, int value) {
        set(key, value);
    }

    public final void putAll(@NotNull FloatIntMap from) {
        AbstractC5830k.m5330g(from, "from");
        float[] fArr = from.keys;
        int[] iArr = from.values;
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
                        set(fArr[i10], iArr[i10]);
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

    public final void remove(float key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
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
                        if (((Boolean) predicate.invoke(Float.valueOf(this.keys[i10]), Integer.valueOf(this.values[i10]))).booleanValue()) {
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
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i8 = index >> 3;
        int i9 = (index & 7) << 3;
        long j7 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j7;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j7;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableFloatIntMap mutableFloatIntMap = this;
        long[] jArr2 = mutableFloatIntMap.metadata;
        float[] fArr = mutableFloatIntMap.keys;
        int[] iArr = mutableFloatIntMap.values;
        int i = mutableFloatIntMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableFloatIntMap.metadata;
        float[] fArr2 = mutableFloatIntMap.keys;
        int[] iArr2 = mutableFloatIntMap.values;
        int i8 = mutableFloatIntMap._capacity;
        int i9 = 0;
        while (i9 < i) {
            if (((jArr2[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                float f = fArr[i9];
                int iHashCode = Float.hashCode(f) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatIntMap.findFirstAvailableSlot(i10 >>> 7);
                long j7 = i10 & 127;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j8 = (jArr3[i11] & (~(255 << i12))) | (j7 << i12);
                jArr3[i11] = j8;
                jArr3[(((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7)) >> 3] = j8;
                fArr2[iFindFirstAvailableSlot] = f;
                iArr2[iFindFirstAvailableSlot] = iArr[i9];
            } else {
                jArr = jArr2;
            }
            i9++;
            mutableFloatIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float key, int value) {
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

    public MutableFloatIntMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void minusAssign(@NotNull float[] keys) {
        AbstractC5830k.m5330g(keys, "keys");
        for (float f : keys) {
            remove(f);
        }
    }

    public final int put(float key, int value, int i) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return i;
    }

    public final boolean remove(float key, int value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
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

    public /* synthetic */ MutableFloatIntMap(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 6 : i);
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
