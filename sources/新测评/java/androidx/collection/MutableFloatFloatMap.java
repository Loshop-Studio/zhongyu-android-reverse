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

@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0086\bø\u0001\u0000J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J\u001e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J&\u0010%\u001a\u00020\u00072\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0'H\u0086\bø\u0001\u0000J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0003H\u0000¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0086\u0002J\u0006\u0010.\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, m13558d2 = {"Landroidx/collection/MutableFloatFloatMap;", "Landroidx/collection/FloatFloatMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/FloatList;", "Landroidx/collection/FloatSet;", "", "plusAssign", TypedValues.TransitionType.S_FROM, "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n257#6,4:1094\n227#6,7:1098\n238#6,3:1106\n241#6,9:1110\n261#6:1119\n237#7,6:1120\n882#8,3:1144\n882#8,3:1196\n882#8,3:1230\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatFloatMap extends FloatFloatMap {
    private int growthLimit;

    public MutableFloatFloatMap() {
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

    private final int findInsertIndex(float key) {
        int iHashCode = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
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
        this.keys = new float[iMax];
        this.values = new float[iMax];
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
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        int i11 = (i10 + 7) >> 3;
        boolean z9 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i13 = lastIndex - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j13 = (jArr[i15] >> i16) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Float.hashCode(fArr[i14]) * ScatterMapKt.MurmurHashC1;
                int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i17);
                int i18 = i17 & i10;
                boolean z10 = z9;
                if (((iFindFirstAvailableSlot - i18) & i10) / 8 == ((i14 - i18) & i10) / 8) {
                    jArr[i15] = ((r8 & 127) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z10 ? 1 : 0] & j12) | Long.MIN_VALUE;
                    i14++;
                    z9 = z10 ? 1 : 0;
                } else {
                    int i19 = iFindFirstAvailableSlot >> 3;
                    long j14 = jArr[i19];
                    int i20 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j14 >> i20) & 255) == 128) {
                        j10 = j12;
                        jArr[i19] = ((r8 & 127) << i20) | (j14 & (~(255 << i20)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        fArr[iFindFirstAvailableSlot] = fArr[i14];
                        fArr[i14] = 0.0f;
                        fArr2[iFindFirstAvailableSlot] = fArr2[i14];
                        fArr2[i14] = 0.0f;
                    } else {
                        j10 = j12;
                        jArr[i19] = ((r8 & 127) << i20) | (j14 & (~(255 << i20)));
                        float f10 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i14];
                        fArr[i14] = f10;
                        float f11 = fArr2[iFindFirstAvailableSlot];
                        fArr2[iFindFirstAvailableSlot] = fArr2[i14];
                        fArr2[i14] = f11;
                        i14--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z10 ? 1 : 0] & j10) | Long.MIN_VALUE;
                    i14++;
                    z9 = z10 ? 1 : 0;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        initializeGrowth();
    }

    public final float getOrPut(float key, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        put(key, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(float key, float value) {
        set(key, value);
    }

    public final void putAll(FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        float[] fArr2 = from.values;
        long[] jArr = from.metadata;
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
                        set(fArr[i13], fArr2[i13]);
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

    public final void remove(float key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super Float, ? super Float, Boolean> predicate) {
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
                        if (predicate.invoke(Float.valueOf(this.keys[i13]), Float.valueOf(this.values[i13])).booleanValue()) {
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
        MutableFloatFloatMap mutableFloatFloatMap = this;
        long[] jArr2 = mutableFloatFloatMap.metadata;
        float[] fArr = mutableFloatFloatMap.keys;
        float[] fArr2 = mutableFloatFloatMap.values;
        int i10 = mutableFloatFloatMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableFloatFloatMap.metadata;
        float[] fArr3 = mutableFloatFloatMap.keys;
        float[] fArr4 = mutableFloatFloatMap.values;
        int i11 = mutableFloatFloatMap._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i12];
                int iHashCode = Float.hashCode(f10) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatFloatMap.findFirstAvailableSlot(i13 >>> 7);
                long j10 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i14] & (~(255 << i15))) | (j10 << i15);
                jArr3[i14] = j11;
                jArr3[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j11;
                fArr3[iFindFirstAvailableSlot] = f10;
                fArr4[iFindFirstAvailableSlot] = fArr2[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            mutableFloatFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float key, float value) {
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

    public MutableFloatFloatMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void minusAssign(float[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (float f10 : keys) {
            remove(f10);
        }
    }

    public final float put(float key, float value, float f10) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f10 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return f10;
    }

    public final boolean remove(float key, float value) {
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
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(fArr[(i10 << 3) + i12]);
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

    public /* synthetic */ MutableFloatFloatMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(FloatList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(fArr[i11]);
        }
    }
}
