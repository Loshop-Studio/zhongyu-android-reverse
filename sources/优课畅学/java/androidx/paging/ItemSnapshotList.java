package androidx.paging;

import androidx.annotation.IntRange;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8773d;

/* loaded from: classes3.dex */
public final class ItemSnapshotList<T> extends AbstractC8773d {
    private final List<T> items;
    private final int placeholdersAfter;
    private final int placeholdersBefore;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemSnapshotList(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11, List<? extends T> items) {
        AbstractC9133u.m16133g(items, "items");
        this.placeholdersBefore = i10;
        this.placeholdersAfter = i11;
        this.items = items;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public T get(int i10) {
        if (i10 >= 0 && i10 < this.placeholdersBefore) {
            return null;
        }
        int i11 = this.placeholdersBefore;
        if (i10 < this.items.size() + i11 && i11 <= i10) {
            return this.items.get(i10 - this.placeholdersBefore);
        }
        int size = this.placeholdersBefore + this.items.size();
        if (i10 < size() && size <= i10) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i10 + " in ItemSnapshotList of size " + size());
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.placeholdersBefore + this.items.size() + this.placeholdersAfter;
    }
}
