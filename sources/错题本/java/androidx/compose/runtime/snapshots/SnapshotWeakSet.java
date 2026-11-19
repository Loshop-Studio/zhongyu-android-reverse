package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", ExifInterface.GPS_DIRECTION_TRUE, "<init>", "()V", "value", "", "hash", "find", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "findExactIndex", "(ILjava/lang/Object;I)I", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "Ld6/s;", "removeIf", "(Lr6/c;)V", "isValid$runtime_release", "()Z", "isValid", "size", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "", "hashes", "[I", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "", "Landroidx/compose/runtime/internal/WeakReference;", "values", "[Landroidx/compose/runtime/internal/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/internal/WeakReference;)V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotWeakSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n*L\n1#1,243:1\n27#2,2:244\n27#2,2:246\n27#2,2:248\n*S KotlinDebug\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n*L\n74#1:244,2\n80#1:246,2\n96#1:248,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;

    @NotNull
    private int[] hashes = new int[16];

    @NotNull
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T value, int hash) {
        int i = this.size - 1;
        int i8 = 0;
        while (i8 <= i) {
            int i9 = (i8 + i) >>> 1;
            int i10 = this.hashes[i9];
            if (i10 < hash) {
                i8 = i9 + 1;
            } else {
                if (i10 <= hash) {
                    WeakReference<T> weakReference = this.values[i9];
                    return value == (weakReference != null ? weakReference.get() : null) ? i9 : findExactIndex(i9, value, hash);
                }
                i = i9 - 1;
            }
        }
        return -(i8 + 1);
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

    public final boolean add(@NotNull T value) {
        int iFind;
        int i = this.size;
        int iIdentityHashCode = Utils_jvmKt.identityHashCode(value);
        if (i > 0) {
            iFind = find(value, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i8 = -(iFind + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i == length) {
            int i9 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i9];
            int[] iArr = new int[i9];
            int i10 = i8 + 1;
            System.arraycopy(weakReferenceArr, i8, weakReferenceArr2, i10, i - i8);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i8);
            AbstractC5802q.m5212y(i10, i8, this.hashes, iArr, i);
            AbstractC5802q.m5179F(0, i8, this.hashes, iArr, 6);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i11 = i8 + 1;
            System.arraycopy(weakReferenceArr, i8, weakReferenceArr, i11, i - i8);
            int[] iArr2 = this.hashes;
            AbstractC5802q.m5212y(i11, i8, iArr2, iArr2, i);
        }
        this.values[i8] = new WeakReference<>(value);
        this.hashes[i8] = iIdentityHashCode;
        this.size++;
        return true;
    }

    @NotNull
    /* renamed from: getHashes$runtime_release, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    @TestOnly
    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i > length) {
            return false;
        }
        int i8 = Integer.MIN_VALUE;
        int i9 = 0;
        while (i9 < i) {
            int i10 = iArr[i9];
            if (i10 < i8 || (weakReference = weakReferenceArr[i9]) == null) {
                return false;
            }
            T t8 = weakReference.get();
            if (t8 != null && i10 != Utils_jvmKt.identityHashCode(t8)) {
                return false;
            }
            i9++;
            i8 = i10;
        }
        while (i < length) {
            if (iArr[i] != 0 || weakReferenceArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void removeIf(@NotNull InterfaceC6471c block) {
        int size = getSize();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i];
            T t8 = weakReference != null ? weakReference.get() : null;
            if (t8 != null && !((Boolean) block.invoke(t8)).booleanValue()) {
                if (i8 != i) {
                    getValues$runtime_release()[i8] = weakReference;
                    getHashes()[i8] = getHashes()[i];
                }
                i8++;
            }
            i++;
        }
        for (int i9 = i8; i9 < size; i9++) {
            getValues$runtime_release()[i9] = null;
            getHashes()[i9] = 0;
        }
        if (i8 != size) {
            setSize$runtime_release(i8);
        }
    }

    public final void setHashes$runtime_release(@NotNull int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i) {
        this.size = i;
    }

    public final void setValues$runtime_release(@NotNull WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
