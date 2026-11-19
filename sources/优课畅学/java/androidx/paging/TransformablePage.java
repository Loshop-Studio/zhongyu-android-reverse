package androidx.paging;

import androidx.paging.ViewportHint;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class TransformablePage<T> {
    public static final Companion Companion = new Companion(null);
    private static final TransformablePage<Object> EMPTY_INITIAL_PAGE = new TransformablePage<>(0, AbstractC8809v.m14771n());
    private final List<T> data;
    private final List<Integer> hintOriginalIndices;
    private final int hintOriginalPageOffset;
    private final int[] originalPageOffsets;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final <T> TransformablePage<T> empty() {
            TransformablePage<T> transformablePage = (TransformablePage<T>) getEMPTY_INITIAL_PAGE();
            AbstractC9133u.m16131e(transformablePage, "null cannot be cast to non-null type androidx.paging.TransformablePage<T of androidx.paging.TransformablePage.Companion.empty>");
            return transformablePage;
        }

        public final TransformablePage<Object> getEMPTY_INITIAL_PAGE() {
            return TransformablePage.EMPTY_INITIAL_PAGE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformablePage(int[] originalPageOffsets, List<? extends T> data, int i10, List<Integer> list) {
        AbstractC9133u.m16133g(originalPageOffsets, "originalPageOffsets");
        AbstractC9133u.m16133g(data, "data");
        this.originalPageOffsets = originalPageOffsets;
        this.data = data;
        this.hintOriginalPageOffset = i10;
        this.hintOriginalIndices = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("If originalIndices (size = ");
        AbstractC9133u.m16130d(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransformablePage copy$default(TransformablePage transformablePage, int[] iArr, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iArr = transformablePage.originalPageOffsets;
        }
        if ((i11 & 2) != 0) {
            list = transformablePage.data;
        }
        if ((i11 & 4) != 0) {
            i10 = transformablePage.hintOriginalPageOffset;
        }
        if ((i11 & 8) != 0) {
            list2 = transformablePage.hintOriginalIndices;
        }
        return transformablePage.copy(iArr, list, i10, list2);
    }

    public final int[] component1() {
        return this.originalPageOffsets;
    }

    public final List<T> component2() {
        return this.data;
    }

    public final int component3() {
        return this.hintOriginalPageOffset;
    }

    public final List<Integer> component4() {
        return this.hintOriginalIndices;
    }

    public final TransformablePage<T> copy(int[] originalPageOffsets, List<? extends T> data, int i10, List<Integer> list) {
        AbstractC9133u.m16133g(originalPageOffsets, "originalPageOffsets");
        AbstractC9133u.m16133g(data, "data");
        return new TransformablePage<>(originalPageOffsets, data, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformablePage.class != obj.getClass()) {
            return false;
        }
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && AbstractC9133u.m16128b(this.data, transformablePage.data) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset && AbstractC9133u.m16128b(this.hintOriginalIndices, transformablePage.hintOriginalIndices);
    }

    public final List<T> getData() {
        return this.data;
    }

    public final List<Integer> getHintOriginalIndices() {
        return this.hintOriginalIndices;
    }

    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    public int hashCode() {
        int iHashCode = ((((Arrays.hashCode(this.originalPageOffsets) * 31) + this.data.hashCode()) * 31) + this.hintOriginalPageOffset) * 31;
        List<Integer> list = this.hintOriginalIndices;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.originalPageOffsets) + ", data=" + this.data + ", hintOriginalPageOffset=" + this.hintOriginalPageOffset + ", hintOriginalIndices=" + this.hintOriginalIndices + ')';
    }

    public final ViewportHint.Access viewportHintFor(int i10, int i11, int i12, int i13, int i14) {
        C8321f c8321fM14772o;
        int i15 = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        if (list != null && (c8321fM14772o = AbstractC8809v.m14772o(list)) != null && c8321fM14772o.m13502g(i10)) {
            i10 = this.hintOriginalIndices.get(i10).intValue();
        }
        return new ViewportHint.Access(i15, i10, i11, i12, i13, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i10, List<? extends T> data) {
        this(new int[]{i10}, data, i10, null);
        AbstractC9133u.m16133g(data, "data");
    }
}
