package androidx.compose.runtime.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m13413d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12634#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i9, long[] jArr, Object[] objArr) {
        this.size = i9;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long key) {
        int i9 = this.size - 1;
        if (i9 != -1) {
            int i10 = 0;
            if (i9 != 0) {
                while (i10 <= i9) {
                    int i11 = (i10 + i9) >>> 1;
                    long j9 = this.keys[i11] - key;
                    if (j9 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j9 <= 0) {
                            return i11;
                        }
                        i9 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j10 = this.keys[0];
            if (j10 == key) {
                return 0;
            }
            if (j10 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final Object get(long key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    public final ThreadMap newWith(long key, Object value) {
        int i9 = this.size;
        int i10 = 0;
        int i11 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr = new long[i12];
        Object[] objArr = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                if (i10 >= i12 || i13 >= i9) {
                    break;
                }
                long j9 = this.keys[i13];
                Object obj2 = this.values[i13];
                if (j9 > key) {
                    jArr[i10] = key;
                    objArr[i10] = value;
                    i10++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i10] = j9;
                    objArr[i10] = obj2;
                    i10++;
                }
                i13++;
            }
            if (i13 == i9) {
                jArr[i11] = key;
                objArr[i11] = value;
            } else {
                while (i10 < i12) {
                    long j10 = this.keys[i13];
                    Object obj3 = this.values[i13];
                    if (obj3 != null) {
                        jArr[i10] = j10;
                        objArr[i10] = obj3;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new ThreadMap(i12, jArr, objArr);
    }

    public final boolean trySet(long key, Object value) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = value;
        return true;
    }
}
