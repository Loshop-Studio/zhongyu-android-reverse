package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p296pd.InterfaceC10659g;
import p309qc.C10781l;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
                if (AbstractC9979u.m20289b(this.elements[iNumberOfTrailingZeros], e10)) {
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
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
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
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
    }

    public final boolean add(E e10) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e10)] = e10;
        return getSize() != size;
    }

    public final boolean addAll(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign((Object[]) elements);
        return size != getSize();
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(C10781l.m23023b(C10781l.m23023b(this._size) * 32) ^ Long.MIN_VALUE, C10781l.m23023b(C10781l.m23023b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final Set<E> asMutableSet() {
        return new MutableSetWrapper(this);
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
        AbstractC10964p.m23987B(this.elements, null, 0, this._capacity);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        Object[] objArr = this.elements;
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
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iFindFirstAvailableSlot - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r7 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC10968r.m24116z0(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iFindFirstAvailableSlot >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r7 & 127) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r7 & 127) << i22) | (j14 & (~(255 << i22)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = obj2;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e10) {
        this.elements[findAbsoluteInsertIndex(e10)] = e10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC9979u.m20289b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign((Object[]) elements);
        return size != getSize();
    }

    public final void removeElementAt(int i10) {
        this._size--;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.elements[i10] = null;
    }

    public final void removeIf(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        Object[] objArr = this.elements;
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
                        if (((Boolean) predicate.invoke(objArr[i13])).booleanValue()) {
                            removeElementAt(i13);
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

    public final void resizeStorage$collection(int i10) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i11 = this._capacity;
        initializeStorage(i10);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i12 = this._capacity;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iFindFirstAvailableSlot] = obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
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
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = p325rc.AbstractC10947g0.m23932e0(r14, r15)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0._size
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(java.util.Collection):boolean");
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

    public MutableScatterSet(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void plusAssign(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        for (E e10 : elements) {
            plusAssign((MutableScatterSet<E>) e10);
        }
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean removeAll(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public /* synthetic */ MutableScatterSet(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final boolean addAll(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign((Iterable) elements);
        return size != getSize();
    }

    public final void minusAssign(E[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        for (E e10 : elements) {
            minusAssign((MutableScatterSet<E>) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign((MutableScatterSet<E>) objArr[(i10 << 3) + i12]);
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(androidx.collection.ScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
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
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(androidx.collection.ScatterSet):boolean");
    }

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign((ScatterSet) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC10659g elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(OrderedScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign((OrderedScatterSet) elements);
        return size != getSize();
    }

    public final boolean removeAll(OrderedScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign((OrderedScatterSet) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign((MutableScatterSet<E>) objArr[(i10 << 3) + i12]);
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
    public final void plusAssign(OrderedScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i10 = elements.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign((MutableScatterSet<E>) objArr[i10]);
            i10 = i11;
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        plusAssign((ObjectList) elements);
        return size != getSize();
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int size = getSize();
        minusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(androidx.collection.OrderedScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
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
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(androidx.collection.OrderedScatterSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i10 = elements.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign((MutableScatterSet<E>) objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            plusAssign((MutableScatterSet<E>) objArr[i11]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(p181hd.InterfaceC9540l r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5a
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
            if (r10 == 0) goto L55
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L53
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L4f
            r0.removeElementAt(r13)
        L4f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L53:
            if (r10 != r11) goto L5a
        L55:
            if (r7 == r5) goto L5a
            int r7 = r7 + 1
            goto L16
        L5a:
            int r1 = r0._size
            if (r3 == r1) goto L60
            r1 = 1
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.retainAll(hd.l):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            minusAssign((MutableScatterSet<E>) objArr[i11]);
        }
    }
}
