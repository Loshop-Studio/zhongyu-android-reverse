package androidx.compose.p006ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000b\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "current", "", "indexes", "", "lastIndex", "vectors", "Landroidx/compose/runtime/collection/MutableVector;", "isNotEmpty", "", "pop", "()Ljava/lang/Object;", "push", "", "vector", "pushIndex", "value", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
/* loaded from: classes.dex */
public final class NestedVectorStack<T> {
    private int lastIndex;
    private int current = -1;
    private int[] indexes = new int[16];
    private final MutableVector<MutableVector<T>> vectors = new MutableVector<>(new MutableVector[16], 0);

    private final void pushIndex(int value) {
        int i4 = this.lastIndex;
        int[] iArr = this.indexes;
        if (i4 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.indexes = iArrCopyOf;
        }
        int[] iArr2 = this.indexes;
        int i5 = this.lastIndex;
        this.lastIndex = i5 + 1;
        iArr2[i5] = value;
    }

    public final boolean isNotEmpty() {
        int i4 = this.current;
        return i4 >= 0 && this.indexes[i4] >= 0;
    }

    public final T pop() {
        int i4 = this.current;
        int i5 = this.indexes[i4];
        MutableVector<T> mutableVector = this.vectors.getContent()[i4];
        if (i5 > 0) {
            this.indexes[i4] = r3[i4] - 1;
        } else if (i5 == 0) {
            this.vectors.removeAt(i4);
            this.current--;
        }
        return mutableVector.getContent()[i5];
    }

    public final void push(MutableVector<T> vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        if (vector.isNotEmpty()) {
            this.vectors.add(vector);
            pushIndex(vector.getSize() - 1);
            this.current++;
        }
    }
}
