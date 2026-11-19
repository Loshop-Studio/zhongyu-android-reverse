package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10781l;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

/* loaded from: classes.dex */
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {
    private int growthLimit;

    public MutableIntObjectMap() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(int i10) {
        int iHashCode = Integer.hashCode(i10) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.keys[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i23 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i24 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i24];
                int i25 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this._capacity;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return iFindFirstAvailableSlot;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
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

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC10964p.m23990E(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        initializeGrowth();
    }

    private final void initializeStorage(int i10) {
        int iMax = i10 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i10)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new int[iMax];
        this.values = new Object[iMax];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(C10781l.m23023b(C10781l.m23023b(this._size) * 32) ^ Long.MIN_VALUE, C10781l.m23023b(C10781l.m23023b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            AbstractC10964p.m23990E(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC10964p.m23987B(this.values, null, 0, this._capacity);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM24116z0 = AbstractC10968r.m24116z0(jArr);
        int i14 = iM24116z0 - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM24116z0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Integer.hashCode(iArr[i15]) * ScatterMapKt.MurmurHashC1;
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iFindFirstAvailableSlot - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC10968r.m24116z0(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
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
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i20;
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        int i23 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i23;
                        Object obj = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = obj;
                        i15--;
                    }
                    jArr[AbstractC10968r.m24116z0(jArr)] = (jArr[i20] & j10) | Long.MIN_VALUE;
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

    public final V getOrPut(int i10, InterfaceC9529a defaultValue) {
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
        V v10 = get(i10);
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) defaultValue.invoke();
        set(i10, v11);
        return v11;
    }

    public final void minusAssign(int i10) {
        remove(i10);
    }

    public final void plusAssign(IntObjectMap<V> from) {
        AbstractC9979u.m20294g(from, "from");
        putAll(from);
    }

    public final V put(int i10, V v10) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(i10);
        Object[] objArr = this.values;
        V v11 = (V) objArr[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = i10;
        objArr[iFindAbsoluteInsertIndex] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(IntObjectMap<V> from) {
        AbstractC9979u.m20294g(from, "from");
        int[] iArr = from.keys;
        Object[] objArr = from.values;
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
                        set(iArr[i13], objArr[i13]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(int r14) {
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
            int[] r11 = r13.keys
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
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int):java.lang.Object");
    }

    public final void removeIf(InterfaceC9544p predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
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
                        if (((Boolean) predicate.invoke(Integer.valueOf(this.keys[i13]), this.values[i13])).booleanValue()) {
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

    public final V removeValueAt(int i10) {
        this._size--;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.values;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr;
        MutableIntObjectMap<V> mutableIntObjectMap = this;
        long[] jArr2 = mutableIntObjectMap.metadata;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        int i11 = mutableIntObjectMap._capacity;
        initializeStorage(i10);
        long[] jArr3 = mutableIntObjectMap.metadata;
        int[] iArr2 = mutableIntObjectMap.keys;
        Object[] objArr2 = mutableIntObjectMap.values;
        int i12 = mutableIntObjectMap._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * ScatterMapKt.MurmurHashC1;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntObjectMap.findFirstAvailableSlot(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iFindFirstAvailableSlot >> 3;
                int i17 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[iFindFirstAvailableSlot] = i14;
                objArr2[iFindFirstAvailableSlot] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            mutableIntObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(int i10, V v10) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(i10);
        this.keys[iFindAbsoluteInsertIndex] = i10;
        this.values[iFindAbsoluteInsertIndex] = v10;
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

    public /* synthetic */ MutableIntObjectMap(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(int[] keys) {
        AbstractC9979u.m20294g(keys, "keys");
        for (int i10 : keys) {
            remove(i10);
        }
    }

    public MutableIntObjectMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void minusAssign(IntSet keys) {
        AbstractC9979u.m20294g(keys, "keys");
        int[] iArr = keys.elements;
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
                        remove(iArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(int r19, V r20) {
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
            int[] r14 = r0.keys
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
            if (r6 == 0) goto L7d
            r10 = -1
        L6a:
            if (r10 < 0) goto L7c
            java.lang.Object[] r1 = r0.values
            r1 = r1[r10]
            r6 = r20
            boolean r1 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r6)
            if (r1 == 0) goto L7c
            r0.removeValueAt(r10)
            return r11
        L7c:
            return r4
        L7d:
            r6 = r20
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int, java.lang.Object):boolean");
    }

    public final void minusAssign(IntList keys) {
        AbstractC9979u.m20294g(keys, "keys");
        int[] iArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }
}
