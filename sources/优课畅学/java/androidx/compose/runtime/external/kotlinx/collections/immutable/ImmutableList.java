package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import p134i7.AbstractC8773d;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, InterfaceC10668a {

    public static final class SubList<E> extends AbstractC8773d implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i10, int i11) {
            this.source = immutableList;
            this.fromIndex = i10;
            this.toIndex = i11;
            ListImplementation.checkRangeIndexes$runtime_release(i10, i11, immutableList.size());
            this._size = i11 - i10;
        }

        @Override // p134i7.AbstractC8773d, java.util.List
        public E get(int i10) {
            ListImplementation.checkElementIndex$runtime_release(i10, this._size);
            return this.source.get(this.fromIndex + i10);
        }

        @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
        public int getSize() {
            return this._size;
        }

        @Override // p134i7.AbstractC8773d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList<E> subList(int i10, int i11) {
            ListImplementation.checkRangeIndexes$runtime_release(i10, i11, this._size);
            ImmutableList<E> immutableList = this.source;
            int i12 = this.fromIndex;
            return new SubList(immutableList, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default ImmutableList<E> subList(int i10, int i11) {
        return new SubList(this, i10, i11);
    }
}
