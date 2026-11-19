package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001dH\u0086\nJ\u0011\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0001H\u0086\nJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0001J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012J&\u0010&\u001a\u00020\u00072\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0(H\u0086\bø\u0001\u0000J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0003H\u0001J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0003H\u0000¢\u0006\u0002\b-J\u0019\u0010.\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012H\u0086\u0002J\u0006\u0010/\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, m13413d2 = {"Landroidx/collection/MutableFloatLongMap;", "Landroidx/collection/FloatLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/FloatList;", "Landroidx/collection/FloatSet;", "", "plusAssign", TypedValues.TransitionType.S_FROM, "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n257#6,4:1094\n227#6,7:1098\n238#6,3:1106\n241#6,9:1110\n261#6:1119\n237#7,6:1120\n882#8,3:1144\n882#8,3:1196\n882#8,3:1230\n*S KotlinDebug\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatLongMap extends FloatLongMap {
    private int growthLimit;

    public MutableFloatLongMap() {
        this(0, 1, null);
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i9 = this._capacity;
        int i10 = hash1 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j9 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j10 = j9 & ((~j9) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j10) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    private final int findInsertIndex(float key) {
        int iHashCode = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & WorkQueueKt.MASK;
        int i12 = this._capacity;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i14;
            long j11 = j9 ^ (j10 * ScatterMapKt.BitmaskLsb);
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                }
                this._size++;
                int i18 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i19 = iFindFirstAvailableSlot >> 3;
                long j13 = jArr2[i19];
                int i20 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i18 - (((j13 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this._capacity;
                long j14 = ((~(255 << i20)) & j13) | (j10 << i20);
                jArr2[i19] = j14;
                jArr2[(((iFindFirstAvailableSlot - 7) & i21) + (i21 & 7)) >> 3] = j14;
                return ~iFindFirstAvailableSlot;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
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
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i9 = capacity >> 3;
        long j9 = 255 << ((capacity & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j9)) | j9;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new float[iMax];
        this.values = new long[iMax];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(ULong.m24932constructorimpl(ULong.m24932constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m24932constructorimpl(ULong.m24932constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i9 = this._capacity;
            int i10 = i9 >> 3;
            long j9 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j9)) | j9;
        }
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j9;
        long[] jArr = this.metadata;
        int i9 = this._capacity;
        float[] fArr = this.keys;
        long[] jArr2 = this.values;
        int i10 = (i9 + 7) >> 3;
        boolean z9 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11] & (-9187201950435737472L);
            jArr[i11] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i12 = lastIndex - 1;
        long j11 = 72057594037927935L;
        jArr[i12] = (jArr[i12] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i13 = 0;
        while (i13 != i9) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j12 = (jArr[i14] >> i15) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Float.hashCode(fArr[i13]) * ScatterMapKt.MurmurHashC1;
                int i16 = iHashCode ^ (iHashCode << 16);
                int i17 = i16 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i17);
                int i18 = i17 & i9;
                boolean z10 = z9;
                if (((iFindFirstAvailableSlot - i18) & i9) / 8 == ((i13 - i18) & i9) / 8) {
                    jArr[i14] = ((i16 & WorkQueueKt.MASK) << i15) | ((~(255 << i15)) & jArr[i14]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z10 ? 1 : 0] & j11) | Long.MIN_VALUE;
                    i13++;
                    z9 = z10 ? 1 : 0;
                } else {
                    int i19 = iFindFirstAvailableSlot >> 3;
                    long j13 = jArr[i19];
                    int i20 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j13 >> i20) & 255) == 128) {
                        j9 = j11;
                        jArr[i19] = ((i16 & WorkQueueKt.MASK) << i20) | (j13 & (~(255 << i20)));
                        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                        fArr[iFindFirstAvailableSlot] = fArr[i13];
                        fArr[i13] = 0.0f;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i13];
                        jArr2[i13] = 0;
                    } else {
                        j9 = j11;
                        jArr[i19] = ((i16 & WorkQueueKt.MASK) << i20) | (j13 & (~(255 << i20)));
                        float f10 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i13];
                        fArr[i13] = f10;
                        long j14 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i13];
                        jArr2[i13] = j14;
                        i13--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z10 ? 1 : 0] & j9) | Long.MIN_VALUE;
                    i13++;
                    z9 = z10 ? 1 : 0;
                    j11 = j9;
                }
            } else {
                i13++;
            }
        }
        initializeGrowth();
    }

    public final long getOrPut(float key, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        put(key, jLongValue);
        return jLongValue;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(FloatLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(float key, long value) {
        set(key, value);
    }

    public final void putAll(FloatLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr2[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128) {
                        int i12 = (i9 << 3) + i11;
                        set(fArr[i12], jArr[i12]);
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

    public final void remove(float key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super Float, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
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
                        if (predicate.invoke(Float.valueOf(this.keys[i12]), Long.valueOf(this.values[i12])).booleanValue()) {
                            removeValueAt(i12);
                        }
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
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i9 = this._capacity;
        int i10 = index >> 3;
        int i11 = (index & 7) << 3;
        long j9 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j9;
        jArr[(((index - 7) & i9) + (i9 & 7)) >> 3] = j9;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableFloatLongMap mutableFloatLongMap = this;
        long[] jArr2 = mutableFloatLongMap.metadata;
        float[] fArr = mutableFloatLongMap.keys;
        long[] jArr3 = mutableFloatLongMap.values;
        int i9 = mutableFloatLongMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableFloatLongMap.metadata;
        float[] fArr2 = mutableFloatLongMap.keys;
        long[] jArr5 = mutableFloatLongMap.values;
        int i10 = mutableFloatLongMap._capacity;
        int i11 = 0;
        while (i11 < i9) {
            if (((jArr2[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i11];
                int iHashCode = Float.hashCode(f10) * ScatterMapKt.MurmurHashC1;
                int i12 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatLongMap.findFirstAvailableSlot(i12 >>> 7);
                long j9 = i12 & WorkQueueKt.MASK;
                int i13 = iFindFirstAvailableSlot >> 3;
                int i14 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j10 = (jArr4[i13] & (~(255 << i14))) | (j9 << i14);
                jArr4[i13] = j10;
                jArr4[(((iFindFirstAvailableSlot - 7) & i10) + (i10 & 7)) >> 3] = j10;
                fArr2[iFindFirstAvailableSlot] = f10;
                jArr5[iFindFirstAvailableSlot] = jArr3[i11];
            } else {
                jArr = jArr2;
            }
            i11++;
            mutableFloatLongMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float key, long value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i9 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i9) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i9 - this._capacity;
    }

    public MutableFloatLongMap(int i9) {
        super(null);
        if (!(i9 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i9));
    }

    public final void minusAssign(float[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (float f10 : keys) {
            remove(f10);
        }
    }

    public final long put(float key, long value, long j9) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            j9 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return j9;
    }

    public final boolean remove(float key, long value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(FloatSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(fArr[(i9 << 3) + i11]);
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

    public /* synthetic */ MutableFloatLongMap(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 6 : i9);
    }

    public final void minusAssign(FloatList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.content;
        int i9 = keys._size;
        for (int i10 = 0; i10 < i9; i10++) {
            remove(fArr[i10]);
        }
    }
}
