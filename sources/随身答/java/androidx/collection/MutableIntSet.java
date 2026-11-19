package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\rJ\r\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0003H\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m13413d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "addAll", "elements", "", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "trim", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 IntSet.kt\nandroidx/collection/IntSet\n+ 7 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,884:1\n59#2,5:885\n1#3:890\n1254#4,6:891\n1399#4:910\n1270#4:914\n1179#4:930\n1175#4:933\n1372#4,3:937\n1386#4,3:941\n1312#4:945\n1303#4:947\n1297#4:948\n1309#4:953\n1393#4:955\n1179#4:969\n1175#4:972\n1372#4,3:976\n1386#4,3:980\n1312#4:984\n1303#4:986\n1297#4:987\n1309#4:992\n1393#4:994\n1399#4:1016\n1270#4:1020\n1230#4:1031\n1254#4,6:1032\n1242#4:1038\n1241#4,4:1039\n1254#4,6:1043\n1175#4:1052\n1179#4:1053\n1372#4,3:1054\n1386#4,3:1057\n1312#4:1060\n1303#4:1061\n1297#4:1062\n1309#4:1063\n1393#4:1064\n1265#4:1065\n1220#4:1066\n1262#4:1067\n1220#4:1068\n1230#4:1069\n1254#4,6:1070\n1242#4:1076\n1241#4,4:1077\n1372#4,3:1081\n1399#4:1084\n1297#4:1085\n1144#4,14:1086\n1220#4:1100\n1175#4:1104\n1179#4:1105\n1254#4,6:1106\n1220#4:1112\n1179#4:1113\n1254#4,6:1114\n1254#4,6:1120\n1179#4:1126\n1254#4,6:1127\n1268#4:1133\n1220#4:1134\n1175#4:1138\n1179#4:1139\n1230#4:1140\n1254#4,6:1141\n1242#4:1147\n1241#4,4:1148\n13330#5,2:897\n13330#5,2:1003\n255#6,4:899\n225#6,7:903\n236#6,3:911\n239#6,9:915\n259#6:924\n425#6:925\n426#6:929\n428#6,2:931\n430#6,3:934\n433#6:940\n434#6:944\n435#6:946\n436#6,4:949\n442#6:954\n443#6,8:956\n425#6:964\n426#6:968\n428#6,2:970\n430#6,3:973\n433#6:979\n434#6:983\n435#6:985\n436#6,4:988\n442#6:993\n443#6,8:995\n255#6,4:1005\n225#6,7:1009\n236#6,3:1017\n239#6,9:1021\n259#6:1030\n880#7,3:926\n880#7,3:965\n880#7,3:1049\n880#7,3:1101\n880#7,3:1135\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n477#1:885,5\n504#1:891,6\n577#1:910\n577#1:914\n588#1:930\n588#1:933\n588#1:937,3\n588#1:941,3\n588#1:945\n588#1:947\n588#1:948\n588#1:953\n588#1:955\n602#1:969\n602#1:972\n602#1:976,3\n602#1:980,3\n602#1:984\n602#1:986\n602#1:987\n602#1:992\n602#1:994\n647#1:1016\n647#1:1020\n655#1:1031\n655#1:1032,6\n655#1:1038\n655#1:1039,4\n663#1:1043,6\n676#1:1052\n677#1:1053\n684#1:1054,3\n685#1:1057,3\n686#1:1060\n687#1:1061\n687#1:1062\n691#1:1063\n694#1:1064\n703#1:1065\n703#1:1066\n709#1:1067\n709#1:1068\n710#1:1069\n710#1:1070,6\n710#1:1076\n710#1:1077,4\n724#1:1081,3\n725#1:1084\n727#1:1085\n773#1:1086,14\n779#1:1100\n794#1:1104\n805#1:1105\n806#1:1106,6\n816#1:1112\n819#1:1113\n820#1:1114,6\n821#1:1120,6\n828#1:1126\n829#1:1127,6\n862#1:1133\n862#1:1134\n865#1:1138\n867#1:1139\n867#1:1140\n867#1:1141,6\n867#1:1147\n867#1:1148,4\n555#1:897,2\n626#1:1003,2\n577#1:899,4\n577#1:903,7\n577#1:911,3\n577#1:915,9\n577#1:924\n588#1:925\n588#1:929\n588#1:931,2\n588#1:934,3\n588#1:940\n588#1:944\n588#1:946\n588#1:949,4\n588#1:954\n588#1:956,8\n602#1:964\n602#1:968\n602#1:970,2\n602#1:973,3\n602#1:979\n602#1:983\n602#1:985\n602#1:988,4\n602#1:993\n602#1:995,8\n647#1:1005,4\n647#1:1009,7\n647#1:1017,3\n647#1:1021,9\n647#1:1030\n588#1:926,3\n602#1:965,3\n675#1:1049,3\n793#1:1101,3\n864#1:1135,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntSet extends IntSet {
    private int growthLimit;

    public MutableIntSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(int element) {
        int iHashCode = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
            int i17 = 1;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i18 = i14;
            long j11 = j9 ^ (j10 * ScatterMapKt.BitmaskLsb);
            long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                int i19 = i17;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i17 = i19;
            }
            int i20 = i17;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i22 = iFindFirstAvailableSlot >> 3;
                long j13 = jArr2[i22];
                int i23 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i21 - (((j13 >> i23) & 255) == 128 ? i20 : 0);
                int i24 = this._capacity;
                long j14 = ((~(255 << i23)) & j13) | (j10 << i23);
                jArr2[i22] = j14;
                jArr2[(((iFindFirstAvailableSlot - 7) & i24) + (i24 & 7)) >> 3] = j14;
                return iFindFirstAvailableSlot;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
        }
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
        this.elements = new int[iMax];
    }

    private final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i9 = this._capacity;
        int i10 = index >> 3;
        int i11 = (index & 7) << 3;
        long j9 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j9;
        jArr[(((index - 7) & i9) + (i9 & 7)) >> 3] = j9;
    }

    public final boolean add(int element) {
        int i9 = this._size;
        this.elements[findAbsoluteInsertIndex(element)] = element;
        return this._size != i9;
    }

    public final boolean addAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        plusAssign(elements);
        return i9 != this._size;
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
        int[] iArr = this.elements;
        int i10 = (i9 + 7) >> 3;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i13 = lastIndex - 1;
        long j11 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i14 = 0;
        while (i14 != i9) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j12 = (jArr[i15] >> i16) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Integer.hashCode(iArr[i14]) * ScatterMapKt.MurmurHashC1;
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i18);
                int i19 = i18 & i9;
                int i20 = i11;
                if (((iFindFirstAvailableSlot - i19) & i9) / 8 == ((i14 - i19) & i9) / 8) {
                    jArr[i15] = ((i17 & WorkQueueKt.MASK) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i20] & j11) | Long.MIN_VALUE;
                    i14++;
                    i11 = i20;
                } else {
                    int i21 = iFindFirstAvailableSlot >> 3;
                    long j13 = jArr[i21];
                    int i22 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j13 >> i22) & 255) == 128) {
                        j9 = j11;
                        jArr[i21] = ((i17 & WorkQueueKt.MASK) << i22) | (j13 & (~(255 << i22)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        iArr[iFindFirstAvailableSlot] = iArr[i14];
                        iArr[i14] = i20;
                    } else {
                        j9 = j11;
                        jArr[i21] = ((i17 & WorkQueueKt.MASK) << i22) | (j13 & (~(255 << i22)));
                        int i23 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i14];
                        iArr[i14] = i23;
                        i14--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i20] & j9) | Long.MIN_VALUE;
                    i14++;
                    i11 = i20;
                    j11 = j9;
                }
            } else {
                i14++;
            }
        }
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
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
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.elements
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6a
            r10 = -1
        L64:
            if (r10 < 0) goto L69
            r13.removeElementAt(r10)
        L69:
            return
        L6a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.minusAssign(int):void");
    }

    public final void plusAssign(int element) {
        this.elements[findAbsoluteInsertIndex(element)] = element;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(int r19) {
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
            if (r6 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            r4 = r11
        L6d:
            if (r4 == 0) goto L72
            r0.removeElementAt(r10)
        L72:
            return r4
        L73:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.remove(int):boolean");
    }

    public final boolean removeAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        minusAssign(elements);
        return i9 != this._size;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i9 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.elements;
        int i10 = this._capacity;
        for (int i11 = 0; i11 < i9; i11++) {
            if (((jArr[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128) {
                int i12 = iArr[i11];
                int iHashCode = Integer.hashCode(i12) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                long j9 = i13 & WorkQueueKt.MASK;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                long j10 = (jArr2[i14] & (~(255 << i15))) | (j9 << i15);
                jArr2[i14] = j10;
                jArr2[(((iFindFirstAvailableSlot - 7) & i10) + (i10 & 7)) >> 3] = j10;
                iArr2[iFindFirstAvailableSlot] = i12;
            }
        }
    }

    @IntRange(from = 0)
    public final int trim() {
        int i9 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i9) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i9 - this._capacity;
    }

    public MutableIntSet(int i9) {
        super(null);
        if (!(i9 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i9));
    }

    public final void plusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i9 : elements) {
            plusAssign(i9);
        }
    }

    public final boolean addAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        plusAssign(elements);
        return i9 != this._size;
    }

    public final boolean removeAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        minusAssign(elements);
        return i9 != this._size;
    }

    public final void plusAssign(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign(iArr[(i9 << 3) + i11]);
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

    public /* synthetic */ MutableIntSet(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 6 : i9);
    }

    public final void minusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i9 : elements) {
            minusAssign(i9);
        }
    }

    public final void minusAssign(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign(iArr[(i9 << 3) + i11]);
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
}
