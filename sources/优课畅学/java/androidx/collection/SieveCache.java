package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.InterfaceC8469g;
import p123h7.C8731k;
import p123h7.C8736p;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
public final class SieveCache<K, V> {
    private int _capacity;
    private int _count;
    private int _maxSize;
    private int _size;
    private final InterfaceC10570l createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;
    public Object[] keys;
    public long[] metadata;
    private long[] nodes;
    private final InterfaceC10576r onEntryRemoved;
    private final InterfaceC10574p sizeOf;
    private int tail;
    public Object[] values;

    public SieveCache(@IntRange(from = 1, m244to = 2147483646) int i10, @IntRange(from = 0, m244to = 2147483646) int i11, InterfaceC10574p sizeOf, InterfaceC10570l createValueFromKey, InterfaceC10576r onEntryRemoved) {
        AbstractC9133u.m16133g(sizeOf, "sizeOf");
        AbstractC9133u.m16133g(createValueFromKey, "createValueFromKey");
        AbstractC9133u.m16133g(onEntryRemoved, "onEntryRemoved");
        this.sizeOf = sizeOf;
        this.createValueFromKey = createValueFromKey;
        this.onEntryRemoved = onEntryRemoved;
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (!(i10 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i10;
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i10 = this.hand;
        if (i10 == Integer.MAX_VALUE) {
            i10 = this.tail;
        }
        while (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            if (((int) ((j10 >> 62) & 1)) == 0) {
                break;
            }
            int i11 = (int) (SieveCacheKt.NodeLinkMask & (j10 >> 31));
            jArr[i10] = 4611686018427387903L & j10;
            i10 = i11 != Integer.MAX_VALUE ? i11 : this.tail;
        }
        int i12 = (int) (SieveCacheKt.NodeLinkMask & (jArr[i10] >> 31));
        this.hand = i12 != Integer.MAX_VALUE ? i12 : Integer.MAX_VALUE;
        return i10;
    }

    private final int findFirstAvailableSlot(int i10) {
        int i11 = this._capacity;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final int findInsertIndex(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
            int i18 = i12;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC9133u.m16128b(this.keys[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this._count++;
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
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int findKeyIndex(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC9133u.m16128b(this.keys[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    private final void fixupNodes(long[] jArr) {
        long[] jArr2 = this.nodes;
        int length = jArr2.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr2[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (j10 & SieveCacheKt.NodeLinkMask);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i12] & 4294967295L))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & jArr[i13]);
            }
            jArr2[i10] = i11 | j11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = (int) (jArr[i14] & 4294967295L);
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = (int) (jArr[i15] & 4294967295L);
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = (int) (jArr[i16] & 4294967295L);
        }
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - getCount();
    }

    private final void initializeMetadata(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC8797p.m14616F(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int i10) {
        long[] emptyNodes;
        int iMax = i10 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i10)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr = new long[iMax];
            AbstractC8797p.m14616F(jArr, 4611686018427387903L, 0, 0, 6, null);
            emptyNodes = jArr;
        }
        this.nodes = emptyNodes;
    }

    private final void markNodeVisited(int i10) {
        long[] jArr = this.nodes;
        jArr[i10] = (jArr[i10] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final void moveNodeToHead(int i10) {
        long[] jArr = this.nodes;
        int i11 = this.head;
        jArr[i10] = (i11 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((i10 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = i10;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = i10;
        }
    }

    private final void removeNode(int i10) {
        long[] jArr = this.nodes;
        long j10 = jArr[i10];
        int i11 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
        int i12 = (int) (j10 & SieveCacheKt.NodeLinkMask);
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = (jArr[i11] & SieveCacheKt.NodeMetaAndPreviousMask) | (i12 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((i11 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i12] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i11;
        }
        if (this.hand == i10) {
            this.hand = i11;
        }
        jArr[i10] = 4611686018427387903L;
    }

    private final V removeValueAt(int i10) {
        this._count--;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.keys[i10] = null;
        Object[] objArr = this.values;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        long[] jArr2 = this.nodes;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
        int i15 = (int) (j11 & SieveCacheKt.NodeLinkMask);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & SieveCacheKt.NodeMetaAndPreviousMask) | (i15 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((i14 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i15] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i14;
        }
        if (this.hand == i10) {
            this.hand = i14;
        }
        jArr2[i10] = 4611686018427387903L;
        return v10;
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(C8731k.m14278b(C8731k.m14278b(getCount()) * 32) ^ Long.MIN_VALUE, C8731k.m14278b(C8731k.m14278b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final boolean all(InterfaceC10574p predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this._count != 0;
    }

    public final boolean contains(K key) {
        AbstractC9133u.m16133g(key, "key");
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(K key) {
        AbstractC9133u.m16133g(key, "key");
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(V r15) {
        /*
            r14 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r15, r0)
            java.lang.Object[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L52
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L47
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r10, r11)
            boolean r10 = kotlin.jvm.internal.AbstractC9133u.m16128b(r15, r10)
            if (r10 == 0) goto L47
            r15 = 1
            return r15
        L47:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4b:
            if (r7 != r8) goto L52
        L4d:
            if (r4 == r2) goto L52
            int r4 = r4 + 1
            goto L10
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return getSize();
    }

    public final void dropDeletes$collection() {
        int i10;
        Object[] objArr;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i11 = this._capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        AbstractC8797p.m14612B(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM14666A0 = AbstractC8801r.m14666A0(jArr);
        int i15 = iM14666A0 - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM14666A0] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr2[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i19 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                long j13 = j10;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i19);
                int i20 = i19 & i11;
                if (((iFindFirstAvailableSlot - i20) & i11) / 8 == ((i16 - i20) & i11) / 8) {
                    int i21 = i12;
                    int i22 = i16;
                    jArr[i17] = ((r12 & 127) << i18) | ((~(255 << i18)) & jArr[i17]);
                    if (jArr3[i22] == j13) {
                        long j14 = i22;
                        jArr3[i22] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i21];
                    i16 = i22 + 1;
                    j10 = j13;
                    i12 = i21;
                } else {
                    int i23 = i12;
                    int i24 = iFindFirstAvailableSlot >> 3;
                    long j15 = jArr[i24];
                    int i25 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i25) & 255) == 128) {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i24] = (j15 & (~(255 << i25))) | ((r12 & 127) << i25);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | iFindFirstAvailableSlot;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i16] = (Integer.MAX_VALUE << 32) | iFindFirstAvailableSlot;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i16 << 32) | Integer.MAX_VALUE;
                    } else {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i24] = ((r12 & 127) << i25) | (j15 & (~(255 << i25)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
                        Object obj3 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = obj3;
                        long j16 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iFindFirstAvailableSlot;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iFindFirstAvailableSlot;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i27 << 32) | i16;
                        i16--;
                    }
                    jArr[jArr.length - 1] = jArr[i23];
                    i16++;
                    i11 = i10;
                    j10 = j13;
                    i12 = i23;
                    objArr2 = objArr;
                }
            } else {
                i16++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) obj;
        if (sieveCache.getSize() != getSize() || sieveCache._count != this._count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = objArr[i13];
                        z11 = z12;
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj3 = objArr2[i13];
                        AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!AbstractC9133u.m16128b(obj3, sieveCache.get(obj2))) {
                            return false;
                        }
                    } else {
                        z11 = z12;
                    }
                    j10 >>= 8;
                    i12++;
                    z12 = z11;
                }
                z10 = z12;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void forEach(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                        Object obj = objArr[i13];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj, obj2);
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

    public final void forEachIndexed(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
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
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
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

    public final void forEachKey(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.keys;
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
                        Object obj = objArr[(i10 << 3) + i12];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        block.invoke(obj);
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

    public final void forEachValue(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.values;
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
                        Object obj = objArr[(i10 << 3) + i12];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj);
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

    public final V get(K key) {
        AbstractC9133u.m16133g(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            long[] jArr = this.nodes;
            jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
            return (V) this.values[iFindKeyIndex];
        }
        V v10 = (V) this.createValueFromKey.invoke(key);
        if (v10 == null) {
            return null;
        }
        put(key, v10);
        return v10;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getCount() {
        return this._count;
    }

    public final int getMaxSize() {
        return this._maxSize;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this._count == 0;
    }

    public final boolean isNotEmpty() {
        return this._count != 0;
    }

    public final void minusAssign(K key) {
        AbstractC9133u.m16133g(key, "key");
        remove(key);
    }

    public final boolean none() {
        return this._count == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(Pair<? extends K, ? extends V> pair) {
        AbstractC9133u.m16133g(pair, "pair");
        put(pair.m15906e(), pair.m15907g());
    }

    public final V put(K key, V value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v10 = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = value;
        this.keys[iFindInsertIndex] = key;
        int iIntValue = this._size + ((Number) this.sizeOf.invoke(key, value)).intValue();
        this._size = iIntValue;
        if (v10 != null) {
            this._size = iIntValue - ((Number) this.sizeOf.invoke(key, v10)).intValue();
            this.onEntryRemoved.invoke(key, v10, value, Boolean.FALSE);
            trimToSize(this._maxSize);
            return v10;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[iFindInsertIndex] = (i10 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask) | ((SieveCacheKt.NodeLinkMask & iFindInsertIndex) << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindInsertIndex;
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Pair<? extends K, ? extends V>[] pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.m15903a(), pair.m15904b());
        }
    }

    public final V remove(K key) {
        V vRemoveValueAt;
        AbstractC9133u.m16133g(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this._size -= ((Number) this.sizeOf.invoke(key, vRemoveValueAt)).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return vRemoveValueAt;
    }

    public final void removeIf(InterfaceC10574p predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
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
                        Object obj = this.keys[i13];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = this.values[i13];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            V vRemoveValueAt = removeValueAt(i13);
                            if (vRemoveValueAt == null) {
                                return;
                            }
                            this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                            this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.FALSE);
                        } else {
                            continue;
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

    public final void resize(@IntRange(from = 1, m244to = 2147483646) int i10) {
        this._maxSize = i10;
        trimToSize(i10);
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i11 = this._capacity;
        int[] iArr = new int[i11];
        initializeStorage(i10);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i12 = this._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i14 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j10 = i14 & 127;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                long j11 = (jArr4[i15] & (~(255 << i16))) | (j10 << i16);
                jArr4[i15] = j11;
                jArr4[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr4[iFindFirstAvailableSlot] = obj;
                objArr5[iFindFirstAvailableSlot] = objArr3[i13];
                jArr5[iFindFirstAvailableSlot] = jArr3[i13];
                iArr[i13] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i13++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final void set(K key, V value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        put(key, value);
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this._size + ", capacity=" + this._capacity + ", count=" + this._count + ']';
    }

    public final void trimToSize(int i10) {
        int iFindEvictionCandidate;
        while (this._size > i10 && getCount() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(p300x7.InterfaceC10574p r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r1, r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L65
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
            if (r10 == 0) goto L60
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type K of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r14, r15)
            r13 = r3[r13]
            java.lang.String r15 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r13, r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L5a
            r1 = 1
            return r1
        L5a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5e:
            if (r10 != r11) goto L65
        L60:
            if (r7 == r5) goto L65
            int r7 = r7 + 1
            goto L16
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.any(x7.p):boolean");
    }

    public final int count(InterfaceC10574p predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i14];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final void minusAssign(K[] keys) {
        AbstractC9133u.m16133g(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.m15903a(), pair.m15904b());
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        AbstractC9133u.m16133g(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(InterfaceC8469g pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(InterfaceC8469g pairs) {
        AbstractC9133u.m16133g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            put(pair.m15903a(), pair.m15904b());
        }
    }

    public final boolean remove(K key, V value) {
        V vRemoveValueAt;
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || !AbstractC9133u.m16128b(this.values[iFindKeyIndex], value) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this._size -= ((Number) this.sizeOf.invoke(key, vRemoveValueAt)).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC8469g keys) {
        AbstractC9133u.m16133g(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        AbstractC9133u.m16133g(from, "from");
        putAll(from);
    }

    public final void plusAssign(ScatterMap<K, V> from) {
        AbstractC9133u.m16133g(from, "from");
        putAll(from);
    }

    public final void putAll(Map<K, ? extends V> from) {
        AbstractC9133u.m16133g(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        AbstractC9133u.m16133g(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i10 << 3) + i12]);
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

    public final void plusAssign(SieveCache<K, V> from) {
        AbstractC9133u.m16133g(from, "from");
        putAll(from);
    }

    private final void fixupNodes(int[] iArr) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (j10 & SieveCacheKt.NodeLinkMask);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i12])) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = iArr[i13];
            }
            jArr[i10] = j11 | i11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = iArr[i14];
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = iArr[i15];
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = iArr[i16];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        AbstractC9133u.m16133g(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
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
                        put(objArr[i13], objArr2[i13]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        AbstractC9133u.m16133g(keys, "keys");
        Object[] objArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    public /* synthetic */ SieveCache(int i10, int i11, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r, int i12, AbstractC9126n abstractC9126n) {
        this(i10, (i12 & 2) != 0 ? 6 : i11, (i12 & 4) != 0 ? new InterfaceC10574p() { // from class: androidx.collection.SieveCache.1
            @Override // p300x7.InterfaceC10574p
            public final Integer invoke(K k10, V v10) {
                AbstractC9133u.m16133g(k10, "<anonymous parameter 0>");
                AbstractC9133u.m16133g(v10, "<anonymous parameter 1>");
                return 1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((C09801) obj, obj2);
            }
        } : interfaceC10574p, (i12 & 8) != 0 ? new InterfaceC10570l() { // from class: androidx.collection.SieveCache.2
            @Override // p300x7.InterfaceC10570l
            public final Void invoke(K it) {
                AbstractC9133u.m16133g(it, "it");
                return null;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C09812) obj);
            }
        } : interfaceC10570l, (i12 & 16) != 0 ? new InterfaceC10576r() { // from class: androidx.collection.SieveCache.3
            public final void invoke(K k10, V v10, V v11, boolean z10) {
                AbstractC9133u.m16133g(k10, "<anonymous parameter 0>");
                AbstractC9133u.m16133g(v10, "<anonymous parameter 1>");
            }

            @Override // p300x7.InterfaceC10576r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C09823) obj, obj2, obj3, ((Boolean) obj4).booleanValue());
                return C8736p.f16368a;
            }
        } : interfaceC10576r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(SieveCache<K, V> from) {
        AbstractC9133u.m16133g(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
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
                        Object obj = objArr[i13];
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        put(obj, obj2);
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
