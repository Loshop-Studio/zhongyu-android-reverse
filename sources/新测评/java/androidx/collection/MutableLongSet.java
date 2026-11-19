package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0001J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u000eJ\r\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0086\u0002J\u0011\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0001J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020\u0003H\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m13558d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "", "addAll", "elements", "", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "trim", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n59#2,5:886\n1#3:891\n1254#4,6:892\n1399#4:911\n1270#4:915\n1179#4:931\n1175#4:934\n1372#4,3:938\n1386#4,3:942\n1312#4:946\n1303#4:948\n1297#4:949\n1309#4:954\n1393#4:956\n1179#4:970\n1175#4:973\n1372#4,3:977\n1386#4,3:981\n1312#4:985\n1303#4:987\n1297#4:988\n1309#4:993\n1393#4:995\n1399#4:1017\n1270#4:1021\n1230#4:1032\n1254#4,6:1033\n1242#4:1039\n1241#4,4:1040\n1254#4,6:1044\n1175#4:1053\n1179#4:1054\n1372#4,3:1055\n1386#4,3:1058\n1312#4:1061\n1303#4:1062\n1297#4:1063\n1309#4:1064\n1393#4:1065\n1265#4:1066\n1220#4:1067\n1262#4:1068\n1220#4:1069\n1230#4:1070\n1254#4,6:1071\n1242#4:1077\n1241#4,4:1078\n1372#4,3:1082\n1399#4:1085\n1297#4:1086\n1144#4,14:1087\n1220#4:1101\n1175#4:1105\n1179#4:1106\n1254#4,6:1107\n1220#4:1113\n1179#4:1114\n1254#4,6:1115\n1254#4,6:1121\n1179#4:1127\n1254#4,6:1128\n1268#4:1134\n1220#4:1135\n1175#4:1139\n1179#4:1140\n1230#4:1141\n1254#4,6:1142\n1242#4:1148\n1241#4,4:1149\n13337#5,2:898\n13337#5,2:1004\n256#6,4:900\n226#6,7:904\n237#6,3:912\n240#6,9:916\n260#6:925\n426#6:926\n427#6:930\n429#6,2:932\n431#6,3:935\n434#6:941\n435#6:945\n436#6:947\n437#6,4:950\n443#6:955\n444#6,8:957\n426#6:965\n427#6:969\n429#6,2:971\n431#6,3:974\n434#6:980\n435#6:984\n436#6:986\n437#6,4:989\n443#6:994\n444#6,8:996\n256#6,4:1006\n226#6,7:1010\n237#6,3:1018\n240#6,9:1022\n260#6:1031\n881#7,3:927\n881#7,3:966\n881#7,3:1050\n881#7,3:1102\n881#7,3:1136\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n478#1:886,5\n505#1:892,6\n578#1:911\n578#1:915\n589#1:931\n589#1:934\n589#1:938,3\n589#1:942,3\n589#1:946\n589#1:948\n589#1:949\n589#1:954\n589#1:956\n603#1:970\n603#1:973\n603#1:977,3\n603#1:981,3\n603#1:985\n603#1:987\n603#1:988\n603#1:993\n603#1:995\n648#1:1017\n648#1:1021\n656#1:1032\n656#1:1033,6\n656#1:1039\n656#1:1040,4\n664#1:1044,6\n677#1:1053\n678#1:1054\n685#1:1055,3\n686#1:1058,3\n687#1:1061\n688#1:1062\n688#1:1063\n692#1:1064\n695#1:1065\n704#1:1066\n704#1:1067\n710#1:1068\n710#1:1069\n711#1:1070\n711#1:1071,6\n711#1:1077\n711#1:1078,4\n725#1:1082,3\n726#1:1085\n728#1:1086\n774#1:1087,14\n780#1:1101\n795#1:1105\n806#1:1106\n807#1:1107,6\n817#1:1113\n820#1:1114\n821#1:1115,6\n822#1:1121,6\n829#1:1127\n830#1:1128,6\n863#1:1134\n863#1:1135\n866#1:1139\n868#1:1140\n868#1:1141\n868#1:1142,6\n868#1:1148\n868#1:1149,4\n556#1:898,2\n627#1:1004,2\n578#1:900,4\n578#1:904,7\n578#1:912,3\n578#1:916,9\n578#1:925\n589#1:926\n589#1:930\n589#1:932,2\n589#1:935,3\n589#1:941\n589#1:945\n589#1:947\n589#1:950,4\n589#1:955\n589#1:957,8\n603#1:965\n603#1:969\n603#1:971,2\n603#1:974,3\n603#1:980\n603#1:984\n603#1:986\n603#1:989,4\n603#1:994\n603#1:996,8\n648#1:1006,4\n648#1:1010,7\n648#1:1018,3\n648#1:1022,9\n648#1:1031\n589#1:927,3\n603#1:966,3\n676#1:1050,3\n794#1:1102,3\n865#1:1136,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongSet extends LongSet {
    private int growthLimit;

    public MutableLongSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(long element) {
        int iHashCode = Long.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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
                return iFindFirstAvailableSlot;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
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
        this.elements = new long[iMax];
    }

    private final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
    }

    public final boolean add(long element) {
        int i10 = this._size;
        this.elements[findAbsoluteInsertIndex(element)] = element;
        return this._size != i10;
    }

    public final boolean addAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
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
        long[] jArr2 = this.elements;
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
                int iHashCode = Long.hashCode(jArr2[i14]) * ScatterMapKt.MurmurHashC1;
                int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i17);
                int i18 = i17 & i10;
                boolean z10 = z9;
                if (((iFindFirstAvailableSlot - i18) & i10) / 8 == ((i14 - i18) & i10) / 8) {
                    jArr[i15] = ((r7 & 127) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z10 ? 1 : 0] & j12) | Long.MIN_VALUE;
                    i14++;
                    z9 = z10 ? 1 : 0;
                } else {
                    int i19 = iFindFirstAvailableSlot >> 3;
                    long j14 = jArr[i19];
                    int i20 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j14 >> i20) & 255) == 128) {
                        j10 = j12;
                        jArr[i19] = ((r7 & 127) << i20) | (j14 & (~(255 << i20)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iFindFirstAvailableSlot] = jArr2[i14];
                        jArr2[i14] = 0;
                    } else {
                        j10 = j12;
                        jArr[i19] = ((r7 & 127) << i20) | (j14 & (~(255 << i20)));
                        long j15 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i14];
                        jArr2[i14] = j15;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.metadata
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
            long[] r11 = r14.elements
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
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
            if (r4 == 0) goto L6c
            r10 = -1
        L66:
            if (r10 < 0) goto L6b
            r14.removeElementAt(r10)
        L6b:
            return
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.minusAssign(long):void");
    }

    public final void plusAssign(long element) {
        this.elements[findAbsoluteInsertIndex(element)] = element;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
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
            long[] r14 = r0.elements
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
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
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.removeElementAt(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.remove(long):boolean");
    }

    public final boolean removeAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i10 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i11 = this._capacity;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i12];
                int iHashCode = Long.hashCode(j10) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                long j11 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                long j12 = (jArr3[i14] & (~(255 << i15))) | (j11 << i15);
                jArr3[i14] = j12;
                jArr3[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j12;
                jArr4[iFindFirstAvailableSlot] = j10;
            }
        }
    }

    @IntRange(from = 0)
    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public MutableLongSet(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void plusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            plusAssign(j10);
        }
    }

    public final boolean addAll(LongSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
    }

    public final boolean removeAll(LongSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    public final void plusAssign(LongSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
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
                        plusAssign(jArr[(i10 << 3) + i12]);
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

    public /* synthetic */ MutableLongSet(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            minusAssign(j10);
        }
    }

    public final void minusAssign(LongSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
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
                        minusAssign(jArr[(i10 << 3) + i12]);
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
}
