package androidx.compose.runtime.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12634#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
/* loaded from: classes.dex */
public final class ThreadMap {
    public static final int $stable = 8;

    @NotNull
    private final long[] keys;
    private final int size;

    @NotNull
    private final Object[] values;

    public ThreadMap(int i, @NotNull long[] jArr, @NotNull Object[] objArr) {
        this.size = i;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long key) {
        int i = this.size - 1;
        if (i != -1) {
            int i8 = 0;
            if (i != 0) {
                while (i8 <= i) {
                    int i9 = (i8 + i) >>> 1;
                    long j7 = this.keys[i9] - key;
                    if (j7 < 0) {
                        i8 = i9 + 1;
                    } else {
                        if (j7 <= 0) {
                            return i9;
                        }
                        i = i9 - 1;
                    }
                }
                return -(i8 + 1);
            }
            long j8 = this.keys[0];
            if (j8 == key) {
                return 0;
            }
            if (j8 > key) {
                return -2;
            }
        }
        return -1;
    }

    @Nullable
    public final Object get(long key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    @NotNull
    public final ThreadMap newWith(long key, @Nullable Object value) {
        int i = this.size;
        int i8 = 0;
        int i9 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i9++;
            }
        }
        int i10 = i9 + 1;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        if (i10 > 1) {
            int i11 = 0;
            while (true) {
                if (i8 >= i10 || i11 >= i) {
                    break;
                }
                long j7 = this.keys[i11];
                Object obj2 = this.values[i11];
                if (j7 > key) {
                    jArr[i8] = key;
                    objArr[i8] = value;
                    i8++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i8] = j7;
                    objArr[i8] = obj2;
                    i8++;
                }
                i11++;
            }
            if (i11 == i) {
                jArr[i9] = key;
                objArr[i9] = value;
            } else {
                while (i8 < i10) {
                    long j8 = this.keys[i11];
                    Object obj3 = this.values[i11];
                    if (obj3 != null) {
                        jArr[i8] = j8;
                        objArr[i8] = obj3;
                        i8++;
                    }
                    i11++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new ThreadMap(i10, jArr, objArr);
    }

    public final boolean trySet(long key, @Nullable Object value) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = value;
        return true;
    }
}
