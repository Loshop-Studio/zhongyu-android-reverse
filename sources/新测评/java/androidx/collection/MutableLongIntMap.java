package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0086\bø\u0001\u0000J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003J\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003J&\u0010%\u001a\u00020\u00072\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0'H\u0086\bø\u0001\u0000J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0003H\u0000¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003H\u0086\u0002J\u0006\u0010.\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, m13558d2 = {"Landroidx/collection/MutableLongIntMap;", "Landroidx/collection/LongIntMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", TypedValues.TransitionType.S_FROM, "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 LongIntMap.kt\nandroidx/collection/LongIntMap\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongList.kt\nandroidx/collection/LongList\n+ 8 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1034:1\n59#2,5:1035\n1#3:1040\n1254#4,6:1041\n1399#4:1057\n1270#4:1061\n1399#4:1078\n1270#4:1082\n1399#4:1103\n1270#4:1107\n1230#4:1124\n1254#4,6:1125\n1242#4:1131\n1241#4,4:1132\n1254#4,6:1136\n1175#4:1145\n1179#4:1146\n1372#4,3:1147\n1386#4,3:1150\n1312#4:1153\n1303#4:1154\n1297#4:1155\n1309#4:1156\n1393#4:1157\n1265#4:1158\n1220#4:1159\n1262#4:1160\n1220#4:1161\n1230#4:1162\n1254#4,6:1163\n1242#4:1169\n1241#4,4:1170\n1372#4,3:1174\n1399#4:1177\n1297#4:1178\n1144#4,14:1179\n1220#4:1193\n1175#4:1197\n1179#4:1198\n1254#4,6:1199\n1220#4:1205\n1179#4:1206\n1254#4,6:1207\n1254#4,6:1213\n1179#4:1219\n1254#4,6:1220\n1268#4:1226\n1220#4:1227\n1175#4:1231\n1179#4:1232\n1230#4:1233\n1254#4,6:1234\n1242#4:1240\n1241#4,4:1241\n387#5,4:1047\n359#5,6:1051\n369#5,3:1058\n372#5,9:1062\n391#5:1071\n359#5,6:1072\n369#5,3:1079\n372#5,9:1083\n256#6,4:1092\n226#6,7:1096\n237#6,3:1104\n240#6,9:1108\n260#6:1117\n237#7,6:1118\n881#8,3:1142\n881#8,3:1194\n881#8,3:1228\n*S KotlinDebug\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n*L\n639#1:1035,5\n667#1:1041,6\n739#1:1057\n739#1:1061\n770#1:1078\n770#1:1082\n791#1:1103\n791#1:1107\n805#1:1124\n805#1:1125,6\n805#1:1131\n805#1:1132,4\n813#1:1136,6\n826#1:1145\n827#1:1146\n834#1:1147,3\n835#1:1150,3\n836#1:1153\n837#1:1154\n837#1:1155\n841#1:1156\n844#1:1157\n853#1:1158\n853#1:1159\n859#1:1160\n859#1:1161\n860#1:1162\n860#1:1163,6\n860#1:1169\n860#1:1170,4\n875#1:1174,3\n876#1:1177\n878#1:1178\n924#1:1179,14\n930#1:1193\n945#1:1197\n956#1:1198\n957#1:1199,6\n967#1:1205\n970#1:1206\n971#1:1207,6\n972#1:1213,6\n982#1:1219\n983#1:1220,6\n1022#1:1226\n1022#1:1227\n1025#1:1231\n1027#1:1232\n1027#1:1233\n1027#1:1234,6\n1027#1:1240\n1027#1:1241,4\n739#1:1047,4\n739#1:1051,6\n739#1:1058,3\n739#1:1062,9\n739#1:1071\n770#1:1072,6\n770#1:1079,3\n770#1:1083,9\n791#1:1092,4\n791#1:1096,7\n791#1:1104,3\n791#1:1108,9\n791#1:1117\n796#1:1118,6\n825#1:1142,3\n944#1:1194,3\n1024#1:1228,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongIntMap extends LongIntMap {
    private int growthLimit;

    public MutableLongIntMap() {
        this(0, 1, null);
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i10 = this._capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final int findInsertIndex(long key) {
        int iHashCode = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i20];
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iFindFirstAvailableSlot;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
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
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new long[iMax];
        this.values = new int[iMax];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(ULong.m24473constructorimpl(ULong.m24473constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m24473constructorimpl(ULong.m24473constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
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
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        long[] jArr2 = this.keys;
        int[] iArr = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i15]) * ScatterMapKt.MurmurHashC1;
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iFindFirstAvailableSlot - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iFindFirstAvailableSlot >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        jArr2[iFindFirstAvailableSlot] = jArr2[i15];
                        jArr2[i15] = 0;
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i20;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        long j15 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i15];
                        jArr2[i15] = j15;
                        int i23 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i23;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i20] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        initializeGrowth();
    }

    public final int getOrPut(long key, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = defaultValue.invoke().intValue();
        put(key, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(long key) {
        remove(key);
    }

    public final void plusAssign(LongIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(long key, int value) {
        set(key, value);
    }

    public final void putAll(LongIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        long[] jArr = from.keys;
        int[] iArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        set(jArr[i13], iArr[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void remove(long key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super Long, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(Long.valueOf(this.keys[i13]), Integer.valueOf(this.values[i13])).booleanValue()) {
                            removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @PublishedApi
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableLongIntMap mutableLongIntMap = this;
        long[] jArr2 = mutableLongIntMap.metadata;
        long[] jArr3 = mutableLongIntMap.keys;
        int[] iArr = mutableLongIntMap.values;
        int i10 = mutableLongIntMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableLongIntMap.metadata;
        long[] jArr5 = mutableLongIntMap.keys;
        int[] iArr2 = mutableLongIntMap.values;
        int i11 = mutableLongIntMap._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i12];
                int iHashCode = Long.hashCode(j10) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableLongIntMap.findFirstAvailableSlot(i13 >>> 7);
                long j11 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i14] & (~(255 << i15))) | (j11 << i15);
                jArr4[i14] = j12;
                jArr4[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j12;
                jArr5[iFindFirstAvailableSlot] = j10;
                iArr2[iFindFirstAvailableSlot] = iArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            mutableLongIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long key, int value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public MutableLongIntMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void minusAssign(long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (long j10 : keys) {
            remove(j10);
        }
    }

    public final int put(long key, int value, int i10) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i10 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return i10;
    }

    public final boolean remove(long key, int value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(LongSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(jArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public /* synthetic */ MutableLongIntMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(LongList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(jArr[i11]);
        }
    }
}
