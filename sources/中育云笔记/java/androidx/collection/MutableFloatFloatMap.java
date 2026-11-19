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
public final class MutableFloatFloatMap extends FloatFloatMap {
    private int growthLimit;

    public MutableFloatFloatMap() {
        this(0, 1, null);
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

    private final int findInsertIndex(float f10) {
        int iHashCode = Float.hashCode(f10) * ScatterMapKt.MurmurHashC1;
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
                if (this.keys[iNumberOfTrailingZeros] == f10) {
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
        this.keys = new float[iMax];
        this.values = new float[iMax];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        int i11 = (i10 + 7) >> 3;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM24116z0 = AbstractC10968r.m24116z0(jArr);
        int i13 = iM24116z0 - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM24116z0] = jArr[0];
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
                boolean z11 = z10;
                if (((iFindFirstAvailableSlot - i18) & i10) / 8 == ((i14 - i18) & i10) / 8) {
                    jArr[i15] = ((r8 & 127) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[AbstractC10968r.m24116z0(jArr)] = (jArr[z11 ? 1 : 0] & j12) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
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
                    jArr[AbstractC10968r.m24116z0(jArr)] = (jArr[z11 ? 1 : 0] & j10) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        initializeGrowth();
    }

    public final float getOrPut(float f10, InterfaceC9529a defaultValue) {
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f10);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = ((Number) defaultValue.invoke()).floatValue();
        put(f10, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(float f10) {
        remove(f10);
    }

    public final void plusAssign(FloatFloatMap from) {
        AbstractC9979u.m20294g(from, "from");
        putAll(from);
    }

    public final void put(float f10, float f11) {
        set(f10, f11);
    }

    public final void putAll(FloatFloatMap from) {
        AbstractC9979u.m20294g(from, "from");
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

    public final void remove(float f10) {
        int iFindKeyIndex = findKeyIndex(f10);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
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
                        if (((Boolean) predicate.invoke(Float.valueOf(this.keys[i13]), Float.valueOf(this.values[i13]))).booleanValue()) {
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

    public final void removeValueAt(int i10) {
        this._size--;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr;
        MutableFloatFloatMap mutableFloatFloatMap = this;
        long[] jArr2 = mutableFloatFloatMap.metadata;
        float[] fArr = mutableFloatFloatMap.keys;
        float[] fArr2 = mutableFloatFloatMap.values;
        int i11 = mutableFloatFloatMap._capacity;
        initializeStorage(i10);
        long[] jArr3 = mutableFloatFloatMap.metadata;
        float[] fArr3 = mutableFloatFloatMap.keys;
        float[] fArr4 = mutableFloatFloatMap.values;
        int i12 = mutableFloatFloatMap._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iHashCode = Float.hashCode(f10) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatFloatMap.findFirstAvailableSlot(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr3[iFindFirstAvailableSlot] = f10;
                fArr4[iFindFirstAvailableSlot] = fArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            mutableFloatFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float f10, float f11) {
        int iFindInsertIndex = findInsertIndex(f10);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f10;
        this.values[iFindInsertIndex] = f11;
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
        AbstractC9979u.m20294g(keys, "keys");
        for (float f10 : keys) {
            remove(f10);
        }
    }

    public final float put(float f10, float f11, float f12) {
        int iFindInsertIndex = findInsertIndex(f10);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f12 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = f10;
        this.values[iFindInsertIndex] = f11;
        return f12;
    }

    public final boolean remove(float f10, float f11) {
        int iFindKeyIndex = findKeyIndex(f10);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f11) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(FloatSet keys) {
        AbstractC9979u.m20294g(keys, "keys");
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

    public /* synthetic */ MutableFloatFloatMap(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(FloatList keys) {
        AbstractC9979u.m20294g(keys, "keys");
        float[] fArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(fArr[i11]);
        }
    }
}
