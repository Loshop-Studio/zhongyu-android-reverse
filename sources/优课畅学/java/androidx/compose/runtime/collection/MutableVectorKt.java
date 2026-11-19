package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10) {
        AbstractC9133u.m16139m(0, "T?");
        return new MutableVector<>(new Object[i10], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        AbstractC9133u.m16139m(0, "T?");
        return new MutableVector(new Object[i10], 0);
    }

    public static final void checkIndex(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throwListIndexOutOfBoundsException(i10, size);
        }
    }

    public static final void checkSubIndex(List<?> list, int i10, int i11) {
        if (i10 > i11) {
            throwReversedIndicesException(i10, i11);
        }
        if (i10 < 0) {
            throwNegativeIndexException(i10);
        }
        if (i11 > list.size()) {
            throwOutOfRangeException(i11, list.size());
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    private static final void throwListIndexOutOfBoundsException(int i10, int i11) {
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + i11 + " elements.");
    }

    private static final void throwNegativeIndexException(int i10) {
        throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
    }

    private static final void throwOutOfRangeException(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    private static final void throwReversedIndicesException(int i10, int i11) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16139m(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = interfaceC10570l.invoke(Integer.valueOf(i11));
        }
        return new MutableVector<>(objArr, i10);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        AbstractC9133u.m16139m(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
