package androidx.paging;

import androidx.paging.ViewportHint;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.C10405j;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class TransformablePage<T> {
    public static final Companion Companion = new Companion(null);
    private final List<T> data;
    private final List<Integer> hintOriginalIndices;
    private final int hintOriginalPageOffset;
    private final int[] originalPageOffsets;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final <T> TransformablePage<T> empty() {
            return new TransformablePage<>(0, AbstractC10978w.m24136n());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformablePage(int[] originalPageOffsets, List<? extends T> data, int i10, List<Integer> list) {
        AbstractC9979u.m20294g(originalPageOffsets, "originalPageOffsets");
        AbstractC9979u.m20294g(data, "data");
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append("If originalIndices (size = ");
        AbstractC9979u.m20291d(list);
        sb2.append(list.size());
        sb2.append(") is provided, it must be same length as data (size = ");
        sb2.append(data.size());
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString().toString());
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
        AbstractC9979u.m20294g(originalPageOffsets, "originalPageOffsets");
        AbstractC9979u.m20294g(data, "data");
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
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && AbstractC9979u.m20289b(this.data, transformablePage.data) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset && AbstractC9979u.m20289b(this.hintOriginalIndices, transformablePage.hintOriginalIndices);
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
        C10405j c10405jM24137o;
        int i15 = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        if (list != null && (c10405jM24137o = AbstractC10978w.m24137o(list)) != null && c10405jM24137o.m21739g(i10)) {
            i10 = this.hintOriginalIndices.get(i10).intValue();
        }
        return new ViewportHint.Access(i15, i10, i11, i12, i13, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i10, List<? extends T> data) {
        this(new int[]{i10}, data, i10, null);
        AbstractC9979u.m20294g(data, "data");
    }
}
