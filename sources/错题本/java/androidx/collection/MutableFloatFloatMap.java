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

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b!\u0010$J-\u0010'\u001a\u00020\u00062\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0%H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b)\u0010\"J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0086\n¢\u0006\u0004\b)\u0010,J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020-H\u0086\n¢\u0006\u0004\b)\u0010.J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020/H\u0086\n¢\u0006\u0004\b)\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0002H\u0001¢\u0006\u0004\b2\u0010\u0005J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u0010\u000bJ\u0017\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0002H\u0000¢\u0006\u0004\b;\u0010\u0005R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006?"}, m5110d2 = {"Landroidx/collection/MutableFloatFloatMap;", "Landroidx/collection/FloatFloatMap;", "", "initialCapacity", "<init>", "(I)V", "Ld6/s;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLr6/a;)F", "value", "set", "(FF)V", "put", "default", "(FFF)F", TypedValues.TransitionType.S_FROM, "putAll", "(Landroidx/collection/FloatFloatMap;)V", "plusAssign", "remove", "(F)V", "", "(FF)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lr6/e;)V", "minusAssign", "", "keys", "([F)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "Landroidx/collection/FloatList;", "(Landroidx/collection/FloatList;)V", "index", "removeValueAt", "clear", "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n257#6,4:1094\n227#6,7:1098\n238#6,3:1106\n241#6,9:1110\n261#6:1119\n237#7,6:1120\n882#8,3:1144\n882#8,3:1196\n882#8,3:1230\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatFloatMap extends FloatFloatMap {
    private int growthLimit;

    public MutableFloatFloatMap() {
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
        this.values = new float[iMax];
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
        float[] fArr2 = this.values;
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
                        fArr2[iFindFirstAvailableSlot] = fArr2[i11];
                        fArr2[i11] = 0.0f;
                    } else {
                        j7 = j9;
                        jArr[i16] = ((r8 & 127) << i17) | (j11 & (~(255 << i17)));
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i11];
                        fArr[i11] = f;
                        float f7 = fArr2[iFindFirstAvailableSlot];
                        fArr2[iFindFirstAvailableSlot] = fArr2[i11];
                        fArr2[i11] = f7;
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

    public final float getOrPut(float key, @NotNull InterfaceC6469a defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = ((Number) defaultValue.invoke()).floatValue();
        put(key, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(@NotNull FloatFloatMap from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    public final void put(float key, float value) {
        set(key, value);
    }

    public final void putAll(@NotNull FloatFloatMap from) {
        AbstractC5830k.m5330g(from, "from");
        float[] fArr = from.keys;
        float[] fArr2 = from.values;
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
                        set(fArr[i10], fArr2[i10]);
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
                        if (((Boolean) predicate.invoke(Float.valueOf(this.keys[i10]), Float.valueOf(this.values[i10]))).booleanValue()) {
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
        MutableFloatFloatMap mutableFloatFloatMap = this;
        long[] jArr2 = mutableFloatFloatMap.metadata;
        float[] fArr = mutableFloatFloatMap.keys;
        float[] fArr2 = mutableFloatFloatMap.values;
        int i = mutableFloatFloatMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableFloatFloatMap.metadata;
        float[] fArr3 = mutableFloatFloatMap.keys;
        float[] fArr4 = mutableFloatFloatMap.values;
        int i8 = mutableFloatFloatMap._capacity;
        int i9 = 0;
        while (i9 < i) {
            if (((jArr2[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                float f = fArr[i9];
                int iHashCode = Float.hashCode(f) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatFloatMap.findFirstAvailableSlot(i10 >>> 7);
                long j7 = i10 & 127;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j8 = (jArr3[i11] & (~(255 << i12))) | (j7 << i12);
                jArr3[i11] = j8;
                jArr3[(((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7)) >> 3] = j8;
                fArr3[iFindFirstAvailableSlot] = f;
                fArr4[iFindFirstAvailableSlot] = fArr2[i9];
            } else {
                jArr = jArr2;
            }
            i9++;
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
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i - this._capacity;
    }

    public MutableFloatFloatMap(int i) {
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

    public final float put(float key, float value, float f) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return f;
    }

    public final boolean remove(float key, float value) {
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

    public /* synthetic */ MutableFloatFloatMap(int i, int i8, AbstractC5824e abstractC5824e) {
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
