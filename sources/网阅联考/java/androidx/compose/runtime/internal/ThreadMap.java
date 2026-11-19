package androidx.compose.runtime.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n12904#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:112,3\n*E\n"})
/* loaded from: classes.dex */
public final class ThreadMap {
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i4, long[] keys, Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.size = i4;
        this.keys = keys;
        this.values = values;
    }

    private final int find(long key) {
        int i4 = this.size - 1;
        if (i4 == -1) {
            return -1;
        }
        int i5 = 0;
        if (i4 == 0) {
            long j4 = this.keys[0];
            if (j4 == key) {
                return 0;
            }
            return j4 > key ? -2 : -1;
        }
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j5 = this.keys[i6] - key;
            if (j5 < 0) {
                i5 = i6 + 1;
            } else {
                if (j5 <= 0) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public final Object get(long key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    public final ThreadMap newWith(long key, Object value) {
        int i4 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            if (objArr[i6] != null) {
                i7++;
            }
            i6++;
        }
        int i8 = i7 + 1;
        long[] jArr = new long[i8];
        Object[] objArr2 = new Object[i8];
        if (i8 > 1) {
            int i9 = 0;
            while (true) {
                if (i5 >= i8 || i9 >= i4) {
                    break;
                }
                long j4 = this.keys[i9];
                Object obj = this.values[i9];
                if (j4 > key) {
                    jArr[i5] = key;
                    objArr2[i5] = value;
                    i5++;
                    break;
                }
                if (obj != null) {
                    jArr[i5] = j4;
                    objArr2[i5] = obj;
                    i5++;
                }
                i9++;
            }
            if (i9 == i4) {
                int i10 = i8 - 1;
                jArr[i10] = key;
                objArr2[i10] = value;
            } else {
                while (i5 < i8) {
                    long j5 = this.keys[i9];
                    Object obj2 = this.values[i9];
                    if (obj2 != null) {
                        jArr[i5] = j5;
                        objArr2[i5] = obj2;
                        i5++;
                    }
                    i9++;
                }
            }
        } else {
            jArr[0] = key;
            objArr2[0] = value;
        }
        return new ThreadMap(i8, jArr, objArr2);
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
