package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m7880d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12634#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i6, long[] jArr, Object[] objArr) {
        this.size = i6;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long key) {
        int i6 = this.size - 1;
        if (i6 != -1) {
            int i7 = 0;
            if (i6 != 0) {
                while (i7 <= i6) {
                    int i8 = (i7 + i6) >>> 1;
                    long j6 = this.keys[i8] - key;
                    if (j6 < 0) {
                        i7 = i8 + 1;
                    } else {
                        if (j6 <= 0) {
                            return i8;
                        }
                        i6 = i8 - 1;
                    }
                }
                return -(i7 + 1);
            }
            long j7 = this.keys[0];
            if (j7 == key) {
                return 0;
            }
            if (j7 > key) {
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
        int i6 = this.size;
        int i7 = 0;
        int i8 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i8++;
            }
        }
        int i9 = i8 + 1;
        long[] jArr = new long[i9];
        Object[] objArr = new Object[i9];
        if (i9 > 1) {
            int i10 = 0;
            while (true) {
                if (i7 >= i9 || i10 >= i6) {
                    break;
                }
                long j6 = this.keys[i10];
                Object obj2 = this.values[i10];
                if (j6 > key) {
                    jArr[i7] = key;
                    objArr[i7] = value;
                    i7++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i7] = j6;
                    objArr[i7] = obj2;
                    i7++;
                }
                i10++;
            }
            if (i10 == i6) {
                jArr[i8] = key;
                objArr[i8] = value;
            } else {
                while (i7 < i9) {
                    long j7 = this.keys[i10];
                    Object obj3 = this.values[i10];
                    if (obj3 != null) {
                        jArr[i7] = j7;
                        objArr[i7] = obj3;
                        i7++;
                    }
                    i10++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new ThreadMap(i9, jArr, objArr);
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
