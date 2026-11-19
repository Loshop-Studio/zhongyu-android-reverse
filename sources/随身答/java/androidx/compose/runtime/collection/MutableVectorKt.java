package androidx.compose.runtime.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\n\"\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a \u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¨\u0006\u0017"}, m13413d2 = {"MutableVector", "Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "capacity", "", "size", "init", "Lkotlin/Function1;", "mutableVectorOf", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "throwListIndexOutOfBoundsException", "", "index", "throwNegativeIndexException", "fromIndex", "throwOutOfRangeException", "toIndex", "throwReversedIndicesException", "checkIndex", "", "checkSubIndex", "runtime_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1110:1\n1083#1,2:1111\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1101#1:1111,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i9) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[i9], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[i9], 0);
    }

    public static final void checkIndex(List<?> list, int i9) {
        int size = list.size();
        if (i9 < 0 || i9 >= size) {
            throwListIndexOutOfBoundsException(i9, size);
        }
    }

    public static final void checkSubIndex(List<?> list, int i9, int i10) {
        if (i9 > i10) {
            throwReversedIndicesException(i9, i10);
        }
        if (i9 < 0) {
            throwNegativeIndexException(i9);
        }
        if (i10 > list.size()) {
            throwOutOfRangeException(i10, list.size());
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    private static final void throwListIndexOutOfBoundsException(int i9, int i10) {
        throw new IndexOutOfBoundsException("Index " + i9 + " is out of bounds. The list has " + i10 + " elements.");
    }

    private static final void throwNegativeIndexException(int i9) {
        throw new IndexOutOfBoundsException("fromIndex (" + i9 + ") is less than 0.");
    }

    private static final void throwOutOfRangeException(int i9, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void throwReversedIndicesException(int i9, int i10) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i9 + ") is greater than toIndex (" + i10 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i9, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.reifiedOperationMarker(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = function1.invoke(Integer.valueOf(i10));
        }
        return new MutableVector<>(objArr, i9);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
