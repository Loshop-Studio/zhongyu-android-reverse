package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import p134i7.AbstractC8797p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t10, int i10) {
        int i11 = this.size - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.hashes[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    WeakReference<T> weakReference = this.values[i13];
                    return t10 == (weakReference != null ? weakReference.get() : null) ? i13 : findExactIndex(i13, t10, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.hashes[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.values[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.size;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.internal.WeakReference<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(T t10) {
        int iFind;
        int i10 = this.size;
        int iIdentityHashCode = Utils_jvmKt.identityHashCode(t10);
        if (i10 > 0) {
            iFind = find(t10, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i11 = -(iFind + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(weakReferenceArr, i11, weakReferenceArr2, i13, i10 - i11);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i11);
            AbstractC8797p.m14647n(this.hashes, iArr, i13, i11, i10);
            AbstractC8797p.m14653t(this.hashes, iArr, 0, 0, i11, 6, null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(weakReferenceArr, i11, weakReferenceArr, i14, i10 - i11);
            int[] iArr2 = this.hashes;
            AbstractC8797p.m14647n(iArr2, iArr2, i14, i11, i10);
        }
        this.values[i11] = new WeakReference<>(t10);
        this.hashes[i11] = iIdentityHashCode;
        this.size++;
        return true;
    }

    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i10 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i10 > length) {
            return false;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            if (i13 < i11 || (weakReference = weakReferenceArr[i12]) == null) {
                return false;
            }
            T t10 = weakReference.get();
            if (t10 != null && i13 != Utils_jvmKt.identityHashCode(t10)) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        while (i10 < length) {
            if (iArr[i10] != 0 || weakReferenceArr[i10] != null) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void removeIf(InterfaceC10570l interfaceC10570l) {
        int size$runtime_release = getSize$runtime_release();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i10];
            T t10 = weakReference != null ? weakReference.get() : null;
            if (t10 != null && !((Boolean) interfaceC10570l.invoke(t10)).booleanValue()) {
                if (i11 != i10) {
                    getValues$runtime_release()[i11] = weakReference;
                    getHashes$runtime_release()[i11] = getHashes$runtime_release()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime_release; i12++) {
            getValues$runtime_release()[i12] = null;
            getHashes$runtime_release()[i12] = 0;
        }
        if (i11 != size$runtime_release) {
            setSize$runtime_release(i11);
        }
    }

    public final void setHashes$runtime_release(int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i10) {
        this.size = i10;
    }

    public final void setValues$runtime_release(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
